package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitpriceDetailHs;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUP_UNITPRICE_DETAIL_HS照会
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailHsGetAction extends BaseAction {

    /** MST_SUP_UNITPRICE_DETAIL_HS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitpriceDetailHs.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitpriceDetailHs.supCode");
        }
        if (supCode == null) {
            return map;
        }
        Object minOrder = postJson.get("minOrder");
        if (minOrder == null) {
            minOrder = postJson.get("MstSupUnitpriceDetailHs.minOrder");
        }
        if (minOrder == null) {
            return map;
        }
        Object timeStampChange = postJson.get("timeStampChange");
        if (timeStampChange == null) {
            timeStampChange = postJson.get("MstSupUnitpriceDetailHs.timeStampChange");
        }
        if (timeStampChange == null) {
            return map;
        }

        MstSupUnitpriceDetailHs mstSupUnitpriceDetailHs = MstSupUnitpriceDetailHs.get(hinban, supCode, minOrder, timeStampChange);
        map.put("MstSupUnitpriceDetailHs", mstSupUnitpriceDetailHs);
        return map;
    }

}
