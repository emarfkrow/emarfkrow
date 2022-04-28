package com.example.action.D0000;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TEntity;
import com.example.entity.TEntity2;
import com.example.entity.TOya;
import com.example.entity.TSosen;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

public class D0002RegistAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        TEntity2 tEntity2 = FormValidator.toBean(TEntity2.class.getName(), postJson);

        TEntity tEntity = FormValidator.toBean(TEntity.class.getName(), postJson);
        tEntity.setTEntity2(tEntity2);

        TOya tOya = FormValidator.toBean(TOya.class.getName(), postJson);
        tOya.addTEntitys(tEntity);

        TSosen tSosen = FormValidator.toBean(TSosen.class.getName(), postJson);
        tSosen.addTOyas(tOya);

        if (tSosen.insert(now, id) != 1) {
            throw new AppError("error.cant.insert");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.insert"));
        return map;
    }

}
