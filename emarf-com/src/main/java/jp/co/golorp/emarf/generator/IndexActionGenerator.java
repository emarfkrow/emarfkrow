package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * 検索画面アクション出力
 */
public final class IndexActionGenerator {

    /** プロジェクトディレクトリ */
    private static String projectDir;

    /** BeanGenerator.properties */
    private static ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);

    /** actionパッケージ */
    private static String actionPackage;

    /** entityパッケージ */
    private static String entityPackage;

    /** javaファイル出力ルートパス */
    private static String javaPath;

    /** 起動時の自動生成か */
    private static boolean isGenerateAtStartup;

    /** 更新日時カラム名 */
    private static String updateDt;

    /** ステータス区分 */
    private static String statusKb;

    /**
     * プライベートコンストラクタ
     */
    private IndexActionGenerator() {
    }

    /**
     * 各ファイル出力 主処理
     * @param dir プロジェクトのディレクトリ
     * @param tableInfos
     */
    public static void generate(final String dir, final List<TableInfo> tableInfos) {

        //プロジェクトディレクトリを退避
        projectDir = dir;

        actionPackage = bundle.getString("java.package.action") + ".model.base";

        entityPackage = bundle.getString("java.package.entity");

        javaPath = bundle.getString("dir.java");

        //webからの自動生成ならコンパイルまで行う
        if (App.get("generateAtStartup") != null) {
            isGenerateAtStartup = App.get("generateAtStartup").toLowerCase().equals("true");
        }

        updateDt = bundle.getString("column.update.timestamp");

        statusKb = bundle.getString("column.status");

        IndexActionGenerator.deleteAction(tableInfos);
        IndexActionGenerator.registAction(tableInfos);
        if (!StringUtil.isNullOrBlank(statusKb)) {
            IndexActionGenerator.permitAction(tableInfos);
            IndexActionGenerator.forbidAction(tableInfos);
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void deleteAction(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tableInfos) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            String tableName = table.getName();
            String remarks = table.getRemarks();
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
            s.add(" * " + remarks + "一覧削除");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "SDeleteAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧削除処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get(\"" + entity
                    + "Grid\");");
            s.add("        for (Map<String, Object> gridRow : gridData) {");
            s.add("");
            s.add("            if (gridRow.isEmpty()) {");
            s.add("                continue;");
            s.add("            }");
            s.add("");
            s.add("            // 主キーが不足していたらエラー");
            for (String pk : table.getPrimaryKeys()) {
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get(\"" + pk
                        + "\"))) {");
                s.add("                throw new OptLockError(\"error.cant.delete\");");
                s.add("            }");
            }
            s.add("");
            s.add("            " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), gridRow);");
            List<TableInfo> childInfos = table.getChildInfos();
            BeanGenerator.getDeleteChilds(s, "e", childInfos, 1);
            s.add("            if (e.delete() != 1) {");
            s.add("                throw new OptLockError(\"error.cant.delete\");");
            s.add("            }");
            s.add("            ++count;");
            s.add("        }");
            s.add("");
            s.add("        if (count == 0) {");
            s.add("            map.put(\"ERROR\", Messages.get(\"error.nopost\"));");
            s.add("            return map;");
            s.add("        }");
            s.add("");
            s.add("        map.put(\"INFO\", Messages.get(\"info.delete\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "SDeleteAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entity + "SDeleteAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void registAction(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tableInfos) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            String entity = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

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
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get(\"" + entity
                    + "Grid\");");
            s.add("        for (Map<String, Object> gridRow : gridData) {");
            s.add("");
            s.add("            if (gridRow.isEmpty()) {");
            s.add("                continue;");
            s.add("            }");
            s.add("");
            //            s.add("            String className = " + entity + ".class.getName();");
            //            if (table.isConvView()) {
            //                s.add("            // 変換ビューの場合");
            //                s.add("            className = \"" + entityPackage + ".\" + gridRow.get(\"TABLE_NAME\").toString();");
            //                s.add("            jp.co.golorp.emarf.entity.IEntity e = FormValidator.toBean(className, gridRow);");
            //            } else {
            //            s.add("            " + entity + " e = FormValidator.toBean(className, gridRow);");
            s.add("            " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), gridRow);");
            //            }
            s.add("");
            s.add("            // 主キーが不足していたらINSERT");
            s.add("            boolean isNew = false;");
            for (String primaryKey : table.getPrimaryKeys()) {
                String accessor = StringUtil.toPascalCase(primaryKey);
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + accessor + "())) {");
                s.add("                isNew = true;");
                s.add("            }");
            }
            if (table.getColumnInfos().containsKey(updateDt)
                    || table.getColumnInfos().containsKey(updateDt.toUpperCase())) {
                String accessor = StringUtil.toPascalCase(updateDt);
                s.add("            // 楽観ロック値がなくてもINSERT");
                s.add("            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + accessor + "())) {");
                s.add("                isNew = true;");
                s.add("            }");
            }
            if (!table.isView() && !StringUtil.isNullOrBlank(statusKb)) {
                s.add("");
                s.add("            e.set" + StringUtil.toPascalCase(statusKb) + "(0);");
            }
            s.add("");
            s.add("            if (isNew) {");
            s.add("");
            s.add("                if (e.insert(now, execId) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.insert\");");
            s.add("                }");
            s.add("                ++count;");
            s.add("");
            s.add("            } else {");
            s.add("");
            s.add("                if (e.update(now, execId) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.update\");");
            s.add("                }");
            s.add("                ++count;");
            s.add("            }");
            s.add("        }");
            s.add("");
            s.add("        if (count == 0) {");
            s.add("            map.put(\"ERROR\", Messages.get(\"error.nopost\"));");
            s.add("            return map;");
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

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 検索画面 承認処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void permitAction(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tableInfos) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            String entity = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

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
            s.add(" * " + remarks + "一覧承認");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "SPermitAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧承認処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get(\"" + entity
                    + "Grid\");");
            s.add("        for (Map<String, Object> gridRow : gridData) {");
            s.add("");
            s.add("            if (gridRow.isEmpty()) {");
            s.add("                continue;");
            s.add("            }");
            s.add("");
            s.add("            " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), gridRow);");
            s.add("");
            s.add("            // 主キーが不足していたらエラー");
            String params = "";
            for (String primaryKey : table.getPrimaryKeys()) {
                String property = StringUtil.toCamelCase(primaryKey);
                String accessor = StringUtil.toPascalCase(primaryKey);
                s.add("            Object " + property + " = e.get" + accessor + "();");
                s.add("            if (" + property + " == null) {");
                s.add("                throw new OptLockError(\"error.cant.permit\");");
                s.add("            }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += property;
            }
            List<TableInfo> childInfos = table.getChildInfos();
            BeanGenerator.getPermitChilds(s, "e", childInfos, 1);
            s.add("");
            s.add("            " + entity + " f = " + entity + ".get(" + params + ");");
            s.add("            f.set" + StringUtil.toPascalCase(statusKb) + "(1);");
            s.add("            if (f.update(now, execId) != 1) {");
            s.add("                throw new OptLockError(\"error.cant.permit\");");
            s.add("            }");
            s.add("            ++count;");
            s.add("        }");
            s.add("");
            s.add("        if (count == 0) {");
            s.add("            map.put(\"ERROR\", Messages.get(\"error.nopost\"));");
            s.add("            return map;");
            s.add("        }");
            s.add("");
            s.add("        map.put(\"INFO\", Messages.get(\"info.permit\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "SPermitAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entity + "SPermitAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 検索画面 否認処理出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void forbidAction(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = actionPackage.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tableInfos) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            String entity = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

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
            s.add(" * " + remarks + "一覧承認");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "SForbidAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧承認処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get(\"" + entity
                    + "Grid\");");
            s.add("        for (Map<String, Object> gridRow : gridData) {");
            s.add("");
            s.add("            if (gridRow.isEmpty()) {");
            s.add("                continue;");
            s.add("            }");
            s.add("");
            s.add("            " + entity + " e = FormValidator.toBean(" + entity + ".class.getName(), gridRow);");
            s.add("");
            s.add("            // 主キーが不足していたらエラー");
            String params = "";
            for (String primaryKey : table.getPrimaryKeys()) {
                String property = StringUtil.toCamelCase(primaryKey);
                String accessor = StringUtil.toPascalCase(primaryKey);
                s.add("            Object " + property + " = e.get" + accessor + "();");
                s.add("            if (" + property + " == null) {");
                s.add("                throw new OptLockError(\"error.cant.forbid\");");
                s.add("            }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += property;
            }
            List<TableInfo> childInfos = table.getChildInfos();
            BeanGenerator.getForbidChilds(s, "e", childInfos, 1);
            s.add("");
            s.add("            " + entity + " f = " + entity + ".get(" + params + ");");
            s.add("            f.set" + StringUtil.toPascalCase(statusKb) + "(-1);");
            s.add("            if (f.update(now, execId) != 1) {");
            s.add("                throw new OptLockError(\"error.cant.forbid\");");
            s.add("            }");
            s.add("            ++count;");
            s.add("        }");
            s.add("");
            s.add("        if (count == 0) {");
            s.add("            map.put(\"ERROR\", Messages.get(\"error.nopost\"));");
            s.add("            return map;");
            s.add("        }");
            s.add("");
            s.add("        map.put(\"INFO\", Messages.get(\"info.forbid\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "SForbidAction.java";
            javaFilePaths.put(javaFilePath, actionPackage + "." + entity + "SForbidAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }
}
