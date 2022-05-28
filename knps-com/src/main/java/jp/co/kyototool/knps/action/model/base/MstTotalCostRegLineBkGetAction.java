package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTotalCostRegLineBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_TOTAL_COST_REG_LINE_BK照会
 *
 * @author emarfkrow
 */
public class MstTotalCostRegLineBkGetAction extends BaseAction {

    /** MST_TOTAL_COST_REG_LINE_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstTotalCostRegLineBk.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MstTotalCostRegLineBk.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstTotalCostRegLineBk.routing");
        }
        if (routing == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstTotalCostRegLineBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstTotalCostRegLineBk mstTotalCostRegLineBk = MstTotalCostRegLineBk.get(hinban, proGroupNo, routing, yy);
        map.put("MstTotalCostRegLineBk", mstTotalCostRegLineBk);
        return map;
    }

}
