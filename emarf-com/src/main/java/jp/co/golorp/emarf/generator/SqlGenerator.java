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

    /** 範囲指定サフィックス */
    private static String[] inputRangeSuffixs;

    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** プライベートコンストラクタ */
    private SqlGenerator() {
    }

    /**
     * 各モデルの検索SQL出力
     * @param sqlDir SQLファイル出力ディレクトリ
     * @param tableInfo テーブル情報
     */
    public static void sqlSearch(final String sqlDir, final TableInfo tableInfo) {

        /* 設定ファイル読み込み */
        bundle = ResourceBundles.getBundle(BeanGenerator.class);
        optionsSuffixs = bundle.getString("BeanGenerator.options.suffixs").split(",");
        inputRangeSuffixs = bundle.getString("BeanGenerator.input.range.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");
        String[] pairs = bundle.getString("BeanGenerator.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }

        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);
        DataSourcesAssist assist = DataSources.getAssist();

        // 参照モデルの名称解決
        List<String> s = new ArrayList<String>();
        int i = 0;
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {

            // 参照元カラム名
            String srcColumnName = columnInfo.getColumnName();

            String sql = "    , ";
            if (s.size() == 0) {
                s.add("SELECT");
                sql = "      ";
            }
            if (columnInfo.getTypeName().equals("CHAR")) {
                s.add(sql + "RTRIM (RTRIM (a." + assist.quoted(srcColumnName) + "), '　') AS " + srcColumnName);
            } else {
                s.add(sql + "a." + assist.quoted(srcColumnName));
            }

            // 列の参照モデル情報
            TableInfo referInfo = columnInfo.getReferInfo();
            if (referInfo != null) {

                ++i;

                for (String[] e : referPairs) {
                    String idSuffix = e[0];
                    String meiSuffix = e[1];

                    // カラム名が参照キーに合致しなければスキップ
                    if (!srcColumnName.matches("(?i)^.*" + idSuffix + "$")) {
                        continue;
                    }

                    // カラム名のIDサフィックスを名称サフィックスに置換して名称カラム名を取得
                    String srcIdColumn = srcColumnName;
                    String srcMeiColumn = srcIdColumn.replaceAll("(?i)" + idSuffix + "$", meiSuffix);

                    // 参照先テーブルの全カラム名を確認して、末尾が合致するカラム名を、参照先のID・名称カラム名として取得
                    String destIdColumn = null;
                    String destMeiColumn = null;
                    for (String destColumnName : referInfo.getColumnInfos().keySet()) {
                        if (srcIdColumn.matches("^.*" + destColumnName + "$")) {
                            destIdColumn = destColumnName;
                        } else if (srcMeiColumn.matches("^.*" + destColumnName + "$")) {
                            destMeiColumn = destColumnName;
                        }
                    }

                    if (destIdColumn == null || destMeiColumn == null) {
                        continue;
                    }

                    // 名称カラムがない場合はselect句に追加
                    if (!tableInfo.getColumnInfos().containsKey(srcMeiColumn)) {
                        String destColumnName = referInfo.getPrimaryKeys().get(0);
                        String destColumnMei = destColumnName.replaceAll("(?i)" + idSuffix + "$", meiSuffix);
                        String srcIdQuoted = assist.quoted(srcIdColumn);
                        String srcMeiQuoted = assist.quoted(srcMeiColumn);
                        String destIdQuoted = assist.quoted(destColumnName);
                        String destMeiQuoted = assist.quoted(destColumnMei);
                        s.add("    , (SELECT r" + i + "." + destMeiQuoted + " FROM " + referInfo.getTableName() + " r"
                                + i + " WHERE r" + i + "." + destIdQuoted + " = a." + srcIdQuoted + ") AS "
                                + srcMeiQuoted);
                    }

                    break;
                }
            }
        }

        s.add("FROM");
        s.add("    " + tableName + " a ");
        s.add("WHERE");
        s.add("    1 = 1 ");
        for (Entry<String, ColumnInfo> e : tableInfo.getColumnInfos().entrySet()) {
            String columnName = e.getKey();
            ColumnInfo columnInfo = e.getValue();
            String snake = StringUtil.toSnakeCase(columnName);
            String quoted = assist.quoted(columnName);

            if (StringUtil.endsWith(inputFlagSuffixs, columnName)) {
                // FLAG検索
                s.add("    AND CASE WHEN TRIM (a." + quoted + ") IS NULL THEN '0' ELSE TO_CHAR (a." + quoted
                        + ") END IN (:" + snake + ") ");
            } else if (StringUtil.endsWith(optionsSuffixs, columnName)) {
                // IN検索
                s.add("    AND TRIM (a." + quoted + ") IN (:" + snake + ") ");
            } else if (columnInfo.getDataType().equals("String")) {
                // 文字列はTRIMしてLIKE検索
                String[] array = new String[] { "'%'", ":" + snake, "'%'" };
                String joined = assist.join(array);
                s.add("    AND TRIM (a." + quoted + ") LIKE " + joined + " ");
            } else {
                // 以外は等値検索
                s.add("    AND a." + quoted + " = :" + snake + " ");
            }

            // 範囲検索
            if (StringUtil.endsWith(inputRangeSuffixs, columnName)) {
                s.add("    AND a." + quoted + " >= :" + snake + "_1 ");
                s.add("    AND a." + quoted + " <= :" + snake + "_2 ");
            }
        }

        s.add("ORDER BY");
        if (tableInfo.getPrimaryKeys().size() > 0) {
            String orders = "";
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                if (orders.length() > 0) {
                    orders += ", ";
                }
                orders += "a." + assist.quoted(primaryKey);
            }
            s.add("    " + orders);
        } else {
            for (i = 1; i <= tableInfo.getColumnInfos().size(); i++) {
                if (i == 1) {
                    s.add("    " + i);
                } else {
                    s.add("    , " + i);
                }
            }
        }

        FileUtil.writeFile(sqlDir + File.separator + entityName + "Search.sql", s);
    }

}
