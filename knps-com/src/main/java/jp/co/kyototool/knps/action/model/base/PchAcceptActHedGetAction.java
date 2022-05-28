package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchAcceptActHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_ACCEPT_ACT_HED照会
 *
 * @author emarfkrow
 */
public class PchAcceptActHedGetAction extends BaseAction {

    /** PCH_ACCEPT_ACT_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object actNo = postJson.get("actNo");
        if (actNo == null) {
            actNo = postJson.get("PchAcceptActHed.actNo");
        }
        if (actNo == null) {
            return map;
        }

        PchAcceptActHed pchAcceptActHed = PchAcceptActHed.get(actNo);
        map.put("PchAcceptActHed", pchAcceptActHed);
        return map;
    }

}
