package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MSansho1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

public class MSansho1RegistAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        MSansho1 e = FormValidator.toBean(MSansho1.class.getName(), postJson);

        // 主キー情報が足りていなければINSERT
        boolean isNew = false;
        if (StringUtil.isNullOrBlank(e.getSansho1Id())) {
            isNew = true;
        }

        if (isNew) {
            if (e.insert(now, id) != 1) {
                throw new OptLockError("error.cant.insert");
            }
            map.put("INFO", Messages.get("info.insert"));
        } else {
            if (e.update(now, id) == 1) {
                map.put("INFO", Messages.get("info.update"));
            } else if (e.insert(now, id) == 1) {
                map.put("INFO", Messages.get("info.insert"));
            } else {
                throw new OptLockError("error.cant.update");
            }
        }

        return map;
    }

}
