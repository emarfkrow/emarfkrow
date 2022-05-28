package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchTempOrderDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PCH_TEMP_ORDER_DET削除
 *
 * @author emarfkrow
 */
public class PchTempOrderDetDeleteAction extends BaseAction {

    /** PCH_TEMP_ORDER_DET削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tempOrderNo = postJson.get("tempOrderNo");
        if (tempOrderNo == null) {
            tempOrderNo = postJson.get("PchTempOrderDet.tempOrderNo");
        }
        if (tempOrderNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tempOrderSeq = postJson.get("tempOrderSeq");
        if (tempOrderSeq == null) {
            tempOrderSeq = postJson.get("PchTempOrderDet.tempOrderSeq");
        }
        if (tempOrderSeq == null) {
            throw new OptLockError("error.cant.delete");
        }

        PchTempOrderDet e = FormValidator.toBean(PchTempOrderDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
