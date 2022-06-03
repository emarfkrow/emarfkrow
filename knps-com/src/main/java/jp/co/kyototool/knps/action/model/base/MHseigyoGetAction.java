package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHseigyo;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 販売制御マスタ照会
 *
 * @author emarfkrow
 */
public class MHseigyoGetAction extends BaseAction {

    /** 販売制御マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object keycd = postJson.get("keycd");
        if (keycd == null) {
            keycd = postJson.get("MHseigyo.keycd");
        }
        if (keycd == null) {
            return map;
        }

        MHseigyo mHseigyo = MHseigyo.get(keycd);
        map.put("MHseigyo", mHseigyo);
        return map;
    }

}
