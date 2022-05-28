package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvInoutHistory;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_INOUT_HISTORY照会
 *
 * @author emarfkrow
 */
public class InvInoutHistoryGetAction extends BaseAction {

    /** INV_INOUT_HISTORY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object actionDate = postJson.get("actionDate");
        if (actionDate == null) {
            actionDate = postJson.get("InvInoutHistory.actionDate");
        }
        if (actionDate == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvInoutHistory.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object inOutCounts = postJson.get("inOutCounts");
        if (inOutCounts == null) {
            inOutCounts = postJson.get("InvInoutHistory.inOutCounts");
        }
        if (inOutCounts == null) {
            return map;
        }
        Object inOutKbn = postJson.get("inOutKbn");
        if (inOutKbn == null) {
            inOutKbn = postJson.get("InvInoutHistory.inOutKbn");
        }
        if (inOutKbn == null) {
            return map;
        }

        InvInoutHistory invInoutHistory = InvInoutHistory.get(actionDate, hinban, inOutCounts, inOutKbn);
        map.put("InvInoutHistory", invInoutHistory);
        return map;
    }

}
