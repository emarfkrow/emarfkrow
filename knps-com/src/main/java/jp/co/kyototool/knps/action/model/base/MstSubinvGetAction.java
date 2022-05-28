package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSubinv;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUBINV照会
 *
 * @author emarfkrow
 */
public class MstSubinvGetAction extends BaseAction {

    /** MST_SUBINV照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("MstSubinv.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }

        MstSubinv mstSubinv = MstSubinv.get(subInvCode);
        map.put("MstSubinv", mstSubinv);
        return map;
    }

}
