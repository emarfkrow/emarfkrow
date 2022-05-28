package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstEmp;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_EMP削除
 *
 * @author emarfkrow
 */
public class MstEmpDeleteAction extends BaseAction {

    /** MST_EMP削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object empCode = postJson.get("empCode");
        if (empCode == null) {
            empCode = postJson.get("MstEmp.empCode");
        }
        if (empCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstEmp e = FormValidator.toBean(MstEmp.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
