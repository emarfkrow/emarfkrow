package com.example.action.D0000;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.util.Messages;

public class D0002RegistAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 追加
        TEntity tEntity = new TEntity();
        tEntity.setSosenId(postJson.get("sosenId"));
        tEntity.setOyaSn(postJson.get("oyaSn"));
        tEntity.setEntitySn(postJson.get("entitySn"));
        tEntity.setEntityMei(postJson.get("entityMei"));
        if (tEntity.insert(now, id) != 1) {
            throw new AppError("error.cant.insert");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.insert"));
        return map;
    }

}
