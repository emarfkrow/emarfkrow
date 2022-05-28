package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyTimeSch;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_DAILY_TIME_SCH照会
 *
 * @author emarfkrow
 */
public class PrdDailyTimeSchGetAction extends BaseAction {

    /** PRD_DAILY_TIME_SCH照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object layoutDate = postJson.get("layoutDate");
        if (layoutDate == null) {
            layoutDate = postJson.get("PrdDailyTimeSch.layoutDate");
        }
        if (layoutDate == null) {
            return map;
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("PrdDailyTimeSch.wcCode");
        }
        if (wcCode == null) {
            return map;
        }

        PrdDailyTimeSch prdDailyTimeSch = PrdDailyTimeSch.get(layoutDate, wcCode);
        map.put("PrdDailyTimeSch", prdDailyTimeSch);
        return map;
    }

}
