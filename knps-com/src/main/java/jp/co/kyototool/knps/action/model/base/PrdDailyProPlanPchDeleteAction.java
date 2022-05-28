package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyProPlanPch;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_DAILY_PRO_PLAN_PCH削除
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanPchDeleteAction extends BaseAction {

    /** PRD_DAILY_PRO_PLAN_PCH削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object pchOrderNo = postJson.get("pchOrderNo");
        if (pchOrderNo == null) {
            pchOrderNo = postJson.get("PrdDailyProPlanPch.pchOrderNo");
        }
        if (pchOrderNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdDailyProPlanPch e = FormValidator.toBean(PrdDailyProPlanPch.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
