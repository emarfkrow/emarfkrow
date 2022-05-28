package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstRoutingDef;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_ROUTING_DEF照会
 *
 * @author emarfkrow
 */
public class MstRoutingDefGetAction extends BaseAction {

    /** MST_ROUTING_DEF照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstRoutingDef.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstRoutingDef.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }

        MstRoutingDef mstRoutingDef = MstRoutingDef.get(manHinban, routingGroup);
        mstRoutingDef.referMfgKanbanHeds();
        mstRoutingDef.referMstRoutingDefBks();
        map.put("MstRoutingDef", mstRoutingDef);
        return map;
    }

}
