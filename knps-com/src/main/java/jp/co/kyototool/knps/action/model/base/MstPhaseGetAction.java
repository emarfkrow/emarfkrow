package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstPhase;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_PHASE照会
 *
 * @author emarfkrow
 */
public class MstPhaseGetAction extends BaseAction {

    /** MST_PHASE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object phase = postJson.get("phase");
        if (phase == null) {
            phase = postJson.get("MstPhase.phase");
        }
        if (phase == null) {
            return map;
        }

        MstPhase mstPhase = MstPhase.get(phase);
        map.put("MstPhase", mstPhase);
        return map;
    }

}
