package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupplierBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SUPPLIER_BK照会
 *
 * @author emarfkrow
 */
public class MstSupplierBkGetAction extends BaseAction {

    /** MST_SUPPLIER_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupplierBk.supCode");
        }
        if (supCode == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstSupplierBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstSupplierBk mstSupplierBk = MstSupplierBk.get(supCode, yy);
        map.put("MstSupplierBk", mstSupplierBk);
        return map;
    }

}
