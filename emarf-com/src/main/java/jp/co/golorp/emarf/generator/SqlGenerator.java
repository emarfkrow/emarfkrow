package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.sql.DataSources;
import jp.co.golorp.emarf.sql.DataSourcesAssist;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * SQL出力
 *
 * @author golorp
 */
public final class SqlGenerator {

    /** BeanGenerator.properties */
    private static ResourceBundle bundle;

    /** options項目サフィックス */
    private static String[] optionsSuffixs;

    /** 日付入力サフィックス */
    private static String[] inputDateSuffixs;

    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;

    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;

    /** 範囲指定サフィックス */
    private static String[] inputRangeSuffixs;

    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** 区分カラム */
    private static String optK;

    /** 削除フラグ */
    private static String deleteF;
    /** 開始日 */
    private static String kaishiBi;
    /** 終了日 */
    private static String shuryoBi;

    /** DataSourcesAssist */
    private static DataSourcesAssist assist;

    /** プライベートコンストラクタ */
    private SqlGenerator() {
    }

    /**
     * SQL生成
     * @param projectDir
     * @param tableInfos
     */
    public static void generate(final String projectDir, final List<TableInfo> tableInfos) {

        /* 設定ファイル読み込み */
        bundle = ResourceBundles.getBundle(BeanGenerator.class);
        optionsSuffixs = bundle.getString("BeanGenerator.options.suffixs").split(",");
        inputDateSuffixs = bundle.getString("BeanGenerator.input.date.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("BeanGenerator.input.datetime.suffixs").split(",");
        inputTimestampSuffixs = bundle.getString("BeanGenerator.input.timestamp.suffixs").split(",");
        inputRangeSuffixs = bundle.getString("BeanGenerator.input.range.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");

        String[] pairs = bundle.getString("DataSources.reration.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }

        optK = bundle.getString("BeanGenerator.options.key").toUpperCase();

        deleteF = bundle.getString("SqlGenerator.deleteF").toUpperCase();
        kaishiBi = bundle.getString("SqlGenerator.kaishiBi").toUpperCase();
        shuryoBi = bundle.getString("SqlGenerator.shuryoBi").toUpperCase();

        assist = DataSources.getAssist();

        //SQLフォルダ
        String sqlDir = projectDir + File.separator + bundle.getString("SqlGenerator.sqlPath");
        FileUtil.reMkDir(sqlDir);

        //検索SQL
        for (TableInfo tableInfo : tableInfos) {
            SqlGenerator.sqlSearch(sqlDir, tableInfo);
            SqlGenerator.sqlCorrect(sqlDir, tableInfo);
        }
    }

    /**
     * 各モデルの検索SQL出力
     * @param sqlDir SQLファイル出力ディレクトリ
     * @param tableInfo テーブル情報
     */
    private static void sqlSearch(final String sqlDir, final TableInfo tableInfo) {

        //テーブル名・エンティティ名
        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);

        //参照モデルの番号
        int refNo = 0;

        List<String> sql = new ArrayList<String>();
        for (ColumnInfo column : tableInfo.getColumnInfos().values()) {

            //カラム行追加
            String prefix = "    , ";
            if (sql.size() == 0) {
                sql.add("SELECT");
                prefix = "      ";
            }
            sql.add(prefix + SqlGenerator.getQuoted(column));

            // カラム名

            // 列の参照モデル情報
            if (column.getReferInfo() != null) {

                ++refNo;
                TableInfo refer = column.getReferInfo();

                //IDと名称のサフィックスペアでループ
                for (String[] e : referPairs) {
                    String keySuf = e[0];
                    String meiSuf = e[1];

                    // 参照元カラム名が参照キーに合致しなければスキップ
                    if (!column.getColumnName().matches("(?i)^.*" + keySuf + "$")) {
                        continue;
                    }

                    // 参照元カラム名のIDサフィックスを名称サフィックスに置換して、参照元の名称カラム名を取得
                    String srcKey = column.getColumnName();
                    String srcMei = srcKey.replaceAll("(?i)" + keySuf + "$", meiSuf).toUpperCase();

                    // 参照先の全カラム名を確認して、末尾が合致するカラム名を、参照先のID・名称カラム名として取得
                    String destKey = null;
                    String destMei = null;
                    for (String columnName : refer.getColumnInfos().keySet()) {
                        if (srcKey.matches("(?i)^.*" + columnName + "$")) {
                            destKey = columnName;
                        }
                        if (srcMei.matches("(?i)^.*" + columnName + "$")) {
                            destMei = columnName;
                        }
                        if (destKey != null && destMei != null) {
                            break;
                        }
                    }

                    // 参照先に、キーと名称に合致するカラムがなければスキップ
                    if (destKey == null || destMei == null) {
                        continue;
                    }

                    // 生成した参照元名称カラムが、参照元に既存でない場合はselect句に追加
                    boolean isSrcMei = false;
                    for (String columnName : tableInfo.getColumnInfos().keySet()) {
                        if (columnName.matches("(?i)^" + srcMei + "$")) {
                            isSrcMei = true;
                            break;
                        }
                    }
                    if (!isSrcMei) {
                        String srcKeyQuoted = assist.quotedSQL(srcKey);
                        String srcMeiQuoted = assist.quotedSQL(srcMei);
                        String destKeyQuoted = assist.quotedSQL(destKey);
                        String destMeiQuoted = assist.quotedSQL(destMei);
                        sql.add("    , (SELECT r" + refNo + "." + destMeiQuoted + " FROM " + refer.getTableName()
                                + " r" + refNo + " WHERE r" + refNo + "." + destKeyQuoted + " = a." + srcKeyQuoted
                                + ") AS " + srcMeiQuoted);
                    }

                    break;
                }
            }
        }
        sql.add("FROM");
        sql.add("    " + tableName + " a ");
        sql.add("WHERE");
        sql.add("    1 = 1 ");
        for (Entry<String, ColumnInfo> e : tableInfo.getColumnInfos().entrySet()) {
            addWhere(sql, e.getValue());
        }
        sql.add("ORDER BY");
        if (tableInfo.getPrimaryKeys().size() > 0) {
            String orders = "";
            for (String pk : tableInfo.getPrimaryKeys()) {
                if (orders.length() > 0) {
                    orders += ", ";
                }
                orders += "a." + assist.quotedSQL(pk);
            }
            sql.add("    " + orders);
        } else {
            for (int i = 1; i <= tableInfo.getColumnInfos().size(); i++) {
                if (i == 1) {
                    sql.add("    " + i);
                } else {
                    sql.add("    , " + i);
                }
            }
        }

        FileUtil.writeFile(sqlDir + File.separator + entityName + "Search.sql", sql);
    }

    /**
     * 各モデルの検索SQL出力
     * @param sqlDir SQLファイル出力ディレクトリ
     * @param table テーブル情報
     */
    private static void sqlCorrect(final String sqlDir, final TableInfo table) {

        //参照モデルの連番
        int refNo = 0;

        List<String> sql = new ArrayList<String>();

        for (ColumnInfo column : table.getColumnInfos().values()) {

            //カラム行追加
            String prefix = "    , ";
            if (sql.size() == 0) {
                sql.add("SELECT");
                prefix = "      ";
            }
            sql.add(prefix + SqlGenerator.getQuoted(column));

            // 列の参照モデル情報があればカラム名の補完
            if (column.getReferInfo() != null) {
                ++refNo;
                TableInfo refer = column.getReferInfo();

                //IDと名称のサフィックスペアでループ
                for (String[] e : referPairs) {
                    String keySuf = e[0];
                    String meiSuf = e[1];

                    // 参照元カラム名が参照キーに合致しなければスキップ
                    if (!column.getColumnName().matches("(?i)^.*" + keySuf + "$")) {
                        continue;
                    }

                    // 参照元カラム名のIDサフィックスを名称サフィックスに置換して、参照元の名称カラム名を取得
                    String srcKey = column.getColumnName();
                    String srcMei = srcKey.replaceAll("(?i)" + keySuf + "$", meiSuf).toUpperCase();

                    // 参照先でID・名称のサフィックスに合致するカラムを取得し、両方取得できなければスキップ
                    String destKey = null;
                    String destMei = null;
                    for (String columnName : refer.getColumnInfos().keySet()) {
                        if (srcKey.matches("(?i)^.*" + columnName + "$")) {
                            destKey = columnName;
                        }
                        if (srcMei.matches("(?i)^.*" + columnName + "$")) {
                            destMei = columnName;
                        }
                        if (destKey != null && destMei != null) {
                            break;
                        }
                    }
                    if (destKey == null || destMei == null) {
                        continue;
                    }

                    // 生成した参照元名称カラムが、参照元に既存でない場合はselect句に追加
                    boolean isSrcMei = false;
                    for (String columnName : table.getColumnInfos().keySet()) {
                        if (columnName.matches("(?i)^" + srcMei + "$")) {
                            isSrcMei = true;
                            break;
                        }
                    }
                    if (!isSrcMei) {
                        String srcKeyQ = assist.quotedSQL(srcKey);
                        String srcMeiQ = assist.quotedSQL(srcMei);
                        String destKeyQ = assist.quotedSQL(destKey);
                        String destMeiQ = assist.quotedSQL(destMei);
                        sql.add("    , (SELECT r" + refNo + "." + destMeiQ + " FROM " + refer.getTableName() + " r"
                                + refNo + " WHERE r" + refNo + "." + destKeyQ + " = a." + srcKeyQ + ") AS " + srcMeiQ);
                    }

                    break;
                }
            }
        }
        sql.add("FROM");
        sql.add("    " + table.getTableName() + " a ");

        //組合せモデル
        if (table.getComboInfos().size() > 0) {
            addComboSql(sql, table);
        }

        sql.add("WHERE");
        sql.add("    1 = 1 ");
        if (table.getColumnInfos().containsKey(deleteF)) {
            sql.add("    AND " + assist.nvlZero("a." + deleteF) + " != 1 ");
        }
        if (table.getColumnInfos().containsKey(kaishiBi)) {
            sql.add("    AND " + assist.nvlSysdate("a." + kaishiBi) + " <= " + assist.sysDate() + " ");
        }
        if (table.getColumnInfos().containsKey(shuryoBi)) {
            sql.add("    AND " + assist.dateAdd(assist.nvlSysdate("a." + shuryoBi), 1) + " > " + assist.sysDate()
                    + " ");
        }
        for (Entry<String, ColumnInfo> e : table.getColumnInfos().entrySet()) {
            addWhere(sql, e.getValue());
        }

        //制約モデル
        if (table.getStintInfo() != null) {
            addStintSql(sql, table);
        }

        sql.add("ORDER BY");
        if (table.getPrimaryKeys().size() > 0) {
            String orders = "";
            for (String pk : table.getPrimaryKeys()) {
                if (orders.length() > 0) {
                    orders += ", ";
                }
                orders += "a." + assist.quotedSQL(pk);
            }
            sql.add("    " + orders);
        } else {
            for (int i = 1; i <= table.getColumnInfos().size(); i++) {
                if (i == 1) {
                    sql.add("    " + i);
                } else {
                    sql.add("    , " + i);
                }
            }
        }

        String entity = StringUtil.toPascalCase(table.getTableName());
        FileUtil.writeFile(sqlDir + File.separator + entity + "Correct.sql", sql);
    }

    /**
     * @param sql
     * @param table
     */
    private static void addStintSql(final List<String> sql, final TableInfo table) {

        TableInfo stint = table.getStintInfo();

        String anotherKey = "";
        for (String pk : stint.getPrimaryKeys()) {
            if (pk.equals(kaishiBi)) {
                continue;
            }
            if (!pk.equals(table.getPrimaryKeys().get(0))) {
                anotherKey = pk;
                break;
            }
        }

        sql.add("    AND EXISTS ( ");
        sql.add("        SELECT");
        sql.add("              * ");
        sql.add("        FROM");
        sql.add("            " + stint.getTableName() + " p ");
        sql.add("        WHERE");
        sql.add("            1 = 1 ");
        if (stint.getColumnInfos().containsKey(deleteF)) {
            sql.add("            AND " + assist.nvlZero("p." + deleteF) + " != 1 ");
        }
        if (stint.getColumnInfos().containsKey(kaishiBi)) {
            sql.add("            AND " + assist.nvlSysdate("p." + kaishiBi) + " <= " + assist.sysDate()
                    + " ");
        }
        if (stint.getColumnInfos().containsKey(shuryoBi)) {
            sql.add("            AND " + assist.dateAdd(assist.nvlSysdate("p." + shuryoBi), 1) + " > "
                    + assist.sysDate());
        }
        for (String pk : stint.getPrimaryKeys()) {
            if (pk.equals(kaishiBi)) {
                continue;
            }
            if (pk.equals(anotherKey)) {
                String snake = StringUtil.toSnakeCase(pk);
                sql.add("            AND p." + pk + " = :" + snake + " ");
            } else {
                sql.add("            AND p." + pk + " = a." + pk + " ");
            }
        }
        sql.add("    ) ");
    }

    /**
     * @param sql
     * @param table
     */
    private static void addComboSql(final List<String> sql, final TableInfo table) {

        int i = 0;

        for (TableInfo combo : table.getComboInfos()) {
            ++i;
            sql.add("    INNER JOIN " + combo.getTableName() + " c" + i + " ");
            sql.add("        ON 1 = 1 ");
            if (combo.getColumnInfos().containsKey(deleteF)) {
                sql.add("        AND " + assist.nvlZero("c" + i + "." + deleteF) + " != 1 ");
            }
            if (combo.getColumnInfos().containsKey(kaishiBi)) {
                sql.add("        AND " + assist.nvlSysdate("c" + i + "." + kaishiBi) + " <= " + assist.sysDate()
                        + " ");
            }
            if (combo.getColumnInfos().containsKey(shuryoBi)) {
                sql.add("        AND " + assist.dateAdd(assist.nvlSysdate("c" + i + "." + shuryoBi), 1) + " > "
                        + assist.sysDate());
            }
            for (String pk : combo.getPrimaryKeys()) {
                sql.add("        AND c" + i + "." + pk + " = a." + pk + " ");
            }
        }
    }

    /**
     * @param sql
     * @param column
     */
    private static void addWhere(final List<String> sql, final ColumnInfo column) {

        String columnName = column.getColumnName();

        String quoted = assist.quotedSQL(columnName);
        String param = BeanGenerator.getRightHand(columnName, column);

        if (StringUtil.endsWith(inputFlagSuffixs, columnName)) {
            // FLAG検索
            sql.add("    AND CASE WHEN TRIM (a." + quoted + ") IS NULL THEN '0' ELSE TO_CHAR (a." + quoted
                    + ") END IN (" + param + ") ");

        } else if (StringUtil.endsWith(optionsSuffixs, columnName)) {
            // IN検索
            sql.add("    AND TRIM (a." + quoted + ") IN (" + param + ") ");

        } else if (column.getDataType().equals("String")) {

            String trimed = assist.trimedSQL("a." + quoted);

            if (columnName.toUpperCase().equals(optK)) {
                //参照キーの場合は、パラメータをデータで後方一致
                sql.add("    AND " + param + " LIKE " + assist.joinedSQL(new String[] { "'%'", trimed }) + " ");

            } else {
                //以外の文字列は、データをパラメータで部分一致
                sql.add("    AND " + trimed + " LIKE " + assist.joinedSQL(new String[] { "'%'", param, "'%'" }) + " ");
            }

        } else {
            // 以外は等値検索
            sql.add("    AND a." + quoted + " = " + param + " ");
        }

        // 範囲検索なら追加
        if (StringUtil.endsWith(inputRangeSuffixs, columnName)) {
            sql.add("    AND a." + quoted + " >= " + BeanGenerator.getRightHand(columnName + "_1 ", column));
            sql.add("    AND a." + quoted + " <= " + BeanGenerator.getRightHand(columnName + "_2 ", column));
        }
    }

    /**
     * @param columnInfo
     * @return quoted
     */
    private static String getQuoted(final ColumnInfo columnInfo) {

        String columnName = columnInfo.getColumnName();

        String quoted = "a." + assist.quotedSQL(columnName);

        if (columnInfo.getTypeName().equals("CHAR")) {

            String trimed = assist.trimedSQL(quoted);
            quoted = trimed + " AS " + columnName;

        } else if (StringUtil.endsWith(inputDateSuffixs, columnInfo.getColumnName())) {

            quoted = assist.date2CharSQL(quoted) + " AS " + columnName;

        } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnInfo.getColumnName())) {

            quoted = assist.dateTime2CharSQL(quoted) + " AS " + columnName;

        } else if (StringUtil.endsWith(inputTimestampSuffixs, columnInfo.getColumnName())) {

            quoted = assist.timestamp2CharSQL(quoted) + " AS " + columnName;
        }

        return quoted;
    }

}
