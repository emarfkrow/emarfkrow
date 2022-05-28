package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockManagementInvDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_STOCK_MANAGEMENT_INV_DET一覧削除
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetSDeleteAction extends BaseAction {

    /** INV_STOCK_MANAGEMENT_INV_DET一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("InvStockManagementInvDetGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("HINBAN"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("SUB_INV_CODE"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("STOCK_MANAGEMENT_SECTION"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("INV_PHASE"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("INV_PHASE_MONTH"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("INV_BRANCH_NO"))) {
                throw new OptLockError("error.cant.delete");
            }

            InvStockManagementInvDet e = FormValidator.toBean(InvStockManagementInvDet.class.getName(), gridRow);
            if (e.delete() != 1) {
                throw new OptLockError("error.cant.delete");
            }
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
