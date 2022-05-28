package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchSupUnitCost;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_SUP_UNIT_COST照会
 *
 * @author emarfkrow
 */
public class PchSupUnitCostGetAction extends BaseAction {

    /** PCH_SUP_UNIT_COST照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        PchSupUnitCost pchSupUnitCost = PchSupUnitCost.get();
        map.put("PchSupUnitCost", pchSupUnitCost);
        return map;
    }

}
