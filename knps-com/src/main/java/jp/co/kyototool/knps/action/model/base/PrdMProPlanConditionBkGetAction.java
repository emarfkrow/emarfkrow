package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMProPlanConditionBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_PRO_PLAN_CONDITION_BK照会
 *
 * @author emarfkrow
 */
public class PrdMProPlanConditionBkGetAction extends BaseAction {

    /** PRD_M_PRO_PLAN_CONDITION_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        PrdMProPlanConditionBk prdMProPlanConditionBk = PrdMProPlanConditionBk.get();
        map.put("PrdMProPlanConditionBk", prdMProPlanConditionBk);
        return map;
    }

}
