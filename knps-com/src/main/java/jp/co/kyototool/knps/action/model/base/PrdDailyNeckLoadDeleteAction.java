package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyNeckLoad;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_DAILY_NECK_LOAD削除
 *
 * @author emarfkrow
 */
public class PrdDailyNeckLoadDeleteAction extends BaseAction {

    /** PRD_DAILY_NECK_LOAD削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object proNo = postJson.get("proNo");
        if (proNo == null) {
            proNo = postJson.get("PrdDailyNeckLoad.proNo");
        }
        if (proNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object branchNo = postJson.get("branchNo");
        if (branchNo == null) {
            branchNo = postJson.get("PrdDailyNeckLoad.branchNo");
        }
        if (branchNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdDailyNeckLoad e = FormValidator.toBean(PrdDailyNeckLoad.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
