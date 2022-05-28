package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWPeriodPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_W_PERIOD_PLAN照会
 *
 * @author emarfkrow
 */
public class PrdWPeriodPlanGetAction extends BaseAction {

    /** PRD_W_PERIOD_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object wPlanId = postJson.get("wPlanId");
        if (wPlanId == null) {
            wPlanId = postJson.get("PrdWPeriodPlan.wPlanId");
        }
        if (wPlanId == null) {
            return map;
        }

        PrdWPeriodPlan prdWPeriodPlan = PrdWPeriodPlan.get(wPlanId);
        map.put("PrdWPeriodPlan", prdWPeriodPlan);
        return map;
    }

}
