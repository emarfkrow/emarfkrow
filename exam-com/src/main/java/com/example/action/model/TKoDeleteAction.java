package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TKo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子削除
 *
 * @author emarfkrow
 */
public class TKoDeleteAction extends BaseAction {

    /** 子削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TKo.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TKo.oyaSn");
        }
        if (oyaSn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TKo.entitySn");
        }
        if (entitySn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object koSn = postJson.get("koSn");
        if (koSn == null) {
            koSn = postJson.get("TKo.koSn");
        }
        if (koSn == null) {
            throw new OptLockError("error.cant.delete");
        }

        TKo e = FormValidator.toBean(TKo.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
