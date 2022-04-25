package jp.co.golorp.emarf.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;
import jp.co.golorp.emarf.util.Messages;

/**
 * 検索の汎用アクション
 * @author toshiyuki
 */
public class SearchAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String sql = this.loadSqlFile(this.getBaseName());

        MapList list = Queries.select(sql, postJson);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put(this.getBaseName(), list);

        if (list == null) {
            map.put("INFO", Messages.get("info.nodata"));
        }

        return map;
    }

}
