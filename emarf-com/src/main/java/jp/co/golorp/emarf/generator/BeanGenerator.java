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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    /** validサフィックス */
    private static List<String> validSuffixs;

    /** NOTNULL-CHARのNULLABLE化の対象外にするサフィックス */
    private static String charNotNullRe;

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
    /** formパッケージ */
    private static String formPackage;

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

        /*
         * BeanGenerator.properties読み込み
         */

        bundle = ResourceBundles.getBundle(BeanGenerator.class);

        //webからの自動生成ならコンパイルまで行う
        if (App.get("EmarfListener.autogenerate") != null) {
            isCompile = App.get("EmarfListener.autogenerate").toLowerCase().equals("true");
        }

        //validator正規表現の接尾辞を取得
        validSuffixs = new ArrayList<String>();
        for (String key : bundle.keySet()) {
            if (key.startsWith("BeanGenerator.valid.")) {
                validSuffixs.add(key.replaceFirst("BeanGenerator.valid.", ""));
            }
        }

        //NOTNULLで必須項目として扱うCHARの列名リスト（ホストの△対応）
        charNotNullRe = bundle.getString("BeanGenerator.char.notnull.re");

        //登録情報・更新情報の列名
        insertDt = bundle.getString("BeanGenerator.insert_dt");
        insertBy = bundle.getString("BeanGenerator.insert_by");
        updateDt = bundle.getString("BeanGenerator.update_dt");
        updateDtFormat = bundle.getString("BeanGenerator.update_dt.format");
        updateBy = bundle.getString("BeanGenerator.update_by");

        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("BeanGenerator.input.file.suffixs").split(",");

        javaPath = bundle.getString("BeanGenerator.java.path");
        entityPackage = bundle.getString("BeanGenerator.java.package.entity");
        actionPackage = bundle.getString("BeanGenerator.java.package.action");
        formPackage = bundle.getString("BeanGenerator.java.package.form");

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

        //フォームフォルダ
        String formPackagePath = formPackage.replace(".", File.separator);
        String formPackageDir = projectDir + File.separator + javaPath + File.separator + formPackagePath;
        FileUtil.reMkDir(formPackageDir);

        /*
         * データベースから自動生成
         */

        // テーブル情報を取得
        List<TableInfo> tableInfos = DataSources.getTableInfos();

        //エンティティクラス
        BeanGenerator.javaEntity(tableInfos);

        //アクションクラス
        BeanGenerator.javaActionDetailGet(tableInfos);
        BeanGenerator.javaActionDetailDelete(tableInfos);
        BeanGenerator.javaActionDetailRegist(tableInfos);
        BeanGenerator.javaActionIndexRegist(tableInfos);
        BeanGenerator.javaActionIndexDelete(tableInfos);

        //フォームクラス
        BeanGenerator.javaFormDetailRegist(tableInfos);
        BeanGenerator.javaFormIndexRegist(tableInfos);

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
                if (dataType.equals("java.time.LocalDateTime")) {
                    s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss.SSS\")");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)");
                }
                if (StringUtil.endsWith(inputFlagSuffixs, columnName)) {
                    // フラグを外した際、何も送信されず更新もかからないため、フラグ項目には初期値を設定しておく
                    if (dataType.equals("java.math.BigDecimal")) {
                        s.add("    private " + dataType + " " + camel + " = new " + dataType + "(0);");
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
                    s.add("            this." + camel + " = " + dataType + ".parse(o.toString());");
                } else if (dataType.equals("java.math.BigDecimal")) {
                    s.add("        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = new java.math.BigDecimal(o.toString());");
                } else if (dataType.equals("String")) {
                    //Stringなら空文字も認める
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
            String srcColumnName = columnInfo.getColumnName();
            String sql = "    , ";
            if (isFirst) {
                sql = "      ";
            }
            if (columnInfo.getTypeName().equals("CHAR")) {
                String quoteEscaped = assist.quoteEscapedSQL(srcColumnName);
                String trimed = assist.trimedSQL("a." + quoteEscaped);
                s.add("        sql += \"" + sql + trimed + " AS " + srcColumnName + " \\n\";");
            } else {
                s.add("        sql += \"" + sql + "a." + assist.quoteEscapedSQL(srcColumnName) + " \\n\";");
            }
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
            String snake = StringUtil.toSnakeCase(columnName);
            String rightHand = ":" + snake;
            if (e.getValue().getDataType().equals("java.time.LocalDateTime")) {
                rightHand = assist.toTimestampSQL(rightHand);
            }
            // 必須CHAR正規表現が設定済みの場合
            if (!StringUtil.isNullOrBlank(charNotNullRe)) {
                //主キー以外、CHAR、必須CHAR正規表現に合致しない場合、NULLならスペースを補填する
                if (!columnInfo.isPk()
                        && columnInfo.getTypeName().equals("CHAR")
                        && !columnInfo.getColumnName().matches(charNotNullRe)) {
                    rightHand = "NVL (" + rightHand + ", ' ')";
                }
            }
            s.add("        valueList.add(\"" + rightHand + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", valueList);");
        s.add("    }");

        if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
            javaEntityCRUDInsertNumbering(tableInfo, s, lastKeyInfo);
        }
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

            String column = e.getKey();
            ColumnInfo columnInfo = e.getValue();

            // 追加時のメタ情報でない場合
            if (!column.matches("(?i)^" + insertDt + "$") && !column.matches("(?i)^" + insertBy + "$")) {

                String rightHand = ":" + StringUtil.toSnakeCase(column);
                if (columnInfo.getDataType().equals("java.time.LocalDateTime")) {
                    rightHand = assist.toTimestampSQL(rightHand);
                }

                // 必須CHAR正規表現が設定済みの場合
                if (!StringUtil.isNullOrBlank(charNotNullRe)) {
                    //主キー以外、CHAR、必須CHAR正規表現に合致しない場合、NULLならスペースを補填する
                    if (!columnInfo.isPk()
                            && columnInfo.getTypeName().equals("CHAR")
                            && !columnInfo.getColumnName().matches(charNotNullRe)) {
                        rightHand = "NVL (" + rightHand + ", ' ')";
                    }
                }

                s.add("        setList.add(\"" + assist.quoteEscapedSQL(column) + " = " + rightHand + "\");");
            }
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
            s.add("        if (this." + camel + "s == null) {");
            s.add("            this." + camel + "s = " + entityName + ".refer" + pascal + "s(" + params + ");");
            s.add("        }");
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
     * 検索画面 登録処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaActionIndexDelete(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String remarks = tableInfo.getRemarks();

            String pascal = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPackage + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + pascal + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("import jp.co.golorp.emarf.exception.OptLockError;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "一覧削除");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + pascal + "SDeleteAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧削除処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get(\"" + pascal
                    + "Grid\");");
            s.add("");
            s.add("        if (gridData.size() == 0) {");
            s.add("            map.put(\"ERROR\", Messages.get(\"error.nopost\"));");
            s.add("            return map;");
            s.add("        }");
            s.add("");
            s.add("        for (Map<String, Object> gridRow : gridData) {");
            s.add("");
            s.add("            if (gridRow.isEmpty()) {");
            s.add("                continue;");
            s.add("            }");
            s.add("");
            s.add("            // 主キーが不足していたらエラー");
            for (String pk : tableInfo.getPrimaryKeys()) {
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get(\"" + pk
                        + "\"))) {");
                s.add("                throw new OptLockError(\"error.cant.delete\");");
                s.add("            }");
            }
            s.add("");
            s.add("            " + pascal + " e = FormValidator.toBean(" + pascal + ".class.getName(), gridRow);");
            s.add("            if (e.delete() != 1) {");
            s.add("                throw new OptLockError(\"error.cant.delete\");");
            s.add("            }");
            s.add("        }");
            s.add("");
            s.add("        map.put(\"INFO\", Messages.get(\"info.delete\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + pascal + "SDeleteAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + pascal + "SDeleteAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaActionIndexRegist(final List<TableInfo> tableInfos) {

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
            s.add("import java.util.List;");
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
            s.add(" * " + remarks + "一覧登録");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "SRegistAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧登録処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get(\"" + entity
                    + "Grid\");");
            s.add("");
            s.add("        if (gridData.size() == 0) {");
            s.add("            map.put(\"ERROR\", Messages.get(\"error.nopost\"));");
            s.add("            return map;");
            s.add("        }");
            s.add("");
            s.add("        for (Map<String, Object> gridRow : gridData) {");
            s.add("");
            s.add("            if (gridRow.isEmpty()) {");
            s.add("                continue;");
            s.add("            }");
            s.add("");
            s.add("            " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), gridRow);");
            s.add("");
            s.add("            // 主キーが不足していたらINSERT");
            s.add("            boolean isNew = false;");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascal = StringUtil.toPascalCase(primaryKey);
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("                isNew = true;");
                s.add("            }");
            }
            if (tableInfo.getColumnInfos().containsKey(updateDt)
                    || tableInfo.getColumnInfos().containsKey(updateDt.toUpperCase())) {
                String pascal = StringUtil.toPascalCase(updateDt);
                s.add("            // 楽観ロック値がなくてもINSERT");
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("                isNew = true;");
                s.add("            }");
            }
            s.add("");
            s.add("            if (isNew) {");
            s.add("");
            s.add("                if (e.insert(now, execId) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.insert\");");
            s.add("                }");
            s.add("");
            s.add("            } else {");
            s.add("");
            s.add("                if (e.update(now, execId) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.update\");");
            s.add("                }");
            s.add("            }");
            s.add("        }");
            s.add("");
            s.add("        map.put(\"INFO\", Messages.get(\"info.regist\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "SRegistAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entity + "SRegistAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 フォーム出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaFormDetailRegist(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = formPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String remarks = tableInfo.getRemarks();

            String entityName = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + formPackage + ";");
            s.add("");
            if (tableInfo.getChildInfos().size() > 0) {
                s.add("import java.util.List;");
            }
            s.add("import java.util.Map;");
            s.add("");
            s.add("import org.slf4j.Logger;");
            s.add("import org.slf4j.LoggerFactory;");
            s.add("");
            s.add("import jp.co.golorp.emarf.process.BaseProcess;");
            s.add("import jp.co.golorp.emarf.validation.IForm;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "登録フォーム");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entityName + "RegistForm implements IForm {");
            s.add("");
            s.add("    /** logger */");
            s.add("    private static final Logger LOG = LoggerFactory.getLogger(" + entityName + "RegistForm.class);");
            for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {

                String columnName = columnInfo.getColumnName();

                // レコードメタデータならスキップ
                boolean isInsertDt = columnName.matches("(?i)^" + insertDt + "$");
                boolean isUpdateDt = columnName.matches("(?i)^" + updateDt + "$");
                boolean isInsertBy = columnName.matches("(?i)^" + insertBy + "$");
                boolean isUpdateBy = columnName.matches("(?i)^" + updateBy + "$");
                if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy) {
                    continue;
                }

                String camel = StringUtil.toCamelCase(columnName);
                String pascal = StringUtil.toPascalCase(columnName);

                s.add("");
                s.add("    /** " + columnInfo.getRemarks() + " */");
                javaFormDetailRegistChecks(tableInfo.getPrimaryKeys(), columnInfo, s);
                s.add("    private String " + camel + ";");
                s.add("");
                s.add("    /**");
                s.add("     * @return " + columnInfo.getRemarks());
                s.add("     */");
                s.add("    public String get" + pascal + "() {");
                s.add("        return " + camel + ";");
                s.add("    }");
                s.add("");
                s.add("    /**");
                s.add("     * @param p " + columnInfo.getRemarks());
                s.add("     */");
                s.add("    public void set" + pascal + "(final String p) {");
                s.add("        this." + camel + " = p;");
                s.add("    }");
            }
            // 兄弟モデル
            for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
                String brosName = brosInfo.getTableName();
                String camel = StringUtil.toCamelCase(brosName);
                String pascal = StringUtil.toPascalCase(brosName);
                s.add("");
                s.add("    /** " + brosInfo.getRemarks() + " */");
                s.add("    @jakarta.validation.Valid");
                s.add("    private " + pascal + "RegistForm " + camel + "RegistForm;");
                s.add("");
                s.add("    /**");
                s.add("     * @return " + pascal + "RegistForm");
                s.add("     */");
                s.add("    public " + pascal + "RegistForm get" + pascal + "RegistForm() {");
                s.add("        return " + camel + "RegistForm;");
                s.add("    }");
                s.add("");
                s.add("    /**");
                s.add("     * @param p");
                s.add("     */");
                s.add("    public void set" + pascal + "RegistForm(final " + pascal + "RegistForm p) {");
                s.add("        this." + camel + "RegistForm = p;");
                s.add("    }");
            }
            // 子モデル
            for (TableInfo childInfo : tableInfo.getChildInfos()) {
                String childName = childInfo.getTableName();
                String camel = StringUtil.toCamelCase(childName);
                String pascal = StringUtil.toPascalCase(childName);
                s.add("");
                s.add("    /** " + childInfo.getRemarks() + " */");
                s.add("    @jakarta.validation.Valid");
                s.add("    private List<" + pascal + "RegistForm> " + camel + "Grid;");
                s.add("");
                s.add("    /**");
                s.add("     * @return " + childInfo.getRemarks());
                s.add("     */");
                s.add("    public List<" + pascal + "RegistForm> get" + pascal + "Grid() {");
                s.add("        return " + camel + "Grid;");
                s.add("    }");
                s.add("");
                s.add("    /**");
                s.add("     * @param p");
                s.add("     */");
                s.add("    public void set" + pascal + "Grid(final List<" + pascal + "RegistForm> p) {");
                s.add("        this." + camel + "Grid = p;");
                s.add("    }");
            }
            s.add("");
            s.add("    /** 関連チェック */");
            s.add("    @Override");
            s.add("    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {");
            s.add("        LOG.trace(\"validate() not overridden in subclasses.\");");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entityName + "RegistForm.java";
            javaFilePaths.put(javaFilePath, formPackage + "." + entityName + "RegistForm");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 フォームチェック追加
     * @param primaryKeys 主キー情報のリスト
     * @param columnInfo カラム情報
     * @param s 出力文字列のリスト
     */
    private static void javaFormDetailRegistChecks(final List<String> primaryKeys, final ColumnInfo columnInfo,
            final List<String> s) {

        // 必須チェック
        if (columnInfo.getNullable() == 0) {

            if (columnInfo.isNumbering()) {
                // 主キーは親モデルから植え付けるか採番するので除外
                LOG.trace("skip NotBlank.");
                //            } else if (StringUtil.endsWith(inputFlagSuffixs, columnInfo.getColumnName())) {
                //                // フラグも除外
                //                LOG.trace("skip NotBlank.");
            } else if (!StringUtil.isNullOrBlank(charNotNullRe)
                    && !columnInfo.isPk()
                    && columnInfo.getTypeName().equals("CHAR")
                    && !columnInfo.getColumnName().matches(charNotNullRe)) {
                // 主キー以外のNOTNULL-CHARで、NULL必須サフィックス指定がありこれに含まれない場合も除外（ホスト向け対応）
                LOG.trace("skip NotBlank.");
            } else {
                s.add("    @jakarta.validation.constraints.NotBlank");
            }
        }

        String columnName = columnInfo.getColumnName();

        int matchLength = 0;
        String validSuffix = null;
        for (String suffix : validSuffixs) {
            Pattern pattern = Pattern.compile("(?i).*(" + suffix + ")$");
            Matcher matcher = pattern.matcher(columnName);
            if (matcher.find()) {
                String matched = matcher.group(1);
                if (matchLength < matched.length()) {
                    matchLength = matched.length();
                    validSuffix = suffix;
                }
            }
        }

        if (validSuffix != null) {
            // Patternの指定がある場合

            String re = bundle.getString("BeanGenerator.valid." + validSuffix);
            s.add("    @jakarta.validation.constraints.Pattern(regexp = \"" + re + "\")");

        } else {
            // Patternの指定がない場合

            int columnSize = columnInfo.getColumnSize();

            // 形式チェック
            if (columnInfo.getTypeName().equals("INT") || columnInfo.getTypeName().equals("DECIMAL")
                    || columnInfo.getTypeName().equals("DOUBLE") || columnInfo.getTypeName().equals("NUMBER")
                    || columnInfo.getTypeName().equals("NUMERIC")) {

                // DECIMALの場合（整数桁・小数桁）
                int decimalDigits = columnInfo.getDecimalDigits();
                int integer = columnSize - decimalDigits;
                String re = "([0-9]{0," + integer + "}\\\\.?[0-9]{0," + decimalDigits + "}?)?";
                s.add("    @jakarta.validation.constraints.Pattern(regexp = \"" + re + "\")");

            } else {
                // DECIMAL以外

                // 上記以外の場合は最大桁チェック
                s.add("    @jakarta.validation.constraints.Size(max = " + columnSize + ")");
            }
        }
    }

    /**
     * 検索画面 フォーム出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaFormIndexRegist(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = formPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String remarks = tableInfo.getRemarks();

            String camel = StringUtil.toCamelCase(tableName);
            String pascal = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + formPackage + ";");
            s.add("");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import org.slf4j.Logger;");
            s.add("import org.slf4j.LoggerFactory;");
            s.add("");
            s.add("import jakarta.validation.Valid;");
            s.add("import jp.co.golorp.emarf.process.BaseProcess;");
            s.add("import jp.co.golorp.emarf.validation.IForm;");
            s.add("");
            s.add("/**");
            s.add(" * " + remarks + "一覧登録フォーム");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + pascal + "SRegistForm implements IForm {");
            s.add("");
            s.add("    /** logger */");
            s.add("    private static final Logger LOG = LoggerFactory.getLogger(" + pascal + "RegistForm.class);");
            s.add("");
            s.add("    /** " + tableInfo.getRemarks() + "登録フォームのリスト */");
            s.add("    @Valid");
            s.add("    private List<" + pascal + "RegistForm> " + camel + "Grid;");
            s.add("");
            s.add("    /**");
            s.add("     * @return " + tableInfo.getRemarks() + "登録フォームのリスト");
            s.add("     */");
            s.add("    public List<" + pascal + "RegistForm> get" + pascal + "Grid() {");
            s.add("        return " + camel + "Grid;");
            s.add("    }");
            s.add("");
            s.add("    /**");
            s.add("     * @param p " + tableInfo.getRemarks() + "登録フォームのリスト");
            s.add("     */");
            s.add("    public void set" + pascal + "Grid(final List<" + pascal + "RegistForm> p) {");
            s.add("        this." + camel + "Grid = p;");
            s.add("    }");
            s.add("");
            s.add("    /** 関連チェック */");
            s.add("    @Override");
            s.add("    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {");
            s.add("        LOG.debug(\"validate() not overridden in subclasses.\");");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + pascal + "SRegistForm.java";
            javaFilePaths.put(javaFilePath, formPackage + "." + pascal + "SRegistForm");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isCompile) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * javaファイルをコンパイル
     * @param javaFilePath javaファイルパス
     * @param className クラス名
     */
    private static void javaCompile(final String javaFilePath, final String className) {

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
