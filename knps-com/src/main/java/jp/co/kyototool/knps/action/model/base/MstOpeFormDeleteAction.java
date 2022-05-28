package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstOpeForm;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_OPE_FORM削除
 *
 * @author emarfkrow
 */
public class MstOpeFormDeleteAction extends BaseAction {

    /** MST_OPE_FORM削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object patternNo = postJson.get("patternNo");
        if (patternNo == null) {
            patternNo = postJson.get("MstOpeForm.patternNo");
        }
        if (patternNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstOpeForm e = FormValidator.toBean(MstOpeForm.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
