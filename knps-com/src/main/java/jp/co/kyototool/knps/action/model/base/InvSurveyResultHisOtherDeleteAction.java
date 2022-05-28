package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultHisOther;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_SURVEY_RESULT_HIS_OTHER削除
 *
 * @author emarfkrow
 */
public class InvSurveyResultHisOtherDeleteAction extends BaseAction {

    /** INV_SURVEY_RESULT_HIS_OTHER削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvSurveyResultHisOther.locationCode");
        }
        if (locationCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object resultBranchNo = postJson.get("resultBranchNo");
        if (resultBranchNo == null) {
            resultBranchNo = postJson.get("InvSurveyResultHisOther.resultBranchNo");
        }
        if (resultBranchNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvSurveyResultHisOther.yyyy");
        }
        if (yyyy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvSurveyResultHisOther.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvSurveyResultHisOther e = FormValidator.toBean(InvSurveyResultHisOther.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
