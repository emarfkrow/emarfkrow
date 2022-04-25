package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MCodeValue;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;

public class MCodeValueSRegistAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MCodeValueGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            MCodeValue e = new MCodeValue();
            e.setCodeNm(gridRow.get("CODE_NM"));
            e.setCodeValue(gridRow.get("CODE_VALUE"));
            e.setCodeValueMei(gridRow.get("CODE_VALUE_MEI"));
            e.setHyojiJun(gridRow.get("HYOJI_JUN"));
            e.setCriteria(gridRow.get("CRITERIA"));
            e.setInsertDt(gridRow.get("INSERT_DT"));
            e.setInsertBy(gridRow.get("INSERT_BY"));
            e.setUpdateDt(gridRow.get("UPDATE_DT"));
            e.setUpdateBy(gridRow.get("UPDATE_BY"));
            e.setDeleteF(gridRow.get("DELETE_F"));

            // 主キー情報が足りていなければINSERT
            boolean isNew = false;
            if (StringUtil.isNullOrBlank(gridRow.get("CODE_NM"))) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(gridRow.get("CODE_VALUE"))) {
                isNew = true;
            }

            if (isNew) {
                if (e.insert(now, id) != 1) {
                    throw new OptLockError("error.cant.insert");
                }
            } else {
                if (e.update(now, id) != 1) {
                    throw new OptLockError("error.cant.update");
                }
            }
        }

        map.put("INFO", Messages.get("info.regist"));
        return map;
    }

}
