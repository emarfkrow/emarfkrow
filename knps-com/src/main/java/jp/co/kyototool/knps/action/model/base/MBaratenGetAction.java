package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MBaraten;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * バラ展開マスタ照会
 *
 * @author emarfkrow
 */
public class MBaratenGetAction extends BaseAction {

    /** バラ展開マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object oyaHinban = postJson.get("oyaHinban");
        if (oyaHinban == null) {
            oyaHinban = postJson.get("MBaraten.oyaHinban");
        }
        if (oyaHinban == null) {
            return map;
        }
        Object koHinban = postJson.get("koHinban");
        if (koHinban == null) {
            koHinban = postJson.get("MBaraten.koHinban");
        }
        if (koHinban == null) {
            return map;
        }

        MBaraten mBaraten = MBaraten.get(oyaHinban, koHinban);
        map.put("MBaraten", mBaraten);
        return map;
    }

}
