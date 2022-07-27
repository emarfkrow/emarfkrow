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

    /** テーブルを評価しないテーブル名 */
    private static String[] ignores;

    /** 他のテーブルの兄弟テーブルにしないテーブル名 */
    private static String[] eldests;

    /** 弟テーブルを設定しないテーブル名 */
    private static String[] onlychilds;

    /** 子モデルに設定しないテーブル名 */
    private static String[] foundlings;

    /** 列評価をスキップする列名 */
    private static String skipcolumn;

    /** 固定長列で自動採番のサフィックス */
    private static String[] charNumberingSuffixs;

    /** DataSourceのJNDI名 */
    private static final String JNDI_NAME = "JNDIName";

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

        String[] pairs = bundle.getString("BeanGenerator.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }

        ignores = bundle.getString("BeanGenerator.ignores").split(",");
        eldests = bundle.getString("BeanGenerator.eldests").split(",");
        onlychilds = bundle.getString("BeanGenerator.onlychilds").split(",");
        foundlings = bundle.getString("BeanGenerator.foundlings").split(",");
        skipcolumn = bundle.getString("BeanGenerator.skipcolumn");
        charNumberingSuffixs = bundle.getString("BeanGenerator.char.numbering.suffixs").split(",");

        // テーブル情報の取得
        List<TableInfo> tableInfos = new ArrayList<TableInfo>();

        // データベースからテーブル情報を取得してループ
        try {

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
                ResultSet columns = metaData.getColumns(null, null, tableInfo.getTableName(), null);

                while (columns.next()) {

                    //                    LOG.debug("TABLE_CAT: " + columns.getString("TABLE_CAT"));
                    //                    LOG.debug("TABLE_SCHEM: " + columns.getString("TABLE_SCHEM"));
                    //                    LOG.debug("TABLE_NAME: " + columns.getString("TABLE_NAME"));
                    //                    LOG.debug("COLUMN_NAME: " + columns.getString("COLUMN_NAME"));
                    //                    LOG.debug("DATA_TYPE: " + String.valueOf(columns.getInt("DATA_TYPE")));
                    //                    LOG.debug("TYPE_NAME: " + columns.getString("TYPE_NAME"));
                    //                    LOG.debug("COLUMN_SIZE: " + String.valueOf(columns.getInt("COLUMN_SIZE")));
                    //                    LOG.debug("DECIMAL_DIGITS: " + String.valueOf(columns.getInt("DECIMAL_DIGITS")));
                    //                    LOG.debug("NUM_PREC_RADIX: " + String.valueOf(columns.getInt("NUM_PREC_RADIX")));
                    //                    LOG.debug("NULLABLE: " + String.valueOf(columns.getInt("NULLABLE")));
                    //                    LOG.debug("REMARKS: " + columns.getString("REMARKS"));
                    //                    LOG.debug("COLUMN_DEF: " + columns.getString("COLUMN_DEF"));
                    //                    LOG.debug("CHAR_OCTET_LENGTH: " + String.valueOf(columns.getInt("CHAR_OCTET_LENGTH")));
                    //                    LOG.debug("ORDINAL_POSITION: " + String.valueOf(columns.getInt("ORDINAL_POSITION")));
                    //                    LOG.debug("IS_NULLABLE: " + columns.getString("IS_NULLABLE"));
                    //                    LOG.debug("SCOPE_CATALOG: " + columns.getString("SCOPE_CATALOG"));
                    //                    LOG.debug("SCOPE_SCHEMA: " + columns.getString("SCOPE_SCHEMA"));
                    //                    LOG.debug("SCOPE_TABLE: " + columns.getString("SCOPE_TABLE"));
                    //                    LOG.debug("SOURCE_DATA_TYPE: " + String.valueOf(columns.getShort("SOURCE_DATA_TYPE")));
                    //                    LOG.debug("IS_AUTOINCREMENT: " + columns.getString("IS_AUTOINCREMENT"));

                    // カラム名が合致しなければスキップ
                    String columnName = columns.getString("COLUMN_NAME");
                    if (columnName.matches(skipcolumn) || !columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
                        continue;
                    }

                    // カラム情報を追加
                    ColumnInfo columnInfo = new ColumnInfo();
                    tableInfo.getColumnInfos().put(columnName, columnInfo);

                    // カラム物理名
                    columnInfo.setColumnName(columnName);

                    // DBデータ型
                    columnInfo.setTypeName(columns.getString("TYPE_NAME"));

                    // カラムサイズ
                    columnInfo.setColumnSize(columns.getInt("COLUMN_SIZE"));

                    // 小数桁数
                    columnInfo.setDecimalDigits(columns.getInt("DECIMAL_DIGITS"));

                    // NULL可否
                    columnInfo.setNullable(columns.getInt("NULLABLE"));

                    // カラム論理名
                    String remarks = columns.getString("REMARKS");
                    if (remarks == null || remarks.length() == 0) {
                        remarks = assist.getColumnComment(tableInfo.getTableName(), columnName);
                    }
                    if (remarks == null || remarks.length() == 0) {
                        remarks = columnName;
                    }
                    columnInfo.setRemarks(remarks);

                    /*
                     * 拡張情報
                     */

                    // 主キー
                    if (tableInfo.getPrimaryKeys().contains(columnName)) {
                        columnInfo.setPk(true);
                    } else {
                        if (tableInfo.getUniqueIndexColumns().contains(columnName)) {
                            columnInfo.setUnique(true);
                        }
                        tableInfo.getNonPrimaryKeys().add(columnName);
                    }

                    // typeNameをjavaデータ型に変換
                    String typeName = columns.getString("TYPE_NAME").toUpperCase();
                    String dataType = getDataType(typeName, columnInfo);
                    columnInfo.setDataType(dataType);
                }

                columns.close();
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

        return tableInfos;
    }

    /**
     * テーブル情報に主キー名のリストを設定
     * @param metaData メタデータ
     * @param tableInfo テーブル情報
     * @throws SQLException
     */
    private static void addPrimaryKeys(final DatabaseMetaData metaData, final TableInfo tableInfo) throws SQLException {

        List<String> primaryKeys = new ArrayList<String>();

        ResultSet rs = metaData.getPrimaryKeys(null, null, tableInfo.getTableName());

        while (rs.next()) {

            String columnName = rs.getString("COLUMN_NAME");

            if (columnName.matches(skipcolumn) || !columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
                continue;
            }

            short keySeq = rs.getShort("KEY_SEQ");

            while (primaryKeys.size() <= keySeq) {
                primaryKeys.add("");
            }

            primaryKeys.set(keySeq, columnName);
        }

        rs.close();

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

            //            ResultSet rs2 = metaData.getIndexInfo(null, null, tableInfo.getTableName(), true, false);
            //
            //            while (rs2.next()) {
            //
            //                LOG.debug("■INDEX_NAME: " + rs2.getString("INDEX_NAME"));
            //
            //                LOG.debug("    TABLE_CAT: " + rs2.getString("TABLE_CAT"));
            //                LOG.debug("    TABLE_SCHEM: " + rs2.getString("TABLE_SCHEM"));
            //                LOG.debug("    TABLE_NAME: " + rs2.getString("TABLE_NAME"));
            //                LOG.debug("    NON_UNIQUE: " + String.valueOf(rs2.getBoolean("NON_UNIQUE")));
            //                LOG.debug("    INDEX_QUALIFIER: " + rs2.getString("INDEX_QUALIFIER"));
            //                LOG.debug("    TYPE: " + String.valueOf(rs2.getShort("TYPE")));
            //                LOG.debug("    ORDINAL_POSITION: " + String.valueOf(rs2.getShort("ORDINAL_POSITION")));
            //                LOG.debug("    COLUMN_NAME: " + rs2.getString("COLUMN_NAME"));
            //                LOG.debug("    ASC_OR_DESC: " + rs2.getString("ASC_OR_DESC"));
            //                LOG.debug("    CARDINALITY: " + String.valueOf(rs2.getLong("CARDINALITY")));
            //                LOG.debug("    PAGES: " + String.valueOf(rs2.getLong("PAGES")));
            //                LOG.debug("    FILTER_CONDITION: " + rs2.getString("FILTER_CONDITION"));
            //
            //                String columnName = rs2.getString("COLUMN_NAME");
            //
            //                if (columnName.matches(skipcolumn) || !columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
            //                    continue;
            //                }
            //
            //                short keySeq = rs2.getShort("KEY_SEQ");
            //
            //                while (primaryKeys.size() <= keySeq) {
            //                    primaryKeys.add("");
            //                }
            //
            //                primaryKeys.set(keySeq, columnName);
            //            }
            //
            //            rs2.close();
            //
            //            // 一部DBではKEY_SEQが「[1]origin」なので「[0]origin」に詰め替え
            //            for (String primaryKey : primaryKeys) {
            //                if (primaryKey.length() > 0) {
            //                    tableInfo.getPrimaryKeys().add(primaryKey);
            //                }
            //            }
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

        ResultSet rs = metaData.getTables(null, schemaPattern.toUpperCase(), null, new String[] { "TABLE" });

        while (rs.next()) {

            String tableName = rs.getString("TABLE_NAME");

            boolean isIgnore = false;
            for (String ignore : ignores) {
                if (ignore.equals(tableName)) {
                    isIgnore = true;
                    break;
                }
            }
            if (isIgnore) {
                continue;
            }

            if (!tableName.matches("^[!-~]+$")) {
                continue;
            }

            if (tableName.equals("PLAN_TABLE") || tableName.startsWith("SYS_IMPORT_TABLE_")
                    || tableName.contains("$")) {
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
        }

        rs.close();
    }

    /**
     * @param typeName   メタ情報から取得したデータ型
     * @param columnInfo 対象のカラム情報
     * @return javaデータ型に変換した文字列
     */
    private static String getDataType(final String typeName, final ColumnInfo columnInfo) {

        String dataType = typeName;

        if (typeName.equals("INT")) {

            dataType = "Integer";

            if (columnInfo.isPk()) {
                columnInfo.setNumbering(true);
            }

        } else if (typeName.equals("DECIMAL") || typeName.equals("DOUBLE") || typeName.equals("NUMBER")
                || typeName.equals("NUMERIC")) {

            dataType = "java.math.BigDecimal";

        } else if (typeName.equals("DATE") || typeName.equals("TIME") || typeName.equals("DATETIME")
                || typeName.equals("TIMESTAMP")) {

            dataType = "java.time.LocalDateTime";

        } else {

            dataType = "String";

            if (typeName.equals("CHAR")) {
                if (columnInfo.isPk()) {
                    if (StringUtil.endsWith(charNumberingSuffixs, columnInfo.getColumnName())) {
                        columnInfo.setNumbering(true);
                    }
                }
            }
        }

        return dataType;
    }

    /**
     * 各テーブル情報に兄弟モデルを設定
     * @param tableInfos テーブル情報のリスト
     */
    private static void addBrotherTable(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();
        while (srcIterator.hasNext()) {
            TableInfo srcInfo = srcIterator.next();

            // 比較元に主キーがなければスキップ
            if (srcInfo.getPrimaryKeys().size() == 0) {
                continue;
            }

            // 弟を設定しないテーブルならスキップ
            boolean isOnlyChild = false;
            for (String onlychild : onlychilds) {
                if (onlychild.equals(srcInfo.getTableName())) {
                    isOnlyChild = true;
                    break;
                }
            }
            if (isOnlyChild) {
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

                // 弟に設定しないテーブルならスキップ
                boolean isEldest = false;
                for (String eldest : eldests) {
                    if (eldest.equals(destInfo.getTableName())) {
                        isEldest = true;
                        break;
                    }
                }
                if (isEldest) {
                    continue;
                }

                String srcPrimaryKeys = srcInfo.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");
                String destPrimaryKeys = destInfo.getPrimaryKeys().toString().replaceAll("[\\[\\]]", "");

                // 主キーが合致しなければスキップ
                if (!srcPrimaryKeys.equals(destPrimaryKeys)) {
                    continue;
                }

                // 比較元が既に比較先の弟ならスキップ
                if (destInfo.getBrosInfos().contains(srcInfo)) {
                    continue;
                }

                // 比較元に弟を追加
                destInfo.setBrother(true);
                srcInfo.getBrosInfos().add(destInfo);
            }
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
                ColumnInfo lastPKInfo = destInfo.getColumnInfos()
                        .get(destInfo.getPrimaryKeys().get(destInfo.getPrimaryKeys().size() - 1));
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

            // 弟モデルには子モデルを設定しない
            if (srcInfo.isBrother()) {
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

                // 弟を設定しないテーブルならスキップ
                boolean isFoundling = false;
                for (String foundling : foundlings) {
                    if (foundling.equals(destInfo.getTableName())) {
                        isFoundling = true;
                        break;
                    }
                }
                if (isFoundling) {
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

                // 比較先の主キーが比較元の主キー＋一つの場合は子テーブルリストに追加
                if (srcInfo.getPrimaryKeys().size() + 1 == destInfo.getPrimaryKeys().size()) {
                    // 履歴テーブルでも兄弟テーブルでもなければ追加
                    if (!destInfo.isHistory() && !destInfo.isBrother()) {
                        childInfos.add(destInfo);
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

                    // 参照テーブル自体ならスキップ
                    if (destInfo == srcInfo) {
                        continue;
                    }

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
                            boolean isEldest = false;
                            for (String eldest : eldests) {
                                if (eldest.equals(destInfo.getTableName())) {
                                    isEldest = true;
                                    break;
                                }
                            }
                            if (isEldest) {
                                continue;
                            }
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
