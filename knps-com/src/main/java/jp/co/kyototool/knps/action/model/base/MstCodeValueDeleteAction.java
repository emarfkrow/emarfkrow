package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstCodeValue;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_CODE_VALUE削除
 *
 * @author emarfkrow
 */
public class MstCodeValueDeleteAction extends BaseAction {

    /** MST_CODE_VALUE削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object codeNm = postJson.get("codeNm");
        if (codeNm == null) {
            codeNm = postJson.get("MstCodeValue.codeNm");
        }
        if (codeNm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object codeValue = postJson.get("codeValue");
        if (codeValue == null) {
            codeValue = postJson.get("MstCodeValue.codeValue");
        }
        if (codeValue == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstCodeValue e = FormValidator.toBean(MstCodeValue.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
