package jp.co.golorp.emarf.sql;

import java.util.Map;

import jp.co.golorp.emarf.util.MapList;

/**
 * Oracle用データソース実装
 * @author toshiyuki
 *
 */
public final class DataSourcesAssistOracle extends DataSourcesAssist {

    @Override
    protected String getTableComment(final String tableName) {
        String sql = "SELECT COMMENTS FROM USER_TAB_COMMENTS WHERE TABLE_NAME = '" + tableName + "'";
        MapList mapList = Queries.select(sql);
        Map<String, Object> map = mapList.get(0);
        if (map.get("COMMENTS") != null) {
            return map.get("COMMENTS").toString();
        }
        return null;
    }

    @Override
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

    @Override
    public String join(final String[] array) {
        return String.join(" || ", array);
    }

    @Override
    public String toTimestamp(final String s) {
        return "TO_TIMESTAMP (" + s + ", 'YYYY-MM-DD\\\"T\\\"HH24:MI:SS.FF3')";
    }

}
