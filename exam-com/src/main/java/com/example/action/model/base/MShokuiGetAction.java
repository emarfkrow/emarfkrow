package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MShokui;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 職位マスタ照会
 *
 * @author emarfkrow
 */
public class MShokuiGetAction extends BaseAction {

    /** 職位マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MShokui.shokuiId");
        }
        if (shokuiId == null) {
            return map;
        }

        MShokui mShokui = MShokui.get(shokuiId);
        map.put("MShokui", mShokui);
        return map;
    }

}
