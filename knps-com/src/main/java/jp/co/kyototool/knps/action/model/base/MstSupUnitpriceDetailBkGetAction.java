package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitpriceDetailBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUP_UNITPRICE_DETAIL_BK照会
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailBkGetAction extends BaseAction {

    /** MST_SUP_UNITPRICE_DETAIL_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitpriceDetailBk.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitpriceDetailBk.supCode");
        }
        if (supCode == null) {
            return map;
        }
        Object minOrder = postJson.get("minOrder");
        if (minOrder == null) {
            minOrder = postJson.get("MstSupUnitpriceDetailBk.minOrder");
        }
        if (minOrder == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstSupUnitpriceDetailBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstSupUnitpriceDetailBk mstSupUnitpriceDetailBk = MstSupUnitpriceDetailBk.get(hinban, supCode, minOrder, yy);
        map.put("MstSupUnitpriceDetailBk", mstSupUnitpriceDetailBk);
        return map;
    }

}
