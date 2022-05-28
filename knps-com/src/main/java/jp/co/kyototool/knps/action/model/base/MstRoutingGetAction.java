package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstRouting;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_ROUTING照会
 *
 * @author emarfkrow
 */
public class MstRoutingGetAction extends BaseAction {

    /** MST_ROUTING照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstRouting.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstRouting.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstRouting.routing");
        }
        if (routing == null) {
            return map;
        }

        MstRouting mstRouting = MstRouting.get(manHinban, routingGroup, routing);
        map.put("MstRouting", mstRouting);
        return map;
    }

}
