package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgKanbanAct;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_KANBAN_ACT照会
 *
 * @author emarfkrow
 */
public class MfgKanbanActGetAction extends BaseAction {

    /** MFG_KANBAN_ACT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object actNo = postJson.get("actNo");
        if (actNo == null) {
            actNo = postJson.get("MfgKanbanAct.actNo");
        }
        if (actNo == null) {
            return map;
        }

        MfgKanbanAct mfgKanbanAct = MfgKanbanAct.get(actNo);
        mfgKanbanAct.referPchAcceptActHed();
        mfgKanbanAct.referPchAcceptActDets();
        map.put("MfgKanbanAct", mfgKanbanAct);
        return map;
    }

}
