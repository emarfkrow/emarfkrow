package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultOther;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_SURVEY_RESULT_OTHER照会
 *
 * @author emarfkrow
 */
public class InvSurveyResultOtherGetAction extends BaseAction {

    /** INV_SURVEY_RESULT_OTHER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvSurveyResultOther.locationCode");
        }
        if (locationCode == null) {
            return map;
        }
        Object resultBranchNo = postJson.get("resultBranchNo");
        if (resultBranchNo == null) {
            resultBranchNo = postJson.get("InvSurveyResultOther.resultBranchNo");
        }
        if (resultBranchNo == null) {
            return map;
        }

        InvSurveyResultOther invSurveyResultOther = InvSurveyResultOther.get(locationCode, resultBranchNo);
        map.put("InvSurveyResultOther", invSurveyResultOther);
        return map;
    }

}
