package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvPeriod;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_PERIOD照会
 *
 * @author emarfkrow
 */
public class InvPeriodGetAction extends BaseAction {

    /** INV_PERIOD照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvPeriod.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }
        Object invPhase = postJson.get("invPhase");
        if (invPhase == null) {
            invPhase = postJson.get("InvPeriod.invPhase");
        }
        if (invPhase == null) {
            return map;
        }
        Object invPhaseMonth = postJson.get("invPhaseMonth");
        if (invPhaseMonth == null) {
            invPhaseMonth = postJson.get("InvPeriod.invPhaseMonth");
        }
        if (invPhaseMonth == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvPeriod.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }

        InvPeriod invPeriod = InvPeriod.get(stockManagementSection, invPhase, invPhaseMonth, subInvCode);
        map.put("InvPeriod", invPeriod);
        return map;
    }

}
