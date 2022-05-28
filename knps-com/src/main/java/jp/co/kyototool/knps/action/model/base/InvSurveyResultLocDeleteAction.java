package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultLoc;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_SURVEY_RESULT_LOC削除
 *
 * @author emarfkrow
 */
public class InvSurveyResultLocDeleteAction extends BaseAction {

    /** INV_SURVEY_RESULT_LOC削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvSurveyResultLoc.locationCode");
        }
        if (locationCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvSurveyResultLoc e = FormValidator.toBean(InvSurveyResultLoc.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
