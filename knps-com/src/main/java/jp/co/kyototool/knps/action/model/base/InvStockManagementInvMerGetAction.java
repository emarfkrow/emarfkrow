package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockManagementInvMer;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_MANAGEMENT_INV_MER照会
 *
 * @author emarfkrow
 */
public class InvStockManagementInvMerGetAction extends BaseAction {

    /** INV_STOCK_MANAGEMENT_INV_MER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockManagementInvMer.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvStockManagementInvMer.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvStockManagementInvMer.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }
        Object invPhase = postJson.get("invPhase");
        if (invPhase == null) {
            invPhase = postJson.get("InvStockManagementInvMer.invPhase");
        }
        if (invPhase == null) {
            return map;
        }
        Object invPhaseMonth = postJson.get("invPhaseMonth");
        if (invPhaseMonth == null) {
            invPhaseMonth = postJson.get("InvStockManagementInvMer.invPhaseMonth");
        }
        if (invPhaseMonth == null) {
            return map;
        }

        InvStockManagementInvMer invStockManagementInvMer = InvStockManagementInvMer.get(hinban, subInvCode, stockManagementSection, invPhase, invPhaseMonth);
        map.put("InvStockManagementInvMer", invStockManagementInvMer);
        return map;
    }

}
