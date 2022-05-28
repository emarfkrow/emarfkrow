package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockManagementInvDetM;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_MANAGEMENT_INV_DET_M照会
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetMGetAction extends BaseAction {

    /** INV_STOCK_MANAGEMENT_INV_DET_M照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockManagementInvDetM.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvStockManagementInvDetM.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvStockManagementInvDetM.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }
        Object invPhase = postJson.get("invPhase");
        if (invPhase == null) {
            invPhase = postJson.get("InvStockManagementInvDetM.invPhase");
        }
        if (invPhase == null) {
            return map;
        }
        Object invPhaseMonth = postJson.get("invPhaseMonth");
        if (invPhaseMonth == null) {
            invPhaseMonth = postJson.get("InvStockManagementInvDetM.invPhaseMonth");
        }
        if (invPhaseMonth == null) {
            return map;
        }
        Object invBranchNo = postJson.get("invBranchNo");
        if (invBranchNo == null) {
            invBranchNo = postJson.get("InvStockManagementInvDetM.invBranchNo");
        }
        if (invBranchNo == null) {
            return map;
        }

        InvStockManagementInvDetM invStockManagementInvDetM = InvStockManagementInvDetM.get(hinban, subInvCode, stockManagementSection, invPhase, invPhaseMonth, invBranchNo);
        map.put("InvStockManagementInvDetM", invStockManagementInvDetM);
        return map;
    }

}
