package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntityHis;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * エンティティ履歴照会
 *
 * @author emarfkrow
 */
public class TEntityHisGetAction extends BaseAction {

    /** エンティティ履歴照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TEntityHis.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TEntityHis.oyaSn");
        }
        if (oyaSn == null) {
            return map;
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TEntityHis.entitySn");
        }
        if (entitySn == null) {
            return map;
        }
        Object historySn = postJson.get("historySn");
        if (historySn == null) {
            historySn = postJson.get("TEntityHis.historySn");
        }
        if (historySn == null) {
            return map;
        }

        TEntityHis tEntityHis = TEntityHis.get(sosenId, oyaSn, entitySn, historySn);
        map.put("TEntityHis", tEntityHis);
        return map;
    }

}
