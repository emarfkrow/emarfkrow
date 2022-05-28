package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockProcessDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_PROCESS_DET照会
 *
 * @author emarfkrow
 */
public class InvStockProcessDetGetAction extends BaseAction {

    /** INV_STOCK_PROCESS_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvStockProcessDet.locationCode");
        }
        if (locationCode == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockProcessDet.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object inOutYmd = postJson.get("inOutYmd");
        if (inOutYmd == null) {
            inOutYmd = postJson.get("InvStockProcessDet.inOutYmd");
        }
        if (inOutYmd == null) {
            return map;
        }
        Object inOutSeq = postJson.get("inOutSeq");
        if (inOutSeq == null) {
            inOutSeq = postJson.get("InvStockProcessDet.inOutSeq");
        }
        if (inOutSeq == null) {
            return map;
        }

        InvStockProcessDet invStockProcessDet = InvStockProcessDet.get(locationCode, hinban, inOutYmd, inOutSeq);
        map.put("InvStockProcessDet", invStockProcessDet);
        return map;
    }

}
