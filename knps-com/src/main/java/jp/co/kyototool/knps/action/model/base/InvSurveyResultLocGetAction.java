package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvSurveyResultLoc;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_SURVEY_RESULT_LOC照会
 *
 * @author emarfkrow
 */
public class InvSurveyResultLocGetAction extends BaseAction {

    /** INV_SURVEY_RESULT_LOC照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object locationCode = postJson.get("locationCode");
        if (locationCode == null) {
            locationCode = postJson.get("InvSurveyResultLoc.locationCode");
        }
        if (locationCode == null) {
            return map;
        }

        InvSurveyResultLoc invSurveyResultLoc = InvSurveyResultLoc.get(locationCode);
        invSurveyResultLoc.referMstLocation();
        invSurveyResultLoc.referInvInventorys();
        invSurveyResultLoc.referInvSurveyResultOthers();
        map.put("InvSurveyResultLoc", invSurveyResultLoc);
        return map;
    }

}
