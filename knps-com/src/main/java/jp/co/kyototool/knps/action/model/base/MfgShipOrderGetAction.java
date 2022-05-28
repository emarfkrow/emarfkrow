package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgShipOrder;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_SHIP_ORDER照会
 *
 * @author emarfkrow
 */
public class MfgShipOrderGetAction extends BaseAction {

    /** MFG_SHIP_ORDER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shipOrderNo = postJson.get("shipOrderNo");
        if (shipOrderNo == null) {
            shipOrderNo = postJson.get("MfgShipOrder.shipOrderNo");
        }
        if (shipOrderNo == null) {
            return map;
        }

        MfgShipOrder mfgShipOrder = MfgShipOrder.get(shipOrderNo);
        map.put("MfgShipOrder", mfgShipOrder);
        return map;
    }

}
