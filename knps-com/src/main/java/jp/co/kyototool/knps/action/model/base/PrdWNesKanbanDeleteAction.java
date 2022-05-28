package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWNesKanban;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_W_NES_KANBAN削除
 *
 * @author emarfkrow
 */
public class PrdWNesKanbanDeleteAction extends BaseAction {

    /** PRD_W_NES_KANBAN削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdWNesKanban.proHinban");
        }
        if (proHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdWNesKanban.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routingDefGroup = postJson.get("routingDefGroup");
        if (routingDefGroup == null) {
            routingDefGroup = postJson.get("PrdWNesKanban.routingDefGroup");
        }
        if (routingDefGroup == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdWNesKanban e = FormValidator.toBean(PrdWNesKanban.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
