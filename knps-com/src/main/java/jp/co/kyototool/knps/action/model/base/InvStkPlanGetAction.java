package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStkPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STK_PLAN照会
 *
 * @author emarfkrow
 */
public class InvStkPlanGetAction extends BaseAction {

    /** INV_STK_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("InvStkPlan.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvStkPlan.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvStkPlan.mm");
        }
        if (mm == null) {
            return map;
        }

        InvStkPlan invStkPlan = InvStkPlan.get(proHinban, yyyy, mm);
        invStkPlan.referInvYStkAmountComm();
        invStkPlan.referInvYStkProdAmountProd();
        invStkPlan.referPrdMProNesCounts();
        invStkPlan.referPrdYProNesCounts();
        map.put("InvStkPlan", invStkPlan);
        return map;
    }

}
