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
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * フォーム出力
 */
public final class FormGenerator {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FormGenerator.class);

    /** BeanGenerator.properties */
    private static ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);

    /** formパッケージ */
    private static String pkgForm;

    /** javaファイル出力ルートパス */
    private static String javaDir;

    /** プロジェクトディレクトリ */
    private static String projectDir;

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

    /** 起動時の自動生成か */
    private static boolean isGenerateAtStartup;

    /** validサフィックス */
    private static List<String> validSuffixs;

    /** 必須CHAR列の指定 */
    private static String charNotNullRe;
    /** 非必須INT列の指定 */
    private static String numberNullableRe;
    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;

    /**
     * プライベートコンストラクタ
     */
    private FormGenerator() {
    }

    /**
     * 各ファイル出力 主処理
     * @param dir プロジェクトのディレクトリ
     * @param tables
     */
    public static void generate(final String dir, final List<TableInfo> tables) {

        projectDir = dir;

        //webからの自動生成ならコンパイルまで行う
        if (App.get("generateAtStartup") != null) {
            isGenerateAtStartup = App.get("generateAtStartup").toLowerCase().equals("true");
        }

        pkgForm = bundle.getString("java.package.form") + ".model.base";
        javaDir = bundle.getString("dir.java");
        tekiyoBi = bundle.getString("column.start");
        insertDt = bundle.getString("column.insert.timestamp");
        insertBy = bundle.getString("column.insert.id");
        updateDt = bundle.getString("column.update.timestamp");
        updateBy = bundle.getString("column.update.id");

        //validator正規表現の接尾辞を取得
        validSuffixs = new ArrayList<String>();
        for (String key : bundle.keySet()) {
            if (key.startsWith("valid.")) {
                validSuffixs.add(key.replaceFirst("valid.", ""));
            }
        }

        //NOTNULLで必須項目として扱うCHARの列名リスト（ホストの△対応）
        charNotNullRe = bundle.getString("column.char.notnull.re");
        //NOTNULLのINT列で「0」を補填する列名指定
        numberNullableRe = bundle.getString("column.number.nullable.re");
        //タイムスタンプサフィックス
        inputTimestampSuffixs = bundle.getString("input.timestamp.suffixs").split(",");

        //フォームフォルダ
        String pkgFormPath = pkgForm.replace(".", File.separator);
        String pkgFormDir = projectDir + File.separator + javaDir + File.separator + pkgFormPath;
        FileUtil.reMkDir(pkgFormDir);

        FormGenerator.javaFormDetailRegist(tables);
        FormGenerator.javaFormIndexRegist(tables);
    }

    /**
     * 詳細画面 フォーム出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaFormDetailRegist(final List<TableInfo> tableInfos) {
        // 出力フォルダを再作成
        String packagePath = pkgForm.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaDir + File.separator + packagePath;
        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();
        for (TableInfo table : tableInfos) {
            if (table.isHistory() || table.isView()) {
                continue;
            }
            String entity = StringUtil.toPascalCase(table.getName());
            List<String> s = new ArrayList<String>();
            s.add("package " + pkgForm + ";");
            s.add("");
            if (table.getChilds().size() > 0) {
                s.add("import java.util.List;");
            }
            addImports(s);
            s.add("");
            s.add("/**");
            s.add(" * " + table.getRemarks() + "登録フォーム");
            s.add(" *");
            s.add(" * @author emarfkrow");
            s.add(" */");
            s.add("public class " + entity + "RegistForm implements IForm {");
            s.add("");
            s.add("    /** logger */");
            s.add("    private static final Logger LOG = LoggerFactory.getLogger(" + entity + "RegistForm.class);");
            for (ColumnInfo column : table.getColumns().values()) {
                // レコードメタデータならスキップ
                boolean isInsertDt = column.getName().matches("(?i)^" + insertDt + "$");
                // boolean isUpdateDt = column.getName().matches("(?i)^" + updateDt + "$"); 楽観ロック用に必要
                boolean isInsertBy = column.getName().matches("(?i)^" + insertBy + "$");
                boolean isUpdateBy = column.getName().matches("(?i)^" + updateBy + "$");
                if (isInsertDt || isInsertBy || /*isUpdateDt ||*/ isUpdateBy) {
                    continue;
                }
                String prop = StringUtil.toCamelCase(column.getName());
                String acce = StringUtil.toPascalCase(column.getName());
                s.add("");
                s.add("    /** " + column.getRemarks() + " */");
                javaFormDetailRegistChecks(s, table, column);
                s.add("    private String " + prop + ";");
                s.add("");
                s.add("    /**");
                s.add("     * @return " + column.getRemarks());
                s.add("     */");
                if (column.isPk()) {
                    s.add("    @jp.co.golorp.emarf.validation.PrimaryKeys");
                }
                s.add("    public String get" + acce + "() {");
                s.add("        return " + prop + ";");
                s.add("    }");
                s.add("");
                s.add("    /**");
                s.add("     * @param p " + column.getRemarks());
                s.add("     */");
                if (column.isPk()) {
                    s.add("    @jp.co.golorp.emarf.validation.PrimaryKeys");
                }
                s.add("    public void set" + acce + "(final String p) {");
                s.add("        this." + prop + " = p;");
                s.add("    }");
            }
            // 兄弟モデル
            for (TableInfo brosInfo : table.getBrothers()) {
                String brosName = brosInfo.getName();
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
            for (TableInfo childInfo : table.getChilds()) {
                String childName = childInfo.getName();
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
            for (ColumnInfo column : table.getColumns().values()) {
                boolean isInsertBy = column.getName().matches("(?i)^" + insertBy + "$");
                boolean isUpdateBy = column.getName().matches("(?i)^" + updateBy + "$");
                if (isInsertBy || isUpdateBy) {
                    continue;
                }
                if (column.getRefer() != null) {
                    TableInfo refer = column.getRefer();
                    if (refer.getPrimaryKeys().size() == 1) {
                        String prop = StringUtil.toCamelCase(column.getName());
                        String acce = StringUtil.toPascalCase(column.getName());
                        String referName = StringUtil.toPascalCase(refer.getName());
                        String referKey = StringUtil.toCamelCase(refer.getPrimaryKeys().get(0));
                        s.add("");
                        s.add("        // " + column.getRemarks() + " のマスタチェック");
                        s.add("        baseProcess.masterCheck(errors, \"" + referName + "Search\", \"" + referKey
                                + "\", this.get" + acce + "(), jp.co.golorp.emarf.util.Messages.get(\"" + entity + "."
                                + prop + "\"));");
                    }
                }
            }
            s.add("    }");
            s.add("");
            s.add("}");
            String javaFilePath = packageDir + File.separator + entity + "RegistForm.java";
            javaFilePaths.put(javaFilePath, pkgForm + "." + entity + "RegistForm");
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
     */
    public static void addImports(final List<String> s) {
        s.add("import java.util.Map;");
        s.add("");
        s.add("import org.slf4j.Logger;");
        s.add("import org.slf4j.LoggerFactory;");
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
        koKeys.remove(tekiyoBi);

        String colName = column.getName();

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
                    && !column.getName().equals(keys.get(keys.size() - 1))
                    && !column.getName().equals(koKeys.get(koKeys.size() - 1))) {

                // 最終キーでなければ、親から取得するはずなので除外
                LOG.trace("skip NotBlank.");

            } else if (!column.isPk() && column.getTypeName().equals("CHAR")
                    && !StringUtil.isNullOrWhiteSpace(charNotNullRe) && !colName.matches(charNotNullRe)) {

                // 主キー以外のCHAR列で、必須CHAR指定に合致しない場合、NULLならスペースを補填する
                LOG.trace("skip NotBlank.");

            } else if (!column.isPk() && column.getTypeName().equals("NUMBER")
                    && !StringUtil.isNullOrWhiteSpace(numberNullableRe) && colName.matches(numberNullableRe)) {

                // 主キー以外のNUMBER列で、非必須INT指定に合致する場合、NULLなら「0」を補填する
                LOG.trace("skip NotBlank.");

            } else if (StringUtil.endsWith(inputTimestampSuffixs, colName)) {

                // タイムスタンプならスキップ
                LOG.trace("skip NotBlank.");

            } else {

                s.add("    @jakarta.validation.constraints.NotBlank");
            }
        }

        int matchLength = 0;
        String validSuffix = null;
        for (String suffix : validSuffixs) {
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
            s.add("    @jakarta.validation.constraints.Pattern(regexp = \"" + re + "\")");

            // 桁数チェックは正規表現に任せる。<input type="month">が9999-99になるため。
            //            if (column.getTypeName().contains("CHAR")) {
            //                s.add("    @jakarta.validation.constraints.Size(max = " + column.getColumnSize() + ")");
            //            }

        } else {
            // Patternの指定がない場合

            int columnSize = column.getColumnSize();

            // 形式チェック
            if (column.getTypeName().equals("INT") || column.getTypeName().equals("DECIMAL")
                    || column.getTypeName().equals("DOUBLE") || column.getTypeName().equals("NUMBER")
                    || column.getTypeName().equals("NUMERIC")) {

                // DECIMALの場合（整数桁・小数桁）
                int decimalDigits = column.getDecimalDigits();
                int integer = columnSize - decimalDigits;
                String re = "-?([0-9]{0," + integer + "}\\\\.?[0-9]{0," + decimalDigits + "}?)?";
                s.add("    @jakarta.validation.constraints.Pattern(regexp = \"" + re + "\")");

            } else {
                // DECIMAL以外

                // 上記以外の場合は最大桁チェック
                s.add("    @jakarta.validation.constraints.Size(max = " + columnSize + ")");
            }
        }

        if (column.isPk()) {
            s.add("    @jp.co.golorp.emarf.validation.PrimaryKeys");
        }
    }

    /**
     * 検索画面 フォーム出力
     * @param tableInfos テーブル情報のリスト
     */
    private static void javaFormIndexRegist(final List<TableInfo> tableInfos) {

        // 出力フォルダを再作成
        String packagePath = pkgForm.replace(".", File.separator);
        String packageDir = projectDir + File.separator + javaDir + File.separator + packagePath;

        Map<String, String> javaFilePaths = new LinkedHashMap<String, String>();

        for (TableInfo table : tableInfos) {

            if (table.isHistory() || table.isView()) {
                continue;
            }

            String tableName = table.getName();
            String remarks = table.getRemarks();
            String entity = StringUtil.toPascalCase(tableName);
            String instance = StringUtil.toCamelCase(tableName);

            List<String> s = new ArrayList<String>();
            s.add("package " + pkgForm + ";");
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
            s.add("public class " + entity + "SRegistForm implements IForm {");
            s.add("");
            s.add("    /** logger */");
            s.add("    private static final Logger LOG = LoggerFactory.getLogger(" + entity + "RegistForm.class);");
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
            s.add("        LOG.debug(\"validate() not overridden in subclasses.\");");
            s.add("    }");
            s.add("");
            s.add("}");

            String javaFilePath = packageDir + File.separator + entity + "SRegistForm.java";
            javaFilePaths.put(javaFilePath, pkgForm + "." + entity + "SRegistForm");

            FileUtil.writeFile(javaFilePath, s);
        }

        if (isGenerateAtStartup) {
            for (Entry<String, String> e : javaFilePaths.entrySet()) {
                BeanGenerator.javaCompile(e.getKey(), e.getValue());
            }
        }
    }
}
