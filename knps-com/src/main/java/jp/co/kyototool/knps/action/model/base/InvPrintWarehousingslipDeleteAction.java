package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvPrintWarehousingslip;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_PRINT_WAREHOUSINGSLIP削除
 *
 * @author emarfkrow
 */
public class InvPrintWarehousingslipDeleteAction extends BaseAction {

    /** INV_PRINT_WAREHOUSINGSLIP削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvPrintWarehousingslip.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object empCode = postJson.get("empCode");
        if (empCode == null) {
            empCode = postJson.get("InvPrintWarehousingslip.empCode");
        }
        if (empCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvPrintWarehousingslip e = FormValidator.toBean(InvPrintWarehousingslip.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
