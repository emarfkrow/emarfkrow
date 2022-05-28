package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTotalCostRegLineQ;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_TOTAL_COST_REG_LINE_Q照会
 *
 * @author emarfkrow
 */
public class MstTotalCostRegLineQGetAction extends BaseAction {

    /** MST_TOTAL_COST_REG_LINE_Q照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstTotalCostRegLineQ.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MstTotalCostRegLineQ.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstTotalCostRegLineQ.routing");
        }
        if (routing == null) {
            return map;
        }

        MstTotalCostRegLineQ mstTotalCostRegLineQ = MstTotalCostRegLineQ.get(hinban, proGroupNo, routing);
        map.put("MstTotalCostRegLineQ", mstTotalCostRegLineQ);
        return map;
    }

}
