package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MWseigyo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * WEB制御マスタ削除
 *
 * @author emarfkrow
 */
public class MWseigyoDeleteAction extends BaseAction {

    /** WEB制御マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object webDatakbn = postJson.get("webDatakbn");
        if (webDatakbn == null) {
            webDatakbn = postJson.get("MWseigyo.webDatakbn");
        }
        if (webDatakbn == null) {
            throw new OptLockError("error.cant.delete");
        }

        MWseigyo e = FormValidator.toBean(MWseigyo.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
