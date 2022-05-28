package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalCostRegLineIQ;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_TOTAL_COST_REG_LINE_I_Q照会
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineIQGetAction extends BaseAction {

    /** MFG_TOTAL_COST_REG_LINE_I_Q照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalCostRegLineIQ.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalCostRegLineIQ.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalCostRegLineIQ.routing");
        }
        if (routing == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MfgTotalCostRegLineIQ.yy");
        }
        if (yy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MfgTotalCostRegLineIQ.mm");
        }
        if (mm == null) {
            return map;
        }

        MfgTotalCostRegLineIQ mfgTotalCostRegLineIQ = MfgTotalCostRegLineIQ.get(hinban, proGroupNo, routing, yy, mm);
        mfgTotalCostRegLineIQ.referMfgTotalCostRegLineM();
        mfgTotalCostRegLineIQ.referMfgTotalCostRegLineMQ();
        map.put("MfgTotalCostRegLineIQ", mfgTotalCostRegLineIQ);
        return map;
    }

}
