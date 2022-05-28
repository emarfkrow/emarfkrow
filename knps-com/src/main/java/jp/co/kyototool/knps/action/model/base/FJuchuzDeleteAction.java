package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.FJuchuz;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * F_JUCHUZ削除
 *
 * @author emarfkrow
 */
public class FJuchuzDeleteAction extends BaseAction {

    /** F_JUCHUZ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tokucd = postJson.get("tokucd");
        if (tokucd == null) {
            tokucd = postJson.get("FJuchuz.tokucd");
        }
        if (tokucd == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("FJuchuz.hhinban");
        }
        if (hhinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object juchuno = postJson.get("juchuno");
        if (juchuno == null) {
            juchuno = postJson.get("FJuchuz.juchuno");
        }
        if (juchuno == null) {
            throw new OptLockError("error.cant.delete");
        }

        FJuchuz e = FormValidator.toBean(FJuchuz.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
