package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalCostRegLineM;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_TOTAL_COST_REG_LINE_M照会
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineMGetAction extends BaseAction {

    /** MFG_TOTAL_COST_REG_LINE_M照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalCostRegLineM.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalCostRegLineM.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalCostRegLineM.routing");
        }
        if (routing == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MfgTotalCostRegLineM.yy");
        }
        if (yy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MfgTotalCostRegLineM.mm");
        }
        if (mm == null) {
            return map;
        }

        MfgTotalCostRegLineM mfgTotalCostRegLineM = MfgTotalCostRegLineM.get(hinban, proGroupNo, routing, yy, mm);
        mfgTotalCostRegLineM.referMfgTotalCostRegLineMQ();
        map.put("MfgTotalCostRegLineM", mfgTotalCostRegLineM);
        return map;
    }

}
