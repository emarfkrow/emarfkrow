package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstHinbanEmp;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_HINBAN_EMP削除
 *
 * @author emarfkrow
 */
public class MstHinbanEmpDeleteAction extends BaseAction {

    /** MST_HINBAN_EMP削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinbanOpeCode = postJson.get("hinbanOpeCode");
        if (hinbanOpeCode == null) {
            hinbanOpeCode = postJson.get("MstHinbanEmp.hinbanOpeCode");
        }
        if (hinbanOpeCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstHinbanEmp e = FormValidator.toBean(MstHinbanEmp.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
