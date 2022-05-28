package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdRackMainte;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_RACK_MAINTE削除
 *
 * @author emarfkrow
 */
public class PrdRackMainteDeleteAction extends BaseAction {

    /** PRD_RACK_MAINTE削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdRackMainte.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdRackMainte.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object rackName = postJson.get("rackName");
        if (rackName == null) {
            rackName = postJson.get("PrdRackMainte.rackName");
        }
        if (rackName == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdRackMainte e = FormValidator.toBean(PrdRackMainte.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
