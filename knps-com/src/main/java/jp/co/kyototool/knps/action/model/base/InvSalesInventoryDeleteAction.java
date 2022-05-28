package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSalesInventory;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_SALES_INVENTORY削除
 *
 * @author emarfkrow
 */
public class InvSalesInventoryDeleteAction extends BaseAction {

    /** INV_SALES_INVENTORY削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object salesHinban = postJson.get("salesHinban");
        if (salesHinban == null) {
            salesHinban = postJson.get("InvSalesInventory.salesHinban");
        }
        if (salesHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvSalesInventory.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvSalesInventory e = FormValidator.toBean(InvSalesInventory.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
