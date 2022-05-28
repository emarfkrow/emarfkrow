package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstBusPermission;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_BUS_PERMISSION照会
 *
 * @author emarfkrow
 */
public class MstBusPermissionGetAction extends BaseAction {

    /** MST_BUS_PERMISSION照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object compCode = postJson.get("compCode");
        if (compCode == null) {
            compCode = postJson.get("MstBusPermission.compCode");
        }
        if (compCode == null) {
            return map;
        }
        Object businessNo = postJson.get("businessNo");
        if (businessNo == null) {
            businessNo = postJson.get("MstBusPermission.businessNo");
        }
        if (businessNo == null) {
            return map;
        }

        MstBusPermission mstBusPermission = MstBusPermission.get(compCode, businessNo);
        mstBusPermission.referMstGamenPermissions();
        map.put("MstBusPermission", mstBusPermission);
        return map;
    }

}
