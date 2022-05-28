package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitpriceBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUP_UNITPRICE_BK照会
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceBkGetAction extends BaseAction {

    /** MST_SUP_UNITPRICE_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitpriceBk.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitpriceBk.supCode");
        }
        if (supCode == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstSupUnitpriceBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstSupUnitpriceBk mstSupUnitpriceBk = MstSupUnitpriceBk.get(hinban, supCode, yy);
        map.put("MstSupUnitpriceBk", mstSupUnitpriceBk);
        return map;
    }

}
