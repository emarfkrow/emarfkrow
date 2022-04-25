package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.TShison;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;

public class TShisonSRegistAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("TShisonGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            TShison e = new TShison();
            e.setSosenId(gridRow.get("SOSEN_ID"));
            e.setOyaSn(gridRow.get("OYA_SN"));
            e.setEntitySn(gridRow.get("ENTITY_SN"));
            e.setKoSn(gridRow.get("KO_SN"));
            e.setShisonSn(gridRow.get("SHISON_SN"));
            e.setShisonMei(gridRow.get("SHISON_MEI"));
            e.setInsertDt(gridRow.get("INSERT_DT"));
            e.setInsertBy(gridRow.get("INSERT_BY"));
            e.setUpdateDt(gridRow.get("UPDATE_DT"));
            e.setUpdateBy(gridRow.get("UPDATE_BY"));
            e.setDeleteF(gridRow.get("DELETE_F"));

            // 主キー情報が足りていなければINSERT
            boolean isNew = false;
            if (StringUtil.isNullOrBlank(gridRow.get("SOSEN_ID"))) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(gridRow.get("OYA_SN"))) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(gridRow.get("ENTITY_SN"))) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(gridRow.get("KO_SN"))) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(gridRow.get("SHISON_SN"))) {
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
