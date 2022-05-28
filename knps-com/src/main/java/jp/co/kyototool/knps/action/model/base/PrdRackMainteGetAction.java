package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdRackMainte;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_RACK_MAINTE照会
 *
 * @author emarfkrow
 */
public class PrdRackMainteGetAction extends BaseAction {

    /** PRD_RACK_MAINTE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdRackMainte.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdRackMainte.mm");
        }
        if (mm == null) {
            return map;
        }
        Object rackName = postJson.get("rackName");
        if (rackName == null) {
            rackName = postJson.get("PrdRackMainte.rackName");
        }
        if (rackName == null) {
            return map;
        }

        PrdRackMainte prdRackMainte = PrdRackMainte.get(yyyy, mm, rackName);
        map.put("PrdRackMainte", prdRackMainte);
        return map;
    }

}
