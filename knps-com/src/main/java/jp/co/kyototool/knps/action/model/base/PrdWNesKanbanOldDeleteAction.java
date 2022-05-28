package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWNesKanbanOld;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_W_NES_KANBAN_OLD削除
 *
 * @author emarfkrow
 */
public class PrdWNesKanbanOldDeleteAction extends BaseAction {

    /** PRD_W_NES_KANBAN_OLD削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdWNesKanbanOld.proHinban");
        }
        if (proHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdWNesKanbanOld.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routingDefGroup = postJson.get("routingDefGroup");
        if (routingDefGroup == null) {
            routingDefGroup = postJson.get("PrdWNesKanbanOld.routingDefGroup");
        }
        if (routingDefGroup == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdWNesKanbanOld e = FormValidator.toBean(PrdWNesKanbanOld.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
