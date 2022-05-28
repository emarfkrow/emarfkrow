package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchProdUnitCost;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_PROD_UNIT_COST照会
 *
 * @author emarfkrow
 */
public class PchProdUnitCostGetAction extends BaseAction {

    /** PCH_PROD_UNIT_COST照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object closeDate = postJson.get("closeDate");
        if (closeDate == null) {
            closeDate = postJson.get("PchProdUnitCost.closeDate");
        }
        if (closeDate == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("PchProdUnitCost.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PchProdUnitCost.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PchProdUnitCost.routing");
        }
        if (routing == null) {
            return map;
        }

        PchProdUnitCost pchProdUnitCost = PchProdUnitCost.get(closeDate, proGroupNo, hinban, routing);
        map.put("PchProdUnitCost", pchProdUnitCost);
        return map;
    }

}
