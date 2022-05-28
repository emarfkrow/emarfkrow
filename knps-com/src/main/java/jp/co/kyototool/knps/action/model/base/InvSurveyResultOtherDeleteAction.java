package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultOther;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_SURVEY_RESULT_OTHER削除
 *
 * @author emarfkrow
 */
public class InvSurveyResultOtherDeleteAction extends BaseAction {

    /** INV_SURVEY_RESULT_OTHER削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvSurveyResultOther.locationCode");
        }
        if (locationCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object resultBranchNo = postJson.get("resultBranchNo");
        if (resultBranchNo == null) {
            resultBranchNo = postJson.get("InvSurveyResultOther.resultBranchNo");
        }
        if (resultBranchNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvSurveyResultOther e = FormValidator.toBean(InvSurveyResultOther.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
