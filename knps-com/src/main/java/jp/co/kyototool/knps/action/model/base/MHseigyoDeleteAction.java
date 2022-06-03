package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHseigyo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 販売制御マスタ削除
 *
 * @author emarfkrow
 */
public class MHseigyoDeleteAction extends BaseAction {

    /** 販売制御マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object keycd = postJson.get("keycd");
        if (keycd == null) {
            keycd = postJson.get("MHseigyo.keycd");
        }
        if (keycd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MHseigyo e = FormValidator.toBean(MHseigyo.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
