package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultHisOther;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_SURVEY_RESULT_HIS_OTHER照会
 *
 * @author emarfkrow
 */
public class InvSurveyResultHisOtherGetAction extends BaseAction {

    /** INV_SURVEY_RESULT_HIS_OTHER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvSurveyResultHisOther.locationCode");
        }
        if (locationCode == null) {
            return map;
        }
        Object resultBranchNo = postJson.get("resultBranchNo");
        if (resultBranchNo == null) {
            resultBranchNo = postJson.get("InvSurveyResultHisOther.resultBranchNo");
        }
        if (resultBranchNo == null) {
            return map;
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvSurveyResultHisOther.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvSurveyResultHisOther.mm");
        }
        if (mm == null) {
            return map;
        }

        InvSurveyResultHisOther invSurveyResultHisOther = InvSurveyResultHisOther.get(locationCode, resultBranchNo, yyyy, mm);
        map.put("InvSurveyResultHisOther", invSurveyResultHisOther);
        return map;
    }

}
