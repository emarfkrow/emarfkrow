package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalCostRegLineI1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_TOTAL_COST_REG_LINE_I1照会
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineI1GetAction extends BaseAction {

    /** MFG_TOTAL_COST_REG_LINE_I1照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalCostRegLineI1.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalCostRegLineI1.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalCostRegLineI1.routing");
        }
        if (routing == null) {
            return map;
        }

        MfgTotalCostRegLineI1 mfgTotalCostRegLineI1 = MfgTotalCostRegLineI1.get(proGroupNo, hinban, routing);
        map.put("MfgTotalCostRegLineI1", mfgTotalCostRegLineI1);
        return map;
    }

}
