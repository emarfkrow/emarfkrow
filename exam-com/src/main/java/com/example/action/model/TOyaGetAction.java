package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TOya;

import jp.co.golorp.emarf.action.BaseAction;

public class TOyaGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TOya.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TOya.oyaSn");
        }
        if (oyaSn == null) {
            return map;
        }

        // 親を設定
        TOya tOya = TOya.get(sosenId, oyaSn);
        tOya.referTEntitys();
        map.put("TOya", tOya);

        return map;
    }

}
