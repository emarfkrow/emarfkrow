package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MShokui;

import jp.co.golorp.emarf.action.BaseAction;

public class MShokuiGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MShokui.shokuiId");
        }
        if (shokuiId == null) {
            return map;
        }

        // 職位マスタを設定
        MShokui mShokui = MShokui.get(shokuiId);
        map.put("MShokui", mShokui);

        return map;
    }

}
