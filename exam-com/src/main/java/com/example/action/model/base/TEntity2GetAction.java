package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity2;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ２照会
 *
 * @author emarfkrow
 */
public class TEntity2GetAction extends BaseAction {

    /** エンティティ２照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntity2.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TEntity2.oyaSn");
        }
        if (oyaSn == null) {
            return map;
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TEntity2.entitySn");
        }
        if (entitySn == null) {
            return map;
        }

        TEntity2 tEntity2 = TEntity2.get(sosenId, oyaSn, entitySn);
        map.put("TEntity2", tEntity2);
        return map;
    }

}
