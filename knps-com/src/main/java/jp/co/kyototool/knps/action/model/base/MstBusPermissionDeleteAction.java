package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstBusPermission;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_BUS_PERMISSION削除
 *
 * @author emarfkrow
 */
public class MstBusPermissionDeleteAction extends BaseAction {

    /** MST_BUS_PERMISSION削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object compCode = postJson.get("compCode");
        if (compCode == null) {
            compCode = postJson.get("MstBusPermission.compCode");
        }
        if (compCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object businessNo = postJson.get("businessNo");
        if (businessNo == null) {
            businessNo = postJson.get("MstBusPermission.businessNo");
        }
        if (businessNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstBusPermission e = FormValidator.toBean(MstBusPermission.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
