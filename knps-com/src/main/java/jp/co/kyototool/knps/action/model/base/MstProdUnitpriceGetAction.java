package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstProdUnitprice;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_PROD_UNITPRICE照会
 *
 * @author emarfkrow
 */
public class MstProdUnitpriceGetAction extends BaseAction {

    /** MST_PROD_UNITPRICE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstProdUnitprice.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object routingGroup = postJson.get("routingGroup");
        if (routingGroup == null) {
            routingGroup = postJson.get("MstProdUnitprice.routingGroup");
        }
        if (routingGroup == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstProdUnitprice.routing");
        }
        if (routing == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MstProdUnitprice.wcCode");
        }
        if (wcCode == null) {
            return map;
        }
        Object minOrder = postJson.get("minOrder");
        if (minOrder == null) {
            minOrder = postJson.get("MstProdUnitprice.minOrder");
        }
        if (minOrder == null) {
            return map;
        }

        MstProdUnitprice mstProdUnitprice = MstProdUnitprice.get(manHinban, routingGroup, routing, wcCode, minOrder);
        mstProdUnitprice.referMstProdUnitpriceBks();
        mstProdUnitprice.referMstProdUnitpriceHss();
        map.put("MstProdUnitprice", mstProdUnitprice);
        return map;
    }

}
