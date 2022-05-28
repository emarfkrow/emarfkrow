package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvMtrlInoutHistory;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_MTRL_INOUT_HISTORY照会
 *
 * @author emarfkrow
 */
public class InvMtrlInoutHistoryGetAction extends BaseAction {

    /** INV_MTRL_INOUT_HISTORY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvMtrlInoutHistory.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvMtrlInoutHistory.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvMtrlInoutHistory.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }
        Object inOutDate = postJson.get("inOutDate");
        if (inOutDate == null) {
            inOutDate = postJson.get("InvMtrlInoutHistory.inOutDate");
        }
        if (inOutDate == null) {
            return map;
        }
        Object stockBranchNumber = postJson.get("stockBranchNumber");
        if (stockBranchNumber == null) {
            stockBranchNumber = postJson.get("InvMtrlInoutHistory.stockBranchNumber");
        }
        if (stockBranchNumber == null) {
            return map;
        }

        InvMtrlInoutHistory invMtrlInoutHistory = InvMtrlInoutHistory.get(hinban, subInvCode, stockManagementSection, inOutDate, stockBranchNumber);
        invMtrlInoutHistory.referInvStockToolMngDet();
        map.put("InvMtrlInoutHistory", invMtrlInoutHistory);
        return map;
    }

}
