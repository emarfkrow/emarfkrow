package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdSalesTargetMonth;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_SALES_TARGET_MONTH照会
 *
 * @author emarfkrow
 */
public class PrdSalesTargetMonthGetAction extends BaseAction {

    /** PRD_SALES_TARGET_MONTH照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdSalesTargetMonth.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdSalesTargetMonth.mm");
        }
        if (mm == null) {
            return map;
        }
        Object fileId = postJson.get("fileId");
        if (fileId == null) {
            fileId = postJson.get("PrdSalesTargetMonth.fileId");
        }
        if (fileId == null) {
            return map;
        }
        Object salesHinban = postJson.get("salesHinban");
        if (salesHinban == null) {
            salesHinban = postJson.get("PrdSalesTargetMonth.salesHinban");
        }
        if (salesHinban == null) {
            return map;
        }

        PrdSalesTargetMonth prdSalesTargetMonth = PrdSalesTargetMonth.get(yyyy, mm, fileId, salesHinban);
        prdSalesTargetMonth.referPrdSalesTargetYear();
        map.put("PrdSalesTargetMonth", prdSalesTargetMonth);
        return map;
    }

}
