package jp.co.golorp.emarf.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;

/**
 * HTMLファイル出力
 *
 * @author golorp
 */
public final class HtmlGeneratorGantt extends HtmlGenerator {

    /**
     * コンストラクタ
     */
    private HtmlGeneratorGantt() {
    }

    /**
     * ガント画面 HTML出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param table テーブル情報
     * @param tables テーブル情報
     */
    public static void htmlGantt(final String htmlDir, final TableInfo table, final List<TableInfo> tables) {
        String e = StringUtil.toPascalCase(table.getName());
        String es = e + "S";
        String remarks = table.getRemarks();
        List<String> s = new ArrayList<String>();
        addHtmlHead(s, es, remarks);
        s.add("<script th:src=\"@{/model/" + e + ".js}\"></script>");
        s.add("<script th:src=\"@{/model/" + e + "GridColumns.js}\"></script>");
        Map<TableInfo, Integer> added = new HashMap<TableInfo, Integer>();
        added.put(table, 1);
        htmlNestGrid(s, table, tables, added, false, "", false);
        s.add("</head>\r\n<body>\r\n  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + es + ".h2}\">h2</h2>\r\n    <!-- 検索フォーム -->");
        s.add("    <form name=\"" + e + "SearchForm\" action=\"" + e + "Search.ajax\" class=\"search\">");
        s.add("      <input type=\"hidden\" name=\"rows\" value=\"" + GRID_ROWS + "\" />");
        s.add("      <input type=\"hidden\" name=\"page\" value=\"0\" />");
        s.add("      <fieldset>\r\n        <legend th:text=\"#{" + es + ".legend}\">legend</legend>");
        htmlFields(table, s, false, false, false);
        s.add("      </fieldset>\r\n      <div class=\"buttons\">");
        s.add("        <button type=\"button\" id=\"Reset" + e
                + "\" th:text=\"#{common.reset}\" class=\"reset\" onClick=\"Dialogate.reset(event);\">reset</button>");
        boolean isAnew = isAnew(table);
        if (isAnew || table.getRebornFrom() != null) {
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
            s.add("        <a th:href=\"@{/model/" + e + ".html(anew)}\" target=\"dialog\" id=\"" + e + "\" class=\""
                    + anewClass + "\" th:text=\"#{" + e + ".add}\" tabindex=\"-1\">" + remarks + "</a>");
            if (table.getName().matches(ELDEST_RE)) {
                for (TableInfo bro : table.getBrothers()) {
                    String b = StringUtil.toPascalCase(bro.getName());
                    s.add("        <a th:href=\"@{/model/" + b + ".html}\" target=\"dialog\" id=\"" + b + "\" class=\""
                            + anewClass + "\" style=\"display: none;\" th:text=\"#{" + b + ".add}\" tabindex=\"-1\">"
                            + bro.getRemarks() + "</a>");
                }
            }
            if (isDeriver) {
                HashSet<String> deriveFroms = new HashSet<String>();
                for (ColumnInfo col : table.getColumns().values()) {
                    if (col.getDeriveFrom() != null && !deriveFroms.contains(col.getDeriveFrom().getName())) {
                        deriveFroms.add(col.getDeriveFrom().getName());
                        String fieldId = null;
                        for (String pk : col.getDeriveFrom().getPrimaryKeys()) {
                            fieldId = e + ".derivee" + StringUtil.toPascalCase(pk);
                            s.add(htmlFieldsInput(fieldId, "text", "", col.getDeriveFrom().getColumns().get(pk), null));
                        }
                        String referName = StringUtil.toPascalCase(col.getDeriveFrom().getName());
                        s.add("          <a id=\"" + fieldId + "\" th:href=\"@{/model/" + referName + "S.html?action="
                                + referName + "Correct.ajax}\" target=\"dialog\" class=\"derivee\" "
                                + "th:text=\"#{common.correct}\" tabindex=\"-1\">...</a>");
                    }
                }
            }
        }
        s.add("      </div>\r\n      <div class=\"submits\">");
        s.add("        <button id=\"Search" + e + "\" type=\"submit\" class=\"search\" data-ganttId=\"" + e
                + "Gantt\" th:text=\"#{common.search}\">submit</button>\r\n      </div>\r\n    </form>\r\n    <!-- 一覧フォーム -->");
        s.add("    <h3 th:text=\"#{" + e + ".h3}\">h3</h3>");
        s.add("    <div class=\"ganttWrapper\">");
        s.add("      <svg id=\"" + e + "Gantt\" class=\"gantt\" th:data-href=\"@{/model/" + e + ".html}\"></svg>");
        s.add("    </div>");
        s.add("  </div>\r\n</body>\r\n</html>");
        FileUtil.writeFile(htmlDir + File.separator + e + "G.html", s);
    }

    /**
     * ガント画面 タスク定義出力
     * @param gridDir グリッド出力ディレクトリ
     * @param table テーブル情報
     */
    public static void htmlGanttTasks(final String gridDir, final TableInfo table) {

        String entity = StringUtil.toPascalCase(table.getName());

        List<String> s = new ArrayList<String>();
        s.add("/**");
        s.add(" * " + table.getRemarks() + "ガント定義");
        s.add(" */");
        s.add("");
        s.add("let " + entity + "GanttTasks = {");
        s.add("");
        s.add("    load: function(data) {");
        s.add("");
        s.add("        let tasks = [];");
        s.add("");
        s.add("        for (let r in data) {");
        s.add("            let row = data[r];");
        s.add("");
        s.add("            let task = {};");
        s.add("            task.id = row.KOUTEI_ID;");
        s.add("            task.name = row.KOUTEI_MEI;");
        s.add("            task.start = row.KAISHI_BI;");
        s.add("            task.end = row.SHURYO_BI;");
        s.add("            task.dependencies = row.OYA_KOUTEI_ID ? row.OYA_KOUTEI_ID + '' : '';");
        s.add("");
        s.add("            tasks.push(task);");
        s.add("        }");
        s.add("");
        s.add("        return tasks;");
        s.add("    }");
        s.add("};");

        //        s.add("/**");
        //        s.add(" * " + table.getRemarks() + "タスク定義");
        //        s.add(" */");
        //        s.add("");
        //        //grid列名が取れない事があるのでonloadまで遅らせる
        //        s.add("let " + entity + "GanttTasks = [];");
        //        s.add("");
        //        s.add("$(function() {");
        //        s.add("    " + entity + "GanttTasks = [");
        //
        //        //主キー列の出力
        //        if (!table.isView()) {
        //            for (String pk : table.getPrimaryKeys()) {
        //                ColumnInfo primaryKey = table.getColumns().get(pk);
        //                String gridColumn = htmlGridColumn(table, primaryKey, "");
        //                if (gridColumn != null) {
        //                    s.add("        " + gridColumn);
        //                }
        //            }
        //        }
        //
        //        //非主キー列の出力
        //        for (String columnName : table.getNonPrimaryKeys()) {
        //
        //            //VIEWなら「SEARCH_」を出力しない
        //            if (table.isView() && StringUtil.startsWith(viewCriteriaPrefixs, columnName)) {
        //                continue;
        //            }
        //
        //            //カラム名が「TABLE_NAME」なら出力しない
        //            if (columnName.matches("(?i)^" + viewDetail + "$")) {
        //                continue;
        //            }
        //
        //            ColumnInfo column = table.getColumns().get(columnName);
        //            String gridColumn = htmlGridColumn(table, column, "");
        //            if (gridColumn != null) {
        //                s.add("        " + gridColumn);
        //            }
        //        }
        //
        //        if (table.getName().matches(eldestRe)) {
        //            for (TableInfo bro : table.getBrothers()) {
        //                for (String colName : bro.getNonPrimaryKeys()) {
        //                    if (colName.matches("(?i)^" + updateTs + "$")) {
        //                        continue;
        //                    }
        //                    ColumnInfo column = bro.getColumns().get(colName);
        //                    String gridColumn = htmlGridColumn(bro, column, bro.getName() + ".");
        //                    if (gridColumn != null) {
        //                        s.add("        " + gridColumn);
        //                    }
        //                }
        //            }
        //        }
        //
        //        s.add("    ];");
        //        s.add("});");

        FileUtil.writeFile(gridDir + File.separator + entity + "GanttTasks.js", s);
    }

}
