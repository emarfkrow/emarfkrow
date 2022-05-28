package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstCostCenter;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_COST_CENTER照会
 *
 * @author emarfkrow
 */
public class MstCostCenterGetAction extends BaseAction {

    /** MST_COST_CENTER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object costCenterCode = postJson.get("costCenterCode");
        if (costCenterCode == null) {
            costCenterCode = postJson.get("MstCostCenter.costCenterCode");
        }
        if (costCenterCode == null) {
            return map;
        }

        MstCostCenter mstCostCenter = MstCostCenter.get(costCenterCode);
        mstCostCenter.referMstCostCenterBks();
        map.put("MstCostCenter", mstCostCenter);
        return map;
    }

}
