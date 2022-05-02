package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TShison;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子孫削除
 *
 * @author emarfkrow
 */
public class TShisonDeleteAction extends BaseAction {

    /** 子孫削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TShison.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TShison.oyaSn");
        }
        if (oyaSn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TShison.entitySn");
        }
        if (entitySn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object koSn = postJson.get("koSn");
        if (koSn == null) {
            koSn = postJson.get("TShison.koSn");
        }
        if (koSn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shisonSn = postJson.get("shisonSn");
        if (shisonSn == null) {
            shisonSn = postJson.get("TShison.shisonSn");
        }
        if (shisonSn == null) {
            throw new OptLockError("error.cant.delete");
        }

        TShison e = FormValidator.toBean(TShison.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
