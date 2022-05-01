package jp.co.golorp.emarf.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;
import jp.co.golorp.emarf.util.Messages;

/**
 * 検索の汎用アクション
 * @author toshiyuki
 */
public class DownloadAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String sql = this.loadSqlFile(this.getBaseName());

        MapList list = Queries.select(sql, postJson);

        Map<String, Object> map = new HashMap<String, Object>();

        if (list == null) {
            map.put("INFO", Messages.get("info.nodata"));
        } else {
            Map<String, Object> row = list.get(0);
            String name = postJson.get("name").toString();
            String filePathColumnName = StringUtil.toUpperCase(name);
            String fileMeiColumnName = StringUtil.toUpperCase(name + App.get("context.upload.mei.suffix"));
            map.put("filePath", row.get(filePathColumnName));
            map.put("fileMei", row.get(fileMeiColumnName));
        }

        return map;
    }

}
