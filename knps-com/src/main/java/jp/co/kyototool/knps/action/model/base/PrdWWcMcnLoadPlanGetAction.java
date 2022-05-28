package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWWcMcnLoadPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_W_WC_MCN_LOAD_PLAN照会
 *
 * @author emarfkrow
 */
public class PrdWWcMcnLoadPlanGetAction extends BaseAction {

    /** PRD_W_WC_MCN_LOAD_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object wPlanId = postJson.get("wPlanId");
        if (wPlanId == null) {
            wPlanId = postJson.get("PrdWWcMcnLoadPlan.wPlanId");
        }
        if (wPlanId == null) {
            return map;
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("PrdWWcMcnLoadPlan.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdWWcMcnLoadPlan.wcCode");
        }
        if (wcCode == null) {
            return map;
        }
        Object dataSourceKbn = postJson.get("dataSourceKbn");
        if (dataSourceKbn == null) {
            dataSourceKbn = postJson.get("PrdWWcMcnLoadPlan.dataSourceKbn");
        }
        if (dataSourceKbn == null) {
            return map;
        }
        Object period = postJson.get("period");
        if (period == null) {
            period = postJson.get("PrdWWcMcnLoadPlan.period");
        }
        if (period == null) {
            return map;
        }
        Object planNo = postJson.get("planNo");
        if (planNo == null) {
            planNo = postJson.get("PrdWWcMcnLoadPlan.planNo");
        }
        if (planNo == null) {
            return map;
        }

        PrdWWcMcnLoadPlan prdWWcMcnLoadPlan = PrdWWcMcnLoadPlan.get(wPlanId, manHinban, wcCode, dataSourceKbn, period, planNo);
        map.put("PrdWWcMcnLoadPlan", prdWWcMcnLoadPlan);
        return map;
    }

}
