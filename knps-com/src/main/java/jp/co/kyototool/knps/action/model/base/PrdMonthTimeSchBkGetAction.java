package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMonthTimeSchBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_MONTH_TIME_SCH_BK照会
 *
 * @author emarfkrow
 */
public class PrdMonthTimeSchBkGetAction extends BaseAction {

    /** PRD_MONTH_TIME_SCH_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        PrdMonthTimeSchBk prdMonthTimeSchBk = PrdMonthTimeSchBk.get();
        map.put("PrdMonthTimeSchBk", prdMonthTimeSchBk);
        return map;
    }

}
