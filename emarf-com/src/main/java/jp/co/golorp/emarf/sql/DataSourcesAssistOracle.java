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

package jp.co.golorp.emarf.sql;

import java.util.Map;

import jp.co.golorp.emarf.util.MapList;

/**
 * Oracle用データソース実装
 *
 * @author golorp
 */
public class DataSourcesAssistOracle extends DataSourcesAssist {

    /**
     * @param tableName テーブル名
     * @return テーブルコメント
     */
    protected String getTableComment(final String tableName) {
        String sql = "SELECT COMMENTS FROM USER_TAB_COMMENTS WHERE TABLE_NAME = '" + tableName + "'";
        MapList mapList = Queries.select(sql);
        Map<String, Object> map = mapList.get(0);
        if (map.get("COMMENTS") != null) {
            return map.get("COMMENTS").toString();
        }
        return null;
    }

    /**
     * @param tableName テーブル名
     * @param columnName カラム名
     * @return カラムコメント
     */
    protected String getColumnComment(final String tableName, final String columnName) {
        String sql = "SELECT COMMENTS FROM USER_COL_COMMENTS WHERE TABLE_NAME = '" + tableName + "' AND COLUMN_NAME = '"
                + columnName + "'";
        MapList mapList = Queries.select(sql);
        Map<String, Object> map = mapList.get(0);
        if (map.get("COMMENTS") != null) {
            return map.get("COMMENTS").toString();
        }
        return null;
    }

    /**
     * @param array 文字列配列
     * @return 結合後の文字列
     */
    public String join(final String[] array) {
        return String.join(" || ", array);
    }

    /**
     * @param s カラム物理名
     * @return タイムスタンプ変換SQL
     */
    public String toTimestamp(final String s) {
        return "TO_TIMESTAMP (" + s + ", 'YYYY-MM-DD\\\"T\\\"HH24:MI:SS.FF3')";
    }

    /**
     * @param columnName カラム物理名
     * @return 囲み後のSQL文字列
     */
    public String quoted(final String columnName) {
        return "\"" + columnName + "\"";
    }

    /**
     * @param columnName カラム物理名
     * @return エスケープ済みで囲み後のSQL文字列
     */
    public String quoteEscaped(final String columnName) {
        return "\\\"" + columnName + "\\\"";
    }

}
