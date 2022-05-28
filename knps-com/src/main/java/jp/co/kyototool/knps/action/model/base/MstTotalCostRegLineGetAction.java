package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTotalCostRegLine;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_TOTAL_COST_REG_LINE照会
 *
 * @author emarfkrow
 */
public class MstTotalCostRegLineGetAction extends BaseAction {

    /** MST_TOTAL_COST_REG_LINE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstTotalCostRegLine.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MstTotalCostRegLine.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstTotalCostRegLine.routing");
        }
        if (routing == null) {
            return map;
        }

        MstTotalCostRegLine mstTotalCostRegLine = MstTotalCostRegLine.get(hinban, proGroupNo, routing);
        mstTotalCostRegLine.referMstTotalCostRegLineQ();
        mstTotalCostRegLine.referMfgTotalCostRegLineYs();
        map.put("MstTotalCostRegLine", mstTotalCostRegLine);
        return map;
    }

}
