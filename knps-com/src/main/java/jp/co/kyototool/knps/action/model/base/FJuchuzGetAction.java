package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.FJuchuz;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * F_JUCHUZ照会
 *
 * @author emarfkrow
 */
public class FJuchuzGetAction extends BaseAction {

    /** F_JUCHUZ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tokucd = postJson.get("tokucd");
        if (tokucd == null) {
            tokucd = postJson.get("FJuchuz.tokucd");
        }
        if (tokucd == null) {
            return map;
        }
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("FJuchuz.hhinban");
        }
        if (hhinban == null) {
            return map;
        }
        Object juchuno = postJson.get("juchuno");
        if (juchuno == null) {
            juchuno = postJson.get("FJuchuz.juchuno");
        }
        if (juchuno == null) {
            return map;
        }

        FJuchuz fJuchuz = FJuchuz.get(tokucd, hhinban, juchuno);
        map.put("FJuchuz", fJuchuz);
        return map;
    }

}
