package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvYStkProdAmountProd;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_Y_STK_PROD_AMOUNT_PROD照会
 *
 * @author emarfkrow
 */
public class InvYStkProdAmountProdGetAction extends BaseAction {

    /** INV_Y_STK_PROD_AMOUNT_PROD照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("InvYStkProdAmountProd.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("InvYStkProdAmountProd.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvYStkProdAmountProd.mm");
        }
        if (mm == null) {
            return map;
        }

        InvYStkProdAmountProd invYStkProdAmountProd = InvYStkProdAmountProd.get(proHinban, yyyy, mm);
        invYStkProdAmountProd.referPrdMProNesCounts();
        invYStkProdAmountProd.referPrdYProNesCounts();
        map.put("InvYStkProdAmountProd", invYStkProdAmountProd);
        return map;
    }

}
