package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstCostCenterBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_COST_CENTER_BK照会
 *
 * @author emarfkrow
 */
public class MstCostCenterBkGetAction extends BaseAction {

    /** MST_COST_CENTER_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object costCenterCode = postJson.get("costCenterCode");
        if (costCenterCode == null) {
            costCenterCode = postJson.get("MstCostCenterBk.costCenterCode");
        }
        if (costCenterCode == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstCostCenterBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstCostCenterBk mstCostCenterBk = MstCostCenterBk.get(costCenterCode, yy);
        map.put("MstCostCenterBk", mstCostCenterBk);
        return map;
    }

}
