package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockStore;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_STORE照会
 *
 * @author emarfkrow
 */
public class InvStockStoreGetAction extends BaseAction {

    /** INV_STOCK_STORE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockStore.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object storeNo = postJson.get("storeNo");
        if (storeNo == null) {
            storeNo = postJson.get("InvStockStore.storeNo");
        }
        if (storeNo == null) {
            return map;
        }

        InvStockStore invStockStore = InvStockStore.get(hinban, storeNo);
        map.put("InvStockStore", invStockStore);
        return map;
    }

}
