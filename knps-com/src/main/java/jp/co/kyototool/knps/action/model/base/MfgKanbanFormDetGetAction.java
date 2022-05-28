package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgKanbanFormDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_KANBAN_FORM_DET照会
 *
 * @author emarfkrow
 */
public class MfgKanbanFormDetGetAction extends BaseAction {

    /** MFG_KANBAN_FORM_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kanbanFormDefName = postJson.get("kanbanFormDefName");
        if (kanbanFormDefName == null) {
            kanbanFormDefName = postJson.get("MfgKanbanFormDet.kanbanFormDefName");
        }
        if (kanbanFormDefName == null) {
            return map;
        }
        Object excelCellName = postJson.get("excelCellName");
        if (excelCellName == null) {
            excelCellName = postJson.get("MfgKanbanFormDet.excelCellName");
        }
        if (excelCellName == null) {
            return map;
        }

        MfgKanbanFormDet mfgKanbanFormDet = MfgKanbanFormDet.get(kanbanFormDefName, excelCellName);
        map.put("MfgKanbanFormDet", mfgKanbanFormDet);
        return map;
    }

}
