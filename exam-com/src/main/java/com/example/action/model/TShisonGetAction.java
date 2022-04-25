package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TShison;

import jp.co.golorp.emarf.action.BaseAction;

public class TShisonGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TShison.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TShison.oyaSn");
        }
        if (oyaSn == null) {
            return map;
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TShison.entitySn");
        }
        if (entitySn == null) {
            return map;
        }
        Object koSn = postJson.get("koSn");
        if (koSn == null) {
            koSn = postJson.get("TShison.koSn");
        }
        if (koSn == null) {
            return map;
        }
        Object shisonSn = postJson.get("shisonSn");
        if (shisonSn == null) {
            shisonSn = postJson.get("TShison.shisonSn");
        }
        if (shisonSn == null) {
            return map;
        }

        // 子孫を設定
        TShison tShison = TShison.get(sosenId, oyaSn, entitySn, koSn, shisonSn);
        map.put("TShison", tShison);

        return map;
    }

}
