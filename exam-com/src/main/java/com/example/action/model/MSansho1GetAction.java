package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MSansho1;

import jp.co.golorp.emarf.action.BaseAction;

public class MSansho1GetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("MSansho1.sansho1Id");
        }
        if (sansho1Id == null) {
            return map;
        }

        // 参照１マスタを設定
        MSansho1 mSansho1 = MSansho1.get(sansho1Id);
        map.put("MSansho1", mSansho1);

        return map;
    }

}
