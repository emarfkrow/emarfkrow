package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupEmp;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUP_EMP照会
 *
 * @author emarfkrow
 */
public class MstSupEmpGetAction extends BaseAction {

    /** MST_SUP_EMP照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object supplierOpeCode = postJson.get("supplierOpeCode");
        if (supplierOpeCode == null) {
            supplierOpeCode = postJson.get("MstSupEmp.supplierOpeCode");
        }
        if (supplierOpeCode == null) {
            return map;
        }

        MstSupEmp mstSupEmp = MstSupEmp.get(supplierOpeCode);
        map.put("MstSupEmp", mstSupEmp);
        return map;
    }

}
