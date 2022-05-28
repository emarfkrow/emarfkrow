package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupplyListBk;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_SUPPLY_LIST_BK削除
 *
 * @author emarfkrow
 */
public class MstSupplyListBkDeleteAction extends BaseAction {

    /** MST_SUPPLY_LIST_BK削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstSupplyListBk.manHinban");
        }
        if (manHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstSupplyListBk.routingGroup");
        }
        if (routingGroup == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstSupplyListBk.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object supplyHinban = postJson.get("supplyHinban");
        if (supplyHinban == null) {
            supplyHinban = postJson.get("MstSupplyListBk.supplyHinban");
        }
        if (supplyHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstSupplyListBk.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstSupplyListBk e = FormValidator.toBean(MstSupplyListBk.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
