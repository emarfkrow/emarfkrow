package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstReserveLoc;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_RESERVE_LOC削除
 *
 * @author emarfkrow
 */
public class MstReserveLocDeleteAction extends BaseAction {

    /** MST_RESERVE_LOC削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstReserveLoc.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object opeDetail = postJson.get("opeDetail");
        if (opeDetail == null) {
            opeDetail = postJson.get("MstReserveLoc.opeDetail");
        }
        if (opeDetail == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object reserveLocSeq = postJson.get("reserveLocSeq");
        if (reserveLocSeq == null) {
            reserveLocSeq = postJson.get("MstReserveLoc.reserveLocSeq");
        }
        if (reserveLocSeq == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstReserveLoc e = FormValidator.toBean(MstReserveLoc.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
