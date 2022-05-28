package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalCostRegLineY2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_TOTAL_COST_REG_LINE_Y2照会
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineY2GetAction extends BaseAction {

    /** MFG_TOTAL_COST_REG_LINE_Y2照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalCostRegLineY2.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MfgTotalCostRegLineY2.yy");
        }
        if (yy == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalCostRegLineY2.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalCostRegLineY2.routing");
        }
        if (routing == null) {
            return map;
        }

        MfgTotalCostRegLineY2 mfgTotalCostRegLineY2 = MfgTotalCostRegLineY2.get(hinban, yy, proGroupNo, routing);
        map.put("MfgTotalCostRegLineY2", mfgTotalCostRegLineY2);
        return map;
    }

}
