package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MNetinc;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * ネットインカム照会
 *
 * @author emarfkrow
 */
public class MNetincGetAction extends BaseAction {

    /** ネットインカム照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object honshacd = postJson.get("honshacd");
        if (honshacd == null) {
            honshacd = postJson.get("MNetinc.honshacd");
        }
        if (honshacd == null) {
            return map;
        }

        MNetinc mNetinc = MNetinc.get(honshacd);
        mNetinc.referMKtankas();
        map.put("MNetinc", mNetinc);
        return map;
    }

}
