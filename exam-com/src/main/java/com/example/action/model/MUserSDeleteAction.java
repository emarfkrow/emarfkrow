package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MUser;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

public class MUserSDeleteAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MUserGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            MUser e = FormValidator.toBean(MUser.class.getName(), gridRow);

            // 主キー情報が足りているか確認
            boolean isNew = false;
            if (StringUtil.isNullOrBlank(gridRow.get("USER_ID"))) {
                isNew = true;
            }

            if (isNew) {
                throw new OptLockError("error.cant.delete");
            } else {
                if (e.delete() != 1) {
                    throw new OptLockError("error.cant.delete");
                }
            }
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
