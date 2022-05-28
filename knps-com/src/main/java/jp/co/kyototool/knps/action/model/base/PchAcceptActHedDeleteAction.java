package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchAcceptActHed;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PCH_ACCEPT_ACT_HED削除
 *
 * @author emarfkrow
 */
public class PchAcceptActHedDeleteAction extends BaseAction {

    /** PCH_ACCEPT_ACT_HED削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object actNo = postJson.get("actNo");
        if (actNo == null) {
            actNo = postJson.get("PchAcceptActHed.actNo");
        }
        if (actNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        PchAcceptActHed e = FormValidator.toBean(PchAcceptActHed.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
