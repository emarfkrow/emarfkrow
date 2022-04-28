package jp.co.golorp.emarf.sql;

import jp.co.golorp.emarf.util.MapList;

/**
 * MySQL用データソース実装
 *
 * @author toshiyuki
 *
 */
public class DataSourcesAssistMySQL extends DataSourcesAssist {

    /**
     * テーブルコメント取得
     *
     * @param tableName テーブル名
     * @return テーブルコメント
     */
    protected String getTableComment(final String tableName) {
        String sql = "show table status where name = '" + tableName + "'";
        MapList mapList = Queries.select(sql);
        return mapList.get(0).get("TABLE_COMMENT").toString();
    }

}
