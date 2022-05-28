package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstBtnPermission;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_BTN_PERMISSION削除
 *
 * @author emarfkrow
 */
public class MstBtnPermissionDeleteAction extends BaseAction {

    /** MST_BTN_PERMISSION削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object compCode = postJson.get("compCode");
        if (compCode == null) {
            compCode = postJson.get("MstBtnPermission.compCode");
        }
        if (compCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object gamenId = postJson.get("gamenId");
        if (gamenId == null) {
            gamenId = postJson.get("MstBtnPermission.gamenId");
        }
        if (gamenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object buttonId = postJson.get("buttonId");
        if (buttonId == null) {
            buttonId = postJson.get("MstBtnPermission.buttonId");
        }
        if (buttonId == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstBtnPermission e = FormValidator.toBean(MstBtnPermission.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
