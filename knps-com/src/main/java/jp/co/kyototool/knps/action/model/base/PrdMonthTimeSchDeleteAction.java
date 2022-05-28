package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMonthTimeSch;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_MONTH_TIME_SCH削除
 *
 * @author emarfkrow
 */
public class PrdMonthTimeSchDeleteAction extends BaseAction {

    /** PRD_MONTH_TIME_SCH削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMonthTimeSch.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMonthTimeSch.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdMonthTimeSch.wcCode");
        }
        if (wcCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdMonthTimeSch e = FormValidator.toBean(PrdMonthTimeSch.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
