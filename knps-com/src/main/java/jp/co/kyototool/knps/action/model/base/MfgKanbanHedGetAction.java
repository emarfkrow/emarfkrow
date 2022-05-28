package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgKanbanHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_KANBAN_HED照会
 *
 * @author emarfkrow
 */
public class MfgKanbanHedGetAction extends BaseAction {

    /** MFG_KANBAN_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MfgKanbanHed.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MfgKanbanHed.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgKanbanHed.routing");
        }
        if (routing == null) {
            return map;
        }

        MfgKanbanHed mfgKanbanHed = MfgKanbanHed.get(manHinban, routingGroup, routing);
        mfgKanbanHed.referMstRouting();
        mfgKanbanHed.referMstRoutingBks();
        mfgKanbanHed.referMstSupplyLists();
        map.put("MfgKanbanHed", mfgKanbanHed);
        return map;
    }

}
