package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMProPlanRouting;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_M_PRO_PLAN_ROUTING削除
 *
 * @author emarfkrow
 */
public class PrdMProPlanRoutingDeleteAction extends BaseAction {

    /** PRD_M_PRO_PLAN_ROUTING削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMProPlanRouting.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMProPlanRouting.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdMProPlanRouting.proHinban");
        }
        if (proHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdMProPlanRouting.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("PrdMProPlanRouting.routingGroup");
        }
        if (routingGroup == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdMProPlanRouting.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdMProPlanRouting e = FormValidator.toBean(PrdMProPlanRouting.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
