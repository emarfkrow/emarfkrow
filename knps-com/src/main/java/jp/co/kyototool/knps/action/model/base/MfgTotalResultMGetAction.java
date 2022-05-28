package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalResultM;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_TOTAL_RESULT_M照会
 *
 * @author emarfkrow
 */
public class MfgTotalResultMGetAction extends BaseAction {

    /** MFG_TOTAL_RESULT_M照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalResultM.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalResultM.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalResultM.routing");
        }
        if (routing == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MfgTotalResultM.wcCode");
        }
        if (wcCode == null) {
            return map;
        }
        Object opeDetail = postJson.get("opeDetail");
        if (opeDetail == null) {
            opeDetail = postJson.get("MfgTotalResultM.opeDetail");
        }
        if (opeDetail == null) {
            return map;
        }
        Object resultDate = postJson.get("resultDate");
        if (resultDate == null) {
            resultDate = postJson.get("MfgTotalResultM.resultDate");
        }
        if (resultDate == null) {
            return map;
        }

        MfgTotalResultM mfgTotalResultM = MfgTotalResultM.get(hinban, proGroupNo, routing, wcCode, opeDetail, resultDate);
        map.put("MfgTotalResultM", mfgTotalResultM);
        return map;
    }

}
