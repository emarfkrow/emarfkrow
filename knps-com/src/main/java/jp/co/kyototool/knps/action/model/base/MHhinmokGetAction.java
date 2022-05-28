package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHhinmok;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * M_HHINMOK照会
 *
 * @author emarfkrow
 */
public class MHhinmokGetAction extends BaseAction {

    /** M_HHINMOK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MHhinmok.hhinban");
        }
        if (hhinban == null) {
            return map;
        }

        MHhinmok mHhinmok = MHhinmok.get(hhinban);
        map.put("MHhinmok", mHhinmok);
        return map;
    }

}
