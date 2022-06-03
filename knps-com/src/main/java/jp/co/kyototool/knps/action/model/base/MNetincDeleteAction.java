package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MNetinc;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * ネットインカム削除
 *
 * @author emarfkrow
 */
public class MNetincDeleteAction extends BaseAction {

    /** ネットインカム削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object honshacd = postJson.get("honshacd");
        if (honshacd == null) {
            honshacd = postJson.get("MNetinc.honshacd");
        }
        if (honshacd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MNetinc e = FormValidator.toBean(MNetinc.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
