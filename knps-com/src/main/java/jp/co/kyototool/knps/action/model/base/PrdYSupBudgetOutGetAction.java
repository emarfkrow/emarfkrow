package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdYSupBudgetOut;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_Y_SUP_BUDGET_OUT照会
 *
 * @author emarfkrow
 */
public class PrdYSupBudgetOutGetAction extends BaseAction {

    /** PRD_Y_SUP_BUDGET_OUT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdYSupBudgetOut.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdYSupBudgetOut.mm");
        }
        if (mm == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdYSupBudgetOut.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdYSupBudgetOut.routing");
        }
        if (routing == null) {
            return map;
        }

        PrdYSupBudgetOut prdYSupBudgetOut = PrdYSupBudgetOut.get(yyyy, mm, hinban, routing);
        map.put("PrdYSupBudgetOut", prdYSupBudgetOut);
        return map;
    }

}
