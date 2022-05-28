package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupplyListHs;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUPPLY_LIST_HS照会
 *
 * @author emarfkrow
 */
public class MstSupplyListHsGetAction extends BaseAction {

    /** MST_SUPPLY_LIST_HS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstSupplyListHs.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstSupplyListHs.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstSupplyListHs.routing");
        }
        if (routing == null) {
            return map;
        }
        Object supplyHinban = postJson.get("supplyHinban");
        if (supplyHinban == null) {
            supplyHinban = postJson.get("MstSupplyListHs.supplyHinban");
        }
        if (supplyHinban == null) {
            return map;
        }
        Object timeStampChange = postJson.get("timeStampChange");
        if (timeStampChange == null) {
            timeStampChange = postJson.get("MstSupplyListHs.timeStampChange");
        }
        if (timeStampChange == null) {
            return map;
        }

        MstSupplyListHs mstSupplyListHs = MstSupplyListHs.get(manHinban, routingGroup, routing, supplyHinban, timeStampChange);
        map.put("MstSupplyListHs", mstSupplyListHs);
        return map;
    }

}
