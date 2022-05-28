package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTempSupplier;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_TEMP_SUPPLIER削除
 *
 * @author emarfkrow
 */
public class MstTempSupplierDeleteAction extends BaseAction {

    /** MST_TEMP_SUPPLIER削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tempSupCode = postJson.get("tempSupCode");
        if (tempSupCode == null) {
            tempSupCode = postJson.get("MstTempSupplier.tempSupCode");
        }
        if (tempSupCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstTempSupplier e = FormValidator.toBean(MstTempSupplier.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
