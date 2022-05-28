package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSalesInventory;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_SALES_INVENTORY照会
 *
 * @author emarfkrow
 */
public class InvSalesInventoryGetAction extends BaseAction {

    /** INV_SALES_INVENTORY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object salesHinban = postJson.get("salesHinban");
        if (salesHinban == null) {
            salesHinban = postJson.get("InvSalesInventory.salesHinban");
        }
        if (salesHinban == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvSalesInventory.hinban");
        }
        if (hinban == null) {
            return map;
        }

        InvSalesInventory invSalesInventory = InvSalesInventory.get(salesHinban, hinban);
        map.put("InvSalesInventory", invSalesInventory);
        return map;
    }

}
