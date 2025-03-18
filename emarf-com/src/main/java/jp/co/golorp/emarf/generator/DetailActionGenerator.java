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
 * 詳細画面アクション出力
 */
public final class DetailActionGenerator {

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
    /** 削除フラグ */
    private static String deleteF;
    /** ステータス区分 */
    private static String status;

    /** javaファイル出力ルートパス */
    private static String javaDir;

    /** actionパッケージ */
    private static String pkgAction;
    /** entityパッケージ */
    private static String pkgE;

    /** プライベートコンストラクタ */
    private DetailActionGenerator() {
    }

    /**
     * 各ファイル出力 主処理
     * @param dir プロジェクトのディレクトリ
     * @param tables
     */
    public static void generate(final String dir, final List<TableInfo> tables) {

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
        deleteF = bundle.getString("column.delete");
        status = bundle.getString("column.status");

        javaDir = bundle.getString("dir.java");

        pkgAction = bundle.getString("java.package.action") + ".model.base";
        pkgE = bundle.getString("java.package.entity");

        javaActionDetailRegist(tables);
        javaActionDetailGet(tables);
        javaActionDetailDelete(tables);
        if (!StringUtil.isNullOrBlank(status)) {
            javaActionDetailPermit(tables);
            javaActionDetailForbid(tables);
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tables テーブル情報のリスト
     */
    private static void javaActionDetailRegist(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String packagePath = pkgAction.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaDir + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            String tableName = table.getName();
            String entity = StringUtil.toPascalCase(tableName);
            String remarks = table.getRemarks();
            List<String> s = new ArrayList<String>();
            s.add("package " + pkgAction + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + pkgE + "." + entity + ";");
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
            for (String primaryKey : table.getPrimaryKeys()) {
                String pascal = StringUtil.toPascalCase(primaryKey);
                s.add("        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("            isNew = true;");
                s.add("        }");
            }
            if (table.getColumns().containsKey(updateDt)
                    || table.getColumns().containsKey(updateDt.toUpperCase())) {
                String pascal = StringUtil.toPascalCase(updateDt);
                s.add("        // 楽観ロック値がなくてもINSERT");
                s.add("        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.get" + pascal + "())) {");
                s.add("            isNew = true;");
                s.add("        }");
            }
            if (!table.isView() && !StringUtil.isNullOrBlank(status)
                    && (table.getColumns().containsKey(status.toLowerCase())
                            || table.getColumns().containsKey(status.toUpperCase()))) {
                s.add("");
                s.add("        e.set" + StringUtil.toPascalCase(status) + "(0);");
            }
            s.add("");
            s.add("        if (isNew) {");
            s.add("");
            s.add("            if (e.insert(now, execId) != 1) {");
            s.add("                throw new OptLockError(\"error.cant.insert\");");
            s.add("            }");
            if (table.getSummaryOf() != null) {
                TableInfo summary = table.getSummaryOf();
                if (summary.getPrimaryKeys().size() == 1) {
                    String e = StringUtil.toPascalCase(summary.getName());
                    String i = StringUtil.toCamelCase(summary.getName());
                    String pk = summary.getPrimaryKeys().get(0);
                    String prop = StringUtil.toCamelCase(pk);
                    s.add("");
                    s.add("            //集約の場合は、集約元に主キーを反映");
                    s.add("            String summaryKey = postJson.get(\"" + e + "." + prop + "\").toString();");
                    s.add("            if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(summaryKey)) {");
                    s.add("                String[] summaryKeys = summaryKey.trim().split(\",\");");
                    s.add("                for (String pk : summaryKeys) {");
                    s.add("                    " + pkgE + "." + e + " " + i + " = " + pkgE + "." + e + ".get(pk);");
                    if (!StringUtil.isNullOrBlank(status) && (summary.getColumns().containsKey(status.toLowerCase())
                            || summary.getColumns().containsKey(status.toUpperCase()))) {
                        String acc = StringUtil.toPascalCase(status);
                        s.add("                    //承認済みでなければエラー");
                        s.add("                    if (!" + i + ".get" + acc + "().equals(\"1\")) {");
                        s.add("                        throw new OptLockError(\"error.nopermit.summary\");");
                        s.add("                    }");
                    }
                    for (String fk : table.getPrimaryKeys()) {
                        String acc = StringUtil.toPascalCase(fk);
                        s.add("                    //集約済みならエラー");
                        s.add("                    if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(" + i + ".get"
                                + acc + "())) {");
                        s.add("                        throw new OptLockError(\"error.already.summary\");");
                        s.add("                    }");
                        s.add("                    " + i + ".set" + acc + "(e.get" + acc + "());");
                    }
                    s.add("                    if (" + i + ".update(now, execId) != 1) {");
                    s.add("                        throw new OptLockError(\"error.cant.insert\");");
                    s.add("                    }");
                    s.add("                }");
                    s.add("            }");
                }
            }
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
            javaFilePaths.put(javaFilePath, pkgAction + "." + entity + "RegistAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tables テーブル情報のリスト
     */
    private static void javaActionDetailGet(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String packagePath = pkgAction.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaDir + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            //entity
            String e = StringUtil.toPascalCase(table.getName());
            //instance
            String in = StringUtil.toCamelCase(table.getName());

            List<String> s = new ArrayList<String>();
            s.add("package " + pkgAction + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + pkgE + "." + e + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("");
            s.add("/**");
            s.add(" * " + table.getRemarks() + "照会");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + e + "GetAction extends BaseAction {");
            s.add("");
            s.add("    /** " + table.getRemarks() + "照会処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        Map<String, Object> map = new HashMap<String, Object>();");
            s.add("");
            s.add("        // 主キーが不足していたら終了");
            String pks = "";
            for (int i = 0; i < table.getPrimaryKeys().size(); i++) {
                String pk = table.getPrimaryKeys().get(i);
                String property = StringUtil.toCamelCase(pk);
                s.add("        Object " + property + " = postJson.get(\"" + property + "\");");
                s.add("        if (" + property + " == null) {");
                s.add("            " + property + " = postJson.get(\"" + e + "." + property + "\");");
                s.add("        }");
                s.add("        if (" + property + " == null) {");
                if (i == 0) {
                    addRebornee(s, table, tables);
                }
                s.add("            return map;");
                s.add("        }");
                if (pks.length() > 0) {
                    pks += ", ";
                }
                pks += property;
                if (i == table.getPrimaryKeys().size() - 2) {
                    if (table.getParentInfos().size() > 0) {
                        s.add("        // 親モデルの取得");
                        for (TableInfo parent : table.getParentInfos()) {
                            String pE = StringUtil.toPascalCase(parent.getName());
                            String pI = StringUtil.toCamelCase(parent.getName());
                            s.add("        " + pkgE + "." + pE + " " + pI + " = " + pkgE + "." + pE + ".get(" + pks
                                    + ");");
                            s.add("        map.put(\"" + pE + "\", " + pI + ");");
                        }
                    }
                }
            }
            s.add("");
            s.add("        " + e + " " + in + " = " + e + ".get(" + pks + ");");
            for (TableInfo bros : table.getYoungers()) {
                String brosEntity = StringUtil.toPascalCase(bros.getName());
                s.add("        " + in + ".refer" + brosEntity + "();");
            }
            for (TableInfo child : table.getChildInfos()) {
                String pascal = StringUtil.toPascalCase(child.getName());
                s.add("        " + in + ".refer" + pascal + "s();");
            }
            s.add("        map.put(\"" + e + "\", " + in + ");");
            s.add("        return map;");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + e + "GetAction.java";
            javaFilePaths.put(javaFilePath, pkgAction + "." + e + "GetAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 登録処理出力
     * @param tables テーブル情報のリスト
     */
    private static void javaActionDetailDelete(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String packagePath = pkgAction.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaDir + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            // 論理削除テーブルならスキップ（削除フラグ指定があり、テーブルに削除フラグがある場合）
            if (!StringUtil.isNullOrBlank(deleteF) && (table.getColumns().containsKey(deleteF.toLowerCase())
                    || table.getColumns().containsKey(deleteF.toUpperCase()))) {
                continue;
            }

            String e = StringUtil.toPascalCase(table.getName());

            List<String> s = new ArrayList<String>();
            s.add("package " + pkgAction + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + pkgE + "." + e + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("import jp.co.golorp.emarf.exception.OptLockError;");
            s.add("import jp.co.golorp.emarf.util.Messages;");
            s.add("import jp.co.golorp.emarf.validation.FormValidator;");
            s.add("");
            s.add("/**");
            s.add(" * " + table.getRemarks() + "削除");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + e + "DeleteAction extends BaseAction {");
            s.add("");
            s.add("    /** " + table.getRemarks() + "削除処理 */");
            s.add("    @Override");
            s.add("    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {");
            s.add("");
            s.add("        // 主キーが不足していたらエラー");

            String params = "";
            for (String primaryKey : table.getPrimaryKeys()) {
                String camel = StringUtil.toCamelCase(primaryKey);
                s.add("        Object " + camel + " = postJson.get(\"" + camel + "\");");
                s.add("        if (" + camel + " == null) {");
                s.add("            " + camel + " = postJson.get(\"" + e + "." + camel + "\");");
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
            s.add("        " + e + " e = FormValidator.toBean(" + e + ".class.getName(), postJson);");

            BeanGenerator.getDeleteChilds(s, "e", table.getChildInfos(), 0);

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

            String javaFilePath = packageDir + File.separator + e + "DeleteAction.java";
            javaFilePaths.put(javaFilePath, pkgAction + "." + e + "DeleteAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 承認処理出力
     * @param tables テーブル情報のリスト
     */
    private static void javaActionDetailPermit(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String packagePath = pkgAction.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaDir + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            if (table.isHistory() || table.isView() || (!table.getColumns().containsKey(status.toLowerCase())
                    && !table.getColumns().containsKey(status.toUpperCase()))) {
                continue;
            }

            String entity = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + pkgAction + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + pkgE + "." + entity + ";");
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
            for (String primaryKey : table.getPrimaryKeys()) {
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
            List<TableInfo> childInfos = table.getChildInfos();
            BeanGenerator.getPermitChilds(s, "e", childInfos, 0);
            s.add("");
            s.add("        " + entity + " f = " + entity + ".get(" + params + ");");
            if (table.getColumns().containsKey(status.toLowerCase())
                    || table.getColumns().containsKey(status.toUpperCase())) {
                s.add("        f.set" + StringUtil.toPascalCase(status) + "(1);");
            }
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
            javaFilePaths.put(javaFilePath, pkgAction + "." + entity + "PermitAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 詳細画面 否認処理出力
     * @param tables テーブル情報のリスト
     */
    private static void javaActionDetailForbid(final List<TableInfo> tables) {

        // 出力フォルダを再作成
        String packagePath = pkgAction.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaDir + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tables) {

            if (table.isHistory() || table.isView() || (!table.getColumns().containsKey(status.toLowerCase())
                    && !table.getColumns().containsKey(status.toUpperCase()))) {
                continue;
            }

            String entity = StringUtil.toPascalCase(table.getName());
            String remarks = table.getRemarks();

            List<String> s = new ArrayList<String>();
            s.add("package " + pkgAction + ";");
            s.add("");
            s.add("import java.time.LocalDateTime;");
            s.add("import java.util.HashMap;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("import " + pkgE + "." + entity + ";");
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
            for (String primaryKey : table.getPrimaryKeys()) {
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
            List<TableInfo> childInfos = table.getChildInfos();
            BeanGenerator.getForbidChilds(s, "e", childInfos, 0);
            s.add("");
            s.add("        " + entity + " f = " + entity + ".get(" + params + ");");
            if (table.getColumns().containsKey(status.toLowerCase())
                    || table.getColumns().containsKey(status.toUpperCase())) {
                s.add("        f.set" + StringUtil.toPascalCase(status) + "(-1);");
            }
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
            javaFilePaths.put(javaFilePath, pkgAction + "." + entity + "ForbidAction");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * @param s
     * @param table
     * @param tables
     */
    private static void addRebornee(final List<String> s, final TableInfo table, final List<TableInfo> tables) {

        String tableName = table.getName();
        String entity = StringUtil.toPascalCase(tableName);
        String instance = StringUtil.toCamelCase(tableName);

        for (TableInfo fromTable : tables) {
            //転生元も集約先もなければスキップ
            TableInfo reborn = fromTable.getRebornTo();
            TableInfo summary = fromTable.getSummaryOf();
            if (reborn == null && summary == null) {
                continue;
            }
            //転生先で集約元でもなければスキップ
            String toTableName = null;
            String toTableKind = null;
            if (reborn != null) {
                toTableName = reborn.getName();
                toTableKind = "転生";
            } else if (summary != null) {
                toTableName = summary.getName();
                toTableKind = "集約";
            }
            if (!toTableName.equals(tableName)) {
                continue;
            }
            s.add("");
            s.add("            //" + toTableKind + "先になる場合は" + toTableKind + "元から情報をコピー");
            String fromKeys = "";
            for (String pk : fromTable.getPrimaryKeys()) {
                String key = StringUtil.toCamelCase(pk);
                s.add("            Object " + key + " = postJson.get(\"" + key + "\");");
                s.add("            if (" + key + " == null) {");
                s.add("                " + key + " = postJson.get(\"" + entity + "." + key + "\");");
                s.add("            }");
                s.add("            if (" + key + " == null) {");
                s.add("                return map;");
                s.add("            }");
                if (!fromKeys.equals("")) {
                    fromKeys += ", ";
                }
                fromKeys += key;
            }
            s.add("");
            String fromName = fromTable.getName();
            String fromEntity = StringUtil.toPascalCase(fromName);
            String fromInstance = StringUtil.toCamelCase(fromName);
            s.add("            " + pkgE + "." + fromEntity + " " + fromInstance + " = " + pkgE + "."
                    + fromEntity + ".get(" + fromKeys + ");");
            s.add("            " + entity + " " + instance + " = new " + entity + "();");
            for (String fromColumnName : fromTable.getColumns().keySet()) {
                boolean isInsertDt = fromColumnName.matches("(?i)^" + insertDt + "$");
                boolean isInsertBy = fromColumnName.matches("(?i)^" + insertBy + "$");
                boolean isUpdateDt = fromColumnName.matches("(?i)^" + updateDt + "$");
                boolean isUpdateBy = fromColumnName.matches("(?i)^" + updateBy + "$");
                boolean isDeleteF = fromColumnName.matches("(?i)^" + deleteF + "$");
                boolean isStatusKb = fromColumnName.matches("(?i)^" + status + "$");
                if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy || isDeleteF || isStatusKb) {
                    continue;
                }
                if (table.getColumns().containsKey(fromColumnName)) {
                    String a = StringUtil.toPascalCase(fromColumnName);
                    s.add("            " + instance + ".set" + a + "(" + fromInstance + ".get" + a + "());");
                }
            }
            s.add("");

            for (TableInfo fromChild : fromTable.getChildInfos()) {
                String fromChildName = fromChild.getName();
                if (!fromChildName.startsWith(fromName)) {
                    continue;
                }
                for (TableInfo child : table.getChildInfos()) {
                    String childName = child.getName();
                    if (!childName.startsWith(tableName)) {
                        continue;
                    }
                    String fromChildEntity = StringUtil.toPascalCase(fromChildName);
                    String fromChildInstance = StringUtil.toCamelCase(fromChildName);
                    String childEntity = StringUtil.toPascalCase(childName);
                    String childInstance = StringUtil.toCamelCase(childName);
                    s.add("            " + fromInstance + ".refer" + StringUtil.toPascalCase(fromChildName) + "s();");
                    s.add("            " + instance + ".set" + childEntity + "s(new java.util.ArrayList<" + pkgE
                            + "." + childEntity + ">());");
                    s.add("            for (" + pkgE + "." + fromChildEntity + " " + fromChildInstance + " : "
                            + fromInstance + ".refer" + fromChildEntity + "s()) {");
                    s.add("                " + pkgE + "." + childEntity + " " + childInstance + " = new "
                            + pkgE + "." + childEntity + "();");
                    s.add("                " + childInstance + ".setId(" + fromChildInstance + ".getId());");
                    for (String fromChildColumnName : fromChild.getColumns().keySet()) {
                        boolean isInsertDt = fromChildColumnName.matches("(?i)^" + insertDt + "$");
                        boolean isInsertBy = fromChildColumnName.matches("(?i)^" + insertBy + "$");
                        boolean isUpdateDt = fromChildColumnName.matches("(?i)^" + updateDt + "$");
                        boolean isUpdateBy = fromChildColumnName.matches("(?i)^" + updateBy + "$");
                        boolean isDeleteF = fromChildColumnName.matches("(?i)^" + deleteF + "$");
                        boolean isStatusKb = fromChildColumnName.matches("(?i)^" + status + "$");
                        if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy || isDeleteF || isStatusKb) {
                            continue;
                        }
                        if (child.getColumns().containsKey(fromChildColumnName)) {
                            String a = StringUtil.toPascalCase(fromChildColumnName);
                            s.add("                " + childInstance + ".set" + a + "(" + fromChildInstance + ".get" + a
                                    + "());");
                        }
                    }
                    s.add("                " + instance + ".get" + childEntity + "s().add(" + childInstance + ");");
                    s.add("            }");
                    s.add("");
                }
            }
            s.add("            map.put(\"" + entity + "\", " + instance + ");");

            break;
        }
    }

}
