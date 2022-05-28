package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMSupBudgetPur;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_SUP_BUDGET_PUR照会
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetPurGetAction extends BaseAction {

    /** PRD_M_SUP_BUDGET_PUR照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMSupBudgetPur.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMSupBudgetPur.mm");
        }
        if (mm == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdMSupBudgetPur.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("PrdMSupBudgetPur.supCode");
        }
        if (supCode == null) {
            return map;
        }

        PrdMSupBudgetPur prdMSupBudgetPur = PrdMSupBudgetPur.get(yyyy, mm, hinban, supCode);
        prdMSupBudgetPur.referPrdYSupBudgetPur();
        map.put("PrdMSupBudgetPur", prdMSupBudgetPur);
        return map;
    }

}
