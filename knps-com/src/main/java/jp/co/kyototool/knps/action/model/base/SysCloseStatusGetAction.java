package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.SysCloseStatus;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * SYS_CLOSE_STATUS照会
 *
 * @author emarfkrow
 */
public class SysCloseStatusGetAction extends BaseAction {

    /** SYS_CLOSE_STATUS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object recNo = postJson.get("recNo");
        if (recNo == null) {
            recNo = postJson.get("SysCloseStatus.recNo");
        }
        if (recNo == null) {
            return map;
        }

        SysCloseStatus sysCloseStatus = SysCloseStatus.get(recNo);
        map.put("SysCloseStatus", sysCloseStatus);
        return map;
    }

}
