package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstReason;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_REASON照会
 *
 * @author emarfkrow
 */
public class MstReasonGetAction extends BaseAction {

    /** MST_REASON照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object reasonCode = postJson.get("reasonCode");
        if (reasonCode == null) {
            reasonCode = postJson.get("MstReason.reasonCode");
        }
        if (reasonCode == null) {
            return map;
        }

        MstReason mstReason = MstReason.get(reasonCode);
        map.put("MstReason", mstReason);
        return map;
    }

}
