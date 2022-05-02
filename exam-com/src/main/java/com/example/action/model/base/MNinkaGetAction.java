package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MNinka;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 認可マスタ照会
 *
 * @author emarfkrow
 */
public class MNinkaGetAction extends BaseAction {

    /** 認可マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MNinka.bushoId");
        }
        if (bushoId == null) {
            return map;
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MNinka.shokuiId");
        }
        if (shokuiId == null) {
            return map;
        }
        Object gamenNm = postJson.get("gamenNm");
        if (gamenNm == null) {
            gamenNm = postJson.get("MNinka.gamenNm");
        }
        if (gamenNm == null) {
            return map;
        }

        MNinka mNinka = MNinka.get(bushoId, shokuiId, gamenNm);
        map.put("MNinka", mNinka);
        return map;
    }

}
