package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMProPlanCondition;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_PRO_PLAN_CONDITION照会
 *
 * @author emarfkrow
 */
public class PrdMProPlanConditionGetAction extends BaseAction {

    /** PRD_M_PRO_PLAN_CONDITION照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMProPlanCondition.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMProPlanCondition.mm");
        }
        if (mm == null) {
            return map;
        }

        PrdMProPlanCondition prdMProPlanCondition = PrdMProPlanCondition.get(yyyy, mm);
        prdMProPlanCondition.referPrdYProPlanCondition();
        prdMProPlanCondition.referMfgObservanceRateIns();
        prdMProPlanCondition.referPrdMateNesCountss();
        prdMProPlanCondition.referPrdRackMaintes();
        map.put("PrdMProPlanCondition", prdMProPlanCondition);
        return map;
    }

}
