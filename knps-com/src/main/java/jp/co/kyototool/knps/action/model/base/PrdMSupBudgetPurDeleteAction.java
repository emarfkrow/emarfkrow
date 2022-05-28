package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMSupBudgetPur;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_M_SUP_BUDGET_PUR削除
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetPurDeleteAction extends BaseAction {

    /** PRD_M_SUP_BUDGET_PUR削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMSupBudgetPur.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMSupBudgetPur.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdMSupBudgetPur.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("PrdMSupBudgetPur.supCode");
        }
        if (supCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdMSupBudgetPur e = FormValidator.toBean(PrdMSupBudgetPur.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
