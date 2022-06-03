package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MPkose;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 部品構成マスタ削除
 *
 * @author emarfkrow
 */
public class MPkoseDeleteAction extends BaseAction {

    /** 部品構成マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MPkose.hhinban");
        }
        if (hhinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object phinban = postJson.get("phinban");
        if (phinban == null) {
            phinban = postJson.get("MPkose.phinban");
        }
        if (phinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MPkose e = FormValidator.toBean(MPkose.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
