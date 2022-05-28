package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvInoutHistory;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_INOUT_HISTORY削除
 *
 * @author emarfkrow
 */
public class InvInoutHistoryDeleteAction extends BaseAction {

    /** INV_INOUT_HISTORY削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object actionDate = postJson.get("actionDate");
        if (actionDate == null) {
            actionDate = postJson.get("InvInoutHistory.actionDate");
        }
        if (actionDate == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvInoutHistory.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object inOutCounts = postJson.get("inOutCounts");
        if (inOutCounts == null) {
            inOutCounts = postJson.get("InvInoutHistory.inOutCounts");
        }
        if (inOutCounts == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object inOutKbn = postJson.get("inOutKbn");
        if (inOutKbn == null) {
            inOutKbn = postJson.get("InvInoutHistory.inOutKbn");
        }
        if (inOutKbn == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvInoutHistory e = FormValidator.toBean(InvInoutHistory.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
