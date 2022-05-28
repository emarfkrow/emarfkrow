package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWNesKanban;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_W_NES_KANBAN照会
 *
 * @author emarfkrow
 */
public class PrdWNesKanbanGetAction extends BaseAction {

    /** PRD_W_NES_KANBAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdWNesKanban.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdWNesKanban.routing");
        }
        if (routing == null) {
            return map;
        }
        Object routingDefGroup = postJson.get("routingDefGroup");
        if (routingDefGroup == null) {
            routingDefGroup = postJson.get("PrdWNesKanban.routingDefGroup");
        }
        if (routingDefGroup == null) {
            return map;
        }

        PrdWNesKanban prdWNesKanban = PrdWNesKanban.get(proHinban, routing, routingDefGroup);
        prdWNesKanban.referPrdWNesKanbanOld();
        map.put("PrdWNesKanban", prdWNesKanban);
        return map;
    }

}
