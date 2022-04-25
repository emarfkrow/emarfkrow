package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MSansho2;

import jp.co.golorp.emarf.action.BaseAction;

public class MSansho2GetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object sansho2Id = postJson.get("sansho2Id");
        if (sansho2Id == null) {
            sansho2Id = postJson.get("MSansho2.sansho2Id");
        }
        if (sansho2Id == null) {
            return map;
        }

        // 参照２マスタを設定
        MSansho2 mSansho2 = MSansho2.get(sansho2Id);
        map.put("MSansho2", mSansho2);

        return map;
    }

}
