package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MCode;

import jp.co.golorp.emarf.action.BaseAction;

public class MCodeGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object codeNm = postJson.get("codeNm");
        if (codeNm == null) {
            codeNm = postJson.get("MCode.codeNm");
        }
        if (codeNm == null) {
            return map;
        }

        // コードマスタを設定
        MCode mCode = MCode.get(codeNm);
        mCode.referMCodeValues();
        map.put("MCode", mCode);

        return map;
    }

}
