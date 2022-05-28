package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultHalf;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_SURVEY_RESULT_HALF照会
 *
 * @author emarfkrow
 */
public class InvSurveyResultHalfGetAction extends BaseAction {

    /** INV_SURVEY_RESULT_HALF照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object discriminationId = postJson.get("discriminationId");
        if (discriminationId == null) {
            discriminationId = postJson.get("InvSurveyResultHalf.discriminationId");
        }
        if (discriminationId == null) {
            return map;
        }

        InvSurveyResultHalf invSurveyResultHalf = InvSurveyResultHalf.get(discriminationId);
        map.put("InvSurveyResultHalf", invSurveyResultHalf);
        return map;
    }

}
