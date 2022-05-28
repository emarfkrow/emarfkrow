package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWNesKanbanOld;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_W_NES_KANBAN_OLD照会
 *
 * @author emarfkrow
 */
public class PrdWNesKanbanOldGetAction extends BaseAction {

    /** PRD_W_NES_KANBAN_OLD照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdWNesKanbanOld.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdWNesKanbanOld.routing");
        }
        if (routing == null) {
            return map;
        }
        Object routingDefGroup = postJson.get("routingDefGroup");
        if (routingDefGroup == null) {
            routingDefGroup = postJson.get("PrdWNesKanbanOld.routingDefGroup");
        }
        if (routingDefGroup == null) {
            return map;
        }

        PrdWNesKanbanOld prdWNesKanbanOld = PrdWNesKanbanOld.get(proHinban, routing, routingDefGroup);
        map.put("PrdWNesKanbanOld", prdWNesKanbanOld);
        return map;
    }

}
