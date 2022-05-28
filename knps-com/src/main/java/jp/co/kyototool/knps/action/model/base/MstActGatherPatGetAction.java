package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstActGatherPat;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_ACT_GATHER_PAT照会
 *
 * @author emarfkrow
 */
public class MstActGatherPatGetAction extends BaseAction {

    /** MST_ACT_GATHER_PAT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object actGatherPatNo = postJson.get("actGatherPatNo");
        if (actGatherPatNo == null) {
            actGatherPatNo = postJson.get("MstActGatherPat.actGatherPatNo");
        }
        if (actGatherPatNo == null) {
            return map;
        }

        MstActGatherPat mstActGatherPat = MstActGatherPat.get(actGatherPatNo);
        map.put("MstActGatherPat", mstActGatherPat);
        return map;
    }

}
