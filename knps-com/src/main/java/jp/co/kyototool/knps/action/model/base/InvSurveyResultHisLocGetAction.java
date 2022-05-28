package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultHisLoc;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_SURVEY_RESULT_HIS_LOC照会
 *
 * @author emarfkrow
 */
public class InvSurveyResultHisLocGetAction extends BaseAction {

    /** INV_SURVEY_RESULT_HIS_LOC照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvSurveyResultHisLoc.locationCode");
        }
        if (locationCode == null) {
            return map;
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvSurveyResultHisLoc.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvSurveyResultHisLoc.mm");
        }
        if (mm == null) {
            return map;
        }

        InvSurveyResultHisLoc invSurveyResultHisLoc = InvSurveyResultHisLoc.get(locationCode, yyyy, mm);
        map.put("InvSurveyResultHisLoc", invSurveyResultHisLoc);
        return map;
    }

}
