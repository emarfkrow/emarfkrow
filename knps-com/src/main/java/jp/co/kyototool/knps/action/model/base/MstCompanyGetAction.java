package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstCompany;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_COMPANY照会
 *
 * @author emarfkrow
 */
public class MstCompanyGetAction extends BaseAction {

    /** MST_COMPANY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object companyCode = postJson.get("companyCode");
        if (companyCode == null) {
            companyCode = postJson.get("MstCompany.companyCode");
        }
        if (companyCode == null) {
            return map;
        }

        MstCompany mstCompany = MstCompany.get(companyCode);
        map.put("MstCompany", mstCompany);
        return map;
    }

}
