package jp.co.golorp.emarf.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.generator.ColumnInfo;
import jp.co.golorp.emarf.generator.TableInfo;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * データソース管理クラス
 *
 * @author toshiyuki
 *
 */
public final class DataSources {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(DataSources.class);

    /**
     * DataSources.properties
     */
    private static final ResourceBundle BUNDLE = ResourceBundles.getBundle(DataSources.class);

    /**
     * DataSourceのJNDI名
     */
    private static final String JNDI_NAME = "JNDIName";

    /**
     * データベース名列挙子
     *
     * @author toshiyuki
     *
     */
    private enum DatabaseNames {

        /** mysql. */
        mysql,

        /** oracle. */
        oracle,

        /** sqlite. */
        sqlite,

        /** postgresql. */
        postgresql
    }

    /** データベース毎の処理を受け持つクラス. */
    private static DataSourcesAssist dataSourcesAssist = null;

    /**
     * シングルトンインスタンス
     */
    private static DataSource ds = null;

    /**
     * プライベートコンストラクタ
     */
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

        /*
         * JNDIから取得してみる
         */

        String jndiName = BUNDLE.getString(JNDI_NAME);
        try {
            setDatabaseAssist(jndiName);
            Context context = new InitialContext();
            ds = (DataSource) context.lookup(jndiName);
            return ds;
        } catch (NamingException e) {
            LOG.trace(e.getMessage());
        }

        /*
         * DBCPから取得してみる
         */

        Properties properties = new Properties();
        Enumeration<String> keys = BUNDLE.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = BUNDLE.getString(key);
            properties.put(key, value);
            setDatabaseAssist(value);
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
    private static void setDatabaseAssist(final String s) {

        if (dataSourcesAssist == null) {

            for (DatabaseNames databaseName : DatabaseNames.values()) {

                if (s.contains(databaseName.name())) {

                    if (databaseName == DatabaseNames.mysql) {

                        dataSourcesAssist = new DataSourcesAssistMySQL();

                    } else if (databaseName == DatabaseNames.oracle) {

                        dataSourcesAssist = new DataSourcesAssistOracle();

                    } else if (databaseName == DatabaseNames.postgresql) {

                        dataSourcesAssist = new DataSourcesAssistPostgreSQL();

                    } else if (databaseName == DatabaseNames.sqlite) {

                        dataSourcesAssist = new DataSourcesAssistSQLite();

                    }

                    break;
                }
            }
        }
    }

    /**
     * テーブルコメント取得
     *
     * @param tableName テーブル名
     * @return テーブルコメント
     */
    public static String getTableComment(final String tableName) {
        return dataSourcesAssist.getTableComment(tableName);
    }

    /**
     * スキーマのメタ情報取得
     * @return List<TableInfo>
     */
    public static List<TableInfo> getTableInfos() {

        /*
         * テーブル情報の取得
         */

        List<TableInfo> tableInfos = new ArrayList<TableInfo>();

        // データベースからテーブル情報を取得してループ
        Connection cn = Connections.get();
        try {
            DatabaseMetaData metaData = cn.getMetaData();
            ResultSet tables = metaData.getTables(null, null, null, new String[] { "TABLE" });
            while (tables.next()) {

                // テーブル情報を追加
                TableInfo tableInfo = new TableInfo();
                tableInfos.add(tableInfo);

                // テーブル物理名
                String tableName = tables.getString("TABLE_NAME");
                tableInfo.setTableName(tableName);

                // テーブル論理名
                String remarks = tables.getString("REMARKS");
                if (remarks == null || remarks.length() == 0) {
                    remarks = DataSources.getTableComment(tableName);
                }
                tableInfo.setRemarks(remarks);

                // テーブルの主キーカラム名を取得
                List<String> pkList = new ArrayList<String>();
                ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, tableName);
                while (primaryKeys.next()) {
                    String columnName = primaryKeys.getString("COLUMN_NAME");
                    short keySeq = primaryKeys.getShort("KEY_SEQ");
                    while (pkList.size() <= keySeq) {
                        pkList.add("");
                    }
                    pkList.set(keySeq, columnName);
                }

                // 一部DBではKEY_SEQが「1origin」なので「0origin」に詰め替え
                List<String> pks = tableInfo.getPrimaryKeys();
                for (String pk : pkList) {
                    if (pk.length() > 0) {
                        pks.add(pk);
                    }
                }

                Map<String, ColumnInfo> columnInfos = tableInfo.getColumnInfos();

                // テーブルのカラム情報を取得してループ
                ResultSet columns = metaData.getColumns(null, null, tableName, null);
                while (columns.next()) {

                    // カラム情報を追加
                    ColumnInfo columnInfo = new ColumnInfo();
                    String columnName = columns.getString("COLUMN_NAME");
                    columnInfos.put(columnName, columnInfo);

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
                    columnInfo.setRemarks(columns.getString("REMARKS"));

                    /*
                     * 拡張情報
                     */

                    // 主キー
                    if (pks.contains(columnName)) {
                        columnInfo.setPk(true);
                    } else {
                        tableInfo.getNonPrimaryKeys().add(columnName);
                    }

                    // typeNameをjavaデータ型に変換
                    String typeName = columns.getString("TYPE_NAME").toUpperCase();
                    String dataType = typeName;
                    if (typeName.equals("INT")) {
                        dataType = "Integer";
                        if (columnInfo.isPk()) {
                            columnInfo.setNumbering(true);
                        }
                    } else if (typeName.equals("DATETIME")) {
                        dataType = "java.time.LocalDateTime";
                    } else if (typeName.equals("VARCHAR")) {
                        dataType = "String";
                    } else if (typeName.equals("CHAR")) {
                        dataType = "String";
                        if (columnInfo.isPk()) {
                            columnInfo.setNumbering(true);
                        }
                    } else if (typeName.equals("DECIMAL")) {
                        dataType = "java.math.BigDecimal";
                    } else if (typeName.equals("DOUBLE")) {
                        dataType = "java.math.BigDecimal";
                    }
                    columnInfo.setDataType(dataType);
                }
            }
        } catch (SQLException e) {
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

    private static void addBrotherTable(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();
        while (srcIterator.hasNext()) {
            TableInfo srcInfo = srcIterator.next();

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

                if (!srcPrimaryKeys.equals(destPrimaryKeys)) {
                    continue;
                }
                if (destInfo.getBrosInfos().contains(srcInfo)) {
                    continue;
                }

                destInfo.setBrother(true);
                srcInfo.getBrosInfos().add(destInfo);
            }
        }
    }

    private static void addHistoryTable(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();
        while (srcIterator.hasNext()) {
            TableInfo srcInfo = srcIterator.next();

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

                if (!srcNonPrimaryKeys.equals(destNonPrimaryKeys)) {
                    continue;
                }
                if (!destPrimaryKeys.startsWith(srcPrimaryKeys)) {
                    continue;
                }
                if (destPrimaryKeys.replaceAll(srcPrimaryKeys + ", ", "").split(",").length != 1) {
                    continue;
                }

                destInfo.setHistory(true);
                srcInfo.setHistoryInfo(destInfo);
            }
        }
    }

    private static void addChildTables(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();
        while (srcIterator.hasNext()) {
            TableInfo srcInfo = srcIterator.next();

            if (srcInfo.isBrother()) {
                continue;
            }

            // 比較元の主キーをCSVで取得し、行末をカンマにする
            String srcPk = srcInfo.getPrimaryKeys().toString().replaceFirst("\\]$", "") + ", ";

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

                // 比較先の主キーをCSVで取得し、行末の「]」を削除
                String destPk = destInfo.getPrimaryKeys().toString().replaceFirst("\\]$", "");

                // 比較先の主キーが比較元の主キー＋一つの場合は子テーブルリストに追加
                String extKey = destPk.replace(srcPk, "");
                if (!extKey.startsWith("[") && extKey.split(",").length == 1) {
                    // 履歴テーブルでも兄弟テーブルでもなければ追加
                    if (!destInfo.isHistory() && !destInfo.isBrother()) {
                        childInfos.add(destInfo);
                    }
                }
            }
        }
    }

    private static void addReferTable(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();
        while (srcIterator.hasNext()) {
            TableInfo srcInfo = srcIterator.next();

            // 複合キーならスキップ
            if (srcInfo.getPrimaryKeys().size() != 1) {
                continue;
            }

            // ユニークキーを取得
            String srcPk = srcInfo.getPrimaryKeys().get(0);

            // テーブル情報でループ（比較先）
            Iterator<TableInfo> destIterator = tableInfos.iterator();
            while (destIterator.hasNext()) {
                TableInfo destInfo = destIterator.next();

                // 比較元と同じならスキップ
                if (srcInfo == destInfo) {
                    continue;
                }

                // 比較先のカラム情報でループして比較元のユニークキーがあれば参照テーブルリストに追加
                for (Entry<String, ColumnInfo> e : destInfo.getColumnInfos().entrySet()) {
                    String columnName = e.getKey();
                    ColumnInfo columnInfo = e.getValue();
                    if (/*!destInfo.getPrimaryKeys().contains(columnName) &&*/ columnName.endsWith(srcPk)) {
                        columnInfo.setReferInfo(srcInfo);
                    }
                }
            }
        }
    }

}
