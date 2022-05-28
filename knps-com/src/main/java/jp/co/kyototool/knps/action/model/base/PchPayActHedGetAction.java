package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchPayActHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_PAY_ACT_HED照会
 *
 * @author emarfkrow
 */
public class PchPayActHedGetAction extends BaseAction {

    /** PCH_PAY_ACT_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object payNo = postJson.get("payNo");
        if (payNo == null) {
            payNo = postJson.get("PchPayActHed.payNo");
        }
        if (payNo == null) {
            return map;
        }

        PchPayActHed pchPayActHed = PchPayActHed.get(payNo);
        pchPayActHed.referPchPayActDets();
        map.put("PchPayActHed", pchPayActHed);
        return map;
    }

}
