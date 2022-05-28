package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvPrintWarehousingslip;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_PRINT_WAREHOUSINGSLIP照会
 *
 * @author emarfkrow
 */
public class InvPrintWarehousingslipGetAction extends BaseAction {

    /** INV_PRINT_WAREHOUSINGSLIP照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvPrintWarehousingslip.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object empCode = postJson.get("empCode");
        if (empCode == null) {
            empCode = postJson.get("InvPrintWarehousingslip.empCode");
        }
        if (empCode == null) {
            return map;
        }

        InvPrintWarehousingslip invPrintWarehousingslip = InvPrintWarehousingslip.get(hinban, empCode);
        map.put("InvPrintWarehousingslip", invPrintWarehousingslip);
        return map;
    }

}
