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
    private static String prjDir;

    /** BeanGenerator.properties */
    private static ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);

    /** actionパッケージ */
    private static String actionPkg;

    /** entityパッケージ */
    private static String entityPackage;

    /** javaファイル出力ルートパス */
    private static String javaPath;

    /** 起動時の自動生成か */
    private static boolean isGenerateAtStartup;

    /** 更新日時カラム名 */
    private static String updateTs;

    /** ステータス区分 */
    private static String status;

    /** 削除フラグ */
    private static String deleteF;

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
        prjDir = dir;

        actionPkg = bundle.getString("java.package.action") + ".model.base";

        entityPackage = bundle.getString("java.package.entity");

        javaPath = bundle.getString("dir.java");

        //webからの自動生成ならコンパイルまで行う
        if (App.get("generateAtStartup") != null) {
            isGenerateAtStartup = App.get("generateAtStartup").toLowerCase().equals("true");
        }

        updateTs = bundle.getString("column.update.timestamp");

        status = bundle.getString("column.status");

        deleteF = bundle.getString("column.delete");

        IndexActionGenerator.deleteAction(tableInfos);
        IndexActionGenerator.registAction(tableInfos);
        if (!StringUtil.isNullOrWhiteSpace(status)) {
            IndexActionGenerator.permitAction(tableInfos);
            IndexActionGenerator.forbidAction(tableInfos);
        }
    }

    /**
     * 検索画面 登録処理出力
     * @param tables テーブル情報のリスト
     */
    private static void deleteAction(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String pkgPath = actionPkg.replace(".", File.separator);
        String pkgDir = prjDir + File.separator + javaPath + File.separator + pkgPath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            //削除フラグがあればスキップ
            if (!StringUtil.isNullOrWhiteSpace(deleteF) && (table.getColumns().containsKey(deleteF.toLowerCase())
                    || table.getColumns().containsKey(deleteF.toUpperCase()))) {
                continue;
            }

            String e = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPkg + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + e + ";");
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
            s.add("public class " + e + "SDeleteAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧削除処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> form) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> data = (List<Map<String, Object>>) form.get(\"" + e + "Grid\");");
            s.add("        if (data != null) {");
            s.add("            for (Map<String, Object> row : data) {");
            s.add("");
            s.add("                if (row.isEmpty()) {");
            s.add("                    continue;");
            s.add("                }");
            s.add("");
            s.add("                // 主キーが不足していたらエラー");
            for (String k : table.getPrimaryKeys()) {
                s.add("                if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(row.get(\"" + k
                        + "\"))) {");
                s.add("                    throw new OptLockError(\"error.cant.delete\", \"" + remarks + "\");");
                s.add("                }");
            }
            s.add("");
            s.add("                " + e + " e = FormValidator.toBean(" + e + ".class.getName(), row);");
            List<TableInfo> childInfos = table.getChildren();
            BeanGenerator.getDeleteChilds(s, "e", childInfos, 2);
            s.add("                if (e.delete() != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.delete\", \"" + remarks + "\");");
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
            s.add("        map.put(\"INFO\", Messages.get(\"info.delete\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = pkgDir + File.separator + e + "SDeleteAction.java";
            javaFilePaths.put(javaFilePath, actionPkg + "." + e + "SDeleteAction");

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
        String packagePath = actionPkg.replace(".", File.separator);
        String packageDir = prjDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tableInfos) {

            if (table.isHistory()/* || table.isView() ClassNotFoundよけ*/) {
                continue;
            }

            String e = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPkg + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + e + ";");
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
            s.add("public class " + e + "SRegistAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧登録処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> form) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> data = (List<Map<String, Object>>) form.get(\"" + e + "Grid\");");
            s.add("        if (data != null) {");
            s.add("            for (Map<String, Object> row : data) {");
            s.add("");
            s.add("                if (row.isEmpty()) {");
            s.add("                    continue;");
            s.add("                }");
            s.add("");
            //            s.add("            String className = " + entity + ".class.getName();");
            //            if (table.isConvView()) {
            //                s.add("            // 変換ビューの場合");
            //                s.add("            className = \"" + entityPackage + ".\" + row.get(\"TABLE_NAME\").toString();");
            //                s.add("            jp.co.golorp.emarf.entity.IEntity e = FormValidator.toBean(className, row);");
            //            } else {
            //            s.add("            " + entity + " e = FormValidator.toBean(className, row);");
            s.add("                " + e + " e = FormValidator.toBean(" + e + ".class.getName(), row);");
            //            }
            s.add("");
            s.add("                // 主キーが不足していたらINSERT");
            s.add("                boolean isNew = false;");
            for (String primaryKey : table.getPrimaryKeys()) {
                String acc = StringUtil.toPascalCase(primaryKey);
                s.add("                if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.get" + acc
                        + "())) {");
                s.add("                    isNew = true;");
                s.add("                }");
            }
            if (StringUtil.hasKeyIgnoreCase(table.getColumns().keySet(), updateTs)) {
                String acc = StringUtil.toPascalCase(updateTs);
                s.add("                // 楽観ロック値がなくてもINSERT");
                s.add("                if (jp.co.golorp.emarf.lang.StringUtil.isNullOrWhiteSpace(e.get" + acc
                        + "())) {");
                s.add("                    isNew = true;");
                s.add("                }");
            }
            if (!table.isView() && !StringUtil.isNullOrWhiteSpace(status)
                    && (table.getColumns().containsKey(status.toLowerCase())
                            || table.getColumns().containsKey(status.toUpperCase()))) {
                s.add("");
                s.add("                e.set" + StringUtil.toPascalCase(status) + "(0);");
            }
            s.add("");
            s.add("                if (isNew) {");
            s.add("");
            s.add("                    if (e.insert(now, execId) != 1) {");
            s.add("                        throw new OptLockError(\"error.cant.insert\", \"" + remarks + "\");");
            s.add("                    }");
            s.add("                    ++count;");
            s.add("");
            s.add("                } else {");
            s.add("");
            s.add("                    if (e.update(now, execId) != 1) {");
            s.add("                        throw new OptLockError(\"error.cant.update\", \"" + remarks + "\");");
            s.add("                    }");
            s.add("                    ++count;");
            s.add("                }");
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

            String javaFilePath = packageDir + File.separator + e + "SRegistAction.java";
            javaFilePaths.put(javaFilePath, actionPkg + "." + e + "SRegistAction");

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
     * @param tables テーブル情報のリスト
     */
    private static void permitAction(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String packagePath = actionPkg.replace(".", File.separator);
        String packageDir = prjDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            if (table.isHistory() || table.isView() || (!table.getColumns().containsKey(status.toLowerCase())
                    && !table.getColumns().containsKey(status.toUpperCase()))) {
                continue;
            }

            String e = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPkg + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + e + ";");
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
            s.add("public class " + e + "SPermitAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧承認処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> form) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> data = (List<Map<String, Object>>) form.get(\"" + e + "Grid\");");
            s.add("        if (data != null) {");
            s.add("            for (Map<String, Object> row : data) {");
            s.add("");
            s.add("                if (row.isEmpty()) {");
            s.add("                    continue;");
            s.add("                }");
            s.add("");
            s.add("                " + e + " e = FormValidator.toBean(" + e + ".class.getName(), row);");
            s.add("");
            s.add("                // 主キーが不足していたらエラー");
            String params = "";
            for (String primaryKey : table.getPrimaryKeys()) {
                String property = StringUtil.toCamelCase(primaryKey);
                String accessor = StringUtil.toPascalCase(primaryKey);
                s.add("                Object " + property + " = e.get" + accessor + "();");
                s.add("                if (" + property + " == null) {");
                s.add("                    throw new OptLockError(\"error.cant.permit\", \"" + remarks + "\");");
                s.add("                }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += property;
            }
            List<TableInfo> childInfos = table.getChildren();
            BeanGenerator.getPermitChilds(s, "e", childInfos, 2);
            s.add("");
            s.add("                " + e + " f = " + e + ".get(" + params + ");");
            if (table.getColumns().containsKey(status.toLowerCase())
                    || table.getColumns().containsKey(status.toUpperCase())) {
                s.add("                f.set" + StringUtil.toPascalCase(status) + "(1);");
            }
            s.add("                if (f.update(now, execId) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.permit\", \"" + remarks + "\");");
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
            s.add("        map.put(\"INFO\", Messages.get(\"info.permit\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + e + "SPermitAction.java";
            javaFilePaths.put(javaFilePath, actionPkg + "." + e + "SPermitAction");

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
     * @param tables テーブル情報のリスト
     */
    private static void forbidAction(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String packagePath = actionPkg.replace(".", File.separator);
        String packageDir = prjDir + File.separator + javaPath + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            if (table.isHistory() || table.isView() || (!table.getColumns().containsKey(status.toLowerCase())
                    && !table.getColumns().containsKey(status.toUpperCase()))) {
                continue;
            }

            String e = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + actionPkg + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + entityPackage + "." + e + ";");
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
            s.add("public class " + e + "SForbidAction extends BaseAction {");
            s.add("");
            s.add("    /** " + remarks + "一覧承認処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> form) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        int count = 0;");
            s.add("");
            s.add("        @SuppressWarnings(\"unchecked\")");
            s.add("        List<Map<String, Object>> data = (List<Map<String, Object>>) form.get(\"" + e + "Grid\");");
            s.add("        if (data != null) {");
            s.add("            for (Map<String, Object> row : data) {");
            s.add("");
            s.add("                if (row.isEmpty()) {");
            s.add("                    continue;");
            s.add("                }");
            s.add("");
            s.add("                " + e + " e = FormValidator.toBean(" + e + ".class.getName(), row);");
            s.add("");
            s.add("                // 主キーが不足していたらエラー");
            String params = "";
            for (String primaryKey : table.getPrimaryKeys()) {
                String property = StringUtil.toCamelCase(primaryKey);
                String accessor = StringUtil.toPascalCase(primaryKey);
                s.add("                Object " + property + " = e.get" + accessor + "();");
                s.add("                if (" + property + " == null) {");
                s.add("                    throw new OptLockError(\"error.cant.forbid\", \"" + remarks + "\");");
                s.add("                }");
                if (params.length() > 0) {
                    params += ", ";
                }
                params += property;
            }
            List<TableInfo> childInfos = table.getChildren();
            BeanGenerator.getForbidChilds(s, "e", childInfos, 2);
            s.add("");
            s.add("                " + e + " f = " + e + ".get(" + params + ");");
            if (table.getColumns().containsKey(status.toLowerCase())
                    || table.getColumns().containsKey(status.toUpperCase())) {
                s.add("                f.set" + StringUtil.toPascalCase(status) + "(-1);");
            }
            s.add("                if (f.update(now, execId) != 1) {");
            s.add("                    throw new OptLockError(\"error.cant.forbid\", \"" + remarks + "\");");
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
            s.add("        map.put(\"INFO\", Messages.get(\"info.forbid\"));");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + e + "SForbidAction.java";
            javaFilePaths.put(javaFilePath, actionPkg + "." + e + "SForbidAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }
}
