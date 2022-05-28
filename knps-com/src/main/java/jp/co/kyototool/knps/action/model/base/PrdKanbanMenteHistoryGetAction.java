package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdKanbanMenteHistory;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_KANBAN_MENTE_HISTORY照会
 *
 * @author emarfkrow
 */
public class PrdKanbanMenteHistoryGetAction extends BaseAction {

    /** PRD_KANBAN_MENTE_HISTORY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kanbanId = postJson.get("kanbanId");
        if (kanbanId == null) {
            kanbanId = postJson.get("PrdKanbanMenteHistory.kanbanId");
        }
        if (kanbanId == null) {
            return map;
        }
        Object serialNo = postJson.get("serialNo");
        if (serialNo == null) {
            serialNo = postJson.get("PrdKanbanMenteHistory.serialNo");
        }
        if (serialNo == null) {
            return map;
        }

        PrdKanbanMenteHistory prdKanbanMenteHistory = PrdKanbanMenteHistory.get(kanbanId, serialNo);
        map.put("PrdKanbanMenteHistory", prdKanbanMenteHistory);
        return map;
    }

}
