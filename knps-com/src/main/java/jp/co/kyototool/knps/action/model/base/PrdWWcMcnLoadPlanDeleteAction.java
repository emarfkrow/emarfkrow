package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWWcMcnLoadPlan;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_W_WC_MCN_LOAD_PLAN削除
 *
 * @author emarfkrow
 */
public class PrdWWcMcnLoadPlanDeleteAction extends BaseAction {

    /** PRD_W_WC_MCN_LOAD_PLAN削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object wPlanId = postJson.get("wPlanId");
        if (wPlanId == null) {
            wPlanId = postJson.get("PrdWWcMcnLoadPlan.wPlanId");
        }
        if (wPlanId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("PrdWWcMcnLoadPlan.manHinban");
        }
        if (manHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdWWcMcnLoadPlan.wcCode");
        }
        if (wcCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object dataSourceKbn = postJson.get("dataSourceKbn");
        if (dataSourceKbn == null) {
            dataSourceKbn = postJson.get("PrdWWcMcnLoadPlan.dataSourceKbn");
        }
        if (dataSourceKbn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object period = postJson.get("period");
        if (period == null) {
            period = postJson.get("PrdWWcMcnLoadPlan.period");
        }
        if (period == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object planNo = postJson.get("planNo");
        if (planNo == null) {
            planNo = postJson.get("PrdWWcMcnLoadPlan.planNo");
        }
        if (planNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdWWcMcnLoadPlan e = FormValidator.toBean(PrdWWcMcnLoadPlan.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
