package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMWcMcnLoadPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_WC_MCN_LOAD_PLAN照会
 *
 * @author emarfkrow
 */
public class PrdMWcMcnLoadPlanGetAction extends BaseAction {

    /** PRD_M_WC_MCN_LOAD_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMWcMcnLoadPlan.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMWcMcnLoadPlan.mm");
        }
        if (mm == null) {
            return map;
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("PrdMWcMcnLoadPlan.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdMWcMcnLoadPlan.wcCode");
        }
        if (wcCode == null) {
            return map;
        }

        PrdMWcMcnLoadPlan prdMWcMcnLoadPlan = PrdMWcMcnLoadPlan.get(yyyy, mm, manHinban, wcCode);
        prdMWcMcnLoadPlan.referPrdYWcMcnLoadPlan();
        map.put("PrdMWcMcnLoadPlan", prdMWcMcnLoadPlan);
        return map;
    }

}
