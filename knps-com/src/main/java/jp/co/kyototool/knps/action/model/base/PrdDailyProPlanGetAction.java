package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyProPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_DAILY_PRO_PLAN照会
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanGetAction extends BaseAction {

    /** PRD_DAILY_PRO_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object planNo = postJson.get("planNo");
        if (planNo == null) {
            planNo = postJson.get("PrdDailyProPlan.planNo");
        }
        if (planNo == null) {
            return map;
        }

        PrdDailyProPlan prdDailyProPlan = PrdDailyProPlan.get(planNo);
        map.put("PrdDailyProPlan", prdDailyProPlan);
        return map;
    }

}
