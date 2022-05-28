package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMProPlanRouting;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_PRO_PLAN_ROUTING照会
 *
 * @author emarfkrow
 */
public class PrdMProPlanRoutingGetAction extends BaseAction {

    /** PRD_M_PRO_PLAN_ROUTING照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMProPlanRouting.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMProPlanRouting.mm");
        }
        if (mm == null) {
            return map;
        }
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdMProPlanRouting.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdMProPlanRouting.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("PrdMProPlanRouting.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdMProPlanRouting.routing");
        }
        if (routing == null) {
            return map;
        }

        PrdMProPlanRouting prdMProPlanRouting = PrdMProPlanRouting.get(yyyy, mm, proHinban, hinban, routingGroup, routing);
        map.put("PrdMProPlanRouting", prdMProPlanRouting);
        return map;
    }

}
