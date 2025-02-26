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
    /** 登録日時カラム名 */
    private static String insertDt;
    /** 登録者カラム名 */
    private static String insertBy;
    /** 更新日時カラム名 */
    private static String updateDt;
    /** 更新者カラム名 */
    private static String updateBy;
    /** 変更理由 */
    private static String reason;

    /** javaファイル出力ルートパス */
    private static String javaDir;

    /** actionパッケージ */
    private static String pkgAction;
    /** entityパッケージ */
    private static String pkgEntity;

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

        insertDt = bundle.getString("column.insert.timestamp");
        insertBy = bundle.getString("column.insert.id");
        updateDt = bundle.getString("column.update.timestamp");
        updateBy = bundle.getString("column.update.id");
        reason = bundle.getString("column.history.reason");

        javaDir = bundle.getString("dir.java");

        pkgAction = bundle.getString("java.package.action") + ".model.base";
        pkgEntity = bundle.getString("java.package.entity");

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
        inputTimeSuffixs = bundle.getString("input.time.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("input.file.suffixs").split(",");

        /*
         * 出力フォルダ再作成
         */

        //エンティティフォルダ
        String entityPackagePath = pkgEntity.replace(".", File.separator);
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

        String pkgPath = pkgEntity.replace(".", File.separator);
        String pkgDir = projectDir + File.separator + javaDir + File.separator + pkgPath;
        Map<String, String> paths = new LinkedHashMap<String, String>();
        for (TableInfo table : tables) {
            String e = StringUtil.toPascalCase(table.getName());
            String r = table.getRemarks();
            List<String> s = new ArrayList<String>();
            s.add("package " + pkgEntity + ";");
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
            if (table.getColumnInfos().get("ID") == null) {
                s.add("");
                s.add("    /** SlickGridのDataView用ID */");
                s.add("    private Integer id;");
                s.add("");
                s.add("    /** @return id */");
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
            for (ColumnInfo column : table.getColumnInfos().values()) {
                String n = column.getName();
                String m = column.getRemarks();
                String p = StringUtil.toCamelCase(n);
                String a = StringUtil.toPascalCase(n);
                String t = column.getDataType();
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
                s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + n + "\")");
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
                    s.add("            this." + p + " = " + t + ".parse(o.toString());");
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
                if (column.getReferInfo() != null) {
                    addSanshoMei(s, table, column);
                }
            }
            if (table.getHistoryInfo() != null && !StringUtil.isNullOrBlank(reason)) {
                addHistoryReason(s);
            }
            javaEntityCRUD(table, s);
            javaEntityUtil(table, s);
            javaEntityBros(table, s);
            javaEntityChild(table, s);
            s.add("}");
            String path = pkgDir + File.separator + e + ".java";
            FileUtil.writeFile(path, s);
            paths.put(path, pkgEntity + "." + e);
        }
        if (isGenerateAtStartup) {
            for (Entry<String, String> e : paths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * @param s
     */
    public static void addHistoryReason(final List<String> s) {
        String p = StringUtil.toCamelCase(reason);
        String a = StringUtil.toPascalCase(reason);
        s.add("");
        s.add("    /** " + p + " */");
        s.add("    private String " + p + ";");
        s.add("");
        s.add("    /** @return " + p + " */");
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
     */
    private static void addSanshoMei(final List<String> s, final TableInfo table, final ColumnInfo column) {

        String columnMei = column.getRemarks();

        //参照ペアを取得
        String meiSql = SqlGenerator.getMeiSql(0, table, column);
        if (meiSql != null) {

            int i = meiSql.lastIndexOf(" AS ") + 4;

            //参照ペアがあるが名称カラムがなければ追加
            String meiColumnName = meiSql.substring(i).replaceAll("[ \"`]", "");
            String meiProperty = StringUtil.toCamelCase(meiColumnName);
            String meiAccessor = StringUtil.toPascalCase(meiColumnName);
            s.add("");
            s.add("    /** " + columnMei + "参照 */");
            s.add("    private String " + meiProperty + ";");
            s.add("");
            s.add("    /** @return " + columnMei + "参照 */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + meiColumnName + "\")");
            s.add("    public String get" + meiAccessor + "() {");
            s.add("        return this." + meiProperty + ";");
            s.add("    }");
            s.add("");
            s.add("    /** @param o " + columnMei + "参照 */");
            s.add("    public void set" + meiAccessor + "(final Object o) {");
            s.add("        if (o != null) {");
            s.add("            this." + meiProperty + " = o.toString();");
            s.add("        } else {");
            s.add("            this." + meiProperty + " = null;");
            s.add("        }");
            s.add("    }");
        }
    }

    /**
     * エンティティにCRUD追加
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityCRUD(final TableInfo tableInfo, final List<String> s) {

        String tableName = tableInfo.getName();
        String remarks = tableInfo.getRemarks();
        String entityName = StringUtil.toPascalCase(tableName);
        String camelName = StringUtil.toCamelCase(tableName);

        s.add("");
        s.add("    /**");
        s.add("     * " + remarks + "照会");
        int i = 0;
        String getParams = "";
        for (String pk : tableInfo.getPrimaryKeys()) {
            if (pk.length() > 0) {
                String columnRemarks = "";
                if (tableInfo.getColumnInfos() != null && tableInfo.getColumnInfos().size() > 0) {
                    if (tableInfo.getColumnInfos().containsKey(pk)) {
                        columnRemarks = " " + tableInfo.getColumnInfos().get(pk).getRemarks();
                    }
                }
                s.add("     * @param param" + ++i + columnRemarks);
                if (getParams.length() > 0) {
                    getParams += ", ";
                }
                getParams += "final Object param" + i;
            }
        }
        s.add("     * @return " + remarks);
        s.add("     */");
        s.add("    public static " + entityName + " get(" + getParams + ") {");
        s.add("        List<String> whereList = new ArrayList<String>();");

        // 主キー条件
        boolean isPrimaryKey = false;
        for (String primaryKey : tableInfo.getPrimaryKeys()) {
            if (primaryKey.length() > 0) {
                isPrimaryKey = true;
                String snake = StringUtil.toSnakeCase(primaryKey);
                ColumnInfo primaryKeyInfo = tableInfo.getColumnInfos().get(primaryKey);
                String columnName = DataSources.getAssist().quoteEscapedSQL(primaryKey);
                if (primaryKeyInfo.getTypeName().equals("CHAR")) {
                    s.add("        whereList.add(\"TRIM (" + columnName + ") = TRIM (:" + snake + ")\");");
                } else {
                    s.add("        whereList.add(\"" + columnName + " = :" + snake + "\");");
                }
            }
        }
        if (!isPrimaryKey) {
            for (String key : tableInfo.getColumnInfos().keySet()) {
                if (key.length() > 0) {
                    String snake = StringUtil.toSnakeCase(key);
                    ColumnInfo keyInfo = tableInfo.getColumnInfos().get(key);
                    String columnName = DataSources.getAssist().quoteEscapedSQL(key);
                    if (keyInfo.getTypeName().equals("CHAR")) {
                        s.add("        whereList.add(\"TRIM (" + columnName + ") = TRIM (:" + snake + ")\");");
                    } else {
                        s.add("        whereList.add(\"" + columnName + " = :" + snake + "\");");
                    }
                }
            }
        }
        s.add("        String sql = \"\";");
        s.add("        sql += \"SELECT \\n\";");
        boolean isFirst = true;
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
            String sql = "    , ";
            if (isFirst) {
                sql = "      ";
            }
            String quoteEscaped = getQuoteEscaped(columnInfo);
            s.add("        sql += \"" + sql + quoteEscaped + " \\n\";");
            isFirst = false;
        }
        s.add("        sql += \"FROM \\n\";");
        s.add("        sql += \"    " + tableName + " a \\n\";");
        s.add("        sql += \"WHERE \\n\";");
        s.add("        sql += String.join(\" AND \\n\", whereList);");
        s.add("        Map<String, Object> map = new HashMap<String, Object>();");
        i = 0;
        for (String primaryKey : tableInfo.getPrimaryKeys()) {
            if (primaryKey.length() > 0) {
                String snake = StringUtil.toSnakeCase(primaryKey);
                s.add("        map.put(\"" + snake + "\", param" + ++i + ");");
            }
        }
        s.add("        return Queries.get(sql, map, " + entityName + ".class);");
        s.add("    }");
        javaEntityCRUDInsert(tableInfo, s);
        javaEntityCRUDUpdate(tableInfo, s);
        s.add("");
        s.add("    /**");
        s.add("     * " + remarks + "削除");
        s.add("     * @return 削除件数");
        s.add("     */");
        s.add("    public int delete() {");
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getName();
            String pascal = StringUtil.toPascalCase(childName);
            String camel = StringUtil.toCamelCase(childName);
            s.add("");
            s.add("        // " + childInfo.getRemarks() + "の削除");
            s.add("        if (this." + camel + "s != null) {");
            s.add("            for (" + pascal + " " + camel + " : this." + camel + "s) {");
            s.add("                " + camel + ".delete();");
            s.add("            }");
            s.add("        }");
        }
        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
            String brosName = brosInfo.getName();
            String camel = StringUtil.toCamelCase(brosName);
            s.add("");
            s.add("        // " + brosInfo.getRemarks() + "の削除");
            s.add("        if (this." + camel + " != null) {");
            s.add("            this." + camel + ".delete();");
            s.add("        }");
        }
        // ファイル列がある場合
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            if (StringUtil.endsWith(inputFileSuffixs, columnName)) {
                String params = "";
                for (String primaryKey : tableInfo.getPrimaryKeys()) {
                    String camel = StringUtil.toCamelCase(primaryKey);
                    if (params.length() > 0) {
                        params += ", ";
                    }
                    params += "this." + camel;
                }
                s.add("");
                s.add("        " + entityName + " " + camelName + " = " + entityName + ".get(" + params + ");");
                s.add("        try {");
                s.add("            java.nio.file.Files.delete(java.nio.file.Paths.get(" + camelName + "."
                        + StringUtil.toCamelCase(columnName) + "));");
                s.add("        } catch (Exception e) {");
                s.add("            throw new jp.co.golorp.emarf.exception.SysError(e);");
                s.add("        }");
            }
        }
        s.add("");
        s.add("        // " + remarks + "の削除");
        s.add("        String sql = \"DELETE FROM " + tableName + " WHERE \" + getWhere();");
        s.add("        return Queries.regist(sql, toMap(null, null));");
        s.add("    }");
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
            List<String> primaryKeys = table.getPrimaryKeys();
            String lastKey = primaryKeys.get(primaryKeys.size() - 1);
            lastKeyInfo = table.getColumnInfos().get(lastKey);
            if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
                s.add("");
                s.add("        // " + lastKeyInfo.getRemarks() + "の採番処理");
                s.add("        numbering();");
            }
        }

        // 子モデル
        for (TableInfo childInfo : table.getChildInfos()) {
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
        for (TableInfo brosInfo : table.getBrosInfos()) {
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
        if (table.getHistoryInfo() != null) {
            String historyName = table.getHistoryInfo().getName();
            String camel = StringUtil.toCamelCase(historyName);
            String pascal = StringUtil.toPascalCase(historyName);
            s.add("");
            s.add("        // " + table.getHistoryInfo().getRemarks() + "の登録");
            s.add("        " + pascal + " " + camel + " = new " + pascal + "();");
            for (String columnName : table.getColumnInfos().keySet()) {
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
        for (String columnName : table.getColumnInfos().keySet()) {
            String snake = StringUtil.toSnakeCase(columnName);
            s.add("        nameList.add(\"" + assist.quoteEscapedSQL(columnName) + " -- :" + snake + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", nameList);");
        s.add("    }");
        s.add("");
        s.add("    /** @return insert用のvalue句 */");
        s.add("    private String values() {");
        s.add("        List<String> valueList = new ArrayList<String>();");
        for (Entry<String, ColumnInfo> e : table.getColumnInfos().entrySet()) {
            String columnName = e.getKey();
            ColumnInfo columnInfo = e.getValue();
            String rightHand = getRightHand(columnName, columnInfo);
            s.add("        valueList.add(\"" + rightHand + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", valueList);");
        s.add("    }");

        if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
            javaEntityCRUDInsertNumbering(table, s, lastKeyInfo);
        }
    }

    /**
     * @param columnName
     * @param columnInfo
     * @return rightHand
     */
    public static String getRightHand(final String columnName, final ColumnInfo columnInfo) {

        String rightHand = ":" + StringUtil.toSnakeCase(columnName);

        if (columnInfo.getDataType().equals("java.time.LocalDate")) {
            rightHand = assist.toDateSQL(rightHand);

        } else if (columnInfo.getDataType().equals("java.time.LocalDateTime")) {
            rightHand = assist.toTimestampSQL(rightHand);

        } else if (!columnInfo.isPk() && columnInfo.getTypeName().equals("CHAR")
                && !StringUtil.isNullOrBlank(charNotNullRe)
                && !columnInfo.getName().matches(charNotNullRe)) {
            //主キー以外のCHAR列で、必須CHAR指定に合致しない場合、NULLならスペースを補填する
            rightHand = "NVL (" + rightHand + ", ' ')";

        } else if (!columnInfo.isPk() && columnInfo.getTypeName().equals("NUMBER")
                && !StringUtil.isNullOrBlank(numberNullableRe)
                && columnInfo.getName().matches(numberNullableRe)) {
            //主キー以外のNUMBER列で、非必須INT指定に合致する場合、NULLなら「0」を補填する
            rightHand = "NVL (" + rightHand + ", 0)";
        }

        return rightHand;
    }

    /**
     * エンティティに採番追加
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     * @param lastKeyInfo 最終キー情報
     */
    private static void javaEntityCRUDInsertNumbering(final TableInfo tableInfo, final List<String> s,
            final ColumnInfo lastKeyInfo) {

        String tableName = tableInfo.getName();

        String keyName = lastKeyInfo.getName();

        String camel = StringUtil.toCamelCase(keyName);

        String quoted = assist.quoteEscapedSQL(keyName);

        s.add("");
        s.add("    /** " + lastKeyInfo.getRemarks() + "の採番処理 */");
        s.add("    private void numbering() {");
        s.add("        if (this." + camel + " != null) {");
        s.add("            return;");
        s.add("        }");

        String numbering = "CASE WHEN MAX(e." + quoted + ") IS NULL THEN 0 ELSE MAX(e." + quoted + ") * 1 END + 1";
        String w = "";
        if (lastKeyInfo.getTypeName().equals("CHAR")) {
            int columnSize = lastKeyInfo.getColumnSize();
            numbering = "LPAD (" + numbering + ", " + columnSize + ", '0')";
            w = " WHERE e." + quoted + " < '" + new String(new char[columnSize]).replace("\0", "9") + "'";
        }
        s.add("        String sql = \"SELECT " + numbering + " AS " + quoted + " FROM " + tableName + " e" + w + "\";");
        s.add("        Map<String, Object> map = new HashMap<String, Object>();");

        if (tableInfo.getPrimaryKeys().size() > 1) {

            s.add("        List<String> whereList = new ArrayList<String>();");

            // 一つ前までループ
            for (int j = 0; j < tableInfo.getPrimaryKeys().size() - 1; j++) {
                String primaryKey = tableInfo.getPrimaryKeys().get(j);
                String quotedKey = assist.quoteEscapedSQL(primaryKey);
                String snakeKey = StringUtil.toSnakeCase(primaryKey);
                s.add("        whereList.add(\"e." + quotedKey + " = :" + snakeKey + "\");");
            }

            s.add("        sql += \" WHERE \" + String.join(\" AND \", whereList);");

            // 一つ前までループ
            for (int j = 0; j < tableInfo.getPrimaryKeys().size() - 1; j++) {
                String primaryKey = tableInfo.getPrimaryKeys().get(j);
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
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityCRUDUpdate(final TableInfo tableInfo, final List<String> s) {

        s.add("");
        s.add("    /**");
        s.add("     * " + tableInfo.getRemarks() + "更新");
        s.add("     * @param now システム日時");
        s.add("     * @param execId 更新者");
        s.add("     * @return 更新件数");
        s.add("     */");
        s.add("    public int update(final LocalDateTime now, final String execId) {");

        // 子モデル
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getName();
            String child = StringUtil.toCamelCase(childName);
            String childType = StringUtil.toPascalCase(childName);
            s.add("");
            s.add("        // " + childInfo.getRemarks() + "の登録");
            s.add("        if (this." + child + "s != null) {");
            s.add("            for (" + childType + " " + child + " : this." + child + "s) {");
            s.add("                if (" + child + " == null) {");
            s.add("                    continue;");
            s.add("                }");
            for (String tablePk : tableInfo.getPrimaryKeys()) {
                String pk = StringUtil.toCamelCase(tablePk);
                String pkType = StringUtil.toPascalCase(tablePk);
                s.add("                " + child + ".set" + pkType + "(this." + pk + ");");
            }
            s.add("                try {");
            s.add("                    " + child + ".insert(now, execId);");
            s.add("                } catch (Exception e) {");
            s.add("                    " + child + ".update(now, execId);");
            s.add("                }");
            s.add("            }");
            s.add("        }");
        }

        // 兄弟モデル
        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
            String brosType = StringUtil.toCamelCase(brosInfo.getName());
            s.add("");
            s.add("        // " + brosInfo.getRemarks() + "の登録");
            s.add("        if (this." + brosType + " != null) {");
            for (String tablePk : tableInfo.getPrimaryKeys()) {
                String pkType = StringUtil.toPascalCase(tablePk);
                s.add("            " + brosType + ".set" + pkType + "(this.get" + pkType + "());");
            }
            s.add("            try {");
            s.add("                " + brosType + ".insert(now, execId);");
            s.add("            } catch (Exception e) {");
            s.add("                " + brosType + ".update(now, execId);");
            s.add("            }");
            s.add("        }");
        }

        // 履歴モデル
        TableInfo historyInfo = tableInfo.getHistoryInfo();
        if (historyInfo != null) {
            String historyName = historyInfo.getName();
            String history = StringUtil.toCamelCase(historyName);
            String historyType = StringUtil.toPascalCase(historyName);
            s.add("");
            s.add("        // " + historyInfo.getRemarks() + "の登録");
            s.add("        " + historyType + " " + history + " = new " + historyType + "();");
            for (String columnName : tableInfo.getColumnInfos().keySet()) {
                String column = StringUtil.toCamelCase(columnName);
                String columnType = StringUtil.toPascalCase(columnName);
                s.add("        " + history + ".set" + columnType + "(this." + column + ");");
            }
            if (!StringUtil.isNullOrBlank(reason)) {
                String p = StringUtil.toCamelCase(reason);
                String a = StringUtil.toPascalCase(reason);
                s.add("        " + history + ".set" + a + "(this." + p + ");");
            }
            s.add("        " + history + ".insert(now, execId);");
        }

        s.add("");
        s.add("        // " + tableInfo.getRemarks() + "の登録");
        s.add("        String sql = \"UPDATE " + tableInfo.getName()
                + "\\r\\nSET\\r\\n      \" + getSet() + \"\\r\\nWHERE\\r\\n    \" + getWhere();");
        s.add("        return Queries.regist(sql, toMap(now, execId));");
        s.add("    }");
        s.add("");
        s.add("    /** @return update用のset句 */");
        s.add("    private String getSet() {");
        s.add("        List<String> setList = new ArrayList<String>();");

        for (Entry<String, ColumnInfo> e : tableInfo.getColumnInfos().entrySet()) {
            String columnName = e.getKey();
            ColumnInfo columnInfo = e.getValue();

            // 追加時のメタ情報ならスキップ
            if (columnName.matches("(?i)^" + insertDt + "$") || columnName.matches("(?i)^" + insertBy + "$")) {
                continue;
            }

            String rightHand = getRightHand(columnName, columnInfo);
            s.add("        setList.add(\"" + assist.quoteEscapedSQL(columnName) + " = " + rightHand + "\");");
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
            String quoted = assist.quoteEscapedSQL(primaryKey);
            String snake = StringUtil.toSnakeCase(primaryKey);
            ColumnInfo primaryKeyInfo = tableInfo.getColumnInfos().get(primaryKey);
            if (primaryKeyInfo.getTypeName().equals("CHAR")) {
                s.add("        whereList.add(\"TRIM (" + quoted + ") = TRIM (:" + snake + ")\");");
            } else {
                s.add("        whereList.add(\"" + quoted + " = :" + snake + "\");");
            }
        }

        // 楽観ロック
        ColumnInfo columnInfo = tableInfo.getColumnInfos().get(updateDt);
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
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            boolean isInsertDt = columnName.matches("(?i)^" + insertDt + "$");
            boolean isUpdateDt = columnName.matches("(?i)^" + updateDt + "$");
            boolean isInsertBy = columnName.matches("(?i)^" + insertBy + "$");
            boolean isUpdateBy = columnName.matches("(?i)^" + updateBy + "$");
            if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy) {
                continue;
            }
            String snake = StringUtil.toSnakeCase(columnName);
            String camel = StringUtil.toCamelCase(columnName);
            s.add("        map.put(\"" + snake + "\", this." + camel + ");");
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
     * エンティティに兄弟モデル追加
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityBros(final TableInfo tableInfo, final List<String> s) {

        // getパラメータ
        String params = "";
        for (String pk : tableInfo.getPrimaryKeys()) {
            if (pk.length() > 0) {
                if (params.length() > 0) {
                    params += ", ";
                }
                params += "this." + StringUtil.toCamelCase(pk);
            }
        }

        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
            String brosName = brosInfo.getName();
            String camel = StringUtil.toCamelCase(brosName);
            String pascal = StringUtil.toPascalCase(brosName);

            s.add("");
            s.add("    /** " + brosInfo.getRemarks() + " */");
            s.add("    private " + pascal + " " + camel + ";");
            s.add("");
            s.add("    /** @return " + brosInfo.getRemarks() + " */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + pascal + "\")");
            s.add("    public " + pascal + " get" + pascal + "() {");
            s.add("        return this." + camel + ";");
            s.add("    }");
            s.add("");
            s.add("    /** @param p " + brosInfo.getRemarks() + " */");
            s.add("    public void set" + pascal + "(final " + pascal + " p) {");
            s.add("        this." + camel + " = p;");
            s.add("    }");
            s.add("");
            s.add("    /** @return " + brosInfo.getRemarks() + " */");
            s.add("    public " + pascal + " refer" + pascal + "() {");
            s.add("        if (this." + camel + " == null) {");
            s.add("            try {");
            s.add("                this." + camel + " = " + pascal + ".get(" + params + ");");
            s.add("            } catch (jp.co.golorp.emarf.exception.NoDataError e) {");
            s.add("            }");
            s.add("        }");
            s.add("        return this." + camel + ";");
            s.add("    }");
        }
    }

    /**
     * エンティティに子モデル追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityChild(final TableInfo table, final List<String> s) {

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

        for (TableInfo child : table.getChildInfos()) {
            String name = child.getName();
            String entity = StringUtil.toPascalCase(name);
            String instance = StringUtil.toCamelCase(name);

            // childList
            s.add("");
            s.add("    /** " + child.getRemarks() + "のリスト */");
            s.add("    private List<" + entity + "> " + instance + "s;");
            s.add("");
            s.add("    /** @return " + child.getRemarks() + "のリスト */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + entity + "s\")");
            s.add("    public List<" + entity + "> get" + entity + "s() {");
            s.add("        return this." + instance + "s;");
            s.add("    }");
            s.add("");
            s.add("    /** @param list " + child.getRemarks() + "のリスト */");
            s.add("    public void set" + entity + "s(final List<" + entity + "> list) {");
            s.add("        this." + instance + "s = list;");
            s.add("    }");
            s.add("");
            s.add("    /** @param " + instance + " */");
            s.add("    public void add" + entity + "s(final " + entity + " " + instance + ") {");
            s.add("        if (this." + instance + "s == null) {");
            s.add("            this." + instance + "s = new ArrayList<" + entity + ">();");
            s.add("        }");
            s.add("        this." + instance + "s.add(" + instance + ");");
            s.add("    }");
            s.add("");
            s.add("    /** @return " + child.getRemarks() + "のリスト */");
            s.add("    public List<" + entity + "> refer" + entity + "s() {");
            s.add("        this." + instance + "s = " + parent + ".refer" + entity + "s(" + params + ");");
            s.add("        return this." + instance + "s;");
            s.add("    }");

            // search
            s.add("");
            s.add("    /**");
            int i = 0;
            String pks = "";
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                String property = StringUtil.toCamelCase(pk);
                s.add("     * @param param" + ++i + " " + property);
                if (pks.length() > 0) {
                    pks += ", ";
                }
                ColumnInfo column = table.getColumnInfos().get(pk);
                pks += "final " + column.getDataType() + " param" + i;
            }
            s.add("     * @return List<" + entity + ">");
            s.add("     */");
            s.add("    public static List<" + entity + "> refer" + entity + "s(" + pks + ") {");
            s.add("        List<String> whereList = new ArrayList<String>();");
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                //                pk = pk.toLowerCase();
                //                s.add("        whereList.add(\"" + pk + " = :" + pk + "\");");
                ColumnInfo primaryKey = table.getColumnInfos().get(pk);
                if (primaryKey.getTypeName().equals("CHAR")) {
                    s.add("        whereList.add(\"TRIM (" + pk + ") = TRIM (:" + StringUtil.toSnakeCase(pk) + ")\");");
                } else {
                    s.add("        whereList.add(\"" + pk + " = :" + StringUtil.toSnakeCase(pk) + "\");");
                }
            }

            //カラム名を列挙
            //            s.add("        String sql = \"SELECT * FROM " + name + " WHERE \" + String.join(\" AND \", whereList);");
            s.add("        String sql = \"SELECT \";");
            int cols = 0;
            int refs = 0;
            for (ColumnInfo column : child.getColumnInfos().values()) {
                String colName = column.getName();
                String quoteEscaped = assist.quoteEscapedSQL(colName);
                //時間サフィックスに合致する場合、データソースがOracleならTO_CHAR
                if (StringUtil.endsWith(inputDateSuffixs, colName)) {
                    quoteEscaped = assist.date2CharSQL(quoteEscaped) + " AS " + colName;
                } else if (StringUtil.endsWith(inputTimeSuffixs, colName)) {
                    quoteEscaped = assist.time2CharSQL(quoteEscaped) + " AS " + colName;
                } else if (StringUtil.endsWith(inputDateTimeSuffixs, colName)) {
                    quoteEscaped = assist.dateTime2CharSQL(quoteEscaped) + " AS " + colName;
                } else if (StringUtil.endsWith(inputTimestampSuffixs, colName)) {
                    quoteEscaped = assist.timestamp2CharSQL(quoteEscaped) + " AS " + colName;
                }
                if (cols == 0) {
                    s.add("        sql += \"" + quoteEscaped + "\";");
                } else {
                    s.add("        sql += \", " + quoteEscaped + "\";");
                }
                ++cols;
                // 列の参照モデル情報があればカラム名の補完
                if (column.getReferInfo() != null) {
                    String meiSql = SqlGenerator.getMeiSql(refs, table, column);
                    if (meiSql != null) {
                        ++refs;
                        meiSql = meiSql.replaceAll("\"", "\\\\\"");
                        s.add("        sql += \"" + meiSql + "\";");
                    }
                }
            }
            s.add("        sql += \" FROM " + name + " a WHERE \" + String.join(\" AND \", whereList);");
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
                for (i = 1; i <= child.getColumnInfos().size(); i++) {
                    if (i == 1) {
                        orders += ", ";
                    }
                    orders += i;
                }
            }
            s.add("        sql += \"" + orders + "\";");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            i = 0;
            for (String pk : table.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                s.add("        map.put(\"" + StringUtil.toSnakeCase(pk) + "\", param" + ++i + ");");
            }
            s.add("        return Queries.select(sql, map, " + entity + ".class, null, null);");
            s.add("    }");
        }
    }

    /**
     * 一覧画面の一括削除処理
     * @param s
     * @param parent
     * @param childs
     * @param indent
     */
    public static void getDeleteChilds(final List<String> s, final String parent, final List<TableInfo> childs,
            final int indent) {
        String space = "    ".repeat(indent);
        for (TableInfo childInfo : childs) {
            String child = StringUtil.toPascalCase(childInfo.getName());
            String camel = StringUtil.toCamelCase(childInfo.getName());
            s.add("");
            int parents = childInfo.getParentInfos().size();
            if (parents == 1) {
                s.add(space + "        java.util.List<" + pkgEntity + "." + child + "> " + camel + "s = "
                        + parent + ".refer" + child + "s();");
                s.add(space + "        if (" + camel + "s != null) {");
                s.add(space + "            for (" + pkgEntity + "." + child + " " + camel + " : " + camel + "s) {");
                if (childInfo.getChildInfos().size() > 0) {
                    // forでもう一段降りているから「+2」
                    getDeleteChilds(s, camel, childInfo.getChildInfos(), indent + 2);
                }
                s.add("");
                s.add(space + "                if (" + camel + ".delete() != 1) {");
                s.add(space + "                    throw new OptLockError(\"error.cant.delete\");");
                s.add(space + "                }");
                s.add(space + "            }");
                s.add(space + "        }");
            } else {
                s.add(space + "        // child:" + child + ", parents:" + parents);
            }
            s.add("");
        }
    }

    /**
     * 一覧画面の一括承認処理
     * @param s
     * @param parent
     * @param childInfos
     * @param indent
     */
    public static void getPermitChilds(final List<String> s, final String parent, final List<TableInfo> childInfos,
            final int indent) {
        String space = "    ".repeat(indent);
        for (TableInfo childInfo : childInfos) {
            String child = StringUtil.toPascalCase(childInfo.getName());
            String camel = StringUtil.toCamelCase(childInfo.getName());
            s.add("");
            int parents = childInfo.getParentInfos().size();
            if (parents == 1) {
                s.add(space + "        java.util.List<" + pkgEntity + "." + child + "> " + camel + "s = "
                        + parent + ".refer" + child + "s();");
                s.add(space + "        if (" + camel + "s != null) {");
                s.add(space + "            for (" + pkgEntity + "." + child + " " + camel + " : " + camel + "s) {");
                if (childInfo.getChildInfos().size() > 0) {
                    // forでもう一段降りているから「+2」
                    getPermitChilds(s, camel, childInfo.getChildInfos(), indent + 2);
                }
                s.add("");
                s.add(space + "                " + camel + ".setStatusKb(1);");
                s.add(space + "                if (" + camel + ".update(now, execId) != 1) {");
                s.add(space + "                    throw new OptLockError(\"error.cant.permit\");");
                s.add(space + "                }");
                s.add(space + "            }");
                s.add(space + "        }");
            } else {
                s.add(space + "        // child:" + child + ", parents:" + parents);
            }
        }
    }

    /**
     * 一覧画面の一括否認処理
     * @param s
     * @param parent
     * @param childInfos
     * @param indent
     */
    public static void getForbidChilds(final List<String> s, final String parent,
            final List<TableInfo> childInfos, final int indent) {
        String space = "    ".repeat(indent);
        for (TableInfo childInfo : childInfos) {
            String child = StringUtil.toPascalCase(childInfo.getName());
            String camel = StringUtil.toCamelCase(childInfo.getName());
            s.add("");
            int parents = childInfo.getParentInfos().size();
            if (parents == 1) {
                s.add(space + "        java.util.List<" + pkgEntity + "." + child + "> " + camel + "s = "
                        + parent + ".refer" + child + "s();");
                s.add(space + "        if (" + camel + "s != null) {");
                s.add(space + "            for (" + pkgEntity + "." + child + " " + camel + " : " + camel + "s) {");
                if (childInfo.getChildInfos().size() > 0) {
                    // forでもう一段降りているから「+2」
                    getForbidChilds(s, camel, childInfo.getChildInfos(), indent + 2);
                }
                s.add("");
                s.add(space + "                " + camel + ".setStatusKb(-1);");
                s.add(space + "                if (" + camel + ".update(now, execId) != 1) {");
                s.add(space + "                    throw new OptLockError(\"error.cant.forbid\");");
                s.add(space + "                }");
                s.add(space + "            }");
                s.add(space + "        }");
            } else {
                s.add(space + "        // child:" + child + ", parents:" + parents);
            }
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
