package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvYStkAmountProg;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_Y_STK_AMOUNT_PROG照会
 *
 * @author emarfkrow
 */
public class InvYStkAmountProgGetAction extends BaseAction {

    /** INV_Y_STK_AMOUNT_PROG照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvYStkAmountProg.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvYStkAmountProg.mm");
        }
        if (mm == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvYStkAmountProg.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("InvYStkAmountProg.routing");
        }
        if (routing == null) {
            return map;
        }

        InvYStkAmountProg invYStkAmountProg = InvYStkAmountProg.get(yyyy, mm, hinban, routing);
        invYStkAmountProg.referPrdMSupBudgetOut();
        invYStkAmountProg.referPrdStoreMainte();
        invYStkAmountProg.referPrdYSupBudgetOut();
        map.put("InvYStkAmountProg", invYStkAmountProg);
        return map;
    }

}
