package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstGamen;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_GAMEN照会
 *
 * @author emarfkrow
 */
public class MstGamenGetAction extends BaseAction {

    /** MST_GAMEN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object gamenId = postJson.get("gamenId");
        if (gamenId == null) {
            gamenId = postJson.get("MstGamen.gamenId");
        }
        if (gamenId == null) {
            return map;
        }

        MstGamen mstGamen = MstGamen.get(gamenId);
        mstGamen.referSysReqLockStatus();
        map.put("MstGamen", mstGamen);
        return map;
    }

}
