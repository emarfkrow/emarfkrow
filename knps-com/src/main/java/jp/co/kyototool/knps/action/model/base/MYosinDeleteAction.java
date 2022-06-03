package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MYosin;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 与信管理マスタ削除
 *
 * @author emarfkrow
 */
public class MYosinDeleteAction extends BaseAction {

    /** 与信管理マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shukincd = postJson.get("shukincd");
        if (shukincd == null) {
            shukincd = postJson.get("MYosin.shukincd");
        }
        if (shukincd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MYosin e = FormValidator.toBean(MYosin.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
