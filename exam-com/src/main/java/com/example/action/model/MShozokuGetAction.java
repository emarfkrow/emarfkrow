package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MShozoku;

import jp.co.golorp.emarf.action.BaseAction;

public class MShozokuGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MShozoku.bushoId");
        }
        if (bushoId == null) {
            return map;
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MShozoku.shokuiId");
        }
        if (shokuiId == null) {
            return map;
        }
        Object userId = postJson.get("userId");
        if (userId == null) {
            userId = postJson.get("MShozoku.userId");
        }
        if (userId == null) {
            return map;
        }

        // 所属マスタを設定
        MShozoku mShozoku = MShozoku.get(bushoId, shokuiId, userId);
        map.put("MShozoku", mShozoku);

        return map;
    }

}
