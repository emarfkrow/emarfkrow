package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalCostRegLineI;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_TOTAL_COST_REG_LINE_I照会
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineIGetAction extends BaseAction {

    /** MFG_TOTAL_COST_REG_LINE_I照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalCostRegLineI.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalCostRegLineI.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalCostRegLineI.routing");
        }
        if (routing == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MfgTotalCostRegLineI.yy");
        }
        if (yy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MfgTotalCostRegLineI.mm");
        }
        if (mm == null) {
            return map;
        }

        MfgTotalCostRegLineI mfgTotalCostRegLineI = MfgTotalCostRegLineI.get(hinban, proGroupNo, routing, yy, mm);
        mfgTotalCostRegLineI.referMfgTotalCostRegLineIQ();
        mfgTotalCostRegLineI.referMfgTotalCostRegLineM();
        mfgTotalCostRegLineI.referMfgTotalCostRegLineMQ();
        map.put("MfgTotalCostRegLineI", mfgTotalCostRegLineI);
        return map;
    }

}
