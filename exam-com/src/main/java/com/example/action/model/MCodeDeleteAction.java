package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MCode;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * コードマスタ削除
 *
 * @author emarfkrow
 */
public class MCodeDeleteAction extends BaseAction {

    /** コードマスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object codeNm = postJson.get("codeNm");
        if (codeNm == null) {
            codeNm = postJson.get("MCode.codeNm");
        }
        if (codeNm == null) {
            throw new OptLockError("error.cant.delete");
        }

        MCode e = FormValidator.toBean(MCode.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
