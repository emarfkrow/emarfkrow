package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMonthTimeSch;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_MONTH_TIME_SCH照会
 *
 * @author emarfkrow
 */
public class PrdMonthTimeSchGetAction extends BaseAction {

    /** PRD_MONTH_TIME_SCH照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMonthTimeSch.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMonthTimeSch.mm");
        }
        if (mm == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdMonthTimeSch.wcCode");
        }
        if (wcCode == null) {
            return map;
        }

        PrdMonthTimeSch prdMonthTimeSch = PrdMonthTimeSch.get(yyyy, mm, wcCode);
        map.put("PrdMonthTimeSch", prdMonthTimeSch);
        return map;
    }

}
