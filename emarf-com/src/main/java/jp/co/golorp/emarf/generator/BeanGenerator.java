package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.sql.DataSources;
import jp.co.golorp.emarf.sql.DataSourcesAssist;
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
    /** ファイルサフィックス */
    private static String[] inputFileSuffixs;

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

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
     * @param s
     * @param isManual
     */
    public static void generate(final String s, final boolean isManual) {

        projectDir = s;

        /* 設定ファイル読み込み */
        bundle = ResourceBundles.getBundle(BeanGenerator.class);

        String isGenerate = bundle.getString("BeanGenerator.autogenerate");
        if (!isManual && !isGenerate.toLowerCase().equals("true")) {
            return;
        }

        LOG.info("start.");

        insertDt = bundle.getString("BeanGenerator.insert_dt");
        insertBy = bundle.getString("BeanGenerator.insert_by");
        updateDt = bundle.getString("BeanGenerator.update_dt");
        updateBy = bundle.getString("BeanGenerator.update_by");

        optionsSuffixs = bundle.getString("BeanGenerator.options.suffixs").split(",");

        inputRangeSuffixs = bundle.getString("BeanGenerator.input.range.suffixs").split(",");
        inputLikeSuffixs = bundle.getString("BeanGenerator.input.like.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("BeanGenerator.input.file.suffixs").split(",");

        String[] pairs = bundle.getString("BeanGenerator.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }

        javaPath = bundle.getString("BeanGenerator.javaPath");
        entityPackage = bundle.getString("BeanGenerator.package.entity");
        actionPackage = bundle.getString("BeanGenerator.package.action");
        formPackage = bundle.getString("BeanGenerator.package.form");

        // テーブル情報を取得
        List<TableInfo> tableInfos = DataSources.getTableInfos();

        //        int maxDependLevel = 0;
        //        for (TableInfo tableInfo : rawTableInfos) {
        //            if (tableInfo.getBrosInfos().size() > 0 || tableInfo.getHistoryInfo() != null
        //                    || tableInfo.getChildInfos().size() > 0) {
        //
        //                int dependLevel = 0;
        //
        //                for (TableInfo nestInfo : tableInfo.getBrosInfos()) {
        //                    dependLevel = Math.max(tableInfo.getDependLevel(), nestInfo.getDependLevel()) + 1;
        //                    maxDependLevel = Math.max(maxDependLevel, dependLevel);
        //                    nestInfo.setDependLevel(dependLevel);
        //                }
        //
        //                if (tableInfo.getHistoryInfo() != null) {
        //                    TableInfo nestInfo = tableInfo.getHistoryInfo();
        //                    dependLevel = Math.max(tableInfo.getDependLevel(), nestInfo.getDependLevel()) + 1;
        //                    maxDependLevel = Math.max(maxDependLevel, dependLevel);
        //                    nestInfo.setDependLevel(dependLevel);
        //                }
        //
        //                for (TableInfo nestInfo : tableInfo.getChildInfos()) {
        //                    dependLevel = Math.max(tableInfo.getDependLevel(), nestInfo.getDependLevel()) + 1;
        //                    maxDependLevel = Math.max(maxDependLevel, dependLevel);
        //                    nestInfo.setDependLevel(dependLevel);
        //                }
        //            }
        //        }
        //
        //        List<TableInfo> tableInfos = new ArrayList<TableInfo>();
        //        for (int i = maxDependLevel; i >= 0; i--) {
        //            for (TableInfo tableInfo : rawTableInfos) {
        //                if (tableInfo.getDependLevel() == i) {
        //                    tableInfos.add(tableInfo);
        //                }
        //            }
        //        }

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
        BeanGenerator.javaEntity(tableInfos);
        BeanGenerator.javaActionDetailGet(tableInfos);
        BeanGenerator.javaActionDetailDelete(tableInfos);
        BeanGenerator.javaActionDetailRegist(tableInfos);
        BeanGenerator.javaActionIndexRegist(tableInfos);
        BeanGenerator.javaActionIndexDelete(tableInfos);
        BeanGenerator.javaFormDetailRegist(tableInfos);
        BeanGenerator.javaFormIndexRegist(tableInfos);

        HtmlGenerator.generate(projectDir, tableInfos);

        String sqlDir = projectDir + File.separator + bundle.getString("BeanGenerator.sqlPath");
        FileUtil.reMkDir(sqlDir);

        for (TableInfo tableInfo : tableInfos) {

            // 検索SQLを出力
            sqlSearch(sqlDir, tableInfo);
        }

        LOG.info("success.");
    }

    /**
     * エンティティ出力
     * @param tableInfos
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
            s.add(" *");
            s.add(" * @author emarfkrow");
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
                s.add("    /** " + mei + " */");
                if (dataType.equals("java.time.LocalDateTime")) {
                    s.add("    @com.fasterxml.jackson.annotation.JsonFormat(pattern = \"yyyy-MM-dd'T'HH:mm:ss.SSS\")");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)");
                    s.add("    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)");
                }
                s.add("    private " + dataType + " " + camel + ";");
                s.add("");
                s.add("    /**");
                s.add("     * @return " + mei);
                s.add("     */");
                s.add("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + columnName + "\")");
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

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
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
        String remarks = tableInfo.getRemarks();

        String entityName = StringUtil.toPascalCase(tableName);
        String camelName = StringUtil.toCamelCase(tableName);

        s.add("");
        s.add("    /**");
        s.add("     * " + remarks + "照会");
        s.add("     *");
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
        s.add("");
        s.add("        List<String> whereList = new ArrayList<String>();");

        // 主キー条件
        for (String primaryKey : tableInfo.getPrimaryKeys()) {
            if (primaryKey.length() > 0) {
                String snake = StringUtil.toSnakeCase(primaryKey);
                ColumnInfo primaryKeyInfo = tableInfo.getColumnInfos().get(primaryKey);
                if (primaryKeyInfo.getTypeName().equals("CHAR")) {
                    s.add("        whereList.add(\"TRIM (\\\"" + primaryKey + "\\\") = TRIM (:" + snake + ")\");");
                } else {
                    s.add("        whereList.add(\"\\\"" + primaryKey + "\\\" = :" + snake + "\");");
                }
            }
        }

        s.add("");
        s.add("        String sql = \"SELECT * FROM " + tableName + " WHERE \" + String.join(\" AND \", whereList);");
        s.add("");
        s.add("        Map<String, Object> params = new HashMap<String, Object>();");

        i = 0;
        for (String primaryKey : tableInfo.getPrimaryKeys()) {
            if (primaryKey.length() > 0) {
                String snake = StringUtil.toSnakeCase(primaryKey);
                s.add("        params.put(\"" + snake + "\", param" + ++i + ");");
            }
        }

        s.add("");
        s.add("        return Queries.get(sql, params, " + entityName + ".class);");
        s.add("    }");

        javaEntityCRUDInsert(tableInfo, s);

        javaEntityCRUDUpdate(tableInfo, s);

        s.add("");
        s.add("    /**");
        s.add("     * " + remarks + "削除");
        s.add("     *");
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
                s.add("        " + entityName + " " + camelName
                        + " = " + entityName + ".get(" + params + ");");
                s.add("        try {");
                s.add("            java.nio.file.Files.delete(java.nio.file.Paths.get(" + camelName + "."
                        + StringUtil.toCamelCase(columnName)
                        + "));");
                s.add("        } catch (Exception e) {");
                s.add("            throw new jp.co.golorp.emarf.exception.SysError(e);");
                s.add("        }");
            }
        }
        s.add("");
        s.add("        // " + remarks + "の削除");
        s.add("        String sql = \"DELETE FROM " + tableName + " WHERE \" + getWhere();");
        s.add("");
        s.add("        Map<String, Object> params = toMap(null, null);");
        s.add("");
        s.add("        return Queries.regist(sql, params);");
        s.add("    }");
    }

    private static void javaEntityCRUDInsert(final TableInfo tableInfo, final List<String> s) {

        String tableName = tableInfo.getTableName();
        String remarks = tableInfo.getRemarks();

        s.add("");
        s.add("    /**");
        s.add("     * " + remarks + "追加");
        s.add("     *");
        s.add("     * @param now システム日時");
        s.add("     * @param id 登録者");
        s.add("     * @return 追加件数");
        s.add("     */");
        s.add("    public int insert(final LocalDateTime now, final String id) {");

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
            s.add("                " + camel + ".insert(now, id);");
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
            s.add("            this." + camel + ".insert(now, id);");
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
            s.add("        " + camel + ".insert(now, id);");
        }

        DataSourcesAssist assist = DataSources.getAssist();

        s.add("");
        s.add("        // " + tableInfo.getRemarks() + "の登録");
        s.add("        List<String> nameList = new ArrayList<String>();");
        for (String columnName : tableInfo.getColumnInfos().keySet()) {
            String snake = StringUtil.toSnakeCase(columnName);
            s.add("        nameList.add(\"" + assist.quoteEscaped(columnName) + " -- :" + snake + "\");");
        }
        s.add("        String name = String.join(\"\\r\\n    , \", nameList);");
        s.add("");
        s.add("        String sql = \"INSERT INTO " + tableName
                + "(\\r\\n      \" + name + \"\\r\\n) VALUES (\\r\\n      \" + getValues() + \"\\r\\n)\";");
        s.add("");
        s.add("        Map<String, Object> params = toMap(now, id);");
        s.add("");
        s.add("        return Queries.regist(sql, params);");
        s.add("    }");
        s.add("");
        s.add("    private String getValues() {");
        s.add("        List<String> valueList = new ArrayList<String>();");
        for (Entry<String, ColumnInfo> e : tableInfo.getColumnInfos().entrySet()) {
            String columnName = e.getKey();
            String snake = StringUtil.toSnakeCase(columnName);
            String rightHand = ":" + snake;
            if (e.getValue().getDataType().equals("java.time.LocalDateTime")) {
                rightHand = assist.toTimestamp(rightHand);
            }
            s.add("        valueList.add(\"" + rightHand + "\");");
        }
        s.add("        return String.join(\"\\r\\n    , \", valueList);");
        s.add("    }");

        if (lastKeyInfo != null && lastKeyInfo.isNumbering()) {
            javaEntityCRUDInsertNumbering(tableInfo, s, lastKeyInfo);
        }
    }

    private static void javaEntityCRUDInsertNumbering(final TableInfo tableInfo, final List<String> s,
            final ColumnInfo lastKeyInfo) {

        String tableName = tableInfo.getTableName();

        String keyName = lastKeyInfo.getColumnName();

        String camel = StringUtil.toCamelCase(keyName);

        DataSourcesAssist assist = DataSources.getAssist();
        String quoted = assist.quoteEscaped(keyName);

        s.add("");
        s.add("    /** " + lastKeyInfo.getRemarks() + "の採番処理 */");
        s.add("    private void numbering() {");
        s.add("");
        s.add("        if (this." + camel + " != null) {");
        s.add("            return;");
        s.add("        }");
        s.add("");

        String numbering = "CASE WHEN MAX(e." + quoted + ") IS NULL THEN 0 ELSE MAX(e." + quoted + ") * 1 END + 1";
        String w = "";
        if (lastKeyInfo.getTypeName().equals("CHAR")) {
            int columnSize = lastKeyInfo.getColumnSize();
            numbering = "LPAD (" + numbering + ", " + columnSize + ", '0')";
            w = " WHERE e." + quoted + " < '" + new String(new char[columnSize]).replace("\0", "9") + "'";
        }
        s.add("        String sql = \"SELECT " + numbering + " AS " + quoted + " FROM " + tableName + " e" + w + "\";");
        s.add("");
        s.add("        Map<String, Object> params = new HashMap<String, Object>();");

        if (tableInfo.getPrimaryKeys().size() > 1) {

            s.add("");
            s.add("        List<String> whereList = new ArrayList<String>();");

            // 一つ前までループ
            for (int j = 0; j < tableInfo.getPrimaryKeys().size() - 1; j++) {
                String primaryKey = tableInfo.getPrimaryKeys().get(j);
                String quotedKey = assist.quoteEscaped(primaryKey);
                String snakeKey = StringUtil.toSnakeCase(primaryKey);
                s.add("        whereList.add(\"e." + quotedKey + " = :" + snakeKey + "\");");
            }

            s.add("        sql += \" WHERE \" + String.join(\" AND \", whereList);");
            s.add("");

            // 一つ前までループ
            for (int j = 0; j < tableInfo.getPrimaryKeys().size() - 1; j++) {
                String primaryKey = tableInfo.getPrimaryKeys().get(j);
                String snakeKey = StringUtil.toSnakeCase(primaryKey);
                String camelKey = StringUtil.toCamelCase(primaryKey);
                s.add("        params.put(\"" + snakeKey + "\", this." + camelKey + ");");
            }
        }
        s.add("");
        s.add("        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);");
        s.add("        Object o = mapList.get(0).get(\"" + keyName + "\");");
        s.add("");
        s.add("        this.set" + StringUtil.toPascalCase(keyName) + "(o);");
        s.add("    }");
    }

    private static void javaEntityCRUDUpdate(final TableInfo tableInfo, final List<String> s) {

        DataSourcesAssist assist = DataSources.getAssist();

        String tableName = tableInfo.getTableName();
        String remarks = tableInfo.getRemarks();

        s.add("");
        s.add("    /**");
        s.add("     * " + remarks + "更新");
        s.add("     *");
        s.add("     * @param now システム日時");
        s.add("     * @param id 更新者");
        s.add("     * @return 更新件数");
        s.add("     */");
        s.add("    public int update(final LocalDateTime now, final String id) {");

        // 子モデル
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String camel = StringUtil.toCamelCase(childName);
            String pascal = StringUtil.toPascalCase(childName);
            s.add("");
            s.add("        // " + childInfo.getRemarks() + "の登録");
            s.add("        if (this." + camel + "s != null) {");

            if (!childInfo.getColumnInfos().containsKey(updateDt)) {
                List<String> childWhere = new ArrayList<String>();
                for (String primaryKey : childInfo.getPrimaryKeys()) {
                    String quoted = assist.quoteEscaped(primaryKey);
                    String snake = StringUtil.toSnakeCase(primaryKey);
                    childWhere.add(quoted + " = :" + snake);
                }
                String where = String.join(" AND ", childWhere);
                s.add("            Queries.regist(\"DELETE FROM " + childName + " WHERE " + where
                        + "\", toMap(now, id));");
            }

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
            if (childInfo.getColumnInfos().containsKey(updateDt)) {
                s.add("            this." + camel + "s = null;");
                s.add("            this.refer" + pascal + "s();");
                s.add("            if (this." + camel + "s != null) {");
                s.add("                for (" + pascal + " " + camel + " : this." + camel + "s) {");
                s.add("                    if (!" + camel + ".get" + StringUtil.toPascalCase(updateDt)
                        + "().equals(now)) {");
                s.add("                        " + camel + ".delete();");
                s.add("                    }");
                s.add("                }");
                s.add("            }");
            }
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
            s.add("        // " + historyInfo.getRemarks() + "の登録");
            s.add("        " + pascal + " " + camel + " = new " + pascal + "();");
            for (String columnName : tableInfo.getColumnInfos().keySet()) {
                String camelColumn = StringUtil.toCamelCase(columnName);
                String pascalColumn = StringUtil.toPascalCase(columnName);
                s.add("        " + camel + ".set" + pascalColumn + "(this." + camelColumn + ");");
            }
            s.add("        " + camel + ".insert(now, id);");
        }
        s.add("");
        s.add("        // " + tableInfo.getRemarks() + "の登録");
        s.add("        String sql = \"UPDATE " + tableName
                + "\\r\\nSET\\r\\n      \" + getSet() + \"\\r\\nWHERE\\r\\n    \" + getWhere();");
        s.add("        Map<String, Object> params = toMap(now, id);");
        s.add("        return Queries.regist(sql, params);");
        s.add("    }");
        s.add("");
        s.add("    private String getSet() {");
        s.add("        List<String> setList = new ArrayList<String>();");

        for (Entry<String, ColumnInfo> e : tableInfo.getColumnInfos().entrySet()) {
            String columnName = e.getKey();
            ColumnInfo columnInfo = e.getValue();

            // 追加時のメタ情報でない場合
            boolean isInsertDt = columnName.matches("(?i)^" + insertDt + "$");
            boolean isInsertBy = columnName.matches("(?i)^" + insertBy + "$");
            if (!isInsertDt && !isInsertBy) {

                String snake = StringUtil.toSnakeCase(columnName);
                String rightHand = ":" + snake;
                if (columnInfo.getDataType().equals("java.time.LocalDateTime")) {
                    rightHand = assist.toTimestamp(rightHand);
                }

                s.add("        setList.add(\"" + assist.quoteEscaped(columnName) + " = " + rightHand + "\");");
            }
        }
        s.add("        String set = String.join(\"\\r\\n    , \", setList);");
        s.add("        return set;");
        s.add("    }");
    }

    /**
     * エンティティにCRUD用ユーティリティ追加
     * @param tableInfo
     * @param s
     */
    private static void javaEntityUtil(final TableInfo tableInfo, final List<String> s) {

        DataSourcesAssist assist = DataSources.getAssist();

        s.add("");
        s.add("    private String getWhere() {");
        s.add("        List<String> whereList = new ArrayList<String>();");

        // 主キー条件
        for (String primaryKey : tableInfo.getPrimaryKeys()) {
            if (primaryKey.length() == 0) {
                continue;
            }
            String quoted = assist.quoteEscaped(primaryKey);
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
                rightHand = assist.toTimestamp(rightHand);
            }

            s.add("        whereList.add(\"" + assist.quoteEscaped(updateDt) + " = " + rightHand + "\");");
        }

        s.add("        return String.join(\" AND \", whereList);");
        s.add("    }");

        // toMap
        s.add("");
        s.add("    private Map<String, Object> toMap(final LocalDateTime now, final String id) {");
        s.add("        Map<String, Object> params = new HashMap<String, Object>();");
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
            s.add("        params.put(\"" + snake + "\", this." + camel + ");");
        }
        s.add("        params.put(\"" + StringUtil.toSnakeCase(insertDt) + "\", now);");
        s.add("        params.put(\"" + StringUtil.toSnakeCase(insertBy) + "\", id);");
        s.add("        params.put(\"" + StringUtil.toSnakeCase(updateDt) + "\", now);");
        s.add("        params.put(\"" + StringUtil.toSnakeCase(updateBy) + "\", id);");
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
            s.add("     * @param " + camel);
            s.add("     */");
            s.add("    public void add" + pascal + "s(final " + pascal + " " + camel + ") {");
            s.add("        if (this." + camel + "s == null) {");
            s.add("            this." + camel + "s = new ArrayList<" + pascal + ">();");
            s.add("        }");
            s.add("        this." + camel + "s.add(" + camel + ");");
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
     * 詳細画面 登録処理出力
     * @param tableInfos
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
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
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

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos
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
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
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

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tableInfos
     */
    private static void javaActionDetailRegist(final List<TableInfo> tableInfos) {

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
            s.add(" * " + remarks + "登録");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entityName + "RegistAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "登録処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        " + entityName + " e = FormValidator.toBean(" + entityName + ".class.getName(), postJson);");
            s.add("");
            s.add("        // 主キーが不足していたらINSERT");
            s.add("        boolean isNew = false;");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascal = StringUtil.toPascalCase(primaryKey);
                s.add("        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("            isNew = true;");
                s.add("        }");
            }
            s.add("");
            s.add("        if (isNew) {");
            s.add("");
            s.add("            if (e.insert(now, id) != 1) {");
            s.add("                throw new OptLockError(\"error.cant.insert\");");
            s.add("            }");
            s.add("");
            s.add("            map.put(\"INFO\", Messages.get(\"info.insert\"));");
            s.add("");
            s.add("        } else {");
            s.add("");
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
            javaFilePaths.put(javaFilePath, actionPackage + "." + entityName + "RegistAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tableInfos
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
            s.add("            // 主キーが不足していたらエラー");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get(\"" + primaryKey
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

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tableInfos
     */
    private static void javaActionIndexRegist(final List<TableInfo> tableInfos) {

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
            s.add("import java.util.List;");
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
            s.add(" * " + remarks + "一覧登録");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entityName + "SRegistAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧登録処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get(\""
                    + entityName
                    + "Grid\");");
            s.add("");
            s.add("        if (gridData.size() == 0) {");
            s.add("            map.put(\"ERROR\", Messages.get(\"error.nopost\"));");
            s.add("            return map;");
            s.add("        }");
            s.add("");
            s.add("        for (Map<String, Object> gridRow : gridData) {");
            s.add("");
            s.add("            " + entityName + " e = FormValidator.toBean(" + entityName
                    + ".class.getName(), gridRow);");
            s.add("");
            s.add("            // 主キーが不足していたらINSERT");
            s.add("            boolean isNew = false;");
            for (String primaryKey : tableInfo.getPrimaryKeys()) {
                String pascal = StringUtil.toPascalCase(primaryKey);
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("                isNew = true;");
                s.add("            }");
            }
            s.add("");
            s.add("            if (isNew) {");
            s.add("");
            s.add("                if (e.insert(now, id) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.insert\");");
            s.add("                }");
            s.add("");
            s.add("            } else {");
            s.add("");
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

            String javaFilePath = packageDir + File.separator + entityName + "SRegistAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entityName + "SRegistAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 フォーム出力
     * @param tableInfos
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
            s.add("        LOG.trace(\"not overridden in subclasses.\");");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entityName + "RegistForm.java";
            javaFilePaths.put(javaFilePath, formPackage + "." + entityName + "RegistForm");

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
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

        // NotBlank（主キーは親モデルから植え付けるか採番するので除外。フラグも除外）
        if (columnInfo.getNullable() == 0) {
            if (!columnInfo.isNumbering() && !StringUtil.endsWith(inputFlagSuffixs, columnInfo.getColumnName())) {
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
                s.add("    @jakarta.validation.constraints.Size(max = " + columnSize + ")");
            }
        }
    }

    /**
     * 検索画面 フォーム出力
     * @param tableInfos
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
            s.add("        LOG.debug(\"not overridden in subclasses.\");");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + pascal + "SRegistForm.java";
            javaFilePaths.put(javaFilePath, formPackage + "." + pascal + "SRegistForm");

            FileUtil.writeFile(javaFilePath, s);
        }

        String isCompile = bundle.getString("BeanGenerator.compile");
        if (isCompile.toLowerCase().equals("true")) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * javaファイルをコンパイル
     * @param javaFilePath
     * @param className
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

        // 参照モデルの名称解決
        int i = 0;
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {

            // 参照元カラム名
            String srcColumnName = columnInfo.getColumnName();

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

                        String srcIdQuoted = DataSources.getAssist().quoted(srcIdColumn);
                        String srcMeiQuoted = DataSources.getAssist().quoted(srcMeiColumn);
                        String destIdQuoted = DataSources.getAssist().quoted(destColumnName);
                        String destMeiQuoted = DataSources.getAssist().quoted(destColumnMei);

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
            boolean isInputLike = StringUtil.endsWith(inputLikeSuffixs, snake);
            boolean isInputFlag = StringUtil.endsWith(inputFlagSuffixs, snake);
            boolean isOption = StringUtil.endsWith(optionsSuffixs, snake);

            String quoted = DataSources.getAssist().quoted(columnName);

            if (isInputLike) {

                String[] array = new String[] { "'%'", ":" + snake, "'%'" };
                String joined = DataSources.getAssist().join(array);
                s.add("    AND a." + quoted + " LIKE " + joined + " ");

            } else if (isInputFlag) {

                s.add("    AND CASE WHEN a." + quoted + " IS NULL THEN '0' ELSE TO_CHAR (a." + quoted + ") END IN (:"
                        + snake + ") ");

            } else if (isOption) {

                if (columnInfo.getTypeName().equals("CHAR")) {
                    s.add("    AND TRIM (a." + quoted + ") IN (:" + snake + ") ");
                } else {
                    s.add("    AND a." + quoted + " IN (:" + snake + ") ");
                }

            } else if (columnInfo.getTypeName().equals("CHAR")) {

                s.add("    AND TRIM (a." + quoted + ") = TRIM (:" + snake + ") ");

            } else {

                s.add("    AND a." + quoted + " = :" + snake + " ");
            }

            boolean isInputRange = StringUtil.endsWith(inputRangeSuffixs, snake);

            if (isInputRange) {
                s.add("    AND a." + quoted + " >= :" + snake + "_1 ");
                s.add("    AND a." + quoted + " <= :" + snake + "_2 ");
            }
        }

        s.add("ORDER BY");
        if (tableInfo.getPrimaryKeys().size() > 0) {
            s.add("    a.\"" + StringUtil.join("\", a.\"", tableInfo.getPrimaryKeys()) + "\"");
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
