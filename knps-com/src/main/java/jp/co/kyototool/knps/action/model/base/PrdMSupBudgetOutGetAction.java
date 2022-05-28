package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMSupBudgetOut;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_SUP_BUDGET_OUT照会
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetOutGetAction extends BaseAction {

    /** PRD_M_SUP_BUDGET_OUT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMSupBudgetOut.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMSupBudgetOut.mm");
        }
        if (mm == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdMSupBudgetOut.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdMSupBudgetOut.routing");
        }
        if (routing == null) {
            return map;
        }

        PrdMSupBudgetOut prdMSupBudgetOut = PrdMSupBudgetOut.get(yyyy, mm, hinban, routing);
        prdMSupBudgetOut.referPrdStoreMainte();
        prdMSupBudgetOut.referPrdYSupBudgetOut();
        map.put("PrdMSupBudgetOut", prdMSupBudgetOut);
        return map;
    }

}
