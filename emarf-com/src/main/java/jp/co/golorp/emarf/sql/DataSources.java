package jp.co.golorp.emarf.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
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
import jp.co.golorp.emarf.generator.BeanGenerator;
import jp.co.golorp.emarf.generator.ColumnInfo;
import jp.co.golorp.emarf.generator.TableInfo;
import jp.co.golorp.emarf.lang.StringUtil;
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

    /** 参照IDサフィックス */
    private static String[] referIdSuffixs;
    /** 参照名サフィックス */
    private static String referMeiSuffix;

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

        /* 設定ファイル読み込み */
        ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);
        referIdSuffixs = bundle.getString("BeanGenerator.refer.id.suffixs").split(",");
        referMeiSuffix = bundle.getString("BeanGenerator.refer.mei.suffix");

        // テーブル情報の取得
        List<TableInfo> tableInfos = new ArrayList<TableInfo>();

        // データベースからテーブル情報を取得してループ
        try {
            Connection cn = Connections.get();
            DatabaseMetaData metaData = cn.getMetaData();
            ResultSet tables = metaData.getTables(null, BUNDLE.getString("username").toUpperCase(), null,
                    new String[] { "TABLE" });
            while (tables.next()) {

                String tableName = tables.getString("TABLE_NAME");
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
                String remarks = tables.getString("REMARKS");
                if (remarks == null || remarks.length() == 0) {
                    remarks = DataSources.getTableComment(tableName);
                }
                if (remarks == null || remarks.length() == 0) {
                    remarks = tableName;
                }
                tableInfo.setRemarks(remarks);
            }
            tables.close();

            for (TableInfo tableInfo : tableInfos) {

                // テーブルの主キーカラム名を取得
                List<String> pkList = new ArrayList<String>();
                ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, tableInfo.getTableName());
                while (primaryKeys.next()) {
                    String columnName = primaryKeys.getString("COLUMN_NAME");

                    if (columnName.equals("ABSTRACT") || !columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
                        continue;
                    }

                    short keySeq = primaryKeys.getShort("KEY_SEQ");
                    while (pkList.size() <= keySeq) {
                        pkList.add("");
                    }
                    pkList.set(keySeq, columnName);
                }
                primaryKeys.close();

                // 一部DBではKEY_SEQが「1origin」なので「0origin」に詰め替え
                List<String> pks = tableInfo.getPrimaryKeys();
                for (String pk : pkList) {
                    if (pk.length() > 0) {
                        pks.add(pk);
                    }
                }
            }

            for (TableInfo tableInfo : tableInfos) {

                Map<String, ColumnInfo> columnInfos = tableInfo.getColumnInfos();

                // テーブルのカラム情報を取得してループ
                LOG.debug(tableInfo.getTableName());
                ResultSet columns = metaData.getColumns(null, null, tableInfo.getTableName(), null);
                while (columns.next()) {

                    // カラム情報を追加
                    ColumnInfo columnInfo = new ColumnInfo();
                    String columnName = columns.getString("COLUMN_NAME");

                    if (columnName.equals("ABSTRACT") || !columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
                        continue;
                    }

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
                    String remarks = columns.getString("REMARKS");
                    if (remarks == null) {
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

    private static String getDataType(final String typeName, final ColumnInfo columnInfo) {

        String dataType = typeName;

        if (typeName.equals("INT")) {

            dataType = "Integer";

            if (columnInfo.isPk()) {
                columnInfo.setNumbering(true);
            }

        } else if (typeName.equals("DATETIME")) {

            dataType = "java.time.LocalDateTime";

        } else if (dataSourcesAssist instanceof DataSourcesAssistOracle && typeName.equals("DATE")) {

            dataType = "java.time.LocalDateTime";

        } else if (typeName.equals("VARCHAR")) {

            dataType = "String";

        } else if (typeName.equals("VARCHAR2")) {

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

        } else if (typeName.equals("NUMBER")) {

            dataType = "java.math.BigDecimal";
        }

        return dataType;
    }

    private static void addBrotherTable(final List<TableInfo> tableInfos) {

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

    private static void addChildTables(final List<TableInfo> tableInfos) {

        // テーブル情報でループ（比較元）
        Iterator<TableInfo> srcIterator = tableInfos.iterator();
        while (srcIterator.hasNext()) {
            TableInfo srcInfo = srcIterator.next();

            if (srcInfo.getPrimaryKeys().size() == 0) {
                continue;
            }

            if (srcInfo.isBrother()) {
                continue;
            }

            // 比較元の主キーをCSVで取得し、行末をカンマにする
            String srcPk = srcInfo.getPrimaryKeys().toString().replaceAll("(^\\[|\\]$)", "") + ", ";

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
                String destPk = destInfo.getPrimaryKeys().toString().replaceAll("(^\\[|\\]$)", "");

                if (!destPk.startsWith(srcPk)) {
                    continue;
                }

                // 比較先の主キーが比較元の主キー＋一つの場合は子テーブルリストに追加
                String extKey = destPk.replaceFirst("^" + srcPk, "");
                if (extKey.split(",").length == 1) {
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

            // ユニークキーが参照IDでなければスキップ
            if (!StringUtil.endsWith(referIdSuffixs, srcPk)) {
                continue;
            }

            // 参照IDに合致する名称がなければスキップ
            String referMei = null;
            for (String referIdSuffix : referIdSuffixs) {
                if (srcPk.toLowerCase().endsWith(referIdSuffix)) {
                    String mei = srcPk.replaceAll("(?i)" + referIdSuffix, referMeiSuffix);
                    for (String columnName : srcInfo.getColumnInfos().keySet()) {
                        if (mei.toLowerCase().equals(columnName.toLowerCase())) {
                            referMei = mei;
                            break;
                        }
                    }
                }
            }
            if (referMei == null) {
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
