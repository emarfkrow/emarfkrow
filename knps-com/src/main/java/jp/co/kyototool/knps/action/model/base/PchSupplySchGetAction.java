package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchSupplySch;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_SUPPLY_SCH照会
 *
 * @author emarfkrow
 */
public class PchSupplySchGetAction extends BaseAction {

    /** PCH_SUPPLY_SCH照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object supplyNo = postJson.get("supplyNo");
        if (supplyNo == null) {
            supplyNo = postJson.get("PchSupplySch.supplyNo");
        }
        if (supplyNo == null) {
            return map;
        }

        PchSupplySch pchSupplySch = PchSupplySch.get(supplyNo);
        map.put("PchSupplySch", pchSupplySch);
        return map;
    }

}
