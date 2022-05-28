package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstBtnPermission;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_BTN_PERMISSION照会
 *
 * @author emarfkrow
 */
public class MstBtnPermissionGetAction extends BaseAction {

    /** MST_BTN_PERMISSION照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object compCode = postJson.get("compCode");
        if (compCode == null) {
            compCode = postJson.get("MstBtnPermission.compCode");
        }
        if (compCode == null) {
            return map;
        }
        Object gamenId = postJson.get("gamenId");
        if (gamenId == null) {
            gamenId = postJson.get("MstBtnPermission.gamenId");
        }
        if (gamenId == null) {
            return map;
        }
        Object buttonId = postJson.get("buttonId");
        if (buttonId == null) {
            buttonId = postJson.get("MstBtnPermission.buttonId");
        }
        if (buttonId == null) {
            return map;
        }

        MstBtnPermission mstBtnPermission = MstBtnPermission.get(compCode, gamenId, buttonId);
        map.put("MstBtnPermission", mstBtnPermission);
        return map;
    }

}
