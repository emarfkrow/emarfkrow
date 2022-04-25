package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MCodeValue;

import jp.co.golorp.emarf.action.BaseAction;

public class MCodeValueGetAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // パラメータが不足していたら終了
        Object codeNm = postJson.get("codeNm");
        if (codeNm == null) {
            codeNm = postJson.get("MCodeValue.codeNm");
        }
        if (codeNm == null) {
            return map;
        }
        Object codeValue = postJson.get("codeValue");
        if (codeValue == null) {
            codeValue = postJson.get("MCodeValue.codeValue");
        }
        if (codeValue == null) {
            return map;
        }

        // コード値マスタを設定
        MCodeValue mCodeValue = MCodeValue.get(codeNm, codeValue);
        map.put("MCodeValue", mCodeValue);

        return map;
    }

}
