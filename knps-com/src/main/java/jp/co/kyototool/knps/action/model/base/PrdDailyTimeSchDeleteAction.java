package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyTimeSch;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_DAILY_TIME_SCH削除
 *
 * @author emarfkrow
 */
public class PrdDailyTimeSchDeleteAction extends BaseAction {

    /** PRD_DAILY_TIME_SCH削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object layoutDate = postJson.get("layoutDate");
        if (layoutDate == null) {
            layoutDate = postJson.get("PrdDailyTimeSch.layoutDate");
        }
        if (layoutDate == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdDailyTimeSch.wcCode");
        }
        if (wcCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdDailyTimeSch e = FormValidator.toBean(PrdDailyTimeSch.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
