package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgObservanceRateOut;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_OBSERVANCE_RATE_OUT照会
 *
 * @author emarfkrow
 */
public class MfgObservanceRateOutGetAction extends BaseAction {

    /** MFG_OBSERVANCE_RATE_OUT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("MfgObservanceRateOut.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MfgObservanceRateOut.mm");
        }
        if (mm == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MfgObservanceRateOut.wcCode");
        }
        if (wcCode == null) {
            return map;
        }

        MfgObservanceRateOut mfgObservanceRateOut = MfgObservanceRateOut.get(yyyy, mm, wcCode);
        mfgObservanceRateOut.referPrdMonthTimeSch();
        map.put("MfgObservanceRateOut", mfgObservanceRateOut);
        return map;
    }

}
