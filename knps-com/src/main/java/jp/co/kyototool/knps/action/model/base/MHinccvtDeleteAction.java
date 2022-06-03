package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHinccvt;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 品番変換マスタ削除
 *
 * @author emarfkrow
 */
public class MHinccvtDeleteAction extends BaseAction {

    /** 品番変換マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object cvthinban = postJson.get("cvthinban");
        if (cvthinban == null) {
            cvthinban = postJson.get("MHinccvt.cvthinban");
        }
        if (cvthinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object chokuhinkbn = postJson.get("chokuhinkbn");
        if (chokuhinkbn == null) {
            chokuhinkbn = postJson.get("MHinccvt.chokuhinkbn");
        }
        if (chokuhinkbn == null) {
            throw new OptLockError("error.cant.delete");
        }

        MHinccvt e = FormValidator.toBean(MHinccvt.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
