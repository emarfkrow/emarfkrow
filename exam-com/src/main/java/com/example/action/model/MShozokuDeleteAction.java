package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MShozoku;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 所属マスタ削除
 *
 * @author emarfkrow
 */
public class MShozokuDeleteAction extends BaseAction {

    /** 所属マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MShozoku.bushoId");
        }
        if (bushoId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MShozoku.shokuiId");
        }
        if (shokuiId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object userId = postJson.get("userId");
        if (userId == null) {
            userId = postJson.get("MShozoku.userId");
        }
        if (userId == null) {
            throw new OptLockError("error.cant.delete");
        }

        MShozoku e = FormValidator.toBean(MShozoku.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
