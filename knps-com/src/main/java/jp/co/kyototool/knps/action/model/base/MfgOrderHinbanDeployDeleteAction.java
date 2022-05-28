package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgOrderHinbanDeploy;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_ORDER_HINBAN_DEPLOY削除
 *
 * @author emarfkrow
 */
public class MfgOrderHinbanDeployDeleteAction extends BaseAction {

    /** MFG_ORDER_HINBAN_DEPLOY削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object reqid = postJson.get("reqid");
        if (reqid == null) {
            reqid = postJson.get("MfgOrderHinbanDeploy.reqid");
        }
        if (reqid == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgOrderHinbanDeploy.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object deliveryDate = postJson.get("deliveryDate");
        if (deliveryDate == null) {
            deliveryDate = postJson.get("MfgOrderHinbanDeploy.deliveryDate");
        }
        if (deliveryDate == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgOrderHinbanDeploy e = FormValidator.toBean(MfgOrderHinbanDeploy.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
