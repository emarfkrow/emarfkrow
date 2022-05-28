package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupplyListBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUPPLY_LIST_BK照会
 *
 * @author emarfkrow
 */
public class MstSupplyListBkGetAction extends BaseAction {

    /** MST_SUPPLY_LIST_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstSupplyListBk.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstSupplyListBk.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstSupplyListBk.routing");
        }
        if (routing == null) {
            return map;
        }
        Object supplyHinban = postJson.get("supplyHinban");
        if (supplyHinban == null) {
            supplyHinban = postJson.get("MstSupplyListBk.supplyHinban");
        }
        if (supplyHinban == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstSupplyListBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstSupplyListBk mstSupplyListBk = MstSupplyListBk.get(manHinban, routingGroup, routing, supplyHinban, yy);
        map.put("MstSupplyListBk", mstSupplyListBk);
        return map;
    }

}
