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
        MapList mapList = Queries.select(sql, null, null);
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
        MapList mapList = Queries.select(sql, null, null);
        Map<String, Object> map = mapList.get(0);
        if (map.get("COMMENTS") != null) {
            return map.get("COMMENTS").toString();
        }
        return null;
    }

    /**
     * @param tableName テーブル名
     * @return 複数のユニークインデクスについての列情報
     */
    protected MapList getUniqueIndexes(final String tableName) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT \n");
        sb.append("    uic.* \n");
        sb.append("FROM \n");
        sb.append("    ( \n");
        sb.append("        SELECT \n");
        sb.append("            ui.table_name \n");
        sb.append("            , ui.index_name \n");
        sb.append("            , COUNT(uic.column_name) AS column_count \n");
        sb.append("        FROM \n");
        sb.append("            user_indexes ui                     --インデクス \n");
        sb.append("            INNER JOIN user_ind_columns uic     --インデクス列 \n");
        sb.append("                ON uic.table_name = ui.table_name \n");
        sb.append("                AND uic.index_name = ui.index_name \n");
        sb.append("            LEFT OUTER JOIN user_constraints uc --主キー \n");
        sb.append("                ON uc.owner = ui.table_owner \n");
        sb.append("                AND uc.table_name = ui.table_name \n");
        sb.append("                AND uc.constraint_type = 'P' \n");
        sb.append("        WHERE \n");
        sb.append("            ui.table_name = '" + tableName + "' \n");
        sb.append("            AND ui.index_type = 'NORMAL' \n");
        sb.append("            AND ui.uniqueness = 'UNIQUE' \n");
        sb.append("            AND uc.owner IS NULL                --主キー以外のインデクス \n");
        sb.append("        GROUP BY \n");
        sb.append("            ui.table_name \n");
        sb.append("            , ui.index_name \n");
        sb.append("    ) ui \n");
        sb.append("    INNER JOIN user_ind_columns uic             --インデクス列 \n");
        sb.append("        ON uic.table_name = ui.table_name \n");
        sb.append("        AND uic.index_name = ui.index_name \n");
        sb.append("ORDER BY \n");
        sb.append("    ui.table_name \n");
        sb.append("    , ui.column_count \n");
        sb.append("    , ui.index_name \n");
        sb.append("    , uic.column_position \n");
        String sql = sb.toString();
        MapList mapList = Queries.select(sql, null, null);
        return mapList;
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

    /**
     * @param sql 発行するSQL
     * @return ID列を付加したSQL
     */
    public String addIdColumn(final String sql) {
        return "SELECT ROWNUM AS \"id\", sub.* FROM (" + sql + ") sub ORDER BY ROWNUM";
    }

    /**
     * @param sql  発行するSQL
     * @param rows ページ行数
     * @param page ページ番号
     * @return ページ繰りしたSQL
     */
    public String getPagedSql(final String sql, final Integer rows, final Integer page) {
        int firstRow = (page - 1) * rows;
        String pagedSql = "";
        pagedSql += "SELECT ";
        pagedSql += "    B.* ";
        pagedSql += "FROM ";
        pagedSql += "    (";
        pagedSql += "        SELECT ";
        pagedSql += "            ROWNUM AS ROW_NUM, ";
        pagedSql += "            A.* ";
        pagedSql += "        FROM ";
        pagedSql += "            (";
        pagedSql += sql;
        pagedSql += "            ) A";
        pagedSql += "    ) B ";
        pagedSql += "WHERE ";
        pagedSql += "    B.ROW_NUM BETWEEN " + firstRow + " AND " + (firstRow + rows - 1);
        return pagedSql;
    }

    /**
     * @param columnName カラム名
     * @return 全半角スペースのトリム文字列
     */
    public String trimed(final String columnName) {
        return "RTRIM (RTRIM (" + columnName + "), '　')";
    }

}
