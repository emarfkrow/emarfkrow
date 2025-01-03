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

    /** BeanGenerator.properties */
    private static ResourceBundle bundle;

    /** コンパイルまでするか */
    private static boolean isCompile;

    /** 必須CHAR列の指定 */
    private static String charNotNullRe;
    /** 非必須INT列の指定 */
    private static String numberNullableRe;

    /** 登録日時カラム名 */
    private static String insertDt;
    /** 登録者カラム名 */
    private static String insertBy;
    /** 更新日時カラム名 */
    private static String updateDt;
    /** 更新日時フォーマット */
    private static String updateDtFormat;
    /** 更新者カラム名 */
    private static String updateBy;
    /** ステータス区分 */
    private static String statusKb;

    /** 年月入力サフィックス */
    private static String[] inputYMSuffixs;
    /** 日付け入力サフィックス */
    private static String[] inputDateSuffixs;
    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;
    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;
    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;
    /** ファイルサフィックス */
    private static String[] inputFileSuffixs;

    /** プロジェクトディレクトリ */
    private static String projectDir;
    /** javaファイル出力ルートパス */
    private static String javaPath;
    /** entityパッケージ */
    private static String entityPackage;
    /** actionパッケージ */
    private static String actionPackage;

    /** プライベートコンストラクタ */
    private BeanGenerator() {
    }

    /**
     * 各ファイル出力 主処理
     * @param dir プロジェクトのディレクトリ
     */
    public static void generate(final String dir) {

        LOG.info("start.");

        //プロジェクトディレクトリを退避
        projectDir = dir;

        // BeanGenerator.properties読み込み
        bundle = ResourceBundles.getBundle(BeanGenerator.class);

        //webからの自動生成ならコンパイルまで行う
        if (App.get("EmarfListener.autogenerate") != null) {
            isCompile = App.get("EmarfListener.autogenerate").toLowerCase().equals("true");
        }

        //NOTNULLで必須項目として扱うCHARの列名リスト（ホストの△対応）
        charNotNullRe = bundle.getString("BeanGenerator.char.notnull.re");
        //NOTNULLのINT列で「0」を補填する列名指定
        numberNullableRe = bundle.getString("BeanGenerator.number.nullable.re");

        //登録情報・更新情報の列名
        insertDt = bundle.getString("BeanGenerator.insert_dt");
        insertBy = bundle.getString("BeanGenerator.insert_by");
        updateDt = bundle.getString("BeanGenerator.update_dt");
        updateDtFormat = bundle.getString("BeanGenerator.update_dt.format");
        updateBy = bundle.getString("BeanGenerator.update_by");
        statusKb = bundle.getString("BeanGenerator.status_kb");

        inputYMSuffixs = bundle.getString("BeanGenerator.input.ym.suffixs").split(",");
        inputDateSuffixs = bundle.getString("BeanGenerator.input.date.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("BeanGenerator.input.datetime.suffixs").split(",");
        inputTimestampSuffixs = bundle.getString("BeanGenerator.input.timestamp.suffixs").split(",");

        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("BeanGenerator.input.file.suffixs").split(",");

        javaPath = bundle.getString("BeanGenerator.java.path");
        entityPackage = bundle.getString("BeanGenerator.java.package.entity");
        actionPackage = bundle.getString("BeanGenerator.java.package.action");

        /*
         * 出力フォルダ再作成
         */

        //エンティティフォルダ
        String entityPackagePath = entityPackage.replace(".", File.separator);
        String entityPackageDir = projectDir + File.separator + javaPath + File.separator + entityPackagePath;
        FileUtil.reMkDir(entityPackageDir);

        //アクションフォルダ
        String actionPackagePath = actionPackage.replace(".", File.separator);
        String actionPackageDir = projectDir + File.separator + javaPath + File.separator + actionPackagePath;
        FileUtil.reMkDir(actionPackageDir);

        /*
         * データベースから自動生成
         */

        // テーブル情報を取得
        List<TableInfo> tableInfos = DataSources.getTableInfos();

        //エンティティクラス
        BeanGenerator.javaEntity(tableInfos);

        //詳細画面アクションクラス
        BeanGenerator.javaActionDetailGet(tableInfos);
        BeanGenerator.javaActionDetailDelete(tableInfos);
        BeanGenerator.javaActionDetailRegist(tableInfos);
        BeanGenerator.javaActionDetailPermit(tableInfos);
        BeanGenerator.javaActionDetailForbid(tableInfos);

        //検索画面アクションクラス
        IndexGenerator.generate(projectDir, tableInfos);

        //フォームクラス
        FormGenerator.generate(projectDir, tableInfos);

        //HTMLファイル
        HtmlGenerator.generate(projectDir, tableInfos);

        //検索SQLファイル
        SqlGenerator.generate(projectDir, tableInfos);

        LOG.info("success.");
    }

    /**
     * エンティティ出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaEntity(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = entityPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;
        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String remarks = tableInfo.getRemarks();

            String entityName = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + entityPackage + ";");
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
            s.add(" * " + remarks + "");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entityName + " implements IEntity {");
            if (tableInfo.getColumnInfos().get("ID") == null) {
                s.add("");
                s.add("    /** SlickGridのDataView用ID */");
                s.add("    private Integer id;");
                s.add("");
                s.add("    /**");
                s.add("     * @return id");
                s.add("     */");
                s.add("    public final Integer getId() {");
                s.add("        return id;");
                s.add("    }");
                s.add("");
                s.add("    /**");
                s.add("     * @param o セットする id");
                s.add("     */");
                s.add("    public final void setId(final Object o) {");
                s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                s.add("            this.id = Integer.valueOf(o.toString());");
                s.add("        } else {");
                s.add("            this.id = null;");
                s.add("        }");
                s.add("    }");
            }
            // property
            for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
                String columnName = columnInfo.getColumnName();
                String mei = columnInfo.getRemarks();
                String camel = StringUtil.toCamelCase(columnName);
                String pascal = StringUtil.toPascalCase(columnName);
                String dataType = columnInfo.getDataType();
                s.add("");
                s.add("    /** " + mei + " */");
                if (dataType.equals("java.time.LocalDate")) {
                    s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd\")");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)");
                } else if (StringUtil.endsWith(inputTimestampSuffixs, columnInfo.getColumnName())) {
                    s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss.SSS\")");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)");
                } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnInfo.getColumnName())) {
                    s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss\")");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)");
                }
                if (StringUtil.endsWith(inputFlagSuffixs, columnName)) {
                    // フラグを外した際、何も送信されず更新もかからないため、フラグ項目には初期値を設定しておく
                    if (dataType.equals("java.math.BigDecimal")) {
                        s.add("    private " + dataType + " " + camel + " = new " + dataType + "(0);");
                    } else if (dataType.equals("Integer")) {
                        s.add("    private " + dataType + " " + camel + " = 0;");
                    } else {
                        s.add("    private " + dataType + " " + camel + " = \"0\";");
                    }
                } else {
                    s.add("    private " + dataType + " " + camel + ";");
                }
                s.add("");
                s.add("    /** @return " + mei + " */");
                s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + columnName + "\")");
                s.add("    public " + dataType + " get" + pascal + "() {");
                s.add("        return this." + camel + ";");
                s.add("    }");
                s.add("");
                s.add("    /** @param o " + mei + " */");
                s.add("    public void set" + pascal + "(final Object o) {");
                if (dataType.equals("java.time.LocalDateTime")) {
                    s.add("        if (o != null && o instanceof Long) {");
                    s.add("            java.util.Date d = new java.util.Date((Long) o);");
                    s.add("            this." + camel
                            + " = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());");
                    s.add("        } else if (o != null && o.toString().matches(\"^[0-9]+\")) {");
                    s.add("            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));");
                    s.add("            this." + camel
                            + " = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());");
                    s.add("        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = " + dataType
                            + ".parse(o.toString().replace(\" \", \"T\").replace(\"/\", \"-\"));");
                } else if (dataType.equals("java.time.LocalDate")) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = " + dataType + ".parse(o.toString().substring(0, 10));");
                } else if (dataType.equals("java.time.LocalTime")) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = " + dataType + ".parse(o.toString());");
                } else if (dataType.equals("java.math.BigDecimal")) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = new java.math.BigDecimal(o.toString());");
                } else if (StringUtil.endsWith(inputYMSuffixs, columnName)) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = " + dataType
                            + ".valueOf(o.toString().replace(\"-\", \"\"));");
                } else if (dataType.equals("String")) {
                    s.add("        if (o != null) {");
                    s.add("            this." + camel + " = o.toString();");
                } else {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = " + dataType + ".valueOf(o.toString());");
                }
                s.add("        } else {");
                s.add("            this." + camel + " = null;");
                s.add("        }");
                s.add("    }");
            }
            javaEntityCRUD(tableInfo, s);
            javaEntityUtil(tableInfo, s);
            javaEntityBros(tableInfo, s);
            javaEntityChild(tableInfo, s);
            s.add("}");

            String javaFilePath = packageDir + File.separator + entityName + ".java";
            FileUtil.writeFile(javaFilePath, s);
            javaFilePaths.put(javaFilePath, entityPackage + "." + entityName);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * エンティティにCRUD追加
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityCRUD(final TableInfo tableInfo, final List<String> s) {

        String tableName = tableInfo.getTableName();
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
            String childName = childInfo.getTableName();
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
            String brosName = brosInfo.getTableName();
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

        String columnName = columnInfo.getColumnName();

        String quoteEscaped = "a." + assist.quoteEscapedSQL(columnName);

        if (columnInfo.getTypeName().equals("CHAR")) {

            String trimed = assist.trimedSQL(quoteEscaped);
            quoteEscaped = trimed + " AS " + columnName;

        } else if (StringUtil.endsWith(inputDateSuffixs, columnInfo.getColumnName())) {

            quoteEscaped = assist.date2CharSQL(quoteEscaped) + " AS " + columnName;

        } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnInfo.getColumnName())) {

            quoteEscaped = assist.dateTime2CharSQL(quoteEscaped) + " AS " + columnName;

        } else if (StringUtil.endsWith(inputTimestampSuffixs, columnInfo.getColumnName())) {

            quoteEscaped = assist.timestamp2CharSQL(quoteEscaped) + " AS " + columnName;

        }

        return quoteEscaped;
    }

    /**
     * エンティティにINSERT追加
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityCRUDInsert(final TableInfo tableInfo, final List<String> s) {

        s.add("");
        s.add("    /**");
        s.add("     * " + tableInfo.getRemarks() + "追加");
        s.add("     * @param now システム日時");
        s.add("     * @param execId 登録者");
        s.add("     * @return 追加件数");
        s.add("     */");
        s.add("    public int insert(final LocalDateTime now, final String execId) {");

        // 最後のキーを取得
        ColumnInfo lastKeyInfo = null;
        if (tableInfo.getPrimaryKeys() != null && tableInfo.getPrimaryKeys().size() > 0) {
            List<String> primaryKeys = tableInfo.getPrimaryKeys();
            String lastKey = primaryKeys.get(primaryKeys.size() - 1);
            lastKeyInfo = tableInfo.getColumnInfos().get(lastKey);
            if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
                s.add("");
                s.add("        // " + lastKeyInfo.getRemarks() + "の採番処理");
                s.add("        numbering();");
            }
        }

        // 子モデル
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String camel = StringUtil.toCamelCase(childName);
            String pascal = StringUtil.toPascalCase(childName);
            s.add("");
            s.add("        // " + childInfo.getRemarks() + "の登録");
            s.add("        if (this." + camel + "s != null) {");
            s.add("            for (" + pascal + " " + camel + " : this." + camel + "s) {");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("                " + camel + ".set" + pascalKey + "(this.get" + pascalKey + "());");
            }
            s.add("                " + camel + ".insert(now, execId);");
            s.add("            }");
            s.add("        }");
        }

        // 兄弟モデル
        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
            String brosName = brosInfo.getTableName();
            String camel = StringUtil.toCamelCase(brosName);
            s.add("");
            s.add("        // " + brosInfo.getRemarks() + "の登録");
            s.add("        if (this." + camel + " != null) {");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("            this." + camel + ".set" + pascalKey + "(this.get" + pascalKey + "());");
            }
            s.add("            this." + camel + ".insert(now, execId);");
            s.add("        }");
        }

        // 履歴モデル
        if (tableInfo.getHistoryInfo() != null) {
            String historyName = tableInfo.getHistoryInfo().getTableName();
            String camel = StringUtil.toCamelCase(historyName);
            String pascal = StringUtil.toPascalCase(historyName);
            s.add("");
            s.add("        // " + tableInfo.getHistoryInfo().getRemarks() + "の登録");
            s.add("        " + pascal + " " + camel + " = new " + pascal + "();");
            for (String columnName : tableInfo.getColumnInfos().keySet()) {
                String camelColumn = StringUtil.toCamelCase(columnName);
                String pascalColumn = StringUtil.toPascalCase(columnName);
                s.add("        " + camel + ".set" + pascalColumn + "(this." + camelColumn + ");");
            }
            s.add("        " + camel + ".insert(now, execId);");
        }

        s.add("");
        s.add("        // " + tableInfo.getRemarks() + "の登録");
        s.add("        String sql = \"INSERT INTO " + tableInfo.getTableName()
                + "(\\r\\n      \" + names() + \"\\r\\n) VALUES (\\r\\n      \" + values() + \"\\r\\n)\";");
        s.add("        return Queries.regist(sql, toMap(now, execId));");
        s.add("    }");
        s.add("");
        s.add("    /** @return insert用のname句 */");
        s.add("    private String names() {");
        s.add("        List<String> nameList = new ArrayList<String>();");
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            String snake = StringUtil.toSnakeCase(columnName);
            s.add("        nameList.add(\"" + assist.quoteEscapedSQL(columnName) + " -- :" + snake + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", nameList);");
        s.add("    }");
        s.add("");
        s.add("    /** @return insert用のvalue句 */");
        s.add("    private String values() {");
        s.add("        List<String> valueList = new ArrayList<String>();");
        for (Entry<String, ColumnInfo> e : tableInfo.getColumnInfos().entrySet()) {
            String columnName = e.getKey();
            ColumnInfo columnInfo = e.getValue();
            String rightHand = getRightHand(columnName, columnInfo);
            s.add("        valueList.add(\"" + rightHand + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", valueList);");
        s.add("    }");

        if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
            javaEntityCRUDInsertNumbering(tableInfo, s, lastKeyInfo);
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
                && !columnInfo.getColumnName().matches(charNotNullRe)) {
            //主キー以外のCHAR列で、必須CHAR指定に合致しない場合、NULLならスペースを補填する
            rightHand = "NVL (" + rightHand + ", ' ')";

        } else if (!columnInfo.isPk() && columnInfo.getTypeName().equals("NUMBER")
                && !StringUtil.isNullOrBlank(numberNullableRe)
                && columnInfo.getColumnName().matches(numberNullableRe)) {
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

        String tableName = tableInfo.getTableName();

        String keyName = lastKeyInfo.getColumnName();

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
            String childName = childInfo.getTableName();
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
            String brosType = StringUtil.toCamelCase(brosInfo.getTableName());
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
            String historyName = historyInfo.getTableName();
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
            s.add("        " + history + ".insert(now, execId);");
        }

        s.add("");
        s.add("        // " + tableInfo.getRemarks() + "の登録");
        s.add("        String sql = \"UPDATE " + tableInfo.getTableName()
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
            String brosName = brosInfo.getTableName();
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
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     */
    private static void javaEntityChild(final TableInfo tableInfo, final List<String> s) {

        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);

        String params = "";
        for (String pk : tableInfo.getPrimaryKeys()) {
            if (pk.length() > 0) {
                if (params.length() > 0) {
                    params += ", ";
                }
                params += "this." + StringUtil.toCamelCase(pk);
            }
        }

        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String camel = StringUtil.toCamelCase(childName);
            String pascal = StringUtil.toPascalCase(childName);

            // childList
            s.add("");
            s.add("    /** " + childInfo.getRemarks() + "のリスト */");
            s.add("    private List<" + pascal + "> " + camel + "s;");
            s.add("");
            s.add("    /** @return " + childInfo.getRemarks() + "のリスト */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + pascal + "s\")");
            s.add("    public List<" + pascal + "> get" + pascal + "s() {");
            s.add("        return this." + camel + "s;");
            s.add("    }");
            s.add("");
            s.add("    /** @param list " + childInfo.getRemarks() + "のリスト */");
            s.add("    public void set" + pascal + "s(final List<" + pascal + "> list) {");
            s.add("        this." + camel + "s = list;");
            s.add("    }");
            s.add("");
            s.add("    /** @param " + camel + " */");
            s.add("    public void add" + pascal + "s(final " + pascal + " " + camel + ") {");
            s.add("        if (this." + camel + "s == null) {");
            s.add("            this." + camel + "s = new ArrayList<" + pascal + ">();");
            s.add("        }");
            s.add("        this." + camel + "s.add(" + camel + ");");
            s.add("    }");
            s.add("");
            s.add("    /** @return " + childInfo.getRemarks() + "のリスト */");
            s.add("    public List<" + pascal + "> refer" + pascal + "s() {");
            s.add("        this." + camel + "s = " + entityName + ".refer" + pascal + "s(" + params + ");");
            s.add("        return this." + camel + "s;");
            s.add("    }");

            // search
            s.add("");
            s.add("    /**");
            int i = 0;
            String getParams = "";
            for (String pk : tableInfo.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                String primaryKey = StringUtil.toCamelCase(pk);
                s.add("     * @param param" + ++i + " " + primaryKey);
                if (getParams.length() > 0) {
                    getParams += ", ";
                }
                ColumnInfo columnInfo = tableInfo.getColumnInfos().get(pk);
                getParams += "final " + columnInfo.getDataType() + " param" + i;
            }
            s.add("     * @return List<" + pascal + ">");
            s.add("     */");
            s.add("    public static List<" + pascal + "> refer" + pascal + "s(" + getParams + ") {");
            s.add("        List<String> whereList = new ArrayList<String>();");
            for (String pk : tableInfo.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                //                pk = pk.toLowerCase();
                //                s.add("        whereList.add(\"" + pk + " = :" + pk + "\");");
                ColumnInfo primaryKeyInfo = tableInfo.getColumnInfos().get(pk);
                if (primaryKeyInfo.getTypeName().equals("CHAR")) {
                    s.add("        whereList.add(\"TRIM (" + pk + ") = TRIM (:" + StringUtil.toSnakeCase(pk) + ")\");");
                } else {
                    s.add("        whereList.add(\"" + pk + " = :" + StringUtil.toSnakeCase(pk) + "\");");
                }
            }
            s.add("        String sql = \"SELECT * FROM " + childName
                    + " WHERE \" + String.join(\" AND \", whereList);");
            s.add("        sql += \" ORDER BY \";");
            if (childInfo.getPrimaryKeys().size() > 0) {
                String orders = "";
                for (String primaryKey : childInfo.getPrimaryKeys()) {
                    if (orders.length() > 0) {
                        orders += ", ";
                    }
                    orders += primaryKey;
                }
                s.add("        sql += \"" + orders + "\";");
            } else {
                String orders = "";
                for (i = 1; i <= childInfo.getColumnInfos().size(); i++) {
                    if (i == 1) {
                        orders += ", ";
                    }
                    orders += i;
                }
                s.add("        sql += \"" + orders + "\";");
            }
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            i = 0;
            for (String pk : tableInfo.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                s.add("        map.put(\"" + StringUtil.toSnakeCase(pk) + "\", param" + ++i + ");");
            }
            s.add("        return Queries.select(sql, map, " + pascal + ".class, null, null);");
            s.add("    }");
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaActionDetailDelete(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String remarks = tableInfo.getRemarks();

            String entityName = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPackage + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + entityName + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("import jp.co.golorp.emarf.exception.OptLockError;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "削除");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entityName + "DeleteAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "削除処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        // 主キーが不足していたらエラー");
            String params = "";
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String camel = StringUtil.toCamelCase(primaryKey);
                s.add("        Object " + camel + " = postJson.get(\"" + camel + "\");");
                s.add("        if (" + camel + " == null) {");
                s.add("            " + camel + " = postJson.get(\"" + entityName + "." + camel + "\");");
                s.add("        }");
                s.add("        if (" + camel + " == null) {");
                s.add("            throw new OptLockError(\"error.cant.delete\");");
                s.add("        }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += camel;
            }
            s.add("");
            s.add("        " + entityName + " e = FormValidator.toBean(" + entityName + ".class.getName(), postJson);");
            List<TableInfo> childInfos = tableInfo.getChildInfos();
            getDeleteChilds(s, "e", childInfos, 0);
            s.add("");
            s.add("        if (e.delete() != 1) {");
            s.add("            throw new OptLockError(\"error.cant.delete\");");
            s.add("        }");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("        map.put(\"INFO\", Messages.get(\"info.delete\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entityName + "DeleteAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entityName + "DeleteAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaActionDetailGet(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String remarks = tableInfo.getRemarks();

            String camelTable = StringUtil.toCamelCase(tableName);
            String pascalTable = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPackage + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + pascalTable + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "照会");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + pascalTable + "GetAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "照会処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        // 主キーが不足していたら終了");
            String params = "";
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String camel = StringUtil.toCamelCase(primaryKey);
                s.add("        Object " + camel + " = postJson.get(\"" + camel + "\");");
                s.add("        if (" + camel + " == null) {");
                s.add("            " + camel + " = postJson.get(\"" + pascalTable + "." + camel + "\");");
                s.add("        }");
                s.add("        if (" + camel + " == null) {");
                s.add("            return map;");
                s.add("        }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += camel;
            }

            s.add("");
            s.add("        " + pascalTable + " " + camelTable + " = " + pascalTable + ".get(" + params + ");");
            for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
                String brosName = brosInfo.getTableName();
                String pascalBros = StringUtil.toPascalCase(brosName);
                s.add("        " + camelTable + ".refer" + pascalBros + "();");
            }
            for (TableInfo childInfo : tableInfo.getChildInfos()) {
                String pascal = StringUtil.toPascalCase(childInfo.getTableName());
                s.add("        " + camelTable + ".refer" + pascal + "s();");
            }
            s.add("        map.put(\"" + pascalTable + "\", " + camelTable + ");");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + pascalTable + "GetAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + pascalTable + "GetAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaActionDetailRegist(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String remarks = tableInfo.getRemarks();

            String entity = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPackage + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + entity + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("import jp.co.golorp.emarf.exception.OptLockError;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "登録");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "RegistAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "登録処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), postJson);");
            s.add("");
            s.add("        // 主キーが不足していたらINSERT");
            s.add("        boolean isNew = false;");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascal = StringUtil.toPascalCase(primaryKey);
                s.add("        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("            isNew = true;");
                s.add("        }");
            }
            if (tableInfo.getColumnInfos().containsKey(updateDt)
                    || tableInfo.getColumnInfos().containsKey(updateDt.toUpperCase())) {
                String pascal = StringUtil.toPascalCase(updateDt);
                s.add("        // 楽観ロック値がなくてもINSERT");
                s.add("        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("            isNew = true;");
                s.add("        }");
            }
            if (!tableInfo.isView()) {
                s.add("");
                s.add("        e.setStatusKb(0);");
            }
            s.add("");
            s.add("        if (isNew) {");
            s.add("");
            s.add("            if (e.insert(now, execId) != 1) {");
            s.add("                throw new OptLockError(\"error.cant.insert\");");
            s.add("            }");
            s.add("");
            s.add("            map.put(\"INFO\", Messages.get(\"info.insert\"));");
            s.add("");
            s.add("        } else {");
            s.add("");
            s.add("            if (e.update(now, execId) == 1) {");
            s.add("                map.put(\"INFO\", Messages.get(\"info.update\"));");
            s.add("            } else if (e.insert(now, execId) == 1) {");
            s.add("                map.put(\"INFO\", Messages.get(\"info.insert\"));");
            s.add("            } else {");
            s.add("                throw new OptLockError(\"error.cant.update\");");
            s.add("            }");
            s.add("        }");
            s.add("");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "RegistAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entity + "RegistAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 承認処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaActionDetailPermit(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {

            if (tableInfo.isView()) {
                continue;
            }

            String entity = StringUtil.toPascalCase(tableInfo.getTableName());
            String remarks = tableInfo.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPackage + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + entity + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("import jp.co.golorp.emarf.exception.OptLockError;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "承認");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "PermitAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "承認処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        // 主キーが不足していたらエラー");
            String params = "";
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String property = StringUtil.toCamelCase(primaryKey);
                String accessor = StringUtil.toPascalCase(primaryKey);
                s.add("        Object " + property + " = postJson.get(\"" + property + "\");");
                s.add("        if (" + property + " == null) {");
                s.add("            " + property + " = postJson.get(\"" + entity + "." + property + "\");");
                s.add("        }");
                s.add("        if (" + property + " == null) {");
                s.add("            throw new OptLockError(\"error.cant.permit\");");
                s.add("        }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += "e.get" + accessor + "()";
            }
            s.add("");
            s.add("        " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), postJson);");
            List<TableInfo> childInfos = tableInfo.getChildInfos();
            getPermitChilds(s, "e", childInfos, 0);
            s.add("");
            s.add("        " + entity + " f = " + entity + ".get(" + params + ");");
            s.add("        f.set" + StringUtil.toPascalCase(statusKb) + "(1);");
            s.add("        if (f.update(now, execId) != 1) {");
            s.add("            throw new OptLockError(\"error.cant.permit\");");
            s.add("        }");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("        map.put(\"INFO\", Messages.get(\"info.permit\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "PermitAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entity + "PermitAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 否認処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaActionDetailForbid(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {

            if (tableInfo.isView()) {
                continue;
            }

            String entity = StringUtil.toPascalCase(tableInfo.getTableName());
            String remarks = tableInfo.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPackage + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + entity + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("import jp.co.golorp.emarf.exception.OptLockError;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "否認");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "ForbidAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "否認処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        // 主キーが不足していたらエラー");
            String params = "";
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String property = StringUtil.toCamelCase(primaryKey);
                String accessor = StringUtil.toPascalCase(primaryKey);
                s.add("        Object " + property + " = postJson.get(\"" + property + "\");");
                s.add("        if (" + property + " == null) {");
                s.add("            " + property + " = postJson.get(\"" + entity + "." + property + "\");");
                s.add("        }");
                s.add("        if (" + property + " == null) {");
                s.add("            throw new OptLockError(\"error.cant.forbid\");");
                s.add("        }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += "e.get" + accessor + "()";
            }
            s.add("");
            s.add("        " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), postJson);");
            List<TableInfo> childInfos = tableInfo.getChildInfos();
            getForbidChilds(s, "e", childInfos, 0);
            s.add("");
            s.add("        " + entity + " f = " + entity + ".get(" + params + ");");
            s.add("        f.set" + StringUtil.toPascalCase(statusKb) + "(-1);");
            s.add("        if (f.update(now, execId) != 1) {");
            s.add("            throw new OptLockError(\"error.cant.forbid\");");
            s.add("        }");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("        map.put(\"INFO\", Messages.get(\"info.forbid\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "ForbidAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entity + "ForbidAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 一覧画面の一括削除処理
     * @param s
     * @param parent
     * @param childInfos
     * @param indent
     */
    public static void getDeleteChilds(final List<String> s, final String parent,
            final List<TableInfo> childInfos, final int indent) {
        String space = "    ".repeat(indent);
        for (TableInfo childInfo : childInfos) {
            String child = StringUtil.toPascalCase(childInfo.getTableName());
            String camel = StringUtil.toCamelCase(childInfo.getTableName());
            s.add("");
            int parents = childInfo.getParentInfos().size();
            if (parents == 1) {
                s.add(space + "        java.util.List<" + entityPackage + "." + child + "> " + camel + "s = "
                        + parent + ".refer" + child + "s();");
                s.add(space + "        if (" + camel + "s != null) {");
                s.add(space + "            for (" + entityPackage + "." + child + " " + camel + " : " + camel + "s) {");
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
            String child = StringUtil.toPascalCase(childInfo.getTableName());
            String camel = StringUtil.toCamelCase(childInfo.getTableName());
            s.add("");
            int parents = childInfo.getParentInfos().size();
            if (parents == 1) {
                s.add(space + "        java.util.List<" + entityPackage + "." + child + "> " + camel + "s = "
                        + parent + ".refer" + child + "s();");
                s.add(space + "        if (" + camel + "s != null) {");
                s.add(space + "            for (" + entityPackage + "." + child + " " + camel + " : " + camel + "s) {");
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
            String child = StringUtil.toPascalCase(childInfo.getTableName());
            String camel = StringUtil.toCamelCase(childInfo.getTableName());
            s.add("");
            int parents = childInfo.getParentInfos().size();
            if (parents == 1) {
                s.add(space + "        java.util.List<" + entityPackage + "." + child + "> " + camel + "s = "
                        + parent + ".refer" + child + "s();");
                s.add(space + "        if (" + camel + "s != null) {");
                s.add(space + "            for (" + entityPackage + "." + child + " " + camel + " : " + camel + "s) {");
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
        String dstDir = projectDir + File.separator + javaPath;

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
