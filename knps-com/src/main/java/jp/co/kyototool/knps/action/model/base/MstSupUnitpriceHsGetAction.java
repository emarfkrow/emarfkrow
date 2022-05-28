package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitpriceHs;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUP_UNITPRICE_HS照会
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceHsGetAction extends BaseAction {

    /** MST_SUP_UNITPRICE_HS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitpriceHs.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitpriceHs.supCode");
        }
        if (supCode == null) {
            return map;
        }
        Object timeStampChange = postJson.get("timeStampChange");
        if (timeStampChange == null) {
            timeStampChange = postJson.get("MstSupUnitpriceHs.timeStampChange");
        }
        if (timeStampChange == null) {
            return map;
        }

        MstSupUnitpriceHs mstSupUnitpriceHs = MstSupUnitpriceHs.get(hinban, supCode, timeStampChange);
        map.put("MstSupUnitpriceHs", mstSupUnitpriceHs);
        return map;
    }

}
