package jp.co.golorp.emarf.sql;

import jp.co.golorp.emarf.util.MapList;

/**
 * MySQL用データソース実装
 *
 * @author toshiyuki
 *
 */
public final class DataSourcesAssistMySQL extends DataSourcesAssist {

    @Override
    protected String getTableComment(final String tableName) {
        String sql = "show table status where name = '" + tableName + "'";
        MapList mapList = Queries.select(sql);
        return mapList.get(0).get("TABLE_COMMENT").toString();
    }

    @Override
    protected String getColumnComment(final String tableName, final String columnName) {
        return null;
    }

    @Override
    public String join(final String[] array) {
        return "CONCAT (" + String.join(", ", array) + ")";
    }

    @Override
    public String toTimestamp(final String s) {
        return s;
    }

    @Override
    public String quoted(final String columnName) {
        return "`" + columnName + "`";
    }

    @Override
    public String quoteEscaped(final String columnName) {
        return "`" + columnName + "`";
    }

}
