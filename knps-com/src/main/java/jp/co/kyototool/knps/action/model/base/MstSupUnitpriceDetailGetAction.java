package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitpriceDetail;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUP_UNITPRICE_DETAIL照会
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailGetAction extends BaseAction {

    /** MST_SUP_UNITPRICE_DETAIL照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitpriceDetail.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitpriceDetail.supCode");
        }
        if (supCode == null) {
            return map;
        }
        Object minOrder = postJson.get("minOrder");
        if (minOrder == null) {
            minOrder = postJson.get("MstSupUnitpriceDetail.minOrder");
        }
        if (minOrder == null) {
            return map;
        }

        MstSupUnitpriceDetail mstSupUnitpriceDetail = MstSupUnitpriceDetail.get(hinban, supCode, minOrder);
        mstSupUnitpriceDetail.referMstSupUnitpriceDetailBks();
        mstSupUnitpriceDetail.referMstSupUnitpriceDetailHss();
        map.put("MstSupUnitpriceDetail", mstSupUnitpriceDetail);
        return map;
    }

}
