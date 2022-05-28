package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSalesHinbanMaster;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SALES_HINBAN_MASTER照会
 *
 * @author emarfkrow
 */
public class MstSalesHinbanMasterGetAction extends BaseAction {

    /** MST_SALES_HINBAN_MASTER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object salesHinban = postJson.get("salesHinban");
        if (salesHinban == null) {
            salesHinban = postJson.get("MstSalesHinbanMaster.salesHinban");
        }
        if (salesHinban == null) {
            return map;
        }

        MstSalesHinbanMaster mstSalesHinbanMaster = MstSalesHinbanMaster.get(salesHinban);
        map.put("MstSalesHinbanMaster", mstSalesHinbanMaster);
        return map;
    }

}
