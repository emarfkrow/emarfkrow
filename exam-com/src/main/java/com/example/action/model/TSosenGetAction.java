package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TSosen;

import jp.co.golorp.emarf.action.BaseAction;

public class TSosenGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TSosen.sosenId");
        }
        if (sosenId == null) {
            return map;
        }

        // 祖先を設定
        TSosen tSosen = TSosen.get(sosenId);
        tSosen.referTOyas();
        map.put("TSosen", tSosen);

        return map;
    }

}
