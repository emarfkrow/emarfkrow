package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MSansho1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照１マスタ照会
 *
 * @author emarfkrow
 */
public class MSansho1GetAction extends BaseAction {

    /** 参照１マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("MSansho1.sansho1Id");
        }
        if (sansho1Id == null) {
            return map;
        }

        MSansho1 mSansho1 = MSansho1.get(sansho1Id);
        map.put("MSansho1", mSansho1);
        return map;
    }

}
