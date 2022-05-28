package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteRetsuDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_STORE_MAINTE_RETSU_DET削除
 *
 * @author emarfkrow
 */
public class PrdStoreMainteRetsuDetDeleteAction extends BaseAction {

    /** PRD_STORE_MAINTE_RETSU_DET削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object retsuNo = postJson.get("retsuNo");
        if (retsuNo == null) {
            retsuNo = postJson.get("PrdStoreMainteRetsuDet.retsuNo");
        }
        if (retsuNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object retsuPos = postJson.get("retsuPos");
        if (retsuPos == null) {
            retsuPos = postJson.get("PrdStoreMainteRetsuDet.retsuPos");
        }
        if (retsuPos == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdStoreMainteRetsuDet e = FormValidator.toBean(PrdStoreMainteRetsuDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
