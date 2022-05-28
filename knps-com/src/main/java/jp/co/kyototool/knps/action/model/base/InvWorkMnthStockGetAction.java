package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvWorkMnthStock;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_WORK_MNTH_STOCK照会
 *
 * @author emarfkrow
 */
public class InvWorkMnthStockGetAction extends BaseAction {

    /** INV_WORK_MNTH_STOCK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object dataId = postJson.get("dataId");
        if (dataId == null) {
            dataId = postJson.get("InvWorkMnthStock.dataId");
        }
        if (dataId == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvWorkMnthStock.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("InvWorkMnthStock.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("InvWorkMnthStock.routing");
        }
        if (routing == null) {
            return map;
        }

        InvWorkMnthStock invWorkMnthStock = InvWorkMnthStock.get(dataId, hinban, routingGroup, routing);
        map.put("InvWorkMnthStock", invWorkMnthStock);
        return map;
    }

}
