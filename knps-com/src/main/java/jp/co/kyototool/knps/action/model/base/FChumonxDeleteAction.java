package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.FChumonx;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * F_CHUMONX削除
 *
 * @author emarfkrow
 */
public class FChumonxDeleteAction extends BaseAction {

    /** F_CHUMONX削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tokucd = postJson.get("tokucd");
        if (tokucd == null) {
            tokucd = postJson.get("FChumonx.tokucd");
        }
        if (tokucd == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("FChumonx.hhinban");
        }
        if (hhinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object juchuno = postJson.get("juchuno");
        if (juchuno == null) {
            juchuno = postJson.get("FChumonx.juchuno");
        }
        if (juchuno == null) {
            throw new OptLockError("error.cant.delete");
        }

        FChumonx e = FormValidator.toBean(FChumonx.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
