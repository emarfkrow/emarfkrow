package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteReport;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE_REPORT照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteReportGetAction extends BaseAction {

    /** PRD_STORE_MAINTE_REPORT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object repGroupCode = postJson.get("repGroupCode");
        if (repGroupCode == null) {
            repGroupCode = postJson.get("PrdStoreMainteReport.repGroupCode");
        }
        if (repGroupCode == null) {
            return map;
        }

        PrdStoreMainteReport prdStoreMainteReport = PrdStoreMainteReport.get(repGroupCode);
        map.put("PrdStoreMainteReport", prdStoreMainteReport);
        return map;
    }

}
