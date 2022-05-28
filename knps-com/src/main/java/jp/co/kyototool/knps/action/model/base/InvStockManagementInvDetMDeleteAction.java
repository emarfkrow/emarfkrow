package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockManagementInvDetM;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_STOCK_MANAGEMENT_INV_DET_M削除
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetMDeleteAction extends BaseAction {

    /** INV_STOCK_MANAGEMENT_INV_DET_M削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockManagementInvDetM.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvStockManagementInvDetM.subInvCode");
        }
        if (subInvCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvStockManagementInvDetM.stockManagementSection");
        }
        if (stockManagementSection == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object invPhase = postJson.get("invPhase");
        if (invPhase == null) {
            invPhase = postJson.get("InvStockManagementInvDetM.invPhase");
        }
        if (invPhase == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object invPhaseMonth = postJson.get("invPhaseMonth");
        if (invPhaseMonth == null) {
            invPhaseMonth = postJson.get("InvStockManagementInvDetM.invPhaseMonth");
        }
        if (invPhaseMonth == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object invBranchNo = postJson.get("invBranchNo");
        if (invBranchNo == null) {
            invBranchNo = postJson.get("InvStockManagementInvDetM.invBranchNo");
        }
        if (invBranchNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvStockManagementInvDetM e = FormValidator.toBean(InvStockManagementInvDetM.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
