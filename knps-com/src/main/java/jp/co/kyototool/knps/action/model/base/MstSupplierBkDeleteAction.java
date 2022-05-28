package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupplierBk;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_SUPPLIER_BK削除
 *
 * @author emarfkrow
 */
public class MstSupplierBkDeleteAction extends BaseAction {

    /** MST_SUPPLIER_BK削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupplierBk.supCode");
        }
        if (supCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstSupplierBk.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstSupplierBk e = FormValidator.toBean(MstSupplierBk.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
