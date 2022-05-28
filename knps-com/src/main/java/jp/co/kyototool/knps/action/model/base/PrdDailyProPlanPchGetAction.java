package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyProPlanPch;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_DAILY_PRO_PLAN_PCH照会
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanPchGetAction extends BaseAction {

    /** PRD_DAILY_PRO_PLAN_PCH照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object pchOrderNo = postJson.get("pchOrderNo");
        if (pchOrderNo == null) {
            pchOrderNo = postJson.get("PrdDailyProPlanPch.pchOrderNo");
        }
        if (pchOrderNo == null) {
            return map;
        }

        PrdDailyProPlanPch prdDailyProPlanPch = PrdDailyProPlanPch.get(pchOrderNo);
        map.put("PrdDailyProPlanPch", prdDailyProPlanPch);
        return map;
    }

}
