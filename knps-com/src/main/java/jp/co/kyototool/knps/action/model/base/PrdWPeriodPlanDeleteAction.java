package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWPeriodPlan;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_W_PERIOD_PLAN削除
 *
 * @author emarfkrow
 */
public class PrdWPeriodPlanDeleteAction extends BaseAction {

    /** PRD_W_PERIOD_PLAN削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object wPlanId = postJson.get("wPlanId");
        if (wPlanId == null) {
            wPlanId = postJson.get("PrdWPeriodPlan.wPlanId");
        }
        if (wPlanId == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdWPeriodPlan e = FormValidator.toBean(PrdWPeriodPlan.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
