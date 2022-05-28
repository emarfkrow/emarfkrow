package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockManagementInv;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_MANAGEMENT_INV照会
 *
 * @author emarfkrow
 */
public class InvStockManagementInvGetAction extends BaseAction {

    /** INV_STOCK_MANAGEMENT_INV照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockManagementInv.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvStockManagementInv.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvStockManagementInv.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }
        Object invPhase = postJson.get("invPhase");
        if (invPhase == null) {
            invPhase = postJson.get("InvStockManagementInv.invPhase");
        }
        if (invPhase == null) {
            return map;
        }
        Object invPhaseMonth = postJson.get("invPhaseMonth");
        if (invPhaseMonth == null) {
            invPhaseMonth = postJson.get("InvStockManagementInv.invPhaseMonth");
        }
        if (invPhaseMonth == null) {
            return map;
        }

        InvStockManagementInv invStockManagementInv = InvStockManagementInv.get(hinban, subInvCode, stockManagementSection, invPhase, invPhaseMonth);
        invStockManagementInv.referInvStockManagementInvMer();
        invStockManagementInv.referInvStockManagementInvDets();
        map.put("InvStockManagementInv", invStockManagementInv);
        return map;
    }

}
