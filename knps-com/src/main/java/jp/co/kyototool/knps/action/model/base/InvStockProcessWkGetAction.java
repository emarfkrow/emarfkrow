package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockProcessWk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_PROCESS_WK照会
 *
 * @author emarfkrow
 */
public class InvStockProcessWkGetAction extends BaseAction {

    /** INV_STOCK_PROCESS_WK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        InvStockProcessWk invStockProcessWk = InvStockProcessWk.get();
        map.put("InvStockProcessWk", invStockProcessWk);
        return map;
    }

}
