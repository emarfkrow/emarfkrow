package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgShipOrder;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_SHIP_ORDER削除
 *
 * @author emarfkrow
 */
public class MfgShipOrderDeleteAction extends BaseAction {

    /** MFG_SHIP_ORDER削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shipOrderNo = postJson.get("shipOrderNo");
        if (shipOrderNo == null) {
            shipOrderNo = postJson.get("MfgShipOrder.shipOrderNo");
        }
        if (shipOrderNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgShipOrder e = FormValidator.toBean(MfgShipOrder.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
