package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteGyoHed;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_STORE_MAINTE_GYO_HED削除
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGyoHedDeleteAction extends BaseAction {

    /** PRD_STORE_MAINTE_GYO_HED削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object gyoNo = postJson.get("gyoNo");
        if (gyoNo == null) {
            gyoNo = postJson.get("PrdStoreMainteGyoHed.gyoNo");
        }
        if (gyoNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdStoreMainteGyoHed e = FormValidator.toBean(PrdStoreMainteGyoHed.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
