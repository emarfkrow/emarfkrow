package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultHisHalf;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_SURVEY_RESULT_HIS_HALF照会
 *
 * @author emarfkrow
 */
public class InvSurveyResultHisHalfGetAction extends BaseAction {

    /** INV_SURVEY_RESULT_HIS_HALF照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object discriminationId = postJson.get("discriminationId");
        if (discriminationId == null) {
            discriminationId = postJson.get("InvSurveyResultHisHalf.discriminationId");
        }
        if (discriminationId == null) {
            return map;
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvSurveyResultHisHalf.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvSurveyResultHisHalf.mm");
        }
        if (mm == null) {
            return map;
        }

        InvSurveyResultHisHalf invSurveyResultHisHalf = InvSurveyResultHisHalf.get(discriminationId, yyyy, mm);
        map.put("InvSurveyResultHisHalf", invSurveyResultHisHalf);
        return map;
    }

}
