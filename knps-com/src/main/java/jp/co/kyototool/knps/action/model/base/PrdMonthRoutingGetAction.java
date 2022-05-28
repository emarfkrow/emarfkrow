package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMonthRouting;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_MONTH_ROUTING照会
 *
 * @author emarfkrow
 */
public class PrdMonthRoutingGetAction extends BaseAction {

    /** PRD_MONTH_ROUTING照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdMonthRouting.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMonthRouting.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMonthRouting.mm");
        }
        if (mm == null) {
            return map;
        }

        PrdMonthRouting prdMonthRouting = PrdMonthRouting.get(hinban, yyyy, mm);
        map.put("PrdMonthRouting", prdMonthRouting);
        return map;
    }

}
