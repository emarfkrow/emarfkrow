package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyProPlanArr;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_DAILY_PRO_PLAN_ARR照会
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanArrGetAction extends BaseAction {

    /** PRD_DAILY_PRO_PLAN_ARR照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proNo = postJson.get("proNo");
        if (proNo == null) {
            proNo = postJson.get("PrdDailyProPlanArr.proNo");
        }
        if (proNo == null) {
            return map;
        }

        PrdDailyProPlanArr prdDailyProPlanArr = PrdDailyProPlanArr.get(proNo);
        map.put("PrdDailyProPlanArr", prdDailyProPlanArr);
        return map;
    }

}
