package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvMtrlInoutHistory;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_MTRL_INOUT_HISTORY削除
 *
 * @author emarfkrow
 */
public class InvMtrlInoutHistoryDeleteAction extends BaseAction {

    /** INV_MTRL_INOUT_HISTORY削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvMtrlInoutHistory.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvMtrlInoutHistory.subInvCode");
        }
        if (subInvCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvMtrlInoutHistory.stockManagementSection");
        }
        if (stockManagementSection == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object inOutDate = postJson.get("inOutDate");
        if (inOutDate == null) {
            inOutDate = postJson.get("InvMtrlInoutHistory.inOutDate");
        }
        if (inOutDate == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object stockBranchNumber = postJson.get("stockBranchNumber");
        if (stockBranchNumber == null) {
            stockBranchNumber = postJson.get("InvMtrlInoutHistory.stockBranchNumber");
        }
        if (stockBranchNumber == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvMtrlInoutHistory e = FormValidator.toBean(InvMtrlInoutHistory.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
