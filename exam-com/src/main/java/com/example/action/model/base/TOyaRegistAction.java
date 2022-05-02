package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TOya;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 親登録
 *
 * @author emarfkrow
 */
public class TOyaRegistAction extends BaseAction {

    /** 親登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        TOya e = FormValidator.toBean(TOya.class.getName(), postJson);

        // 主キーが不足していたらINSERT
        boolean isNew = false;
        if (StringUtil.isNullOrBlank(e.getSosenId())) {
            isNew = true;
        }
        if (StringUtil.isNullOrBlank(e.getOyaSn())) {
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
