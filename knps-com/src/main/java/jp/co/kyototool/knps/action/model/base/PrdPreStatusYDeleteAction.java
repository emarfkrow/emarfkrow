package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdPreStatusY;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_PRE_STATUS_Y削除
 *
 * @author emarfkrow
 */
public class PrdPreStatusYDeleteAction extends BaseAction {

    /** PRD_PRE_STATUS_Y削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("PrdPreStatusY.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdPreStatusY e = FormValidator.toBean(PrdPreStatusY.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
