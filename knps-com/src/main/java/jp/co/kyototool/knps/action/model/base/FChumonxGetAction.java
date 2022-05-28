package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.FChumonx;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * F_CHUMONX照会
 *
 * @author emarfkrow
 */
public class FChumonxGetAction extends BaseAction {

    /** F_CHUMONX照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tokucd = postJson.get("tokucd");
        if (tokucd == null) {
            tokucd = postJson.get("FChumonx.tokucd");
        }
        if (tokucd == null) {
            return map;
        }
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("FChumonx.hhinban");
        }
        if (hhinban == null) {
            return map;
        }
        Object juchuno = postJson.get("juchuno");
        if (juchuno == null) {
            juchuno = postJson.get("FChumonx.juchuno");
        }
        if (juchuno == null) {
            return map;
        }

        FChumonx fChumonx = FChumonx.get(tokucd, hhinban, juchuno);
        fChumonx.referFJuchum();
        fChumonx.referFJuchuz();
        map.put("FChumonx", fChumonx);
        return map;
    }

}
