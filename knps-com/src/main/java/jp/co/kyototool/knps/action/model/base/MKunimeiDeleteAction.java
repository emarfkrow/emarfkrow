package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MKunimei;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 国名マスタ削除
 *
 * @author emarfkrow
 */
public class MKunimeiDeleteAction extends BaseAction {

    /** 国名マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kokusaicd = postJson.get("kokusaicd");
        if (kokusaicd == null) {
            kokusaicd = postJson.get("MKunimei.kokusaicd");
        }
        if (kokusaicd == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object kunicd = postJson.get("kunicd");
        if (kunicd == null) {
            kunicd = postJson.get("MKunimei.kunicd");
        }
        if (kunicd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MKunimei e = FormValidator.toBean(MKunimei.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
