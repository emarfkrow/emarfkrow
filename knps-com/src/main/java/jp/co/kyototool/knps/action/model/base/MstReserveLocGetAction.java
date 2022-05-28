package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstReserveLoc;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_RESERVE_LOC照会
 *
 * @author emarfkrow
 */
public class MstReserveLocGetAction extends BaseAction {

    /** MST_RESERVE_LOC照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstReserveLoc.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object opeDetail = postJson.get("opeDetail");
        if (opeDetail == null) {
            opeDetail = postJson.get("MstReserveLoc.opeDetail");
        }
        if (opeDetail == null) {
            return map;
        }
        Object reserveLocSeq = postJson.get("reserveLocSeq");
        if (reserveLocSeq == null) {
            reserveLocSeq = postJson.get("MstReserveLoc.reserveLocSeq");
        }
        if (reserveLocSeq == null) {
            return map;
        }

        MstReserveLoc mstReserveLoc = MstReserveLoc.get(hinban, opeDetail, reserveLocSeq);
        map.put("MstReserveLoc", mstReserveLoc);
        return map;
    }

}
