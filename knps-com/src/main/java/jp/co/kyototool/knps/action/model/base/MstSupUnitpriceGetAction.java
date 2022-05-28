package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitprice;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUP_UNITPRICE照会
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceGetAction extends BaseAction {

    /** MST_SUP_UNITPRICE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitprice.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitprice.supCode");
        }
        if (supCode == null) {
            return map;
        }

        MstSupUnitprice mstSupUnitprice = MstSupUnitprice.get(hinban, supCode);
        mstSupUnitprice.referMstSupUnitpriceBks();
        mstSupUnitprice.referMstSupUnitpriceDetails();
        mstSupUnitprice.referMstSupUnitpriceHss();
        map.put("MstSupUnitprice", mstSupUnitprice);
        return map;
    }

}
