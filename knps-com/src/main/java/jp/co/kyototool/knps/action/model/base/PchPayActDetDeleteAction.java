package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchPayActDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PCH_PAY_ACT_DET削除
 *
 * @author emarfkrow
 */
public class PchPayActDetDeleteAction extends BaseAction {

    /** PCH_PAY_ACT_DET削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object payNo = postJson.get("payNo");
        if (payNo == null) {
            payNo = postJson.get("PchPayActDet.payNo");
        }
        if (payNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object payBranchNo = postJson.get("payBranchNo");
        if (payBranchNo == null) {
            payBranchNo = postJson.get("PchPayActDet.payBranchNo");
        }
        if (payBranchNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        PchPayActDet e = FormValidator.toBean(PchPayActDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
