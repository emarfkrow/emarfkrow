package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgDailyPlanExchangeId;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_DAILY_PLAN_EXCHANGE_ID照会
 *
 * @author emarfkrow
 */
public class MfgDailyPlanExchangeIdGetAction extends BaseAction {

    /** MFG_DAILY_PLAN_EXCHANGE_ID照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object exchangeId = postJson.get("exchangeId");
        if (exchangeId == null) {
            exchangeId = postJson.get("MfgDailyPlanExchangeId.exchangeId");
        }
        if (exchangeId == null) {
            return map;
        }

        MfgDailyPlanExchangeId mfgDailyPlanExchangeId = MfgDailyPlanExchangeId.get(exchangeId);
        map.put("MfgDailyPlanExchangeId", mfgDailyPlanExchangeId);
        return map;
    }

}
