package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
    private static ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** 適用日 */
    private static String start;
    /** 終了日 */
    private static String until;
    /** 削除フラグ */
    private static String deleteF;
    /** 表示順サフィックス */
    private static String[] orderSuffixs;

    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;
    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;
    /** 日付入力サフィックス */
    private static String[] inputDateSuffixs;
    /** 範囲指定サフィックス */
    private static String[] inputRangeSuffixs;
    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;
    /** options項目サフィックス */
    private static String[] inputOptionsSuffixs;

    /** 区分カラム */
    private static String optK;

    /** DataSourcesAssist */
    private static DataSourcesAssist assist = DataSources.getAssist();

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
        String[] pairs = bundle.getString("relation.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }

        start = bundle.getString("column.start").toUpperCase();
        until = bundle.getString("column.until").toUpperCase();
        deleteF = bundle.getString("column.delete").toUpperCase();
        orderSuffixs = bundle.getString("column.order.suffixs").split(",");

        inputTimestampSuffixs = bundle.getString("input.timestamp.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("input.datetime.suffixs").split(",");
        inputDateSuffixs = bundle.getString("input.date.suffixs").split(",");
        inputRangeSuffixs = bundle.getString("input.range.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("input.flag.suffixs").split(",");
        inputOptionsSuffixs = bundle.getString("input.options.suffixs").split(",");

        optK = bundle.getString("options.key").toUpperCase();

        //SQLフォルダ
        String sqlDir = projectDir + File.separator + bundle.getString("dir.sql");
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
     * @param table テーブル情報
     */
    private static void sqlSearch(final String sqlDir, final TableInfo table) {

        //テーブル名・エンティティ名
        String entity = StringUtil.toPascalCase(table.getName());

        //参照モデルの番号
        int refs = 0;

        List<String> s = new ArrayList<String>();
        for (ColumnInfo column : table.getColumns().values()) {

            //カラム行追加
            String prefix = "    , ";
            if (s.size() == 0) {
                s.add("SELECT");
                prefix = "      ";
            }
            s.add(prefix + SqlGenerator.getQuoted(column));

            // 列の参照モデル情報があればカラム名の補完
            if (column.getRefer() != null) {
                String meiSql = getMeiSql(refs, table, column);
                if (meiSql != null) {
                    ++refs;
                    s.add("    " + meiSql);
                }
            }
        }
        s.add("FROM");
        s.add("    " + table.getName() + " a ");

        s.add("WHERE");
        s.add("    1 = 1 ");
        for (ColumnInfo column : table.getColumns().values()) {
            addWhere(s, column);
        }

        if (!table.isView()) {
            s.add("ORDER BY");
            if (table.getPrimaryKeys().size() > 0) {
                String orders = "";
                if (table.getPrimaryKeys().size() == 1) {
                    for (ColumnInfo column : table.getColumns().values()) {
                        if (StringUtil.endsWith(orderSuffixs, column.getName())) {
                            if (orders.length() > 0) {
                                orders += "    , ";
                            } else {
                                orders += "    ";
                            }
                            orders += "a." + assist.quotedSQL(column.getName()) + "\r\n";
                        }
                    }
                }
                for (String pk : table.getPrimaryKeys()) {
                    if (orders.length() > 0) {
                        orders += "    , ";
                    } else {
                        orders += "    ";
                    }
                    orders += "a." + assist.quotedSQL(pk) + "\r\n";
                }
                if (table.getPrimaryKeys().size() > 1) {
                    for (ColumnInfo column : table.getColumns().values()) {
                        if (StringUtil.endsWith(orderSuffixs, column.getName())) {
                            if (orders.length() > 0) {
                                orders += "    , ";
                            } else {
                                orders += "    ";
                            }
                            orders += "a." + assist.quotedSQL(column.getName()) + "\r\n";
                        }
                    }
                }
                s.add(orders.replaceFirst("\r\n$", ""));
            } else {
                for (int i = 1; i <= table.getColumns().size(); i++) {
                    if (i == 1) {
                        s.add("    " + i);
                    } else {
                        s.add("    , " + i);
                    }
                }
            }
        }

        FileUtil.writeFile(sqlDir + File.separator + entity + "Search.sql", s);
    }

    /**
     * @param refs
     * @param table
     * @param column
     * @return String
     */
    public static String getMeiSql(final int refs, final TableInfo table, final ColumnInfo column) {

        TableInfo refer = column.getRefer();

        //BeanGeneratorの子モデル処理時にはnullかも知れない
        if (referPairs.size() == 0) {
            String[] pairs = bundle.getString("relation.refer.pairs").split(",");
            for (String pair : pairs) {
                String[] kv = pair.split(":");
                referPairs.add(kv);
            }
        }
        if (assist == null) {
            assist = DataSources.getAssist();
        }

        //IDと名称のサフィックスペアでループ
        for (String[] e : referPairs) {
            String keySuf = e[0];
            String meiSuf = e[1];

            // 参照元カラム名が参照キーに合致しなければスキップ
            if (!column.getName().matches("(?i)^.*" + keySuf + "$")) {
                continue;
            }

            // 参照元カラム名のIDサフィックスを名称サフィックスに置換して、参照元の名称カラム名を取得
            String srcKey = column.getName();
            String srcMei = srcKey.replaceAll("(?i)" + keySuf + "$", meiSuf).toUpperCase();

            // 参照先でID・名称のサフィックスに合致するカラムを取得し、両方取得できなければスキップ
            String destKey = null;
            String destMei = null;
            for (String columnName : refer.getColumns().keySet()) {
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
            for (String columnName : table.getColumns().keySet()) {
                if (columnName.matches("(?i)^" + srcMei + "$")) {
                    isSrcMei = true;
                    break;
                }
            }
            if (!isSrcMei) {
                String srcK = assist.quotedSQL(srcKey);
                String srcM = assist.quotedSQL(srcMei);
                String destK = assist.quotedSQL(destKey);
                String destM = assist.quotedSQL(destMei);
                return ", (SELECT r" + refs + "." + destM + " FROM " + refer.getName() + " r" + refs + " WHERE r"
                        + refs + "." + destK + " = a." + srcK + ") AS " + srcM;
            }
        }

        return null;
    }

    /**
     * 各モデルの検索SQL出力
     * @param sqlDir SQLファイル出力ディレクトリ
     * @param table テーブル情報
     */
    private static void sqlCorrect(final String sqlDir, final TableInfo table) {

        //参照モデルの連番
        int refs = 0;

        List<String> s = new ArrayList<String>();

        for (ColumnInfo column : table.getColumns().values()) {

            //カラム行追加
            String prefix = "    , ";
            if (s.size() == 0) {
                s.add("SELECT");
                prefix = "      ";
            }
            s.add(prefix + SqlGenerator.getQuoted(column));

            // 列の参照モデル情報があればカラム名の補完
            if (column.getRefer() != null) {
                String meiSql = getMeiSql(refs, table, column);
                if (meiSql != null) {
                    ++refs;
                    s.add("    " + meiSql);
                }
            }
        }

        s.add("FROM");
        s.add("    " + table.getName() + " a ");

        //組合せモデル
        if (table.getComboInfos().size() > 0) {
            addComboSql(s, table);
        }

        s.add("WHERE");
        s.add("    1 = 1 ");
        if (table.getColumns().containsKey(deleteF)) {
            s.add("    AND " + assist.nvlZero("a." + deleteF) + " != 1 ");
        }
        if (table.getColumns().containsKey(start)) {
            s.add("    AND " + assist.nvlSysdate("a." + start) + " <= " + assist.sysDate() + " ");
        }
        if (table.getColumns().containsKey(until)) {
            s.add("    AND " + assist.dateAdd(assist.nvlSysdate("a." + until), 1) + " > " + assist.sysDate()
                    + " ");
        }
        for (ColumnInfo column : table.getColumns().values()) {
            addWhere(s, column);
        }

        //制約モデル
        if (table.getStintInfo() != null) {
            addStintSql(s, table);
        }

        if (!table.isView()) {
            s.add("ORDER BY");
            if (table.getPrimaryKeys().size() > 0) {
                String orders = "";
                if (table.getPrimaryKeys().size() == 1) {
                    for (ColumnInfo column : table.getColumns().values()) {
                        if (StringUtil.endsWith(orderSuffixs, column.getName())) {
                            if (orders.length() > 0) {
                                orders += "    , ";
                            } else {
                                orders += "    ";
                            }
                            orders += "a." + assist.quotedSQL(column.getName()) + "\r\n";
                        }
                    }
                }
                for (String pk : table.getPrimaryKeys()) {
                    if (orders.length() > 0) {
                        orders += "    , ";
                    } else {
                        orders += "    ";
                    }
                    orders += "a." + assist.quotedSQL(pk) + "\r\n";
                }
                if (table.getPrimaryKeys().size() > 1) {
                    for (ColumnInfo column : table.getColumns().values()) {
                        if (StringUtil.endsWith(orderSuffixs, column.getName())) {
                            if (orders.length() > 0) {
                                orders += "    , ";
                            } else {
                                orders += "    ";
                            }
                            orders += "a." + assist.quotedSQL(column.getName()) + "\r\n";
                        }
                    }
                }
                s.add(orders.replaceFirst("\r\n$", ""));
            } else {
                for (int i = 1; i <= table.getColumns().size(); i++) {
                    if (i == 1) {
                        s.add("    " + i);
                    } else {
                        s.add("    , " + i);
                    }
                }
            }
        }

        String entity = StringUtil.toPascalCase(table.getName());
        FileUtil.writeFile(sqlDir + File.separator + entity + "Correct.sql", s);
    }

    /**
     * @param sql
     * @param table
     */
    private static void addStintSql(final List<String> sql, final TableInfo table) {

        TableInfo stint = table.getStintInfo();

        //        String anotherKey = "";
        //        for (String pk : stint.getPrimaryKeys()) {
        //            if (pk.equals(start)) {
        //                continue;
        //            }
        //            if (!pk.equals(table.getPrimaryKeys().get(0))) {
        //                anotherKey = pk;
        //                break;
        //            }
        //        }

        sql.add("    AND EXISTS ( ");
        sql.add("        SELECT");
        sql.add("              * ");
        sql.add("        FROM");
        sql.add("            " + stint.getName() + " p ");
        sql.add("        WHERE");
        sql.add("            1 = 1 ");
        if (stint.getColumns().containsKey(deleteF)) {
            sql.add("            AND " + assist.nvlZero("p." + deleteF) + " != 1 ");
        }
        if (stint.getColumns().containsKey(start)) {
            sql.add("            AND " + assist.nvlSysdate("p." + start) + " <= " + assist.sysDate()
                    + " ");
        }
        if (stint.getColumns().containsKey(until)) {
            sql.add("            AND " + assist.dateAdd(assist.nvlSysdate("p." + until), 1) + " > "
                    + assist.sysDate());
        }
        List<String> primaryKeys = new ArrayList<String>(stint.getPrimaryKeys());
        primaryKeys.remove(start);
        for (int i = 0; i < primaryKeys.size(); i++) {
            String primaryKey = primaryKeys.get(i);
            if (i < primaryKeys.size() - 1) {
                String snake = StringUtil.toSnakeCase(primaryKey);
                sql.add("            AND p." + primaryKey + " = :" + snake + " ");
            } else {
                sql.add("            AND p." + primaryKey + " = a." + primaryKey + " ");
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
            sql.add("    INNER JOIN " + combo.getName() + " c" + i + " ");
            sql.add("        ON 1 = 1 ");
            if (combo.getColumns().containsKey(deleteF)) {
                sql.add("        AND " + assist.nvlZero("c" + i + "." + deleteF) + " != 1 ");
            }
            if (combo.getColumns().containsKey(start)) {
                sql.add("        AND " + assist.nvlSysdate("c" + i + "." + start) + " <= " + assist.sysDate()
                        + " ");
            }
            if (combo.getColumns().containsKey(until)) {
                sql.add("        AND " + assist.dateAdd(assist.nvlSysdate("c" + i + "." + until), 1) + " > "
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

        String name = column.getName();

        // quoted
        String q = assist.quotedSQL(name);

        // parameters
        String p = BeanGenerator.getRightHand(name, column);

        // trimed
        String t = assist.trimedSQL("a." + q);

        if (StringUtil.endsWith(inputFlagSuffixs, name)) {

            // FLAG検索
            sql.add("    AND CASE WHEN " + t + " IS NULL THEN '0' ELSE TO_CHAR (a." + q + ") END IN (" + p + ") ");

        } else if (StringUtil.endsWith(inputOptionsSuffixs, name)) {

            // IN検索
            sql.add("    AND " + t + " IN (" + p + ") ");

        } else if (column.getDataType().equals("String")) {

            if (name.toUpperCase().equals(optK)) {
                //参照キーの場合は、パラメータをデータで後方一致
                sql.add("    AND UPPER (" + p + ") LIKE UPPER (" + assist.joinedSQL(new String[] { "'%'", t }) + ") ");

            } else {
                //以外の文字列は、データをパラメータで部分一致
                sql.add("    AND UPPER (" + t + ") LIKE UPPER (" + assist.joinedSQL(new String[] { "'%'", p, "'%'" })
                        + ") ");
            }

        } else {
            // 以外は等値検索
            sql.add("    AND a." + q + " = " + p + " ");
        }

        // 範囲検索なら追加
        if (StringUtil.endsWith(inputRangeSuffixs, name)) {
            sql.add("    AND a." + q + " >= " + BeanGenerator.getRightHand(name + "_1 ", column));
            sql.add("    AND a." + q + " <= " + BeanGenerator.getRightHand(name + "_2 ", column));
        }
    }

    /**
     * @param column
     * @return quoted
     */
    private static String getQuoted(final ColumnInfo column) {

        String colName = column.getName();
        String cQuoted = assist.quotedSQL(colName);
        String aQuoted = "a." + cQuoted;

        if (column.getTypeName().equals("CHAR")) {

            String trimed = assist.trimedSQL(aQuoted);
            aQuoted = trimed + " AS " + cQuoted;

        } else if (StringUtil.endsWith(inputDateSuffixs, colName)) {

            aQuoted = assist.date2CharSQL(aQuoted) + " AS " + cQuoted;

        } else if (StringUtil.endsWith(inputDateTimeSuffixs, colName)) {

            aQuoted = assist.dateTime2CharSQL(aQuoted) + " AS " + cQuoted;

        } else if (StringUtil.endsWith(inputTimestampSuffixs, colName)) {

            aQuoted = assist.timestamp2CharSQL(aQuoted) + " AS " + cQuoted;
        }

        return aQuoted;
    }

}
