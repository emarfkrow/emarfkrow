package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMWcMcnLoadPlan;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_M_WC_MCN_LOAD_PLAN削除
 *
 * @author emarfkrow
 */
public class PrdMWcMcnLoadPlanDeleteAction extends BaseAction {

    /** PRD_M_WC_MCN_LOAD_PLAN削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMWcMcnLoadPlan.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMWcMcnLoadPlan.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("PrdMWcMcnLoadPlan.manHinban");
        }
        if (manHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdMWcMcnLoadPlan.wcCode");
        }
        if (wcCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdMWcMcnLoadPlan e = FormValidator.toBean(PrdMWcMcnLoadPlan.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
