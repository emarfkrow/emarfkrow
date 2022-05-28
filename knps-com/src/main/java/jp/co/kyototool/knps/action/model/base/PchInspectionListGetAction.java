package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchInspectionList;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_INSPECTION_LIST照会
 *
 * @author emarfkrow
 */
public class PchInspectionListGetAction extends BaseAction {

    /** PCH_INSPECTION_LIST照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object orderNo = postJson.get("orderNo");
        if (orderNo == null) {
            orderNo = postJson.get("PchInspectionList.orderNo");
        }
        if (orderNo == null) {
            return map;
        }
        Object targetDate = postJson.get("targetDate");
        if (targetDate == null) {
            targetDate = postJson.get("PchInspectionList.targetDate");
        }
        if (targetDate == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("PchInspectionList.supCode");
        }
        if (supCode == null) {
            return map;
        }

        PchInspectionList pchInspectionList = PchInspectionList.get(orderNo, targetDate, supCode);
        map.put("PchInspectionList", pchInspectionList);
        return map;
    }

}
