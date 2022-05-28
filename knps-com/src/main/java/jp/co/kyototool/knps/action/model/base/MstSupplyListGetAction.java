package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupplyList;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUPPLY_LIST照会
 *
 * @author emarfkrow
 */
public class MstSupplyListGetAction extends BaseAction {

    /** MST_SUPPLY_LIST照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstSupplyList.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstSupplyList.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstSupplyList.routing");
        }
        if (routing == null) {
            return map;
        }
        Object supplyHinban = postJson.get("supplyHinban");
        if (supplyHinban == null) {
            supplyHinban = postJson.get("MstSupplyList.supplyHinban");
        }
        if (supplyHinban == null) {
            return map;
        }

        MstSupplyList mstSupplyList = MstSupplyList.get(manHinban, routingGroup, routing, supplyHinban);
        mstSupplyList.referMstSupplyListBks();
        mstSupplyList.referMstSupplyListHss();
        map.put("MstSupplyList", mstSupplyList);
        return map;
    }

}
