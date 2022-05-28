package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdYWcMcnLoadPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_Y_WC_MCN_LOAD_PLAN照会
 *
 * @author emarfkrow
 */
public class PrdYWcMcnLoadPlanGetAction extends BaseAction {

    /** PRD_Y_WC_MCN_LOAD_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdYWcMcnLoadPlan.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdYWcMcnLoadPlan.mm");
        }
        if (mm == null) {
            return map;
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("PrdYWcMcnLoadPlan.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdYWcMcnLoadPlan.wcCode");
        }
        if (wcCode == null) {
            return map;
        }

        PrdYWcMcnLoadPlan prdYWcMcnLoadPlan = PrdYWcMcnLoadPlan.get(yyyy, mm, manHinban, wcCode);
        map.put("PrdYWcMcnLoadPlan", prdYWcMcnLoadPlan);
        return map;
    }

}
