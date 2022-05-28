package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchTempOrderDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_TEMP_ORDER_DET照会
 *
 * @author emarfkrow
 */
public class PchTempOrderDetGetAction extends BaseAction {

    /** PCH_TEMP_ORDER_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tempOrderNo = postJson.get("tempOrderNo");
        if (tempOrderNo == null) {
            tempOrderNo = postJson.get("PchTempOrderDet.tempOrderNo");
        }
        if (tempOrderNo == null) {
            return map;
        }
        Object tempOrderSeq = postJson.get("tempOrderSeq");
        if (tempOrderSeq == null) {
            tempOrderSeq = postJson.get("PchTempOrderDet.tempOrderSeq");
        }
        if (tempOrderSeq == null) {
            return map;
        }

        PchTempOrderDet pchTempOrderDet = PchTempOrderDet.get(tempOrderNo, tempOrderSeq);
        map.put("PchTempOrderDet", pchTempOrderDet);
        return map;
    }

}
