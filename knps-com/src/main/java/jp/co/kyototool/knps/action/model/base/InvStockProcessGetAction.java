package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockProcess;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_PROCESS照会
 *
 * @author emarfkrow
 */
public class InvStockProcessGetAction extends BaseAction {

    /** INV_STOCK_PROCESS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvStockProcess.locationCode");
        }
        if (locationCode == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockProcess.hinban");
        }
        if (hinban == null) {
            return map;
        }

        InvStockProcess invStockProcess = InvStockProcess.get(locationCode, hinban);
        map.put("InvStockProcess", invStockProcess);
        return map;
    }

}
