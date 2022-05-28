package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalResultY;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_TOTAL_RESULT_Y照会
 *
 * @author emarfkrow
 */
public class MfgTotalResultYGetAction extends BaseAction {

    /** MFG_TOTAL_RESULT_Y照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object resultDate = postJson.get("resultDate");
        if (resultDate == null) {
            resultDate = postJson.get("MfgTotalResultY.resultDate");
        }
        if (resultDate == null) {
            return map;
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalResultY.proGroupNo");
        }
        if (proGroupNo == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalResultY.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalResultY.routing");
        }
        if (routing == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MfgTotalResultY.wcCode");
        }
        if (wcCode == null) {
            return map;
        }
        Object opeDetail = postJson.get("opeDetail");
        if (opeDetail == null) {
            opeDetail = postJson.get("MfgTotalResultY.opeDetail");
        }
        if (opeDetail == null) {
            return map;
        }

        MfgTotalResultY mfgTotalResultY = MfgTotalResultY.get(resultDate, proGroupNo, hinban, routing, wcCode, opeDetail);
        map.put("MfgTotalResultY", mfgTotalResultY);
        return map;
    }

}
