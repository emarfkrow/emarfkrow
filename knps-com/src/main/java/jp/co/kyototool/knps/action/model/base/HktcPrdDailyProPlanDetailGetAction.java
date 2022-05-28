package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.HktcPrdDailyProPlanDetail;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * HKTC_PRD_DAILY_PRO_PLAN_DETAIL照会
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanDetailGetAction extends BaseAction {

    /** HKTC_PRD_DAILY_PRO_PLAN_DETAIL照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object childPlanNo = postJson.get("childPlanNo");
        if (childPlanNo == null) {
            childPlanNo = postJson.get("HktcPrdDailyProPlanDetail.childPlanNo");
        }
        if (childPlanNo == null) {
            return map;
        }

        HktcPrdDailyProPlanDetail hktcPrdDailyProPlanDetail = HktcPrdDailyProPlanDetail.get(childPlanNo);
        hktcPrdDailyProPlanDetail.referMfgProActStatus();
        hktcPrdDailyProPlanDetail.referPrdDailyProPlanDetail();
        map.put("HktcPrdDailyProPlanDetail", hktcPrdDailyProPlanDetail);
        return map;
    }

}
