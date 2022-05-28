package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstGamenPermission;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_GAMEN_PERMISSION照会
 *
 * @author emarfkrow
 */
public class MstGamenPermissionGetAction extends BaseAction {

    /** MST_GAMEN_PERMISSION照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object compCode = postJson.get("compCode");
        if (compCode == null) {
            compCode = postJson.get("MstGamenPermission.compCode");
        }
        if (compCode == null) {
            return map;
        }
        Object businessNo = postJson.get("businessNo");
        if (businessNo == null) {
            businessNo = postJson.get("MstGamenPermission.businessNo");
        }
        if (businessNo == null) {
            return map;
        }
        Object gamenId = postJson.get("gamenId");
        if (gamenId == null) {
            gamenId = postJson.get("MstGamenPermission.gamenId");
        }
        if (gamenId == null) {
            return map;
        }

        MstGamenPermission mstGamenPermission = MstGamenPermission.get(compCode, businessNo, gamenId);
        map.put("MstGamenPermission", mstGamenPermission);
        return map;
    }

}
