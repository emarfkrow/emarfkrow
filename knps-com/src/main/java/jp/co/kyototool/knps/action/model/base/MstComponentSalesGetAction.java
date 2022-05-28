package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstComponentSales;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_COMPONENT_SALES照会
 *
 * @author emarfkrow
 */
public class MstComponentSalesGetAction extends BaseAction {

    /** MST_COMPONENT_SALES照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object compHinbanParent = postJson.get("compHinbanParent");
        if (compHinbanParent == null) {
            compHinbanParent = postJson.get("MstComponentSales.compHinbanParent");
        }
        if (compHinbanParent == null) {
            return map;
        }
        Object compHinbanChild = postJson.get("compHinbanChild");
        if (compHinbanChild == null) {
            compHinbanChild = postJson.get("MstComponentSales.compHinbanChild");
        }
        if (compHinbanChild == null) {
            return map;
        }

        MstComponentSales mstComponentSales = MstComponentSales.get(compHinbanParent, compHinbanChild);
        map.put("MstComponentSales", mstComponentSales);
        return map;
    }

}
