package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MShokui;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 職位マスタ削除
 *
 * @author emarfkrow
 */
public class MShokuiDeleteAction extends BaseAction {

    /** 職位マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MShokui.shokuiId");
        }
        if (shokuiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        MShokui e = FormValidator.toBean(MShokui.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
