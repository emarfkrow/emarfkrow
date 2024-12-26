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

import jp.co.golorp.emarf.util.MapList;

/**
 * MySQL用データソース実装
 *
 * @author golorp
 */
public final class DataSourcesAssistMySQL extends DataSourcesAssist {

    @Override
    protected String getTableComment(final String tableName) {
        String sql = "show table status where name = '" + tableName + "'";
        MapList mapList = Queries.select(sql, null, null);
        return mapList.get(0).get("TABLE_COMMENT").toString();
    }

    @Override
    protected String getColumnComment(final String tableName, final String columnName) {
        return null;
    }

    @Override
    protected MapList getUniqueIndexes(final String tableName) {
        MapList mapList = Queries.select("show index from " + tableName, null, null);
        return mapList;
    }

    @Override
    public String joinedSQL(final String[] array) {
        return "CONCAT (" + String.join(", ", array) + ")";
    }

    @Override
    public String toDateSQL(final String s) {
        return s;
    }

    @Override
    public String toDateTimeSQL(final String s) {
        return s;
    }

    @Override
    public String toTimestampSQL(final String s) {
        return s;
    }

    @Override
    public String formatedSQL(final String s, final String format) {
        return s;
    }

    @Override
    public String quotedSQL(final String columnName) {
        return "`" + columnName + "`";
    }

    @Override
    public String quoteEscapedSQL(final String columnName) {
        return "`" + columnName + "`";
    }

    @Override
    public String addIdColumn(final String sql) {
        return "SELECT ROW_NUMBER () OVER () AS \"id\", sub.* FROM (" + sql + ") sub ORDER BY ROW_NUMBER () OVER ()";
    }

    @Override
    public String getPagedSql(final String sql, final Integer rows, final Integer page) {
        int firstRow = (page - 1) * rows;
        return sql + " limit " + firstRow + ", " + rows;
    }

    @Override
    public String trimedSQL(final String columnName) {
        return "TRIM(TRAILING ' ' FROM " + columnName + ")";
    }

    @Override
    public String date2CharSQL(final String s) {
        return s;
    }

    @Override
    public String dateTime2CharSQL(final String s) {
        return s;
    }

    @Override
    public String timestamp2CharSQL(final String s) {
        return s;
    }

}
