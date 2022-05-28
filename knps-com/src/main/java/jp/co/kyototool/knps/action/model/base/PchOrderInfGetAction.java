package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchOrderInf;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_ORDER_INF照会
 *
 * @author emarfkrow
 */
public class PchOrderInfGetAction extends BaseAction {

    /** PCH_ORDER_INF照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object orderNo = postJson.get("orderNo");
        if (orderNo == null) {
            orderNo = postJson.get("PchOrderInf.orderNo");
        }
        if (orderNo == null) {
            return map;
        }

        PchOrderInf pchOrderInf = PchOrderInf.get(orderNo);
        map.put("PchOrderInf", pchOrderInf);
        return map;
    }

}
