package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockProcessSupply;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_PROCESS_SUPPLY照会
 *
 * @author emarfkrow
 */
public class InvStockProcessSupplyGetAction extends BaseAction {

    /** INV_STOCK_PROCESS_SUPPLY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("InvStockProcessSupply.supCode");
        }
        if (supCode == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockProcessSupply.hinban");
        }
        if (hinban == null) {
            return map;
        }

        InvStockProcessSupply invStockProcessSupply = InvStockProcessSupply.get(supCode, hinban);
        map.put("InvStockProcessSupply", invStockProcessSupply);
        return map;
    }

}
