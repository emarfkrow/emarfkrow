package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MWseigyo;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * WEB制御マスタ照会
 *
 * @author emarfkrow
 */
public class MWseigyoGetAction extends BaseAction {

    /** WEB制御マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object webDatakbn = postJson.get("webDatakbn");
        if (webDatakbn == null) {
            webDatakbn = postJson.get("MWseigyo.webDatakbn");
        }
        if (webDatakbn == null) {
            return map;
        }

        MWseigyo mWseigyo = MWseigyo.get(webDatakbn);
        map.put("MWseigyo", mWseigyo);
        return map;
    }

}
