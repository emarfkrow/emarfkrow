package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockManagementInvDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_MANAGEMENT_INV_DET照会
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetGetAction extends BaseAction {

    /** INV_STOCK_MANAGEMENT_INV_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockManagementInvDet.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvStockManagementInvDet.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvStockManagementInvDet.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }
        Object invPhase = postJson.get("invPhase");
        if (invPhase == null) {
            invPhase = postJson.get("InvStockManagementInvDet.invPhase");
        }
        if (invPhase == null) {
            return map;
        }
        Object invPhaseMonth = postJson.get("invPhaseMonth");
        if (invPhaseMonth == null) {
            invPhaseMonth = postJson.get("InvStockManagementInvDet.invPhaseMonth");
        }
        if (invPhaseMonth == null) {
            return map;
        }
        Object invBranchNo = postJson.get("invBranchNo");
        if (invBranchNo == null) {
            invBranchNo = postJson.get("InvStockManagementInvDet.invBranchNo");
        }
        if (invBranchNo == null) {
            return map;
        }

        InvStockManagementInvDet invStockManagementInvDet = InvStockManagementInvDet.get(hinban, subInvCode, stockManagementSection, invPhase, invPhaseMonth, invBranchNo);
        invStockManagementInvDet.referInvStockManagementInvDetM();
        map.put("InvStockManagementInvDet", invStockManagementInvDet);
        return map;
    }

}
