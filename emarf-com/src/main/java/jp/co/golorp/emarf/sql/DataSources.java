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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

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
     * スキーマのメタ情報取得
     * @return List<TableInfo>
     */
    public static List<TableInfo> getTableInfos() {

        // 設定ファイル読み込み
        ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);
        String[] pairs = bundle.getString("DataSources.reration.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }
        ignoreRe = bundle.getString("DataSources.relation.ignore.re");
        eldestRe = bundle.getString("DataSources.relation.eldest.re");
        bastardRe = bundle.getString("DataSources.relation.bastard.re");
        youngestRe = bundle.getString("DataSources.relation.youngest.re");
        dinksRe = bundle.getString("DataSources.relation.dinks.re");
        orphansRe = bundle.getString("DataSources.relation.orphans.re");
        columnIgnoreRe = bundle.getString("DataSources.column.ignore.re");
        noNumberingIntRe = bundle.getString("DataSources.column.nonumbering.int.re");
        numberingCharRe = bundle.getString("DataSources.column.numbering.char.re");
        inputTimestampSuffixs = bundle.getString("BeanGenerator.input.timestamp.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("BeanGenerator.input.datetime.suffixs").split(",");
        inputDateSuffixs = bundle.getString("BeanGenerator.input.date.suffixs").split(",");
        inputTimeSuffixs = bundle.getString("BeanGenerator.input.time.suffixs").split(",");

        // テーブル情報の取得
        List<TableInfo> tableInfos = new ArrayList<TableInfo>();
        try {
            // データベースからテーブル情報を取得してループ
            Connection cn = Connections.get();
            DatabaseMetaData metaData = cn.getMetaData();

            // テーブル情報を取得
            String schemaPattern = BUNDLE.getString("username");
            addTableInfos(tableInfos, metaData, schemaPattern);

            // テーブル毎に主キー情報を取得
            for (TableInfo tableInfo : tableInfos) {
                addPrimaryKeys(metaData, tableInfo);
            }

            // テーブル毎にカラム情報を取得
            for (TableInfo tableInfo : tableInfos) {

                // テーブルのカラム情報を取得してループ
                ResultSet columns = metaData.getColumns(null, schemaPattern.toUpperCase(), tableInfo.getTableName(),
                        null);

                while (columns.next()) {

                    // カラム名が合致しなければスキップ
                    String columnName = columns.getString("COLUMN_NAME");

                    if (!columnName.matches("^[\\$\\-0-9A-Z\\_a-z]+$")) {
                        continue;
                    }

                    if (columnName.matches(columnIgnoreRe)) {
                        continue;
                    }

                    // カラム情報を追加
                    ColumnInfo columnInfo = new ColumnInfo();
                    tableInfo.getColumnInfos().put(columnName, columnInfo);
                    columnInfo.setColumnName(columnName); // カラム物理名
                    columnInfo.setTypeName(columns.getString("TYPE_NAME")); // DBデータ型
                    columnInfo.setColumnSize(columns.getInt("COLUMN_SIZE")); // カラムサイズ
                    if (columnInfo.getColumnSize() == 0) {
                        columnInfo.setColumnSize(3);
                    }
                    if (StringUtil.endsWith(inputDateSuffixs, columnName)) { // 桁制限
                        columnInfo.setMaxLength(10);
                    } else if (StringUtil.endsWith(inputTimeSuffixs, columnName)) {
                        columnInfo.setMaxLength(5);
                    } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnName)) {
                        columnInfo.setMaxLength(19);
                    } else if (StringUtil.endsWith(inputTimestampSuffixs, columnName)) {
                        columnInfo.setMaxLength(23);
                    }
                    columnInfo.setDecimalDigits(columns.getInt("DECIMAL_DIGITS")); // 小数桁数
                    columnInfo.setNullable(columns.getInt("NULLABLE")); // NULL可否
                    String remarks = columns.getString("REMARKS"); // カラム論理名
                    if (remarks == null || remarks.length() == 0) {
                        remarks = assist.getColumnComment(tableInfo.getTableName(), columnName);
                    }
                    if (remarks.contains(":")) {
                        int i = remarks.indexOf(":");
                        remarks = remarks.substring(0, i);
                    }
                    if (remarks == null || remarks.length() == 0) {
                        remarks = columnName;
                    }
                    columnInfo.setRemarks(remarks);
                    if (tableInfo.getPrimaryKeys().contains(columnName)) { // 主キー
                        columnInfo.setPk(true);
                    } else {
                        if (tableInfo.getUniqueIndexColumns().contains(columnName)) {
                            columnInfo.setUnique(true);
                        }
                        tableInfo.getNonPrimaryKeys().add(columnName);
                    }

                    // typeNameをjavaデータ型に変換
                    String dataType = getDataType(columnInfo);
                    columnInfo.setDataType(dataType);
                }

                columns.close();

                if (tableInfo.getPrimaryKeys().size() == 0 && tableInfo.isView()) {
                    ColumnInfo pkColumn = tableInfo.getColumnInfos().get("NO");
                    if (pkColumn != null) {
                        tableInfo.getPrimaryKeys().add("NO");
                        pkColumn.setPk(true);
                        tableInfo.getNonPrimaryKeys().remove("NO");
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
        addBrotherTable(tableInfos);

        //履歴モデルの評価
        addHistoryTable(tableInfos);

        //子モデルの評価
        addChildTables(tableInfos);

        //参照モデルの評価
        addReferTable(tableInfos);

        log(tableInfos);

        return tableInfos;
    }

    /**
     * @param tableInfos
     */
    private static void log(final List<TableInfo> tableInfos) {

        for (TableInfo tableInfo : tableInfos) {

            LOG.info("");
            LOG.info("■" + tableInfo.getTableName());

            if (tableInfo.getPrimaryKeys().size() > 0) {
                LOG.info("    PrimaryKeys: " + tableInfo.getPrimaryKeys());
            }

            if (tableInfo.getParentInfos().size() > 0) {
                LOG.info("    ParentInfos:");
                for (TableInfo parentInfo : tableInfo.getParentInfos()) {
                    LOG.info("        " + parentInfo.getTableName() + " " + parentInfo.getPrimaryKeys());
                }
            }

            if (tableInfo.getBrosInfos().size() > 0) {
                LOG.info("    BrosInfos:");
                for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
                    LOG.info("        " + brosInfo.getTableName() + " " + brosInfo.getPrimaryKeys());
                }
            }

            if (tableInfo.getChildInfos().size() > 0) {
                LOG.info("    ChildInfos:");
                for (TableInfo childInfo : tableInfo.getChildInfos()) {
                    LOG.info("        " + childInfo.getTableName() + " " + childInfo.getPrimaryKeys());
                }
            }

            if (tableInfo.getHistoryInfo() != null) {
                LOG.info("    HistoryInfo:");
                TableInfo historyInfo = tableInfo.getHistoryInfo();
                LOG.info("        " + historyInfo.getTableName() + " " + historyInfo.getPrimaryKeys());
            }

            Map<String, TableInfo> referInfos = new LinkedHashMap<String, TableInfo>();
            for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
                if (columnInfo.getReferInfo() != null) {
                    referInfos.put(columnInfo.getColumnName(), columnInfo.getReferInfo());
                }
            }
            if (referInfos.size() > 0) {
                LOG.info("    ReferInfos:");
                for (Entry<String, TableInfo> e : referInfos.entrySet()) {
                    String columnName = e.getKey();
                    TableInfo referInfo = e.getValue();
                    LOG.info("        " + columnName + " = " + referInfo.getTableName() + " "
                            + referInfo.getPrimaryKeys());
                }
            }
        }

        LOG.info("");
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
        try (ResultSet rs = metaData.getPrimaryKeys(null, schemaPattern.toUpperCase(), tableInfo.getTableName())) {
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

        MapList uniqueIndexColumns = assist.getUniqueIndexes(tableInfo.getTableName());
        if (uniqueIndexColumns != null) {

            for (Map<String, Object> uniqueIndexColumn : uniqueIndexColumns) {
                String columnName = uniqueIndexColumn.get("COLUMN_NAME").toString();
                if (!tableInfo.getUniqueIndexColumns().contains(columnName)) {
                    tableInfo.getUniqueIndexColumns().add(columnName);
                }
            }

            if (tableInfo.getPrimaryKeys().size() == 0) {

                // 最初にとれたユニークインデクスを主キー扱いにする
                String preIndexName = null;
                for (Map<String, Object> uniqueIndexColumn : uniqueIndexColumns) {
                    //                    LOG.info(uniqueIndexColumn.get("TABLE_NAME") + "\t" + uniqueIndexColumn.get("INDEX_NAME") + "\t"
                    //                            + uniqueIndexColumn.get("COLUMN_POSITION") + "\t" + uniqueIndexColumn.get("COLUMN_NAME"));
                    if (preIndexName == null) {
                        preIndexName = uniqueIndexColumn.get("INDEX_NAME").toString();
                    }
                    if (!preIndexName.equals(uniqueIndexColumn.get("INDEX_NAME").toString())) {
                        break;
                    }
                    String columnName = uniqueIndexColumn.get("COLUMN_NAME").toString();
                    tableInfo.getPrimaryKeys().add(columnName);
                }
            }
        }
    }

    /**
     * テーブル情報のリストに各テーブルを追加
     * @param tableInfos テーブル情報のリスト
     * @param metaData メタデータ
     * @param schemaPattern スキーマ名
     * @throws SQLException
     */
    private static void addTableInfos(final List<TableInfo> tableInfos, final DatabaseMetaData metaData,
            final String schemaPattern) throws SQLException {

        ResultSet rs = metaData.getTables(null, schemaPattern.toUpperCase(), null, new String[] { "TABLE", "VIEW" });

        while (rs.next()) {

            String tableName = rs.getString("TABLE_NAME");

            //半角文字でなければスキップ
            if (!tableName.matches("^[!-~]+$")) {
                continue;
            }

            //対象外のテーブル名ならスキップ
            if (!StringUtil.isNullOrBlank(ignoreRe) && tableName.matches(ignoreRe)) {
                continue;
            }

            // テーブル情報を追加
            TableInfo tableInfo = new TableInfo();
            tableInfos.add(tableInfo);

            // テーブル物理名
            tableInfo.setTableName(tableName);

            // テーブル論理名
            String remarks = rs.getString("REMARKS");
            if (remarks == null || remarks.length() == 0) {
                remarks = assist.getTableComment(tableName);
            }
            if (remarks == null || remarks.length() == 0) {
                remarks = tableName;
            }
            tableInfo.setRemarks(remarks);

            String tableType = rs.getString("TABLE_TYPE");
            tableInfo.setView(tableType.equals("VIEW"));
        }

        rs.close();
    }

    /**
     * @param columnInfo 対象のカラム情報
     * @return javaデータ型に変換した文字列
     */
    private static String getDataType(final ColumnInfo columnInfo) {

        String typeName = columnInfo.getTypeName().toUpperCase();
        String dataType = typeName;

        if (typeName.equals("INT")
                || (typeName.equals("NUMBER") && columnInfo.getColumnSize() <= 10
                        && columnInfo.getDecimalDigits() == 0)) {

            dataType = "Integer";

            if (columnInfo.isPk()) {
                if (!columnInfo.getColumnName().matches(noNumberingIntRe)) {
                    columnInfo.setNumbering(true);
                }
            }

        } else if (typeName.equals("DECIMAL") || typeName.equals("DOUBLE") || typeName.equals("NUMBER")
                || typeName.equals("NUMERIC")) {

            dataType = "java.math.BigDecimal";

            if (columnInfo.isPk() && columnInfo.getDecimalDigits() == 0) {
                if (!columnInfo.getColumnName().matches(noNumberingIntRe)) {
                    columnInfo.setNumbering(true);
                }
            }

        } else if (StringUtil.endsWith(inputDateSuffixs, columnInfo.getColumnName())) {

            dataType = "java.time.LocalDate";

        } else if (StringUtil.endsWith(inputTimeSuffixs, columnInfo.getColumnName())) {

            dataType = "java.time.LocalTime";

        } else if (typeName.equals("DATE") || typeName.equals("TIME") || typeName.equals("DATETIME")
                || typeName.indexOf("TIMESTAMP") >= 0) {

            dataType = "java.time.LocalDateTime";

        } else {

            dataType = "String";

            if (typeName.equals("CHAR")) {
                if (columnInfo.isPk()) {
                    if (columnInfo.getColumnName().matches(numberingCharRe)) {
                        columnInfo.setNumbering(true);
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
            if (elder.getTableName().matches(youngestRe)) {
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
                if (younger.getTableName().matches(eldestRe)) {
                    younger.setBrother(false);
                } else {
                    nonEldestInfos.add(younger);
                }
            }
            elder.setBrosInfos(nonEldestInfos);

            // ２．長兄モデルなら弟モデルの弟情報をクリア
            if (elder.getTableName().matches(eldestRe)) {
                elder.setBrother(false);
                for (TableInfo younger : elder.getBrosInfos()) {
                    younger.setBrosInfos(new ArrayList<TableInfo>());
                }
            }

            // ３．弟情報から隠し子モデルを削除
            List<TableInfo> youngers = new ArrayList<TableInfo>();
            for (TableInfo younger : elder.getBrosInfos()) {
                if (!younger.getTableName().matches(bastardRe)) {
                    youngers.add(younger);
                }
            }
            elder.setBrosInfos(youngers);
        }
    }

    /**
     * 各テーブル情報に履歴モデルを設定
     * @param tableInfos テーブル情報のリスト
     */
    private static void addHistoryTable(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();
        while (srcIterator.hasNext()) {
            TableInfo srcInfo = srcIterator.next();

            if (srcInfo.getPrimaryKeys().size() == 0) {
                continue;
            }

            // テーブル情報でループ（比較先）
            Iterator<TableInfo> destIterator = tableInfos.iterator();
            while (destIterator.hasNext()) {
                TableInfo destInfo = destIterator.next();

                // 比較元と同じならスキップ
                if (srcInfo == destInfo) {
                    continue;
                }

                String srcPrimaryKeys = srcInfo.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                String destPrimaryKeys = destInfo.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                String srcNonPrimaryKeys = srcInfo.getNonPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                String destNonPrimaryKeys = destInfo.getNonPrimaryKeys().toString().replaceAll("[\\[\\]]", "");

                // キー以外が合致しなければスキップ
                if (!srcNonPrimaryKeys.equals(destNonPrimaryKeys)) {
                    continue;
                }
                // 比較先が比較元の主キーと同じ組み合わせならスキップ
                if (destPrimaryKeys.equals(srcPrimaryKeys)) {
                    continue;
                }
                // 比較先が比較元の主キーと同じ組み合わせでスタートしなければスキップ
                if (!destPrimaryKeys.startsWith(srcPrimaryKeys)) {
                    continue;
                }
                if (destPrimaryKeys.replaceAll(srcPrimaryKeys + ", ", "").split(",").length != 1) {
                    continue;
                }
                String destLastKey = destInfo.getPrimaryKeys().get(destInfo.getPrimaryKeys().size() - 1);
                ColumnInfo lastPKInfo = destInfo.getColumnInfos().get(destLastKey);
                if (!lastPKInfo.isNumbering() || lastPKInfo.getTypeName().equals("CHAR")) {
                    continue;
                }

                destInfo.setHistory(true);
                srcInfo.setHistoryInfo(destInfo);
            }
        }
    }

    /**
     * 各テーブル情報に子モデルを設定
     * @param tableInfos テーブル情報のリスト
     */
    private static void addChildTables(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();

        while (srcIterator.hasNext()) {

            TableInfo srcInfo = srcIterator.next();

            // 主キーがなければスキップ
            if (srcInfo.getPrimaryKeys().size() == 0) {
                continue;
            }

            // 子を設定しないテーブルならスキップ
            if (srcInfo.getTableName().matches(dinksRe)) {
                continue;
            }

            // 比較元の子テーブルリストを取得
            List<TableInfo> childInfos = srcInfo.getChildInfos();

            // テーブル情報でループ（比較先）
            Iterator<TableInfo> destIterator = tableInfos.iterator();
            while (destIterator.hasNext()) {
                TableInfo destInfo = destIterator.next();

                // 比較元と同じならスキップ
                if (srcInfo == destInfo) {
                    continue;
                }

                // 親を設定しないテーブルならスキップ
                if (destInfo.getTableName().matches(orphansRe)) {
                    continue;
                }

                if (destInfo.getPrimaryKeys().size() == 0) {
                    continue;
                }

                boolean isPkMatch = true;
                for (int i = 0; i < srcInfo.getPrimaryKeys().size(); i++) {
                    if (destInfo.getPrimaryKeys().size() <= i) {
                        isPkMatch = false;
                        break;
                    }
                    String src = srcInfo.getPrimaryKeys().get(i);
                    String dest = destInfo.getPrimaryKeys().get(i);
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
                if (srcInfo.getPrimaryKeys().size() + 1 == destInfo.getPrimaryKeys().size()) {
                    // 履歴テーブルでも兄弟テーブルでもなければ追加
                    if (destInfo.isHistory()) {
                        continue;
                    } else {

                        //比較元の子モデルに比較先を追加
                        childInfos.add(destInfo);

                        //比較先の親モデルに比較元を追加
                        destInfo.getParentInfos().add(srcInfo);
                    }
                }
            }
        }
    }

    /**
     * 参照先のマスタテーブルから、植え付け先を探す
     * @param tableInfos テーブル情報のリスト
     */
    private static void addReferTable(final List<TableInfo> tableInfos) {

        // 参照IDサフィックスと参照名称サフィックスの組み合わせでループ（定義した順に優先）
        for (String[] referPair : referPairs) {
            String referIdSuffix = referPair[0];
            String referMeiSuffix = referPair[1];

            // 比較元テーブル（参照先マスタ）情報でループ
            Iterator<TableInfo> srcIterator = tableInfos.iterator();
            while (srcIterator.hasNext()) {
                TableInfo srcInfo = srcIterator.next();

                // 他のテーブルの弟ならスキップ
                if (srcInfo.isBrother()) {
                    continue;
                }

                // 複合キーならスキップ
                if (srcInfo.getPrimaryKeys().size() != 1) {
                    continue;
                }

                // ユニークキーが参照キーの何れにも合致しなければスキップ
                String srcId = srcInfo.getPrimaryKeys().get(0);
                if (!StringUtil.endsWithIgnoreCase(referIdSuffix, srcId)) {
                    continue;
                }

                // 参照名称サフィックスに合致するカラムがなければスキップ
                String srcMei = srcId.replaceAll("(?i)" + referIdSuffix + "$", referMeiSuffix);
                //                if (!srcInfo.getColumnInfos().containsKey(srcMei)) {
                //                    continue;
                //                }
                boolean b = false;
                for (String k : srcInfo.getColumnInfos().keySet()) {
                    if (k.matches("(?i)^" + srcMei + "$")) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    continue;
                }

                // 参照マスタのユニークキー情報
                ColumnInfo srcIdInfo = srcInfo.getColumnInfos().get(srcId);

                /*
                 * 比較先（参照元テーブル）の探索
                 */

                // テーブル情報でループ（比較先）
                Iterator<TableInfo> destIterator = tableInfos.iterator();
                while (destIterator.hasNext()) {
                    TableInfo destInfo = destIterator.next();

                    // マスタ系が悉く参照モデルでなくなるので廃止
                    //                    // 比較先自体が参照マスタならスキップ
                    //                    boolean self = false;
                    //                    if (tableInfo.getPrimaryKeys().size() == 1) {
                    //                        String primaryKey = tableInfo.getPrimaryKeys().get(0);
                    //                        for (String[] pair : referPairs) {
                    //                            String idSuffix = pair[0];
                    //                            String meiSuffix = pair[1];
                    //                            if (StringUtil.endsWithIgnoreCase(idSuffix, primaryKey)) {
                    //                                String meiColumnName = primaryKey.replaceAll("(?i)" + idSuffix + "$", meiSuffix);
                    //                                if (tableInfo.getColumnInfos().containsKey(meiColumnName)) {
                    //                                    self = true;
                    //                                    break;
                    //                                }
                    //                            }
                    //                        }
                    //                    }
                    //                    if (self) {
                    //                        continue;
                    //                    }

                    // 比較先のカラム情報でループして比較元のユニークキーがあれば参照テーブルリストに追加
                    for (Entry<String, ColumnInfo> destColumnInfos : destInfo.getColumnInfos().entrySet()) {
                        String destColumnName = destColumnInfos.getKey();
                        ColumnInfo destColumnInfo = destColumnInfos.getValue();

                        // 比較先がユニークキーで、弟に設定しないテーブルならスキップ
                        if (destColumnInfo.isPk() && destInfo.getPrimaryKeys().size() == 1) {
                            if (destInfo.getTableName().matches(eldestRe)) {
                                continue;
                            }
                        }

                        // 参照テーブル自体の主キー同士ならスキップ
                        if (destInfo == srcInfo && destColumnInfo == srcIdInfo) {
                            continue;
                        }

                        // データ型が異なるならスキップ
                        if (!destColumnInfo.getTypeName().equals(srcIdInfo.getTypeName())) {
                            continue;
                        }

                        // データサイズが異なるならスキップ
                        if (destColumnInfo.getColumnSize() != srcIdInfo.getColumnSize()) {
                            continue;
                        }

                        // 小数桁数が異なるならスキップ
                        if (destColumnInfo.getDecimalDigits() != srcIdInfo.getDecimalDigits()) {
                            continue;
                        }

                        // 比較先カラム名の末尾が比較元カラム名と合致していて、参照モデルが登録済みでなければ、比較元を参照モデルに設定
                        if (destColumnName.endsWith(srcId) && destColumnInfo.getReferInfo() == null) {
                            destColumnInfo.setReferInfo(srcInfo);
                        }
                    }
                }
            }
        }
    }

}
