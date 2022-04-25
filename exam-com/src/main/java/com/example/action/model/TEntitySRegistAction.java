package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.TEntity;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;

public class TEntitySRegistAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("TEntityGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            TEntity e = new TEntity();
            e.setSosenId(gridRow.get("SOSEN_ID"));
            e.setOyaSn(gridRow.get("OYA_SN"));
            e.setEntitySn(gridRow.get("ENTITY_SN"));
            e.setEntityMei(gridRow.get("ENTITY_MEI"));
            e.setSansho1Id(gridRow.get("SANSHO1_ID"));
            e.setSansho1Mei(gridRow.get("SANSHO1_MEI"));
            e.setSansho2Id(gridRow.get("SANSHO2_ID"));
            e.setSansho2Mei(gridRow.get("SANSHO2_MEI"));
            e.setBetsuSansho1Id(gridRow.get("BETSU_SANSHO1_ID"));
            e.setBetsuSansho1Mei(gridRow.get("BETSU_SANSHO1_MEI"));
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
