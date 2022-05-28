package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstProc;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_PROC削除
 *
 * @author emarfkrow
 */
public class MstProcDeleteAction extends BaseAction {

    /** MST_PROC削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object routingCode = postJson.get("routingCode");
        if (routingCode == null) {
            routingCode = postJson.get("MstProc.routingCode");
        }
        if (routingCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstProc e = FormValidator.toBean(MstProc.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
