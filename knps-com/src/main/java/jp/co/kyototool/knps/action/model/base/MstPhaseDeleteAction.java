package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstPhase;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_PHASE削除
 *
 * @author emarfkrow
 */
public class MstPhaseDeleteAction extends BaseAction {

    /** MST_PHASE削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object phase = postJson.get("phase");
        if (phase == null) {
            phase = postJson.get("MstPhase.phase");
        }
        if (phase == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstPhase e = FormValidator.toBean(MstPhase.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
