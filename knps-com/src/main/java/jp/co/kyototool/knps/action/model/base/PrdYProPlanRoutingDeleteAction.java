package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdYProPlanRouting;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_Y_PRO_PLAN_ROUTING削除
 *
 * @author emarfkrow
 */
public class PrdYProPlanRoutingDeleteAction extends BaseAction {

    /** PRD_Y_PRO_PLAN_ROUTING削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdYProPlanRouting.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdYProPlanRouting.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdYProPlanRouting.proHinban");
        }
        if (proHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdYProPlanRouting.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdYProPlanRouting.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdYProPlanRouting e = FormValidator.toBean(PrdYProPlanRouting.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
