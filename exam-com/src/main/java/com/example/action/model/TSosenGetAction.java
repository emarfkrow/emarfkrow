package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TSosen;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 祖先照会
 *
 * @author emarfkrow
 */
public class TSosenGetAction extends BaseAction {

    /** 祖先照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TSosen.sosenId");
        }
        if (sosenId == null) {
            return map;
        }

        TSosen tSosen = TSosen.get(sosenId);
        tSosen.referTOyas();
        map.put("TSosen", tSosen);
        return map;
    }

}
