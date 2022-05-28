package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstRoutingBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_ROUTING_BK照会
 *
 * @author emarfkrow
 */
public class MstRoutingBkGetAction extends BaseAction {

    /** MST_ROUTING_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstRoutingBk.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstRoutingBk.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstRoutingBk.routing");
        }
        if (routing == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstRoutingBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstRoutingBk mstRoutingBk = MstRoutingBk.get(manHinban, routingGroup, routing, yy);
        map.put("MstRoutingBk", mstRoutingBk);
        return map;
    }

}
