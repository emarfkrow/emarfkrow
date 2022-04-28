package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MUser;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * ユーザマスタ削除
 *
 * @author emarfkrow
 */
public class MUserDeleteAction extends BaseAction {

    /** ユーザマスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object userId = postJson.get("userId");
        if (userId == null) {
            userId = postJson.get("MUser.userId");
        }
        if (userId == null) {
            throw new OptLockError("error.cant.delete");
        }

        MUser e = FormValidator.toBean(MUser.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
