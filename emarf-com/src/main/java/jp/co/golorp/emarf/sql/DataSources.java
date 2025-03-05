/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package jp.co.golorp.emarf.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.generator.BeanGenerator;
import jp.co.golorp.emarf.generator.ColumnInfo;
import jp.co.golorp.emarf.generator.TableInfo;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.MapList;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * データソース管理クラス
 *
 * @author golorp
 */
public final class DataSources {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(DataSources.class);

    /** DataSources.properties */
    private static final ResourceBundle BUNDLE = ResourceBundles.getBundle(DataSources.class);

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** 評価対象としないテーブル名の正規表現 */
    private static String ignoreRe;

    /** 兄弟判定で、長兄とするテーブル名の正規表現 */
    private static String eldestRe;

    /** 繰上りの弟モデルのテーブル名 */
    private static String bastardRe;

    /** 弟を設定しないテーブル名 */
    private static String youngestRe;

    /** 子を設定しないテーブル名 */
    private static String dinksRe;

    /** 親を設定しないテーブル名 */
    private static String orphansRe;

    /** 列評価をスキップする列名 */
    private static String columnIgnoreRe;

    /** 変更理由 */
    private static String reason;

    /** VIEWで変換先を指定する列名 */
    private static String viewDetailColumn;

    /** 数値列で自動採番しないサフィックス */
    private static String noNumberingIntRe;

    /** 固定長列で自動採番のサフィックス */
    private static String numberingCharRe;

    /** DataSourceのJNDI名 */
    private static final String JNDI_NAME = "JNDIName";

    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;

    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;

    /** 日付入力サフィックス */
    private static String[] inputDateSuffixs;

    /** 時刻入力サフィックス */
    private static String[] inputTimeSuffixs;
    /** 適用日 */
    private static String tekiyoBi;

    /**
     * データベース名列挙子
     * @author golorp
     */
    private enum DatabaseNames {

        /** mysql. */
        mysql,

        /** oracle. */
        oracle,

        /** tibero. */
        tibero,

        /** sqlite. */
        sqlite,

        /** postgresql. */
        postgresql
    }

    /** データベース毎の処理を受け持つクラス. */
    private static DataSourcesAssist assist = null;

    /** シングルトンインスタンス */
    private static DataSource ds = null;

    /** プライベートコンストラクタ */
    private DataSources() {
    }

    /**
     * @return DataSource
     */
    public static DataSource get() {

        // インスタンス生成済みならそれを返却
        if (ds != null) {
            return ds;
        }

        // JNDIから取得してみる
        String jndiName = BUNDLE.getString(JNDI_NAME);
        try {
            setAssist(jndiName);
            Context context = new InitialContext();
            ds = (DataSource) context.lookup(jndiName);
            return ds;
        } catch (NamingException e) {
            LOG.trace(e.getMessage());
        }

        // DBCPから取得してみる
        Properties properties = new Properties();
        Enumeration<String> keys = BUNDLE.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = BUNDLE.getString(key);
            properties.put(key, value);
            setAssist(value);
        }

        try {
            ds = BasicDataSourceFactory.createDataSource(properties);
            return ds;
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * @param s データソース名を探す対象の文字列
     */
    private static void setAssist(final String s) {

        if (assist == null) {

            for (DatabaseNames databaseName : DatabaseNames.values()) {

                if (s.contains(databaseName.name())) {

                    if (databaseName == DatabaseNames.mysql) {

                        assist = new DataSourcesAssistMySQL();

                    } else if (databaseName == DatabaseNames.oracle) {

                        assist = new DataSourcesAssistOracle();

                        // oracle.sql.TIMESTAMPをoracle.sql.TIMESTAMPで扱えるようにする
                        System.setProperty("oracle.jdbc.J2EE13Compliant", "true");

                    } else if (databaseName == DatabaseNames.tibero) {

                        assist = new DataSourcesAssistTibero();

                    } else if (databaseName == DatabaseNames.postgresql) {

                        assist = new DataSourcesAssistPostgreSQL();

                    } else if (databaseName == DatabaseNames.sqlite) {

                        assist = new DataSourcesAssistSQLite();

                    }

                    break;
                }
            }
        }
    }

    /**
     * @return DataSourcesAssist
     */
    public static DataSourcesAssist getAssist() {
        if (ds == null) {
            get();
        }
        return assist;
    }

    /**
     * プロパティファイルロード
     */
    private static void loadBundle() {

        ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);
        String[] pairs = bundle.getString("relation.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }
        ignoreRe = bundle.getString("relation.ignore.re");
        eldestRe = bundle.getString("relation.eldest.re");
        bastardRe = bundle.getString("relation.bastard.re");
        youngestRe = bundle.getString("relation.youngest.re");
        dinksRe = bundle.getString("relation.dinks.re");
        orphansRe = bundle.getString("relation.orphans.re");
        columnIgnoreRe = bundle.getString("column.ignore.re");
        reason = bundle.getString("column.history.reason");
        viewDetailColumn = bundle.getString("view.detail");
        noNumberingIntRe = bundle.getString("column.int.nonumbering.re");
        numberingCharRe = bundle.getString("column.char.numbering.re");
        inputTimestampSuffixs = bundle.getString("input.timestamp.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("input.datetime.suffixs").split(",");
        inputDateSuffixs = bundle.getString("input.date.suffixs").split(",");
        inputTimeSuffixs = bundle.getString("input.time.suffixs").split(",");
        tekiyoBi = bundle.getString("column.start").toUpperCase();
    }

    /**
     * スキーマのメタ情報取得
     * @return List<TableInfo>
     */
    public static List<TableInfo> getTables() {

        // 設定ファイル読み込み
        loadBundle();

        // テーブル情報の取得
        List<TableInfo> tables = new ArrayList<TableInfo>();
        try {
            // データベースからテーブル情報を取得してループ
            Connection cn = Connections.get();
            DatabaseMetaData metaData = cn.getMetaData();

            // テーブル情報を取得
            String schemaPattern = BUNDLE.getString("username");
            addTables(tables, metaData, schemaPattern);

            // テーブル毎に主キー情報を取得
            for (TableInfo table : tables) {
                addPrimaryKeys(metaData, table);
            }

            // テーブル毎にカラム情報を取得
            for (TableInfo table : tables) {

                // テーブルのカラム情報を取得してループ
                ResultSet columns = metaData.getColumns(null, schemaPattern.toUpperCase(), table.getName(), null);

                while (columns.next()) {

                    // カラム名が合致しなければスキップ
                    String columnName = columns.getString("COLUMN_NAME");
                    if (!columnName.matches("^[\\$\\-0-9A-Z\\_a-z]+$")) {
                        continue;
                    }
                    if (columnName.matches(columnIgnoreRe)) {
                        continue;
                    }

                    // 変換ビューならtrue
                    if (columnName.toUpperCase().equals(viewDetailColumn.toUpperCase())) {
                        table.setConvView(true);
                    }

                    // カラム情報を追加
                    ColumnInfo column = new ColumnInfo();
                    table.getColumnInfos().put(columnName, column);

                    // カラム物理名
                    column.setName(columnName);

                    // DBデータ型
                    column.setTypeName(columns.getString("TYPE_NAME"));

                    // カラムサイズ
                    column.setColumnSize(assist.getColumnSize(columns));
                    if (column.getColumnSize() == 0) {
                        column.setColumnSize(3);
                    }

                    // 桁制限
                    if (StringUtil.endsWith(inputDateSuffixs, columnName)) {
                        column.setMaxLength(10);
                    } else if (StringUtil.endsWith(inputTimeSuffixs, columnName)) {
                        column.setMaxLength(5);
                    } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnName)) {
                        column.setMaxLength(19);
                    } else if (StringUtil.endsWith(inputTimestampSuffixs, columnName)) {
                        column.setMaxLength(23);
                    }

                    // 小数桁数
                    column.setDecimalDigits(columns.getInt("DECIMAL_DIGITS"));

                    // NULL可否
                    column.setNullable(columns.getInt("NULLABLE"));

                    // カラム論理名
                    String remarks = columns.getString("REMARKS");
                    if (remarks == null || remarks.length() == 0) {
                        remarks = assist.getColumnComment(table.getName(), columnName);
                    }
                    if (remarks != null && remarks.contains(":")) {
                        int i = remarks.indexOf(":");
                        remarks = remarks.substring(0, i);
                    }
                    if (remarks == null || remarks.length() == 0) {
                        remarks = columnName;
                    }
                    column.setRemarks(remarks);

                    if (table.getPrimaryKeys().contains(columnName)) {
                        // 主キー
                        column.setPk(true);
                    } else {
                        // 変更理由でない場合
                        if (table.getUniqueIndexColumns().contains(columnName)) {
                            column.setUnique(true);
                        }
                        table.getNonPrimaryKeys().add(columnName);
                    }

                    // typeNameをjavaデータ型に変換
                    String dataType = getDataType(column);
                    column.setDataType(dataType);
                }

                columns.close();

                if (table.getPrimaryKeys().size() == 0 && table.isView()) {
                    ColumnInfo noCol = table.getColumnInfos().get("NO");
                    if (noCol != null) {
                        //viewの場合、「NO」列があれば主キーとする
                        table.getPrimaryKeys().add("NO");
                        noCol.setPk(true);
                        table.getNonPrimaryKeys().remove("NO");
                    }
                }
            }

        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
            throw new SysError(e);
        } finally {
            Connections.close();
        }

        //兄弟モデルの評価
        addBrotherTable(tables);
        //履歴モデルの評価
        addHistoryTable(tables);
        //子モデルの評価
        addChildTables(tables);
        //参照モデルの評価
        addReferTable(tables);
        //転生モデルの評価
        addRebornTable(tables);
        //集約モデルの評価
        addSummaryTable(tables);
        //組合せモデルの評価
        addCombo(tables);

        log(tables);

        return tables;
    }

    /**
     * @param tableInfos
     */
    private static void log(final List<TableInfo> tableInfos) {

        for (TableInfo table : tableInfos) {

            LOG.info("");
            LOG.info("■" + table.getName());

            if (table.getPrimaryKeys().size() > 0) {
                LOG.info("    PrimaryKeys: " + table.getPrimaryKeys());
            }

            if (table.getParentInfos().size() > 0) {
                LOG.info("    ParentInfos:");
                for (TableInfo parent : table.getParentInfos()) {
                    LOG.info("        " + parent.getName() + " " + parent.getPrimaryKeys());
                }
            }

            if (table.getBrosInfos().size() > 0) {
                LOG.info("    BrosInfos:");
                for (TableInfo bros : table.getBrosInfos()) {
                    LOG.info("        " + bros.getName() + " " + bros.getPrimaryKeys());
                }
            }

            if (table.getChildInfos().size() > 0) {
                LOG.info("    ChildInfos:");
                for (TableInfo child : table.getChildInfos()) {
                    LOG.info("        " + child.getName() + " " + child.getPrimaryKeys());
                }
            }

            if (table.getHistoryInfo() != null) {
                LOG.info("    HistoryInfo:");
                TableInfo history = table.getHistoryInfo();
                LOG.info("        " + history.getName() + " " + history.getPrimaryKeys());
            }

            Map<String, TableInfo> refers = new LinkedHashMap<String, TableInfo>();
            for (ColumnInfo column : table.getColumnInfos().values()) {
                if (column.getReferInfo() != null) {
                    refers.put(column.getName(), column.getReferInfo());
                }
            }
            if (refers.size() > 0) {
                LOG.info("    ReferInfos:");
                for (Entry<String, TableInfo> e : refers.entrySet()) {
                    String columnName = e.getKey();
                    TableInfo refer = e.getValue();
                    LOG.info("        " + columnName + " = " + refer.getName() + " " + refer.getPrimaryKeys());
                }
            }

            if (table.getDeriveInfos().size() > 1) {
                LOG.info("    DeriveInfos:");
                for (TableInfo derive : table.getDeriveInfos()) {
                    LOG.info("        " + derive.getName() + " " + derive.getPrimaryKeys());
                }
            }

            if (table.getRebornInfo() != null) {
                LOG.info("    RebornInfo:");
                TableInfo reborn = table.getRebornInfo();
                LOG.info("        " + reborn.getName() + " " + reborn.getPrimaryKeys());
            }

            if (table.getSummaryInfo() != null) {
                LOG.info("    SummaryInfo:");
                TableInfo summary = table.getSummaryInfo();
                LOG.info("        " + summary.getName() + " " + summary.getPrimaryKeys());
            }

            if (table.getComboInfos().size() > 1) {
                LOG.info("    ComboInfos:");
                for (TableInfo combo : table.getComboInfos()) {
                    LOG.info("        " + combo.getName() + " " + combo.getPrimaryKeys());
                }
            }

            if (table.getStintInfo() != null) {
                LOG.info("    StintInfo:");
                TableInfo stint = table.getStintInfo();
                LOG.info("        " + stint.getName() + " " + stint.getPrimaryKeys());
            }
        }

        LOG.info("");
    }

    /**
     * @param tables
     */
    private static void addCombo(final List<TableInfo> tables) {

        for (TableInfo table : tables) {

            //複合キー内の参照モデルを探索
            Set<String> done = new HashSet<String>();
            Set<TableInfo> combos = new LinkedHashSet<TableInfo>();
            for (String pk : table.getPrimaryKeys()) {
                ColumnInfo primaryKey = table.getColumnInfos().get(pk);
                if (primaryKey.getReferInfo() != null) {
                    String referName = primaryKey.getReferInfo().getName();
                    if (!done.contains(referName)) {
                        done.add(referName);
                        combos.add(primaryKey.getReferInfo());
                    }
                }
            }

            //複合キー内の参照モデルが２以上あれば組合せモデルに設定
            if (combos.size() > 1) {
                for (TableInfo combo : combos) {
                    table.getComboInfos().add(combo);
                }
            }

            //組合せモデル数が２の場合
            if (table.getComboInfos().size() == 2) {

                //自テーブルの主キーが各単一キーと適用日のみで、各テーブルの主キーが自テーブルの第二キー以降の場合は、各テーブルに制約モデルを設定
                boolean b = true;
                for (String pk : table.getPrimaryKeys()) {
                    if (pk.matches(tekiyoBi)) {
                        continue;
                    }
                    ColumnInfo primaryKey = table.getColumnInfos().get(pk);
                    TableInfo combo = primaryKey.getReferInfo();
                    if (combo != null && combo.getPrimaryKeys().size() == 1) {
                        continue;
                    }
                    b = false;
                    break;
                }
                if (!b) {
                    continue;
                }

                for (TableInfo combo : table.getComboInfos()) {
                    //組合せの第一キーなら制約設定なし
                    if (table.getPrimaryKeys().get(0).equals(combo.getPrimaryKeys().get(0))) {
                        continue;
                    }
                    //制約モデルが２以上あれば消し込み
                    if (combo.getStintInfo() != null) {
                        combo.setStintInfo(null);
                        break;
                    }
                    combo.setStintInfo(table);
                }
            }
        }
    }

    /**
     * テーブル情報に主キー名のリストを設定
     * @param metaData メタデータ
     * @param tableInfo テーブル情報
     * @throws SQLException
     */
    private static void addPrimaryKeys(final DatabaseMetaData metaData, final TableInfo tableInfo) throws SQLException {

        List<String> primaryKeys = new ArrayList<String>();

        // テーブルの主キー情報でループ
        String schemaPattern = BUNDLE.getString("username");
        try (ResultSet rs = metaData.getPrimaryKeys(null, schemaPattern.toUpperCase(), tableInfo.getName())) {
            while (rs.next()) {

                // 対象外のカラム名ならスキップ
                String columnName = rs.getString("COLUMN_NAME");

                if (!columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
                    continue;
                }

                if (columnName.matches(columnIgnoreRe)) {
                    continue;
                }

                // 主キー順でカラム名を退避
                short keySeq = rs.getShort("KEY_SEQ");
                while (primaryKeys.size() <= keySeq) {
                    primaryKeys.add("");
                }
                primaryKeys.set(keySeq, columnName);
            }
        }

        // 一部DBではKEY_SEQが「[1]origin」なので「[0]origin」に詰め替え
        for (String primaryKey : primaryKeys) {
            if (primaryKey.length() > 0) {
                tableInfo.getPrimaryKeys().add(primaryKey);
            }
        }

        MapList uniqueIndexColumns = assist.getUniqueIndexes(tableInfo.getName());
        if (uniqueIndexColumns != null) {

            for (Map<String, Object> uniqueIndexColumn : uniqueIndexColumns) {
                String columnName = null;
                if (uniqueIndexColumn.get("COLUMN_NAME") != null) {
                    columnName = uniqueIndexColumn.get("COLUMN_NAME").toString();
                } else if (uniqueIndexColumn.get("Column_name") != null) {
                    columnName = uniqueIndexColumn.get("Column_name").toString();
                }
                if (!tableInfo.getUniqueIndexColumns().contains(columnName)) {
                    tableInfo.getUniqueIndexColumns().add(columnName);
                }
            }

            if (tableInfo.getPrimaryKeys().size() == 0) {

                // 最初にとれたユニークインデクスを主キー扱いにする
                String indexName = null;
                String preIndexName = null;
                for (Map<String, Object> uniqueIndexColumn : uniqueIndexColumns) {
                    //                    LOG.info(uniqueIndexColumn.get("TABLE_NAME") + "\t" + uniqueIndexColumn.get("INDEX_NAME") + "\t"
                    //                            + uniqueIndexColumn.get("COLUMN_POSITION") + "\t" + uniqueIndexColumn.get("COLUMN_NAME"));
                    if (uniqueIndexColumn.get("INDEX_NAME") != null) {
                        indexName = uniqueIndexColumn.get("INDEX_NAME").toString();
                    } else if (uniqueIndexColumn.get("Key_name") != null) {
                        indexName = uniqueIndexColumn.get("Key_name").toString();
                    }
                    if (preIndexName == null) {
                        preIndexName = indexName;
                    }
                    if (!preIndexName.equals(indexName)) {
                        break;
                    }
                    String columnName = null;
                    if (uniqueIndexColumn.get("COLUMN_NAME") != null) {
                        columnName = uniqueIndexColumn.get("COLUMN_NAME").toString();
                    } else if (uniqueIndexColumn.get("Column_name") != null) {
                        columnName = uniqueIndexColumn.get("Column_name").toString();
                    }
                    tableInfo.getPrimaryKeys().add(columnName);
                }
            }
        }
    }

    /**
     * テーブル情報のリストに各テーブルを追加
     * @param tables テーブル情報のリスト
     * @param metaData メタデータ
     * @param schemaPattern スキーマ名
     * @throws SQLException
     */
    private static void addTables(final List<TableInfo> tables, final DatabaseMetaData metaData,
            final String schemaPattern) throws SQLException {

        Map<String, TableInfo> tree = new TreeMap<String, TableInfo>();

        ResultSet rs = metaData.getTables(null, schemaPattern.toUpperCase(), null, new String[] { "TABLE", "VIEW" });

        while (rs.next()) {

            String tableName = rs.getString("TABLE_NAME").toUpperCase();

            //半角文字でなければスキップ
            if (!tableName.matches("^[!-~]+$")) {
                continue;
            }

            //対象外のテーブル名ならスキップ
            if (!StringUtil.isNullOrBlank(ignoreRe) && tableName.matches(ignoreRe)) {
                continue;
            }

            // テーブル情報を追加
            TableInfo table = new TableInfo();

            // テーブル物理名
            table.setName(tableName);

            // テーブル論理名
            String remarks = rs.getString("REMARKS");
            if (remarks == null || remarks.length() == 0) {
                remarks = assist.getTableComment(tableName);
            }
            if (remarks == null || remarks.length() == 0) {
                remarks = tableName;
            }
            if (remarks.indexOf(":") > 0) {
                remarks = remarks.substring(0, remarks.indexOf(":"));
            }
            table.setRemarks(remarks);

            String tableType = rs.getString("TABLE_TYPE");
            table.setView(tableType.equals("VIEW"));

            tree.put(tableName, table);
        }

        rs.close();

        for (TableInfo table : tree.values()) {
            tables.add(table);
        }
    }

    /**
     * @param column 対象のカラム情報
     * @return javaデータ型に変換した文字列
     */
    private static String getDataType(final ColumnInfo column) {

        String typeName = column.getTypeName().toUpperCase();
        String dataType = typeName;

        if (typeName.equals("INT")
                || (typeName.equals("NUMBER") && column.getColumnSize() <= 10 && column.getDecimalDigits() == 0)) {

            dataType = "Integer";

            if (column.isPk()) {
                if (!column.getName().matches(noNumberingIntRe)) {
                    column.setNumbering(true);
                }
            }

        } else if (typeName.equals("DECIMAL") || typeName.equals("DOUBLE") || typeName.equals("NUMBER")
                || typeName.equals("NUMERIC")) {

            dataType = "java.math.BigDecimal";

            if (column.isPk() && column.getDecimalDigits() == 0) {
                if (!column.getName().matches(noNumberingIntRe)) {
                    column.setNumbering(true);
                }
            }

        } else if (StringUtil.endsWith(inputDateSuffixs, column.getName())) {

            dataType = "java.time.LocalDate";

        } else if (StringUtil.endsWith(inputTimeSuffixs, column.getName())) {

            dataType = "java.time.LocalTime";

        } else if (typeName.equals("DATE") || typeName.equals("TIME") || typeName.equals("DATETIME")
                || typeName.indexOf("TIMESTAMP") >= 0) {

            dataType = "java.time.LocalDateTime";

        } else {

            dataType = "String";

            if (typeName.equals("CHAR")) {
                if (column.isPk()) {
                    if (column.getName().matches(numberingCharRe)) {
                        column.setNumbering(true);
                    }
                }
            }
        }

        return dataType;
    }

    /**
     * 各テーブル情報に弟モデルを追加
     *
     * @param tableInfos テーブル情報のリスト
     */
    private static void addBrotherTable(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元は兄モデル）
        Iterator<TableInfo> elders = tableInfos.iterator();
        while (elders.hasNext()) {
            TableInfo elder = elders.next();

            // 比較元に主キーがなければスキップ
            if (elder.getPrimaryKeys().size() == 0) {
                continue;
            }

            // 弟を設定しないテーブルならスキップ
            if (elder.getName().matches(youngestRe)) {
                continue;
            }

            String elderPKs = elder.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");

            // テーブル情報でループ（比較先は弟モデル）
            Iterator<TableInfo> youngers = tableInfos.iterator();
            while (youngers.hasNext()) {
                TableInfo younger = youngers.next();

                // 比較元と同じならスキップ
                if (elder == younger) {
                    continue;
                }

                // 主キーが合致しなければスキップ
                String youngerPKs = younger.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                if (!elderPKs.equals(youngerPKs)) {
                    continue;
                }

                //                // 比較元が既に比較先の弟ならスキップ
                //                if (destInfo.getBrosInfos().contains(srcInfo)) {
                //                    continue;
                //                }

                // 比較元に弟を追加
                younger.setBrother(true);
                elder.getBrosInfos().add(younger);
            }
        }

        for (TableInfo elder : tableInfos) {

            // １．弟情報から長兄モデルを削除
            List<TableInfo> nonEldestInfos = new ArrayList<TableInfo>();
            for (TableInfo younger : elder.getBrosInfos()) {
                if (younger.getName().matches(eldestRe)) {
                    younger.setBrother(false);
                } else {
                    nonEldestInfos.add(younger);
                }
            }
            elder.setBrosInfos(nonEldestInfos);

            // ２．長兄モデルなら弟モデルの弟情報をクリア
            if (elder.getName().matches(eldestRe)) {
                elder.setBrother(false);
                for (TableInfo younger : elder.getBrosInfos()) {
                    younger.setBrosInfos(new ArrayList<TableInfo>());
                }
            }

            // ３．弟情報から隠し子モデルを削除
            List<TableInfo> youngers = new ArrayList<TableInfo>();
            for (TableInfo younger : elder.getBrosInfos()) {
                if (!younger.getName().matches(bastardRe)) {
                    youngers.add(younger);
                }
            }
            elder.setBrosInfos(youngers);
        }
    }

    /**
     * 各テーブル情報に履歴モデルを設定
     * @param tables テーブル情報のリスト
     */
    private static void addHistoryTable(final List<TableInfo> tables) {

        // 比較元でループ
        Iterator<TableInfo> srcs = tables.iterator();
        while (srcs.hasNext()) {
            TableInfo src = srcs.next();

            //主キーがなければスキップ
            if (src.getPrimaryKeys().size() == 0) {
                continue;
            }

            String srcPKCsv = src.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
            String srcColCsv = src.getNonPrimaryKeys().toString().replaceAll("[\\[\\]]", "");

            // 比較先でループ
            Iterator<TableInfo> dests = tables.iterator();
            while (dests.hasNext()) {
                TableInfo dest = dests.next();

                // 比較元と比較先が同じならスキップ
                if (src == dest) {
                    continue;
                }

                String destPKCsv = dest.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                List<String> nonPrimaryKeys = new ArrayList<String>(dest.getNonPrimaryKeys());
                if (!StringUtil.isNullOrBlank(reason) && nonPrimaryKeys.contains(reason)) {
                    nonPrimaryKeys.remove(reason);
                }
                String destColCsv = nonPrimaryKeys.toString().replaceAll("[\\[\\]]", "");

                // キーが合致するならスキップ
                if (srcPKCsv.equals(destPKCsv)) {
                    continue;
                }

                // キー以外が合致しなければスキップ
                if (!srcColCsv.equals(destColCsv)) {
                    continue;
                }

                // 比較先が比較元の主キーと同じ組み合わせでスタートしなければスキップ
                if (!destPKCsv.startsWith(srcPKCsv)) {
                    continue;
                }

                // 比較先が比較元の主キー＋１キーでなければスキップ
                if (destPKCsv.replaceAll(srcPKCsv + ", ", "").split(",").length != 1) {
                    continue;
                }

                // 比較先の最終キーが採番キーでないか文字列ならスキップ
                String destLastKey = dest.getPrimaryKeys().get(dest.getPrimaryKeys().size() - 1);
                ColumnInfo lastPKInfo = dest.getColumnInfos().get(destLastKey);
                if (!lastPKInfo.isNumbering() || lastPKInfo.getTypeName().equals("CHAR")) {
                    continue;
                }

                // 比較先が比較元に前方一致しないならスキップ
                if (!dest.getName().matches("(?i)^" + src.getName() + ".+$")) {
                    continue;
                }

                dest.setHistory(true);
                src.setHistoryInfo(dest);
            }
        }
    }

    /**
     * 各テーブル情報に子モデルを設定
     * @param tables テーブル情報のリスト
     */
    private static void addChildTables(final List<TableInfo> tables) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcs = tables.iterator();

        while (srcs.hasNext()) {

            TableInfo table = srcs.next();

            // 主キーがなければスキップ
            if (table.getPrimaryKeys().size() == 0) {
                continue;
            }

            // 子を設定しないテーブルならスキップ
            if (table.getName().matches(dinksRe)) {
                continue;
            }

            // 比較元の子テーブルリストを取得
            List<TableInfo> childs = table.getChildInfos();

            // テーブル情報でループ（比較先）
            Iterator<TableInfo> dests = tables.iterator();
            while (dests.hasNext()) {
                TableInfo child = dests.next();

                // 比較元と同じならスキップ
                if (table == child) {
                    continue;
                }

                // 比較元の履歴モデルと同じならスキップ
                if (table.getHistoryInfo() == child) {
                    continue;
                }

                // 親を設定しないテーブルならスキップ
                if (child.getName().matches(orphansRe)) {
                    continue;
                }

                if (child.getPrimaryKeys().size() == 0) {
                    continue;
                }

                boolean isPkMatch = true;
                for (int i = 0; i < table.getPrimaryKeys().size(); i++) {
                    if (child.getPrimaryKeys().size() <= i) {
                        isPkMatch = false;
                        break;
                    }
                    String src = table.getPrimaryKeys().get(i);
                    String dest = child.getPrimaryKeys().get(i);
                    //                    if (!dest.endsWith(src)) {
                    if (!dest.equals(src)) {
                        isPkMatch = false;
                        break;
                    }
                }
                if (!isPkMatch) {
                    continue;
                }

                // 比較先の主キーが「比較元の主キー＋一つ」の場合は子テーブルリストに追加
                if (table.getPrimaryKeys().size() + 1 == child.getPrimaryKeys().size()) {

                    // 履歴テーブルならスキップ
                    if (child.isHistory()) {
                        continue;
                    }

                    //比較元の子モデルに比較先を追加
                    childs.add(child);

                    //比較先の親モデルに比較元を追加
                    child.getParentInfos().add(table);
                }
            }
        }
    }

    /**
     * マスタテーブル（参照先）から、植え付け先（参照元）を探す
     * @param tables テーブル情報のリスト
     */
    private static void addReferTable(final List<TableInfo> tables) {

        // 参照先としてループ
        Iterator<TableInfo> sanshosakis = tables.iterator();
        while (sanshosakis.hasNext()) {
            TableInfo sanshosaki = sanshosakis.next();

            // 参照先が複合キーならスキップ
            if (sanshosaki.getPrimaryKeys().size() != 1) {
                continue;
            }

            // 参照先が他のテーブルの弟ならスキップ
            if (sanshosaki.isBrother()) {
                continue;
            }

            String pk = sanshosaki.getPrimaryKeys().get(0);

            // 参照先が参照キー・参照名のいずれにも合致しなければ次のテーブルを検証
            boolean isRefer = false;
            for (String[] referPair : referPairs) {
                String keySuffix = referPair[0];
                String meiSuffix = referPair[1];

                // 参照キーに合致しなければ次の参照キーを検証
                if (!StringUtil.endsWithIgnoreCase(keySuffix, pk)) {
                    continue;
                }

                // 参照名に合致するカラムがあれば終了
                String referMei = pk.replaceAll("(?i)" + keySuffix + "$", meiSuffix);
                for (String columnName : sanshosaki.getColumnInfos().keySet()) {
                    if (columnName.matches("(?i)^" + referMei + "$")) {
                        isRefer = true;
                        break;
                    }
                }
                if (isRefer) {
                    break;
                }
            }
            if (!isRefer) {
                continue;
            }

            // 参照先のユニークキー情報
            ColumnInfo primaryKey = sanshosaki.getColumnInfos().get(pk);

            // 参照元としてループ
            Iterator<TableInfo> sanshomotos = tables.iterator();
            while (sanshomotos.hasNext()) {
                TableInfo sanshomoto = sanshomotos.next();
                List<String> pks = sanshomoto.getPrimaryKeys();

                // 比較先のカラム情報でループして比較元のユニークキーがあれば参照テーブルリストに追加
                for (Entry<String, ColumnInfo> e : sanshomoto.getColumnInfos().entrySet()) {
                    String columnName = e.getKey();
                    ColumnInfo column = e.getValue();

                    // 参照テーブル自体の主キー自体ならスキップ
                    if (sanshomoto == sanshosaki && column == primaryKey) {
                        continue;
                    }

                    // データ型が異なるならスキップ
                    if (!column.getTypeName().equals(primaryKey.getTypeName())) {
                        continue;
                    }

                    // データサイズが異なるならスキップ
                    if (column.getColumnSize() != primaryKey.getColumnSize()) {
                        continue;
                    }

                    // 小数桁数が異なるならスキップ
                    if (column.getDecimalDigits() != primaryKey.getDecimalDigits()) {
                        continue;
                    }

                    // 比較先もユニークキーで、他テーブルの弟にしないテーブルならスキップ
                    if (column.isPk() && pks.size() == 1) {
                        if (sanshomoto.getName().matches(eldestRe)) {
                            continue;
                        }
                    }

                    // 参照元カラム名の末尾が参照先カラム名と合致し、参照モデルが未登録なら、カラムに参照モデルを設定
                    if (columnName.matches("(?i)^.*" + pk + "$") && column.getReferInfo() == null) {
                        column.setReferInfo(sanshosaki);

                        // 参照元の複合キーの最終キーなら、サブ画面で選択するため採番フラグをオフ
                        if (pks.size() > 1 && columnName.equals(pks.get(pks.size() - 1))) {
                            column.setNumbering(false);
                        }
                    }
                }
            }
        }
    }

    /**
     * ユニークキーテーブル（転生元）から、植え付け先（転生先）を探す
     * @param tables テーブル情報のリスト
     */
    private static void addRebornTable(final List<TableInfo> tables) {

        // 転生元として、テーブル情報をループ
        Iterator<TableInfo> srcs = tables.iterator();
        while (srcs.hasNext()) {
            TableInfo src = srcs.next();

            // 比較元が、履歴モデルかビューならスキップ
            if (src.isHistory() || src.isView()) {
                continue;
            }

            // 比較元が、参照モデルならスキップ
            if (isReferModel(src)) {
                continue;
            }

            int rebornCount = 0;

            // 転生先として、テーブル情報をループ
            Iterator<TableInfo> dests = tables.iterator();
            while (dests.hasNext()) {
                TableInfo dest = dests.next();

                // 比較先が、履歴モデルかビューならスキップ
                if (dest.isHistory() || dest.isView()) {
                    continue;
                }

                // 比較先の外部キーを取得
                Set<String> destFKs = new HashSet<String>();
                for (String srcPK : src.getPrimaryKeys()) {
                    ColumnInfo srcPrimaryKey = src.getColumnInfos().get(srcPK);

                    // 比較先のカラム情報でループして比較元の主キーがあれば参照テーブルリストに追加
                    for (Entry<String, ColumnInfo> destCols : dest.getColumnInfos().entrySet()) {
                        String destColName = destCols.getKey();
                        ColumnInfo destCol = destCols.getValue();

                        // 比較先が主キーならスキップ
                        if (destCol.isPk()) {
                            continue;
                        }

                        // 比較先がNULL可ならスキップ
                        if (destCol.getNullable() == 1) {
                            continue;
                        }

                        // データ型が異なるならスキップ
                        if (!destCol.getTypeName().equals(srcPrimaryKey.getTypeName())) {
                            continue;
                        }

                        // データサイズが異なるならスキップ
                        if (destCol.getColumnSize() != srcPrimaryKey.getColumnSize()) {
                            continue;
                        }

                        // 小数桁数が異なるならスキップ
                        if (destCol.getDecimalDigits() != srcPrimaryKey.getDecimalDigits()) {
                            continue;
                        }

                        // 比較先カラム名が比較元カラム名と合致するなら比較先を転生モデルに設定
                        if (destColName.matches("(?i)^" + srcPK + "$")) {
                            destFKs.add(destColName);
                        }
                    }
                }

                if (src.getPrimaryKeys().size() == destFKs.size()) {
                    // 比較元の主キーと、比較先の外部キーの、数が一致する場合

                    boolean isRebornElse = false;

                    // 処理済み情報
                    Iterator<TableInfo> others = tables.iterator();
                    while (others.hasNext()) {
                        TableInfo other = others.next();

                        // 転生先を設定済みでなければスキップ
                        if (other.getRebornInfo() == null) {
                            continue;
                        }

                        // 転生先を設定済みでも、今回の転生先と重複していなければスキップ
                        if (!other.getRebornInfo().getName().equals(dest.getName())) {
                            continue;
                        }

                        // 重複する転生先を設定済みの場合
                        if (other.getPrimaryKeys().size() < src.getPrimaryKeys().size()) {

                            // 今回の転生元の方がキー数が多いなら、処理済みの転生先をクリア
                            TableInfo otherReborn = other.getRebornInfo();
                            other.setRebornInfo(null);
                            for (ColumnInfo column : otherReborn.getColumnInfos().values()) {
                                column.setReborn(false);
                            }

                        } else if (other.getPrimaryKeys().size() > src.getPrimaryKeys().size()) {
                            // 今回の転生元の方がキー数が少ないなら、転生先としない
                            isRebornElse = true;
                        }
                    }

                    // 今回の比較先が、他モデルの転生先でなければ、比較元の転生先に設定
                    if (!isRebornElse) {

                        // ２回以上ここに来る＝転生先が複数存在しうる＝転生登録しない
                        if (rebornCount > 0) {
                            if (src.getRebornInfo() != null) {
                                TableInfo reborn = src.getRebornInfo(); // 転生先を派生先に追加
                                src.setRebornInfo(null);
                                src.getDeriveInfos().add(reborn);
                                for (String fk : destFKs) {
                                    reborn.getColumnInfos().get(fk).setReborn(false);
                                    reborn.getColumnInfos().get(fk).setDerive(true);
                                }
                            }
                            src.getDeriveInfos().add(dest);
                            for (String fk : destFKs) {
                                dest.getColumnInfos().get(fk).setDerive(true);
                            }
                            continue;
                        }

                        ++rebornCount;
                        src.setRebornInfo(dest);
                        for (String fk : destFKs) {
                            dest.getColumnInfos().get(fk).setReborn(true);
                        }
                    }
                }
            }
        }
    }

    /**
     * @param table
     * @return boolean
     */
    private static boolean isReferModel(final TableInfo table) {

        if (table.getPrimaryKeys().size() == 1) {
            String pk = table.getPrimaryKeys().get(0);

            for (String[] referPair : referPairs) {
                String keySuffix = referPair[0];
                String meiSuffix = referPair[1];
                String referMei = pk.replaceAll("(?i)" + keySuffix + "$", meiSuffix);

                // 単一キーが参照キーである場合
                if (StringUtil.endsWithIgnoreCase(keySuffix, pk)) {

                    // 参照名にも合致する場合は除外
                    for (String k : table.getColumnInfos().keySet()) {
                        if (k.matches("(?i)^" + referMei + "$")) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    /**
     * ユニークキーテーブル（集約元）から、植え付け先（集約先）を探す
     * @param tableInfos テーブル情報のリスト
     */
    private static void addSummaryTable(final List<TableInfo> tableInfos) {

        // 集約先として、テーブル情報をループ
        Iterator<TableInfo> srcs = tableInfos.iterator();
        while (srcs.hasNext()) {
            TableInfo src = srcs.next();

            // 比較元が、履歴モデルかビューならスキップ
            if (src.isHistory() || src.isView()) {
                continue;
            }

            // 比較元が、参照モデルならスキップ
            if (isReferModel(src)) {
                continue;
            }

            int summaryCount = 0;

            // 集約元として、テーブル情報をループ
            Iterator<TableInfo> dests = tableInfos.iterator();
            while (dests.hasNext()) {
                TableInfo dest = dests.next();

                // 比較先が、履歴モデルかビューならスキップ
                if (dest.isHistory() || dest.isView()) {
                    continue;
                }

                // 比較先の外部キーを取得
                Set<String> destFKs = new HashSet<String>();
                for (String srcPK : src.getPrimaryKeys()) {
                    ColumnInfo srcPrimaryKey = src.getColumnInfos().get(srcPK);

                    // 比較先のカラム情報でループして、比較元の主キーがあれば、比較先の外部キーリストに追加
                    for (Entry<String, ColumnInfo> destCols : dest.getColumnInfos().entrySet()) {
                        String destColName = destCols.getKey();
                        ColumnInfo destCol = destCols.getValue();

                        // 比較先が主キーならスキップ
                        if (destCol.isPk()) {
                            continue;
                        }

                        // 比較先がNULL不可ならスキップ
                        if (destCol.getNullable() != 1) {
                            continue;
                        }

                        // データ型が異なるならスキップ
                        if (!destCol.getTypeName().equals(srcPrimaryKey.getTypeName())) {
                            continue;
                        }

                        // データサイズが異なるならスキップ
                        if (destCol.getColumnSize() != srcPrimaryKey.getColumnSize()) {
                            continue;
                        }

                        // 小数桁数が異なるならスキップ
                        if (destCol.getDecimalDigits() != srcPrimaryKey.getDecimalDigits()) {
                            continue;
                        }

                        // 比較先カラム名が比較元カラム名と合致するなら、比較先の外部キーリストに追加
                        if (destColName.matches("(?i)^" + srcPK + "$")) {
                            destFKs.add(destColName);
                        }
                    }
                }

                if (src.getPrimaryKeys().size() == destFKs.size()) {
                    // 比較元の主キーと、比較先の外部キーの、数が一致する場合

                    boolean isSummaryElse = false;

                    // 処理済み情報
                    Iterator<TableInfo> others = tableInfos.iterator();
                    while (others.hasNext()) {
                        TableInfo other = others.next();

                        // 集約元を設定済みでなければスキップ
                        if (other.getSummaryInfo() == null) {
                            continue;
                        }

                        // 集約元を設定済みでも、今回の集約元と重複していなければスキップ
                        if (!other.getSummaryInfo().getName().equals(dest.getName())) {
                            continue;
                        }

                        // 重複する集約元を設定済みの場合
                        if (other.getPrimaryKeys().size() < src.getPrimaryKeys().size()) {

                            // 今回の集約先の方がキー数が多いなら、処理済みの集約元をクリア
                            TableInfo otherSummary = other.getSummaryInfo();
                            other.setSummaryInfo(null);
                            for (ColumnInfo column : otherSummary.getColumnInfos().values()) {
                                column.setSummary(false);
                            }

                        } else if (other.getPrimaryKeys().size() > src.getPrimaryKeys().size()) {
                            // 今回の集約元の方がキー数が少ないなら、集約先としない
                            isSummaryElse = true;
                        }
                    }

                    // 今回の比較先が、他モデルの集約元でなければ、比較元の集約元に設定
                    if (!isSummaryElse) {

                        // ２回以上ここに来る＝転生先が複数存在しうる＝転生登録しない
                        if (summaryCount > 0) {
                            if (src.getSummaryInfo() != null) {
                                TableInfo summary = src.getSummaryInfo();
                                src.setSummaryInfo(null);
                                for (ColumnInfo column : summary.getColumnInfos().values()) {
                                    column.setSummary(false);
                                }
                            }
                            continue;
                        }

                        ++summaryCount;
                        src.setSummaryInfo(dest);
                        for (String fk : destFKs) {
                            dest.getColumnInfos().get(fk).setSummary(true);
                        }
                    }
                }
            }
        }
    }
}
