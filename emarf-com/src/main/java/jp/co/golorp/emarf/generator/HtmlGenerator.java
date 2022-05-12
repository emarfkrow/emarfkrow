package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.ResourceBundles;

public final class HtmlGenerator {

    /** properties */
    private static ResourceBundle bundle;

    /** グリッド列幅ピクセル乗数 */
    private static final int COLUMN_WIDTH_PX_MULTIPLIER = 10;

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
    /** データjson */
    private static String json;
    /** options項目キー */
    private static String optionParamKey;
    /** options項目値 */
    private static String optionValue;
    /** options項目ラベル */
    private static String optionLabel;

    /** テキストエリア項目サフィックス */
    private static String[] textareaSuffixs;

    /** 日付入力サフィックス */
    private static String[] inputDateSuffixs;
    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;
    /** 年月入力サフィックス */
    private static String[] inputMonthSuffixs;
    /** 時刻入力サフィックス */
    private static String[] inputTimeSuffixs;
    /** 範囲指定サフィックス */
    private static String[] inputRangeSuffixs;
    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;
    /** ファイルサフィックス */
    private static String[] inputFileSuffixs;

    //    /** 参照IDサフィックス */
    //    private static String[] referIdSuffixs;
    //    /** 参照名サフィックス */
    //    private static String referMeiSuffix;
    /** 参照列名ペア */
    private static Map<String, String> referPairs = new HashMap<String, String>();

    private HtmlGenerator() {
    }

    /**
     * @param projectDir
     * @param tableInfos
     */
    static void generate(final String projectDir, final List<TableInfo> tableInfos) {

        bundle = ResourceBundles.getBundle(BeanGenerator.class);

        insertDt = bundle.getString("BeanGenerator.insert_dt");
        insertBy = bundle.getString("BeanGenerator.insert_by");
        updateDt = bundle.getString("BeanGenerator.update_dt");
        updateBy = bundle.getString("BeanGenerator.update_by");

        optionsSuffixs = bundle.getString("BeanGenerator.options.suffixs").split(",");
        json = bundle.getString("BeanGenerator.options.json");
        optionParamKey = bundle.getString("BeanGenerator.options.paramkey");
        optionValue = bundle.getString("BeanGenerator.options.value");
        optionLabel = bundle.getString("BeanGenerator.options.label");

        textareaSuffixs = bundle.getString("BeanGenerator.textarea.suffixs").split(",");

        inputDateSuffixs = bundle.getString("BeanGenerator.input.date.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("BeanGenerator.input.datetime.suffixs").split(",");
        inputMonthSuffixs = bundle.getString("BeanGenerator.input.month.suffixs").split(",");
        inputTimeSuffixs = bundle.getString("BeanGenerator.input.time.suffixs").split(",");
        inputRangeSuffixs = bundle.getString("BeanGenerator.input.range.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("BeanGenerator.input.file.suffixs").split(",");

        //        referIdSuffixs = bundle.getString("BeanGenerator.refer.id.suffixs").split(",");
        //        referMeiSuffix = bundle.getString("BeanGenerator.refer.mei.suffix");
        String[] pairs = bundle.getString("BeanGenerator.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.put(kv[0], kv[1]);
        }

        // 出力フォルダを再作成
        String htmlDir = projectDir + File.separator + bundle.getString("BeanGenerator.htmlPath");
        FileUtil.reMkDir(htmlDir);
        FileUtil.reMkDir(htmlDir + File.separator + ".." + File.separator + "common");

        String gridDir = projectDir + File.separator + bundle.getString("BeanGenerator.gridPath");
        FileUtil.reMkDir(gridDir);

        for (TableInfo tableInfo : tableInfos) {

            // 検索画面のHTMLを出力
            HtmlGenerator.htmlIndex(htmlDir, tableInfo);

            // 検索画面のGridColumnを出力
            HtmlGenerator.htmlGridColumns(gridDir, tableInfo);

            // 単画面を出力
            HtmlGenerator.htmlDetail(htmlDir, tableInfo);

            // thymeleafのプロパティファイルを出力
            HtmlGenerator.htmlProperties(htmlDir, tableInfo);
        }

        htmlNav(htmlDir, tableInfos);

        //        List<String> s = new ArrayList<String>();
        //        s.add("<!DOCTYPE html>");
        //        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\">");
        //        s.add("<head layout:fragment=\"gridColumns\">");
        //        for (TableInfo tableInfo : tableInfos) {
        //            String tableName = tableInfo.getTableName();
        //            String pascal = StringUtil.toPascalCase(tableName);
        //            s.add("<script th:src=\"@{/model/" + pascal + "GridColumns.js}\"></script>");
        //        }
        //        s.add("</head>");
        //        s.add("</html>");
        //        FileUtil.writeFile(
        //                htmlDir + File.separator + ".." + File.separator + "common" + File.separator + "gridColumns.html",
        //                s);
    }

    private static void htmlNav(final String htmlDir, final List<TableInfo> tableInfos) {

        // プレフィクス毎にグループ化
        Map<String, List<TableInfo>> navs = new LinkedHashMap<String, List<TableInfo>>();
        for (TableInfo tableInfo : tableInfos) {
            if (tableInfo.getPrimaryKeys().size() > 1) {
                continue;
            }
            String tableName = tableInfo.getTableName();
            String prefix = tableName.replaceAll("_.+$", "");
            List<TableInfo> nav = null;
            if (navs.containsKey(prefix)) {
                nav = navs.get(prefix);
            } else {
                nav = new ArrayList<TableInfo>();
                navs.put(prefix, nav);
            }
            nav.add(tableInfo);
        }

        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\">");
        s.add("<body>");
        s.add("  <div class=\"nav\" layout:fragment=\"nav\" th:if=\"${#session != null && #session.getAttribute('AUTHN_KEY') != null}\">");
        s.add("    <dl>");
        for (Entry<String, List<TableInfo>> nav : navs.entrySet()) {
            String t = nav.getKey();
            s.add("      <dt th:text=\"#{nav.dt." + t + "}\">" + t + "</dt>");
            s.add("      <dd>");
            s.add("        <ul>");
            List<TableInfo> navInfos = nav.getValue();
            for (TableInfo tableInfo : navInfos) {
                String tableName = tableInfo.getTableName();
                String remarks = tableInfo.getRemarks();
                String pascal = StringUtil.toPascalCase(tableName);
                String pageName = pascal + "S";
                s.add("          <li><a id=\"" + pascal + "\" th:href=\"@{/model/" + pageName
                        + ".html}\" th:text=\"#{nav." + pageName + "}\">" + remarks + "</a></li>");
            }
            s.add("        </ul>");
            s.add("      </dd>");
        }
        s.add("    </dl>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");
        FileUtil.writeFile(htmlDir + File.separator + ".." + File.separator + "common" + File.separator + "nav.html",
                s);
    }

    /**
     * 検索画面 HTML出力
     * @param htmlDir
     * @param tableInfo
     */
    private static void htmlIndex(final String htmlDir, final TableInfo tableInfo) {

        String tableName = tableInfo.getTableName();
        String remarks = tableInfo.getRemarks();
        String pascal = StringUtil.toPascalCase(tableName);
        String pageName = pascal + "S";

        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\" layout:decorate=\"~{common/base}\">");
        s.add("<head>");
        s.add("<meta charset=\"UTF-8\">");
        s.add("<title th:text=\"#{" + pageName + ".title}\">" + remarks + "</title>");
        s.add("<style type=\"text/css\">");
        s.add("</style>");
        s.add("<script type=\"text/javascript\">");
        s.add("");
        s.add("</script>");
        s.add("<script th:src=\"@{/model/" + pascal + "GridColumns.js}\"></script>");
        htmlNestGrid(tableInfo, s, new HashSet<TableInfo>());
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + pageName + ".h2}\">h2</h2>");
        /* 検索フォーム */
        s.add("    <form name=\"" + pascal + "SearchForm\" action=\"" + pascal + "Search.ajax\" class=\"search\">");
        s.add("      <fieldset>");
        s.add("        <legend th:text=\"#{" + pageName + ".legend}\">legend</legend>");
        htmlFields(tableInfo, s, false, false);
        s.add("      </fieldset>");
        s.add("      <div class=\"buttons\">");
        s.add("        <button type=\"reset\" th:text=\"#{common.reset}\">reset</button>");
        // 採番キーが２つ以上あれば新規ボタンは出力しない
        int numberingCount = 0;
        for (String primaryKey : tableInfo.getPrimaryKeys()) {
            ColumnInfo primaryKeyInfo = tableInfo.getColumnInfos().get(primaryKey);
            if (primaryKeyInfo != null && primaryKeyInfo.isNumbering() && primaryKeyInfo.getReferInfo() == null) {
                ++numberingCount;
            }
        }
        if (numberingCount < 2) {
            s.add("        <a th:href=\"@{/model/" + pascal + ".html}\" id=\"" + pascal
                    + "\" target=\"dialog\" th:text=\"#{" + pascal + ".add}\" tabindex=\"-1\">" + remarks + "</a>");
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        s.add("        <button id=\"Search" + pascal + "\" class=\"search\" data-gridId=\"" + pascal
                + "Grid\" th:text=\"#{common.search}\">submit</button>");
        s.add("      </div>");
        s.add("    </form>");
        /* 一覧フォーム */
        s.add("    <form name=\"" + pascal + "SRegistForm\" action=\"" + pascal + "SRegist.ajax\" class=\"regist\">");
        s.add("      <h3 th:text=\"#{" + pascal + ".h3}\">h3</h3>");
        String gridId = pascal + "Grid";
        String addRow = "";
        // 単一採番キーの場合は新規行あり
        if (tableInfo.getPrimaryKeys().size() == 1) {
            String uniqueKey = tableInfo.getPrimaryKeys().get(0);
            ColumnInfo uniqueKeyInfo = tableInfo.getColumnInfos().get(uniqueKey);
            if (uniqueKeyInfo.isNumbering()) {
                addRow = " data-addRow=\"true\"";
            }
        }
        // ファイル列がある場合は新規行を取消
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
            if (StringUtil.endsWith(inputFileSuffixs, columnInfo.getColumnName())) {
                addRow = "";
                break;
            }
        }
        int frozenColumn = tableInfo.getPrimaryKeys().size() - 1;
        s.add("      <div id=\"" + gridId + "\" data-selectionMode=\"checkbox\"" + addRow + " data-frozenColumn=\""
                + frozenColumn + "\" th:data-href=\"@{/model/" + pascal + ".html}\"></div>");
        s.add("      <div class=\"buttons\">");
        s.add("        <button type=\"button\" th:text=\"#{common.reset}\" onClick=\"$('[id=&quot;Search" + pascal
                + "&quot;]').click();\">reset</button>");
        s.add("        <a th:href=\"@{" + pascal + "Search.xlsx(baseMei=#{" + pascal + "S.h2})}\" id=\"" + pascal
                + "Search.xlsx\" th:text=\"#{common.xlsx}\" tabindex=\"-1\">xlsx</a>");
        s.add("        <button id=\"Delete" + pascal + "S\" class=\"delete selectRows\" data-action=\"" + pascal
                + "SDelete.ajax\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        s.add("        <button id=\"Regist" + pascal
                + "S\" class=\"regist\" th:text=\"#{common.regist}\">submit</button>");
        s.add("      </div>");
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");

        FileUtil.writeFile(htmlDir + File.separator + pageName + ".html", s);
    }

    private static void htmlNestGrid(final TableInfo tableInfo, final List<String> s, final Set<TableInfo> added) {

        for (TableInfo childInfo : tableInfo.getChildInfos()) {

            if (added.contains(childInfo)) {
                continue;
            }

            String childName = childInfo.getTableName();
            String pascalChild = StringUtil.toPascalCase(childName);
            s.add("<script th:src=\"@{/model/" + pascalChild + "GridColumns.js}\"></script>");
            added.add(childInfo);

            htmlNestGrid(childInfo, s, added);
        }

        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {

            TableInfo referInfo = columnInfo.getReferInfo();

            if (referInfo != null) {

                if (added.contains(referInfo)) {
                    continue;
                }

                String referName = referInfo.getTableName();
                String pascalRefer = StringUtil.toPascalCase(referName);
                s.add("<script th:src=\"@{/model/" + pascalRefer + "GridColumns.js}\"></script>");
                added.add(referInfo);

                htmlNestGrid(referInfo, s, added);
            }
        }
    }

    /**
     * 検索画面 グリッド定義出力
     * @param gridDir
     * @param tableInfo
     */
    private static void htmlGridColumns(final String gridDir, final TableInfo tableInfo) {

        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);

        List<String> s = new ArrayList<String>();
        s.add("/**");
        s.add(" * " + tableInfo.getRemarks() + "グリッド定義");
        s.add(" */");
        s.add("");
        s.add("let " + entityName + "GridColumns = [");

        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
            String columnName = columnInfo.getColumnName();
            String lower = columnName.toLowerCase();
            String camel = StringUtil.toCamelCase(lower);
            String name = "Messages['" + entityName + "Grid." + camel + "']";
            String field = lower.toUpperCase();
            int width = columnInfo.getColumnSize() * COLUMN_WIDTH_PX_MULTIPLIER;
            if (width > 300) {
                width = 300;
            }

            String css = "";
            if (columnInfo.isPk()) {
                css = "primaryKey";
            } else if (lower.equals(insertDt) || lower.equals(updateDt)) {
                css = "metaInfo";
            } else if (lower.equals(insertBy) || lower.equals(updateBy)) {
                css = "metaInfo";
            }

            String formatter = "null";
            if (columnInfo.getDataType().equals("java.time.LocalDateTime")) {
                formatter = "Slick.Formatters.Extends.DateTime";
            }

            boolean isRefer = false;
            String referMei = null;
            TableInfo referInfo = columnInfo.getReferInfo();
            if (referInfo != null) {
                if (StringUtil.endsWith(referPairs, columnName)) {
                    referMei = columnName;
                    for (String suffix : referPairs.keySet()) {
                        if (referMei.matches("(?i).+" + suffix + "$")) {
                            referMei = referMei.replaceAll("(?i)" + suffix + "$", referPairs.get(suffix));
                        }
                    }
                    referMei = StringUtil.toUpperCase(referMei);
                    if (!tableInfo.getColumnInfos().containsKey(referMei)) {
                        isRefer = true;
                    }
                }
            }

            String c = "";
            if (isRefer) {

                c = "Column.refer('" + field + "', " + name + ", " + width + ", '" + css + "', '" + referMei + "'),";

            } else if (columnInfo.isPk()) {

                c = "Column.cell('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";

            } else if (lower.equals(insertDt) || lower.equals(updateDt)) {

                c = "Column.cell('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";

            } else if (lower.equals(insertBy) || lower.equals(updateBy)) {

                c = "Column.cell('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";

            } else if (StringUtil.endsWith(inputFlagSuffixs, lower)) {

                c = "Column.check('" + field + "', " + name + ", " + width + ", '" + css + "'),";

            } else if (StringUtil.endsWith(inputDateSuffixs, lower)) {

                c = "Column.date('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";

            } else if (StringUtil.endsWith(inputDateTimeSuffixs, lower)) {

                c = "Column.dateTime('" + field + "', " + name + ", " + width + ", '" + css + "'),";

            } else if (StringUtil.endsWith(inputMonthSuffixs, lower)) {

                c = "Column.month('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";

            } else if (StringUtil.endsWith(inputTimeSuffixs, lower)) {

                c = "Column.time('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";

            } else if (StringUtil.endsWith(inputFileSuffixs, lower)) {

                c = "Column.link('" + field + "', " + name + ", " + width + ", '" + css + "'),";

            } else if (StringUtil.endsWith(optionsSuffixs, lower)) {

                String options = "{ json: '" + json + "', paramkey: '" + optionParamKey + "', value: '" + optionValue
                        + "', label: '" + optionLabel + "' }";
                c = "Column.select('" + field + "', " + name + ", " + width + ", '" + css + "', " + options + "),";

            } else if (StringUtil.endsWith(textareaSuffixs, lower)) {

                c = "Column.longText('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";

            } else if (columnInfo.getTypeName().equals("DECIMAL")) {

                if (columnInfo.getDecimalDigits() == 3) {
                    c = "Column.dec3('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
                } else if (columnInfo.getDecimalDigits() == 2) {
                    c = "Column.dec2('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
                } else if (columnInfo.getDecimalDigits() == 1) {
                    c = "Column.dec1('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
                } else {
                    c = "Column.comma('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
                }

            } else {

                c = "Column.text('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
            }

            s.add("    " + c);
        }

        s.add("];");

        FileUtil.writeFile(gridDir + File.separator + entityName + "GridColumns.js", s);
    }

    /**
     * 詳細画面 HTML出力
     * @param htmlDir
     * @param tableInfo
     */
    private static void htmlDetail(final String htmlDir, final TableInfo tableInfo) {

        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);
        String formName = entityName + "RegistForm";
        String action = entityName + "Regist.ajax";
        String remarks = tableInfo.getRemarks();

        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\" layout:decorate=\"~{common/base}\">");
        s.add("<head>");
        s.add("<meta charset=\"UTF-8\">");
        s.add("<title th:text=\"#{" + entityName + ".title}\">" + remarks + "</title>");
        s.add("<style type=\"text/css\">");
        s.add("</style>");
        s.add("<script type=\"text/javascript\">");
        s.add("");
        s.add("</script>");
        s.add("<script th:src=\"@{/model/" + entityName + "GridColumns.js}\"></script>");
        htmlNestGrid(tableInfo, s, new HashSet<TableInfo>());
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + entityName + ".h2}\">h2</h2>");
        s.add("    <form name=\"" + formName + "\" action=\"" + action + "\" class=\"regist\">");
        s.add("      <fieldset>");
        s.add("        <legend th:text=\"#{" + entityName + ".legend}\">legend</legend>");
        htmlFields(tableInfo, s, true, false);
        s.add("      </fieldset>");
        List<TableInfo> brosInfos = tableInfo.getBrosInfos();
        if (brosInfos != null) {
            for (TableInfo brosInfo : brosInfos) {
                String brosName = StringUtil.toPascalCase(brosInfo.getTableName());
                s.add("      <fieldset>");
                s.add("        <legend th:text=\"#{" + brosName + ".legend}\">legend</legend>");
                htmlFields(brosInfo, s, true, true);
                s.add("      </fieldset>");
            }
        }
        //子テーブルリスト
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String pascal = StringUtil.toPascalCase(childName);
            String frozen = String.valueOf(tableInfo.getPrimaryKeys().size());
            s.add("      <h3 th:text=\"#{" + pascal + ".h3}\">h3</h3>");
            s.add("      <a th:href=\"@{/model/" + pascal + ".html}\" id=\"" + pascal
                    + "\" target=\"dialog\" th:text=\"#{" + pascal + ".add}\" class=\"addChild\" tabindex=\"-1\">"
                    + childInfo.getRemarks() + "</a>");
            // ファイル列がある場合は新規行を取消
            String addRow = " data-addRow=\"true\"";
            for (ColumnInfo columnInfo : childInfo.getColumnInfos().values()) {
                if (StringUtil.endsWith(inputFileSuffixs, columnInfo.getColumnName())) {
                    addRow = "";
                    break;
                }
            }
            s.add("      <div id=\"" + pascal
                    + "Grid\" data-selectionMode=\"link\"" + addRow + " data-frozenColumn=\"" + frozen
                    + "\" th:data-href=\"@{/model/" + pascal + ".html}\"></div>");
        }
        s.add("      <div class=\"buttons\">");
        s.add("        <button type=\"button\" th:text=\"#{common.reset}\" onClick=\"Dialogate.refresh(event);\">reset</button>");
        s.add("        <a th:href=\"@{" + entityName + "Get.xlsx(baseMei=#{" + entityName + ".h2})}\" id=\""
                + entityName + "Get.xlsx\" th:text=\"#{common.xlsx}\" tabindex=\"-1\">xlsx</a>");
        s.add("        <button id=\"Delete" + entityName + "\" class=\"delete\" data-action=\"" + entityName
                + "Delete.ajax\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        s.add("        <button id=\"Regist" + entityName
                + "\" class=\"regist\" th:text=\"#{common.regist}\">登録</button>");
        s.add("      </div>");
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");

        FileUtil.writeFile(htmlDir + File.separator + entityName + ".html", s);
    }

    /**
     * htmlにフィールド追加
     *
     * @param tableInfo
     * @param s
     * @param isDetail
     * @param isBrother
     */
    private static void htmlFields(final TableInfo tableInfo, final List<String> s, final boolean isDetail,
            final boolean isBrother) {

        //エンティティ名を取得
        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);

        // カラム情報でループ
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
            String columnName = columnInfo.getColumnName();
            String remarks = columnInfo.getRemarks();

            String lower = columnName.toLowerCase();
            String camel = StringUtil.toCamelCase(columnName);
            String id = entityName + "." + camel;

            boolean isInputFile = StringUtil.endsWith(inputFileSuffixs, lower);

            // 兄弟モデルの主キーは出力しない
            if (isBrother && columnInfo.isPk()) {
                continue;
            }

            // 検索条件にはファイル項目を出力しない
            if (!isDetail && isInputFile) {
                continue;
            }

            if (lower.equals(insertDt) || lower.equals(insertBy)
                    || lower.equals(updateDt) || lower.equals(updateBy)) {
                // メタ情報の場合

                // 検索画面の場合はスキップ（検索条件にはしない）
                if (!isDetail) {
                    continue;
                }

                // 詳細画面の兄弟モデルは更新日時のみhiddenで出力
                if (isBrother) {
                    if (lower.equals(updateDt)) {
                        s.add("        <input type=\"hidden\" name=\"" + id + "\" />");
                    }
                    continue;
                }
            }

            s.add("        <div id=\"" + camel + "\">");
            if (lower.equals(insertDt) || lower.equals(insertBy)
                    || lower.equals(updateDt) || lower.equals(updateBy)) {
                // メタ情報の場合は表示項目（編集画面の自モデルのみここに到達する）

                htmlFieldsMeta(s, id, remarks);

            } else if (isDetail && columnInfo.isNumbering()) {
                // 編集画面の採番キーは表示項目

                String tag = "          ";
                tag += "<label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
                tag += "<span id=\"" + id + "\"></span>";
                tag += "<input type=\"hidden\" id=\"" + id + "\" name=\"" + id + "\" class=\"primaryKey\" />";

                // 参照モデルの場合は参照リンクを出力（参照リンクは照会画面ではjsで非表示にする）
                if (columnInfo.getReferInfo() != null) {

                    TableInfo referInfo = columnInfo.getReferInfo();
                    String referName = StringUtil.toPascalCase(referInfo.getTableName());
                    tag += "<a id=\"" + id + "\" th:href=\"@{/model/" + referName
                            + "S.html}\" target=\"dialog\" class=\"primaryKey refer\" th:text=\"#{common.refer}\" tabindex=\"-1\">...</a>";

                    // 名称項目がなければspanも出力
                    String meiColumnName = getMeiColumnName(columnName);
                    if (!tableInfo.getColumnInfos().containsKey(meiColumnName)) {
                        String meiId = entityName + "." + StringUtil.toCamelCase(meiColumnName);
                        String referDef = getReferDef(entityName, columnName, referInfo);
                        tag += "<span id=\"" + meiId + "\" class=\"refer\"" + referDef + "></span>";
                    }
                }

                s.add(tag);

            } else if (StringUtil.endsWith(optionsSuffixs, lower)) {
                // 選択項目の場合

                htmlFieldsOptions(s, id, lower, remarks);

            } else if (isDetail && StringUtil.endsWith(textareaSuffixs, lower)) {
                // テキストエリア項目の場合

                htmlFieldsTextarea(s, id, remarks);

            } else {
                // 上記以外の場合

                String type = "text";
                if (StringUtil.endsWith(inputDateSuffixs, lower)) { // 日付項目
                    type = "date";
                } else if (StringUtil.endsWith(inputDateTimeSuffixs, lower)) { // 日時項目
                    type = "datetime-local";
                } else if (StringUtil.endsWith(inputMonthSuffixs, lower)) { // 年月項目
                    type = "month";
                } else if (StringUtil.endsWith(inputTimeSuffixs, lower)) { // 時刻項目
                    type = "time";
                } else if (isInputFile) { // ファイル
                    type = "file";
                }

                int max = columnInfo.getColumnSize();

                String css = "";
                if (isDetail && columnInfo.isPk()) {
                    css = " class=\"primaryKey\"";
                }

                if (!isDetail && StringUtil.endsWith(inputRangeSuffixs, lower)) {
                    // 検索画面の範囲指定項目の場合

                    htmlFieldsInputRange(s, id, remarks, type, max);

                } else if (columnInfo.getReferInfo() != null) {
                    // 参照モデルの場合

                    String tag = "          ";
                    TableInfo referInfo = columnInfo.getReferInfo();
                    String referName = StringUtil.toPascalCase(referInfo.getTableName());
                    String referDef = getReferDef(entityName, columnName, referInfo);
                    tag += "<label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
                    tag += "<input type=\"" + type + "\" id=\"" + id + "\" name=\"" + id + "\" maxlength=\"" + max
                            + "\"" + css + referDef + "" + " />";
                    tag += "<a id=\"" + id + "\" th:href=\"@{/model/" + referName
                            + "S.html}\" target=\"dialog\" class=\"refer\" th:text=\"#{common.refer}\" tabindex=\"-1\">...</a>";

                    String meiColumnName = getMeiColumnName(columnName);
                    if (!tableInfo.getColumnInfos().containsKey(meiColumnName)) {
                        String meiId = entityName + "." + StringUtil.toCamelCase(meiColumnName);
                        tag += "<span id=\"" + meiId + "\" class=\"refer\"" + referDef + "></span>";
                    }
                    s.add(tag);

                } else {

                    htmlFieldsInput(s, id, remarks, type, max, css);
                }
            }

            s.add("        </div>");
        }
    }

    private static void htmlFieldsInput(final List<String> s, final String id, final String remarks, final String type,
            final int max, final String css) {

        String tag = "          ";
        tag += "<label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<input type=\"" + type + "\" id=\"" + id + "\" name=\"" + id + "\" maxlength=\"" + max + "\"" + css
                + " />";

        if (type.equals("file")) {
            tag += "<a id=\"" + id
                    + "\" target=\"blank\" style=\"display: none;\" th:text=\"#{common.download}\">ダウンロード</a>";
            tag += "<input type=\"hidden\" id=\"" + id + "\" name=\"" + id + "\" disabled />";
        }

        s.add(tag);
    }

    private static void htmlFieldsInputRange(final List<String> s, final String id, final String remarks,
            final String type, final int max) {

        String tag = "          ";
        tag += "<label for=\"" + id + "_1\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<input type=\"" + type + "\" id=\"" + id + "_1\" name=\"" + id + "_1\" maxlength=\"" + max + "\" />";
        tag += "～";
        tag += "<input type=\"" + type + "\" id=\"" + id + "_2\" name=\"" + id + "_2\" maxlength=\"" + max + "\" />";
        s.add(tag);
    }

    private static void htmlFieldsTextarea(final List<String> s, final String id, final String remarks) {
        s.add("          <label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>");
        s.add("          <textarea id=\"" + id + "\" name=\"" + id + "\"></textarea>");
    }

    private static void htmlFieldsOptions(final List<String> s, final String id, final String lower,
            final String remarks) {
        s.add("          <fieldset id=\"" + id + "List\" data-options=\"" + json + "\" data-optionParams=\""
                + optionParamKey + ":" + lower + "\" data-optionValue=\"" + optionValue + "\" data-optionLabel=\""
                + optionLabel + "\">");
        s.add("            <legend th:text=\"#{" + id + "}\">" + remarks + "</legend>");
        s.add("          </fieldset>");
    }

    private static void htmlFieldsMeta(final List<String> s, final String id, final String remarks) {

        String tag = "          ";
        tag += "<label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<span id=\"" + id + "\"></span>";
        tag += "<input type=\"hidden\" id=\"" + id + "\" name=\"" + id + "\" />";
        s.add(tag);
    }

    private static String getReferDef(final String entityName, final String columnName, final TableInfo referInfo) {

        if (StringUtil.endsWith(referPairs, columnName)) {
            String meiColumnName = getMeiColumnName(columnName);
            String srcColumn = null;
            String destColumn = null;
            for (String referColumnName : referInfo.getColumnInfos().keySet()) {
                if (columnName.matches("^.*" + referColumnName + "$")) {
                    srcColumn = referColumnName;
                } else if (meiColumnName.matches("^.*" + referColumnName + "$")) {
                    destColumn = referColumnName;
                }
            }

            String referName = StringUtil.toPascalCase(referInfo.getTableName());
            String id = entityName + "." + StringUtil.toCamelCase(columnName);
            String meiId = entityName + "." + StringUtil.toCamelCase(meiColumnName);
            return " data-json=\"" + referName + "Search.json\" data-srcDef=\"" + srcColumn + ":"
                    + id + "\" data-destDef=\"" + meiId + ":" + destColumn + "\"";
        }

        return "";
    }

    private static String getMeiColumnName(final String columnName) {
        String meiColumnName = columnName;
        for (String referIdSuffix : referPairs.keySet()) {
            meiColumnName = meiColumnName.replaceAll("(?i)" + referIdSuffix + "$", referPairs.get(referIdSuffix));
        }
        meiColumnName = StringUtil.toUpperCase(meiColumnName);
        return meiColumnName;
    }

    /**
     * 各モデルのプロパティファイル出力
     * @param htmlDir
     * @param tableInfo
     */
    private static void htmlProperties(final String htmlDir, final TableInfo tableInfo) {

        String tableName = tableInfo.getTableName();
        String entityName = StringUtil.toPascalCase(tableName);
        String remarks = tableInfo.getRemarks();

        List<String> s = new ArrayList<String>();
        s.add(entityName + "S.title   " + remarks + "検索");
        s.add(entityName + "S.h2      " + remarks + "検索");
        s.add(entityName + "S.legend  " + remarks + "検索");
        s.add(entityName + ".add      " + remarks + "追加");
        s.add(entityName + ".title    " + remarks + "詳細");
        s.add(entityName + ".h2       " + remarks + "詳細");
        s.add(entityName + ".legend   " + remarks + "詳細");
        s.add(entityName + ".h3       " + remarks + "一覧");
        s.add("");
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
            String camel = StringUtil.toCamelCase(columnInfo.getColumnName());
            s.add(entityName + "." + camel + " " + columnInfo.getRemarks());
        }
        s.add("");
        for (ColumnInfo columnInfo : tableInfo.getColumnInfos().values()) {
            String camel = StringUtil.toCamelCase(columnInfo.getColumnName());
            s.add(entityName + "Grid." + camel + " " + columnInfo.getRemarks());
        }
        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {
            String brosName = brosInfo.getTableName();
            String pascal = StringUtil.toPascalCase(brosName);
            String brosMei = brosInfo.getRemarks();
            s.add("");
            s.add(pascal + ".legend   " + brosMei + "詳細");
            for (ColumnInfo columnInfo : brosInfo.getColumnInfos().values()) {
                String camel = StringUtil.toCamelCase(columnInfo.getColumnName());
                s.add(pascal + "." + camel + " " + columnInfo.getRemarks());
            }
        }
        for (TableInfo childInfo : tableInfo.getChildInfos()) {
            String childName = childInfo.getTableName();
            String pascal = StringUtil.toPascalCase(childName);
            String childMei = childInfo.getRemarks();
            s.add("");
            s.add(pascal + ".h3  " + childMei + "一覧");
            s.add(pascal + ".add " + childMei + "追加");
            for (ColumnInfo columnInfo : childInfo.getColumnInfos().values()) {
                String camel = StringUtil.toCamelCase(columnInfo.getColumnName());
                s.add(pascal + "Grid." + camel + " " + columnInfo.getRemarks());
            }
        }

        FileUtil.writeFile(htmlDir + File.separator + entityName + ".properties", s);
    }

}
