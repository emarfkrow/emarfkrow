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
    /** 削除フラグ */
    private static String deleteF;
    /** ステータス区分 */
    private static String status;

    /** javaファイル出力ルートパス */
    private static String javaDir;

    /** actionパッケージ */
    private static String pkgAction;
    /** entityパッケージ */
    private static String pkE;

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

        tekiyoBi = bundle.getString("column.start");
        insertDt = bundle.getString("column.insert.timestamp");
        insertBy = bundle.getString("column.insert.id");
        updateDt = bundle.getString("column.update.timestamp");
        updateBy = bundle.getString("column.update.id");
        deleteF = bundle.getString("column.delete");
        status = bundle.getString("column.status");

        javaDir = bundle.getString("dir.java");

        pkgAction = bundle.getString("java.package.action") + ".model.base";
        pkE = bundle.getString("java.package.entity");

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
            s.add("import " + pkE + "." + entity + ";");
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
                TableInfo summaryOf = table.getSummaryOf();
                if (summaryOf.getPrimaryKeys().size() == 1) {
                    String e = StringUtil.toPascalCase(summaryOf.getName());
                    String i = StringUtil.toCamelCase(summaryOf.getName());
                    String pk = summaryOf.getPrimaryKeys().get(0);
                    String prop = StringUtil.toCamelCase(pk);
                    s.add("");
                    s.add("            //集約先に該当する場合は、集約元に主キーを反映");
                    s.add("            String summaryKey = postJson.get(\"" + e + "." + prop + "\").toString();");
                    s.add("            if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(summaryKey)) {");
                    s.add("                String[] summaryKeys = summaryKey.trim().split(\",\");");
                    s.add("                for (String pk : summaryKeys) {");
                    s.add("                    " + pkE + "." + e + " " + i + " = " + pkE + "." + e + ".get(pk);");
                    if (!StringUtil.isNullOrBlank(status) && (summaryOf.getColumns().containsKey(status.toLowerCase())
                            || summaryOf.getColumns().containsKey(status.toUpperCase()))) {
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

            if (table.isView()) {
                continue;
            }

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
            s.add("import " + pkE + "." + e + ";");
            s.add("");
            s.add("import jp.co.golorp.emarf.action.BaseAction;");
            s.add("import jp.co.golorp.emarf.exception.NoDataError;");
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
            String pks = "";
            if (table.getPrimaryKeys().size() > 0) {
                s.add("");
                s.add("        // 主キーのチェック");
                s.add("        boolean isAllKey = true;");
                for (int i = 0; i < table.getPrimaryKeys().size(); i++) {
                    String pk = table.getPrimaryKeys().get(i);
                    String property = StringUtil.toCamelCase(pk);
                    s.add("");
                    s.add("        Object " + property + " = postJson.get(\"" + property + "\");");
                    s.add("        if (" + property + " == null) {");
                    s.add("            " + property + " = postJson.get(\"" + e + "." + property + "\");");
                    s.add("        }");
                    s.add("        if (" + property + " == null) {");
                    if (i == 0) {
                        // 転生元から情報をコピー
                        copyFromRebornee(s, table, tables);
                    }
                    s.add("            isAllKey = false;");
                    s.add("        }");
                }
                if (table.getParents().size() > 0) {
                    s.add("");
                    s.add("        // 親モデルの取得");
                }
                for (int i = 0; i < table.getPrimaryKeys().size(); i++) {
                    String pk = table.getPrimaryKeys().get(i);
                    if (pks.length() > 0) {
                        pks += ", ";
                    }
                    pks += pk;
                    for (TableInfo parent : table.getParents()) {
                        List<String> oyaKeys = new ArrayList<String>(parent.getPrimaryKeys());
                        String oyaPKs = oyaKeys.toString().replaceAll("[\\[\\]]", "");
                        oyaKeys.remove(tekiyoBi);
                        String oyaKeyCsv = oyaKeys.toString().replaceAll("[\\[\\]]", "");
                        if (!pks.equals(oyaKeyCsv)) {
                            continue;
                        }
                        String pE = StringUtil.toPascalCase(parent.getName());
                        String pI = StringUtil.toCamelCase(parent.getName());
                        String oyaKey = StringUtil.toCamelCase(oyaPKs);
                        s.add("        " + pkE + "." + pE + " " + pI + " = " + pkE + "." + pE + ".get(" + oyaKey
                                + ");");
                        s.add("        map.put(\"" + pE + "\", " + pI + ");");
                    }
                }
                s.add("");
                s.add("        // 主キーが不足していたら終了");
                s.add("        if (!isAllKey) {");
                s.add("            return map;");
                s.add("        }");
            }
            s.add("");
            s.add("        try {");
            s.add("            " + e + " " + in + " = " + e + ".get(" + StringUtil.toCamelCase(pks) + ");");
            for (TableInfo bros : table.getYoungers()) {
                String brosEntity = StringUtil.toPascalCase(bros.getName());
                s.add("            " + in + ".refer" + brosEntity + "();");
            }
            for (TableInfo child : table.getChilds()) {
                String pascal = StringUtil.toPascalCase(child.getName());
                s.add("            " + in + ".refer" + pascal + "s();");
            }
            s.add("            map.put(\"" + e + "\", " + in + ");");
            s.add("        } catch (NoDataError e) {");
            s.add("            if (!postJson.get(\"IsSilent\").equals(\"true\")) {");
            s.add("                throw e;");
            s.add("            }");
            s.add("        }");
            s.add("");
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
            s.add("import " + pkE + "." + e + ";");
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

            BeanGenerator.getDeleteChilds(s, "e", table.getChilds(), 0);

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
            s.add("import " + pkE + "." + entity + ";");
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
            List<TableInfo> childInfos = table.getChilds();
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
            s.add("import " + pkE + "." + entity + ";");
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
            List<TableInfo> childInfos = table.getChilds();
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
    private static void copyFromRebornee(final List<String> s, final TableInfo table, final List<TableInfo> tables) {

        // 自テーブルが転生先か調査する
        String toTbl = table.getName();
        String toE = StringUtil.toPascalCase(toTbl);
        String toI = StringUtil.toCamelCase(toTbl);

        // 自テーブルを転生先とするテーブルがあるかループ
        for (TableInfo frTbl : tables) {

            TableInfo rebornTo = frTbl.getRebornTo();

            // テーブルに転生先がなければスキップ
            if (rebornTo == null && frTbl.getDeriveTos() == null) {
                continue;
            }

            // 転生先があっても自テーブルに一致しなければスキップ
            boolean isTo = false;
            String kind = "転生";
            if (rebornTo != null && rebornTo.getName().equals(toTbl)) {
                isTo = true;
            }
            for (TableInfo deriveTo : frTbl.getDeriveTos()) {
                if (deriveTo.getName().equals(toTbl)) {
                    isTo = true;
                    kind = "派生";
                    break;
                }
            }
            if (!isTo) {
                continue;
            }

            // 自テーブルが転生先であった

            s.add("");
            s.add("            // " + kind + "先になる場合は" + kind + "元から情報をコピー");
            String frK = "";
            for (String fromKey : frTbl.getPrimaryKeys()) {
                String k = StringUtil.toCamelCase(fromKey);
                s.add("            Object " + k + " = postJson.get(\"" + k + "\");");
                s.add("            if (" + k + " == null) {");
                s.add("                " + k + " = postJson.get(\"" + toE + "." + k + "\");");
                s.add("            }");
                s.add("            if (" + k + " == null) {");
                s.add("                return map;");
                s.add("            }");
                if (!frK.equals("")) {
                    frK += ", ";
                }
                frK += k;
            }

            s.add("");
            String frName = frTbl.getName();
            String frE = StringUtil.toPascalCase(frName);
            String frI = StringUtil.toCamelCase(frName);
            s.add("            " + pkE + "." + frE + " " + frI + " = " + pkE + "." + frE + ".get(" + frK + ");");
            s.add("            " + toE + " " + toI + " = new " + toE + "();");

            for (String frColNm : frTbl.getColumns().keySet()) {
                // メタ情報ならスキップ
                boolean isIDt = frColNm.matches("(?i)^" + insertDt + "$");
                boolean isIBy = frColNm.matches("(?i)^" + insertBy + "$");
                boolean isUDt = frColNm.matches("(?i)^" + updateDt + "$");
                boolean isUBy = frColNm.matches("(?i)^" + updateBy + "$");
                boolean isDel = frColNm.matches("(?i)^" + deleteF + "$");
                boolean isSKb = frColNm.matches("(?i)^" + status + "$");
                if (isIDt || isIBy || isUDt || isUBy || isDel || isSKb) {
                    continue;
                }
                // 自テーブルに転生元と同じカラムがあればコピー
                if (table.getColumns().containsKey(frColNm)) {
                    String a = StringUtil.toPascalCase(frColNm);
                    s.add("            " + toI + ".set" + a + "(" + frI + ".get" + a + "());");
                }
            }

            s.add("");
            for (TableInfo frChild : frTbl.getChilds()) {

                // 転生元の子モデル名が転生元に前方一致しなければスキップ
                String frCNm = frChild.getName();
                if (!frCNm.startsWith(frName)) {
                    continue;
                }

                for (TableInfo child : table.getChilds()) {

                    // 自テーブルの子モデル名が自テーブルに前方一致しなければスキップ
                    String childName = child.getName();
                    if (!childName.startsWith(toTbl)) {
                        continue;
                    }

                    String fCE = StringUtil.toPascalCase(frCNm);
                    String fCI = StringUtil.toCamelCase(frCNm);
                    String cE = StringUtil.toPascalCase(childName);
                    String cI = StringUtil.toCamelCase(childName);
                    s.add("            " + frI + ".refer" + StringUtil.toPascalCase(frCNm) + "s();");
                    s.add("            " + toI + ".set" + cE + "s(new java.util.ArrayList<" + pkE + "." + cE + ">());");
                    s.add("            for (" + pkE + "." + fCE + " " + fCI + " : " + frI + ".refer" + fCE + "s()) {");
                    s.add("                " + pkE + "." + cE + " " + cI + " = new " + pkE + "." + cE + "();");
                    s.add("                " + cI + ".setId(" + fCI + ".getId());");
                    for (String frCColNm : frChild.getColumns().keySet()) {
                        // メタ情報ならスキップ
                        boolean isIDt = frCColNm.matches("(?i)^" + insertDt + "$");
                        boolean isIBy = frCColNm.matches("(?i)^" + insertBy + "$");
                        boolean isUDt = frCColNm.matches("(?i)^" + updateDt + "$");
                        boolean isUBy = frCColNm.matches("(?i)^" + updateBy + "$");
                        boolean isDel = frCColNm.matches("(?i)^" + deleteF + "$");
                        boolean isSKb = frCColNm.matches("(?i)^" + status + "$");
                        if (isIDt || isIBy || isUDt || isUBy || isDel || isSKb) {
                            continue;
                        }
                        // 子テーブルに転生元の子モデルと同じカラムがあればコピー
                        if (child.getColumns().containsKey(frCColNm)) {
                            String a = StringUtil.toPascalCase(frCColNm);
                            s.add("                " + cI + ".set" + a + "(" + fCI + ".get" + a + "());");
                        }
                    }
                    s.add("                " + toI + ".get" + cE + "s().add(" + cI + ");");
                    s.add("            }");
                    s.add("");
                }
            }
            s.add("            map.put(\"" + toE + "\", " + toI + ");");

            //            // 転生元は一つしかないはずなので不要かも
            //            break;
        }
    }

}
