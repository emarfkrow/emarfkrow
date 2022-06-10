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
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * データソース管理クラス
 *
 * @author toshiyuki
 *
 */
public final class DataSources {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(DataSources.class);

    /**
     * DataSources.properties
     */
    private static final ResourceBundle BUNDLE = ResourceBundles.getBundle(DataSources.class);

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** 他のテーブルの兄弟テーブルにしないテーブル名 */
    private static String[] eldests;

    /** 弟テーブルを設定しないテーブル名 */
    private static String[] onlychilds;

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
    private static DataSourcesAssist assist = null;

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
            setAssist(jndiName);
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

        eldests = bundle.getString("BeanGenerator.eldests").split(",");

        onlychilds = bundle.getString("BeanGenerator.onlychilds").split(",");

        // テーブル情報の取得
        List<TableInfo> tableInfos = new ArrayList<TableInfo>();

        // データベースからテーブル情報を取得してループ
        try {

            Connection cn = Connections.get();

            DatabaseMetaData metaData = cn.getMetaData();

            String schemaPattern = BUNDLE.getString("username");

            // テーブル情報を取得
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

                    // カラム名が合致しなければスキップ
                    String columnName = columns.getString("COLUMN_NAME");
                    if (columnName.equals("ABSTRACT") || !columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
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

    private static void addPrimaryKeys(final DatabaseMetaData metaData, final TableInfo tableInfo)
            throws SQLException {

        List<String> primaryKeys = new ArrayList<String>();

        ResultSet rs = metaData.getPrimaryKeys(null, null, tableInfo.getTableName());

        while (rs.next()) {

            String columnName = rs.getString("COLUMN_NAME");

            if (columnName.equals("ABSTRACT") || !columnName.matches("^[0-9A-Za-z\\_\\-]+$")) {
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
    }

    private static void addTableInfos(final List<TableInfo> tableInfos, final DatabaseMetaData metaData,
            final String schemaPattern) throws SQLException {

        ResultSet rs = metaData.getTables(null, schemaPattern.toUpperCase(), null, new String[] { "TABLE" });

        while (rs.next()) {

            String tableName = rs.getString("TABLE_NAME");

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

            if (typeName.equals("CHAR") && columnInfo.isPk()) {
                columnInfo.setNumbering(true);
            }
        }

        return dataType;
    }

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
     * @param tableInfos
     */
    private static void addReferTable(final List<TableInfo> tableInfos) {

        // 参照IDサフィックスと参照名称サフィックスの組み合わせでループ（定義した順に優先）
        for (String[] referPair : referPairs) {
            String referIdSuffix = referPair[0];
            String referMeiSuffix = referPair[1];

            // マスタ参照先として、比較元テーブル情報でループ
            Iterator<TableInfo> referIterator = tableInfos.iterator();
            while (referIterator.hasNext()) {
                TableInfo referInfo = referIterator.next();

                // 他のテーブルの弟ならスキップ
                if (referInfo.isBrother()) {
                    continue;
                }

                // 複合キーならスキップ
                if (referInfo.getPrimaryKeys().size() != 1) {
                    continue;
                }

                // ユニークキーが参照キーの何れにも合致しなければスキップ
                String referId = referInfo.getPrimaryKeys().get(0);
                if (!StringUtil.endsWithIgnoreCase(referIdSuffix, referId)) {
                    continue;
                }

                // 参照名称サフィックスに合致するカラムがなければスキップ
                String referMei = referId.replaceAll("(?i)" + referIdSuffix + "$", referMeiSuffix);
                if (!referInfo.getColumnInfos().containsKey(referMei)) {
                    continue;
                }

                /*
                 * 参照元の探索
                 */

                // テーブル情報でループ（比較先）
                Iterator<TableInfo> iterator = tableInfos.iterator();
                while (iterator.hasNext()) {
                    TableInfo tableInfo = iterator.next();

                    // 参照テーブル自体ならスキップ
                    if (tableInfo == referInfo) {
                        continue;
                    }

                    // 比較先自体が参照マスタならスキップ
                    boolean self = false;
                    if (tableInfo.getPrimaryKeys().size() == 1) {
                        String primaryKey = tableInfo.getPrimaryKeys().get(0);
                        for (String[] pair : referPairs) {
                            String idSuffix = pair[0];
                            String meiSuffix = pair[1];
                            if (StringUtil.endsWithIgnoreCase(idSuffix, primaryKey)) {
                                String meiColumnName = primaryKey.replaceAll("(?i)" + idSuffix + "$", meiSuffix);
                                if (tableInfo.getColumnInfos().containsKey(meiColumnName)) {
                                    self = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (self) {
                        continue;
                    }

                    // 比較先のカラム情報でループして比較元のユニークキーがあれば参照テーブルリストに追加
                    for (Entry<String, ColumnInfo> e : tableInfo.getColumnInfos().entrySet()) {
                        String columnName = e.getKey();
                        ColumnInfo columnInfo = e.getValue();
                        if (columnName.endsWith(referId) && columnInfo.getReferInfo() == null) {
                            columnInfo.setReferInfo(referInfo);
                        }
                    }
                }
            }
        }
    }

}
