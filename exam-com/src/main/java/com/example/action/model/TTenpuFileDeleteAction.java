package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TTenpuFile;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 添付ファイル削除
 *
 * @author emarfkrow
 */
public class TTenpuFileDeleteAction extends BaseAction {

    /** 添付ファイル削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TTenpuFile.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TTenpuFile.oyaSn");
        }
        if (oyaSn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TTenpuFile.entitySn");
        }
        if (entitySn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tenpuFileSn = postJson.get("tenpuFileSn");
        if (tenpuFileSn == null) {
            tenpuFileSn = postJson.get("TTenpuFile.tenpuFileSn");
        }
        if (tenpuFileSn == null) {
            throw new OptLockError("error.cant.delete");
        }

        TTenpuFile e = FormValidator.toBean(TTenpuFile.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
