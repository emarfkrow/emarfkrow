package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockToolMngHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_TOOL_MNG_HED照会
 *
 * @author emarfkrow
 */
public class InvStockToolMngHedGetAction extends BaseAction {

    /** INV_STOCK_TOOL_MNG_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockToolMngHed.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvStockToolMngHed.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvStockToolMngHed.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }

        InvStockToolMngHed invStockToolMngHed = InvStockToolMngHed.get(hinban, subInvCode, stockManagementSection);
        map.put("InvStockToolMngHed", invStockToolMngHed);
        return map;
    }

}
