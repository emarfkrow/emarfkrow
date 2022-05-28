package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvYStkAmountComm;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_Y_STK_AMOUNT_COMM削除
 *
 * @author emarfkrow
 */
public class InvYStkAmountCommDeleteAction extends BaseAction {

    /** INV_Y_STK_AMOUNT_COMM削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("InvYStkAmountComm.proHinban");
        }
        if (proHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvYStkAmountComm.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvYStkAmountComm.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvYStkAmountComm e = FormValidator.toBean(InvYStkAmountComm.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
