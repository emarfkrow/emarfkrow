package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchTempOrder;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_TEMP_ORDER照会
 *
 * @author emarfkrow
 */
public class PchTempOrderGetAction extends BaseAction {

    /** PCH_TEMP_ORDER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tempOrderNo = postJson.get("tempOrderNo");
        if (tempOrderNo == null) {
            tempOrderNo = postJson.get("PchTempOrder.tempOrderNo");
        }
        if (tempOrderNo == null) {
            return map;
        }

        PchTempOrder pchTempOrder = PchTempOrder.get(tempOrderNo);
        pchTempOrder.referPchTempOrderDets();
        pchTempOrder.referPchTempOrderEstFiles();
        map.put("PchTempOrder", pchTempOrder);
        return map;
    }

}
