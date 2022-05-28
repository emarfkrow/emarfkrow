package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgRateBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_RATE_BK照会
 *
 * @author emarfkrow
 */
public class MfgRateBkGetAction extends BaseAction {

    /** MFG_RATE_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MfgRateBk.yy");
        }
        if (yy == null) {
            return map;
        }
        Object rateCode = postJson.get("rateCode");
        if (rateCode == null) {
            rateCode = postJson.get("MfgRateBk.rateCode");
        }
        if (rateCode == null) {
            return map;
        }

        MfgRateBk mfgRateBk = MfgRateBk.get(yy, rateCode);
        map.put("MfgRateBk", mfgRateBk);
        return map;
    }

}
