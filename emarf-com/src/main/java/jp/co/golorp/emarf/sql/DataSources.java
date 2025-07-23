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
    private static String fosterRe;

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
            DataSources.get();
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

        fosterRe = bundle.getString("relation.foster.re");

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

            // コネクションからデータベースのメタ情報を取得
            Connection cn = Connections.get();
            DatabaseMetaData metaData = cn.getMetaData();

            // テーブル情報を取得
            String schemaPattern = BUNDLE.getString("username");
            DataSources.addTables(metaData, schemaPattern, tables);

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
                    String columnName = columns.getString("COLUMN_NAME").toUpperCase();
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

        //履歴モデルの評価
        addHistoryTable(tables);
        //兄弟モデルの評価
        addBrotherTable(tables);
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

        LOG.debug("【Brother】");

        // 兄モデルとしてループ
        Iterator<TableInfo> elders = tables.iterator();
        while (elders.hasNext()) {
            TableInfo elder = elders.next();

            // 比較元に主キーがなければスキップ
            if (elder.getPrimaryKeys().size() == 0) {
                continue;
            }

            // 末っ子モデルならスキップ
            if (elder.getName().matches(youngestRe)) {
                continue;
            }

            // 孤児モデルならスキップ
            if (elder.getName().matches(fosterRe)) {
                continue;
            }

            // 弟モデルとしてループ
            Iterator<TableInfo> youngers = tables.iterator();
            while (youngers.hasNext()) {
                TableInfo younger = youngers.next();

                // 同じテーブルならスキップ
                if (elder == younger) {
                    continue;
                }

                // 長兄モデルならスキップ
                if (younger.getName().matches(eldestRe)) {
                    continue;
                }

                // 養子モデルならスキップ
                if (younger.getName().matches(fosterRe)) {
                    continue;
                }

                // 兄に履歴モデルがないのに弟に履歴モデルがある場合はスキップ
                if (elder.getHistory() == null && younger.getHistory() != null) {
                    continue;
                }

                // 兄弟の主キーに適用日が含まれる場合は評価から除外（不要かも）
                List<String> eldKeys = new ArrayList<String>(elder.getPrimaryKeys());
                List<String> yngKeys = new ArrayList<String>(younger.getPrimaryKeys());
                boolean isTekiyoBiEld = eldKeys.contains(tekiyoBi);
                boolean isTekiyoBiYng = yngKeys.contains(tekiyoBi);
                if (isTekiyoBiEld && isTekiyoBiYng) {
                    eldKeys.remove(tekiyoBi);
                    yngKeys.remove(tekiyoBi);
                }

                // 主キーが合致しなければスキップ
                String eldKeyCsv = eldKeys.toString().replaceAll("[\\[\\]]", "");
                String yngKeyCsv = yngKeys.toString().replaceAll("[\\[\\]]", "");
                if (!eldKeyCsv.equals(yngKeyCsv)) {
                    continue;
                }

                // 兄に弟を追加、弟に弟フラグを設定
                LOG.debug("    " + elder.getName() + " and " + younger.getName());
                elder.getBrothers().add(younger);
                younger.setIsBrother(true);
            }
        }
    }

    /**
     * 各テーブル情報に履歴モデルを設定
     * @param tables テーブル情報のリスト
     */
    private static void addHistoryTable(final List<TableInfo> tables) {

        LOG.debug("【History】");

        // 履歴元としてループ
        Iterator<TableInfo> srcs = tables.iterator();
        while (srcs.hasNext()) {
            TableInfo src = srcs.next();

            //主キーがなければスキップ
            if (src.getPrimaryKeys().size() == 0) {
                continue;
            }

            String srcKeyCsv = src.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
            String srcColCsv = src.getNonPrimaryKeys().toString().replaceAll("[\\[\\]]", "");

            // 比較先でループ
            Iterator<TableInfo> hiss = tables.iterator();
            while (hiss.hasNext()) {
                TableInfo his = hiss.next();

                // 比較元と比較先が同じならスキップ
                if (src == his) {
                    continue;
                }

                // 変更理由列は比較対象から除外
                List<String> hisNonPrimaryKeys = new ArrayList<String>(his.getNonPrimaryKeys());
                if (!StringUtil.isNullOrBlank(reason) && (hisNonPrimaryKeys.contains(reason.toLowerCase())
                        || hisNonPrimaryKeys.contains(reason.toUpperCase()))) {
                    hisNonPrimaryKeys.remove(reason.toLowerCase());
                    hisNonPrimaryKeys.remove(reason.toUpperCase());
                }

                String hisKeyCsv = his.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                String hisColCsv = hisNonPrimaryKeys.toString().replaceAll("[\\[\\]]", "");

                // キーが合致するならスキップ
                if (srcKeyCsv.equals(hisKeyCsv)) {
                    continue;
                }

                // キー以外が合致しなければスキップ
                if (!srcColCsv.equals(hisColCsv)) {
                    continue;
                }

                // 比較先が比較元の主キーと同じ組み合わせでスタートしなければスキップ
                if (!hisKeyCsv.startsWith(srcKeyCsv)) {
                    continue;
                }

                // 比較先が比較元の主キー＋１キーでなければスキップ
                if (his.getPrimaryKeys().size() != src.getPrimaryKeys().size() + 1) {
                    continue;
                }

                // 比較先の最終キーが採番キーでないか文字列ならスキップ
                String hisLastKey = his.getPrimaryKeys().get(his.getPrimaryKeys().size() - 1);
                ColumnInfo hisLastPK = his.getColumns().get(hisLastKey);
                if (!hisLastPK.isNumbering() || hisLastPK.getTypeName().equals("CHAR")) {
                    continue;
                }

                // 比較先が比較元に前方一致しないならスキップ
                if (!his.getName().matches("(?i)^" + src.getName() + ".+$")) {
                    continue;
                }

                LOG.debug("    " + src.getName() + " to " + his.getName());
                his.setHistory(true);
                src.setHistoryInfo(his);
            }
        }
    }

    /**
     * マスタテーブル（参照先）から、植え付け先（参照元）を探す
     * @param tables テーブル情報のリスト
     */
    private static void addReferTable(final List<TableInfo> tables) {

        LOG.debug("【Refer】");

        // 参照先マスタとしてループ
        Iterator<TableInfo> msts = tables.iterator();
        while (msts.hasNext()) {
            TableInfo mst = msts.next();

            // 適用日が主キーに含まれる場合は除去
            List<String> mstKeys = new ArrayList<String>(mst.getPrimaryKeys());
            mstKeys.remove(tekiyoBi);

            // 適用日を除く、キーがなければスキップ
            if (mstKeys.size() == 0) {
                continue;
            }

            // 履歴モデル ならスキップ
            if (mst.isHistory()) {
                continue;
            }

            // 同じキーの参照モデルが複数存在する
            if (mst.getBrothers().size() > 0) {
                boolean isReferYng = false;
                for (TableInfo yng : mst.getBrothers()) {
                    if (isRefer(yng)) {
                        isReferYng = true;
                        break;
                    }
                }
                if (isReferYng) {
                    continue;
                }
            }

            // どの参照ペアにもヒットしなければスキップ
            if (!isRefer(mst)) {
                continue;
            }

            // 参照先マスタのユニークキー情報
            String lastKey = null;
            lastKey = mstKeys.get(mstKeys.size() - 1);
            ColumnInfo mstPK = mst.getColumns().get(lastKey);

            // 参照元トランとしてループ
            Iterator<TableInfo> trns = tables.iterator();
            while (trns.hasNext()) {
                TableInfo trn = trns.next();

                // 適用日が主キーに含まれる場合は除去
                List<String> trnKeys = new ArrayList<String>(trn.getPrimaryKeys());
                trnKeys.remove(tekiyoBi);

                // 参照元トランのカラム情報でループ（比較元のユニークキーがあれば参照テーブルリストに追加）
                for (Entry<String, ColumnInfo> e : trn.getColumns().entrySet()) {
                    String colName = e.getKey();
                    ColumnInfo col = e.getValue();

                    // 参照テーブル自体の主キー自体ならスキップ（親ID参照もあるため）
                    if (trn == mst && col == mstPK) {
                        continue;
                    }

                    // 参照元カラム名の末尾が参照先カラム名と合致し、参照モデルが未登録なら、カラムに参照モデルを設定
                    if (colName.matches("(?i)^.*" + lastKey + "$") && col.getRefer() == null) {

                        LOG.debug("    " + mst.getName() + " from " + trn.getName() + "." + col.getName());
                        col.setRefer(mst);
                        mst.setRefer(true);

                        // 参照元の複合キーの最終キーなら、参照サブ画面で選択するため採番フラグをオフ
                        if (trnKeys.size() > 1 && colName.equals(trnKeys.get(trnKeys.size() - 1))) {
                            col.setNumbering(false);
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
    public static boolean isRefer(final TableInfo table) {

        List<String> mstKeys = table.getPrimaryKeys();

        for (String[] referPair : referPairs) {
            String[] keySufs = referPair[0].split("&");

            // マスタキーが一つでも合致しなければ次の参照ペアに移動
            boolean isReferKeys = true;
            String lastKeySuf = null;
            for (String mstKey : mstKeys) {
                if (!StringUtil.endsWith(keySufs, mstKey)) {
                    isReferKeys = false;
                    break;
                }
            }
            if (!isReferKeys) {
                continue;
            }

            // この参照ペアにマスタキーが全て一致した

            String lastKey = mstKeys.get(mstKeys.size() - 1);
            lastKeySuf = keySufs[keySufs.length - 1];
            if (lastKey.matches("(?i).*" + lastKeySuf + "$")) {

                // 参照値があるか
                String referMei = lastKey.replaceAll("(?i)" + lastKeySuf + "$", referPair[1]);
                for (String colName : table.getColumns().keySet()) {
                    if (colName.matches("(?i)^" + referMei + "$")) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * 各テーブル情報に子モデルを設定
     * @param tables テーブル情報のリスト
     */
    private static void addChildTables(final List<TableInfo> tables) {

        LOG.debug("【Childs】");

        // 親モデルとしてループ
        Iterator<TableInfo> oyas = tables.iterator();
        while (oyas.hasNext()) {
            TableInfo oya = oyas.next();

            // 子を設定しないならスキップ
            if (oya.getName().matches(dinksRe)) {
                continue;
            }

            // 主キーに適用日があれば評価から除外
            List<String> oyaKeys = new ArrayList<String>(oya.getPrimaryKeys());
            boolean isOyaTekiyoBi = oyaKeys.contains(tekiyoBi);
            if (isOyaTekiyoBi) {
                oyaKeys.remove(tekiyoBi);
            }

            // 主キーがなければスキップ
            if (oyaKeys.size() == 0) {
                continue;
            }

            // テーブル情報でループ（比較先）
            Iterator<TableInfo> kos = tables.iterator();
            while (kos.hasNext()) {
                TableInfo ko = kos.next();

                // 比較元と同じならスキップ
                if (oya == ko) {
                    continue;
                }

                // 親を設定しないならスキップ
                if (ko.getName().matches(orphansRe)) {
                    continue;
                }

                // 履歴テーブルならスキップ
                if (ko.isHistory()) {
                    continue;
                }

                // 親に履歴モデルがないのに子に履歴モデルがある場合はスキップ
                if (oya.getHistory() == null && ko.getHistory() != null) {
                    continue;
                }

                //                // 親が参照モデルで子がトラン、およびその逆ならスキップ
                //                if ((oya.isRefer() && !ko.isRefer()) || (!oya.isRefer() && ko.isRefer())) {
                //                    continue;
                //                }

                // 親が参照モデルなら子のテーブル名が後方一致しなければスキップ
                // （単独キーだとトラン系に影響する）
                if (oya.isRefer() && !ko.getName().startsWith(oya.getName())) {
                    continue;
                }

                // 親にも主キーに適用日があれば評価から除外
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

                String oyaKeyCsv = oyaKeys.toString().replaceAll("[\\[\\]]", "");
                String koKeyCsv = koKeys.toString().replaceAll("[\\[\\]]", "");

                // 子の主キーが親の主キーを満たさなければスキップ
                if (!koKeyCsv.startsWith(oyaKeyCsv)) {
                    continue;
                }

                // 子の主キー数が「親の主キー数＋１」でなければスキップ
                if (koKeys.size() != oyaKeys.size() + 1) {
                    continue;
                }

                //                // 最終キーが参照モデルならスキップ
                //                String koLastKey = koKeys.get(koKeys.size() - 1);
                //                if (ko.getColumns().get(koLastKey).getRefer() != null) {
                //                    continue;
                //                }

                // 設定済みの親モデルに子モデル名が後方一致するならスキップ
                if (ko.getParents().size() == 1) {
                    TableInfo orgParent = ko.getParents().get(0);
                    if (ko.getName().startsWith(orgParent.getName())) {
                        continue;
                    }
                }

                // 親モデルの子リストに追加
                oya.getChilds().add(ko);

                // 子モデルの親リストに追加
                ko.getParents().add(oya);

                // 親子設定した場合、兄弟モデルを消し込み（親が適用日なし、子が適用日ありで、誤登録されている可能性があるため）
                LOG.debug("    " + oya.getName() + " has " + ko.getName());
                oya.getBrothers().remove(ko);
                ko.getBrothers().remove(oya);
            }
        }
    }

    /**
     * 転生元から、転生先を探す
     * @param tables テーブル情報のリスト
     */
    private static void addRebornTable(final List<TableInfo> tables) {

        LOG.debug("【Reborn】");

        // 転生元・派生元としてループ
        Iterator<TableInfo> srcs = tables.iterator();
        while (srcs.hasNext()) {
            TableInfo src = srcs.next();

            // 履歴モデル・参照モデル・兄弟モデル・ビュー は転生しない
            if (src.isHistory() || src.isRefer() || src.isBrother() || src.isView()) {
                continue;
            }

            // 親が参照モデルでも転生しない
            boolean isParentRefer = false;
            for (TableInfo parent : src.getParents()) {
                if (parent.isRefer()) {
                    isParentRefer = true;
                    break;
                }
            }
            if (isParentRefer) {
                continue;
            }

            // このテーブル自体が、既に何れかの転生先になっているか
            boolean isThisSrcRebornTo = false;
            Iterator<TableInfo> pres = tables.iterator();
            while (pres.hasNext()) {
                TableInfo pre = pres.next();
                if (pre.getRebornTo() != null) {
                    TableInfo rbn = pre.getRebornTo();
                    if (src.getName().equals(rbn.getName())) {
                        isThisSrcRebornTo = true;
                        break;
                    }
                    // 親が転生先かどうかも考慮する（受注明細→売上実績のパターン）
                    for (TableInfo parent : src.getParents()) {
                        if (parent.getName().equals(rbn.getName())) {
                            isThisSrcRebornTo = true;
                            break;
                        }
                    }
                }
            }

            int rebornCount = 0;

            // 転生先として、テーブル情報をループ
            Iterator<TableInfo> rbns = tables.iterator();
            while (rbns.hasNext()) {
                TableInfo rbn = rbns.next();

                // 履歴モデル・参照モデル・ビュー は転生先にしない
                if (rbn.isHistory() || rbn.isRefer() || rbn.isView()) {
                    continue;
                }

                // 転生先の外部キーを取得
                Set<String> rbnFKs = new HashSet<String>();
                for (String srcPrimaryKey : src.getPrimaryKeys()) {
                    ColumnInfo srcKey = src.getColumns().get(srcPrimaryKey);

                    // 転生先のカラム情報でループして転生元の主キーがあれば参照テーブルリストに追加
                    for (ColumnInfo rbnCol : rbn.getColumns().values()) {

                        if (rbnCol.isPk()) {
                            continue; // 主キーならスキップ
                        }

                        // 転生元が他のテーブルの転生先でない場合は、外部キーがNULL可ならスキップ
                        // （＝転生元が既に他のテーブルの転生先となっている場合は、外部キーがNULL可でも許可する）
                        // （見積→注文のパターン。注文からでもスタートできるよう。）
                        if (!isThisSrcRebornTo && rbnCol.getNullable() == 1) {
                            continue;
                        }

                        if (isMatchColDef(srcKey, rbnCol)) {
                            rbnFKs.add(rbnCol.getName());
                        }
                    }
                }

                // 転生元の主キーと、転生先外部キーの、数が一致する場合
                if (src.getPrimaryKeys().size() == rbnFKs.size()) {

                    boolean isDestRebornElse = isRebornElse(tables, src, rbn);

                    // 今回の比較先が、他モデルの転生先でなければ、比較元の転生先に設定
                    if (!isDestRebornElse) {

                        // ２回以上ここに来る＝転生先が複数存在しうる＝転生モデルでなく派生モデルにする
                        if (rebornCount > 0) {
                            if (src.getRebornTo() != null) {
                                TableInfo rebornTo = src.getRebornTo(); // 転生先を派生先に追加
                                LOG.debug("        Cancel to " + rebornTo.getName());
                                src.setRebornTo(null);
                                for (String primaryKey : src.getPrimaryKeys()) {
                                    rebornTo.getColumns().get(primaryKey).setReborn(false);
                                }
                                rebornTo.getRebornFroms().remove(src);
                                LOG.debug("        Derive to " + rebornTo.getName());
                                src.getDeriveTos().add(rebornTo);
                                for (String primaryKey : src.getPrimaryKeys()) {
                                    rebornTo.getColumns().get(primaryKey).setDeriveFrom(src);
                                }
                            }
                            LOG.debug("        Derive to " + rbn.getName() + " " + rbnFKs);
                            src.getDeriveTos().add(rbn);
                            for (String fk : rbnFKs) {
                                rbn.getColumns().get(fk).setDeriveFrom(src);
                            }
                            continue;
                        }

                        LOG.debug("    " + src.getName() + " to " + rbn.getName() + " " + rbnFKs);
                        ++rebornCount;
                        src.setRebornTo(rbn);
                        for (String fk : rbnFKs) {
                            rbn.getColumns().get(fk).setReborn(true);
                        }
                        rbn.getRebornFroms().add(src);
                    }
                }
            }
        }
    }

    /**
     * src以外の転生先か派生先になっているか評価
     * @param tables
     * @param src 転生元
     * @param rbn 転生先
     * @return boolean
     */
    public static boolean isRebornElse(final List<TableInfo> tables, final TableInfo src, final TableInfo rbn) {

        // 主キー合致数の多い転生元が他に存在するか
        boolean isRebornElse = false;

        // 他のテーブルと転生先が重複する場合、合致キー数が多いほうを転生元とする
        Iterator<TableInfo> rebornees = tables.iterator();
        while (rebornees.hasNext()) {
            TableInfo rebornee = rebornees.next();

            if (rebornee == src) {
                continue;
            }

            // 転生先を設定済みでなければスキップ
            if (rebornee.getRebornTo() == null) {
                continue;
            }

            // 転生先を設定済みでも、今回の転生先と重複していなければスキップ
            if (!rebornee.getRebornTo().getName().equals(rbn.getName())) {
                continue;
            }

            if (rebornee.getPrimaryKeys().size() < src.getPrimaryKeys().size()) {

                // 今回の転生元の方がキー数が多いなら、処理済みの転生先をクリア
                LOG.debug("        Cancel " + rebornee.getName() + " reborn to " + rebornee.getRebornTo().getName()
                        + " by " + src.getName());
                TableInfo reborneeReborn = rebornee.getRebornTo();
                rebornee.setRebornTo(null);
                for (String primaryKey : rebornee.getPrimaryKeys()) {
                    reborneeReborn.getColumns().get(primaryKey).setReborn(false);
                }
                reborneeReborn.getRebornFroms().remove(rebornee);

            } else if (rebornee.getPrimaryKeys().size() > src.getPrimaryKeys().size()) {

                // 今回の転生元の方がキー数が少ないなら、転生先としない
                isRebornElse = true;
            }
        }

        // 他のテーブルと派生先が重複する場合、合致キー数が多いほうを派生元とする
        Iterator<TableInfo> derivees = tables.iterator();
        while (derivees.hasNext()) {
            TableInfo derivee = derivees.next();

            if (derivee == src) {
                continue;
            }

            // 派生先を設定済みでなければスキップ
            if (derivee.getDeriveTos() == null || derivee.getDeriveTos().size() == 0) {
                continue;
            }

            List<TableInfo> newDeriveTos = new ArrayList<TableInfo>();
            for (TableInfo deriveTo : derivee.getDeriveTos()) {

                newDeriveTos.add(deriveTo);

                // 派生先を設定済みでも、今回の転生先と重複していなければスキップ
                if (!deriveTo.getName().equals(rbn.getName())) {
                    continue;
                }

                if (derivee.getPrimaryKeys().size() < src.getPrimaryKeys().size()) {

                    // 今回の転生元の方がキー数が多いなら、処理済みの転生先をクリア
                    LOG.debug("        Cancel " + derivee.getName() + " derive to " + deriveTo.getName() + " by "
                            + src.getName());
                    //derivee.getDeriveTos().remove(deriveTo);
                    newDeriveTos.remove(deriveTo);
                    for (String primaryKey : derivee.getPrimaryKeys()) {
                        deriveTo.getColumns().get(primaryKey).setDeriveFrom(null);
                    }

                } else if (derivee.getPrimaryKeys().size() > src.getPrimaryKeys().size()) {

                    // 今回の転生元の方がキー数が少ないなら、転生先としない
                    isRebornElse = true;

                } else {

                    // キー数が一致しても、転生先としない
                    isRebornElse = true;
                }
            }
            derivee.setDeriveTos(newDeriveTos);

            if (isRebornElse) {
                break;
            }
        }

        return isRebornElse;
    }

    /**
     * @param src
     * @param dest
     * @return boolean
     */
    public static boolean isMatchColDef(final ColumnInfo src, final ColumnInfo dest) {

        // データ型が異なる
        if (!src.getTypeName().equals(dest.getTypeName())) {
            return false;
        }

        // データサイズが異なる
        if (src.getColumnSize() != dest.getColumnSize()) {
            return false;
        }

        // 小数桁数が異なる
        if (src.getDecimalDigits() != dest.getDecimalDigits()) {
            return false;
        }

        // 比較先カラム名が比較元カラム名と合致しない
        if (!dest.getName().matches("(?i)^" + src.getName() + "$")) {
            return false;
        }

        return true;
    }

    /**
     * 集約先の主キーから、集約元の外部キーを探す
     * @param tables テーブル情報のリスト
     */
    private static void addSummaryTable(final List<TableInfo> tables) {

        LOG.debug("【Summary】");

        // 集約先として、テーブル情報をループ
        Iterator<TableInfo> sums = tables.iterator();
        while (sums.hasNext()) {
            TableInfo sum = sums.next();

            // 履歴モデル・ビュー・参照モデルは集約先としない
            if (sum.isHistory() || sum.isView() || sum.isRefer()) {
                continue;
            }

            // 派生先を持っている（派生元である）なら集約先としない
            if (sum.getDeriveTos().size() > 0) {
                continue;
            }

            // 他モデルの転生先になっているなら集約先としない
            boolean isReborn = false;
            Iterator<TableInfo> rebornees = tables.iterator();
            while (rebornees.hasNext()) {
                TableInfo rebornee = rebornees.next();
                if (rebornee.getRebornTo() != null) {
                    if (sum.getName().equals(rebornee.getRebornTo().getName())) {
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
                for (String sakiPK : sum.getPrimaryKeys()) {
                    ColumnInfo sakiKey = sum.getColumns().get(sakiPK);

                    // 集約元に集約先の主キーに合致するカラムがあれば外部キーとして取得
                    for (ColumnInfo motoCol : moto.getColumns().values()) {

                        // 集約元が 主キー か NULL可でない ならスキップ
                        if (motoCol.isPk() || motoCol.getNullable() != 1) {
                            continue;
                        }

                        if (isMatchColDef(sakiKey, motoCol)) {
                            motoFKs.add(motoCol.getName());
                        }
                    }
                }

                if (sum.getPrimaryKeys().size() == motoFKs.size()) {
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
                            LOG.debug("        Cancel " + saki2.getName() + " of " + saki2.getSummaryOf().getName()
                                    + " by " + sum.getName());
                            for (ColumnInfo sakiCol : saki2.getSummaryOf().getColumns().values()) {
                                sakiCol.setSummary(false);
                            }
                            saki2.setSummaryOf(null);
                        }
                        //                        } else if (saki2.getPrimaryKeys().size() > saki.getPrimaryKeys().size()) {
                        //                            // 今回の集約先の方がキー数が少ないなら、今回を集約先としない
                        isSummaryOfOther = true;
                        //                        }
                    }

                    // 今回の集約元が、他モデルの集約元でなければ、集約先に集約元を設定
                    if (!isSummaryOfOther) {

                        // ２回以上ここに来る＝同じ集約元を他でも設定済み＝今回は集約先としない
                        if (motoCount > 0) {

                            // 誤って集約元を設定済みならクリア
                            if (sum.getSummaryOf() != null) {
                                TableInfo unit = sum.getSummaryOf();
                                for (ColumnInfo column : unit.getColumns().values()) {
                                    column.setSummary(false);
                                }
                                LOG.debug("        Cancel " + sum.getName() + " summary of " + unit.getName() + " by "
                                        + moto.getName());
                                sum.setSummaryOf(null);
                            }
                            continue;
                        }

                        LOG.debug("    " + sum.getName() + " of " + moto.getName());
                        ++motoCount;
                        for (String fk : motoFKs) {
                            moto.getColumns().get(fk).setSummary(true);
                        }
                        sum.setSummaryOf(moto);

                        //                        // 集約先とする場合は、転生元としない（転生先をクリアする）
                        //                        if (sum.getRebornTo() != null) {
                        //                            TableInfo tenseisaki = sum.getRebornTo();
                        //                            for (ColumnInfo column : tenseisaki.getColumns().values()) {
                        //                                if (column.isReborn()) {
                        //                                    column.setReborn(false);
                        //                                }
                        //                            }
                        //                            LOG.debug("        Cancel " + sum.getName() + " reborn to " + sum.getRebornTo().getName());
                        //                            sum.setRebornTo(null);
                        //                        }
                    }
                }
            }
        }
    }

    /**
     * @param tables
     */
    private static void addCombo(final List<TableInfo> tables) {

        LOG.debug("【Combo】");

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
                    LOG.debug("    " + table.getName() + " : " + combo.getName());
                    table.getComboInfos().add(combo);
                }
            }

            //組合せモデル数が２の場合
            if (table.getComboInfos().size() == 2) {

                // 自テーブルの主キーが各単一キーと適用日のみで、
                // 各テーブルの主キーが自テーブルの第二キー以降の場合は、
                // 各テーブルに制約モデルを設定
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
                    if (table.getStintInfo() != null) {
                        LOG.debug("        Cancel " + table.getName() + " : " + combo.getName());
                        table.setStintInfo(null);
                        break;
                    }
                    LOG.debug("        Stint " + table.getName() + " : " + combo.getName());
                    table.setStintInfo(combo);
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

            String tablelog = "■" + table.getName();
            if (table.getPrimaryKeys().size() > 0) {
                tablelog += " : " + table.getPrimaryKeys();
            }
            LOG.info(tablelog);

            if (table.getParents().size() > 0) {
                LOG.info("    ParentInfos:");
                for (TableInfo parent : table.getParents()) {
                    LOG.info("        " + parent.getName() + " " + parent.getPrimaryKeys());
                }
            }

            if (table.getBrothers().size() > 0) {
                LOG.info("    BrosInfos:");
                for (TableInfo bros : table.getBrothers()) {
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

            if (table.getRebornTo() != null) {
                LOG.info("    RebornTo:");
                TableInfo reborn = table.getRebornTo();
                LOG.info("        " + reborn.getName() + " " + reborn.getPrimaryKeys());
            }

            if (table.getRebornFroms().size() > 1) {
                LOG.info("    RebornFroms:");
                for (TableInfo rebornFrom : table.getRebornFroms()) {
                    LOG.info("        " + rebornFrom.getName() + " " + rebornFrom.getPrimaryKeys());
                }
            }

            if (table.getDeriveTos().size() > 1) {
                LOG.info("    DeriveTos:");
                for (TableInfo derive : table.getDeriveTos()) {
                    LOG.info("        " + derive.getName() + " " + derive.getPrimaryKeys());
                }
            }

            Map<String, TableInfo> derivees = new LinkedHashMap<String, TableInfo>();
            for (ColumnInfo column : table.getColumns().values()) {
                if (column.getDeriveFrom() != null) {
                    derivees.put(column.getName(), column.getDeriveFrom());
                }
            }
            if (derivees.size() > 0) {
                LOG.info("    DeriveFroms:");
                for (Entry<String, TableInfo> e : derivees.entrySet()) {
                    String columnName = e.getKey();
                    TableInfo derivee = e.getValue();
                    LOG.info("        " + columnName + " = " + derivee.getName() + " " + derivee.getPrimaryKeys());
                }
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
}
