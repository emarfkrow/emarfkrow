package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSetkari;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * M_SETKARI削除
 *
 * @author emarfkrow
 */
public class MSetkariDeleteAction extends BaseAction {

    /** M_SETKARI削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object setHinban = postJson.get("setHinban");
        if (setHinban == null) {
            setHinban = postJson.get("MSetkari.setHinban");
        }
        if (setHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object setKhinban = postJson.get("setKhinban");
        if (setKhinban == null) {
            setKhinban = postJson.get("MSetkari.setKhinban");
        }
        if (setKhinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MSetkari e = FormValidator.toBean(MSetkari.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
