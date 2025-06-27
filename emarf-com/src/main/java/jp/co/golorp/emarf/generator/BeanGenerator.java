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

package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.sql.DataSources;
import jp.co.golorp.emarf.sql.DataSourcesAssist;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * java/html/sql出力
 *
 * @author golorp
 */
public final class BeanGenerator {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(BeanGenerator.class);

    /** DB方言クラス */
    private static DataSourcesAssist assist = DataSources.getAssist();

    /** 起動時の自動生成か */
    private static boolean isGenerateAtStartup;

    /** プロジェクトディレクトリ */
    private static String projectDir;

    /** BeanGenerator.properties */
    private static ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);
    /** 適用日カラム名 */
    private static String tekiyoBi;
    /** 登録日時カラム名 */
    private static String insertDt;
    /** 登録者カラム名 */
    private static String insertBy;
    /** 更新日時カラム名 */
    private static String updateDt;
    /** 更新者カラム名 */
    private static String updateBy;
    /** ステータス区分 */
    private static String status;
    /** 削除フラグ */
    private static String deleteF;
    /** 変更理由 */
    private static String reason;

    /** javaファイル出力ルートパス */
    private static String javaDir;

    /** actionパッケージ */
    private static String pkgAction;
    /** entityパッケージ */
    private static String pkgE;

    /** 必須CHAR列の指定 */
    private static String charNotNullRe;
    /** 非必須INT列の指定 */
    private static String numberNullableRe;
    /** 更新日時フォーマット */
    private static String updateDtFormat;

    /** 年月入力サフィックス */
    private static String[] inputYMSuffixs;
    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;
    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;
    /** 日付け入力サフィックス */
    private static String[] inputDateSuffixs;
    /** 時刻入力サフィックス */
    private static String[] inputHourSuffixs;
    /** 時間入力サフィックス */
    private static String[] inputTimeSuffixs;
    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;
    /** ファイルサフィックス */
    private static String[] inputFileSuffixs;

    /** プライベートコンストラクタ */
    private BeanGenerator() {
    }

    /**
     * 各ファイル出力 主処理
     * @param dir プロジェクトのディレクトリ
     */
    public static void generate(final String dir) {

        LOG.info("start.");

        //webからの自動生成ならコンパイルまで行う
        if (App.get("generateAtStartup") != null) {
            isGenerateAtStartup = App.get("generateAtStartup").toLowerCase().equals("true");
        }

        //プロジェクトディレクトリを退避
        projectDir = dir;

        tekiyoBi = bundle.getString("column.start");
        insertDt = bundle.getString("column.insert.timestamp");
        insertBy = bundle.getString("column.insert.id");
        updateDt = bundle.getString("column.update.timestamp");
        updateBy = bundle.getString("column.update.id");
        status = bundle.getString("column.status");
        deleteF = bundle.getString("column.delete");
        reason = bundle.getString("column.history.reason");

        javaDir = bundle.getString("dir.java");

        pkgAction = bundle.getString("java.package.action") + ".model.base";
        pkgE = bundle.getString("java.package.entity");

        //NOTNULLで必須項目として扱うCHARの列名リスト（ホストの△対応）
        charNotNullRe = bundle.getString("column.char.notnull.re");
        //NOTNULLのINT列で「0」を補填する列名指定
        numberNullableRe = bundle.getString("column.number.nullable.re");
        //登録情報・更新情報の列名
        updateDtFormat = bundle.getString("column.update.timestamp.format");

        inputYMSuffixs = bundle.getString("input.ym.suffixs").split(",");
        inputTimestampSuffixs = bundle.getString("input.timestamp.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("input.datetime.suffixs").split(",");
        inputDateSuffixs = bundle.getString("input.date.suffixs").split(",");
        inputHourSuffixs = bundle.getString("input.hour.suffixs").split(",");
        inputTimeSuffixs = bundle.getString("input.time.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("input.file.suffixs").split(",");

        /*
         * 出力フォルダ再作成
         */

        //エンティティフォルダ
        String entityPackagePath = pkgE.replace(".", File.separator);
        String entityPackageDir = projectDir + File.separator + javaDir + File.separator + entityPackagePath;
        FileUtil.reMkDir(entityPackageDir);

        //アクションフォルダ
        String actionPackagePath = pkgAction.replace(".", File.separator);
        String actionPackageDir = projectDir + File.separator + javaDir + File.separator + actionPackagePath;
        FileUtil.reMkDir(actionPackageDir);

        /*
         * データベースから自動生成
         */

        // テーブル情報を取得
        List<TableInfo> tables = DataSources.getTables();

        //エンティティクラス
        BeanGenerator.javaEntity(tables);

        //詳細画面アクションクラス
        DetailActionGenerator.generate(projectDir, tables);

        //検索画面アクションクラス
        IndexActionGenerator.generate(projectDir, tables);

        //フォームクラス
        FormGenerator.generate(projectDir, tables);

        //HTMLファイル
        HtmlGenerator.generate(projectDir, tables);

        //検索SQLファイル
        SqlGenerator.generate(projectDir, tables);

        LOG.info("success.");
    }

    /**
     * エンティティ出力
     * @param tables テーブル情報のリスト
     */
    private static void javaEntity(final List<TableInfo> tables) {

        String pkgPath = pkgE.replace(".", File.separator);
        String pkgDir = projectDir + File.separator + javaDir + File.separator + pkgPath;
        Map<String, String> paths = new LinkedHashMap<String, String>();
        for (TableInfo table : tables) {
            String e = StringUtil.toPascalCase(table.getName());
            String r = table.getRemarks();
            List<String> s = new ArrayList<String>();
            s.add("package " + pkgE + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.ArrayList;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import jp.co.golorp.emarf.entity.IEntity;");
            s.add("import jp.co.golorp.emarf.sql.Queries;");
            s.add("");
            s.add("/**");
            s.add(" * " + r);
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + e + " implements IEntity {");
            int i = 0;
            i = addSlickGridId(table, s, i);
            for (ColumnInfo column : table.getColumns().values()) {
                String n = column.getName(); // name
                String m = column.getRemarks(); // mei
                String p = StringUtil.toCamelCase(n); // property
                String a = StringUtil.toPascalCase(n); // accessor
                String t = column.getDataType(); // type
                p = p.replaceAll("#", "_");
                a = a.replaceAll("#", "_");
                s.add("");
                s.add("    /** " + m + " */");
                if (t.equals("java.time.LocalDate")) {
                    addAnnotationLocalDate(s);
                } else if (t.equals("java.time.LocalTime")) {
                    addAnnotationLocalTime(s);
                } else if (StringUtil.endsWith(inputTimestampSuffixs, n)) {
                    addAnnotationLocalTimeStamp(s);
                } else if (StringUtil.endsWith(inputDateTimeSuffixs, n)) {
                    addAnnotationLocalDateTime(s);
                }
                if (StringUtil.endsWith(inputFlagSuffixs, n)) {
                    // フラグを外した際、何も送信されず更新もかからないため、フラグ項目には初期値を設定しておく
                    if (t.equals("java.math.BigDecimal")) {
                        s.add("    private " + t + " " + p + " = new " + t + "(0);");
                    } else if (t.equals("Integer")) {
                        s.add("    private " + t + " " + p + " = 0;");
                    } else {
                        s.add("    private " + t + " " + p + " = \"0\";");
                    }
                } else {
                    s.add("    private " + t + " " + p + ";");
                }
                s.add("");
                s.add("    /** @return " + m + " */");
                s.add("    @com.fasterxml.jackson.annotation.JsonProperty(value = \"" + n + "\", index = " + ++i + ")");
                s.add("    public " + t + " get" + a + "() {");
                if (t.equals("String") && StringUtil.endsWith(inputYMSuffixs, n)) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(this." + p + ")) {");
                    s.add("            return this." + p + ".substring(0, 4) + \"-\" + this." + p + ".substring(4);");
                    s.add("        }");
                }
                s.add("        return this." + p + ";");
                s.add("    }");
                s.add("");
                s.add("    /** @param o " + m + " */");
                s.add("    public void set" + a + "(final Object o) {");
                if (t.equals("java.time.LocalDateTime")) {
                    s.add("        if (o != null && o instanceof Long) {");
                    s.add("            java.util.Date d = new java.util.Date((Long) o);");
                    s.add("            this." + p
                            + " = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());");
                    s.add("        } else if (o != null && o.toString().matches(\"^[0-9]+\")) {");
                    s.add("            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));");
                    s.add("            this." + p
                            + " = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());");
                    s.add("        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + p + " = " + t
                            + ".parse(o.toString().replace(\" \", \"T\").replace(\"/\", \"-\"));");
                } else if (t.equals("java.time.LocalDate")) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + p + " = " + t + ".parse(o.toString().substring(0, 10));");
                } else if (t.equals("java.time.LocalTime")) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            String text = o.toString().replaceFirst(\"^\\\\d+[\\\\/|\\\\-]\\\\d+[\\\\/|\\\\-]\\\\d+ \", \"\");");
                    s.add("            this." + p + " = " + t + ".parse(text);");
                } else if (t.equals("java.math.BigDecimal")) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + p + " = new java.math.BigDecimal(o.toString());");
                } else if (StringUtil.endsWith(inputYMSuffixs, n)) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + p + " = " + t + ".valueOf(o.toString().replace(\"-\", \"\"));");
                } else if (t.equals("String")) {
                    s.add("        if (o != null) {");
                    s.add("            this." + p + " = o.toString();");
                } else {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + p + " = " + t + ".valueOf(o.toString());");
                }
                s.add("        } else {");
                s.add("            this." + p + " = null;");
                s.add("        }");
                s.add("    }");
                //子モデルgridで補填用の参照名
                if (column.getRefer() != null) {
                    i = addSanshoMei(s, table, column, i);
                }
            }
            if (table.getHistory() != null && !StringUtil.isNullOrBlank(reason)) {
                i = addHistoryReason(s, i);
            }
            javaEntityCRUD(table, s);
            javaEntityUtil(table, s);
            i = javaEntityYoungers(table, s, i);
            i = javaEntityChild(table, s, i);
            i = javaEntityRebornTo(table, s, i);

            s.add("}");
            String path = pkgDir + File.separator + e + ".java";
            FileUtil.writeFile(path, s);
            paths.put(path, pkgE + "." + e);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : paths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * @param table
     * @param s
     * @param jsonIndex
     * @return int
     */
    private static int addSlickGridId(final TableInfo table, final List<String> s, final int jsonIndex) {
        int i = jsonIndex;
        if (table.getColumns().get("ID") == null) {
            s.add("");
            s.add("    /** SlickGridのDataView用ID */");
            s.add("    private Integer id;");
            s.add("");
            s.add("    /** @return id */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(value = \"id\", index = " + ++i + ")");
            s.add("    public final Integer getId() {");
            s.add("        return id;");
            s.add("    }");
            s.add("");
            s.add("    /** @param o id */");
            s.add("    public final void setId(final Object o) {");
            s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
            s.add("            this.id = Integer.valueOf(o.toString());");
            s.add("        } else {");
            s.add("            this.id = null;");
            s.add("        }");
            s.add("    }");
        }
        return i;
    }

    /**
     * @param table
     * @param s
     * @param jsonIndex
     * @return int
     */
    private static int javaEntityRebornTo(final TableInfo table, final List<String> s, final int jsonIndex) {
        int i = jsonIndex;
        if (table.getRebornTo() != null) {
            String parent = StringUtil.toPascalCase(table.getName());
            String params = "";
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() > 0) {
                    if (params.length() > 0) {
                        params += ", ";
                    }
                    params += "this." + StringUtil.toCamelCase(pk);
                }
            }
            TableInfo child = table.getRebornTo();
            String ent = StringUtil.toPascalCase(child.getName());
            String ins = StringUtil.toCamelCase(child.getName());
            s.add("");
            s.add("    /** " + child.getRemarks() + "のリスト */");
            s.add("    private List<" + ent + "> " + ins + "s;");
            s.add("");
            s.add("    /** @return " + child.getRemarks() + "のリスト */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(value = \"" + ent + "s\", index = " + ++i
                    + ")");
            s.add("    public List<" + ent + "> get" + ent + "s() {");
            s.add("        return this." + ins + "s;");
            s.add("    }");
            s.add("");
            s.add("    /** @param list " + child.getRemarks() + "のリスト */");
            s.add("    public void set" + ent + "s(final List<" + ent + "> list) {");
            s.add("        this." + ins + "s = list;");
            s.add("    }");
            s.add("");
            s.add("    /** @param " + ins + " */");
            s.add("    public void add" + ent + "s(final " + ent + " " + ins + ") {");
            s.add("        if (this." + ins + "s == null) {");
            s.add("            this." + ins + "s = new ArrayList<" + ent + ">();");
            s.add("        }");
            s.add("        this." + ins + "s.add(" + ins + ");");
            s.add("    }");
            s.add("");
            s.add("    /** @return " + child.getRemarks() + "のリスト */");
            s.add("    public List<" + ent + "> refer" + ent + "s() {");
            s.add("        this." + ins + "s = " + parent + ".refer" + ent + "s(" + params + ");");
            s.add("        return this." + ins + "s;");
            s.add("    }");

            // refer
            s.add("");
            s.add("    /**");
            int paramIndex = 0;
            String pks = "";
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                String property = StringUtil.toCamelCase(pk);
                s.add("     * @param param" + ++paramIndex + " " + property);
                if (pks.length() > 0) {
                    pks += ", ";
                }
                ColumnInfo column = table.getColumns().get(pk);
                pks += "final " + column.getDataType() + " param" + paramIndex;
            }
            s.add("     * @return List<" + ent + ">");
            s.add("     */");
            s.add("    public static List<" + ent + "> refer" + ent + "s(" + pks + ") {");
            s.add("        List<String> whereList = new ArrayList<String>();");
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                String p = ":" + StringUtil.toSnakeCase(pk);
                ColumnInfo primaryKey = table.getColumns().get(pk);
                if (primaryKey.getTypeName().equals("CHAR")) {
                    s.add("        whereList.add(\"" + assist.trimedSQL(pk) + " = " + assist.trimedSQL(p) + "\");");
                } else if (!pk.equals(tekiyoBi)) {
                    s.add("        whereList.add(\"" + pk + " = " + p + "\");");
                    //                } else {
                    //                    s.add("        whereList.add(\"" + getTekiyoBiSql(child, pk, p) + "\");");
                }
            }

            //カラム名を列挙
            s.add("        String sql = \"SELECT \";");
            int cols = 0;
            int refs = 0;
            for (ColumnInfo column : child.getColumns().values()) {
                String quoteEscaped = assist.quoteEscapedSQL(column.getName());
                //時間サフィックスに合致する場合、データソースがOracleならTO_CHAR
                if (StringUtil.endsWith(inputDateSuffixs, column.getName())) {
                    quoteEscaped = assist.date2CharSQL(quoteEscaped) + " AS " + column.getName();
                } else if (StringUtil.endsWith(inputHourSuffixs, column.getName())) {
                    quoteEscaped = assist.time2CharSQL(quoteEscaped) + " AS " + column.getName();
                } else if (StringUtil.endsWith(inputDateTimeSuffixs, column.getName())) {
                    quoteEscaped = assist.dateTime2CharSQL(quoteEscaped) + " AS " + column.getName();
                } else if (StringUtil.endsWith(inputTimestampSuffixs, column.getName())) {
                    quoteEscaped = assist.timestamp2CharSQL(quoteEscaped) + " AS " + column.getName();
                }
                if (cols == 0) {
                    s.add("        sql += \"" + quoteEscaped + "\";");
                } else {
                    s.add("        sql += \", " + quoteEscaped + "\";");
                }
                ++cols;
                // 列の参照モデル情報があればカラム名の補完
                if (column.getRefer() != null) {
                    String meiSql = SqlGenerator.getMeiSql(refs, table, column);
                    if (meiSql != null) {
                        ++refs;
                        meiSql = meiSql.replaceAll("\"", "\\\\\"");
                        s.add("        sql += \"" + meiSql + "\";");
                    }
                }
            }
            s.add("        sql += \" FROM " + child.getName() + " a WHERE \" + String.join(\" AND \", whereList);");
            s.add("        sql += \" ORDER BY \";");
            String orders = "";
            if (child.getPrimaryKeys().size() > 0) {
                for (String pk : child.getPrimaryKeys()) {
                    if (orders.length() > 0) {
                        orders += ", ";
                    }
                    orders += pk;
                }
            } else {
                for (paramIndex = 1; paramIndex <= child.getColumns().size(); paramIndex++) {
                    if (paramIndex == 1) {
                        orders += ", ";
                    }
                    orders += paramIndex;
                }
            }
            s.add("        sql += \"" + orders + "\";");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            paramIndex = 0;
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                s.add("        map.put(\"" + StringUtil.toSnakeCase(pk) + "\", param" + ++paramIndex + ");");
            }
            s.add("        return Queries.select(sql, map, " + ent + ".class, null, null);");
            s.add("    }");
        }
        return i;
    }

    /**
     * @param s
     * @param jsonIndex
     * @return int
     */
    public static int addHistoryReason(final List<String> s, final int jsonIndex) {

        int i = jsonIndex;

        String p = StringUtil.toCamelCase(reason);
        String a = StringUtil.toPascalCase(reason);
        s.add("");
        s.add("    /** " + p + " */");
        s.add("    private String " + p + ";");
        s.add("");
        s.add("    /** @return " + p + " */");
        s.add("    @com.fasterxml.jackson.annotation.JsonProperty(value = \"" + reason + "\", index = " + ++i + ")");
        s.add("    public String get" + a + "() {");
        s.add("        return this." + p + ";");
        s.add("    }");
        s.add("");
        s.add("    /** @param o " + p + " */");
        s.add("    public void set" + a + "(final Object o) {");
        s.add("        if (o != null) {");
        s.add("            this." + p + " = o.toString();");
        s.add("        }");
        s.add("    }");

        return i;
    }

    /**
     * @param s
     */
    public static void addAnnotationLocalDateTime(final List<String> s) {
        s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss\")");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)");
    }

    /**
     * @param s
     */
    public static void addAnnotationLocalTimeStamp(final List<String> s) {
        s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss.SSS\")");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)");
    }

    /**
     * @param s
     */
    public static void addAnnotationLocalTime(final List<String> s) {
        s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"hh:mm\")");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer.class)");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer.class)");
    }

    /**
     * @param s
     */
    public static void addAnnotationLocalDate(final List<String> s) {
        s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd\")");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)");
        s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)");
    }

    /**
     * @param s
     * @param table
     * @param column
     * @param jsonIndex
     * @return int
     */
    private static int addSanshoMei(final List<String> s, final TableInfo table, final ColumnInfo column,
            final int jsonIndex) {

        int i = jsonIndex;

        String columnMei = column.getRemarks();

        //参照ペアを取得
        String meiSql = SqlGenerator.getMeiSql(0, table, column);
        if (meiSql != null) {

            int columnNameIndex = meiSql.lastIndexOf(" AS ") + 4;

            //参照ペアがあるが名称カラムがなければ追加
            String n = meiSql.substring(columnNameIndex).replaceAll("[ \"`]", "");
            String p = StringUtil.toCamelCase(n);
            String a = StringUtil.toPascalCase(n);
            p = p.replaceAll("#", "_");
            a = a.replaceAll("#", "_");
            s.add("");
            s.add("    /** " + columnMei + "参照 */");
            s.add("    private String " + p + ";");
            s.add("");
            s.add("    /** @return " + columnMei + "参照 */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(value = \"" + n + "\", index = " + ++i + ")");
            s.add("    public String get" + a + "() {");
            s.add("        return this." + p + ";");
            s.add("    }");
            s.add("");
            s.add("    /** @param o " + columnMei + "参照 */");
            s.add("    public void set" + a + "(final Object o) {");
            s.add("        if (o != null) {");
            s.add("            this." + p + " = o.toString();");
            s.add("        } else {");
            s.add("            this." + p + " = null;");
            s.add("        }");
            s.add("    }");
        }

        return i;
    }

    /**
     * エンティティにCRUD追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityCRUD(final TableInfo table, final List<String> s) {

        String e = StringUtil.toPascalCase(table.getName());

        s.add("");
        s.add("    /**");
        s.add("     * " + table.getRemarks() + "照会");
        int paramCount = 0;
        String getParams = "";
        for (String pk : table.getPrimaryKeys()) {
            if (pk.length() > 0) {
                String columnRemarks = "";
                if (table.getColumns() != null && table.getColumns().size() > 0) {
                    if (table.getColumns().containsKey(pk)) {
                        columnRemarks = " " + table.getColumns().get(pk).getRemarks();
                    }
                }
                s.add("     * @param param" + ++paramCount + columnRemarks);
                if (getParams.length() > 0) {
                    getParams += ", ";
                }
                getParams += "final Object param" + paramCount;
            }
        }
        s.add("     * @return " + table.getRemarks());
        s.add("     */");
        s.add("    public static " + e + " get(" + getParams + ") {");
        s.add("        List<String> whereList = new ArrayList<String>();");

        // 主キー条件
        boolean isPrimaryKey = false;
        for (String pk : table.getPrimaryKeys()) {
            if (pk.length() > 0) {
                isPrimaryKey = true;
                // quoted
                String q = DataSources.getAssist().quoteEscapedSQL(pk);
                // param
                String p = ":" + StringUtil.toSnakeCase(pk);
                ColumnInfo primaryKey = table.getColumns().get(pk);
                if (primaryKey.getTypeName().equals("CHAR")) {
                    s.add("        whereList.add(\"" + assist.trimedSQL(q) + " = " + assist.trimedSQL(p) + "\");");
                } else {
                    s.add("        whereList.add(\"" + q + " = " + p + "\");");
                }
            }
        }
        if (!isPrimaryKey) {
            for (String key : table.getColumns().keySet()) {
                if (key.length() > 0) {
                    // quoted
                    String q = DataSources.getAssist().quoteEscapedSQL(key);
                    // param
                    String p = ":" + StringUtil.toSnakeCase(key);
                    ColumnInfo column = table.getColumns().get(key);
                    if (column.getTypeName().equals("CHAR")) {
                        s.add("        whereList.add(\"" + assist.trimedSQL(q) + " = " + assist.trimedSQL(p) + "\");");
                    } else {
                        s.add("        whereList.add(\"" + q + " = " + p + "\");");
                    }
                }
            }
        }
        s.add("        String sql = \"\";");
        s.add("        sql += \"SELECT \\n\";");
        boolean isFirst = true;
        for (ColumnInfo columnInfo : table.getColumns().values()) {
            String sql = "    , ";
            if (isFirst) {
                sql = "      ";
            }
            String quoteEscaped = getQuoteEscaped(columnInfo);
            s.add("        sql += \"" + sql + quoteEscaped + " \\n\";");
            isFirst = false;
        }
        s.add("        sql += \"FROM \\n\";");
        s.add("        sql += \"    " + table.getName() + " a \\n\";");
        s.add("        sql += \"WHERE \\n\";");
        s.add("        sql += String.join(\" AND \\n\", whereList);");
        s.add("        Map<String, Object> map = new HashMap<String, Object>();");
        paramCount = 0;
        for (String primaryKey : table.getPrimaryKeys()) {
            if (primaryKey.length() > 0) {
                String snake = StringUtil.toSnakeCase(primaryKey);
                s.add("        map.put(\"" + snake + "\", param" + ++paramCount + ");");
            }
        }
        s.add("        return Queries.get(sql, map, " + e + ".class);");
        s.add("    }");

        javaEntityCRUDInsert(table, s);

        javaEntityCRUDUpdate(table, s);

        javaEntityCRUDDelete(table, s);
    }

    /**
     * @param table
     * @param s
     */
    public static void javaEntityCRUDDelete(final TableInfo table, final List<String> s) {

        //削除フラグがなければdeleteメソッドを出力
        if (!table.getColumns().containsKey(deleteF.toLowerCase())
                && !table.getColumns().containsKey(deleteF.toUpperCase())) {

            String e = StringUtil.toPascalCase(table.getName());
            String i = StringUtil.toCamelCase(table.getName());

            s.add("");
            s.add("    /**");
            s.add("     * " + table.getRemarks() + "削除");
            s.add("     * @return 削除件数");
            s.add("     */");
            s.add("    public int delete() {");

            for (TableInfo child : table.getChilds()) {
                if (StringUtil.isNullOrBlank(deleteF) || (!child.getColumns().containsKey(deleteF.toLowerCase())
                        && !child.getColumns().containsKey(deleteF.toUpperCase()))) {
                    String pascal = StringUtil.toPascalCase(child.getName());
                    String camel = StringUtil.toCamelCase(child.getName());
                    s.add("");
                    s.add("        // " + child.getRemarks() + "の削除");
                    s.add("        if (this." + camel + "s != null) {");
                    s.add("            for (" + pascal + " " + camel + " : this." + camel + "s) {");
                    s.add("                " + camel + ".delete();");
                    s.add("            }");
                    s.add("        }");
                }
            }

            for (TableInfo bro : table.getYoungers()) {
                if (StringUtil.isNullOrBlank(deleteF) || (!bro.getColumns().containsKey(deleteF.toLowerCase())
                        && !bro.getColumns().containsKey(deleteF.toUpperCase()))) {
                    String b = StringUtil.toCamelCase(bro.getName());
                    s.add("");
                    s.add("        // " + bro.getRemarks() + "の削除");
                    s.add("        if (this." + b + " != null) {");
                    s.add("            this." + b + ".delete();");
                    s.add("        }");
                }
            }

            // ファイル列がある場合
            for (String columnName : table.getColumns().keySet()) {
                if (StringUtil.endsWith(inputFileSuffixs, columnName)) {
                    String params = "";
                    for (String primaryKey : table.getPrimaryKeys()) {
                        String camel = StringUtil.toCamelCase(primaryKey);
                        if (params.length() > 0) {
                            params += ", ";
                        }
                        params += "this." + camel;
                    }
                    s.add("");
                    s.add("        " + e + " " + i + " = " + e + ".get(" + params + ");");
                    s.add("        try {");
                    s.add("            java.nio.file.Files.delete(java.nio.file.Paths.get(" + i + "."
                            + StringUtil.toCamelCase(columnName) + "));");
                    s.add("        } catch (Exception e) {");
                    s.add("            throw new jp.co.golorp.emarf.exception.SysError(e);");
                    s.add("        }");
                }
            }

            s.add("");
            s.add("        // " + table.getRemarks() + "の削除");
            s.add("        String sql = \"DELETE FROM " + table.getName() + " WHERE \" + getWhere();");
            s.add("        return Queries.regist(sql, toMap(null, null));");
            s.add("    }");
        }
    }

    /**
     * @param columnInfo
     * @return quoteEscaped
     */
    private static String getQuoteEscaped(final ColumnInfo columnInfo) {

        String columnName = columnInfo.getName();

        String quoteEscaped = "a." + assist.quoteEscapedSQL(columnName);

        if (columnInfo.getTypeName().equals("CHAR")) {

            String trimed = assist.trimedSQL(quoteEscaped);
            quoteEscaped = trimed + " AS " + columnName;

        } else if (StringUtil.endsWith(inputDateSuffixs, columnInfo.getName())) {

            quoteEscaped = assist.date2CharSQL(quoteEscaped) + " AS " + columnName;

        } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnInfo.getName())) {

            quoteEscaped = assist.dateTime2CharSQL(quoteEscaped) + " AS " + columnName;

        } else if (StringUtil.endsWith(inputTimestampSuffixs, columnInfo.getName())) {

            quoteEscaped = assist.timestamp2CharSQL(quoteEscaped) + " AS " + columnName;

        }

        return quoteEscaped;
    }

    /**
     * エンティティにINSERT追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityCRUDInsert(final TableInfo table, final List<String> s) {

        s.add("");
        s.add("    /**");
        s.add("     * " + table.getRemarks() + "追加");
        s.add("     * @param now システム日時");
        s.add("     * @param execId 登録者");
        s.add("     * @return 追加件数");
        s.add("     */");
        s.add("    public int insert(final LocalDateTime now, final String execId) {");

        // 最後のキーを取得
        ColumnInfo lastKeyInfo = null;
        if (table.getPrimaryKeys() != null && table.getPrimaryKeys().size() > 0) {
            List<String> primaryKeys = new ArrayList<String>(table.getPrimaryKeys());
            primaryKeys.remove(tekiyoBi);
            String lastKey = primaryKeys.get(primaryKeys.size() - 1);
            lastKeyInfo = table.getColumns().get(lastKey);
            if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
                s.add("");
                s.add("        // " + lastKeyInfo.getRemarks() + "の採番処理");
                s.add("        numbering();");
            }
        }

        // 子モデル
        for (TableInfo childInfo : table.getChilds()) {
            String childName = childInfo.getName();
            String camel = StringUtil.toCamelCase(childName);
            String pascal = StringUtil.toPascalCase(childName);
            s.add("");
            s.add("        // " + childInfo.getRemarks() + "の登録");
            s.add("        if (this." + camel + "s != null) {");
            s.add("            for (" + pascal + " " + camel + " : this." + camel + "s) {");
            s.add("                if (" + camel + " != null) {");
            for (String primaryKey : table.getPrimaryKeys()) {
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("                    " + camel + ".set" + pascalKey + "(this.get" + pascalKey + "());");
            }
            s.add("                }");
            s.add("                " + camel + ".insert(now, execId);");
            s.add("            }");
            s.add("        }");
        }

        // 兄弟モデル
        for (TableInfo brosInfo : table.getYoungers()) {
            String brosName = brosInfo.getName();
            String camel = StringUtil.toCamelCase(brosName);
            s.add("");
            s.add("        // " + brosInfo.getRemarks() + "の登録");
            s.add("        if (this." + camel + " != null) {");
            for (String primaryKey : table.getPrimaryKeys()) {
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("            this." + camel + ".set" + pascalKey + "(this.get" + pascalKey + "());");
            }
            s.add("            this." + camel + ".insert(now, execId);");
            s.add("        }");
        }

        // 履歴モデル
        if (table.getHistory() != null) {
            String historyName = table.getHistory().getName();
            String camel = StringUtil.toCamelCase(historyName);
            String pascal = StringUtil.toPascalCase(historyName);
            s.add("");
            s.add("        // " + table.getHistory().getRemarks() + "の登録");
            s.add("        " + pascal + " " + camel + " = new " + pascal + "();");
            for (String columnName : table.getColumns().keySet()) {
                String camelColumn = StringUtil.toCamelCase(columnName);
                String pascalColumn = StringUtil.toPascalCase(columnName);
                s.add("        " + camel + ".set" + pascalColumn + "(this." + camelColumn + ");");
            }
            if (!StringUtil.isNullOrBlank(reason)) {
                String p = StringUtil.toCamelCase(reason);
                String a = StringUtil.toPascalCase(reason);
                s.add("        " + camel + ".set" + a + "(this." + p + ");");
            }
            s.add("        " + camel + ".insert(now, execId);");
        }

        s.add("");
        s.add("        // " + table.getRemarks() + "の登録");
        s.add("        String sql = \"INSERT INTO " + table.getName()
                + "(\\r\\n      \" + names() + \"\\r\\n) VALUES (\\r\\n      \" + values() + \"\\r\\n)\";");
        s.add("        return Queries.regist(sql, toMap(now, execId));");
        s.add("    }");
        s.add("");
        s.add("    /** @return insert用のname句 */");
        s.add("    private String names() {");
        s.add("        List<String> nameList = new ArrayList<String>();");
        for (String columnName : table.getColumns().keySet()) {
            String snake = StringUtil.toSnakeCase(columnName);
            s.add("        nameList.add(\"" + assist.quoteEscapedSQL(columnName) + " -- :" + snake + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", nameList);");
        s.add("    }");
        s.add("");
        s.add("    /** @return insert用のvalue句 */");
        s.add("    private String values() {");
        s.add("        List<String> valueList = new ArrayList<String>();");
        for (Entry<String, ColumnInfo> e : table.getColumns().entrySet()) {
            String colName = e.getKey();
            ColumnInfo column = e.getValue();
            String rightHand = getRightHand(colName, column);

            if (!colName.matches("(?i)^" + insertDt + "$") && !colName.matches("(?i)^" + updateDt + "$")
                    && StringUtil.endsWith(inputTimestampSuffixs, colName)) {
                rightHand = assist.toTimestampSQL(assist.timestamp2CharSQL(assist.sysTimestamp()));
            }

            s.add("        valueList.add(\"" + rightHand + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", valueList);");
        s.add("    }");

        if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
            javaEntityCRUDInsertNumbering(table, s, lastKeyInfo);
        }
    }

    /**
     * @param colName
     * @param column
     * @return rightHand
     */
    public static String getRightHand(final String colName, final ColumnInfo column) {

        String rightHand = ":" + StringUtil.toSnakeCase(colName);

        if (column.getDataType().equals("java.time.LocalDate")) {
            rightHand = assist.toDateSQL(rightHand);

        } else if (column.getDataType().equals("java.time.LocalDateTime")) {
            rightHand = assist.toTimestampSQL(rightHand);

        } else if (!column.isPk() && column.getTypeName().equals("CHAR")
                && !StringUtil.isNullOrBlank(charNotNullRe)
                && !column.getName().matches(charNotNullRe)) {
            //主キー以外のCHAR列で、必須CHAR指定に合致しない場合、NULLならスペースを補填する
            rightHand = "NVL (" + rightHand + ", ' ')";

        } else if (!column.isPk() && column.getTypeName().equals("NUMBER")
                && !StringUtil.isNullOrBlank(numberNullableRe)
                && column.getName().matches(numberNullableRe)) {
            //主キー以外のNUMBER列で、非必須INT指定に合致する場合、NULLなら「0」を補填する
            rightHand = "NVL (" + rightHand + ", 0)";
        }

        return rightHand;
    }

    /**
     * エンティティに採番追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     * @param lastKey 最終キー情報
     */
    private static void javaEntityCRUDInsertNumbering(final TableInfo table, final List<String> s,
            final ColumnInfo lastKey) {

        String tableName = table.getName();

        String keyName = lastKey.getName();

        String camel = StringUtil.toCamelCase(keyName);

        String quoted = assist.quoteEscapedSQL(keyName);

        s.add("");
        s.add("    /** " + lastKey.getRemarks() + "の採番処理 */");
        s.add("    private void numbering() {");
        s.add("        if (this." + camel + " != null) {");
        s.add("            return;");
        s.add("        }");

        String numbering = "CASE WHEN MAX(e." + quoted + ") IS NULL THEN 0 ELSE MAX(e." + quoted + ") * 1 END + 1";
        String w = "";
        if (lastKey.getTypeName().equals("CHAR")) {
            int columnSize = lastKey.getColumnSize();
            numbering = "LPAD (" + numbering + ", " + columnSize + ", '0')";
            w = " WHERE e." + quoted + " < '" + new String(new char[columnSize]).replace("\0", "9") + "'";
        }
        s.add("        String sql = \"SELECT " + numbering + " AS " + quoted + " FROM " + tableName + " e" + w + "\";");
        s.add("        Map<String, Object> map = new HashMap<String, Object>();");

        List<String> primaryKeys = new ArrayList<>(table.getPrimaryKeys());
        primaryKeys.remove(tekiyoBi);
        if (primaryKeys.size() > 1) {

            s.add("        List<String> whereList = new ArrayList<String>();");

            // 一つ前までループ
            for (int j = 0; j < primaryKeys.size() - 1; j++) {
                String primaryKey = primaryKeys.get(j);
                String quotedKey = assist.quoteEscapedSQL(primaryKey);
                String snakeKey = StringUtil.toSnakeCase(primaryKey);
                s.add("        whereList.add(\"e." + quotedKey + " = :" + snakeKey + "\");");
            }

            s.add("        sql += \" WHERE \" + String.join(\" AND \", whereList);");

            // 一つ前までループ
            for (int j = 0; j < primaryKeys.size() - 1; j++) {
                String primaryKey = primaryKeys.get(j);
                String snakeKey = StringUtil.toSnakeCase(primaryKey);
                String camelKey = StringUtil.toCamelCase(primaryKey);
                s.add("        map.put(\"" + snakeKey + "\", this." + camelKey + ");");
            }
        }
        s.add("        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);");
        s.add("        Object o = mapList.get(0).get(\"" + keyName + "\");");
        s.add("        this.set" + StringUtil.toPascalCase(keyName) + "(o);");
        s.add("    }");
    }

    /**
     * エンティティにUPDATE追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityCRUDUpdate(final TableInfo table, final List<String> s) {

        s.add("");
        s.add("    /**");
        s.add("     * " + table.getRemarks() + "更新");
        s.add("     * @param now システム日時");
        s.add("     * @param execId 更新者");
        s.add("     * @return 更新件数");
        s.add("     */");
        s.add("    public int update(final LocalDateTime now, final String execId) {");

        // 子モデル
        for (TableInfo child : table.getChilds()) {
            String e = StringUtil.toPascalCase(child.getName());
            String i = StringUtil.toCamelCase(child.getName());
            s.add("");
            s.add("        // " + child.getRemarks() + "の登録");
            s.add("        if (this." + i + "s != null) {");
            s.add("            for (" + e + " " + i + " : this." + i + "s) {");
            s.add("                if (" + i + " == null) {");
            s.add("                    continue;");
            s.add("                }");
            for (String tablePk : table.getPrimaryKeys()) {
                String pk = StringUtil.toCamelCase(tablePk);
                String pkType = StringUtil.toPascalCase(tablePk);
                s.add("                " + i + ".set" + pkType + "(this." + pk + ");");
            }
            s.add("                try {");
            s.add("                    " + i + ".insert(now, execId);");
            s.add("                } catch (Exception e) {");
            s.add("                    " + i + ".update(now, execId);");
            s.add("                }");
            s.add("            }");
            s.add("        }");
        }

        // 兄弟モデル
        for (TableInfo younger : table.getYoungers()) {
            String i = StringUtil.toCamelCase(younger.getName());
            s.add("");
            s.add("        // " + younger.getRemarks() + "の登録");
            s.add("        if (this." + i + " != null) {");
            for (String tablePk : table.getPrimaryKeys()) {
                String pkType = StringUtil.toPascalCase(tablePk);
                s.add("            " + i + ".set" + pkType + "(this.get" + pkType + "());");
            }
            s.add("            try {");
            s.add("                " + i + ".insert(now, execId);");
            s.add("            } catch (Exception e) {");
            s.add("                " + i + ".update(now, execId);");
            s.add("            }");
            s.add("        }");
        }

        // 履歴モデル
        TableInfo history = table.getHistory();
        if (history != null) {
            String e = StringUtil.toPascalCase(history.getName());
            String i = StringUtil.toCamelCase(history.getName());
            s.add("");
            s.add("        // " + history.getRemarks() + "の登録");
            s.add("        " + e + " " + i + " = new " + e + "();");
            for (String columnName : table.getColumns().keySet()) {
                String column = StringUtil.toCamelCase(columnName);
                String columnType = StringUtil.toPascalCase(columnName);
                s.add("        " + i + ".set" + columnType + "(this." + column + ");");
            }
            if (!StringUtil.isNullOrBlank(reason)) {
                String p = StringUtil.toCamelCase(reason);
                String a = StringUtil.toPascalCase(reason);
                s.add("        " + i + ".set" + a + "(this." + p + ");");
            }
            s.add("        " + i + ".insert(now, execId);");
        }

        s.add("");
        s.add("        // " + table.getRemarks() + "の登録");
        s.add("        String sql = \"UPDATE " + table.getName()
                + "\\r\\nSET\\r\\n      \" + getSet() + \"\\r\\nWHERE\\r\\n    \" + getWhere();");
        s.add("        return Queries.regist(sql, toMap(now, execId));");
        s.add("    }");
        s.add("");
        s.add("    /** @return update用のset句 */");
        s.add("    private String getSet() {");
        s.add("        List<String> setList = new ArrayList<String>();");

        for (Entry<String, ColumnInfo> e : table.getColumns().entrySet()) {
            String colName = e.getKey();
            ColumnInfo column = e.getValue();

            // 追加時のメタ情報ならスキップ
            if (colName.matches("(?i)^" + insertDt + "$") || colName.matches("(?i)^" + insertBy + "$")) {
                continue;
            }

            String rightHand = getRightHand(colName, column);
            s.add("        setList.add(\"" + assist.quoteEscapedSQL(colName) + " = " + rightHand + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", setList);");
        s.add("    }");
    }

    /**
     * エンティティにCRUD用ユーティリティ追加
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityUtil(final TableInfo tableInfo, final List<String> s) {

        s.add("");
        s.add("    /** @return where句 */");
        s.add("    private String getWhere() {");
        s.add("        List<String> whereList = new ArrayList<String>();");

        // 主キー条件
        for (String primaryKey : tableInfo.getPrimaryKeys()) {

            if (primaryKey.length() == 0) {
                continue;
            }

            // quoted
            String q = assist.quoteEscapedSQL(primaryKey);
            // param
            String p = ":" + StringUtil.toSnakeCase(primaryKey);

            ColumnInfo primaryKeyInfo = tableInfo.getColumns().get(primaryKey);
            if (primaryKeyInfo.getTypeName().equals("CHAR")) {
                s.add("        whereList.add(\"" + assist.trimedSQL(q) + " = " + assist.trimedSQL(p) + "\");");
            } else {
                s.add("        whereList.add(\"" + q + " = " + p + "\");");
            }
        }

        // 楽観ロック
        ColumnInfo columnInfo = tableInfo.getColumns().get(updateDt);
        if (columnInfo != null) {

            String rightHand = "'\" + this." + StringUtil.toCamelCase(updateDt) + " + \"'";
            if (columnInfo.getDataType().equals("java.time.LocalDateTime")) {
                rightHand = assist.toTimestampSQL(rightHand);
            }

            s.add("        whereList.add(\"" + assist.quoteEscapedSQL(updateDt) + " = " + rightHand + "\");");
        }

        s.add("        return String.join(\" AND \", whereList);");
        s.add("    }");

        // toMap
        s.add("");
        s.add("    /**");
        s.add("     * @param now システム日時");
        s.add("     * @param execId 実行ID");
        s.add("     * @return マップ化したエンティティ");
        s.add("     */");
        s.add("    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {");
        s.add("        Map<String, Object> map = new HashMap<String, Object>();");
        for (String columnName : tableInfo.getColumns().keySet()) {
            boolean isInsertDt = columnName.matches("(?i)^" + insertDt + "$");
            boolean isUpdateDt = columnName.matches("(?i)^" + updateDt + "$");
            boolean isInsertBy = columnName.matches("(?i)^" + insertBy + "$");
            boolean isUpdateBy = columnName.matches("(?i)^" + updateBy + "$");
            if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy) {
                continue;
            }
            String snake = StringUtil.toSnakeCase(columnName);
            String p = StringUtil.toCamelCase(columnName);
            p = p.replaceAll("#", "_");
            s.add("        map.put(\"" + snake + "\", this." + p + ");");
        }
        s.add("        map.put(\"" + StringUtil.toSnakeCase(insertDt) + "\", now);");
        s.add("        map.put(\"" + StringUtil.toSnakeCase(insertBy) + "\", execId);");
        String now = "now";
        if (!StringUtil.isNullOrBlank(updateDtFormat)) {
            now = "jp.co.golorp.emarf.time.DateTimeUtil.format(\"" + updateDtFormat + "\", now)";
        }
        s.add("        map.put(\"" + StringUtil.toSnakeCase(updateDt) + "\", " + now + ");");
        s.add("        map.put(\"" + StringUtil.toSnakeCase(updateBy) + "\", execId);");
        s.add("        return map;");
        s.add("    }");
    }

    /**
     * エンティティに弟モデル追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     * @param jsonIndex
     * @return int
     */
    private static int javaEntityYoungers(final TableInfo table, final List<String> s, final int jsonIndex) {

        int i = jsonIndex;

        // getパラメータ
        String params = "";
        for (String pk : table.getPrimaryKeys()) {
            if (pk.length() > 0) {
                if (params.length() > 0) {
                    params += ", ";
                }
                params += "this." + StringUtil.toCamelCase(pk);
            }
        }

        for (TableInfo younger : table.getYoungers()) {

            String ent = StringUtil.toPascalCase(younger.getName());
            String ins = StringUtil.toCamelCase(younger.getName());

            s.add("");
            s.add("    /** " + younger.getRemarks() + " */");
            s.add("    private " + ent + " " + ins + ";");
            s.add("");
            s.add("    /** @return " + younger.getRemarks() + " */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(value = \"" + ent + "\", index = " + ++i + ")");
            s.add("    public " + ent + " get" + ent + "() {");
            s.add("        return this." + ins + ";");
            s.add("    }");
            s.add("");
            s.add("    /** @param p " + younger.getRemarks() + " */");
            s.add("    public void set" + ent + "(final " + ent + " p) {");
            s.add("        this." + ins + " = p;");
            s.add("    }");
            s.add("");
            s.add("    /** @return " + younger.getRemarks() + " */");
            s.add("    public " + ent + " refer" + ent + "() {");
            s.add("        if (this." + ins + " == null) {");
            s.add("            try {");
            s.add("                this." + ins + " = " + ent + ".get(" + params + ");");
            s.add("            } catch (jp.co.golorp.emarf.exception.NoDataError e) {");
            s.add("            }");
            s.add("        }");
            s.add("        return this." + ins + ";");
            s.add("    }");
        }

        return i;
    }

    /**
     * エンティティに子モデル追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     * @param jsonIndex
     * @return int
     */
    private static int javaEntityChild(final TableInfo table, final List<String> s, final int jsonIndex) {

        int i = jsonIndex;

        String parent = StringUtil.toPascalCase(table.getName());

        String params = "";
        for (String pk : table.getPrimaryKeys()) {
            if (pk.length() > 0) {
                if (params.length() > 0) {
                    params += ", ";
                }
                params += "this." + StringUtil.toCamelCase(pk);
            }
        }

        for (TableInfo child : table.getChilds()) {
            String ent = StringUtil.toPascalCase(child.getName());
            String ins = StringUtil.toCamelCase(child.getName());
            s.add("");
            s.add("    /** " + child.getRemarks() + "のリスト */");
            s.add("    private List<" + ent + "> " + ins + "s;");
            s.add("");
            s.add("    /** @return " + child.getRemarks() + "のリスト */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(value = \"" + ent + "s\", index = " + ++i + ")");
            s.add("    public List<" + ent + "> get" + ent + "s() {");
            s.add("        return this." + ins + "s;");
            s.add("    }");
            s.add("");
            s.add("    /** @param list " + child.getRemarks() + "のリスト */");
            s.add("    public void set" + ent + "s(final List<" + ent + "> list) {");
            s.add("        this." + ins + "s = list;");
            s.add("    }");
            s.add("");
            s.add("    /** @param " + ins + " */");
            s.add("    public void add" + ent + "s(final " + ent + " " + ins + ") {");
            s.add("        if (this." + ins + "s == null) {");
            s.add("            this." + ins + "s = new ArrayList<" + ent + ">();");
            s.add("        }");
            s.add("        this." + ins + "s.add(" + ins + ");");
            s.add("    }");
            s.add("");
            s.add("    /** @return " + child.getRemarks() + "のリスト */");
            s.add("    public List<" + ent + "> refer" + ent + "s() {");
            s.add("        this." + ins + "s = " + parent + ".refer" + ent + "s(" + params + ");");
            s.add("        return this." + ins + "s;");
            s.add("    }");

            // refer
            s.add("");
            s.add("    /**");
            int paramIndex = 0;
            String pks = "";
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                String property = StringUtil.toCamelCase(pk);
                s.add("     * @param param" + ++paramIndex + " " + property);
                if (pks.length() > 0) {
                    pks += ", ";
                }
                ColumnInfo column = table.getColumns().get(pk);
                pks += "final " + column.getDataType() + " param" + paramIndex;
            }
            s.add("     * @return List<" + ent + ">");
            s.add("     */");
            s.add("    public static List<" + ent + "> refer" + ent + "s(" + pks + ") {");
            s.add("        List<String> whereList = new ArrayList<String>();");
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                String p = ":" + StringUtil.toSnakeCase(pk);
                ColumnInfo primaryKey = table.getColumns().get(pk);
                if (primaryKey.getTypeName().equals("CHAR")) {
                    s.add("        whereList.add(\"" + assist.trimedSQL(pk) + " = " + assist.trimedSQL(p) + "\");");
                } else if (!pk.equals(tekiyoBi)) {
                    s.add("        whereList.add(\"" + pk + " = " + p + "\");");
                    //                } else {
                    //                    s.add("        whereList.add(\"" + getTekiyoBiSql(child, pk, p) + "\");");
                }
            }

            //カラム名を列挙
            s.add("        String sql = \"SELECT \";");
            int cols = 0;
            int refs = 0;
            for (ColumnInfo column : child.getColumns().values()) {
                String quoteEscaped = assist.quoteEscapedSQL(column.getName());
                //時間サフィックスに合致する場合、データソースがOracleならTO_CHAR
                if (StringUtil.endsWith(inputDateSuffixs, column.getName())) {
                    quoteEscaped = assist.date2CharSQL(quoteEscaped) + " AS " + column.getName();
                } else if (StringUtil.endsWith(inputHourSuffixs, column.getName())) {
                    quoteEscaped = assist.time2CharSQL(quoteEscaped) + " AS " + column.getName();
                } else if (StringUtil.endsWith(inputDateTimeSuffixs, column.getName())) {
                    quoteEscaped = assist.dateTime2CharSQL(quoteEscaped) + " AS " + column.getName();
                } else if (StringUtil.endsWith(inputTimestampSuffixs, column.getName())) {
                    quoteEscaped = assist.timestamp2CharSQL(quoteEscaped) + " AS " + column.getName();
                }
                if (cols == 0) {
                    s.add("        sql += \"" + quoteEscaped + "\";");
                } else {
                    s.add("        sql += \", " + quoteEscaped + "\";");
                }
                ++cols;
                // 列の参照モデル情報があればカラム名の補完
                if (column.getRefer() != null) {
                    String meiSql = SqlGenerator.getMeiSql(refs, table, column);
                    if (meiSql != null) {
                        ++refs;
                        meiSql = meiSql.replaceAll("\"", "\\\\\"");
                        s.add("        sql += \"" + meiSql + "\";");
                    }
                }
            }
            s.add("        sql += \" FROM " + child.getName() + " a WHERE \" + String.join(\" AND \", whereList);");
            s.add("        sql += \" ORDER BY \";");
            String orders = "";
            if (child.getPrimaryKeys().size() > 0) {
                for (String pk : child.getPrimaryKeys()) {
                    if (orders.length() > 0) {
                        orders += ", ";
                    }
                    orders += pk;
                }
            } else {
                for (paramIndex = 1; paramIndex <= child.getColumns().size(); paramIndex++) {
                    if (paramIndex == 1) {
                        orders += ", ";
                    }
                    orders += paramIndex;
                }
            }
            s.add("        sql += \"" + orders + "\";");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            paramIndex = 0;
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                s.add("        map.put(\"" + StringUtil.toSnakeCase(pk) + "\", param" + ++paramIndex + ");");
            }
            s.add("        return Queries.select(sql, map, " + ent + ".class, null, null);");
            s.add("    }");
        }

        return i;
    }

    //    /**
    //     * @param child
    //     * @param colName
    //     * @param param
    //     * @return String
    //     */
    //    private static String getTekiyoBiSql(final TableInfo child, final String colName, final String param) {
    //
    //        String sql = colName + " = (";
    //
    //        sql += "SELECT DISTINCT MAX (a2." + colName + ") OVER (PARTITION BY ";
    //
    //        String cKeys = "";
    //        for (String cPk : child.getPrimaryKeys()) {
    //            if (cPk.equals(tekiyoBi)) {
    //                continue;
    //            }
    //            if (cKeys.length() > 0) {
    //                cKeys += ", ";
    //            }
    //            cKeys += "a2." + cPk;
    //        }
    //        sql += cKeys;
    //
    //        sql += ") ";
    //        sql += "FROM " + child.getName() + " a2 ";
    //        sql += "WHERE ";
    //
    //        cKeys = "";
    //        for (String cPk : child.getPrimaryKeys()) {
    //            if (cKeys.length() > 0) {
    //                cKeys += " AND ";
    //            }
    //            if (cPk.equals(tekiyoBi)) {
    //                cKeys += "a2." + cPk + " <= " + param;
    //            } else {
    //                cKeys += "a2." + cPk + " = a." + cPk;
    //            }
    //        }
    //        sql += cKeys;
    //
    //        sql += ")";
    //
    //        return sql;
    //    }

    /**
     * 一覧画面の一括削除処理
     * @param s
     * @param p
     * @param childs
     * @param indent
     */
    public static void getDeleteChilds(final List<String> s, final String p, final List<TableInfo> childs,
            final int indent) {

        String sp = "    ".repeat(indent);

        for (TableInfo child : childs) {

            if (!StringUtil.isNullOrBlank(deleteF) && (child.getColumns().containsKey(deleteF.toLowerCase())
                    || child.getColumns().containsKey(deleteF.toUpperCase()))) {
                continue;
            }

            s.add("");

            // entity
            String e = StringUtil.toPascalCase(child.getName());

            // instance
            String i = StringUtil.toCamelCase(child.getName());

            int parents = child.getParents().size();
            if (parents == 1) {

                s.add(sp + "        java.util.List<" + pkgE + "." + e + "> " + i + "s = " + p + ".refer" + e + "s();");
                s.add(sp + "        if (" + i + "s != null) {");
                s.add(sp + "            for (" + pkgE + "." + e + " " + i + " : " + i + "s) {");
                if (child.getChilds().size() > 0) {
                    // forでもう一段降りているから「+2」
                    getDeleteChilds(s, i, child.getChilds(), indent + 2);
                }
                s.add("");
                s.add(sp + "                if (" + i + ".delete() != 1) {");
                s.add(sp + "                    throw new OptLockError(\"error.cant.delete\");");
                s.add(sp + "                }");
                s.add(sp + "            }");
                s.add(sp + "        }");

            } else {

                s.add(sp + "        // child:" + e + ", parents:" + parents);
            }

            s.add("");
        }
    }

    /**
     * 一覧画面の一括承認処理
     * @param s
     * @param parent
     * @param childs
     * @param indent
     */
    public static void getPermitChilds(final List<String> s, final String parent, final List<TableInfo> childs,
            final int indent) {

        // indent
        String p = "    ".repeat(indent);

        for (TableInfo child : childs) {

            // entity
            String e = StringUtil.toPascalCase(child.getName());

            // instance
            String i = StringUtil.toCamelCase(child.getName());

            s.add("");

            int parents = child.getParents().size();
            if (parents > 1) {
                s.add(p + "        // child:" + e + ", parents:" + parents);
                continue;
            }

            s.add(p + "        java.util.List<" + pkgE + "." + e + "> " + i + "s = " + parent + ".refer" + e + "s();");
            s.add(p + "        if (" + i + "s != null) {");
            s.add(p + "            for (" + pkgE + "." + e + " " + i + " : " + i + "s) {");
            if (child.getChilds().size() > 0) {
                // forでもう一段降りているから「+2」
                getPermitChilds(s, i, child.getChilds(), indent + 2);
            }
            s.add("");
            if (child.getColumns().containsKey(status.toLowerCase())
                    || child.getColumns().containsKey(status.toUpperCase())) {
                s.add(p + "                " + i + ".set" + StringUtil.toPascalCase(status) + "(1);");
            }
            s.add(p + "                if (" + i + ".update(now, execId) != 1) {");
            s.add(p + "                    throw new OptLockError(\"error.cant.permit\");");
            s.add(p + "                }");
            s.add(p + "            }");
            s.add(p + "        }");
        }
    }

    /**
     * 一覧画面の一括否認処理
     * @param s
     * @param parent
     * @param childs
     * @param indent
     */
    public static void getForbidChilds(final List<String> s, final String parent,
            final List<TableInfo> childs, final int indent) {

        // indent
        String p = "    ".repeat(indent);

        for (TableInfo child : childs) {

            // entity
            String e = StringUtil.toPascalCase(child.getName());

            // instance
            String i = StringUtil.toCamelCase(child.getName());

            s.add("");

            int parents = child.getParents().size();
            if (parents > 1) {
                s.add(p + "        // child:" + e + ", parents:" + parents);
                continue;
            }

            s.add(p + "        java.util.List<" + pkgE + "." + e + "> " + i + "s = " + parent + ".refer" + e + "s();");
            s.add(p + "        if (" + i + "s != null) {");
            s.add(p + "            for (" + pkgE + "." + e + " " + i + " : " + i + "s) {");
            if (child.getChilds().size() > 0) {
                // forでもう一段降りているから「+2」
                getForbidChilds(s, i, child.getChilds(), indent + 2);
            }
            s.add("");
            if (child.getColumns().containsKey(status.toLowerCase())
                    || child.getColumns().containsKey(status.toUpperCase())) {
                s.add(p + "                " + i + ".set" + StringUtil.toPascalCase(status) + "(-1);");
            }
            s.add(p + "                if (" + i + ".update(now, execId) != 1) {");
            s.add(p + "                    throw new OptLockError(\"error.cant.forbid\");");
            s.add(p + "                }");
            s.add(p + "            }");
            s.add(p + "        }");
        }
    }

    /**
     * javaファイルをコンパイル
     * @param javaFilePath javaファイルパス
     * @param className クラス名
     */
    public static void javaCompile(final String javaFilePath, final String className) {

        // 出力ディレクトリ
        String dstDir = projectDir + File.separator + javaDir;

        // クラスパス
        String classPath = System.getProperty("java.class.path", null);

        // 参照ライブラリ
        String pathes = "";
        File classes = new File(BeanGenerator.class.getResource("/").getPath());
        File lib = new File(classes.getParentFile().getAbsolutePath() + File.separator + "lib");
        File[] files = lib.listFiles();
        if (files != null) {
            for (File file : files) {
                pathes += ";" + file.getAbsolutePath();
            }
        }

        // コンパイル
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        String[] args = {
                "-d", dstDir,
                "-sourcepath", dstDir,
                "-classpath", classPath + pathes,
                //new File(src, clsName + ".java").getAbsolutePath()
                javaFilePath
        };
        int result = compiler.run(null, null, null, args);
        if (result == 0) {
            LOG.info("compile success. [" + javaFilePath + "]");
        } else {
            LOG.error("compile failure. [" + javaFilePath + "]");
        }

        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new SysError(e);
        }
    }

}
