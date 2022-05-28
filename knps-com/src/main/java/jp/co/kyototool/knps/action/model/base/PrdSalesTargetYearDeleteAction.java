package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdSalesTargetYear;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_SALES_TARGET_YEAR削除
 *
 * @author emarfkrow
 */
public class PrdSalesTargetYearDeleteAction extends BaseAction {

    /** PRD_SALES_TARGET_YEAR削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdSalesTargetYear.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdSalesTargetYear.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object fileId = postJson.get("fileId");
        if (fileId == null) {
            fileId = postJson.get("PrdSalesTargetYear.fileId");
        }
        if (fileId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object salesHinban = postJson.get("salesHinban");
        if (salesHinban == null) {
            salesHinban = postJson.get("PrdSalesTargetYear.salesHinban");
        }
        if (salesHinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdSalesTargetYear e = FormValidator.toBean(PrdSalesTargetYear.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
