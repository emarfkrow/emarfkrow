package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchProdTotalInf;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_PROD_TOTAL_INF照会
 *
 * @author emarfkrow
 */
public class PchProdTotalInfGetAction extends BaseAction {

    /** PCH_PROD_TOTAL_INF照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PchProdTotalInf.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("PchProdTotalInf.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PchProdTotalInf.routing");
        }
        if (routing == null) {
            return map;
        }
        Object closeDate = postJson.get("closeDate");
        if (closeDate == null) {
            closeDate = postJson.get("PchProdTotalInf.closeDate");
        }
        if (closeDate == null) {
            return map;
        }

        PchProdTotalInf pchProdTotalInf = PchProdTotalInf.get(hinban, routingGroup, routing, closeDate);
        map.put("PchProdTotalInf", pchProdTotalInf);
        return map;
    }

}
