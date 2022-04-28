package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MUser;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * ユーザマスタ照会
 *
 * @author emarfkrow
 */
public class MUserGetAction extends BaseAction {

    /** ユーザマスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object userId = postJson.get("userId");
        if (userId == null) {
            userId = postJson.get("MUser.userId");
        }
        if (userId == null) {
            return map;
        }

        MUser mUser = MUser.get(userId);
        map.put("MUser", mUser);
        return map;
    }

}
