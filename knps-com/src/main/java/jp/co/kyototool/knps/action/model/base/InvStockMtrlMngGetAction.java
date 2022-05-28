package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockMtrlMng;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_MTRL_MNG照会
 *
 * @author emarfkrow
 */
public class InvStockMtrlMngGetAction extends BaseAction {

    /** INV_STOCK_MTRL_MNG照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockMtrlMng.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object subInvCode = postJson.get("subInvCode");
        if (subInvCode == null) {
            subInvCode = postJson.get("InvStockMtrlMng.subInvCode");
        }
        if (subInvCode == null) {
            return map;
        }
        Object stockManagementSection = postJson.get("stockManagementSection");
        if (stockManagementSection == null) {
            stockManagementSection = postJson.get("InvStockMtrlMng.stockManagementSection");
        }
        if (stockManagementSection == null) {
            return map;
        }

        InvStockMtrlMng invStockMtrlMng = InvStockMtrlMng.get(hinban, subInvCode, stockManagementSection);
        invStockMtrlMng.referInvStockToolMngHed();
        map.put("InvStockMtrlMng", invStockMtrlMng);
        return map;
    }

}
