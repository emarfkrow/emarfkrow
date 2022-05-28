package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.HktcPrdDailyProPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * HKTC_PRD_DAILY_PRO_PLAN照会
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanGetAction extends BaseAction {

    /** HKTC_PRD_DAILY_PRO_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object planNo = postJson.get("planNo");
        if (planNo == null) {
            planNo = postJson.get("HktcPrdDailyProPlan.planNo");
        }
        if (planNo == null) {
            return map;
        }

        HktcPrdDailyProPlan hktcPrdDailyProPlan = HktcPrdDailyProPlan.get(planNo);
        hktcPrdDailyProPlan.referPrdDailyProPlan();
        map.put("HktcPrdDailyProPlan", hktcPrdDailyProPlan);
        return map;
    }

}
