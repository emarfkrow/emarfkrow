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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * HTMLファイル出力
 *
 * @author golorp
 */
public final class HtmlGenerator {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(HtmlGenerator.class);

    /** properties */
    private static ResourceBundle bundle = ResourceBundles.getBundle(BeanGenerator.class);

    /** グリッド列幅ピクセル乗数 */
    private static final int COLUMN_WIDTH_PX_MULTIPLIER = 8;

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** 登録日時カラム名 */
    private static String insertTs;
    /** 登録者カラム名 */
    private static String insertId;
    /** 更新日時カラム名 */
    private static String updateTs;
    /** 更新者カラム名 */
    private static String updateId;
    /** ステータス区分 */
    private static String status;
    /** 変更理由 */
    private static String reason;

    /** 数値列で自動採番しないサフィックス */
    private static String[] intNoFormatSuffixs;
    /** 必須CHAR列の指定 */
    private static String charNotNullRe;

    /** ページ行数 */
    private static String gridRows;

    /** VIEWの検索条件とするプレフィクス */
    private static String[] viewCriteriaPrefixs;
    /** VIEWの詳細画面にするテーブル名 */
    private static String viewDetail;

    /** 年月入力サフィックス */
    private static String[] inputYMSuffixs;
    /** 8桁日付入力サフィックス */
    private static String[] inputDate8Suffixs;
    /** タイムスタンプサフィックス */
    private static String[] inputTimestampSuffixs;
    /** 日時入力サフィックス */
    private static String[] inputDateTimeSuffixs;
    /** 日付入力サフィックス */
    private static String[] inputDateSuffixs;
    /** 時刻入力サフィックス */
    private static String[] inputTimeSuffixs;
    /** 範囲指定サフィックス */
    private static String[] inputRangeSuffixs;
    /** フラグサフィックス */
    private static String[] inputFlagSuffixs;
    /** ファイルサフィックス */
    private static String[] inputFileSuffixs;
    /** options項目サフィックス */
    private static String[] optionsSuffixs;
    /** pulldown項目サフィックス */
    private static String[] pulldownSuffixs;
    /** テキストエリア項目サフィックス */
    private static String[] textareaSuffixs;

    /** データjson */
    private static String json;
    /** 区分カラム */
    private static String optK;
    /** 区分値カラム */
    private static String optV;
    /** 区分値名カラム */
    private static String optL;

    /** プライベートコンストラクタ */
    private HtmlGenerator() {
    }

    /**
     * HTMLファイル出力
     * @param projectDir プロジェクトディレクトリ
     * @param tables テーブル情報のリスト
     */
    static void generate(final String projectDir, final List<TableInfo> tables) {

        String[] pairs = bundle.getString("relation.refer.pairs").split(",");
        for (String pair : pairs) {
            String[] kv = pair.split(":");
            referPairs.add(kv);
        }

        insertTs = bundle.getString("column.insert.timestamp");
        insertId = bundle.getString("column.insert.id");
        updateTs = bundle.getString("column.update.timestamp");
        updateId = bundle.getString("column.update.id");
        status = bundle.getString("column.status");
        reason = bundle.getString("column.history.reason");

        intNoFormatSuffixs = bundle.getString("column.int.noformat.suffixs").split(",");
        charNotNullRe = bundle.getString("column.char.notnull.re");

        gridRows = bundle.getString("grid.rows");

        viewCriteriaPrefixs = bundle.getString("view.criteria.prefix").split(",");
        viewDetail = bundle.getString("view.detail");

        inputYMSuffixs = bundle.getString("input.ym.suffixs").split(",");
        inputDate8Suffixs = bundle.getString("input.date8.suffixs").split(",");
        inputTimestampSuffixs = bundle.getString("input.timestamp.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("input.datetime.suffixs").split(",");
        inputDateSuffixs = bundle.getString("input.date.suffixs").split(",");
        inputTimeSuffixs = bundle.getString("input.time.suffixs").split(",");
        inputRangeSuffixs = bundle.getString("input.range.suffixs").split(",");
        inputFlagSuffixs = bundle.getString("input.flag.suffixs").split(",");
        inputFileSuffixs = bundle.getString("input.file.suffixs").split(",");
        optionsSuffixs = bundle.getString("input.options.suffixs").split(",");
        pulldownSuffixs = bundle.getString("input.pulldown.suffixs").split(",");
        textareaSuffixs = bundle.getString("input.textarea.suffixs").split(",");

        json = bundle.getString("options.json");
        optK = bundle.getString("options.key").toUpperCase();
        optV = bundle.getString("options.value").toUpperCase();
        optL = bundle.getString("options.label").toUpperCase();

        // 出力フォルダを再作成
        String htmlDir = projectDir + File.separator + bundle.getString("dir.html");
        FileUtil.reMkDir(htmlDir);
        FileUtil.reMkDir(htmlDir + File.separator + ".." + File.separator + "common");

        String gridDir = projectDir + File.separator + bundle.getString("dir.grid");
        FileUtil.reMkDir(gridDir);

        for (TableInfo table : tables) {

            // 検索画面のHTMLを出力
            HtmlGenerator.htmlIndex(htmlDir, table, tables);

            // 検索画面のGridColumnを出力
            HtmlGenerator.htmlGridColumns(gridDir, table);

            // 単画面を出力
            HtmlGenerator.htmlDetail(htmlDir, table, tables);

            // thymeleafのプロパティファイルを出力
            HtmlGenerator.htmlProperties(htmlDir, table, tables);
        }

        HtmlGenerator.htmlNav(htmlDir, tables);

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
     * @param table テーブル情報
     * @param tables テーブル情報
     */
    private static void htmlIndex(final String htmlDir, final TableInfo table, final List<TableInfo> tables) {
        String e = StringUtil.toPascalCase(table.getName());
        String remarks = table.getRemarks();
        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\" layout:decorate=\"~{common/base}\">");
        s.add("<head>");
        s.add("<meta charset=\"UTF-8\">");
        s.add("<title th:text=\"#{" + e + "S.title}\">" + remarks + "</title>");
        s.add("<style type=\"text/css\">");
        s.add("</style>");
        s.add("<script type=\"text/javascript\">");
        s.add("");
        s.add("</script>");
        s.add("<script th:src=\"@{/model/" + e + "GridColumns.js}\"></script>");
        Set<TableInfo> added = new HashSet<TableInfo>();
        added.add(table);
        htmlNestGrid(s, table, tables, added);
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + e + "S.h2}\">h2</h2>");
        s.add("    <!-- 検索フォーム -->");
        s.add("    <form name=\"" + e + "SearchForm\" action=\"" + e + "Search.ajax\" class=\"search\">");
        s.add("      <input type=\"hidden\" name=\"rows\" value=\"" + gridRows + "\" />");
        s.add("      <input type=\"hidden\" name=\"page\" value=\"0\" />");
        s.add("      <fieldset>");
        s.add("        <legend th:text=\"#{" + e + "S.legend}\">legend</legend>");
        htmlFields(table, s, false, false);
        s.add("      </fieldset>");
        s.add("      <div class=\"buttons\">");
        s.add("        <button type=\"reset\" id=\"Reset" + e
                + "\" th:text=\"#{common.reset}\" class=\"reset\">reset</button>");
        boolean isAnew = isAnew(table);
        if (isAnew) {
            s.add("        <a th:href=\"@{/model/" + e + ".html}\" target=\"dialog\" id=\"" + e
                    + "\" class=\"anew\" th:text=\"#{" + e + ".add}\" tabindex=\"-1\">" + remarks + "</a>");
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        s.add("        <button id=\"Search" + e + "\" type=\"submit\" class=\"search\" data-gridId=\"" + e
                + "Grid\" th:text=\"#{common.search}\">submit</button>");
        s.add("      </div>");
        s.add("    </form>");
        s.add("    <!-- 一覧フォーム -->");
        s.add("    <form name=\"" + e + "SRegistForm\" action=\"" + e + "SRegist.ajax\" class=\"regist\">");
        s.add("      <h3 th:text=\"#{" + e + ".h3}\">h3</h3>");
        String addRow = "";
        if (isAnew) {
            boolean isNotAddRow = false;
            for (ColumnInfo column : table.getColumnInfos().values()) {
                if (column.getName().matches("(?i)^" + insertId + "$")
                        || column.getName().matches("(?i)^" + updateId + "$")) {
                    continue; //メタ情報ならスキップ
                }
                if (StringUtil.endsWith(inputFileSuffixs, column.getName())) {
                    isNotAddRow = true; //ファイル列があれば新規行なし
                    break;
                }
            }
            if (!isNotAddRow && table.getChildInfos().size() == 0) {
                addRow = " data-addRow=\"true\"";
            }
        }
        int frozenColumn = table.getPrimaryKeys().size() - 1;
        String editable = "";
        if (table.isHistory() || table.isView() || table.getChildInfos().size() > 0) {
            editable = "data-editable=\"false\" ";
        }
        s.add("      <div id=\"" + e + "Grid\" data-selectionMode=\"checkbox\"" + addRow + " data-frozenColumn=\""
                + frozenColumn + "\" " + editable + "th:data-href=\"@{/model/" + e + ".html}\"></div>");
        s.add("      <div id=\"" + e + "Pager\"></div>");
        s.add("      <div class=\"buttons\">");
        if (!table.isHistory() && (!table.isView() || table.isConvView())) {
            s.add("        <button type=\"button\" id=\"Reset" + e
                    + "S\" th:text=\"#{common.reset}\" class=\"reset\" onClick=\"Base.listReset('" + e
                    + "');\">reset</button>");
        }
        s.add("        <a th:href=\"@{" + e + "Search.xlsx(baseMei=#{" + e + "S.h2})}\" id=\"" + e
                + "Search.xlsx\" th:text=\"#{common.xlsx}\" class=\"output\" tabindex=\"-1\">xlsx</a>");
        TableInfo summary = getSummary(table, tables); //集約先リンク
        if (summary != null) {
            String summaryEntity = StringUtil.toPascalCase(summary.getName());
            s.add("        <a th:href=\"@{/model/" + summaryEntity + ".html}\" id=\"" + summaryEntity
                    + "\" target=\"dialog\" th:text=\"#{" + summaryEntity
                    + ".sum}\" class=\"summary\" tabindex=\"-1\">" + summary.getRemarks() + "</a>");
        }
        if (!table.isHistory() && (!table.isView() || table.isConvView()) && table.getChildInfos().size() == 0) {
            for (ColumnInfo column : table.getColumnInfos().values()) {
                //グリッド用の非表示の参照ボタン
                if (column.getReferInfo() != null) {
                    String columnName = column.getName();
                    if (columnName.matches("(?i)^" + insertId + "$") || columnName.matches("(?i)^" + updateId + "$")) {
                        continue;
                    }
                    String property = StringUtil.toCamelCase(column.getName());
                    TableInfo refer = column.getReferInfo();
                    String referEntity = StringUtil.toPascalCase(refer.getName());
                    String action = "";
                    String css = "";
                    if (refer.getStintInfo() != null) {
                        action = "?action=" + referEntity + "Correct.ajax";
                        css = " correct";
                    }
                    s.add("        <a id=\"" + e + "Grid." + property + "\" th:href=\"@{/model/" + referEntity
                            + "S.html" + action + "}\" target=\"dialog\" class=\"refer" + css + "\" th:text=\"'"
                            + refer.getRemarks()
                            + "' + #{common.refer}\" tabindex=\"-1\" style=\"display: none;\">...</a>");
                }
            }
            if (!table.isView()) {
                s.add("        <button type=\"submit\" id=\"Delete" + e
                        + "S\" class=\"delete selectRows\" data-action=\"" + e
                        + "SDelete.ajax\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
                if (!StringUtil.isNullOrBlank(status) && (table.getColumnInfos().containsKey(status.toLowerCase())
                        || table.getColumnInfos().containsKey(status.toUpperCase()))) {
                    s.add("        <button type=\"submit\" id=\"Permit" + e
                            + "S\" class=\"permit selectRows\" data-action=\"" + e
                            + "SPermit.ajax\" th:text=\"#{common.permit}\" tabindex=\"-1\">承認</button>");
                    s.add("        <button type=\"submit\" id=\"Forbid" + e
                            + "S\" class=\"forbid selectRows\" data-action=\"" + e
                            + "SForbid.ajax\" th:text=\"#{common.forbid}\" tabindex=\"-1\">否認</button>");
                }
            }
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        if (!table.isHistory() && (!table.isView() || table.isConvView()) && table.getChildInfos().size() == 0) {
            String onclick = "";
            if (table.getHistoryInfo() != null && !StringUtil.isNullOrBlank(reason)) {
                onclick = " onclick=\"if (!Base.historyReason(this)) { return false; }\"";
            }
            s.add("        <button id=\"Regist" + e
                    + "S\" type=\"submit\" class=\"regist\" th:text=\"#{common.regist}\"" + onclick
                    + ">submit</button>");
        }
        s.add("      </div>");
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");
        FileUtil.writeFile(htmlDir + File.separator + e + "S.html", s);
    }

    /**
     * 履歴モデルでない かつ ビューでない かつ 転生元が必須でない<br>
     * 主キーが一つ か 組合せモデル か 主キーが２つ以上で全て採番キーでない
     * @param table
     * @return boolean
     */
    private static boolean isAnew(final TableInfo table) {

        // 転生元が必須か
        boolean isReborneeNotNull = false;
        for (ColumnInfo column : table.getColumnInfos().values()) {
            if ((column.isReborn() || column.isDerive()) && column.getNullable() != 1) {
                isReborneeNotNull = true;
                break;
            }
        }

        // 主キーが全て採番キーでないか
        boolean isAllNonNumberingKey = true;
        for (String pk : table.getPrimaryKeys()) {
            ColumnInfo primaryKey = table.getColumnInfos().get(pk);
            if (primaryKey.isNumbering()) {
                isAllNonNumberingKey = false;
                break;
            }
        }

        return !table.isHistory() && !table.isView() && !isReborneeNotNull
                && (table.getPrimaryKeys().size() == 1 || table.getComboInfos().size() > 1 || isAllNonNumberingKey);
    }

    /**
     * @param table
     * @param tables
     * @return TableInfo
     */
    private static TableInfo getSummary(final TableInfo table, final List<TableInfo> tables) {

        //自モデルが転生先となる、別モデルを抽出
        List<TableInfo> summarys = new ArrayList<TableInfo>();
        for (TableInfo summary : tables) {
            if (summary.getSummaryOf() != null) {
                if (table.getName().equals(summary.getSummaryOf().getName())) {
                    summarys.add(summary);
                }
            }
        }

        //抽出した転生元モデルが１つだった場合は集約用のリンク追加
        TableInfo summary = null;
        if (summarys.size() == 1) {
            summary = summarys.get(0);
        }

        return summary;
    }

    /**
     * 検索画面 グリッド定義出力
     * @param gridDir グリッド出力ディレクトリ
     * @param table テーブル情報
     */
    private static void htmlGridColumns(final String gridDir, final TableInfo table) {

        String entity = StringUtil.toPascalCase(table.getName());

        List<String> s = new ArrayList<String>();
        s.add("/**");
        s.add(" * " + table.getRemarks() + "グリッド定義");
        s.add(" */");
        s.add("");
        //grid列名が取れない事があるのでonloadまで遅らせる
        s.add("let " + entity + "GridColumns = [];");
        s.add("");
        s.add("$(function() {");
        s.add("    " + entity + "GridColumns = [");

        //主キー列の出力
        for (String pk : table.getPrimaryKeys()) {
            ColumnInfo primaryKey = table.getColumnInfos().get(pk);
            String gridColumn = htmlGridColumn(table, primaryKey);
            if (gridColumn != null) {
                s.add("        " + gridColumn);
            }
        }

        //非主キー列の出力
        for (String columnName : table.getNonPrimaryKeys()) {

            //VIEWなら「SEARCH_」を出力しない
            if (table.isView() && StringUtil.startsWith(viewCriteriaPrefixs, columnName)) {
                continue;
            }

            //カラム名が「TABLE_NAME」なら出力しない
            if (columnName.matches("(?i)^" + viewDetail + "$")) {
                continue;
            }

            ColumnInfo column = table.getColumnInfos().get(columnName);
            String gridColumn = htmlGridColumn(table, column);
            if (gridColumn != null) {
                s.add("        " + gridColumn);
            }
        }

        s.add("    ];");
        s.add("});");

        FileUtil.writeFile(gridDir + File.separator + entity + "GridColumns.js", s);
    }

    /**
     * 詳細画面 HTML出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param table テーブル情報
     * @param tables
     */
    private static void htmlDetail(final String htmlDir, final TableInfo table, final List<TableInfo> tables) {
        String entity = StringUtil.toPascalCase(table.getName());
        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\" layout:decorate=\"~{common/base}\">");
        s.add("<head>");
        s.add("<meta charset=\"UTF-8\">");
        s.add("<title th:text=\"#{" + entity + ".title}\">" + table.getRemarks() + "</title>");
        s.add("<style type=\"text/css\">");
        s.add("</style>");
        s.add("<script type=\"text/javascript\">");
        s.add("");
        s.add("</script>");
        s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
        Set<TableInfo> added = new HashSet<TableInfo>();
        added.add(table);
        htmlNestGrid(s, table, tables, added);
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + entity + ".h2}\">h2</h2>");
        s.add("    <form name=\"" + entity + "RegistForm\" action=\"" + entity + "Regist.ajax\" class=\"regist\">");
        for (TableInfo parent : table.getParentInfos()) { // 親モデル
            String e = StringUtil.toPascalCase(parent.getName());
            s.add("      <fieldset class=\"parent\">");
            s.add("        <legend th:text=\"#{" + e + ".legend}\">legend</legend>");
            htmlFields(parent, s, true, false);
            s.add("      </fieldset>");
        }
        String css = "";
        if (table.isView()) {
            css = " class=\"view\"";
        }
        s.add("      <fieldset" + css + ">");
        s.add("        <legend th:text=\"#{" + entity + ".legend}\">legend</legend>");
        htmlFields(table, s, true, false);
        s.add("      </fieldset>");
        List<TableInfo> bros = table.getBrosInfos(); // 兄弟モデル
        if (bros != null) {
            for (TableInfo bro : bros) {
                String e = StringUtil.toPascalCase(bro.getName());
                s.add("      <fieldset>");
                s.add("        <legend th:text=\"#{" + e + ".legend}\">legend</legend>");
                htmlFields(bro, s, true, true);
                s.add("      </fieldset>");
            }
        }
        //子テーブルリスト
        for (TableInfo child : table.getChildInfos()) {
            String e = StringUtil.toPascalCase(child.getName());
            s.add("      <h3 th:text=\"#{" + e + ".h3}\">h3</h3>");
            s.add("      <a th:href=\"@{/model/" + e + ".html}\" id=\"" + e + "\" target=\"dialog\" th:text=\"#{" + e
                    + ".add}\" class=\"addChild\" tabindex=\"-1\">" + child.getRemarks() + "</a>");

            // ファイル列がある場合は新規行を取消
            String addRow = " data-addRow=\"true\"";
            for (ColumnInfo column : child.getColumnInfos().values()) {
                if (StringUtil.endsWith(inputFileSuffixs, column.getName())) {
                    addRow = "";
                    break;
                }
            }

            String frozen = String.valueOf(table.getPrimaryKeys().size());
            s.add("      <div id=\"" + e + "Grid\" data-selectionMode=\"link\"" + addRow + " data-frozenColumn=\""
                    + frozen + "\" th:data-href=\"@{/model/" + e + ".html}\"></div>");
            for (ColumnInfo column : child.getColumnInfos().values()) {
                if (column.getReferInfo() != null) {
                    String columnName = column.getName();
                    if (columnName.matches("(?i)^" + insertId + "$") || columnName.matches("(?i)^" + updateId + "$")) {
                        continue;
                    }
                    String p = StringUtil.toCamelCase(column.getName());
                    TableInfo refer = column.getReferInfo();
                    String referE = StringUtil.toPascalCase(refer.getName());
                    String action = "";
                    String childCss = "";
                    if (refer.getStintInfo() != null) {
                        action = "?action=" + referE + "Correct.ajax";
                        childCss = " correct";
                    }
                    s.add("        <a id=\"" + e + "Grid." + p + "\" th:href=\"@{/model/" + referE + "S.html" + action
                            + "}\" target=\"dialog\" class=\"refer" + childCss + "\" th:text=\"'" + refer.getRemarks()
                            + "' + #{common.refer}\" tabindex=\"-1\" style=\"display: none;\">...</a>");
                }
            }
        }
        s.add("      <div class=\"buttons\">");
        if (!table.isHistory() && !table.isView()) {
            s.add("        <button type=\"button\" id=\"Refresh" + entity
                    + "\" th:text=\"#{common.reset}\" class=\"reset\" onClick=\"Dialogate.refresh(event);\">reset</button>");
        }
        s.add("        <a th:href=\"@{" + entity + "Get.xlsx(baseMei=#{" + entity + ".h2})}\" id=\""
                + entity + "Get.xlsx\" th:text=\"#{common.xlsx}\" class=\"output\" tabindex=\"-1\">xlsx</a>");
        // 転生先がある場合は追加ボタンを出力
        if (table.getRebornTo() != null) {
            TableInfo reborn = table.getRebornTo();
            String e = StringUtil.toPascalCase(reborn.getName());
            s.add("        <a th:href=\"@{/model/" + e + ".html}\" id=\"" + e + "\" target=\"dialog\" th:text=\"#{" + e
                    + ".add}\" class=\"reborner\" tabindex=\"-1\">" + reborn.getRemarks() + "</a>");
        }
        // 集約元がある場合は主キー項目を出力
        if (table.getSummaryOf() != null) {
            TableInfo summary = table.getSummaryOf();
            String e = StringUtil.toPascalCase(summary.getName());
            // 転生先で必須でない場合でも、自モデルが他の転生先である場合は転生元となるよう変更したので、ここはコメントアウト
            //            if (table.getRebornTo() == null) {
            //                // 転生先（自主キーが必須の外部キーになっている）がなければ追加ボタンを出力
            //                // 転生先で必須でないケース
            //                s.add("        <a th:href=\"@{/model/" + e + ".html}\" id=\"" + e + "\" target=\"dialog\" th:text=\"#{"
            //                        + e + ".add}\" class=\"reborner\" tabindex=\"-1\">" + summary.getRemarks() + "</a>");
            //            }
            for (String pk : summary.getPrimaryKeys()) {
                ColumnInfo primaryKey = summary.getColumnInfos().get(pk);
                String p = StringUtil.toCamelCase(pk);
                s.add("        <div>");
                s.add("          <label>" + primaryKey.getRemarks() + "</label>");
                s.add("          <span id=\"" + e + "." + p + "\"></span>");
                s.add("          <input type=\"hidden\" id=\"" + e + "." + p + "\" name=\"" + e + "." + p + "\"/>");
                s.add("        </div>");
            }
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        if (!table.isHistory() && !table.isView()) {
            s.add("        <button id=\"Delete" + entity + "\" type=\"submit\" class=\"delete\" data-action=\"" + entity
                    + "Delete.ajax\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
            if (!StringUtil.isNullOrBlank(status) && (table.getColumnInfos().containsKey(status.toLowerCase())
                    || table.getColumnInfos().containsKey(status.toUpperCase()))) {
                s.add("        <button id=\"Permit" + entity + "\" type=\"submit\" class=\"permit\" data-action=\""
                        + entity + "Permit.ajax\" th:text=\"#{common.permit}\" tabindex=\"-1\">承認</button>");
                s.add("        <button id=\"Forbid" + entity + "\" type=\"submit\" class=\"forbid\" data-action=\""
                        + entity + "Forbid.ajax\" th:text=\"#{common.forbid}\" tabindex=\"-1\">否認</button>");
            }
            String onclick = "";
            if (table.getHistoryInfo() != null && !StringUtil.isNullOrBlank(reason)) {
                onclick = " onclick=\"if (!Base.historyReason(this)) { return false; }\"";
            }
            s.add("        <button id=\"Regist" + entity
                    + "\" type=\"submit\" class=\"regist\" th:text=\"#{common.regist}\"" + onclick + ">登録</button>");
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
     * @param table テーブル情報
     * @param tables
     */
    private static void htmlProperties(final String htmlDir, final TableInfo table, final List<TableInfo> tables) {

        List<String> s = new ArrayList<String>();
        String entity = StringUtil.toPascalCase(table.getName());
        String remarks = table.getRemarks();
        s.add(entity + "S.title   " + remarks + "検索");
        s.add(entity + "S.h2      " + remarks + "検索");
        s.add(entity + "S.legend  " + remarks + "検索");
        s.add(entity + ".add      " + remarks + "追加");
        s.add(entity + ".title    " + remarks);
        s.add(entity + ".h2       " + remarks);
        s.add(entity + ".legend   " + remarks);
        s.add(entity + ".h3       " + remarks + "一覧");

        s.add("");
        for (ColumnInfo column : table.getColumnInfos().values()) {
            String property = StringUtil.toCamelCase(column.getName());
            s.add(entity + "." + property + " " + column.getRemarks());
        }

        s.add("");
        for (ColumnInfo column : table.getColumnInfos().values()) {
            String property = StringUtil.toCamelCase(column.getName());
            s.add(entity + "Grid." + property + " " + column.getRemarks());

        }
        for (TableInfo bros : table.getBrosInfos()) {
            String e = StringUtil.toPascalCase(bros.getName());
            s.add("");
            s.add(e + ".legend   " + bros.getRemarks());
            for (ColumnInfo column : bros.getColumnInfos().values()) {
                String property = StringUtil.toCamelCase(column.getName());
                s.add(e + "." + property + " " + column.getRemarks());
            }
        }

        for (TableInfo child : table.getChildInfos()) {
            String e = StringUtil.toPascalCase(child.getName());
            String mei = child.getRemarks();
            s.add("");
            s.add(e + ".h3  " + mei + "一覧");
            s.add(e + ".add " + mei + "追加");
            for (ColumnInfo column : child.getColumnInfos().values()) {
                String property = StringUtil.toCamelCase(column.getName());
                s.add(e + "Grid." + property + " " + column.getRemarks());
            }
        }

        if (table.getRebornTo() != null) {
            TableInfo reborn = table.getRebornTo();
            String e = StringUtil.toPascalCase(reborn.getName());
            s.add("");
            s.add(e + ".add " + reborn.getRemarks() + "追加");
        }

        if (table.getSummaryOf() != null) {
            TableInfo summary = table.getSummaryOf();
            String e = StringUtil.toPascalCase(summary.getName());
            s.add("");
            s.add(e + ".add " + summary.getRemarks() + "追加");
        }

        TableInfo summary = getSummary(table, tables);
        if (summary != null) {
            String e = StringUtil.toPascalCase(summary.getName());
            s.add("");
            s.add(e + ".sum " + summary.getRemarks() + "集約");
        }

        FileUtil.writeFile(htmlDir + File.separator + entity + ".properties", s);
    }

    /**
     * navファイル出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param tables テーブル情報のリスト
     */
    private static void htmlNav(final String htmlDir, final List<TableInfo> tables) {

        // プレフィクス毎にグループ化
        Map<String, List<TableInfo>> navs = new LinkedHashMap<String, List<TableInfo>>();

        for (TableInfo table : tables) {

            // 親モデルがあればスキップ
            if (table.getParentInfos().size() > 0) {
                continue;
            }

            String name = table.getName();
            String prefix = name.replaceAll("_.+$", "");

            List<TableInfo> nav = null;
            if (navs.containsKey(prefix)) {
                nav = navs.get(prefix);
            } else {
                nav = new ArrayList<TableInfo>();
                navs.put(prefix, nav);
            }

            nav.add(table);
        }

        List<String> s = new ArrayList<String>();
        s.add("<!DOCTYPE html>");
        s.add("<html xmlns:th=\"http://www.thymeleaf.org\" xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\">");
        s.add("<body>");
        s.add("  <div class=\"nav\" layout:fragment=\"nav\" th:if=\"${#ctx.session != null && #ctx.session.get('AUTHN_KEY') != null}\">");
        s.add("    <dl>");
        for (Entry<String, List<TableInfo>> nav : navs.entrySet()) {
            String category = nav.getKey();
            s.add("      <dt id=\"" + category + "\" th:text=\"#{nav.dt." + category + "}\">" + category + "</dt>");
            s.add("      <dd>");
            s.add("        <ul>");
            for (TableInfo table : nav.getValue()) {
                String name = table.getName();
                String remarks = table.getRemarks();
                String e = StringUtil.toPascalCase(name);
                String css = " class=\"table\"";
                if (table.isView()) {
                    css = " class=\"view\"";
                }
                s.add("          <li><a id=\"" + e + "\" th:href=\"@{/model/" + e + "S.html}\" th:text=\"#{nav." + e
                        + "S}\"" + css + ">" + remarks + "</a></li>");
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
            String category = nav.getKey();
            s.add("nav.dt." + category + " " + category);
            for (TableInfo table : nav.getValue()) {
                String name = table.getName();
                String remarks = table.getRemarks();
                String e = StringUtil.toPascalCase(name);
                s.add("nav." + e + "S " + remarks);
            }
        }

        FileUtil.writeFile(htmlDir + sep + ".." + sep + "common" + sep + "nav.properties", s);
    }

    /**
     * ネストした兄弟モデル・子モデル・参照モデルのgrid定義出力
     * @param s 出力文字列のリスト
     * @param table テーブル情報
     * @param tables
     * @param added 出力済みテーブル情報のリスト
     */
    private static void htmlNestGrid(final List<String> s, final TableInfo table, final List<TableInfo> tables,
            final Set<TableInfo> added) {

        //参照モデル
        for (ColumnInfo column : table.getColumnInfos().values()) {

            TableInfo refer = column.getReferInfo();

            if (refer != null) {

                if (added.contains(refer)) {
                    continue;
                }

                String referName = refer.getName();
                String entity = StringUtil.toPascalCase(referName);
                s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                added.add(refer);

                htmlNestGrid(s, refer, tables, added);
            }
        }

        //兄弟モデルの参照モデル
        for (TableInfo bro : table.getBrosInfos()) {

            for (ColumnInfo column : bro.getColumnInfos().values()) {

                TableInfo refer = column.getReferInfo();

                if (refer != null) {

                    if (added.contains(refer)) {
                        continue;
                    }

                    String referName = refer.getName();
                    String entity = StringUtil.toPascalCase(referName);
                    s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                    added.add(refer);

                    htmlNestGrid(s, refer, tables, added);
                }
            }
        }

        //子モデル
        for (TableInfo child : table.getChildInfos()) {

            if (added.contains(child)) {
                continue;
            }

            String childName = child.getName();
            String entity = StringUtil.toPascalCase(childName);
            s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
            added.add(child);

            htmlNestGrid(s, child, tables, added);
        }

        //転生先モデル
        if (table.getRebornTo() != null) {
            TableInfo reborn = table.getRebornTo();
            if (!added.contains(reborn)) {
                added.add(reborn);
                htmlNestGrid(s, reborn, tables, added);
            }
        }

        //集約元モデル
        if (table.getSummaryOf() != null) {
            TableInfo summary = table.getSummaryOf();
            if (!added.contains(summary)) {
                String entity = StringUtil.toPascalCase(summary.getName());
                s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                added.add(summary);
                htmlNestGrid(s, summary, tables, added);
            }
        }

        //集約先モデル
        TableInfo summary = getSummary(table, tables);
        if (summary != null) {
            if (!added.contains(summary)) {
                String entity = StringUtil.toPascalCase(summary.getName());
                s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                added.add(summary);
                htmlNestGrid(s, summary, tables, added);
            }
        }
    }

    /**
     * @param table
     * @param column
     * @return 列定義文字列
     */
    private static String htmlGridColumn(final TableInfo table, final ColumnInfo column) {

        String entity = StringUtil.toPascalCase(table.getName());
        String name = column.getName();
        String mei = "Messages['" + entity + "Grid." + StringUtil.toCamelCase(name) + "']";

        int w = column.getColumnSize() * COLUMN_WIDTH_PX_MULTIPLIER;
        if (column.getMaxLength() != null) {
            w = column.getMaxLength() * COLUMN_WIDTH_PX_MULTIPLIER;
        }
        if (w < 30) {
            w = 30;
        } else if (w > 300) {
            w = 300;
        }

        boolean isInsTs = name.matches("(?i)^" + insertTs + "$");
        boolean isInsBy = name.matches("(?i)^" + insertId + "$");
        boolean isUpdTs = name.matches("(?i)^" + updateTs + "$");
        boolean isUpdBy = name.matches("(?i)^" + updateId + "$");
        if (isInsTs /*|| isUpdateDt*/ || isInsBy || isUpdBy) {
            return null;
        }

        String css = "";
        if (!table.isView()) {
            if (column.isPk()) {
                css = "primaryKey";
                boolean isParentKey = false;
                if (table.getParentInfos() != null) {
                    for (TableInfo parent : table.getParentInfos()) {
                        if (parent.getPrimaryKeys().contains(name)) {
                            isParentKey = true;
                            break;
                        }
                    }
                }
                if ((column.isNumbering() && column.getReferInfo() == null) || isParentKey) {
                    css += " numbering"; //採番キー かつ 参照キーでない か 親モデルのキー
                }
            } else if (column.isUnique()) {
                css = "uniqueKey";
            } else if (isInsTs || isUpdTs || isInsBy || isUpdBy) {
                css = "metaInfo";
            } else if (column.getNullable() == 0) {
                if (!column.isPk() && column.getTypeName().equals("CHAR")
                        && !StringUtil.isNullOrBlank(charNotNullRe) && !name.matches(charNotNullRe)) {
                    LOG.trace("skip NotBlank.");
                } else {
                    css = "notblank";
                }
            }
        }

        String format = "null";
        if (column.getDataType().equals("java.time.LocalDate")) {
            format = "Slick.Formatters.Extends.Date";
        } else if (StringUtil.endsWith(inputTimestampSuffixs, column.getName())) {
            format = "Slick.Formatters.Extends.Timestamp";
        } else if (column.getDataType().equals("java.time.LocalDateTime")) {
            format = "Slick.Formatters.Extends.DateTime";
        }

        // 名称を参照先から取得するか
        boolean isMeiRefer = false;
        // 参照名の列名
        String referMei = null;
        // 参照テーブルが設定されている場合
        TableInfo referInfo = column.getReferInfo();
        if (referInfo != null) {
            isMeiRefer = true;
            // カラム名が組み合わせキーのいずれかに合致する場合
            if (StringUtil.endsWith(referPairs, name)) {
                // 参照設定の組み合わせでループ
                for (String[] suffix : referPairs) {
                    String keySuffix = suffix[0];
                    String meiSuffix = suffix[1];
                    // カラム名がキー接尾辞に合致する場合
                    if (name.matches("(?i).*" + keySuffix + "$")) {
                        // カラム名の末尾を名称列サフィックスに変換
                        String tempMei = name.replaceAll("(?i)" + keySuffix + "$", meiSuffix);
                        // 名称列がテーブルに含まれていない場合は参照先から名称を取得する
                        if (table.getColumnInfos().containsKey(tempMei)) {
                            referMei = tempMei;
                            isMeiRefer = false;
                            break;
                        }
                    }
                }
            }
            //名称を参照先から取得する場合
            if (isMeiRefer) {
                // 参照設定の組み合わせで、キー接尾辞に合致するカラム名を探索
                for (String[] suffix : referPairs) {
                    String keySuffix = suffix[0];
                    String meiSuffix = suffix[1];
                    if (name.matches("(?i).*" + keySuffix + "$")) {
                        // カラム名の末尾を名称列サフィックスに変換して、名称列が参照先テーブルに含まれている場合は、取得する名称を決定する
                        String tempMei = name.replaceAll("(?i)" + keySuffix + "$", meiSuffix).toUpperCase();
                        for (ColumnInfo referColumnInfo : referInfo.getColumnInfos().values()) {
                            if (tempMei.matches("(?i).*" + referColumnInfo.getName() + "$")) {
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
            c = "Column.refer('" + name + "', " + mei + ", " + w + ", '" + css + "', '" + referMei.toString() + "'),";
        } else if (isInsTs || isUpdTs || isInsBy || isUpdBy || column.isReborn() || column.isSummary()) {
            c = "Column.cell('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        } else if (StringUtil.endsWith(inputFlagSuffixs, name)) {
            c = "Column.check('" + name + "', " + mei + ", " + w + ", '" + css + "'),";
        } else if (StringUtil.endsWith(inputDateSuffixs, name)) {
            c = "Column.date('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        } else if (StringUtil.endsWith(inputDate8Suffixs, name) && column.getColumnSize() == 8) {
            c = "Column.date8('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        } else if (StringUtil.endsWith(inputTimestampSuffixs, name)) {
            c = "Column.cell('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        } else if (StringUtil.endsWith(inputDateTimeSuffixs, name)) {
            c = "Column.dateTime('" + name + "', " + mei + ", " + w + ", '" + css + "'),";
        } else if (StringUtil.endsWith(inputYMSuffixs, name)) {
            c = "Column.month('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        } else if (StringUtil.endsWith(inputTimeSuffixs, name)) {
            c = "Column.time('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        } else if (StringUtil.endsWith(inputFileSuffixs, name)) {
            c = "Column.link('" + name + "', " + mei + ", " + w + ", '" + css + "'),";
        } else if (StringUtil.endsWith(optionsSuffixs, name)) {
            c = "Column.select('" + name + "', " + mei + ", " + w + ", '" + css + "', " + opt + "),";
        } else if (StringUtil.endsWith(textareaSuffixs, name)) {
            c = "Column.longText('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        } else if ((column.getTypeName().equals("INT") || column.getTypeName().equals("DECIMAL")
                || column.getTypeName().equals("DOUBLE") || column.getTypeName().equals("NUMBER")
                || column.getTypeName().equals("NUMERIC"))
                && !StringUtil.endsWith(intNoFormatSuffixs, column.getName())) {
            c = getNumericColumn(column, name, mei, w, css, format);
        } else {
            c = "Column.text('" + name + "', " + mei + ", " + w + ", '" + css + "', " + format + "),";
        }

        return c;
    }

    /**
     * @param column
     * @param name
     * @param mei
     * @param width
     * @param css
     * @param formatter
     * @return String
     */
    private static String getNumericColumn(final ColumnInfo column, final String name, final String mei,
            final int width, final String css, final String formatter) {

        if (column.getDecimalDigits() == 3) {

            return "Column.dec3('" + name + "', " + mei + ", " + width + ", '" + css + "', " + formatter + "),";

        } else if (column.getDecimalDigits() == 2) {

            return "Column.dec2('" + name + "', " + mei + ", " + width + ", '" + css + "', " + formatter + "),";

        } else if (column.getDecimalDigits() == 1) {

            return "Column.dec1('" + name + "', " + mei + ", " + width + ", '" + css + "', " + formatter + "),";
        }

        return "Column.comma('" + name + "', " + mei + ", " + width + ", '" + css + "', " + formatter + "),";
    }

    /**
     * htmlにフィールド追加
     * @param table テーブル情報
     * @param s 出力文字列のリスト
     * @param isD 詳細画面ならtrue
     * @param isB 兄弟モデルならtrue
     */
    private static void htmlFields(final TableInfo table, final List<String> s, final boolean isD, final boolean isB) {

        //検索画面の場合は制約モデルの参照キーを出力
        if (!isD && table.getStintInfo() != null) {
            htmlFieldsStint(table, s);
        }

        String entity = StringUtil.toPascalCase(table.getName());

        // カラム情報でループ
        for (ColumnInfo column : table.getColumnInfos().values()) {

            if (isB && column.isPk()) {
                continue; // 兄弟モデルの主キーは出力しない
            }

            String colName = column.getName();
            if (colName.matches("(?i)^" + viewDetail + "$")) {
                continue; // VIEWのテーブル名なら出力しない
            }

            if (table.isView() && isD && StringUtil.startsWith(viewCriteriaPrefixs, colName)) {
                continue; // VIEWの詳細フォームには「SEARCH_」を出力しない
            }

            if (!isD && (StringUtil.endsWith(inputFileSuffixs, colName)
                    || StringUtil.endsWith(inputTimestampSuffixs, colName))) {
                continue; // 検索条件にはファイル項目とタイムスタンプを出力しない
            }

            String property = StringUtil.toCamelCase(colName);

            // メタ情報の場合（検索画面の場合はスキップ（検索条件にはしない）、詳細画面の兄弟モデルは更新日時のみhiddenで出力）
            boolean isInsertDt = colName.matches("(?i)^" + insertTs + "$");
            boolean isUpdateDt = colName.matches("(?i)^" + updateTs + "$");
            boolean isInsertBy = colName.matches("(?i)^" + insertId + "$");
            boolean isUpdateBy = colName.matches("(?i)^" + updateId + "$");
            if (isInsertDt || isInsertBy || isUpdateDt || isUpdateBy) {
                if (!isD) {
                    continue; // 検索画面ならスキップ
                }
                if (isB) {
                    if (isUpdateDt) {
                        s.add("        <input type=\"hidden\" name=\"" + entity + "." + property + "\" />");
                    }
                    continue; // 兄弟モデルならスキップ（更新日時のみ楽観ロック用に出力）
                }
            }

            s.add("        <div id=\"" + property + "\">");

            String fieldId = entity + "." + property;

            if (isInsertDt || isUpdateDt || isInsertBy || isUpdateBy) { // メタ情報の場合は表示項目（編集画面の自モデルのみここに到達する）
                htmlFieldsMeta(s, fieldId, column.getRemarks());
                addMeiSpan(s, table, column);

            } else if (StringUtil.endsWith(optionsSuffixs, colName) && column.getReferInfo() == null) {
                // 選択項目の場合（サフィックスが合致しても参照モデルなら除外）

                String css = "";
                if (isD && column.isPk()) { // 詳細画面の主キー
                    css += " primaryKey";
                }
                if (isD && table.isHistory()) { // 履歴モデルの詳細画面
                    css += " history";
                } else if (isD && column.isReborn()) { // 詳細画面の転生元外部キー
                    css += " rebornee";
                } else if (isD && column.isDerive()) { // 詳細画面の派生元外部キー
                    css += " derivee";
                } else if (isD && column.isSummary()) { // 詳細画面の集約先外部キー
                    css += " summary";
                }

                htmlFieldsOptions(s, fieldId, colName, column.getRemarks(), css);

            } else if (isD && table.isHistory()) { // 履歴モデルの詳細画面
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "history");
                addMeiSpan(s, table, column);

            } else if (isD && column.isReborn()) { // 詳細画面の転生元外部キー
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "rebornee");

            } else if (isD && column.isDerive()) { // 詳細画面の派生元外部キー
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "derivee");

            } else if (isD && column.isSummary()) { // 詳細画面の集約先外部キー
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "summary");

            } else if (StringUtil.endsWith(inputTimestampSuffixs, colName)) { // タイムスタンプの場合
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "");

            } else if (isD && StringUtil.endsWith(textareaSuffixs, colName)) { // テキストエリア項目の場合
                htmlFieldsTextarea(s, fieldId, column.getRemarks());

            } else { // inputの場合

                String type = getInputType(colName);

                String inputCss = addCssByRelation(isD, table, column);

                // 詳細画面の必須項目
                if (isD && column.getNullable() == 0) {
                    if (!column.isPk() && column.getTypeName().equals("CHAR")
                            && !StringUtil.isNullOrBlank(charNotNullRe) && !colName.matches(charNotNullRe)) {
                        LOG.trace("skip NotBlank.");
                    } else {
                        inputCss += " notblank";
                    }
                }

                // 日付項目および8桁日付項目
                if (StringUtil.endsWith(inputDateSuffixs, colName)) {
                    inputCss += " datepicker";
                } else if (StringUtil.endsWith(inputDate8Suffixs, colName) && column.getColumnSize() == 8) {
                    inputCss += " datepicker";
                }

                if (!StringUtil.isNullOrBlank(inputCss)) {
                    inputCss = " class=\"" + inputCss + "\"";
                }

                String referCss = addCssByRelation(isD, table, column);
                if (!StringUtil.isNullOrBlank(referCss)) {
                    referCss = " class=\"" + referCss + "\"";
                }

                String format = "";
                if (StringUtil.endsWith(inputDate8Suffixs, colName) && column.getColumnSize() == 8) { // 8桁日付項目
                    format = "yymmdd";
                }

                if (!isD && StringUtil.endsWith(inputRangeSuffixs, colName)) { // 検索画面の範囲指定項目の場合
                    s.add(htmlFieldsRange(fieldId, type, inputCss, column, format));
                } else if (column.getReferInfo() != null) { // 参照モデルの場合
                    s.add(htmlFieldsRefer(fieldId, type, inputCss, column, format, table, referCss));
                } else {
                    s.add(htmlFieldsInput(fieldId, type, inputCss, column, format));
                }
            }

            s.add("        </div>");
        }
    }

    /**
     * @param isD
     * @param table
     * @param column
     * @return cssClass
     */
    private static String addCssByRelation(final boolean isD, final TableInfo table, final ColumnInfo column) {

        String css = "";

        // 詳細画面のユニークキー
        if (isD && column.isUnique()) {
            css += " uniqueKey";
        }

        // 詳細画面の主キー
        if (isD && column.isPk()) {
            css += " primaryKey";

            // 詳細画面の採番キー
            if (column.isNumbering()) {
                css += " numbering";
            }
        }

        // 詳細画面の参照キー
        if (isD && column.getReferInfo() != null) {
            css += " refer";

            // 詳細画面の制約キー
            TableInfo refer = column.getReferInfo();
            TableInfo stint = refer.getStintInfo();
            if (stint != null && !table.getName().equals(stint.getName())) {
                css += " correct";
            }
        }

        return css;
    }

    /**
     * @param colName
     * @return String
     */
    private static String getInputType(final String colName) {

        if (StringUtil.endsWith(inputDateTimeSuffixs, colName)) {
            // 日時項目
            return "datetime-local";

        } else if (StringUtil.endsWith(inputYMSuffixs, colName)) {
            // 年月項目
            return "month";

        } else if (StringUtil.endsWith(inputTimeSuffixs, colName)) {
            // 時刻項目
            return "time";

        } else if (StringUtil.endsWith(inputFileSuffixs, colName)) {
            // ファイル
            return "file";
        }

        return "text";
    }

    /**
     * @param table
     * @param s
     */
    private static void htmlFieldsStint(final TableInfo table, final List<String> s) {
        TableInfo stint = table.getStintInfo();
        for (String pk : stint.getPrimaryKeys()) {
            if (!pk.equals(table.getPrimaryKeys().get(0))) {
                ColumnInfo column = stint.getColumnInfos().get(pk);
                if (column.getReferInfo() != null) {
                    TableInfo refer = column.getReferInfo();
                    String entity = StringUtil.toPascalCase(refer.getName());
                    String columnName = column.getName();
                    String property = StringUtil.toCamelCase(columnName);
                    String fieldId = entity + "." + property;
                    s.add("        <div id=\"" + property + "\" class=\"stint\" style=\"display: none;\">");
                    //                    s.add(htmlFieldsRefer(fieldId, "text", "refer", column, "", table, "refer"));
                    htmlFieldsSpan(s, fieldId, column.getRemarks(), "stint");
                    addMeiSpan(s, table, column);
                    s.add("        </div>");
                }
            }
        }
    }

    /**
     * @param s
     * @param table
     * @param column
     */
    private static void addMeiSpan(final List<String> s, final TableInfo table, final ColumnInfo column) {

        if (column.getReferInfo() != null) {
            TableInfo refer = column.getReferInfo();

            String entity = StringUtil.toPascalCase(table.getName());
            String meiColumnName = getMeiColumnName(column.getName(), refer);

            if (!table.getColumnInfos().containsKey(meiColumnName)) {

                String meiId = entity + "." + StringUtil.toCamelCase(meiColumnName);
                String referDef = getReferDef(entity, column.getName(), refer);

                s.add("          <span id=\"" + meiId + "\" class=\"refer\"" + referDef + "></span>");
            }
        }
    }

    /**
     * referタグ出力
     * @param fieldId    入力項目のID
     * @param type       タイプ
     * @param css        スタイル
     * @param column
     * @param format     フォーマット
     * @param table
     * @param referCss
     * @return referタグ
     */
    private static String htmlFieldsRefer(final String fieldId, final String type, final String css,
            final ColumnInfo column, final String format, final TableInfo table, final String referCss) {

        String dataFormat = "";
        if (!StringUtil.isNullOrBlank(format)) {
            dataFormat = " data-format=\"" + format + "\"";
        }

        String entity = StringUtil.toPascalCase(table.getName());
        String colName = column.getName();
        String remarks = column.getRemarks();
        int max = column.getColumnSize();

        String tag = "          ";
        tag += "<label for=\"" + fieldId + "\" th:text=\"#{" + fieldId + "}\">" + remarks + "</label>";

        TableInfo refer = column.getReferInfo();
        String referName = StringUtil.toPascalCase(refer.getName());
        String referDef = getReferDef(entity, colName, refer);
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

        String meiColName = getMeiColumnName(colName, refer);
        if (!table.getColumnInfos().containsKey(meiColName)) {
            String meiId = entity + "." + StringUtil.toCamelCase(meiColName);
            tag += "<span id=\"" + meiId + "\"" + referCss + referDef + "></span>";
        }

        return tag;
    }

    /**
     * inputタグ出力
     * @param id         入力項目のID
     * @param type       タイプ
     * @param css        スタイル
     * @param column 列情報
     * @param format     フォーマット
     * @return タグ文字列
     */
    private static String htmlFieldsInput(final String id, final String type, final String css, final ColumnInfo column,
            final String format) {

        String dataFormat = "";
        if (!StringUtil.isNullOrBlank(format)) {
            dataFormat = " data-format=\"" + format + "\"";
        }

        String remarks = column.getRemarks();

        int max = column.getColumnSize();
        if (column.getMaxLength() != null) {
            max = column.getMaxLength();
        }

        String tag = "          ";
        tag += "<label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<input type=\"" + type + "\" id=\"" + id + "\" name=\"" + id + "\" maxlength=\"" + max + "\"" + css
                + dataFormat + " />";

        if (type.equals("file")) {
            tag += "<a id=\"" + id + "\" target=\"blank\" style=\"display: none;\"></a>";
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
     * @param colName カラム名
     * @param remarks コメント
     * @param css css
     */
    private static void htmlFieldsOptions(final List<String> s, final String id, final String colName,
            final String remarks, final String css) {

        String cssClass = "";
        if (!StringUtil.isNullOrBlank(css)) {
            cssClass = " class=\"" + css + "\"";
        }

        String forcePulldown = "";
        if (StringUtil.endsWith(pulldownSuffixs, colName)) {
            forcePulldown = " data-force-pulldown=\"1\"";
        }

        s.add("          <fieldset id=\"" + id + "List\" data-options=\"" + json + "\" data-optionParams=\"" + optK
                + ":" + colName + "\" data-optionValue=\"" + optV + "\" data-optionLabel=\"" + optL + "\""
                + cssClass + forcePulldown + ">");
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
     * @param cssClass
     */
    private static void htmlFieldsSpan(final List<String> s, final String id, final String remarks,
            final String cssClass) {

        String css = "";
        if (!StringUtil.isNullOrBlank(cssClass)) {
            css = " class=\"" + cssClass + "\"";
        }

        String tag = "          ";
        tag += "<label th:text=\"#{" + id + "}\">" + remarks + "</label>";
        tag += "<span id=\"" + id + "\"" + css + "></span>";
        tag += "<input type=\"hidden\" id=\"" + id + "\" name=\"" + id + "\"" + css + " />";
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

                String referName = StringUtil.toPascalCase(referInfo.getName());
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
