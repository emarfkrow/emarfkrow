package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTempSupplier;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_TEMP_SUPPLIER照会
 *
 * @author emarfkrow
 */
public class MstTempSupplierGetAction extends BaseAction {

    /** MST_TEMP_SUPPLIER照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tempSupCode = postJson.get("tempSupCode");
        if (tempSupCode == null) {
            tempSupCode = postJson.get("MstTempSupplier.tempSupCode");
        }
        if (tempSupCode == null) {
            return map;
        }

        MstTempSupplier mstTempSupplier = MstTempSupplier.get(tempSupCode);
        map.put("MstTempSupplier", mstTempSupplier);
        return map;
    }

}
