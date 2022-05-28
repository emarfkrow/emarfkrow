package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgKanbanShipping;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_KANBAN_SHIPPING照会
 *
 * @author emarfkrow
 */
public class MfgKanbanShippingGetAction extends BaseAction {

    /** MFG_KANBAN_SHIPPING照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kanbanId = postJson.get("kanbanId");
        if (kanbanId == null) {
            kanbanId = postJson.get("MfgKanbanShipping.kanbanId");
        }
        if (kanbanId == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgKanbanShipping.hinban");
        }
        if (hinban == null) {
            return map;
        }

        MfgKanbanShipping mfgKanbanShipping = MfgKanbanShipping.get(kanbanId, hinban);
        map.put("MfgKanbanShipping", mfgKanbanShipping);
        return map;
    }

}
