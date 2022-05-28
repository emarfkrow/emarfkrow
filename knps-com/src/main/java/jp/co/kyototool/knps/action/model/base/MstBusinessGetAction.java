package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstBusiness;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_BUSINESS照会
 *
 * @author emarfkrow
 */
public class MstBusinessGetAction extends BaseAction {

    /** MST_BUSINESS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object businessId = postJson.get("businessId");
        if (businessId == null) {
            businessId = postJson.get("MstBusiness.businessId");
        }
        if (businessId == null) {
            return map;
        }

        MstBusiness mstBusiness = MstBusiness.get(businessId);
        map.put("MstBusiness", mstBusiness);
        return map;
    }

}
