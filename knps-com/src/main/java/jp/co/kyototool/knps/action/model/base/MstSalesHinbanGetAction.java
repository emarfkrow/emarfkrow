package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSalesHinban;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SALES_HINBAN照会
 *
 * @author emarfkrow
 */
public class MstSalesHinbanGetAction extends BaseAction {

    /** MST_SALES_HINBAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object salesHinban = postJson.get("salesHinban");
        if (salesHinban == null) {
            salesHinban = postJson.get("MstSalesHinban.salesHinban");
        }
        if (salesHinban == null) {
            return map;
        }

        MstSalesHinban mstSalesHinban = MstSalesHinban.get(salesHinban);
        mstSalesHinban.referMstSalesHinbanMaster();
        mstSalesHinban.referInvSalesInventorys();
        map.put("MstSalesHinban", mstSalesHinban);
        return map;
    }

}
