package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgDailyPlanExchangeId;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_DAILY_PLAN_EXCHANGE_ID削除
 *
 * @author emarfkrow
 */
public class MfgDailyPlanExchangeIdDeleteAction extends BaseAction {

    /** MFG_DAILY_PLAN_EXCHANGE_ID削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object exchangeId = postJson.get("exchangeId");
        if (exchangeId == null) {
            exchangeId = postJson.get("MfgDailyPlanExchangeId.exchangeId");
        }
        if (exchangeId == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgDailyPlanExchangeId e = FormValidator.toBean(MfgDailyPlanExchangeId.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
