package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.sql.DataSources;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * java/html/sql出力
 *
 * @author toshiyuki
 */
public final class BeanGenerator {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(BeanGenerator.class);

    /** BeanGenerator.properties */
    private static ResourceBundle bundle;

    /** 登録日時カラム名 */
    private static String insertDt;
    /** 登録者カラム名 */
    private static String insertBy;
    /** 更新日時カラム名 */
    private static String updateDt;
    /** 更新者カラム名 */
    private static String updateBy;

    /** options項目サフィックス */
    private static String[] optionsSuffixs;

    /** 範囲指定サフィックス */
    private static String[] inputRangeSuffixs;
    /** 部分一致サフィックス */
    private static String[] inputLikeSuffixs;
    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;

    /** 参照IDサフィックス */
    private static String[] referIdSuffixs;
    /** 参照名サフィックス */
    private static String referMeiSuffix;

    /** プライベートコンストラクタ */
    private BeanGenerator() {
    }

    /**
     * エントリポイント（デバッグ用）
     * @param args
     */
    public static void main(final String[] args) {
        String projectDir = "C:\\Users\\toshiyuki\\Tools\\pleiades-2021-12-java-win-64bit-jre_20220106\\pleiades\\runtime-Eclipseアプリケーション\\plugindebug";
        projectDir = "C:\\Users\\toshiyuki\\git\\emarfkrow\\exam-com";
        ResourceBundles.getSrcPaths().add(projectDir + File.separator + "src\\main\\resources");
        BeanGenerator.generate(projectDir);
    }

    /**
     * 各ファイル出力 主処理
     * @param projectDir
     */
    public static void generate(final String projectDir) {

        /* 設定ファイル読み込み */
        bundle = ResourceBundles.getBundle(BeanGenerator.class);

        String isGenerate = bundle.getString("BeanGenerator.generate");
        if (!isGenerate.toLowerCase().equals("true")) {
            return;
        }

        insertDt = bundle.getString("BeanGenerator.insert_dt");
        insertBy = bundle.getString("BeanGenerator.insert_by");
        updateDt = bundle.getString("BeanGenerator.update_dt");
        updateBy = bundle.getString("BeanGenerator.update_by");

        optionsSuffixs = bundle.getString("BeanGenerator.options.suffixs").split(",");

        inputRangeSuffixs = bundle.getString("BeanGenerator.input.range.suffixs").split(",");
        inputLikeSuffixs = bundle.getString("BeanGenerator.input.like.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");

        referIdSuffixs = bundle.getString("BeanGenerator.refer.id.suffixs").split(",");
        referMeiSuffix = bundle.getString("BeanGenerator.refer.mei.suffix");

        // テーブル情報を取得
        List<TableInfo> tableInfos = DataSources.getTableInfos();

        // ファイル出力開始
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String entityPackage = bundle.getString("BeanGenerator.package.entity");
        String actionPackage = bundle.getString("BeanGenerator.package.action");
        String formPackage = bundle.getString("BeanGenerator.package.form");

        // 出力フォルダを再作成
        String entityPackagePath = entityPackage.replace(".", File.separator);
        String entityPackageDir = projectDir + File.separator + javaPath + File.separator + entityPackagePath;
        FileUtil.reMkDir(entityPackageDir);

        // 出力フォルダを再作成
        String actionPackagePath = actionPackage.replace(".", File.separator);
        String actionPackageDir = projectDir + File.separator + javaPath + File.separator + actionPackagePath;
        FileUtil.reMkDir(actionPackageDir);

        // 出力フォルダを再作成
        String formPackagePath = formPackage.replace(".", File.separator);
        String formPackageDir = projectDir + File.separator + javaPath + File.separator + formPackagePath;
        FileUtil.reMkDir(formPackageDir);

        // javaファイルを出力
        BeanGenerator.javaEntity(tableInfos, projectDir);
        BeanGenerator.javaActionIndexRegist(tableInfos, projectDir);
        BeanGenerator.javaActionIndexDelete(tableInfos, projectDir);
        BeanGenerator.javaActionDetailGet(tableInfos, projectDir);
        BeanGenerator.javaActionDetailDelete(tableInfos, projectDir);
        BeanGenerator.javaActionDetailRegist(tableInfos, projectDir);
        BeanGenerator.javaFormIndexRegist(tableInfos, projectDir);
        BeanGenerator.javaFormDetailRegist(tableInfos, projectDir);

        HtmlGenerator.generate(projectDir, tableInfos);

        String sqlDir = projectDir + File.separator + bundle.getString("BeanGenerator.sqlPath");
        FileUtil.reMkDir(sqlDir);

        for (TableInfo tableInfo : tableInfos) {

            // 検索SQLを出力
            sqlSearch(sqlDir, tableInfo);
        }

        System.out.println(tableInfos);
    }

    /**
     * エンティティ出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaEntity(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String entityPackage = bundle.getString("BeanGenerator.package.entity");

        // 出力フォルダを再作成
        String packagePath = entityPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
            String entityName = StringUtil.toPascalCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + entityPackage + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.time.ZoneId;");
            s.add("import java.util.ArrayList;");
            s.add("import java.util.Date;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import com.fasterxml.jackson.annotation.JsonFormat;");
            s.add("import com.fasterxml.jackson.databind.annotation.JsonDeserialize;");
            s.add("import com.fasterxml.jackson.databind.annotation.JsonSerialize;");
            s.add("import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;");
            s.add("import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;");
            s.add("");
            s.add("import jp.co.golorp.emarf.entity.IEntity;");
            s.add("import jp.co.golorp.emarf.lang.StringUtil;");
            s.add("import jp.co.golorp.emarf.sql.Queries;");
            s.add("");
            s.add("/**");
            s.add(" * " + tableName + "");
            s.add(" *");
            s.add(" * @author generator");
            s.add(" *");
            s.add(" */");
            s.add("public class " + entityName + " implements IEntity {");
            // property
            for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
                String columnName = columnInfo.getColumnName();
                String mei = columnInfo.getRemarks();
                String camel = StringUtil.toCamelCase(columnName);
                String pascal = StringUtil.toPascalCase(columnName);
                String dataType = columnInfo.getDataType();
                s.add("");
                s.add("    /**");
                s.add("     * " + mei);
                s.add("     */");
                if (dataType.equals("java.time.LocalDateTime")) {
                    s.add("    @JsonDeserialize(using = LocalDateTimeDeserializer.class)");
                    s.add("    @JsonSerialize(using = LocalDateTimeSerializer.class)");
                    s.add("    @JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss.SSS\")");
                }
                s.add("    private " + dataType + " " + camel + ";");
                s.add("");
                s.add("    /**");
                s.add("     * @return " + mei);
                s.add("     */");
                s.add("    public " + dataType + " get" + pascal + "() {");
                s.add("        return this." + camel + ";");
                s.add("    }");
                s.add("");
                s.add("    /**");
                s.add("     * @param o " + mei);
                s.add("     */");
                s.add("    public void set" + pascal + "(final Object o) {");
                if (dataType.equals("java.time.LocalDateTime")) {
                    s.add("        if (o != null && o instanceof Long) {");
                    s.add("            Date d = new Date((Long) o);");
                    s.add("            this." + camel
                            + " = java.time.LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());");
                    s.add("        } else if (o != null && o.toString().matches(\"^[0-9]+\")) {");
                    s.add("            Date d = new Date(Long.valueOf(o.toString()));");
                    s.add("            this." + camel
                            + " = java.time.LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());");
                    s.add("        } else if (!StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = " + dataType + ".parse(o.toString());");
                } else if (dataType.equals("java.math.BigDecimal")) {
                    s.add("        if (!StringUtil.isNullOrBlank(o)) {");
                    s.add("            this." + camel + " = new java.math.BigDecimal(o.toString());");
                } else {
                    s.add("        if (!StringUtil.isNullOrBlank(o)) {");
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
            javaFilePaths.add(javaFilePath);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * エンティティにCRUD追加
     * @param tableInfo
     * @param s
     */
    private static void javaEntityCRUD(final TableInfo tableInfo, final List<String> s) {

        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);

        s.add("");
        s.add("    /**");
        int i = 0;
        String getParams = "";
        for (String pk : tableInfo.getPrimaryKeys()) {
            if (pk.length() > 0) {
                String primaryKey = StringUtil.toCamelCase(pk);
                s.add("     * @param param" + ++i + " " + primaryKey);
                if (getParams.length() > 0) {
                    getParams += ", ";
                }
                getParams += "final Object param" + i;
            }
        }
        s.add("     * @return " + entityName);
        s.add("     */");
        s.add("    public static " + entityName + " get(" + getParams + ") {");
        s.add("");
        s.add("        List<String> whereList = new ArrayList<String>();");
        for (String pk : tableInfo.getPrimaryKeys()) {
            if (pk.length() > 0) {
                pk = pk.toLowerCase();
                s.add("        whereList.add(\"" + pk + " = :" + pk + "\");");
            }
        }
        s.add("");
        s.add("        String sql = \"SELECT * FROM " + tableName + " WHERE \" + String.join(\" AND \", whereList);");
        s.add("");
        s.add("        Map<String, Object> params = new HashMap<String, Object>();");
        i = 0;
        for (String pk : tableInfo.getPrimaryKeys()) {
            if (pk.length() > 0) {
                pk = pk.toLowerCase();
                s.add("        params.put(\"" + pk + "\", param" + ++i + ");");
            }
        }
        s.add("");
        s.add("        return Queries.get(sql, params, " + entityName + ".class);");
        s.add("    }");
        javaEntityCRUDInsert(tableInfo, s);
        javaEntityCRUDUpdate(tableInfo, s);
        s.add("");
        s.add("    /**");
        s.add("     * @return 削除件数");
        s.add("     */");
        s.add("    public int delete() {");
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String pascal = StringUtil.toPascalCase(childName);
            String camel = StringUtil.toCamelCase(childName);
            s.add("");
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
            s.add("        if (this." + camel + " != null) {");
            s.add("            this." + camel + ".delete();");
            s.add("        }");
        }
        s.add("");
        s.add("        String sql = \"DELETE FROM " + tableName + " WHERE \" + getWhere();");
        s.add("");
        s.add("        Map<String, Object> params = toMap(null, null);");
        s.add("");
        s.add("        return Queries.regist(sql, params);");
        s.add("    }");
    }

    private static void javaEntityCRUDInsert(final TableInfo tableInfo, final List<String> s) {

        String tableName = tableInfo.getTableName();

        s.add("");
        s.add("    /**");
        s.add("     * @param now");
        s.add("     * @param id");
        s.add("     * @return 追加件数");
        s.add("     */");
        s.add("    public int insert(final LocalDateTime now, final String id) {");
        List<String> primaryKeys = tableInfo.getPrimaryKeys();
        String lastKey = primaryKeys.get(primaryKeys.size() - 1);
        ColumnInfo lastKeyInfo = tableInfo.getColumnInfos().get(lastKey);
        if (lastKeyInfo.isNumbering()) {
            s.add("");
            s.add("        // 採番処理");
            s.add("        numbering();");
        }
        // 子モデル
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String camel = StringUtil.toCamelCase(childName);
            String pascal = StringUtil.toPascalCase(childName);
            s.add("");
            s.add("        // " + childInfo.getRemarks() + "テーブルの登録");
            s.add("        if (this." + camel + "s != null) {");
            s.add("            for (" + pascal + " " + camel + " : this." + camel + "s) {");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("                " + camel + ".set" + pascalKey + "(this.get" + pascalKey + "());");
            }
            s.add("                " + camel + ".insert(now, id);");
            s.add("            }");
            s.add("        }");
        }
        // 兄弟モデル
        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
            String brosName = brosInfo.getTableName();
            String camel = StringUtil.toCamelCase(brosName);
            s.add("");
            s.add("        if (this." + camel + " != null) {");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("            this." + camel + ".set" + pascalKey + "(this.get" + pascalKey + "());");
            }
            s.add("            this." + camel + ".insert(now, id);");
            s.add("        }");
        }
        // 履歴モデル
        TableInfo historyInfo = tableInfo.getHistoryInfo();
        if (historyInfo != null) {
            String historyName = historyInfo.getTableName();
            String camel = StringUtil.toCamelCase(historyName);
            String pascal = StringUtil.toPascalCase(historyName);
            s.add("");
            s.add("        // " + historyInfo.getRemarks() + "テーブルの登録");
            s.add("        " + pascal + " " + camel + " = new " + pascal + "();");
            for (String columnName : tableInfo.getColumnInfos().keySet()) {
                String camelColumn = StringUtil.toCamelCase(columnName);
                String pascalColumn = StringUtil.toPascalCase(columnName);
                s.add("        " + camel + ".set" + pascalColumn + "(this." + camelColumn + ");");
            }
            s.add("        " + camel + ".insert(now, id);");
        }
        s.add("");
        s.add("        // " + tableInfo.getRemarks() + "テーブルの登録");
        s.add("        List<String> nameList = new ArrayList<String>();");
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            columnName = columnName.toLowerCase();
            s.add("        nameList.add(\"" + columnName + " -- :" + columnName + "\");");
        }
        s.add("        String name = String.join(\"\\r\\n, \", nameList);");
        s.add("");
        s.add("        List<String> valueList = new ArrayList<String>();");
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            columnName = columnName.toLowerCase();
            s.add("        valueList.add(\":" + columnName + "\");");
        }
        s.add("        String value = String.join(\"\\r\\n, \", valueList);");
        s.add("");
        s.add("        String sql = \"INSERT INTO " + tableName
                + "(\\r\\n\" + name + \"\\r\\n) VALUES (\\r\\n\" + value + \"\\r\\n); \";");
        s.add("");
        s.add("        Map<String, Object> params = toMap(now, id);");
        s.add("");
        s.add("        return Queries.regist(sql, params);");
        s.add("    }");
        if (lastKeyInfo.isNumbering()) {
            s.add("");
            s.add("    /**");
            s.add("     *");
            s.add("     */");
            s.add("    protected void numbering() {");
            s.add("");
            String lastPk = tableInfo.getPrimaryKeys().get(tableInfo.getPrimaryKeys().size() - 1);
            String camelPk = StringUtil.toCamelCase(lastPk);
            s.add("        if (this." + camelPk + " != null) {");
            s.add("            return;");
            s.add("        }");
            s.add("");
            s.add("        String sql = \"SELECT CASE WHEN MAX(e." + lastPk + ") IS NULL THEN 0 ELSE MAX(e." + lastPk
                    + ") END + 1 AS " + lastPk + " FROM " + tableName + " e\";");
            s.add("");
            s.add("        Map<String, Object> params = new HashMap<String, Object>();");
            if (tableInfo.getPrimaryKeys().size() > 1) {
                s.add("");
                s.add("        List<String> whereList = new ArrayList<String>();");
                for (int j = 0; j < tableInfo.getPrimaryKeys().size() - 1; j++) {
                    String primaryKey = tableInfo.getPrimaryKeys().get(j);
                    s.add("        whereList.add(\"e." + primaryKey + " = :" + primaryKey.toLowerCase() + "\");");
                }
                s.add("        sql += \" WHERE \" + String.join(\" AND \", whereList);");
                s.add("");
                for (int j = 0; j < tableInfo.getPrimaryKeys().size() - 1; j++) {
                    String primaryKey = tableInfo.getPrimaryKeys().get(j);
                    String camel = StringUtil.toCamelCase(primaryKey);
                    s.add("        params.put(\"" + camel + "\", this." + camel + ");");
                }
            }
            s.add("");
            s.add("        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);");
            s.add("        Object o = mapList.get(0).get(\"" + lastPk + "\");");
            s.add("");
            s.add("        this.set" + StringUtil.toPascalCase(lastPk) + "(o);");
            s.add("    }");
        }
    }

    private static void javaEntityCRUDUpdate(final TableInfo tableInfo, final List<String> s) {

        String tableName = tableInfo.getTableName();

        s.add("");
        s.add("    /**");
        s.add("     * @param now");
        s.add("     * @param id");
        s.add("     * @return 更新件数");
        s.add("     */");
        s.add("    public int update(final LocalDateTime now, final String id) {");
        // 子モデル
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String camel = StringUtil.toCamelCase(childName);
            String pascal = StringUtil.toPascalCase(childName);
            s.add("");
            s.add("        // " + childInfo.getRemarks() + "テーブルの登録");
            s.add("        if (this." + camel + "s != null) {");
            s.add("            for (" + pascal + " " + camel + " : this." + camel + "s) {");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String camelKey = StringUtil.toCamelCase(primaryKey);
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("                " + camel + ".set" + pascalKey + "(this." + camelKey + ");");
            }
            s.add("                try {");
            s.add("                    " + camel + ".insert(now, id);");
            s.add("                } catch (Exception e) {");
            s.add("                    " + camel + ".update(now, id);");
            s.add("                }");
            s.add("            }");
            s.add("            this." + camel + "s = null;");
            s.add("            this.get" + pascal + "s();");
            s.add("            if (this." + camel + "s != null) {");
            s.add("                for (" + pascal + " " + camel + " : this." + camel + "s) {");
            s.add("                    if (!" + camel + ".getUpdateDt().equals(now)) {");
            s.add("                        " + camel + ".delete();");
            s.add("                    }");
            s.add("                }");
            s.add("            }");
            s.add("        }");
        }
        // 兄弟モデル
        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
            String brosName = brosInfo.getTableName();
            String camel = StringUtil.toCamelCase(brosName);
            s.add("");
            s.add("        if (this." + camel + " != null) {");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascalKey = StringUtil.toPascalCase(primaryKey);
                s.add("            " + camel + ".set" + pascalKey + "(this.get" + pascalKey + "());");
            }
            s.add("            try {");
            s.add("                " + camel + ".insert(now, id);");
            s.add("            } catch (Exception e) {");
            s.add("                " + camel + ".update(now, id);");
            s.add("            }");
            s.add("        }");
        }
        // 履歴モデル
        TableInfo historyInfo = tableInfo.getHistoryInfo();
        if (historyInfo != null) {
            String historyName = historyInfo.getTableName();
            String camel = StringUtil.toCamelCase(historyName);
            String pascal = StringUtil.toPascalCase(historyName);
            s.add("");
            s.add("        // " + historyInfo.getRemarks() + "テーブルの登録");
            s.add("        " + pascal + " " + camel + " = new " + pascal + "();");
            for (String columnName : tableInfo.getColumnInfos().keySet()) {
                String camelColumn = StringUtil.toCamelCase(columnName);
                String pascalColumn = StringUtil.toPascalCase(columnName);
                s.add("        " + camel + ".set" + pascalColumn + "(this." + camelColumn + ");");
            }
            s.add("        " + camel + ".insert(now, id);");
        }
        s.add("");
        s.add("        // " + tableInfo.getRemarks() + "テーブルの登録");
        s.add("        List<String> setList = new ArrayList<String>();");
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            columnName = columnName.toLowerCase();
            if (!insertDt.toLowerCase().equals(columnName) && !insertBy.toLowerCase().equals(columnName)) {
                s.add("        setList.add(\"" + columnName + " = :" + columnName + "\");");
            }
        }
        s.add("        String set = String.join(\", \", setList);");
        s.add("");
        s.add("        String sql = \"UPDATE " + tableName + " SET \" + set + \" WHERE \" + getWhere();");
        s.add("");
        s.add("        Map<String, Object> params = toMap(now, id);");
        s.add("");
        s.add("        return Queries.regist(sql, params);");
        s.add("    }");
    }

    /**
     * エンティティにCRUD用ユーティリティ追加
     * @param tableInfo
     * @param s
     */
    private static void javaEntityUtil(final TableInfo tableInfo, final List<String> s) {

        // getWhere
        s.add("");
        s.add("    private String getWhere() {");
        s.add("        List<String> whereList = new ArrayList<String>();");
        for (String pk : tableInfo.getPrimaryKeys()) {
            if (pk.length() == 0) {
                continue;
            }
            pk = pk.toLowerCase();
            s.add("        whereList.add(\"" + pk + " = :" + pk + "\");");
        }
        s.add("        whereList.add(\"" + updateDt + " = '\" + this." + StringUtil.toCamelCase(updateDt)
                + " + \"'\");");
        s.add("        return String.join(\" AND \", whereList);");
        s.add("    }");

        // toMap
        s.add("");
        s.add("    private Map<String, Object> toMap(final LocalDateTime now, final String id) {");
        s.add("        Map<String, Object> params = new HashMap<String, Object>();");
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            columnName = columnName.toLowerCase();
            if (insertDt.toLowerCase().equals(columnName) || insertBy.toLowerCase().equals(columnName)
                    || updateDt.toLowerCase().equals(columnName) || updateBy.toLowerCase().equals(columnName)) {
                continue;
            }
            String camelCase = StringUtil.toCamelCase(columnName);
            s.add("        params.put(\"" + columnName + "\", this." + camelCase + ");");
        }
        s.add("        params.put(\"" + insertDt + "\", now);");
        s.add("        params.put(\"" + insertBy + "\", id);");
        s.add("        params.put(\"" + updateDt + "\", now);");
        s.add("        params.put(\"" + updateBy + "\", id);");
        s.add("        return params;");
        s.add("    }");
    }

    /**
     * エンティティに兄弟モデル追加
     * @param tableInfo
     * @param s
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
            s.add("    /**");
            s.add("     * " + brosInfo.getRemarks());
            s.add("     */");
            s.add("    private " + pascal + " " + camel + ";");
            s.add("");
            s.add("    /**");
            s.add("     * @return " + brosInfo.getRemarks());
            s.add("     */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + pascal + "\")");
            s.add("    public " + pascal + " get" + pascal + "() {");
            s.add("        return this." + camel + ";");
            s.add("    }");
            s.add("");
            s.add("    /**");
            s.add("     * @param p " + brosInfo.getRemarks());
            s.add("     */");
            s.add("    public void set" + pascal + "(final " + pascal + " p) {");
            s.add("        this." + camel + " = p;");
            s.add("    }");
            s.add("");
            s.add("    /**");
            s.add("     * @return " + brosInfo.getRemarks());
            s.add("     */");
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
     * @param tableInfo
     * @param s
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
            s.add("    /**");
            s.add("     * " + childInfo.getRemarks() + "のリスト");
            s.add("     */");
            s.add("    private List<" + pascal + "> " + camel + "s;");
            s.add("");
            s.add("    /**");
            s.add("     * @return " + childInfo.getRemarks() + "のリスト");
            s.add("     */");
            s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + pascal + "s\")");
            s.add("    public List<" + pascal + "> get" + pascal + "s() {");
            s.add("        return this." + camel + "s;");
            s.add("    }");
            s.add("");
            s.add("    /**");
            s.add("     * @param list " + childInfo.getRemarks() + "のリスト");
            s.add("     */");
            s.add("    public void set" + pascal + "s(final List<" + pascal + "> list) {");
            s.add("        this." + camel + "s = list;");
            s.add("    }");
            s.add("");
            s.add("    /**");
            s.add("     * @return " + childInfo.getRemarks() + "のリスト");
            s.add("     */");
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
            s.add("");
            s.add("        List<String> whereList = new ArrayList<String>();");
            for (String pk : tableInfo.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                pk = pk.toLowerCase();
                s.add("        whereList.add(\"" + pk + " = :" + pk + "\");");
            }
            s.add("");
            s.add("        String sql = \"SELECT * FROM " + childName
                    + " WHERE \" + String.join(\" AND \", whereList);");
            s.add("");
            s.add("        Map<String, Object> params = new HashMap<String, Object>();");
            i = 0;
            for (String pk : tableInfo.getPrimaryKeys()) {
                if (pk.length() == 0) {
                    continue;
                }
                pk = pk.toLowerCase();
                s.add("        params.put(\"" + pk + "\", param" + ++i + ");");
            }
            s.add("");
            s.add("        return Queries.select(sql, params, " + pascal + ".class);");
            s.add("    }");
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaActionIndexRegist(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String actionPackage = bundle.getString("BeanGenerator.package.action");
        String entityPackage = bundle.getString("BeanGenerator.package.entity");

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
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
            s.add("import jp.co.golorp.emarf.lang.StringUtil;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("");
            s.add("public class " + pascal + "SRegistAction extends BaseAction {");
            s.add("");
            s.add("    /**");
            s.add("     *");
            s.add("     */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
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
            s.add("            " + pascal + " e = new " + pascal + "();");
            for (String columnName : tableInfo.getColumnInfos().keySet()) {
                String pascalColumn = StringUtil.toPascalCase(columnName);
                s.add("            e.set" + pascalColumn + "(gridRow.get(\"" + columnName + "\"));");
            }
            s.add("");
            s.add("            // 主キー情報が足りていなければINSERT");
            s.add("            boolean isNew = false;");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                s.add("            if (StringUtil.isNullOrBlank(gridRow.get(\"" + primaryKey + "\"))) {");
                s.add("                isNew = true;");
                s.add("            }");
            }
            s.add("");
            s.add("            if (isNew) {");
            s.add("                if (e.insert(now, id) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.insert\");");
            s.add("                }");
            s.add("            } else {");
            s.add("                if (e.update(now, id) != 1) {");
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

            String javaFilePath = packageDir + File.separator + pascal + "SRegistAction.java";
            javaFilePaths.add(javaFilePath);

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaActionIndexDelete(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String actionPackage = bundle.getString("BeanGenerator.package.action");
        String entityPackage = bundle.getString("BeanGenerator.package.entity");

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
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
            s.add("import jp.co.golorp.emarf.lang.StringUtil;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("public class " + pascal + "SDeleteAction extends BaseAction {");
            s.add("");
            s.add("    /**");
            s.add("     *");
            s.add("     */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
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
            s.add("            " + pascal + " e = FormValidator.toBean(" + pascal + ".class.getName(), gridRow);");
            s.add("");
            s.add("            // 主キー情報が足りているか確認");
            s.add("            boolean isNew = false;");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                s.add("            if (StringUtil.isNullOrBlank(gridRow.get(\"" + primaryKey + "\"))) {");
                s.add("                isNew = true;");
                s.add("            }");
            }
            s.add("");
            s.add("            if (isNew) {");
            s.add("                throw new OptLockError(\"error.cant.delete\");");
            s.add("            } else {");
            s.add("                if (e.delete() != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.delete\");");
            s.add("                }");
            s.add("            }");
            s.add("        }");
            s.add("");
            s.add("        map.put(\"INFO\", Messages.get(\"info.delete\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + pascal + "SDeleteAction.java";
            javaFilePaths.add(javaFilePath);

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaActionDetailGet(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String actionPackage = bundle.getString("BeanGenerator.package.action");
        String entityPackage = bundle.getString("BeanGenerator.package.entity");

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
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
            s.add("public class " + pascalTable + "GetAction extends BaseAction {");
            s.add("");
            s.add("    /**");
            s.add("     *");
            s.add("     */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        // パラメータが不足していたら終了");
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
            s.add("        // " + tableInfo.getRemarks() + "を設定");
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
            s.add("");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + pascalTable + "GetAction.java";
            javaFilePaths.add(javaFilePath);

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaActionDetailDelete(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String actionPackage = bundle.getString("BeanGenerator.package.action");
        String entityPackage = bundle.getString("BeanGenerator.package.entity");

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
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
            s.add("public class " + entityName + "DeleteAction extends BaseAction {");
            s.add("");
            s.add("    /**");
            s.add("     *");
            s.add("     */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        " + entityName + " e = FormValidator.toBean(" + entityName + ".class.getName(), postJson);");
            s.add("");
            s.add("        if (e.delete() != 1) {");
            s.add("            throw new OptLockError(\"error.cant.delete\");");
            s.add("        }");
            s.add("        map.put(\"INFO\", Messages.get(\"info.delete\"));");
            s.add("");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entityName + "DeleteAction.java";
            javaFilePaths.add(javaFilePath);

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaActionDetailRegist(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String actionPackage = bundle.getString("BeanGenerator.package.action");
        String entityPackage = bundle.getString("BeanGenerator.package.entity");

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
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
            s.add("import jp.co.golorp.emarf.lang.StringUtil;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("public class " + entityName + "RegistAction extends BaseAction {");
            s.add("");
            s.add("    /**");
            s.add("     *");
            s.add("     */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        " + entityName + " e = FormValidator.toBean(" + entityName + ".class.getName(), postJson);");
            s.add("");
            s.add("        // 主キー情報が足りていなければINSERT");
            s.add("        boolean isNew = false;");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascal = StringUtil.toPascalCase(primaryKey);
                s.add("        if (StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("            isNew = true;");
                s.add("        }");
            }
            s.add("");
            s.add("        if (isNew) {");
            s.add("            if (e.insert(now, id) != 1) {");
            s.add("                throw new OptLockError(\"error.cant.insert\");");
            s.add("            }");
            s.add("            map.put(\"INFO\", Messages.get(\"info.insert\"));");
            s.add("        } else {");
            s.add("            if (e.update(now, id) == 1) {");
            s.add("                map.put(\"INFO\", Messages.get(\"info.update\"));");
            s.add("            } else if (e.insert(now, id) == 1) {");
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

            String javaFilePath = packageDir + File.separator + entityName + "RegistAction.java";
            javaFilePaths.add(javaFilePath);

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * 検索画面 フォーム出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaFormIndexRegist(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String formPackage = bundle.getString("BeanGenerator.package.form");

        // 出力フォルダを再作成
        String packagePath = formPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
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
            s.add("public class " + pascal + "SRegistForm implements IForm {");
            s.add("");
            s.add("    /** logger */");
            s.add("    private static final Logger LOG = LoggerFactory.getLogger(" + pascal + "RegistForm.class);");
            s.add("");
            s.add("    /** " + tableInfo.getRemarks() + " */");
            s.add("    @Valid");
            s.add("    private List<" + pascal + "RegistForm> " + camel + "Grid;");
            s.add("");
            s.add("    /**");
            s.add("     * @return " + tableInfo.getRemarks());
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
            s.add("");
            s.add("    /**");
            s.add("     * correlation check");
            s.add("     */");
            s.add("    @Override");
            s.add("    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {");
            s.add("        LOG.debug(\"not overridden in subclasses.\");");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + pascal + "SRegistForm.java";
            javaFilePaths.add(javaFilePath);

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * 詳細画面 フォーム出力
     * @param tableInfos
     * @param projectDir
     */
    private static void javaFormDetailRegist(final List<TableInfo> tableInfos, final String projectDir) {

        // プロパティファイルからjavaファイル出力パスと出力するパッケージを取得
        String javaPath = bundle.getString("BeanGenerator.javaPath");
        String formPackage = bundle.getString("BeanGenerator.package.form");

        // 出力フォルダを再作成
        String packagePath = formPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        List<String> javaFilePaths = new ArrayList<String>();

        for (TableInfo tableInfo : tableInfos) {
            String tableName = tableInfo.getTableName();
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
            s.add("import jakarta.validation.constraints.Size;");
            s.add("import jp.co.golorp.emarf.process.BaseProcess;");
            s.add("import jp.co.golorp.emarf.validation.IForm;");
            s.add("");
            s.add("public class " + entityName + "RegistForm implements IForm {");
            s.add("");
            s.add("    /** logger */");
            s.add("    private static final Logger LOG = LoggerFactory.getLogger(" + entityName + "RegistForm.class);");
            for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {

                // レコードメタデータならスキップ
                String lower = columnInfo.getColumnName().toLowerCase();
                if (lower.equals(insertDt) || lower.equals(insertBy) || lower.equals(updateDt)
                        || lower.equals(updateBy)) {
                    continue;
                }

                String camel = StringUtil.toCamelCase(lower);
                String pascal = StringUtil.toPascalCase(lower);

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
                s.add("     * @param p");
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
            s.add("    /**");
            s.add("     * correlation check");
            s.add("     */");
            s.add("    @Override");
            s.add("    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {");
            s.add("        LOG.debug(\"not overridden in subclasses.\");");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entityName + "RegistForm.java";
            javaFilePaths.add(javaFilePath);

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (String javaFilePath : javaFilePaths) {
                BeanGenerator.javaCompile(javaFilePath);
            }
        }
    }

    /**
     * @param primaryKeys
     * @param columnInfo
     * @param s
     */
    private static void javaFormDetailRegistChecks(final List<String> primaryKeys, final ColumnInfo columnInfo,
            final List<String> s) {

        // NotBlank（主キーは親モデルから植え付けるか採番するので除外）
        if (columnInfo.getNullable() == 0) {
            if (!columnInfo.isNumbering()) {
                s.add("    @jakarta.validation.constraints.NotBlank");
            }
        }

        // 形式チェック
        int columnSize = columnInfo.getColumnSize();
        if (columnInfo.getTypeName().equals("DECIMAL")) {
            // DECIMALの場合
            int decimalDigits = columnInfo.getDecimalDigits();
            int integer = columnSize - decimalDigits;
            String re = "[0-9]{0," + integer + "}\\\\.?[0-9]{0," + decimalDigits + "}?";
            s.add("    @jakarta.validation.constraints.Pattern(regexp = \"" + re + "\")");
        } else {
            String[] columnNames = columnInfo.getColumnName().split("_");
            String suffix = columnNames[columnNames.length - 1];
            try {
                // Patternの指定がある場合
                String re = bundle.getString("BeanGenerator.valid." + suffix);
                s.add("    @jakarta.validation.constraints.Pattern(regexp = \"" + re + "\")");
            } catch (Exception e) {
                // 上記以外の場合
                s.add("    @Size(max = " + columnSize + ")");
            }
        }
    }

    /**
     * javaファイルをコンパイル
     * @param javaFilePath
     */
    private static void javaCompile(final String javaFilePath) {

        String classPath = System.getProperty("java.class.path", null);

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
        int result = compiler.run(null, null, null, "-classpath", classPath + pathes, javaFilePath);
        if (result == 0) {
            LOG.info("compile success. [" + javaFilePath + "]");
        } else {
            LOG.error("compile failure. [" + javaFilePath + "]");
        }
    }

    /**
     * 各モデルの検索SQL出力
     * @param sqlDir
     * @param tableInfo
     */
    private static void sqlSearch(final String sqlDir, final TableInfo tableInfo) {

        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);

        List<String> s = new ArrayList<String>();
        s.add("SELECT");
        s.add("      a.*");
        int i = 0;
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
            TableInfo referInfo = columnInfo.getReferInfo();
            if (referInfo != null) {
                ++i;
                String referName = referInfo.getTableName();
                String srcColumnName = columnInfo.getColumnName();
                String srcColumnMei = srcColumnName;
                String referIdSuffix = null;
                for (String suffix : referIdSuffixs) {
                    if (srcColumnMei.matches("(?i).+" + suffix + "$")) {
                        referIdSuffix = suffix;
                        srcColumnMei = srcColumnMei.replaceAll("(?i)" + suffix + "$", referMeiSuffix);
                    }
                }
                srcColumnMei = StringUtil.toUpperCase(srcColumnMei);
                if (!tableInfo.getColumnInfos().containsKey(srcColumnMei)) {
                    String destColumnName = referInfo.getPrimaryKeys().get(0);
                    String destColumnMei = destColumnName.replaceAll("(?i)" + referIdSuffix + "$", referMeiSuffix);
                    destColumnMei = StringUtil.toUpperCase(destColumnMei);
                    s.add("    , (SELECT r" + i + "." + destColumnMei + " FROM " + referName + " r" + i + " WHERE r" + i
                            + "." + destColumnName + " = a." + srcColumnName + ") AS " + srcColumnMei);
                }
            }
        }
        s.add("FROM");
        s.add("    " + tableName + " a ");
        s.add("WHERE");
        s.add("    1 = 1 ");
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            String snake = StringUtil.toSnakeCase(columnName);
            boolean isInputLike = StringUtil.endsWith(inputLikeSuffixs, snake);
            boolean isInputFlag = StringUtil.endsWith(inputFlagSuffixs, snake);
            boolean isOption = StringUtil.endsWith(optionsSuffixs, snake);
            if (isInputLike) {
                s.add("    AND a." + snake + " LIKE CONCAT ('%', :" + snake + ", '%') ");
            } else if (isInputFlag) {
                s.add("    AND CASE WHEN a." + snake + " IS NULL THEN '0' ELSE a." + snake + " END IN (:" + snake
                        + ") ");
            } else if (isOption) {
                s.add("    AND a." + snake + " IN (:" + snake + ") ");
            } else {
                s.add("    AND a." + snake + " = :" + snake + " ");
            }
            boolean isInputRange = StringUtil.endsWith(inputRangeSuffixs, snake);
            if (isInputRange) {
                s.add("    AND a." + snake + " >= :" + snake + "_1 ");
                s.add("    AND a." + snake + " <= :" + snake + "_2 ");
            }
        }
        s.add("ORDER BY");
        s.add("    a." + StringUtil.join(", a.", tableInfo.getPrimaryKeys()));
        FileUtil.writeFile(sqlDir + File.separator + entityName + "Search.sql", s);
    }

}
