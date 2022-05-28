package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgKanbanFormDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_KANBAN_FORM_DET削除
 *
 * @author emarfkrow
 */
public class MfgKanbanFormDetDeleteAction extends BaseAction {

    /** MFG_KANBAN_FORM_DET削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kanbanFormDefName = postJson.get("kanbanFormDefName");
        if (kanbanFormDefName == null) {
            kanbanFormDefName = postJson.get("MfgKanbanFormDet.kanbanFormDefName");
        }
        if (kanbanFormDefName == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object excelCellName = postJson.get("excelCellName");
        if (excelCellName == null) {
            excelCellName = postJson.get("MfgKanbanFormDet.excelCellName");
        }
        if (excelCellName == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgKanbanFormDet e = FormValidator.toBean(MfgKanbanFormDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
