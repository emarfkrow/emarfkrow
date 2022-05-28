package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSetConstitution;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_SET_CONSTITUTION削除
 *
 * @author emarfkrow
 */
public class MstSetConstitutionDeleteAction extends BaseAction {

    /** MST_SET_CONSTITUTION削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object setHinban = postJson.get("setHinban");
        if (setHinban == null) {
            setHinban = postJson.get("MstSetConstitution.setHinban");
        }
        if (setHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object setChildHinban = postJson.get("setChildHinban");
        if (setChildHinban == null) {
            setChildHinban = postJson.get("MstSetConstitution.setChildHinban");
        }
        if (setChildHinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstSetConstitution e = FormValidator.toBean(MstSetConstitution.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
