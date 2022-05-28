package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvInventory;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_INVENTORY照会
 *
 * @author emarfkrow
 */
public class InvInventoryGetAction extends BaseAction {

    /** INV_INVENTORY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvInventory.locationCode");
        }
        if (locationCode == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvInventory.hinban");
        }
        if (hinban == null) {
            return map;
        }

        InvInventory invInventory = InvInventory.get(locationCode, hinban);
        invInventory.referInvStockProcess();
        map.put("InvInventory", invInventory);
        return map;
    }

}
