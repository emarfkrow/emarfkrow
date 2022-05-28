package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockProcessDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_STOCK_PROCESS_DET削除
 *
 * @author emarfkrow
 */
public class InvStockProcessDetDeleteAction extends BaseAction {

    /** INV_STOCK_PROCESS_DET削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvStockProcessDet.locationCode");
        }
        if (locationCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockProcessDet.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object inOutYmd = postJson.get("inOutYmd");
        if (inOutYmd == null) {
            inOutYmd = postJson.get("InvStockProcessDet.inOutYmd");
        }
        if (inOutYmd == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object inOutSeq = postJson.get("inOutSeq");
        if (inOutSeq == null) {
            inOutSeq = postJson.get("InvStockProcessDet.inOutSeq");
        }
        if (inOutSeq == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvStockProcessDet e = FormValidator.toBean(InvStockProcessDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
