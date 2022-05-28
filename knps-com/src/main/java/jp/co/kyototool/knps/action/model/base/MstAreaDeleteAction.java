package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstArea;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_AREA削除
 *
 * @author emarfkrow
 */
public class MstAreaDeleteAction extends BaseAction {

    /** MST_AREA削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object areaCd = postJson.get("areaCd");
        if (areaCd == null) {
            areaCd = postJson.get("MstArea.areaCd");
        }
        if (areaCd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstArea e = FormValidator.toBean(MstArea.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
