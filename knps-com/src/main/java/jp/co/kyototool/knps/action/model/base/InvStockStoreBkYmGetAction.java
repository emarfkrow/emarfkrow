package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockStoreBkYm;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_STORE_BK_YM照会
 *
 * @author emarfkrow
 */
public class InvStockStoreBkYmGetAction extends BaseAction {

    /** INV_STOCK_STORE_BK_YM照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("InvStockStoreBkYm.yy");
        }
        if (yy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvStockStoreBkYm.mm");
        }
        if (mm == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockStoreBkYm.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object storeNo = postJson.get("storeNo");
        if (storeNo == null) {
            storeNo = postJson.get("InvStockStoreBkYm.storeNo");
        }
        if (storeNo == null) {
            return map;
        }

        InvStockStoreBkYm invStockStoreBkYm = InvStockStoreBkYm.get(yy, mm, hinban, storeNo);
        map.put("InvStockStoreBkYm", invStockStoreBkYm);
        return map;
    }

}
