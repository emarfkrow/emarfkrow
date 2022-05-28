package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTax;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_TAX照会
 *
 * @author emarfkrow
 */
public class MstTaxGetAction extends BaseAction {

    /** MST_TAX照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object taxCode = postJson.get("taxCode");
        if (taxCode == null) {
            taxCode = postJson.get("MstTax.taxCode");
        }
        if (taxCode == null) {
            return map;
        }

        MstTax mstTax = MstTax.get(taxCode);
        map.put("MstTax", mstTax);
        return map;
    }

}
