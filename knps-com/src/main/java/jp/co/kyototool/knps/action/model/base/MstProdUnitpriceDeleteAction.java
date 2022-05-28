package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstProdUnitprice;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_PROD_UNITPRICE削除
 *
 * @author emarfkrow
 */
public class MstProdUnitpriceDeleteAction extends BaseAction {

    /** MST_PROD_UNITPRICE削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstProdUnitprice.manHinban");
        }
        if (manHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstProdUnitprice.routingGroup");
        }
        if (routingGroup == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstProdUnitprice.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MstProdUnitprice.wcCode");
        }
        if (wcCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object minOrder = postJson.get("minOrder");
        if (minOrder == null) {
            minOrder = postJson.get("MstProdUnitprice.minOrder");
        }
        if (minOrder == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstProdUnitprice e = FormValidator.toBean(MstProdUnitprice.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
