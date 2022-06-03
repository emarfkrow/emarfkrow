package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHososet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 包装材構成マスタ削除
 *
 * @author emarfkrow
 */
public class MHososetDeleteAction extends BaseAction {

    /** 包装材構成マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MHososet.hhinban");
        }
        if (hhinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hosoHinban = postJson.get("hosoHinban");
        if (hosoHinban == null) {
            hosoHinban = postJson.get("MHososet.hosoHinban");
        }
        if (hosoHinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MHososet e = FormValidator.toBean(MHososet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
