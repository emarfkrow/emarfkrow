package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TKo;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 子照会
 *
 * @author emarfkrow
 */
public class TKoGetAction extends BaseAction {

    /** 子照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TKo.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TKo.oyaSn");
        }
        if (oyaSn == null) {
            return map;
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TKo.entitySn");
        }
        if (entitySn == null) {
            return map;
        }
        Object koSn = postJson.get("koSn");
        if (koSn == null) {
            koSn = postJson.get("TKo.koSn");
        }
        if (koSn == null) {
            return map;
        }

        TKo tKo = TKo.get(sosenId, oyaSn, entitySn, koSn);
        tKo.referTShisons();
        map.put("TKo", tKo);
        return map;
    }

}
