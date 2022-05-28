package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchPayActHed;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PCH_PAY_ACT_HED削除
 *
 * @author emarfkrow
 */
public class PchPayActHedDeleteAction extends BaseAction {

    /** PCH_PAY_ACT_HED削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object payNo = postJson.get("payNo");
        if (payNo == null) {
            payNo = postJson.get("PchPayActHed.payNo");
        }
        if (payNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        PchPayActHed e = FormValidator.toBean(PchPayActHed.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
