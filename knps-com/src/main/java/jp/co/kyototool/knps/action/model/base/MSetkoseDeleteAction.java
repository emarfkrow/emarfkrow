package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSetkose;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * M_SETKOSE削除
 *
 * @author emarfkrow
 */
public class MSetkoseDeleteAction extends BaseAction {

    /** M_SETKOSE削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object setHinban = postJson.get("setHinban");
        if (setHinban == null) {
            setHinban = postJson.get("MSetkose.setHinban");
        }
        if (setHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object setKhinban = postJson.get("setKhinban");
        if (setKhinban == null) {
            setKhinban = postJson.get("MSetkose.setKhinban");
        }
        if (setKhinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MSetkose e = FormValidator.toBean(MSetkose.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
