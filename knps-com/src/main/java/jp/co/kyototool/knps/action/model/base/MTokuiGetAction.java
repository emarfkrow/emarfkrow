package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MTokui;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 得意先マスタ照会
 *
 * @author emarfkrow
 */
public class MTokuiGetAction extends BaseAction {

    /** 得意先マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tokucd = postJson.get("tokucd");
        if (tokucd == null) {
            tokucd = postJson.get("MTokui.tokucd");
        }
        if (tokucd == null) {
            return map;
        }

        MTokui mTokui = MTokui.get(tokucd);
        map.put("MTokui", mTokui);
        return map;
    }

}
