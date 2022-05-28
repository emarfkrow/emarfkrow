package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstEmp;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_EMP照会
 *
 * @author emarfkrow
 */
public class MstEmpGetAction extends BaseAction {

    /** MST_EMP照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object empCode = postJson.get("empCode");
        if (empCode == null) {
            empCode = postJson.get("MstEmp.empCode");
        }
        if (empCode == null) {
            return map;
        }

        MstEmp mstEmp = MstEmp.get(empCode);
        map.put("MstEmp", mstEmp);
        return map;
    }

}
