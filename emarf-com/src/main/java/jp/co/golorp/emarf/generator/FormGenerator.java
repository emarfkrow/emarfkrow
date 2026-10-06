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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * フォーム出力
 */
public final class FormGenerator extends BeanGenerator {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FormGenerator.class);

    /** BeanGenerator.properties */
    private static ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);

    /**
     * プライベートコンストラクタ
     */
    private FormGenerator() {
    }

    /**
     * 各ファイル出力 主処理
     * @param tables
     */
    public static void generate(final List<TableInfo> tables) {

        //フォームフォルダ
        String pkgFormPath = (PKG_F + ".model.base").replace(".", File.separator);
        String pkgFormDir = getProjectDir() + File.separator + DIR_J + File.separator + pkgFormPath;
        FileUtil.reMkDir(pkgFormDir);

        FormGenerator.javaFormDetailRegist(tables);
        FormGenerator.javaFormIndexRegist(tables);
    }

    /**
     * 詳細画面 フォーム出力
     * @param ts テーブル情報のリスト
     */
    private static void javaFormDetailRegist(final List<TableInfo> ts) {
        String packagePath = (PKG_F + ".model.base").replace(".", File.separator);
        String packageDir = getProjectDir() + File.separator + DIR_J + File.separator + packagePath;
        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();
        for (TableInfo t : ts) {
            if (t.isHistory() || t.isView() || t.isStatusFlow()) {
                continue;
            }
            String ent = StringUtil.toPascalCase(t.getName());
            List<String> s = new ArrayList<String>();
            s.add("package " + PKG_F + ".model.base;");
            addImports(s);
            addAuthor(s, t.getRemarks() + "登録フォーム");
            s.add("public class " + ent + "RegistForm implements IForm {");
            //            s.add("");
            //            s.add("    /** logger */");
            //            s.add("    private static final Logger LOG = LoggerFactory.getLogger(" + entity + "RegistForm.class);");
            for (ColumnInfo c : t.getColumns().values()) {
                // レコードメタデータならスキップ。updateDtは楽観ロック用に必要
                boolean isUpdTs = c.getName().matches("(?i)^" + UPDATE_AT + "$");
                if (!isUpdTs && BeanGenerator.isMetaTsBy(c.getName())) {
                    continue;
                }
                if (!c.isMeta() && c.getRefer() != null && c.getRefer().getStintInfo() != null) {
                    for (String pk2 : c.getRefer().getStintInfo().getPrimaryKeys()) {
                        if (pk2.matches("(?i)^" + TEKIYO_BI + "$")) {
                            break;
                        }
                        boolean isContain = false;
                        for (String colName : t.getColumns().keySet()) {
                            if (StringUtil.endsWithIgnoreCase(pk2, colName)) {
                                isContain = true;
                                break;
                            }
                        }
                        if (isContain) {
                            break;
                        }
                        if (t.getStintKeys().contains(pk2)) {
                            continue;
                        }
                        t.getStintKeys().add(pk2);
                        ColumnInfo k = c.getRefer().getStintInfo().getColumns().get(pk2);
                        s.add("");
                        s.add("    /** 参照先制約：" + k.getRemarks() + " */");
                        s.add("    private String " + StringUtil.toCamelCase(pk2) + ";");
                        s.add("");
                        s.add("    /** @param p " + k.getRemarks() + " */");
                        s.add("    public void set" + StringUtil.toPascalCase(pk2) + "(final String p) {");
                        s.add("        this." + StringUtil.toCamelCase(pk2) + " = p;");
                        s.add("    }");
                    }
                }
                String p = StringUtil.toCamelCase(c.getName()); // property
                String a = StringUtil.toPascalCase(c.getName()); // accessor
                s.add("");
                s.add("    /** " + c.getRemarks() + " */");
                javaFormDetailRegistChecks(s, t, c);
                if (c.getNullable() == 1) {
                    if (StringUtil.endsWith(INPUT_F_SUFS, c.getName())) {
                        s.add("    private String " + p + " = \"0\";");
                    } else {
                        s.add("    private String " + p + ";");
                    }
                } else if (c.getDefaultValue() != null && c.getDataType().equals("String")) {
                    s.add("    private String " + p + " = \"" + c.getDefaultValue() + "\";");
                } else {
                    s.add("    private String " + p + ";");
                }
                s.add("");
                s.add("    /** @return " + c.getRemarks() + " */");
                if (c.isPk()) {
                    s.add("    @jp.co.golorp.emarf.validation.PrimaryKeys");
                } else if (c.getName().matches("(?i)^" + UPDATE_AT + "$")) {
                    s.add("    @jp.co.golorp.emarf.validation.OptLock");
                }
                s.add("    public String get" + a + "() {");
                s.add("        return " + p + ";");
                s.add("    }");
                s.add("");
                s.add("    /** @param p " + c.getRemarks() + " */");
                if (c.isPk()) {
                    s.add("    @jp.co.golorp.emarf.validation.PrimaryKeys");
                } else if (c.getName().matches("(?i)^" + UPDATE_AT + "$")) {
                    s.add("    @jp.co.golorp.emarf.validation.OptLock");
                }
                s.add("    public void set" + a + "(final String p) {");
                s.add("        this." + p + " = p;");
                s.add("    }");
            }
            for (TableInfo t2 : t.getBrothers()) { // 兄弟モデル
                String e2 = StringUtil.toPascalCase(t2.getName());
                String i2 = StringUtil.toCamelCase(t2.getName());
                s.add("");
                s.add("    /** " + t2.getRemarks() + " */");
                s.add("    @jakarta.validation.Valid");
                s.add("    private " + e2 + "RegistForm " + i2 + "RegistForm;");
                s.add("");
                s.add("    /** @return " + e2 + "RegistForm */");
                s.add("    public " + e2 + "RegistForm get" + e2 + "RegistForm() {");
                s.add("        return " + i2 + "RegistForm;");
                s.add("    }");
                s.add("");
                s.add("    /** @param p */");
                s.add("    public void set" + e2 + "RegistForm(final " + e2 + "RegistForm p) {");
                s.add("        this." + i2 + "RegistForm = p;");
                s.add("    }");
            }
            for (TableInfo t2 : t.getChildren()) { // 子モデル
                String e2 = StringUtil.toPascalCase(t2.getName());
                String i2 = StringUtil.toCamelCase(t2.getName());
                s.add("");
                s.add("    /** " + t2.getRemarks() + " */");
                s.add("    @jakarta.validation.Valid");
                s.add("    private java.util.List<" + e2 + "RegistForm> " + i2 + "Grid;");
                s.add("");
                s.add("    /**");
                s.add("     * @return " + t2.getRemarks());
                s.add("     */");
                s.add("    public java.util.List<" + e2 + "RegistForm> get" + e2 + "Grid() {");
                s.add("        return " + i2 + "Grid;");
                s.add("    }");
                s.add("");
                s.add("    /**");
                s.add("     * @param p");
                s.add("     */");
                s.add("    public void set" + e2 + "Grid(final java.util.List<" + e2 + "RegistForm> p) {");
                s.add("        this." + i2 + "Grid = p;");
                s.add("    }");
            }
            javaFormDetailRegistRelCheck(t, s);
            s.add("}");
            String javaFilePath = packageDir + File.separator + ent + "RegistForm.java";
            javaFilePaths.put(javaFilePath, PKG_F + ".model.base." + ent + "RegistForm");
            FileUtil.writeFile(javaFilePath, s);
        }
        if (IS_GENERATE_AT_STARTUP) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }

    /**
     * 関連チェック
     * @param t
     * @param s
     */
    private static void javaFormDetailRegistRelCheck(final TableInfo t, final List<String> s) {
        String e = StringUtil.toPascalCase(t.getName());
        s.add("");
        s.add("    /** 関連チェック */");
        s.add("    @Override");
        s.add("    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {");
        for (TableInfo child : t.getChildren()) { // 子の整合性チェック
            String e2 = StringUtil.toPascalCase(child.getName());
            String i2 = StringUtil.toCamelCase(child.getName());
            s.add("");
            s.add("        // " + child.getRemarks() + " の子モデル整合性チェック");
            s.add("        if (this." + i2 + "Grid != null) {");
            s.add("            for (int i = 0; i < this." + i2 + "Grid.size(); i++) {");
            s.add("                " + e2 + "RegistForm " + i2 + "Form = this." + i2 + "Grid.get(i);");
            s.add("                if (" + i2 + "Form == null) {");
            s.add("                    continue;");
            s.add("                }");
            for (ColumnInfo childCol : child.getColumns().values()) {
                if (childCol.isPk() || childCol.isMeta() || childCol.getRefer() == null) {
                    continue;
                }
                TableInfo childColRefer = childCol.getRefer();
                if (childColRefer.getStintInfo() == null) {
                    continue;
                }
                TableInfo childColReferStint = childColRefer.getStintInfo(); // 子モデル列の参照先の制約モデル
                for (String childColReferStintKey : childColReferStint.getPrimaryKeys()) {
                    if (childColReferStintKey.matches("(?i)^" + TEKIYO_BI + "$")) {
                        break; // 主キー内の適用日ならスキップ
                    }
                    boolean isChildContain = false;
                    for (String childColName : child.getColumns().keySet()) {
                        if (StringUtil.endsWithIgnoreCase(childColReferStintKey, childColName)) {
                            isChildContain = true;
                            break;
                        }
                    }
                    if (isChildContain) {
                        break; // 子モデルに含まれるなら親モデルからの補完はしない
                    }
                    boolean isParentContain = false;
                    for (String parentColName : t.getColumns().keySet()) {
                        if (StringUtil.endsWithIgnoreCase(childColReferStintKey, parentColName)) {
                            isParentContain = true;
                            break;
                        }
                    }
                    for (String parentColName : t.getStintKeys()) {
                        if (StringUtil.endsWithIgnoreCase(childColReferStintKey, parentColName)) {
                            isParentContain = true;
                            break;
                        }
                    }
                    if (!isParentContain) {
                        break; // 親モデルに含まれるなら補完する
                    }
                    String a3 = StringUtil.toPascalCase(childColReferStintKey);
                    String p3 = StringUtil.toCamelCase(childColReferStintKey);
                    s.add("                " + i2 + "Form.set" + a3 + "(this." + p3 + ");");
                }
            }
            s.add("                Map<String, String> gridErrors = new java.util.LinkedHashMap<String, String>();");
            s.add("                " + i2 + "Form.validate(gridErrors, baseProcess);");
            s.add("                BaseProcess.copyGridErrors(errors, \"" + e2 + "Grid\", i, gridErrors);");
            s.add("            }");
            s.add("        }");
        }
        for (TableInfo t2 : t.getDeriveFroms()) { // 派生元のマスタチェック
            addMasterCheck(s, e, t2, "派生元");
        }
        for (TableInfo t2 : t.getMergeFroms()) { // 共生元のマスタチェック
            addMasterCheck(s, e, t2, "共生元");
        }
        if (t.getRebornFrom() != null) { // 転生元のマスタチェック
            addMasterCheck(s, e, t.getRebornFrom(), "転生元");
        }
        if (t.getSummaryTo() != null) { // 集約先のマスタチェック
            addMasterCheck(s, e, t.getSummaryTo(), "集約先");
        }
        for (ColumnInfo c : t.getColumns().values()) { // 列ごとに評価
            if (BeanGenerator.isMetaBy(c.getName())) { // 登録者か更新者ならスキップ
                continue;
            }
            if (c.getRefer() == null || c.getRefer().isView()) { // 参照モデルがないか、参照モデルがビューならスキップ
                continue;
            }
            if (c.getRefer().isStatusFlow()) { // 参照モデルがワークフローならスキップ
                continue;
            }
            TableInfo t2 = c.getRefer();
            TableInfo st = t2.getStintInfo();
            boolean isStint = st != null && st != t;
            String e2 = StringUtil.toPascalCase(t2.getName());
            String i2 = StringUtil.toCamelCase(c.getName());
            s.add("");
            if (isStint) {
                s.add("        // " + c.getRemarks() + " の制約チェック");
            } else {
                s.add("        // " + c.getRemarks() + " のマスタチェック");
            }
            s.add("        Map<String, Object> " + i2 + "Params = new java.util.HashMap<String, Object>();");
            String keyPrefix = ""; // 該当する主キーと比べて、カラム名の接頭辞を判定する
            for (String pk : t2.getPrimaryKeys()) {
                if (c.getName().matches("(?i).+" + pk + "$")) {
                    keyPrefix = c.getName().replaceAll("(?i)" + pk + "$", "");
                    if (!keyPrefix.isEmpty()) {
                        keyPrefix += "_";
                    }
                    break;
                }
            }
            for (String k2 : t2.getPrimaryKeys()) {
                String keySuf = "";
                if (t2.getColumns().get(k2).getDataType().equals("String")) {
                    keySuf = "Full";
                }
                s.add("        " + i2 + "Params.put(\"" + StringUtil.toCamelCase(k2) + keySuf + "\", this."
                        + StringUtil.toCamelCase(keyPrefix + k2) + ");");
            }
            if (isStint) {
                s.add("        " + i2 + "Params.put(\"isStint\", \"1\");");
                List<String> stintKeys = new ArrayList<String>();
                for (String sk : st.getPrimaryKeys()) {
                    if (!sk.matches("(?i)^" + TEKIYO_BI + "$")) {
                        stintKeys.add(sk);
                    }
                }
                for (int i = 0; i < stintKeys.size() - 1; i++) {
                    String k3 = stintKeys.get(i);
                    String p3 = StringUtil.toCamelCase(k3);
                    String contain = p3;
                    for (String colName : t.getColumns().keySet()) {
                        if (StringUtil.endsWithIgnoreCase(k3, colName)) {
                            contain = StringUtil.toCamelCase(colName);
                            break;
                        }
                    }
                    s.add("        " + i2 + "Params.put(\"" + p3 + "\", this." + contain + ");");
                }
            }
            if (isStint) {
                s.add("        baseProcess.masterCheck(errors, \"" + e2 + "Correct\", \"" + i2 + "\", " + i2
                        + "Params, jp.co.golorp.emarf.util.Messages.get(\"" + e + "." + i2 + "\"));");
            } else {
                s.add("        baseProcess.masterCheck(errors, \"" + e2 + "Search\", \"" + i2 + "\", " + i2
                        + "Params, jp.co.golorp.emarf.util.Messages.get(\"" + e + "." + i2 + "\"));");
            }
        }
        s.add("    }");
    }

    /**
     * @param s
     * @param e
     * @param t2
     * @param label
     */
    public static void addMasterCheck(final List<String> s, final String e, final TableInfo t2, final String label) {
        String e2 = StringUtil.toPascalCase(t2.getName());
        String i2 = StringUtil.toCamelCase(t2.getName());
        s.add("");
        s.add("        // " + t2.getRemarks() + " の" + label + "チェック");
        s.add("        Map<String, Object> " + i2 + "Params = new java.util.HashMap<String, Object>();");
        String lk = null;
        for (String k2 : t2.getPrimaryKeys()) {
            lk = StringUtil.toCamelCase(k2);
            s.add("        " + i2 + "Params.put(\"" + lk + "\", this." + lk + ");");
        }
        s.add("        baseProcess.masterCheck(errors, \"" + e2 + "Search\", \"" + lk + "\", " + i2
                + "Params, jp.co.golorp.emarf.util.Messages.get(\"" + e + "." + lk + "\"));");
    }

    /**
     * @param s
     * @param javadoc
     */
    private static void addAuthor(final List<String> s, final String javadoc) {
        s.add("");
        s.add("/**");
        s.add(" * " + javadoc);
        s.add(" *");
        s.add(" * @author emarfkrow");
        s.add(" */");
    }

    /**
     * @param s
     */
    public static void addImports(final List<String> s) {
        s.add("");
        s.add("import java.util.Map;");
        //        s.add("");
        //        s.add("import org.slf4j.Logger;");
        //        s.add("import org.slf4j.LoggerFactory;");
        s.add("");
        s.add("import jp.co.golorp.emarf.process.BaseProcess;");
        s.add("import jp.co.golorp.emarf.validation.IForm;");
    }

    /**
     * 詳細画面 フォームチェック追加
     * @param s 出力文字列のリスト
     * @param table テーブル情報
     * @param column カラム情報
     */
    private static void javaFormDetailRegistChecks(final List<String> s, final TableInfo table,
            final ColumnInfo column) {

        // 適用日を含む主キー
        List<String> keys = new ArrayList<String>(table.getPrimaryKeys());

        // 適用日以外の主キー
        List<String> koKeys = new ArrayList<String>(table.getPrimaryKeys());
        koKeys.remove(TEKIYO_BI);

        String colName = column.getName();
        String registGroup = "groups = jp.co.golorp.emarf.validation.Regist.class";
        String regDelGroups = "groups = { jp.co.golorp.emarf.validation.Regist.class, jp.co.golorp.emarf.validation.Delete.class }";

        // 必須チェック
        if (column.getNullable() == 0) {

            if (column.isNumbering() /*&& ci.getColumnName().equals(pks.get(pks.size() - 1)) 一旦、採番キーならスキップに戻す*/) {

                // 採番キーなら除外
                LOG.trace("skip NotBlank.");

                // フラグでも必須チェックを掛ける
                //            } else if (StringUtil.endsWith(inputFlagSuffixs, ci.getColumnName())) {
                //
                //                // フラグも除外
                //                LOG.trace("skip NotBlank.");

            } else if (column.isPk() && table.getParents().size() > 0
                    && !column.getName().matches("(?i)^" + keys.get(keys.size() - 1) + "$")
                    && !column.getName().matches("(?i)^" + koKeys.get(koKeys.size() - 1) + "$")) {

                // 最終キーでなければ、親から取得するはずなので除外
                LOG.trace("skip NotBlank.");

            } else if (!column.isPk() && column.getTypeName().equals("CHAR")
                    && !StringUtil.isNullOrWhiteSpace(CHAR_NOTNULL_RE) && !colName.matches(CHAR_NOTNULL_RE)) {

                // 主キー以外のCHAR列で、必須CHAR指定に合致しない場合、NULLならスペースを補填する
                LOG.trace("skip NotBlank.");

            } else if (!column.isPk() && column.getTypeName().equals("NUMBER")
                    && !StringUtil.isNullOrWhiteSpace(NUMBER_NULLABLE_RE) && colName.matches(NUMBER_NULLABLE_RE)) {

                // 主キー以外のNUMBER列で、非必須INT指定に合致する場合、NULLなら「0」を補填する
                LOG.trace("skip NotBlank.");

            } else if (StringUtil.endsWith(INPUT_TS_SUFS, colName)) {

                // タイムスタンプならスキップ
                LOG.trace("skip NotBlank.");

            } else {

                // 主キー以外は登録時のみ必須チェック（削除時はチェックしない）
                if (column.isPk()) {
                    s.add("    @jakarta.validation.constraints.NotBlank(" + regDelGroups + ")");
                } else {
                    s.add("    @jakarta.validation.constraints.NotBlank(" + registGroup + ")");
                }
            }
        }

        int matchLength = 0;
        String validSuffix = null;
        for (String suffix : VALID_SUFS) {
            Pattern pattern = Pattern.compile("(?i).*(" + suffix + ")$");
            Matcher matcher = pattern.matcher(colName);
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

            String re = bundle.getString("valid." + validSuffix);
            s.add("    @jakarta.validation.constraints.Pattern(" + registGroup + ", regexp = \"" + re + "\")");

            // 桁数チェックは正規表現に任せる。<input type="month">が9999-99になるため。
            //            if (column.getTypeName().contains("CHAR")) {
            //                s.add("    @jakarta.validation.constraints.Size(max = " + column.getColumnSize() + ")");
            //            }
            String type = HtmlGenerator.getInputType(column.getName());
            if (type.equals("text") && column.getTypeName().contains("CHAR")) {
                s.add("    @jakarta.validation.constraints.Size(" + registGroup + ", max = " + column.getColumnSize()
                        + ")");
            }

        } else {
            // Patternの指定がない場合

            int columnSize = column.getColumnSize();

            // 形式チェック
            if (column.getTypeName().startsWith("INT") || column.getTypeName().equals("DECIMAL")
                    || column.getTypeName().equals("DOUBLE") || column.getTypeName().equals("NUMBER")
                    || column.getTypeName().equals("NUMERIC")) {

                // DECIMALの場合（整数桁・小数桁）
                int decimalDigits = column.getDecimalDigits();
                int integer = columnSize - decimalDigits;
                String re = "(-?[0-9]{0," + integer + "}\\\\.?[0-9]{0," + decimalDigits + "}?)?";
                s.add("    @jakarta.validation.constraints.Pattern(" + registGroup + ", regexp = \"" + re + "\")");

            } else {
                // DECIMAL以外

                // 上記以外の場合は最大桁チェック
                s.add("    @jakarta.validation.constraints.Size(" + registGroup + ", max = " + columnSize + ")");
            }
        }

        if (column.isPk()) {
            s.add("    @jp.co.golorp.emarf.validation.PrimaryKeys");
        } else if (column.getName().matches("(?i)^" + UPDATE_AT + "$")) {
            s.add("    @jp.co.golorp.emarf.validation.OptLock");
        }
    }

    /**
     * 検索画面 フォーム出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaFormIndexRegist(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = (PKG_F + ".model.base").replace(".", File.separator);
        String packageDir = getProjectDir() + File.separator + DIR_J + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tableInfos) {

            if (table.isHistory() || table.isView() || table.isStatusFlow()) {
                continue;
            }

            String tableName = table.getName();
            String remarks = table.getRemarks();
            String entity = StringUtil.toPascalCase(tableName);
            String instance = StringUtil.toCamelCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + PKG_F + ".model.base;");
            s.add("");
            s.add("import java.util.List;");
            s.add("import java.util.Map;");
            s.add("");
            s.add("// import org.slf4j.Logger;");
            s.add("// import org.slf4j.LoggerFactory;");
            s.add("");
            s.add("import jakarta.validation.Valid;");
            s.add("import jp.co.golorp.emarf.process.BaseProcess;");
            s.add("import jp.co.golorp.emarf.validation.IForm;");
            addAuthor(s, remarks + "一覧登録フォーム");
            s.add("public class " + entity + "SRegistForm implements IForm {");
            s.add("");
            s.add("    // /** logger */");
            s.add("    // private static final Logger LOG = LoggerFactory.getLogger(" + entity + "RegistForm.class);");
            s.add("");
            s.add("    /** " + table.getRemarks() + "登録フォームのリスト */");
            s.add("    @Valid");
            s.add("    private List<" + entity + "RegistForm> " + instance + "Grid;");
            s.add("");
            s.add("    /**");
            s.add("     * @return " + table.getRemarks() + "登録フォームのリスト");
            s.add("     */");
            s.add("    public List<" + entity + "RegistForm> get" + entity + "Grid() {");
            s.add("        return " + instance + "Grid;");
            s.add("    }");
            s.add("");
            s.add("    /**");
            s.add("     * @param p " + table.getRemarks() + "登録フォームのリスト");
            s.add("     */");
            s.add("    public void set" + entity + "Grid(final List<" + entity + "RegistForm> p) {");
            s.add("        this." + instance + "Grid = p;");
            s.add("    }");
            s.add("");
            s.add("    /** 関連チェック */");
            s.add("    @Override");
            s.add("    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {");
            s.add("        if (this." + instance + "Grid != null) {");
            s.add("            for (int i = 0; i < this." + instance + "Grid.size(); i++) {");
            s.add("                " + entity + "RegistForm form = this." + instance + "Grid.get(i);");
            s.add("                if (form != null) {");
            s.add("                    Map<String, String> gridErrors = new java.util.LinkedHashMap<String, String>();");
            s.add("                    form.validate(gridErrors, baseProcess);");
            s.add("                    BaseProcess.copyGridErrors(errors, \"" + entity + "Grid\", i, gridErrors);");
            s.add("                }");
            s.add("            }");
            s.add("        }");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "SRegistForm.java";
            javaFilePaths.put(javaFilePath, PKG_F + ".model.base." + entity + "SRegistForm");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (IS_GENERATE_AT_STARTUP) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }
}
