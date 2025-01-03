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
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * HTMLファイル出力
 *
 * @author golorp
 */
public final class HtmlGenerator {

    /** properties */
    private static ResourceBundle bundle;

    /** グリッド列幅ピクセル乗数 */
    private static final int COLUMN_WIDTH_PX_MULTIPLIER = 8;

    /** VIEWの検索条件とするプレフィクス */
    private static String[] searchPrefixes;
    /** VIEWの詳細画面にするテーブル名 */
    private static String detailColumn;

    /** ページ行数 */
    private static String rows;

    /** 数値列で自動採番しないサフィックス */
    private static String[] intNoFormatSuffixs;

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
    /** 区分カラム */
    private static String optK;
    /** 区分値カラム */
    private static String optV;
    /** 区分値名カラム */
    private static String optL;

    /** テキストエリア項目サフィックス */
    private static String[] textareaSuffixs;

    /** 日付入力サフィックス */
    private static String[] inputDateSuffixs;
    /** 8桁日付入力サフィックス */
    private static String[] inputDate8Suffixs;
    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;
    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;
    /** 年月入力サフィックス */
    private static String[] inputYMSuffixs;
    /** 時刻入力サフィックス */
    private static String[] inputTimeSuffixs;
    /** 範囲指定サフィックス */
    private static String[] inputRangeSuffixs;
    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;
    /** ファイルサフィックス */
    private static String[] inputFileSuffixs;

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** プライベートコンストラクタ */
    private HtmlGenerator() {
    }

    /**
     * HTMLファイル出力
     * @param projectDir プロジェクトディレクトリ
     * @param tableInfos テーブル情報のリスト
     */
    static void generate(final String projectDir, final List<TableInfo> tableInfos) {

        bundle = ResourceBundles.getBundle(BeanGenerator.class);

        searchPrefixes = bundle.getString("HtmlGenerator.view.search.prefix").split(",");
        detailColumn = bundle.getString("HtmlGenerator.view.detail.column");

        rows = bundle.getString("HtmlGenerator.rows");

        intNoFormatSuffixs = bundle.getString("HtmlGenerator.int.noformat.suffixs").split(",");

        insertDt = bundle.getString("BeanGenerator.insert_dt");
        insertBy = bundle.getString("BeanGenerator.insert_by");
        updateDt = bundle.getString("BeanGenerator.update_dt");
        updateBy = bundle.getString("BeanGenerator.update_by");

        optionsSuffixs = bundle.getString("BeanGenerator.options.suffixs").split(",");
        json = bundle.getString("BeanGenerator.options.json");
        optK = bundle.getString("BeanGenerator.options.key").toUpperCase();
        optV = bundle.getString("BeanGenerator.options.value").toUpperCase();
        optL = bundle.getString("BeanGenerator.options.label").toUpperCase();

        textareaSuffixs = bundle.getString("BeanGenerator.textarea.suffixs").split(",");

        inputYMSuffixs = bundle.getString("BeanGenerator.input.ym.suffixs").split(",");
        inputDate8Suffixs = bundle.getString("BeanGenerator.input.date8.suffixs").split(",");
        inputTimestampSuffixs = bundle.getString("BeanGenerator.input.timestamp.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("BeanGenerator.input.datetime.suffixs").split(",");
        inputDateSuffixs = bundle.getString("BeanGenerator.input.date.suffixs").split(",");
        inputTimeSuffixs = bundle.getString("BeanGenerator.input.time.suffixs").split(",");
        inputRangeSuffixs = bundle.getString("BeanGenerator.input.range.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("BeanGenerator.input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("BeanGenerator.input.file.suffixs").split(",");

        String[] pairs = bundle.getString("DataSources.reration.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }

        // 出力フォルダを再作成
        String htmlDir = projectDir + File.separator + bundle.getString("HtmlGenerator.htmlPath");
        FileUtil.reMkDir(htmlDir);
        FileUtil.reMkDir(htmlDir + File.separator + ".." + File.separator + "common");

        String gridDir = projectDir + File.separator + bundle.getString("HtmlGenerator.gridPath");
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

        HtmlGenerator.htmlNav(htmlDir, tableInfos);

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

    /**
     * 検索画面 HTML出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param tableInfo テーブル情報
     */
    private static void htmlIndex(final String htmlDir, final TableInfo tableInfo) {

        String entity = StringUtil.toPascalCase(tableInfo.getTableName());
        String index = entity + "S";
        String remarks = tableInfo.getRemarks();

        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\" layout:decorate=\"~{common/base}\">");
        s.add("<head>");
        s.add("<meta charset=\"UTF-8\">");
        s.add("<title th:text=\"#{" + index + ".title}\">" + remarks + "</title>");
        s.add("<style type=\"text/css\">");
        s.add("</style>");
        s.add("<script type=\"text/javascript\">");
        s.add("");
        s.add("</script>");
        s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
        Set<TableInfo> added = new HashSet<TableInfo>();
        added.add(tableInfo);
        htmlNestGrid(tableInfo, s, added);
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + index + ".h2}\">h2</h2>");
        s.add("    <!-- 検索フォーム -->");
        s.add("    <form name=\"" + entity + "SearchForm\" action=\"" + entity + "Search.ajax\" class=\"search\">");
        s.add("      <input type=\"hidden\" name=\"rows\" value=\"" + rows + "\" />");
        s.add("      <input type=\"hidden\" name=\"page\" value=\"0\" />");
        s.add("      <fieldset>");
        s.add("        <legend th:text=\"#{" + index + ".legend}\">legend</legend>");
        htmlFields(tableInfo, s, false, false);
        s.add("      </fieldset>");
        s.add("      <div class=\"buttons\">");
        s.add("        <button type=\"reset\" id=\"Reset" + entity
                + "\" th:text=\"#{common.reset}\" class=\"reset\">reset</button>");
        // 採番キーが２つ以上あれば新規ボタンは出力しない
        int numberingCount = 0;
        for (String pk : tableInfo.getPrimaryKeys()) {
            ColumnInfo pkCol = tableInfo.getColumnInfos().get(pk);
            if (pkCol != null && pkCol.isNumbering() && pkCol.getReferInfo() == null) {
                ++numberingCount;
            }
        }
        if (numberingCount == 1) {
            s.add("        <a th:href=\"@{/model/" + entity + ".html}\" id=\"" + entity
                    + "\" class=\"anew\" target=\"dialog\" th:text=\"#{" + entity + ".add}\" tabindex=\"-1\">" + remarks
                    + "</a>");
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        s.add("        <button id=\"Search" + entity + "\" class=\"search\" data-gridId=\"" + entity
                + "Grid\" th:text=\"#{common.search}\">submit</button>");
        s.add("      </div>");
        s.add("    </form>");
        s.add("    <!-- 一覧フォーム -->");
        s.add("    <form name=\"" + entity + "SRegistForm\" action=\"" + entity + "SRegist.ajax\" class=\"regist\">");
        s.add("      <h3 th:text=\"#{" + entity + ".h3}\">h3</h3>");
        String gridId = entity + "Grid";
        String addRow = "";
        // 単一キーの場合は新規行あり
        if (tableInfo.getPrimaryKeys().size() == 1) {
            String uniqueKey = tableInfo.getPrimaryKeys().get(0);
            ColumnInfo uniqueKeyInfo = tableInfo.getColumnInfos().get(uniqueKey);
            //            if (uniqueKeyInfo.isNumbering()) {
            //                addRow = " data-addRow=\"true\"";
            //            }
            //採番キーでなくても、参照キーでなければ新規行を表示
            if (uniqueKeyInfo.getReferInfo() == null) {
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
                + frozenColumn + "\" th:data-href=\"@{/model/" + entity + ".html}\"></div>");
        s.add("      <div id=\"" + entity + "Pager\"></div>");
        s.add("      <div class=\"buttons\">");
        if (!tableInfo.isHistory()) {
            s.add("        <button type=\"button\" id=\"Reset" + entity
                    + "S\" th:text=\"#{common.reset}\" class=\"reset\" onClick=\"$('[id=&quot;Search" + entity
                    + "&quot;]').click();\">reset</button>");
        }
        s.add("        <a th:href=\"@{" + entity + "Search.xlsx(baseMei=#{" + entity + "S.h2})}\" id=\"" + entity
                + "Search.xlsx\" th:text=\"#{common.xlsx}\" class=\"output\" tabindex=\"-1\">xlsx</a>");
        if (!tableInfo.isHistory() && !tableInfo.isView()) {
            s.add("        <button id=\"Delete" + entity + "S\" class=\"delete selectRows\" data-action=\"" + entity
                    + "SDelete.ajax\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
            s.add("        <button id=\"Permit" + entity + "S\" class=\"permit selectRows\" data-action=\"" + entity
                    + "SPermit.ajax\" th:text=\"#{common.permit}\" tabindex=\"-1\">承認</button>");
            s.add("        <button id=\"Forbid" + entity + "S\" class=\"forbid selectRows\" data-action=\"" + entity
                    + "SForbid.ajax\" th:text=\"#{common.forbid}\" tabindex=\"-1\">否認</button>");
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        if (!tableInfo.isHistory() && !tableInfo.isView()) {
            //履歴モデルは変更不可
            s.add("        <button id=\"Regist" + entity
                    + "S\" class=\"regist\" th:text=\"#{common.regist}\">submit</button>");
        }
        s.add("      </div>");
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");

        FileUtil.writeFile(htmlDir + File.separator + index + ".html", s);
    }

    /**
     * 検索画面 グリッド定義出力
     * @param gridDir グリッド出力ディレクトリ
     * @param tableInfo テーブル情報
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

        Map<String, ColumnInfo> columnMap = tableInfo.getColumnInfos();

        //主キー列の出力
        for (String columnName : tableInfo.getPrimaryKeys()) {
            String gridColumn = htmlGridColumn(columnMap.get(columnName), entityName, columnMap, tableInfo.isHistory(),
                    tableInfo.isView());
            if (gridColumn != null) {
                s.add("    " + gridColumn);
            }
        }

        //非主キー列の出力
        for (String columnName : tableInfo.getNonPrimaryKeys()) {

            //VIEWなら「SEARCH_」を出力しない
            if (tableInfo.isView() && StringUtil.startsWith(searchPrefixes, columnName)) {
                continue;
            }

            //カラム名が「ENTITY_NAME」なら出力しない
            if (columnName.matches("(?i)^" + detailColumn + "$")) {
                continue;
            }

            String gridColumn = htmlGridColumn(columnMap.get(columnName), entityName, columnMap, tableInfo.isHistory(),
                    tableInfo.isView());
            if (gridColumn != null) {
                s.add("    " + gridColumn);
            }
        }

        s.add("];");

        FileUtil.writeFile(gridDir + File.separator + entityName + "GridColumns.js", s);
    }

    /**
     * 詳細画面 HTML出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param tableInfo テーブル情報
     */
    private static void htmlDetail(final String htmlDir, final TableInfo tableInfo) {

        String entity = StringUtil.toPascalCase(tableInfo.getTableName());
        String formName = entity + "RegistForm";
        String action = entity + "Regist.ajax";
        String remarks = tableInfo.getRemarks();

        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\" layout:decorate=\"~{common/base}\">");
        s.add("<head>");
        s.add("<meta charset=\"UTF-8\">");
        s.add("<title th:text=\"#{" + entity + ".title}\">" + remarks + "</title>");
        s.add("<style type=\"text/css\">");
        s.add("</style>");
        s.add("<script type=\"text/javascript\">");
        s.add("");
        s.add("</script>");
        s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
        Set<TableInfo> added = new HashSet<TableInfo>();
        added.add(tableInfo);
        htmlNestGrid(tableInfo, s, added);
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + entity + ".h2}\">h2</h2>");
        s.add("    <form name=\"" + formName + "\" action=\"" + action + "\" class=\"regist\">");
        s.add("      <fieldset>");
        s.add("        <legend th:text=\"#{" + entity + ".legend}\">legend</legend>");
        htmlFields(tableInfo, s, true, false);
        s.add("      </fieldset>");

        // 兄弟モデル
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
            String child = StringUtil.toPascalCase(childInfo.getTableName());
            s.add("      <h3 th:text=\"#{" + child + ".h3}\">h3</h3>");
            s.add("      <a th:href=\"@{/model/" + child + ".html}\" id=\"" + child
                    + "\" target=\"dialog\" th:text=\"#{" + child + ".add}\" class=\"addChild\" tabindex=\"-1\">"
                    + childInfo.getRemarks() + "</a>");

            // ファイル列がある場合は新規行を取消
            String addRow = " data-addRow=\"true\"";
            for (ColumnInfo columnInfo : childInfo.getColumnInfos().values()) {
                if (StringUtil.endsWith(inputFileSuffixs, columnInfo.getColumnName())) {
                    addRow = "";
                    break;
                }
            }

            // 最終キーが採番キーでなければ新規行を取消
            int size = childInfo.getPrimaryKeys().size();
            if (size > 0) {
                String lastKey = childInfo.getPrimaryKeys().get(size - 1);
                ColumnInfo lastKeyInfo = childInfo.getColumnInfos().get(lastKey);
                if (!lastKeyInfo.isNumbering()) {
                    addRow = "";
                }
            }

            String frozen = String.valueOf(tableInfo.getPrimaryKeys().size());
            s.add("      <div id=\"" + child + "Grid\" data-selectionMode=\"link\"" + addRow + " data-frozenColumn=\""
                    + frozen + "\" th:data-href=\"@{/model/" + child + ".html}\"></div>");
        }

        s.add("      <div class=\"buttons\">");
        if (!tableInfo.isHistory() && !tableInfo.isView()) {
            s.add("        <button type=\"button\" id=\"Reset" + entity
                    + "\" th:text=\"#{common.reset}\" class=\"reset\" onClick=\"Dialogate.refresh(event);\">reset</button>");
        }
        s.add("        <a th:href=\"@{" + entity + "Get.xlsx(baseMei=#{" + entity + ".h2})}\" id=\""
                + entity + "Get.xlsx\" th:text=\"#{common.xlsx}\" class=\"output\" tabindex=\"-1\">xlsx</a>");
        if (tableInfo.getRebornInfo() != null) {
            TableInfo rebornInfo = tableInfo.getRebornInfo();
            String reborn = StringUtil.toPascalCase(rebornInfo.getTableName());
            s.add("        <a th:href=\"@{/model/" + reborn + ".html}\" id=\"" + reborn
                    + "\" target=\"dialog\" th:text=\"#{" + reborn + ".add}\" class=\"reborn\" tabindex=\"-1\">"
                    + rebornInfo.getRemarks() + "</a>");
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        if (!tableInfo.isHistory() && !tableInfo.isView()) {
            s.add("        <button id=\"Delete" + entity + "\" class=\"delete\" data-action=\"" + entity
                    + "Delete.ajax\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
            s.add("        <button id=\"Permit" + entity + "\" class=\"permit\" data-action=\"" + entity
                    + "Permit.ajax\" th:text=\"#{common.permit}\" tabindex=\"-1\">承認</button>");
            s.add("        <button id=\"Forbid" + entity + "\" class=\"forbid\" data-action=\"" + entity
                    + "Forbid.ajax\" th:text=\"#{common.forbid}\" tabindex=\"-1\">否認</button>");
            s.add("        <button id=\"Regist" + entity
                    + "\" class=\"regist\" th:text=\"#{common.regist}\">登録</button>");
        }
        s.add("      </div>");
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");

        FileUtil.writeFile(htmlDir + File.separator + entity + ".html", s);
    }

    /**
     * 各モデルのプロパティファイル出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param tableInfo テーブル情報
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
        if (tableInfo.getRebornInfo() != null) {
            TableInfo childInfo = tableInfo.getRebornInfo();
            String childName = childInfo.getTableName();
            String pascal = StringUtil.toPascalCase(childName);
            String childMei = childInfo.getRemarks();
            s.add("");
            s.add(pascal + ".add " + childMei + "追加");
        }

        FileUtil.writeFile(htmlDir + File.separator + entityName + ".properties", s);
    }

    /**
     * navファイル出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param tableInfos テーブル情報のリスト
     */
    private static void htmlNav(final String htmlDir, final List<TableInfo> tableInfos) {

        // プレフィクス毎にグループ化
        Map<String, List<TableInfo>> navs = new LinkedHashMap<String, List<TableInfo>>();
        for (TableInfo tableInfo : tableInfos) {
            // 親モデルがあればスキップ
            if (tableInfo.getParentInfos().size() > 0) {
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
        s.add("  <div class=\"nav\" layout:fragment=\"nav\" th:if=\"${#ctx.session != null && #ctx.session.get('AUTHN_KEY') != null}\">");
        s.add("    <dl>");
        for (Entry<String, List<TableInfo>> nav : navs.entrySet()) {
            String t = nav.getKey();
            s.add("      <dt id=\"" + t + "\" th:text=\"#{nav.dt." + t + "}\">" + t + "</dt>");
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

        String sep = File.separator;
        FileUtil.writeFile(htmlDir + sep + ".." + sep + "common" + sep + "nav.html", s);

        s = new ArrayList<String>();
        for (Entry<String, List<TableInfo>> nav : navs.entrySet()) {
            String t = nav.getKey();
            s.add("nav.dt." + t + " " + t);

            List<TableInfo> navInfos = nav.getValue();
            for (TableInfo tableInfo : navInfos) {
                String tableName = tableInfo.getTableName();
                String remarks = tableInfo.getRemarks();
                String pascal = StringUtil.toPascalCase(tableName);
                String pageName = pascal + "S";
                s.add("nav." + pageName + " " + remarks);
            }
        }

        FileUtil.writeFile(htmlDir + sep + ".." + sep + "common" + sep + "nav.properties", s);
    }

    /**
     * ネストした兄弟モデル・子モデル・参照モデルのgrid定義出力
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     * @param added 出力済みテーブル情報のリスト
     */
    private static void htmlNestGrid(final TableInfo tableInfo, final List<String> s, final Set<TableInfo> added) {

        //参照モデル
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

        //兄弟モデルの参照モデル
        for (TableInfo brosInfo : tableInfo.getBrosInfos()) {

            for (ColumnInfo columnInfo : brosInfo.getColumnInfos().values()) {

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

        //子モデル
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

        //転生モデル
        TableInfo reborn = tableInfo.getRebornInfo();
        if (reborn != null) {
            htmlNestGrid(reborn, s, added);
        }
    }

    /**
     * @param columnInfo
     * @param entityName
     * @param columnMap
     * @param isHistory
     * @param isView
     * @return 列定義文字列
     */
    private static String htmlGridColumn(final ColumnInfo columnInfo, final String entityName,
            final Map<String, ColumnInfo> columnMap, final boolean isHistory, final boolean isView) {

        String columnName = columnInfo.getColumnName();
        String camel = StringUtil.toCamelCase(columnName);
        String name = "Messages['" + entityName + "Grid." + camel + "']";
        String field = columnName;

        int width = columnInfo.getColumnSize() * COLUMN_WIDTH_PX_MULTIPLIER;
        if (columnInfo.getMaxLength() != null) {
            width = columnInfo.getMaxLength() * COLUMN_WIDTH_PX_MULTIPLIER;
        }
        if (width < 30) {
            width = 30;
        } else if (width > 300) {
            width = 300;
        }

        boolean isInsertDt = columnName.matches("(?i)^" + insertDt + "$");
        boolean isUpdateDt = columnName.matches("(?i)^" + updateDt + "$");
        boolean isInsertBy = columnName.matches("(?i)^" + insertBy + "$");
        boolean isUpdateBy = columnName.matches("(?i)^" + updateBy + "$");
        if (isInsertDt /*|| isUpdateDt*/ || isInsertBy || isUpdateBy) {
            return null;
        }

        String css = "";
        if (!isView) {
            if (columnInfo.isPk()) {
                css = "primaryKey";
                if (columnInfo.isNumbering()) {
                    css += " numbering";
                }
            } else if (columnInfo.isUnique()) {
                css = "uniqueKey";
            } else if (isInsertDt || isUpdateDt || isInsertBy || isUpdateBy) {
                css = "metaInfo";
            } else if (columnInfo.getNullable() == 0) {
                css = "notblank";
            }
        }

        String formatter = "null";
        if (columnInfo.getDataType().equals("java.time.LocalDate")) {
            formatter = "Slick.Formatters.Extends.Date";
        } else if (StringUtil.endsWith(inputTimestampSuffixs, columnInfo.getColumnName())) {
            formatter = "Slick.Formatters.Extends.Timestamp";
        } else if (columnInfo.getDataType().equals("java.time.LocalDateTime")) {
            formatter = "Slick.Formatters.Extends.DateTime";
        }

        // 名称を参照先から取得するか
        boolean isMeiRefer = false;
        // 参照名の列名
        String referMei = null;
        // 参照テーブルが設定されている場合
        TableInfo referInfo = columnInfo.getReferInfo();
        if (referInfo != null) {
            isMeiRefer = true;
            // カラム名が組み合わせキーのいずれかに合致する場合
            if (StringUtil.endsWith(referPairs, columnName)) {
                // 参照設定の組み合わせでループ
                for (String[] suffix : referPairs) {
                    String keySuffix = suffix[0];
                    String meiSuffix = suffix[1];
                    // カラム名がキー接尾辞に合致する場合
                    if (columnName.matches("(?i).+" + keySuffix + "$")) {
                        // カラム名の末尾を名称列サフィックスに変換
                        String tempMei = columnName.replaceAll("(?i)" + keySuffix + "$", meiSuffix);
                        // 名称列がテーブルに含まれていない場合は参照先から名称を取得する
                        if (columnMap.containsKey(tempMei)) {
                            referMei = tempMei;
                            isMeiRefer = false;
                            break;
                        }
                    }
                }
            }
            //名称を参照先から取得する場合
            if (isMeiRefer) {
                // 参照設定の組み合わせでループ
                for (String[] suffix : referPairs) {
                    String keySuffix = suffix[0];
                    String meiSuffix = suffix[1];
                    // カラム名がキー接尾辞に合致する場合
                    if (columnName.matches("(?i).+" + keySuffix + "$")) {
                        // カラム名の末尾を名称列サフィックスに変換
                        String tempMei = columnName.replaceAll("(?i)" + keySuffix + "$", meiSuffix).toUpperCase();
                        // 名称列が参照先テーブルに含まれている場合は、取得する名称を決定する
                        for (ColumnInfo referColumnInfo : referInfo.getColumnInfos().values()) {
                            if (tempMei.matches("(?i).*" + referColumnInfo.getColumnName() + "$")) {
                                referMei = tempMei;
                                break;
                            }
                        }
                        if (referMei != null) {
                            break;
                        }
                    }
                }
            }
        }

        String opt = "{ json: '" + json + "', paramkey: '" + optK + "', value: '" + optV + "', label: '" + optL + "' }";
        String c = "";
        if (isMeiRefer) {
            c = "Column.refer('" + field + "', " + name + ", " + width + ", '" + css + "', '" + referMei + "'),";
        } else if (isInsertDt || isUpdateDt || isInsertBy || isUpdateBy || isHistory || isView
                || columnInfo.isReborn()) {
            c = "Column.cell('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
        } else if (StringUtil.endsWith(inputFlagSuffixs, columnName)) {
            c = "Column.check('" + field + "', " + name + ", " + width + ", '" + css + "'),";
        } else if (StringUtil.endsWith(inputDateSuffixs, columnName)) {
            c = "Column.date('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
        } else if (StringUtil.endsWith(inputDate8Suffixs, columnName) && columnInfo.getColumnSize() == 8) {
            c = "Column.date8('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
        } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnName)) {
            c = "Column.dateTime('" + field + "', " + name + ", " + width + ", '" + css + "'),";
        } else if (StringUtil.endsWith(inputYMSuffixs, columnName)) {
            c = "Column.month('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
        } else if (StringUtil.endsWith(inputTimeSuffixs, columnName)) {
            c = "Column.time('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
        } else if (StringUtil.endsWith(inputFileSuffixs, columnName)) {
            c = "Column.link('" + field + "', " + name + ", " + width + ", '" + css + "'),";
        } else if (StringUtil.endsWith(optionsSuffixs, columnName)) {
            c = "Column.select('" + field + "', " + name + ", " + width + ", '" + css + "', " + opt + "),";
        } else if (StringUtil.endsWith(textareaSuffixs, columnName)) {
            c = "Column.longText('" + field + "', " + name + ", " + width + ", '" + css + "', " + formatter + "),";
        } else if ((columnInfo.getTypeName().equals("INT") || columnInfo.getTypeName().equals("DECIMAL")
                || columnInfo.getTypeName().equals("DOUBLE") || columnInfo.getTypeName().equals("NUMBER")
                || columnInfo.getTypeName().equals("NUMERIC"))
                && !StringUtil.endsWith(intNoFormatSuffixs, columnInfo.getColumnName())) {

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

        return c;
    }

    /**
     * htmlにフィールド追加
     * @param tableInfo テーブル情報
     * @param s 出力文字列のリスト
     * @param isDetail 詳細画面ならtrue
     * @param isBrother 兄弟モデルならtrue
     */
    private static void htmlFields(final TableInfo tableInfo, final List<String> s, final boolean isDetail,
            final boolean isBrother) {

        //エンティティ名を取得
        String entity = StringUtil.toPascalCase(tableInfo.getTableName());

        // カラム情報でループ
        for (ColumnInfo column : tableInfo.getColumnInfos().values()) {

            // 兄弟モデルの主キーは出力しない
            if (isBrother && column.isPk()) {
                continue;
            }

            String columnName = column.getColumnName();

            if (tableInfo.isView() && !isDetail && !StringUtil.startsWith(searchPrefixes, columnName)) {
                //VIEWの検索フォームには「SEARCH_」以外を出力しない
                continue;
            }
            if (tableInfo.isView() && isDetail && StringUtil.startsWith(searchPrefixes, columnName)) {
                //VIEWの詳細フォームには「SEARCH_」を出力しない
                continue;
            }
            if (!isDetail && StringUtil.endsWith(inputFileSuffixs, columnName)) {
                // 検索条件にはファイル項目を出力しない
                continue;
            }

            String property = StringUtil.toCamelCase(columnName);
            String fieldId = entity + "." + property;

            // メタ情報の場合（検索画面の場合はスキップ（検索条件にはしない）、詳細画面の兄弟モデルは更新日時のみhiddenで出力）
            boolean isInsertDt = columnName.matches("(?i)^" + insertDt + "$");
            boolean isUpdateDt = columnName.matches("(?i)^" + updateDt + "$");
            boolean isInsertBy = columnName.matches("(?i)^" + insertBy + "$");
            boolean isUpdateBy = columnName.matches("(?i)^" + updateBy + "$");
            if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy) {
                if (!isDetail) {
                    //検索画面ならスキップ
                    continue;
                }
                if (isBrother) {
                    //兄弟モデルならスキップ（更新日時のみ楽観ロック用に出力）
                    if (isUpdateDt) {
                        s.add("        <input type=\"hidden\" name=\"" + fieldId + "\" />");
                    }
                    continue;
                }
            }

            String remarks = column.getRemarks();

            s.add("        <div id=\"" + property + "\">");
            if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy) {
                // メタ情報の場合は表示項目（編集画面の自モデルのみここに到達する）
                htmlFieldsMeta(s, fieldId, remarks);

            } else if (isDetail && (tableInfo.isHistory() || tableInfo.isView() || column.isReborn())) {
                // 履歴モデルかビューの詳細画面
                htmlFieldsSpan(s, fieldId, remarks);

            } else if (isDetail && column.isNumbering()) {
                // 編集画面の採番キーは表示項目
                String tag = "          ";
                tag += "<label th:text=\"#{" + fieldId + "}\">" + remarks + "</label>";
                tag += "<span id=\"" + fieldId + "\" class=\"primaryKey\"></span>";
                tag += "<input type=\"hidden\" id=\"" + fieldId + "\" name=\"" + fieldId + "\" class=\"primaryKey\" />";
                // 参照モデルの場合は参照リンクを出力（参照リンクは照会画面ではjsで非表示にする）
                if (column.getReferInfo() != null) {
                    TableInfo refer = column.getReferInfo();
                    //                    String referName = StringUtil.toPascalCase(refer.getTableName());
                    //                    tag += "<a id=\"" + fieldId + "\" th:href=\"@{/model/" + referName + "S.html?action=" + referName
                    //                            + "Correct.ajax}\" target=\"dialog\" class=\"primaryKey refer\" th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>";
                    // 名称項目がなければspanも出力
                    String meiColumnName = getMeiColumnName(columnName, refer);
                    if (!tableInfo.getColumnInfos().containsKey(meiColumnName)) {
                        String meiId = entity + "." + StringUtil.toCamelCase(meiColumnName);
                        String referDef = getReferDef(entity, columnName, refer);
                        tag += "<span id=\"" + meiId + "\" class=\"refer\"" + referDef + "></span>";
                    }
                }
                s.add(tag);

            } else if (StringUtil.endsWith(optionsSuffixs, columnName) && column.getReferInfo() == null) {
                // 選択項目の場合（サフィックスが合致しても参照モデルなら除外）
                boolean isPrimaryKey = isDetail && column.isPk();
                htmlFieldsOptions(s, fieldId, columnName, remarks, isPrimaryKey);
            } else if (isDetail && StringUtil.endsWith(textareaSuffixs, columnName)) {
                // テキストエリア項目の場合
                htmlFieldsTextarea(s, fieldId, remarks);
            } else {
                // 上記以外の場合
                String type = "text";
                String format = "";
                if (StringUtil.endsWith(inputDateSuffixs, columnName)) { // 日付項目
                    //type = "date";
                    format = "";
                } else if (StringUtil.endsWith(inputDate8Suffixs, columnName) && column.getColumnSize() == 8) { // 8桁日付項目
                    //type = "date";
                    format = "yymmdd";
                } else if (StringUtil.endsWith(inputDateTimeSuffixs, columnName)) { // 日時項目
                    type = "datetime-local";
                } else if (StringUtil.endsWith(inputYMSuffixs, columnName)) { // 年月項目
                    type = "month";
                } else if (StringUtil.endsWith(inputTimeSuffixs, columnName)) { // 時刻項目
                    type = "time";
                } else if (StringUtil.endsWith(inputFileSuffixs, columnName)) { // ファイル
                    type = "file";
                }
                String css = "";
                String referCss = "refer";
                if (isDetail && column.isPk()) {
                    //詳細画面の主キー
                    css = " primaryKey";
                    referCss += " primaryKey";
                } else if (isDetail && column.isUnique()) {
                    //詳細画面のユニークキー
                    css = " uniqueKey";
                    referCss += " uniqueKey";
                } else if (isDetail && column.getReferInfo() != null) {
                    //詳細画面の参照キー
                    css = " correct";
                    referCss += " correct";
                }
                if (StringUtil.endsWith(inputDateSuffixs, columnName)) { // 日付項目
                    css += " datepicker";
                } else if (StringUtil.endsWith(inputDate8Suffixs, columnName) && column.getColumnSize() == 8) { // 8桁日付項目
                    css += " datepicker";
                }
                if (isDetail && column.getNullable() == 0) {
                    css += " notblank";
                }
                if (!StringUtil.isNullOrBlank(css)) {
                    css = " class=\"" + css + "\"";
                }
                referCss = " class=\"" + referCss + "\"";
                if (!isDetail && StringUtil.endsWith(inputRangeSuffixs, columnName)) {
                    // 検索画面の範囲指定項目の場合
                    s.add(htmlFieldsRange(fieldId, type, css, column, format));
                } else if (column.getReferInfo() != null) {
                    // 参照モデルの場合
                    s.add(htmlFieldsRefer(fieldId, type, css, column, format, tableInfo, referCss));
                } else {
                    s.add(htmlFieldsInput(fieldId, type, css, column, format));
                }
            }
            s.add("        </div>");
        }
    }

    /**
     * referタグ出力
     * @param fieldId    入力項目のID
     * @param type       タイプ
     * @param css        スタイル
     * @param column
     * @param format     フォーマット
     * @param tableInfo
     * @param referCss
     * @return referタグ
     */
    private static String htmlFieldsRefer(final String fieldId, final String type, final String css,
            final ColumnInfo column, final String format, final TableInfo tableInfo, final String referCss) {

        String dataFormat = "";
        if (!StringUtil.isNullOrBlank(format)) {
            dataFormat = " data-format=\"" + format + "\"";
        }

        String tableName = tableInfo.getTableName();
        String pascalTable = StringUtil.toPascalCase(tableName);
        String columnName = column.getColumnName();
        String remarks = column.getRemarks();
        int max = column.getColumnSize();

        String tag = "          ";
        tag += "<label for=\"" + fieldId + "\" th:text=\"#{" + fieldId + "}\">" + remarks + "</label>";

        TableInfo referInfo = column.getReferInfo();
        String referName = StringUtil.toPascalCase(referInfo.getTableName());
        String referDef = getReferDef(pascalTable, columnName, referInfo);
        tag += "<input type=\"" + type + "\" id=\"" + fieldId + "\" name=\"" + fieldId + "\" maxlength=\"" + max + "\""
                + css + referDef + dataFormat + " />";

        if (referCss.contains("correct")) {
            //選択リンク
            tag += "<a id=\"" + fieldId + "\" th:href=\"@{/model/" + referName + "S.html?action=" + referName
                    + "Correct.ajax}\" target=\"dialog\"" + referCss
                    + " th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>";
        } else {
            //参照リンク
            tag += "<a id=\"" + fieldId + "\" th:href=\"@{/model/" + referName + "S.html}\" target=\"dialog\""
                    + referCss + " th:text=\"#{common.refer}\" tabindex=\"-1\">...</a>";
        }

        String meiColumnName = getMeiColumnName(columnName, referInfo);
        if (!tableInfo.getColumnInfos().containsKey(meiColumnName)) {
            String meiId = pascalTable + "." + StringUtil.toCamelCase(meiColumnName);
            tag += "<span id=\"" + meiId + "\"" + referCss + referDef + "></span>";
        }

        return tag;
    }

    /**
     * inputタグ出力
     * @param id         入力項目のID
     * @param type       タイプ
     * @param css        スタイル
     * @param columnInfo 列情報
     * @param format     フォーマット
     * @return タグ文字列
     */
    private static String htmlFieldsInput(final String id, final String type, final String css,
            final ColumnInfo columnInfo, final String format) {

        String dataFormat = "";
        if (!StringUtil.isNullOrBlank(format)) {
            dataFormat = " data-format=\"" + format + "\"";
        }

        String remarks = columnInfo.getRemarks();
        int max = columnInfo.getColumnSize();
        if (columnInfo.getMaxLength() != null) {
            max = columnInfo.getMaxLength();
        }

        String tag = "          ";
        tag += "<label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<input type=\"" + type + "\" id=\"" + id + "\" name=\"" + id + "\" maxlength=\"" + max + "\"" + css
                + dataFormat + " />";

        if (type.equals("file")) {
            tag += "<a id=\"" + id
                    + "\" target=\"blank\" style=\"display: none;\" th:text=\"#{common.download}\">ダウンロード</a>";
            tag += "<input type=\"hidden\" id=\"" + id + "\" name=\"" + id + "\" disabled />";
        }

        return tag;
    }

    /**
     * 範囲指定の入力項目出力
     * @param id         項目ID
     * @param type       タイプ
     * @param css        スタイル
     * @param columnInfo 列情報
     * @param format     フォーマット
     * @return タグ文字列
     */
    private static String htmlFieldsRange(final String id, final String type, final String css,
            final ColumnInfo columnInfo, final String format) {

        String dataFormat = "";
        if (!StringUtil.isNullOrBlank(format)) {
            dataFormat = " data-format=\"" + format + "\"";
        }

        String remarks = columnInfo.getRemarks();
        int max = columnInfo.getColumnSize();
        if (columnInfo.getMaxLength() != null) {
            max = columnInfo.getMaxLength();
        }

        String tag = "          ";
        tag += "<label for=\"" + id + "_1\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<input type=\"" + type + "\" id=\"" + id + "_1\" name=\"" + id + "_1\" maxlength=\"" + max + "\"" + css
                + dataFormat + " />";
        tag += "～";
        tag += "<input type=\"" + type + "\" id=\"" + id + "_2\" name=\"" + id + "_2\" maxlength=\"" + max + "\"" + css
                + dataFormat + " />";

        return tag;
    }

    /**
     * テキストエリア出力
     * @param s 出力文字列のリスト
     * @param id 項目ID
     * @param remarks コメント
     */
    private static void htmlFieldsTextarea(final List<String> s, final String id, final String remarks) {
        s.add("          <label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>");
        s.add("          <textarea id=\"" + id + "\" name=\"" + id + "\"></textarea>");
    }

    /**
     * 選択項目の出力
     * @param s 出力文字列のリスト
     * @param id 項目ID
     * @param columnName カラム名
     * @param remarks コメント
     * @param isPrimariKey 主キーならtrue
     */
    private static void htmlFieldsOptions(final List<String> s, final String id, final String columnName,
            final String remarks, final boolean isPrimariKey) {
        String primaryKey = " class=\"primaryKey\"";
        if (!isPrimariKey) {
            primaryKey = "";
        }
        s.add("          <fieldset id=\"" + id + "List\" data-options=\"" + json + "\" data-optionParams=\"" + optK
                + ":" + columnName + "\" data-optionValue=\"" + optV + "\" data-optionLabel=\"" + optL + "\""
                + primaryKey + ">");
        s.add("            <legend th:text=\"#{" + id + "}\">" + remarks + "</legend>");
        s.add("          </fieldset>");
    }

    /**
     * レコードメタ情報の出力
     * @param s 出力文字列のリスト
     * @param id 項目ID
     * @param remarks コメント
     */
    private static void htmlFieldsMeta(final List<String> s, final String id, final String remarks) {
        String tag = "          ";
        tag += "<label th:text=\"#{" + id + "}\" class=\"meta\">" + remarks + "</label>";
        tag += "<span id=\"" + id + "\"></span>";
        tag += "<input type=\"hidden\" id=\"" + id + "\" name=\"" + id + "\" />";
        s.add(tag);
    }

    /**
     * 表示項目の出力
     * @param s 出力文字列のリスト
     * @param id 項目ID
     * @param remarks コメント
     */
    private static void htmlFieldsSpan(final List<String> s, final String id, final String remarks) {
        String tag = "          ";
        tag += "<label th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<span id=\"" + id + "\"></span>";
        tag += "<input type=\"hidden\" id=\"" + id + "\" name=\"" + id + "\" />";
        s.add(tag);
    }

    /**
     * 参照定義の取得
     * @param entityName 参照元エンティティ名
     * @param columnName 参照元カラム名
     * @param referInfo 参照先エンティティ情報
     * @return 参照HTML文字列
     */
    private static String getReferDef(final String entityName, final String columnName, final TableInfo referInfo) {

        // カラム名が参照キーに合致する場合
        if (StringUtil.endsWith(referPairs, columnName)) {

            for (String[] e : referPairs) {
                String idSuffix = e[0];
                String meiSuffix = e[1];

                // カラム名が参照キーに合致しなければスキップ
                if (!columnName.matches("(?i)^.*" + idSuffix + "$")) {
                    continue;
                }

                // カラム名のIDサフィックスを名称サフィックスに置換して名称カラム名を取得
                String srcIdColumn = columnName;
                String srcMeiColumn = srcIdColumn.replaceAll("(?i)" + idSuffix + "$", meiSuffix);

                // 参照先テーブルの全カラム名を確認して、末尾が合致するカラム名を、参照先のID・名称カラム名として取得
                String destIdColumn = null;
                String destMeiColumn = null;
                for (String destColumnName : referInfo.getColumnInfos().keySet()) {
                    if (srcIdColumn.matches("(?i)^.*" + destColumnName + "$")) {
                        destIdColumn = destColumnName;
                    } else if (srcMeiColumn.matches("(?i)^.*" + destColumnName + "$")) {
                        destMeiColumn = destColumnName;
                    }
                    if (destIdColumn != null && destMeiColumn != null) {
                        break;
                    }
                }

                if (destIdColumn == null || destMeiColumn == null) {
                    continue;
                }

                String referName = StringUtil.toPascalCase(referInfo.getTableName());
                String srcIdName = entityName + "." + StringUtil.toCamelCase(srcIdColumn);
                String srcMeiName = entityName + "." + StringUtil.toCamelCase(srcMeiColumn);

                String dataJson = " data-json=\"" + referName + "Search.json\"";
                String srcDef = " data-srcDef=\"" + destIdColumn + ":" + srcIdName + "\"";
                String destDef = " data-destDef=\"" + srcMeiName + ":" + destMeiColumn + "\"";

                return dataJson + srcDef + destDef;
            }
        }

        return "";
    }

    /**
     * 参照IDカラム名に合致する、参照名称カラム名の取得
     * @param columnName カラム名
     * @param referInfo 参照テーブル情報
     * @return 名称カラム名
     */
    private static String getMeiColumnName(final String columnName, final TableInfo referInfo) {

        // カラム名が参照キーに合致する場合
        if (StringUtil.endsWith(referPairs, columnName)) {

            for (String[] e : referPairs) {
                String idSuffix = e[0];
                String meiSuffix = e[1];

                // カラム名が参照キーに合致しなければスキップ
                if (!columnName.matches("(?i)^.*" + idSuffix + "$")) {
                    continue;
                }

                // カラム名のIDサフィックスを名称サフィックスに置換して名称カラム名を取得
                String srcIdColumn = columnName;
                String srcMeiColumn = srcIdColumn.replaceAll("(?i)" + idSuffix + "$", meiSuffix);

                // 参照先テーブルの全カラム名を確認して、末尾が合致するカラム名を、参照先のID・名称カラム名として取得
                String destIdColumn = null;
                String destMeiColumn = null;
                for (String destColumnName : referInfo.getColumnInfos().keySet()) {
                    if (srcIdColumn.matches("(?i)^.*" + destColumnName + "$")) {
                        destIdColumn = destColumnName;
                    } else if (srcMeiColumn.matches("(?i)^.*" + destColumnName + "$")) {
                        destMeiColumn = destColumnName;
                    }
                }

                if (destIdColumn == null || destMeiColumn == null) {
                    continue;
                }

                return srcMeiColumn;
            }
        }

        return "";
    }

}
