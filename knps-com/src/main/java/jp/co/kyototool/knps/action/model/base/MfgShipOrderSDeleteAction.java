package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgShipOrder;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_SHIP_ORDER一覧削除
 *
 * @author emarfkrow
 */
public class MfgShipOrderSDeleteAction extends BaseAction {

    /** MFG_SHIP_ORDER一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MfgShipOrderGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("SHIP_ORDER_NO"))) {
                throw new OptLockError("error.cant.delete");
            }

            MfgShipOrder e = FormValidator.toBean(MfgShipOrder.class.getName(), gridRow);
            if (e.delete() != 1) {
                throw new OptLockError("error.cant.delete");
            }
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
