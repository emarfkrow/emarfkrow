package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MBusho;

import jp.co.golorp.emarf.action.BaseAction;

public class MBushoGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MBusho.bushoId");
        }
        if (bushoId == null) {
            return map;
        }

        // 部署マスタを設定
        MBusho mBusho = MBusho.get(bushoId);
        map.put("MBusho", mBusho);

        return map;
    }

}
