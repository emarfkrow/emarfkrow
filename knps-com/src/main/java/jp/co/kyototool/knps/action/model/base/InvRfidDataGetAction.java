package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvRfidData;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_RFID_DATA照会
 *
 * @author emarfkrow
 */
public class InvRfidDataGetAction extends BaseAction {

    /** INV_RFID_DATA照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        InvRfidData invRfidData = InvRfidData.get();
        map.put("InvRfidData", invRfidData);
        return map;
    }

}
