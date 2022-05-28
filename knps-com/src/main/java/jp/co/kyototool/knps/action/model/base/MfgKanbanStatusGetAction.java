package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgKanbanStatus;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_KANBAN_STATUS照会
 *
 * @author emarfkrow
 */
public class MfgKanbanStatusGetAction extends BaseAction {

    /** MFG_KANBAN_STATUS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kanbanId = postJson.get("kanbanId");
        if (kanbanId == null) {
            kanbanId = postJson.get("MfgKanbanStatus.kanbanId");
        }
        if (kanbanId == null) {
            return map;
        }
        Object serialNo = postJson.get("serialNo");
        if (serialNo == null) {
            serialNo = postJson.get("MfgKanbanStatus.serialNo");
        }
        if (serialNo == null) {
            return map;
        }

        MfgKanbanStatus mfgKanbanStatus = MfgKanbanStatus.get(kanbanId, serialNo);
        mfgKanbanStatus.referPrdKanbanMenteHistory();
        map.put("MfgKanbanStatus", mfgKanbanStatus);
        return map;
    }

}
