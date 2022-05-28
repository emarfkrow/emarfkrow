package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdYProPlanRouting;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_Y_PRO_PLAN_ROUTING照会
 *
 * @author emarfkrow
 */
public class PrdYProPlanRoutingGetAction extends BaseAction {

    /** PRD_Y_PRO_PLAN_ROUTING照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdYProPlanRouting.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdYProPlanRouting.mm");
        }
        if (mm == null) {
            return map;
        }
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdYProPlanRouting.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdYProPlanRouting.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdYProPlanRouting.routing");
        }
        if (routing == null) {
            return map;
        }

        PrdYProPlanRouting prdYProPlanRouting = PrdYProPlanRouting.get(yyyy, mm, proHinban, hinban, routing);
        map.put("PrdYProPlanRouting", prdYProPlanRouting);
        return map;
    }

}
