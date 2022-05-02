package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MNinka;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 認可マスタ削除
 *
 * @author emarfkrow
 */
public class MNinkaDeleteAction extends BaseAction {

    /** 認可マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MNinka.bushoId");
        }
        if (bushoId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MNinka.shokuiId");
        }
        if (shokuiId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object gamenNm = postJson.get("gamenNm");
        if (gamenNm == null) {
            gamenNm = postJson.get("MNinka.gamenNm");
        }
        if (gamenNm == null) {
            throw new OptLockError("error.cant.delete");
        }

        MNinka e = FormValidator.toBean(MNinka.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
