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
    private static final int COLUMN_WIDTH_PX_MULTIPLIER = 9;

    /** 参照列名ペア */
    private static Set<String[]> referPairs = new LinkedHashSet<String[]>();

    /** 適用日カラム名 */
    private static String tekiyoBi;
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
    /** 削除フラグ */
    private static String deleteF;
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
    /** 中間表などメニュー化しないビューサフィックスのリスト */
    private static String[] viewNavIgnoreSuffixs;

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
    private static String[] inputHourSuffixs;
    /** 時間入力サフィックス */
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

        tekiyoBi = bundle.getString("column.start");
        insertTs = bundle.getString("column.insert.timestamp");
        insertId = bundle.getString("column.insert.id");
        updateTs = bundle.getString("column.update.timestamp");
        updateId = bundle.getString("column.update.id");
        status = bundle.getString("column.status");
        deleteF = bundle.getString("column.delete");
        reason = bundle.getString("column.history.reason");

        intNoFormatSuffixs = bundle.getString("column.int.noformat.suffixs").split(",");
        charNotNullRe = bundle.getString("column.char.notnull.re");

        gridRows = bundle.getString("grid.rows");

        viewCriteriaPrefixs = bundle.getString("view.criteria.prefix").split(",");
        viewDetail = bundle.getString("view.detail");
        viewNavIgnoreSuffixs = bundle.getString("view.nav.ignore.suffixs").split(",");

        inputYMSuffixs = bundle.getString("input.ym.suffixs").split(",");
        inputDate8Suffixs = bundle.getString("input.date8.suffixs").split(",");
        inputTimestampSuffixs = bundle.getString("input.timestamp.suffixs").split(",");
        inputDateTimeSuffixs = bundle.getString("input.datetime.suffixs").split(",");
        inputDateSuffixs = bundle.getString("input.date.suffixs").split(",");
        inputHourSuffixs = bundle.getString("input.hour.suffixs").split(",");
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
        String es = e + "S";
        String remarks = table.getRemarks();
        List<String> s = new ArrayList<String>();
        addHtmlHead(s, es, remarks);
        s.add("<script th:src=\"@{/model/" + e + "GridColumns.js}\"></script>");
        Set<TableInfo> added = new HashSet<TableInfo>();
        added.add(table);
        htmlNestGrid(s, table, tables, added, false);
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + es + ".h2}\">h2</h2>");
        s.add("    <!-- 検索フォーム -->");
        s.add("    <form name=\"" + e + "SearchForm\" action=\"" + e + "Search.ajax\" class=\"search\">");
        s.add("      <input type=\"hidden\" name=\"rows\" value=\"" + gridRows + "\" />");
        s.add("      <input type=\"hidden\" name=\"page\" value=\"0\" />");
        s.add("      <fieldset>");
        s.add("        <legend th:text=\"#{" + es + ".legend}\">legend</legend>");
        htmlFields(table, s, false, false, false);
        s.add("      </fieldset>");
        s.add("      <div class=\"buttons\">");
        s.add("        <button type=\"reset\" id=\"Reset" + e
                + "\" th:text=\"#{common.reset}\" class=\"reset\">reset</button>");
        boolean isAnew = isAnew(table);
        if (isAnew || table.getRebornFroms().size() > 1) {
            boolean isDeriver = false;
            for (ColumnInfo col : table.getColumns().values()) {
                if (col.getDeriveFrom() != null) {
                    isDeriver = true;
                    break;
                }
            }
            String anewClass = "anew";
            if (isDeriver) {
                anewClass += " derive";
            }
            s.add("        <a th:href=\"@{/model/" + e + ".html}\" target=\"dialog\" id=\"" + e + "\" class=\""
                    + anewClass + "\" th:text=\"#{" + e + ".add}\" tabindex=\"-1\">" + remarks + "</a>");
            if (isDeriver) {
                HashSet<String> deriveFroms = new HashSet<String>();
                for (ColumnInfo col : table.getColumns().values()) {
                    if (col.getDeriveFrom() != null && !deriveFroms.contains(col.getDeriveFrom().getName())) {
                        deriveFroms.add(col.getDeriveFrom().getName());
                        String fieldId = null;
                        for (String primaryKey : col.getDeriveFrom().getPrimaryKeys()) {
                            fieldId = e + ".derivee" + StringUtil.toPascalCase(primaryKey);
                            s.add(htmlFieldsInput(fieldId, "text", "", col.getDeriveFrom().getColumns().get(primaryKey),
                                    null));
                        }
                        String referName = StringUtil.toPascalCase(col.getDeriveFrom().getName());
                        s.add("          <a id=\"" + fieldId + "\" th:href=\"@{/model/" + referName + "S.html?action="
                                + referName + "Correct.ajax}\" target=\"dialog\" class=\"derivee\" "
                                + "th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>");
                    }
                }
            }
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        s.add("        <button id=\"Search" + e + "\" type=\"submit\" class=\"search\" data-gridId=\"" + e
                + "Grid\" th:text=\"#{common.search}\">submit</button>");
        s.add("      </div>");
        s.add("    </form>");
        s.add("    <!-- 一覧フォーム -->");
        s.add("    <form name=\"" + es + "RegistForm\" action=\"" + es + "Regist.ajax\" class=\"regist\">");
        s.add("      <h3 th:text=\"#{" + e + ".h3}\">h3</h3>");
        String addRow = "";
        if (isAnew) {
            boolean isNotAddRow = false;
            for (ColumnInfo column : table.getColumns().values()) {
                if (column.getName().matches("(?i)^" + insertId + "$")
                        || column.getName().matches("(?i)^" + updateId + "$")) { //メタ情報ならスキップ
                    continue;
                }
                if (StringUtil.endsWith(inputFileSuffixs, column.getName())) { //ファイル列があれば新規行なし
                    isNotAddRow = true;
                    break;
                }
            }
            if (table.getChilds().size() > 0) { //子モデルがあれば新規行なし
                isNotAddRow = true;
            }
            if (!isNotAddRow) {
                addRow = " data-addRow=\"true\"";
            }
        }
        int frozenColumn = table.getPrimaryKeys().size() - 1;
        String editable = "";
        if (table.isHistory() || table.isView() || table.getChilds().size() > 0) {
            editable = "data-editable=\"false\" ";
        }
        s.add("      <div id=\"" + e + "Grid\" data-selectionMode=\"checkbox\"" + addRow + " data-frozenColumn=\""
                + frozenColumn + "\" " + editable + "th:data-href=\"@{/model/" + e + ".html}\"></div>");
        s.add("      <div id=\"" + e + "Pager\"></div>");
        s.add("      <div class=\"buttons\">");
        if (!table.isHistory() && (!table.isView() || table.isConvView())) {
            s.add("        <button type=\"button\" class=\"reset\" id=\"Reset" + es
                    + "\" th:text=\"#{common.reset}\" onClick=\"Base.listReset('" + e + "');\">reset</button>");
        }
        s.add("        <a th:href=\"@{" + e + "Search.xlsx(baseMei=#{" + es + ".h2})}\" id=\"" + e
                + "Search.xlsx\" th:text=\"#{common.xlsx}\" class=\"output\" tabindex=\"-1\">xlsx</a>");
        TableInfo summary = getSummary(table, tables); //集約先リンク
        if (summary != null) {
            String summaryEntity = StringUtil.toPascalCase(summary.getName());
            s.add("        <a th:href=\"@{/model/" + summaryEntity + ".html}\" id=\"" + summaryEntity
                    + "\" target=\"dialog\" th:text=\"#{" + summaryEntity
                    + ".sum}\" class=\"summary\" tabindex=\"-1\">" + summary.getRemarks() + "</a>");
        }
        // 履歴モデルでないテーブルか、組み合わせビュー（検索条件で使う）なら、非表示の参照ボタンを出力
        if ((!table.isView() && !table.isHistory()) || table.isConvView()) {
            addGridReferHiddenLinks(s, table);
        }
        // 履歴モデルでないテーブルで、子モデルを持たない場合
        if (!table.isView() && !table.isHistory() && table.getChilds().size() == 0) {
            // 削除フラグ列名の指定がないか、テーブルに削除フラグ列がないなら、物理削除ボタンを表示
            if (StringUtil.isNullOrBlank(deleteF) || (!table.getColumns().containsKey(deleteF.toLowerCase())
                    && !table.getColumns().containsKey(deleteF.toUpperCase()))) {
                s.add("        <button type=\"submit\" id=\"Delete" + es + "\" data-action=\"" + es
                        + "Delete.ajax\" class=\"delete selectRows\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
            }
            //ステータス列名の指定があり、テーブルにステータス列があるなら、承認ボタン・否認ボタンを表示
            if (!StringUtil.isNullOrBlank(status) && (table.getColumns().containsKey(status.toLowerCase())
                    || table.getColumns().containsKey(status.toUpperCase()))) {
                s.add("        <button type=\"submit\" id=\"Permit" + es + "\" data-action=\"" + es
                        + "Permit.ajax\" class=\"permit selectRows\" th:text=\"#{common.permit}\" tabindex=\"-1\">承認</button>");
                s.add("        <button type=\"submit\" id=\"Forbid" + es + "\" data-action=\"" + es
                        + "Forbid.ajax\" class=\"forbid selectRows\" th:text=\"#{common.forbid}\" tabindex=\"-1\">否認</button>");
            }
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        if (!table.isHistory() && (!table.isView() || table.isConvView()) && table.getChilds().size() == 0) {
            String onclick = "";
            if (table.getHistory() != null && !StringUtil.isNullOrBlank(reason)) {
                onclick = " onclick=\"if (!Base.historyReason(this)) { return false; }\"";
            }
            s.add("        <button id=\"Regist" + es
                    + "\" type=\"submit\" class=\"regist\" th:text=\"#{common.regist}\"" + onclick
                    + ">submit</button>");
        }
        s.add("      </div>");
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");
        FileUtil.writeFile(htmlDir + File.separator + es + ".html", s);
    }

    /**
     * @param s
     * @param table
     */
    public static void addGridReferHiddenLinks(final List<String> s, final TableInfo table) {
        String e = StringUtil.toPascalCase(table.getName());
        for (ColumnInfo column : table.getColumns().values()) {
            if (column.getRefer() != null) {
                String columnName = column.getName();
                if (columnName.matches("(?i)^" + insertId + "$") || columnName.matches("(?i)^" + updateId + "$")) {
                    continue;
                }
                String p = StringUtil.toCamelCase(column.getName());
                TableInfo refer = column.getRefer();
                String referE = StringUtil.toPascalCase(refer.getName());
                String action = "";
                String css = "";
                if (refer.getStintInfo() != null) {
                    action = "?action=" + referE + "Correct.ajax";
                    css = " correct";
                }
                s.add("        <a id=\"" + e + "Grid." + p + "\" th:href=\"@{/model/" + referE + "S.html" + action
                        + "}\" target=\"dialog\" class=\"refer" + css + "\" th:text=\"'" + refer.getRemarks()
                        + "' + #{common.refer}\" tabindex=\"-1\" style=\"display: none;\">...</a>");
            }
        }
    }

    /**
     * @param s
     * @param entity
     * @param remarks
     */
    public static void addHtmlHead(final List<String> s, final String entity, final String remarks) {
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
    }

    /**
     * 履歴モデルでない かつ ビューでない かつ 転生元が必須でない<br>
     * 適用日を除く主キーが一つ か 組合せモデル か 主キーが２つ以上で全て採番キーでない
     * @param table
     * @return boolean
     */
    private static boolean isAnew(final TableInfo table) {

        // 履歴モデルなら作成不可
        if (table.isHistory()) {
            return false;
        }

        // 子モデルなら作成不可
        if (table.getParents().size() > 0) {
            return false;
        }

        // ビューなら作成不可
        if (table.isView()) {
            return false;
        }

        // 組合せモデルなら作成可
        if (table.getComboInfos().size() > 1) {
            return true;
        }

        // 転生元/*か派生元*/が必須なら作成不可
        for (ColumnInfo column : table.getColumns().values()) {
            if ((column.isReborn() /* || column.isDerive() */) && column.getNullable() != 1) {
                return false;
            }
        }

        List<String> primaryKeys = new ArrayList<String>(table.getPrimaryKeys());
        primaryKeys.remove(tekiyoBi);

        // 適用日を除く主キーが、一つなら作成可
        if (primaryKeys.size() == 1) {
            return true;
        }

        // 適用日を除く主キーが２以上ある

        // 適用日を除く主キーのうち、最終キー以外の一つでも、参照モデルでない採番キーなら作成不可
        for (int i = 0; i < primaryKeys.size() - 1; i++) {
            String pk = primaryKeys.get(i);
            ColumnInfo primaryKey = table.getColumns().get(pk);
            if (primaryKey.getRefer() == null && primaryKey.isNumbering()) {
                return false;
            }
        }

        return true;
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
            ColumnInfo primaryKey = table.getColumns().get(pk);
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

            ColumnInfo column = table.getColumns().get(columnName);
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
        String e = StringUtil.toPascalCase(table.getName());
        String remarks = table.getRemarks();
        List<String> s = new ArrayList<String>();
        addHtmlHead(s, e, remarks);
        s.add("<script th:src=\"@{/model/" + e + "GridColumns.js}\"></script>");
        Set<TableInfo> added = new HashSet<TableInfo>();
        added.add(table);
        htmlNestGrid(s, table, tables, added, false);
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + e + ".h2}\">h2</h2>");
        s.add("    <form name=\"" + e + "RegistForm\" action=\"" + e + "Regist.ajax\" class=\"regist\">");
        for (TableInfo parent : table.getParents()) { // 親モデル
            String p = StringUtil.toPascalCase(parent.getName());
            s.add("      <fieldset class=\"parent\">");
            s.add("        <legend th:text=\"#{" + p + ".legend}\">legend</legend>");
            htmlFields(parent, s, true, false, true);
            s.add("      </fieldset>");
        }
        String css = "";
        if (table.isView()) {
            css = " class=\"view\"";
        }
        s.add("      <fieldset" + css + ">");
        s.add("        <legend th:text=\"#{" + e + ".legend}\">legend</legend>");
        htmlFields(table, s, true, false, false);
        s.add("      </fieldset>");
        if (table.getYoungers() != null) { // 兄弟モデル
            for (TableInfo younger : table.getYoungers()) {
                String y = StringUtil.toPascalCase(younger.getName());
                s.add("      <fieldset>");
                s.add("        <legend th:text=\"#{" + y + ".legend}\">legend</legend>");
                htmlFields(younger, s, true, true, false);
                s.add("      </fieldset>");
            }
        }
        for (TableInfo child : table.getChilds()) { // 子テーブルリスト
            String c = StringUtil.toPascalCase(child.getName());
            s.add("      <h3 th:text=\"#{" + c + ".h3}\">h3</h3>");
            s.add("      <a th:href=\"@{/model/" + c + ".html}\" id=\"" + c + "\" target=\"dialog\" th:text=\"#{" + c
                    + ".add}\" class=\"addChild\" tabindex=\"-1\">" + child.getRemarks() + "</a>");
            String addRow = " data-addRow=\"true\"";
            for (ColumnInfo column : child.getColumns().values()) {
                if (StringUtil.endsWith(inputFileSuffixs, column.getName())) {
                    addRow = ""; // ファイル列がある場合は新規行を取消
                    break;
                }
            }
            String frozen = String.valueOf(table.getPrimaryKeys().size());
            s.add("      <div id=\"" + c + "Grid\" data-selectionMode=\"link\"" + addRow + " data-frozenColumn=\""
                    + frozen + "\" th:data-href=\"@{/model/" + c + ".html}\" class=\"childs\"></div>");
            addGridReferHiddenLinks(s, child);
        }
        s.add("      <div class=\"buttons\">");
        if (!table.isHistory() && !table.isView()) {
            s.add("        <button type=\"button\" id=\"Refresh" + e
                    + "\" th:text=\"#{common.reset}\" class=\"reset\" onClick=\"Dialogate.refresh(event);\">reset</button>");
        }
        s.add("        <a th:href=\"@{" + e + "Get.xlsx(baseMei=#{" + e + ".h2})}\" id=\""
                + e + "Get.xlsx\" th:text=\"#{common.xlsx}\" class=\"output\" tabindex=\"-1\">xlsx</a>");
        if (table.getRebornTo() != null) { // 転生先がある場合は追加ボタンを出力
            TableInfo reborn = table.getRebornTo();
            String r = StringUtil.toPascalCase(reborn.getName());
            s.add("        <a th:href=\"@{/model/" + r + ".html}\" id=\"" + r + "\" target=\"dialog\" th:text=\"#{" + r
                    + ".add}\" class=\"reborner\" tabindex=\"-1\">" + reborn.getRemarks() + "</a>");
        }
        if (table.getSummaryOf() != null) { // 集約元がある場合は主キー項目を出力
            TableInfo summary = table.getSummaryOf();
            String m = StringUtil.toPascalCase(summary.getName());
            // 転生先で必須でない場合でも、自モデルが他の転生先である場合は転生元となるよう変更したので、ここはコメントアウト
            //            if (table.getRebornTo() == null) {
            //                // 転生先（自主キーが必須の外部キーになっている）がなければ追加ボタンを出力（転生先で必須でないケース）
            //                s.add("        <a th:href=\"@{/model/" + e + ".html}\" id=\"" + e + "\" target=\"dialog\" th:text=\"#{" + e + ".add}\" class=\"reborner\" tabindex=\"-1\">" + summary.getRemarks() + "</a>");
            //            }
            for (String pk : summary.getPrimaryKeys()) {
                ColumnInfo primaryKey = summary.getColumns().get(pk);
                String p = StringUtil.toCamelCase(pk);
                s.add("        <div class=\"summary " + m + "s\">");
                s.add("          <label>" + primaryKey.getRemarks() + "</label>");
                s.add("          <span id=\"" + m + "." + p + "\"></span>");
                s.add("          <input type=\"hidden\" id=\"" + m + "." + p + "\" name=\"" + m + "." + p + "\"/>");
                s.add("        </div>");
            }
        }
        s.add("      </div>");
        s.add("      <div class=\"submits\">");
        // 履歴モデルでもビューでもない場合
        if (!table.isHistory() && !table.isView()) {
            // 削除フラグ列名の指定がないか、テーブルに削除フラグ列がないなら、物理削除ボタンを表示
            if (StringUtil.isNullOrBlank(deleteF) || (!table.getColumns().containsKey(deleteF.toLowerCase())
                    && !table.getColumns().containsKey(deleteF.toUpperCase()))) {
                s.add("        <button id=\"Delete" + e + "\" type=\"submit\" class=\"delete\" data-action=\"" + e
                        + "Delete.ajax\" th:text=\"#{common.delete}\" tabindex=\"-1\">削除</button>");
            }
            //ステータス列名の指定があり、テーブルにステータス列があるなら、承認ボタン・否認ボタンを表示
            if (!StringUtil.isNullOrBlank(status) && (table.getColumns().containsKey(status.toLowerCase())
                    || table.getColumns().containsKey(status.toUpperCase()))) {
                s.add("        <button id=\"Permit" + e + "\" type=\"submit\" class=\"permit\" data-action=\""
                        + e + "Permit.ajax\" th:text=\"#{common.permit}\" tabindex=\"-1\">承認</button>");
                s.add("        <button id=\"Forbid" + e + "\" type=\"submit\" class=\"forbid\" data-action=\""
                        + e + "Forbid.ajax\" th:text=\"#{common.forbid}\" tabindex=\"-1\">否認</button>");
            }
            String onclick = "";
            if (table.getHistory() != null && !StringUtil.isNullOrBlank(reason)) {
                onclick = " onclick=\"if (!Base.historyReason(this)) { return false; }\"";
            }
            s.add("        <button id=\"Regist" + e
                    + "\" type=\"submit\" class=\"regist\" th:text=\"#{common.regist}\"" + onclick + ">登録</button>");
        }
        s.add("      </div>");
        if (table.getRebornTo() != null) {
            TableInfo rebornTo = table.getRebornTo();
            String c = StringUtil.toPascalCase(rebornTo.getName());
            s.add("      <h3 th:text=\"#{" + c + ".h3}\">h3</h3>");
            String frozen = String.valueOf(table.getPrimaryKeys().size());
            s.add("      <div id=\"" + c + "Grid\" data-selectionMode=\"link\" data-frozenColumn=\"" + frozen
                    + "\" th:data-href=\"@{/model/" + c + ".html}\" class=\"reborners\"></div>");
        }
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");
        FileUtil.writeFile(htmlDir + File.separator + e + ".html", s);
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
        for (ColumnInfo column : table.getColumns().values()) {
            String property = StringUtil.toCamelCase(column.getName());
            s.add(entity + "." + property + " " + column.getRemarks());
            if (column.getDeriveFrom() != null) {
                s.add(entity + ".derivee" + StringUtil.toPascalCase(property) + " " + column.getRemarks());
            }
        }

        s.add("");
        for (ColumnInfo column : table.getColumns().values()) {
            String property = StringUtil.toCamelCase(column.getName());
            s.add(entity + "Grid." + property + " " + column.getRemarks());

        }
        for (TableInfo bros : table.getYoungers()) {
            String e = StringUtil.toPascalCase(bros.getName());
            s.add("");
            s.add(e + ".legend   " + bros.getRemarks());
            for (ColumnInfo column : bros.getColumns().values()) {
                String property = StringUtil.toCamelCase(column.getName());
                s.add(e + "." + property + " " + column.getRemarks());
            }
        }

        for (TableInfo parent : table.getParents()) {
            String e = StringUtil.toPascalCase(parent.getName());
            s.add("");
            s.add(e + ".legend   " + parent.getRemarks());
            for (ColumnInfo column : parent.getColumns().values()) {
                String property = StringUtil.toCamelCase(column.getName());
                s.add(e + "." + property + " " + column.getRemarks());
            }
        }

        for (TableInfo child : table.getChilds()) {
            String e = StringUtil.toPascalCase(child.getName());
            String mei = child.getRemarks();
            s.add("");
            s.add(e + ".h3  " + mei + "一覧");
            s.add(e + ".add " + mei + "追加");
            for (ColumnInfo column : child.getColumns().values()) {
                String property = StringUtil.toCamelCase(column.getName());
                s.add(e + "Grid." + property + " " + column.getRemarks());
            }
        }

        if (table.getRebornTo() != null) {
            TableInfo reborn = table.getRebornTo();
            String e = StringUtil.toPascalCase(reborn.getName());
            String mei = reborn.getRemarks();
            s.add("");
            s.add(e + ".h3  " + mei + "一覧");
            s.add(e + ".add " + mei + "追加");
            for (ColumnInfo column : reborn.getColumns().values()) {
                String property = StringUtil.toCamelCase(column.getName());
                s.add(e + "Grid." + property + " " + column.getRemarks());
            }
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
            if (table.getParents().size() > 0) {
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
            s.add("      <dt id=\"" + category + "\" style=\"clear: both;\" th:text=\"#{nav.dt." + category + "}\">"
                    + category + "</dt>");
            s.add("      <dd>");
            s.add("        <ul>");
            String preName = "";
            for (TableInfo table : nav.getValue()) {
                String name = table.getName();
                String remarks = table.getRemarks();
                String e = StringUtil.toPascalCase(name);
                String css = " class=\"table\"";
                String style = " style=\"clear: both; float: left;\"";
                if (table.isHistory()) {
                    css = " class=\"history\"";
                    style = " style=\"clear: both;\"";
                } else if (table.isView()) {
                    if (StringUtil.endsWith(viewNavIgnoreSuffixs, table.getName())) {
                        continue;
                    }
                    css = " class=\"view\"";
                    // 直前のテーブル名と前方一致するなら回り込み
                    if (name.startsWith(preName)) {
                        style = " style=\"float: left;\"";
                    }
                }
                preName = name;
                s.add("          <li" + style + "><a id=\"" + e + "\" th:href=\"@{/model/" + e
                        + "S.html}\" th:text=\"#{nav." + e + "S}\"" + css + ">" + remarks + "</a></li>");
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
     * @param isP
     */
    private static void htmlNestGrid(final List<String> s, final TableInfo table, final List<TableInfo> tables,
            final Set<TableInfo> added, final boolean isP) {

        //参照モデル
        for (ColumnInfo column : table.getColumns().values()) {

            TableInfo refer = column.getRefer();

            if (refer != null) {

                if (added.contains(refer)) {
                    continue;
                }

                String referName = refer.getName();
                String entity = StringUtil.toPascalCase(referName);
                s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                added.add(refer);

                htmlNestGrid(s, refer, tables, added, false);
            }
        }

        //兄弟モデルの参照モデル
        for (TableInfo bro : table.getYoungers()) {

            for (ColumnInfo column : bro.getColumns().values()) {

                TableInfo refer = column.getRefer();

                if (refer != null) {

                    if (added.contains(refer)) {
                        continue;
                    }

                    String referName = refer.getName();
                    String entity = StringUtil.toPascalCase(referName);
                    s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                    added.add(refer);

                    htmlNestGrid(s, refer, tables, added, false);
                }
            }
        }

        //親モデル
        for (TableInfo parent : table.getParents()) {

            if (added.contains(parent)) {
                continue;
            }

            String parentName = parent.getName();
            String entity = StringUtil.toPascalCase(parentName);
            s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
            added.add(parent);

            htmlNestGrid(s, parent, tables, added, true);
        }

        //子モデル
        for (TableInfo child : table.getChilds()) {

            if (added.contains(child)) {
                continue;
            }

            String childName = child.getName();
            String entity = StringUtil.toPascalCase(childName);
            s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
            added.add(child);

            htmlNestGrid(s, child, tables, added, false);
        }

        //転生先モデル
        if (table.getRebornTo() != null) {
            TableInfo rebornTo = table.getRebornTo();
            if (!added.contains(rebornTo)) {
                added.add(rebornTo);
                String entity = StringUtil.toPascalCase(rebornTo.getName());
                s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                htmlNestGrid(s, rebornTo, tables, added, false);
            }
        }

        // 転生元モデル
        if (table.getRebornFroms().size() > 1) {
            for (TableInfo reFrom : table.getRebornFroms()) {
                if (!added.contains(reFrom)) {
                    String entity = StringUtil.toPascalCase(reFrom.getName());
                    s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                    added.add(reFrom);
                    htmlNestGrid(s, reFrom, tables, added, false);
                }
            }
        }

        // 派生元モデル
        if (!isP) {
            for (ColumnInfo column : table.getColumns().values()) {
                if ((table.getParents() == null || table.getParents().size() == 0) && column.getDeriveFrom() != null) {
                    TableInfo deriveFrom = column.getDeriveFrom();
                    if (!added.contains(deriveFrom)) {
                        String entity = StringUtil.toPascalCase(deriveFrom.getName());
                        s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                        added.add(deriveFrom);
                        htmlNestGrid(s, deriveFrom, tables, added, false);
                    }
                }
            }
        }

        //集約元モデル
        if (table.getSummaryOf() != null) {
            TableInfo summary = table.getSummaryOf();
            if (!added.contains(summary)) {
                String entity = StringUtil.toPascalCase(summary.getName());
                s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                added.add(summary);
                htmlNestGrid(s, summary, tables, added, false);
            }
        }

        //集約先モデル
        TableInfo summary = getSummary(table, tables);
        if (summary != null) {
            if (!added.contains(summary)) {
                String entity = StringUtil.toPascalCase(summary.getName());
                s.add("<script th:src=\"@{/model/" + entity + "GridColumns.js}\"></script>");
                added.add(summary);
                htmlNestGrid(s, summary, tables, added, false);
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
                if (table.getParents() != null) {
                    for (TableInfo parent : table.getParents()) {
                        List<String> primaryKeys = new ArrayList<String>(parent.getPrimaryKeys());
                        primaryKeys.remove(tekiyoBi);
                        if (primaryKeys.contains(name)) {
                            isParentKey = true;
                            break;
                        }
                    }
                }
                if ((column.isNumbering() && column.getRefer() == null) || isParentKey) {
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
        TableInfo referInfo = column.getRefer();
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
                        // 名称列がテーブルに含まれている場合は参照先から名称を取得しない
                        if (table.getColumns().containsKey(tempMei)) {
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
                    String[] keySuffixs = suffix[0].split("&");
                    String meiSuffix = suffix[1];
                    if (StringUtil.endsWith(keySuffixs, name)) {
                        // カラム名の末尾を名称列サフィックスに変換して、名称列が参照先テーブルに含まれている場合は、取得する名称を決定する
                        String lastSuffix = keySuffixs[keySuffixs.length - 1];
                        String tempMei = name.replaceAll("(?i)" + lastSuffix + "$", meiSuffix).toUpperCase();
                        for (ColumnInfo referColumnInfo : referInfo.getColumns().values()) {
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
            c = "Column.month('" + name + "', " + mei + ", " + w + ", '" + css + "', Slick.Formatters.Extends.Month),";
        } else if (StringUtil.endsWith(inputHourSuffixs, name)) {
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
     * @param isP 親モデルならtrue
     */
    private static void htmlFields(final TableInfo table, final List<String> s, final boolean isD, final boolean isB,
            final boolean isP) {
        //検索画面の場合は制約モデルの参照キーを出力
        if (!isD && table.getStintInfo() != null) {
            htmlFieldsStint(table, s);
        }
        String entity = StringUtil.toPascalCase(table.getName());
        // カラム情報でループ
        for (ColumnInfo column : table.getColumns().values()) {
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
            TableInfo rebornFrom = null;
            if (table.getRebornFroms().size() > 1) {
                for (TableInfo reFrom : table.getRebornFroms()) {
                    for (String pk : reFrom.getPrimaryKeys()) {
                        if (column.getName().equals(pk)) {
                            rebornFrom = reFrom;
                            break;
                        }
                    }
                }
            }
            String referCss = addCssByRelation(isD, table, column);
            if (!StringUtil.isNullOrBlank(referCss)) {
                referCss = " class=\"" + referCss + "\"";
            }
            String fieldId = entity + "." + property;
            s.add("        <div id=\"" + property + "\">");
            if (isInsertDt || isUpdateDt || isInsertBy || isUpdateBy) { // メタ情報の場合は表示項目（編集画面の自モデルのみここに到達する）
                htmlFieldsMeta(s, fieldId, column.getRemarks());
                addMeiSpan(s, table, column);
            } else if (StringUtil.endsWith(optionsSuffixs, colName) && column.getRefer() == null) {
                // 選択項目の場合（サフィックスが合致しても参照モデルなら除外）
                String css = "";
                if (isD && column.isPk()) { // 詳細画面の主キー
                    css += " primaryKey";
                }
                if (isD && table.isHistory()) { // 履歴モデルの詳細画面
                    css += " history";
                } else if (isD && column.isReborn()) { // 詳細画面の転生元外部キー
                    css += " rebornee";
                } else if (isD && column.getDeriveFrom() != null) { // 詳細画面の派生元外部キー
                    css += " derivee";
                } else if (isD && column.isSummary()) { // 詳細画面の集約先外部キー
                    css += " summary";
                }
                if (isD && column.getNullable() == 0) {
                    css += isNotBlank(column);
                }
                htmlFieldsOptions(s, fieldId, colName, column.getRemarks(), css);
            } else if (isD && table.isHistory()) { // 履歴モデルの詳細画面
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "history");
                addMeiSpan(s, table, column);
            } else if (isD && column.isReborn()) { // 詳細画面の転生元外部キー
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "rebornee");
                if (!isP && rebornFrom != null) {
                    String referName = StringUtil.toPascalCase(rebornFrom.getName());
                    String href = "/model/" + referName + "S.html?action=" + referName + "Correct.ajax";
                    s.add("          <a id=\"" + fieldId + "\" th:href=\"@{" + href + "}\" target=\"dialog\"" + referCss
                            + " th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>");
                }
            } else if (isD && column.getDeriveFrom() != null) { // 詳細画面の派生元外部キー
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "derivee");
                // 派生元は参照しない
                // String referCss = " class=\"derivee\"";
                // if (!isP && (table.getParents() == null || table.getParents().size() == 0)) {
                //     String referName = StringUtil.toPascalCase(column.getDeriveFrom().getName());
                //     s.add("          <a id=\"" + fieldId + "\" th:href=\"@{/model/" + referName + "S.html?action=" + referName + "Correct.ajax}\" target=\"dialog\"" + referCss + " th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>");
                // }
            } else if (isD && column.isSummary()) { // 詳細画面の集約先外部キー
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "summary");
            } else if (StringUtil.endsWith(inputTimestampSuffixs, colName)) { // タイムスタンプの場合
                htmlFieldsSpan(s, fieldId, column.getRemarks(), "");
            } else if (isD && StringUtil.endsWith(textareaSuffixs, colName)) { // テキストエリア項目の場合
                String css = "";
                if (isD && column.getNullable() == 0) {
                    css += isNotBlank(column);
                }
                htmlFieldsTextarea(s, fieldId, column.getRemarks(), css);
            } else { // inputの場合
                String type = getInputType(colName);
                String inputCss = addCssByRelation(isD, table, column);
                // 詳細画面の必須項目
                if (isD && column.getNullable() == 0) {
                    inputCss += isNotBlank(column);
                }
                // 日付項目および8桁日付項目
                if (StringUtil.endsWith(inputDateSuffixs, colName)) {
                    inputCss += " datepicker";
                } else if (StringUtil.endsWith(inputDate8Suffixs, colName) && column.getColumnSize() == 8) {
                    inputCss += " datepicker";
                } else if (StringUtil.endsWith(inputTimeSuffixs, colName)) {
                    inputCss += " time";
                }
                if (!StringUtil.isNullOrBlank(inputCss)) {
                    inputCss = " class=\"" + inputCss + "\"";
                }
                String format = "";
                if (StringUtil.endsWith(inputDate8Suffixs, colName) && column.getColumnSize() == 8) { // 8桁日付項目
                    format = "yymmdd";
                }
                if (!isD && StringUtil.endsWith(inputRangeSuffixs, colName)) { // 検索画面の範囲指定項目の場合
                    s.add(htmlFieldsRange(fieldId, type, inputCss, column, format));
                } else if (column.getRefer() != null) { // 参照モデルの場合
                    s.add(htmlFieldsRefer(fieldId, type, inputCss, column, format, table, referCss));
                } else {
                    s.add(htmlFieldsInput(fieldId, type, inputCss, column, format));
                    if (rebornFrom != null) {
                        String referName = StringUtil.toPascalCase(rebornFrom.getName());
                        String href = "/model/" + referName + "S.html?action=" + referName + "Correct.ajax";
                        s.add("          <a id=\"" + fieldId + "\" th:href=\"@{" + href + "}\" target=\"dialog\""
                                + referCss + " th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>");
                    }
                }
            }
            s.add("        </div>");
        }
    }

    /**
     * @param column
     * @return String
     */
    private static String isNotBlank(final ColumnInfo column) {
        if (!column.isPk() && column.getTypeName().equals("CHAR")
                && !StringUtil.isNullOrBlank(charNotNullRe) && !column.getName().matches(charNotNullRe)) {
            LOG.trace("skip NotBlank.");
        } else {
            return " notblank";
        }
        return "";
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
        if (isD && column.getRefer() != null) {
            css += " refer";

            // 詳細画面の制約キー
            TableInfo refer = column.getRefer();
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

        } else if (StringUtil.endsWith(inputHourSuffixs, colName)) {
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
                ColumnInfo column = stint.getColumns().get(pk);
                if (column.getRefer() != null) {
                    TableInfo refer = column.getRefer();
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

        if (column.getRefer() != null) {
            TableInfo refer = column.getRefer();

            String entity = StringUtil.toPascalCase(table.getName());
            String meiColumnName = getMeiColumnName(column.getName(), refer);

            if (meiColumnName != null && !table.getColumns().containsKey(meiColumnName)) {

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

        TableInfo refer = column.getRefer();
        String referName = StringUtil.toPascalCase(refer.getName());
        String referDef = getReferDef(entity, colName, refer);
        tag += "<input type=\"" + type + "\" id=\"" + fieldId + "\" name=\"" + fieldId + "\" maxlength=\"" + max + "\""
                + css + referDef + dataFormat + " />";

        if (referCss.contains("correct")) {
            //選択リンク
            String href = "/model/" + referName + "S.html?action=" + referName + "Correct.ajax";
            tag += "<a id=\"" + fieldId + "\" th:href=\"@{}" + href + "\" target=\"dialog\"" + referCss
                    + " th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>";
        } else {
            //参照リンク
            String href = "/model/" + referName + "S.html";
            tag += "<a id=\"" + fieldId + "\" th:href=\"@{" + href + "}\" target=\"dialog\"" + referCss
                    + " th:text=\"#{common.refer}\" tabindex=\"-1\">...</a>";
        }

        String meiColName = getMeiColumnName(colName, refer);
        if (meiColName != null && !table.getColumns().containsKey(meiColName)) {
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
     * @param css css
     */
    private static void htmlFieldsTextarea(final List<String> s, final String id, final String remarks,
            final String css) {

        String cssClass = "";
        if (!StringUtil.isNullOrBlank(css)) {
            cssClass = " class=\"" + css + "\"";
        }

        s.add("          <label for=\"" + id + "\" th:text=\"#{" + id + "}\">" + remarks + "</label>");
        s.add("          <textarea id=\"" + id + "\" name=\"" + id + "\"" + cssClass + "></textarea>");
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
                for (String destColumnName : referInfo.getColumns().keySet()) {
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

        for (String[] e : referPairs) {
            String[] keySufs = e[0].split("&");
            String valSuf = e[1];

            // カラム名が参照キーに合致する場合
            if (StringUtil.endsWith(keySufs, columnName)) {

                for (String keySuf : keySufs) {

                    // カラム名が参照キーに合致しなければスキップ
                    if (!columnName.matches("(?i)^.*" + keySuf + "$")) {
                        continue;
                    }

                    // カラム名のIDサフィックスを名称サフィックスに置換して名称カラム名を取得
                    String srcIdColumn = columnName;
                    String srcMeiColumn = srcIdColumn.replaceAll("(?i)" + keySuf + "$", valSuf);

                    // 参照先テーブルの全カラム名を確認して、末尾が合致するカラム名を、参照先のID・名称カラム名として取得
                    String destIdColumn = null;
                    String destMeiColumn = null;
                    for (String destColumnName : referInfo.getColumns().keySet()) {
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
        }

        return null;
    }

}
