package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgRate;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_RATE照会
 *
 * @author emarfkrow
 */
public class MfgRateGetAction extends BaseAction {

    /** MFG_RATE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object rateCode = postJson.get("rateCode");
        if (rateCode == null) {
            rateCode = postJson.get("MfgRate.rateCode");
        }
        if (rateCode == null) {
            return map;
        }

        MfgRate mfgRate = MfgRate.get(rateCode);
        mfgRate.referMfgRateQ();
        map.put("MfgRate", mfgRate);
        return map;
    }

}
