package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MSansho1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照１マスタ削除
 *
 * @author emarfkrow
 */
public class MSansho1DeleteAction extends BaseAction {

    /** 参照１マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sansho1Id = postJson.get("sansho1Id");
        if (sansho1Id == null) {
            sansho1Id = postJson.get("MSansho1.sansho1Id");
        }
        if (sansho1Id == null) {
            throw new OptLockError("error.cant.delete");
        }

        MSansho1 e = FormValidator.toBean(MSansho1.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
