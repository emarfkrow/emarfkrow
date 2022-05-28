package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgKanbanFormHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_KANBAN_FORM_HED照会
 *
 * @author emarfkrow
 */
public class MfgKanbanFormHedGetAction extends BaseAction {

    /** MFG_KANBAN_FORM_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kanbanFormDefName = postJson.get("kanbanFormDefName");
        if (kanbanFormDefName == null) {
            kanbanFormDefName = postJson.get("MfgKanbanFormHed.kanbanFormDefName");
        }
        if (kanbanFormDefName == null) {
            return map;
        }

        MfgKanbanFormHed mfgKanbanFormHed = MfgKanbanFormHed.get(kanbanFormDefName);
        mfgKanbanFormHed.referMfgKanbanFormDets();
        map.put("MfgKanbanFormHed", mfgKanbanFormHed);
        return map;
    }

}
