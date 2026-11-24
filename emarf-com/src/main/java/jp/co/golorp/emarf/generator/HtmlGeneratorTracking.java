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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;

/**
 * HTMLファイル出力
 *
 * @author golorp
 */
public final class HtmlGeneratorTracking extends HtmlGenerator {

    /**
     * コンストラクタ
     */
    private HtmlGeneratorTracking() {
    }

    /**
     * 時刻表画面 HTML出力
     * @param htmlDir HTMLファイル出力ディレクトリ
     * @param table テーブル情報
     * @param tables テーブル情報
     */
    public static void htmlTrack(final String htmlDir, final TableInfo table, final List<TableInfo> tables) {
        String e = StringUtil.toPascalCase(table.getName());
        String es = e + "T";
        List<String> s = new ArrayList<String>();
        addHtmlHead(s, es, table.getName());
        s.add("<script th:src=\"@{/model/" + e + ".js}\"></script>");
        s.add("<script th:src=\"@{/model/" + e + "Tracks.js}\"></script>");
        s.add("<script type=\"text/javascript\">");
        s.add("    Tracking.tracks = " + e + "Tracks;");
        s.add("</script>");
        Map<TableInfo, Integer> added = new HashMap<TableInfo, Integer>();
        added.put(table, 1);
        htmlNestGrid(s, table, tables, added, false, "", false);
        s.add("</head>");
        s.add("<body>");
        s.add("  <div layout:fragment=\"article\">");
        s.add("    <h2 th:text=\"#{" + es + ".h2}\">h2</h2>");
        s.add("    <!-- 検索フォーム -->");
        s.add("    <form name=\"" + e + "SearchForm\" action=\"" + e + "Search.ajax\" class=\"search\">");
        s.add("      <table class=\"tracking\">");
        s.add("        <caption>");
        s.add("          <a href=\"javascript:void(0);\" class=\"trackPrevDay\">&lt;&lt;</a><input type=\"text\" name=\"yyyy\" style=\"display: inline;\">年<input type=\"text\" name=\"mm\" style=\"display: inline;\">月<input type=\"text\" name=\"dd\" style=\"display: inline;\">日<a href=\"javascript:void(0);\" class=\"trackNextDay\">&gt;&gt;</a>");
        s.add("          <button type=\"button\" id=\"SearchTracks\">更新</button>");
        s.add("        </caption>");
        s.add("        <thead>");
        s.add("          <tr>");
        s.add("            <th>&nbsp;</th>");
        s.add("            <td>&nbsp;</td>");
        s.add("          </tr>");
        s.add("        </thead>");
        s.add("        <tbody></tbody>");
        s.add("        <tfoot>");
        s.add("          <tr>");
        s.add("            <th>&nbsp;</th>");
        s.add("            <td id=\"totalTime\"></td>");
        s.add("          </tr>");
        s.add("        </tfoot>");
        s.add("      </table>");
        s.add("    </form>");
        s.add("  </div>");
        s.add("</body>");
        s.add("</html>");
        FileUtil.writeFile(htmlDir + File.separator + e + "T.html", s);
    }

}
