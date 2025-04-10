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
    private static String[] inputHourSuffixs;
    /** 時間入力サフィックス */
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
        inputHourSuffixs = bundle.getString("input.hour.suffixs").split(",");
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
            addTables(metaData, schemaPattern, tables);

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
                    if (!columnName.matches("^[\\#\\$\\-0-9A-Z\\_a-z]+$")) {
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
                    table.getColumns().put(columnName, column);

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
                    } else if (StringUtil.endsWith(inputHourSuffixs, columnName)) {
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
                    String note = "";
                    if (remarks == null || remarks.length() == 0) {
                        remarks = assist.getColumnComment(table.getName(), columnName);
                    }
                    if (remarks != null && remarks.contains(":")) {
                        int i = remarks.indexOf(":");
                        note = remarks.substring(i);
                        remarks = remarks.substring(0, i);
                    }
                    if (remarks == null || remarks.length() == 0) {
                        remarks = columnName;
                    }
                    column.setRemarks(remarks);
                    column.setNote(note);

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
                    ColumnInfo noCol = table.getColumns().get("NO");
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
        //参照モデルの評価
        addReferTable(tables);
        //子モデルの評価
        addChildTables(tables);
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
     * テーブル情報のリストに各テーブルを追加
     * @param metaData メタデータ
     * @param schemaPattern スキーマ名
     * @param tables テーブル情報のリスト
     * @throws SQLException
     */
    private static void addTables(final DatabaseMetaData metaData, final String schemaPattern,
            final List<TableInfo> tables) throws SQLException {

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
     * テーブル情報に主キー名のリストを設定
     * @param metaData メタデータ
     * @param table テーブル情報
     * @throws SQLException
     */
    private static void addPrimaryKeys(final DatabaseMetaData metaData, final TableInfo table) throws SQLException {

        List<String> primaryKeys = new ArrayList<String>();

        // テーブルの主キー情報でループ
        String schemaPattern = BUNDLE.getString("username");
        try (ResultSet rs = metaData.getPrimaryKeys(null, schemaPattern.toUpperCase(), table.getName())) {
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
                table.getPrimaryKeys().add(primaryKey);
            }
        }

        MapList uniqueIndexColumns = assist.getUniqueIndexes(table.getName());
        if (uniqueIndexColumns != null) {

            for (Map<String, Object> uniqueIndexColumn : uniqueIndexColumns) {
                String columnName = null;
                if (uniqueIndexColumn.get("COLUMN_NAME") != null) {
                    columnName = uniqueIndexColumn.get("COLUMN_NAME").toString();
                } else if (uniqueIndexColumn.get("Column_name") != null) {
                    columnName = uniqueIndexColumn.get("Column_name").toString();
                }
                if (!table.getUniqueIndexColumns().contains(columnName)) {
                    table.getUniqueIndexColumns().add(columnName);
                }
            }

            if (table.getPrimaryKeys().size() == 0) {

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
                    table.getPrimaryKeys().add(columnName);
                }
            }
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

        } else if (StringUtil.endsWith(inputHourSuffixs, column.getName())) {

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
     * @param tables テーブル情報のリスト
     */
    private static void addBrotherTable(final List<TableInfo> tables) {

        // 兄候補としてループ
        Iterator<TableInfo> elders = tables.iterator();
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

            // 弟候補としてループ
            Iterator<TableInfo> youngers = tables.iterator();
            while (youngers.hasNext()) {
                TableInfo younger = youngers.next();

                // 同じテーブルならスキップ
                if (elder == younger) {
                    continue;
                }

                // 兄弟の主キーに適用日が含まれる場合は評価から除外（不要かも）
                List<String> elderKeys = new ArrayList<String>(elder.getPrimaryKeys());
                List<String> youngerKeys = new ArrayList<String>(younger.getPrimaryKeys());
                boolean isElderTekiyoBi = elderKeys.contains(tekiyoBi);
                boolean isYoungerTekiyoBi = youngerKeys.contains(tekiyoBi);
                if (isElderTekiyoBi && isYoungerTekiyoBi) {
                    elderKeys.remove(tekiyoBi);
                    youngerKeys.remove(tekiyoBi);
                }

                // 主キーが合致しなければスキップ
                String elderKeyCsv = elderKeys.toString().replaceAll("[\\[\\]]", "");
                String youngerKeyCsv = youngerKeys.toString().replaceAll("[\\[\\]]", "");
                if (!elderKeyCsv.equals(youngerKeyCsv)) {
                    continue;
                }

                //                // 比較元が既に比較先の弟ならスキップ
                //                if (destInfo.getBrosInfos().contains(srcInfo)) {
                //                    continue;
                //                }

                // 兄に弟を追加、弟に弟フラグを設定
                elder.getYoungers().add(younger);
                younger.setYounger(true);
            }
        }

        for (TableInfo elder : tables) {

            // 設定済みの弟リストに、長兄モデルが含まれる場合は除去して再設定
            List<TableInfo> nonEldests = new ArrayList<TableInfo>();
            for (TableInfo younger : elder.getYoungers()) {
                if (younger.getName().matches(eldestRe)) {
                    younger.setYounger(false);
                } else {
                    nonEldests.add(younger);
                }
            }
            elder.setYoungers(nonEldests);

            // 長兄モデルである場合は、自身の弟フラグを消し込み、各弟モデルの弟情報をクリア
            if (elder.getName().matches(eldestRe)) {
                elder.setYounger(false);
                for (TableInfo younger : elder.getYoungers()) {
                    younger.setYoungers(new ArrayList<TableInfo>());
                }
            }

            // 設定済みの弟リストに、弟にしないモデルがある場合は除去して再設定
            List<TableInfo> youngers = new ArrayList<TableInfo>();
            for (TableInfo younger : elder.getYoungers()) {
                if (!younger.getName().matches(bastardRe)) {
                    youngers.add(younger);
                }
            }
            elder.setYoungers(youngers);
        }
    }

    /**
     * 各テーブル情報に履歴モデルを設定
     * @param tables テーブル情報のリスト
     */
    private static void addHistoryTable(final List<TableInfo> tables) {

        // 履歴元としてループ
        Iterator<TableInfo> motos = tables.iterator();
        while (motos.hasNext()) {
            TableInfo moto = motos.next();

            //主キーがなければスキップ
            if (moto.getPrimaryKeys().size() == 0) {
                continue;
            }

            String motoKeyCsv = moto.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
            String motoColCsv = moto.getNonPrimaryKeys().toString().replaceAll("[\\[\\]]", "");

            // 比較先でループ
            Iterator<TableInfo> sakis = tables.iterator();
            while (sakis.hasNext()) {
                TableInfo saki = sakis.next();

                // 比較元と比較先が同じならスキップ
                if (moto == saki) {
                    continue;
                }

                List<String> sakiNonPrimaryKeys = new ArrayList<String>(saki.getNonPrimaryKeys());
                if (!StringUtil.isNullOrBlank(reason) && sakiNonPrimaryKeys.contains(reason)) {
                    sakiNonPrimaryKeys.remove(reason);
                }

                String sakiKeyCsv = saki.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                String sakiColCsv = sakiNonPrimaryKeys.toString().replaceAll("[\\[\\]]", "");

                // キーが合致するならスキップ
                if (motoKeyCsv.equals(sakiKeyCsv)) {
                    continue;
                }

                // キー以外が合致しなければスキップ
                if (!motoColCsv.equals(sakiColCsv)) {
                    continue;
                }

                // 比較先が比較元の主キーと同じ組み合わせでスタートしなければスキップ
                if (!sakiKeyCsv.startsWith(motoKeyCsv)) {
                    continue;
                }

                // 比較先が比較元の主キー＋１キーでなければスキップ
                if (saki.getPrimaryKeys().size() != moto.getPrimaryKeys().size() + 1) {
                    continue;
                }

                // 比較先の最終キーが採番キーでないか文字列ならスキップ
                String sakiLastKey = saki.getPrimaryKeys().get(saki.getPrimaryKeys().size() - 1);
                ColumnInfo sakiLastPK = saki.getColumns().get(sakiLastKey);
                if (!sakiLastPK.isNumbering() || sakiLastPK.getTypeName().equals("CHAR")) {
                    continue;
                }

                // 比較先が比較元に前方一致しないならスキップ
                if (!saki.getName().matches("(?i)^" + moto.getName() + ".+$")) {
                    continue;
                }

                saki.setHistory(true);
                moto.setHistoryInfo(saki);
            }
        }
    }

    /**
     * マスタテーブル（参照先）から、植え付け先（参照元）を探す
     * @param tables テーブル情報のリスト
     */
    private static void addReferTable(final List<TableInfo> tables) {

        // 参照先マスタとしてループ
        Iterator<TableInfo> sakis = tables.iterator();
        while (sakis.hasNext()) {
            TableInfo saki = sakis.next();

            // 適用日が主キーに含まれる場合は除去
            List<String> sakiKeys = new ArrayList<String>(saki.getPrimaryKeys());
            sakiKeys.remove(tekiyoBi);

            // 参照先マスタが適用日を含まない複合キーならスキップ
            if (sakiKeys.size() != 1) {
                continue;
            }

            // 参照先マスタが他のテーブルの弟ならスキップ
            if (saki.isYounger()) {
                continue;
            }

            // 参照先マスタの単独主キー
            String sakiKey = sakiKeys.get(0);

            // 参照先が参照キー・参照名のいずれにも合致しなければ次のテーブルを検証
            boolean isRefer = false;
            for (String[] referPair : referPairs) {
                String keySuf = referPair[0];
                String meiSuf = referPair[1];

                // 参照キーに合致しなければ次の参照キーを検証
                if (!StringUtil.endsWithIgnoreCase(keySuf, sakiKey)) {
                    continue;
                }

                // 参照名に合致するカラムがあれば終了
                String referMei = sakiKey.replaceAll("(?i)" + keySuf + "$", meiSuf);
                for (String colName : saki.getColumns().keySet()) {
                    if (colName.matches("(?i)^" + referMei + "$")) {
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

            // 参照先マスタのユニークキー情報
            ColumnInfo sakiCol = saki.getColumns().get(sakiKey);

            // 参照元トランとしてループ
            Iterator<TableInfo> motos = tables.iterator();
            while (motos.hasNext()) {
                TableInfo moto = motos.next();

                // 適用日が主キーに含まれる場合は除去
                List<String> motoKeys = new ArrayList<String>(moto.getPrimaryKeys());
                motoKeys.remove(tekiyoBi);

                // 参照元トランのカラム情報でループ（比較元のユニークキーがあれば参照テーブルリストに追加）
                for (Entry<String, ColumnInfo> e : moto.getColumns().entrySet()) {
                    String motoColName = e.getKey();
                    ColumnInfo motoCol = e.getValue();

                    // 参照テーブル自体の主キー自体ならスキップ
                    if (moto == saki && motoCol == sakiCol) {
                        continue;
                    }

                    // データ型が異なるならスキップ
                    if (!motoCol.getTypeName().equals(sakiCol.getTypeName())) {
                        continue;
                    }

                    // データサイズが異なるならスキップ
                    if (motoCol.getColumnSize() != sakiCol.getColumnSize()) {
                        continue;
                    }

                    // 小数桁数が異なるならスキップ
                    if (motoCol.getDecimalDigits() != sakiCol.getDecimalDigits()) {
                        continue;
                    }

                    // 参照元トランもユニークキーで、長兄ならスキップ
                    if (motoCol.isPk() && motoKeys.size() == 1) {
                        if (moto.getName().matches(eldestRe)) {
                            continue;
                        }
                    }

                    // 参照元カラム名の末尾が参照先カラム名と合致し、参照モデルが未登録なら、カラムに参照モデルを設定
                    if (motoColName.matches("(?i)^.*" + sakiKey + "$") && motoCol.getRefer() == null) {
                        motoCol.setRefer(saki);

                        // 参照元の複合キーの最終キーなら、サブ画面で選択するため採番フラグをオフ
                        if (motoKeys.size() > 1 && motoColName.equals(motoKeys.get(motoKeys.size() - 1))) {
                            motoCol.setNumbering(false);
                        }
                    }
                }
            }
        }
    }

    /**
     * 各テーブル情報に子モデルを設定
     * @param tables テーブル情報のリスト
     */
    private static void addChildTables(final List<TableInfo> tables) {

        // 親候補としてループ
        Iterator<TableInfo> oyas = tables.iterator();
        while (oyas.hasNext()) {
            TableInfo oya = oyas.next();

            // 子を設定しないテーブルならスキップ
            if (oya.getName().matches(dinksRe)) {
                continue;
            }

            //主キーに適用日があれば評価から除外
            List<String> oyaKeys = new ArrayList<String>(oya.getPrimaryKeys());
            boolean isOyaTekiyoBi = oyaKeys.contains(tekiyoBi);
            if (isOyaTekiyoBi) {
                oyaKeys.remove(tekiyoBi);
            }

            // 主キーがなければスキップ
            if (oyaKeys.size() == 0) {
                continue;
            }

            // 比較元の子テーブルリストを取得
            List<TableInfo> childs = oya.getChilds();

            // テーブル情報でループ（比較先）
            Iterator<TableInfo> kos = tables.iterator();
            while (kos.hasNext()) {
                TableInfo ko = kos.next();

                // 親を設定しないテーブルならスキップ
                if (ko.getName().matches(orphansRe)) {
                    continue;
                }

                //                // 比較元の履歴モデルと同じならスキップ
                //                if (oya.getHistoryInfo() == ko) {
                //                    continue;
                //                }

                // 履歴テーブルならスキップ
                if (ko.isHistory()) {
                    continue;
                }

                // 比較元と同じならスキップ
                if (oya == ko) {
                    continue;
                }

                //親にも主キーに適用日があれば評価から除外
                List<String> koKeys = new ArrayList<String>(ko.getPrimaryKeys());
                if (koKeys.contains(tekiyoBi)) {
                    if (isOyaTekiyoBi) {
                        koKeys.remove(tekiyoBi);
                    } else if (oyaKeys.size() + 2 == koKeys.size()) {
                        // 親には適用日がないが子から適用日を外すと親子かもしれない場合
                        koKeys.remove(tekiyoBi);
                    }
                }

                // 主キーがなければスキップ
                if (koKeys.size() == 0) {
                    continue;
                }

                // 子の主キーが親の主キーを満たしていなければスキップ
                boolean isPkMatch = true;
                for (int i = 0; i < oyaKeys.size(); i++) {
                    if (koKeys.size() <= i) {
                        isPkMatch = false;
                        break;
                    }
                    if (!koKeys.get(i).equals(oyaKeys.get(i))) {
                        isPkMatch = false;
                        break;
                    }
                }
                if (!isPkMatch) {
                    continue;
                }

                // 子の主キー数が「親の主キー数＋１」でなければスキップ
                if (koKeys.size() != oyaKeys.size() + 1) {
                    continue;
                }

                //最終キーが参照モデルならスキップ
                String koLastKey = koKeys.get(koKeys.size() - 1);
                if (ko.getColumns().get(koLastKey).getRefer() != null) {
                    continue;
                }

                //比較元の子モデルに比較先を追加
                childs.add(ko);

                //比較先の親モデルに比較元を追加
                ko.getParents().add(oya);

                //親が適用日なし、子が適用日ありで、兄弟に誤登録されている場合は除去
                ko.getYoungers().remove(oya);
                oya.getYoungers().remove(ko);
            }
        }
    }

    /**
     * ユニークキーテーブル（転生元）から、植え付け先（転生先）を探す
     * @param tables テーブル情報のリスト
     */
    private static void addRebornTable(final List<TableInfo> tables) {

        // 転生元としてループ
        Iterator<TableInfo> motos = tables.iterator();
        while (motos.hasNext()) {
            TableInfo moto = motos.next();

            // 履歴モデル か ビュー か 参照モデル なら転生元としない
            if (moto.isHistory() || moto.isView() || isReferModel(moto)) {
                continue;
            }

            // 何れかの転生先になっているか
            boolean isReborn = false;
            Iterator<TableInfo> rebornees = tables.iterator();
            while (rebornees.hasNext()) {
                TableInfo rebornee = rebornees.next();
                if (rebornee.getRebornTo() != null) {
                    if (moto.getName().equals(rebornee.getRebornTo().getName())) {
                        isReborn = true;
                        break;
                    }
                }
            }

            int rebornCount = 0;

            // 転生先として、テーブル情報をループ
            Iterator<TableInfo> sakis = tables.iterator();
            while (sakis.hasNext()) {
                TableInfo saki = sakis.next();

                // 比較先が、履歴モデルかビューならスキップ
                if (saki.isHistory() || saki.isView()) {
                    continue;
                }

                // 比較先の外部キーを取得
                Set<String> sakiFKs = new HashSet<String>();
                for (String motoPK : moto.getPrimaryKeys()) {
                    ColumnInfo motoKey = moto.getColumns().get(motoPK);

                    // 比較先のカラム情報でループして比較元の主キーがあれば参照テーブルリストに追加
                    for (ColumnInfo sakiCol : saki.getColumns().values()) {

                        // 比較先が主キーならスキップ
                        if (sakiCol.isPk()) {
                            continue;
                        }

                        // 転生元が何れの転生先でない場合は、比較先がNULL可ならスキップ
                        // 転生が連続するうち、必須でないタイミングが合っても、集約モデルと誤認させない
                        if (!isReborn && sakiCol.getNullable() == 1) {
                            continue;
                        }

                        // データ型が異なるならスキップ
                        if (!sakiCol.getTypeName().equals(motoKey.getTypeName())) {
                            continue;
                        }

                        // データサイズが異なるならスキップ
                        if (sakiCol.getColumnSize() != motoKey.getColumnSize()) {
                            continue;
                        }

                        // 小数桁数が異なるならスキップ
                        if (sakiCol.getDecimalDigits() != motoKey.getDecimalDigits()) {
                            continue;
                        }

                        // 比較先カラム名が比較元カラム名と合致するなら比較先を転生モデルに設定
                        if (sakiCol.getName().matches("(?i)^" + motoPK + "$")) {
                            sakiFKs.add(sakiCol.getName());
                        }
                    }
                }

                if (moto.getPrimaryKeys().size() == sakiFKs.size()) {
                    // 比較元の主キーと、比較先の外部キーの、数が一致する場合

                    LOG.debug("Reborn? " + moto.getName() + " to " + saki.getName() + " [" + sakiFKs + "]");

                    boolean isRebornElse = false;

                    // 処理済み情報
                    Iterator<TableInfo> others = tables.iterator();
                    while (others.hasNext()) {
                        TableInfo other = others.next();

                        // 転生先を設定済みでなければスキップ
                        if (other.getRebornTo() == null) {
                            continue;
                        }

                        // 転生先を設定済みでも、今回の転生先と重複していなければスキップ
                        if (!other.getRebornTo().getName().equals(saki.getName())) {
                            continue;
                        }

                        // 重複する転生先を設定済みの場合
                        if (other.getPrimaryKeys().size() < moto.getPrimaryKeys().size()) {

                            // 今回の転生元の方がキー数が多いなら、処理済みの転生先をクリア
                            TableInfo otherReborn = other.getRebornTo();
                            other.setRebornTo(null);
                            for (ColumnInfo column : otherReborn.getColumns().values()) {
                                column.setReborn(false);
                            }

                        } else if (other.getPrimaryKeys().size() > moto.getPrimaryKeys().size()) {
                            // 今回の転生元の方がキー数が少ないなら、転生先としない
                            isRebornElse = true;
                        }
                    }

                    // 今回の比較先が、他モデルの転生先でなければ、比較元の転生先に設定
                    if (!isRebornElse) {

                        // ２回以上ここに来る＝転生先が複数存在しうる＝転生モデルでなく派生モデルにする
                        if (rebornCount > 0) {
                            if (moto.getRebornTo() != null) {
                                TableInfo reborn = moto.getRebornTo(); // 転生先を派生先に追加
                                moto.setRebornTo(null);
                                moto.getDeriveTos().add(reborn);
                                for (String fk : sakiFKs) {
                                    reborn.getColumns().get(fk).setReborn(false);
                                    reborn.getColumns().get(fk).setDerive(true);
                                }
                            }
                            moto.getDeriveTos().add(saki);
                            for (String fk : sakiFKs) {
                                saki.getColumns().get(fk).setDerive(true);
                            }
                            continue;
                        }

                        ++rebornCount;
                        moto.setRebornTo(saki);
                        for (String fk : sakiFKs) {
                            saki.getColumns().get(fk).setReborn(true);
                        }
                    }
                }
            }
        }
    }

    /**
     * 集約先の主キーから、集約元の外部キーを探す
     * @param tables テーブル情報のリスト
     */
    private static void addSummaryTable(final List<TableInfo> tables) {

        // 集約先として、テーブル情報をループ
        Iterator<TableInfo> sakis = tables.iterator();
        while (sakis.hasNext()) {
            TableInfo saki = sakis.next();

            // 履歴モデル・ビュー・参照モデルは集約先としない
            if (saki.isHistory() || saki.isView() || isReferModel(saki)) {
                continue;
            }

            // 派生先を持っている（派生元である）なら集約先としない
            if (saki.getDeriveTos().size() > 0) {
                continue;
            }

            // 他モデルの転生先になっているなら集約先としない
            boolean isReborn = false;
            Iterator<TableInfo> rebornees = tables.iterator();
            while (rebornees.hasNext()) {
                TableInfo rebornee = rebornees.next();
                if (rebornee.getRebornTo() != null) {
                    if (saki.getName().equals(rebornee.getRebornTo().getName())) {
                        isReborn = true;
                        break;
                    }
                }
            }
            if (isReborn) {
                continue;
            }

            int motoCount = 0;

            // 集約元として、テーブル情報をループ
            Iterator<TableInfo> motos = tables.iterator();
            while (motos.hasNext()) {
                TableInfo moto = motos.next();

                // 履歴モデル・ビューは集約元にしない
                if (moto.isHistory() || moto.isView()) {
                    continue;
                }

                // 集約元の外部キーを探索
                Set<String> motoFKs = new HashSet<String>();
                for (String sakiPK : saki.getPrimaryKeys()) {
                    ColumnInfo sakiKey = saki.getColumns().get(sakiPK);

                    // 集約元に集約先の主キーに合致するカラムがあれば外部キーとして取得
                    for (ColumnInfo motoCol : moto.getColumns().values()) {

                        // 集約元が 主キー か NULL可でない ならスキップ
                        if (motoCol.isPk() || motoCol.getNullable() != 1) {
                            continue;
                        }

                        // データ型 か データサイズ が異なるならスキップ
                        if (!motoCol.getTypeName().equals(sakiKey.getTypeName())
                                || motoCol.getColumnSize() != sakiKey.getColumnSize()) {
                            continue;
                        }

                        // 小数桁数が異なるならスキップ
                        if (motoCol.getDecimalDigits() != sakiKey.getDecimalDigits()) {
                            continue;
                        }

                        // 比較先カラム名が比較元カラム名と合致するなら、比較先の外部キーリストに追加
                        if (motoCol.getName().matches("(?i)^" + sakiPK + "$")) {
                            motoFKs.add(motoCol.getName());
                        }
                    }
                }

                if (saki.getPrimaryKeys().size() == motoFKs.size()) {
                    // 集約先の主キーと、集約元の外部キーが一致する場合

                    // 集約元設定済み情報の精査
                    boolean isSummaryOfOther = false;
                    Iterator<TableInfo> saki2s = tables.iterator();
                    while (saki2s.hasNext()) {
                        TableInfo saki2 = saki2s.next();

                        // 集約元を設定済みでなく、既に抑制判定済みでなければスキップ
                        if (saki2.getSummaryOf() == null && !isSummaryOfOther) {
                            continue;
                        }

                        // 集約元を設定済みでも、今回の集約元と重複していなければスキップ
                        if (saki2.getSummaryOf() != null && !saki2.getSummaryOf().getName().equals(moto.getName())) {
                            continue;
                        }

                        // 重複する集約元を設定済みの場合

                        //                        if (saki2.getPrimaryKeys().size() < saki.getPrimaryKeys().size()) {
                        //                            // 今回の集約先の方がキー数が多いなら、処理済みの集約元をクリア
                        if (saki2.getSummaryOf() != null) {
                            for (ColumnInfo sakiCol : saki2.getSummaryOf().getColumns().values()) {
                                sakiCol.setSummary(false);
                            }
                        }
                        saki2.setSummaryOf(null);
                        //                        } else if (saki2.getPrimaryKeys().size() > saki.getPrimaryKeys().size()) {
                        //                            // 今回の集約先の方がキー数が少ないなら、今回を集約先としない
                        isSummaryOfOther = true;
                        //                        }
                    }

                    // 今回の集約元が、他モデルの集約元でなければ、集約先に集約元を設定
                    if (!isSummaryOfOther) {

                        // ２回以上ここに来る＝同じ集約元を他でも設定済み＝今回は集約先としない
                        if (motoCount > 0) {

                            //誤って集約元を設定済みならクリア
                            if (saki.getSummaryOf() != null) {
                                for (ColumnInfo column : saki.getSummaryOf().getColumns().values()) {
                                    column.setSummary(false);
                                }
                                saki.setSummaryOf(null);
                            }
                            continue;
                        }

                        ++motoCount;
                        for (String fk : motoFKs) {
                            moto.getColumns().get(fk).setSummary(true);
                        }
                        saki.setSummaryOf(moto);

                        // 集約先とする場合は、転生元としない（転生先をクリアする）
                        if (saki.getRebornTo() != null) {
                            TableInfo tenseisaki = saki.getRebornTo();
                            for (ColumnInfo column : tenseisaki.getColumns().values()) {
                                if (column.isReborn()) {
                                    column.setReborn(false);
                                }
                            }
                            saki.setRebornTo(null);
                        }
                    }
                }
            }
        }
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
                ColumnInfo primaryKey = table.getColumns().get(pk);
                if (primaryKey.getRefer() != null) {
                    String referName = primaryKey.getRefer().getName();
                    if (!done.contains(referName)) {
                        done.add(referName);
                        combos.add(primaryKey.getRefer());
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
                    ColumnInfo primaryKey = table.getColumns().get(pk);
                    TableInfo combo = primaryKey.getRefer();
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
     * @param tableInfos
     */
    private static void log(final List<TableInfo> tableInfos) {

        for (TableInfo table : tableInfos) {

            LOG.info("");
            LOG.info("■" + table.getName());

            if (table.getPrimaryKeys().size() > 0) {
                LOG.info("    PrimaryKeys: " + table.getPrimaryKeys());
            }

            if (table.getParents().size() > 0) {
                LOG.info("    ParentInfos:");
                for (TableInfo parent : table.getParents()) {
                    LOG.info("        " + parent.getName() + " " + parent.getPrimaryKeys());
                }
            }

            if (table.getYoungers().size() > 0) {
                LOG.info("    BrosInfos:");
                for (TableInfo bros : table.getYoungers()) {
                    LOG.info("        " + bros.getName() + " " + bros.getPrimaryKeys());
                }
            }

            if (table.getChilds().size() > 0) {
                LOG.info("    ChildInfos:");
                for (TableInfo child : table.getChilds()) {
                    LOG.info("        " + child.getName() + " " + child.getPrimaryKeys());
                }
            }

            if (table.getHistory() != null) {
                LOG.info("    HistoryInfo:");
                TableInfo history = table.getHistory();
                LOG.info("        " + history.getName() + " " + history.getPrimaryKeys());
            }

            Map<String, TableInfo> refers = new LinkedHashMap<String, TableInfo>();
            for (ColumnInfo column : table.getColumns().values()) {
                if (column.getRefer() != null) {
                    refers.put(column.getName(), column.getRefer());
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

            if (table.getDeriveTos().size() > 1) {
                LOG.info("    DeriveTos:");
                for (TableInfo derive : table.getDeriveTos()) {
                    LOG.info("        " + derive.getName() + " " + derive.getPrimaryKeys());
                }
            }

            if (table.getRebornTo() != null) {
                LOG.info("    RebornTo:");
                TableInfo reborn = table.getRebornTo();
                LOG.info("        " + reborn.getName() + " " + reborn.getPrimaryKeys());
            }

            if (table.getSummaryOf() != null) {
                LOG.info("    SummaryOf:");
                TableInfo summary = table.getSummaryOf();
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
                    for (String k : table.getColumns().keySet()) {
                        if (k.matches("(?i)^" + referMei + "$")) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
