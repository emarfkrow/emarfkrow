package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.SysReqLockStatus;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * SYS_REQ_LOCK_STATUS照会
 *
 * @author emarfkrow
 */
public class SysReqLockStatusGetAction extends BaseAction {

    /** SYS_REQ_LOCK_STATUS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object gamenId = postJson.get("gamenId");
        if (gamenId == null) {
            gamenId = postJson.get("SysReqLockStatus.gamenId");
        }
        if (gamenId == null) {
            return map;
        }

        SysReqLockStatus sysReqLockStatus = SysReqLockStatus.get(gamenId);
        map.put("SysReqLockStatus", sysReqLockStatus);
        return map;
    }

}
