package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MBaraten;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * バラ展開マスタ削除
 *
 * @author emarfkrow
 */
public class MBaratenDeleteAction extends BaseAction {

    /** バラ展開マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object oyaHinban = postJson.get("oyaHinban");
        if (oyaHinban == null) {
            oyaHinban = postJson.get("MBaraten.oyaHinban");
        }
        if (oyaHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object koHinban = postJson.get("koHinban");
        if (koHinban == null) {
            koHinban = postJson.get("MBaraten.koHinban");
        }
        if (koHinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MBaraten e = FormValidator.toBean(MBaraten.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
