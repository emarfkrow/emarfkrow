package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MGhinmok;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 原価用品目マスタ照会
 *
 * @author emarfkrow
 */
public class MGhinmokGetAction extends BaseAction {

    /** 原価用品目マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MGhinmok.hinban");
        }
        if (hinban == null) {
            return map;
        }

        MGhinmok mGhinmok = MGhinmok.get(hinban);
        mGhinmok.referPrdOrderpointStatus();
        mGhinmok.referPrdOrderpointSummary();
        map.put("MGhinmok", mGhinmok);
        return map;
    }

}
