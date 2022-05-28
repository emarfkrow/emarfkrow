package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.SysReqStatus;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * SYS_REQ_STATUS照会
 *
 * @author emarfkrow
 */
public class SysReqStatusGetAction extends BaseAction {

    /** SYS_REQ_STATUS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object reqId = postJson.get("reqId");
        if (reqId == null) {
            reqId = postJson.get("SysReqStatus.reqId");
        }
        if (reqId == null) {
            return map;
        }

        SysReqStatus sysReqStatus = SysReqStatus.get(reqId);
        map.put("SysReqStatus", sysReqStatus);
        return map;
    }

}
