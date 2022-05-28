package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMProNesCounts;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_PRO_NES_COUNTS照会
 *
 * @author emarfkrow
 */
public class PrdMProNesCountsGetAction extends BaseAction {

    /** PRD_M_PRO_NES_COUNTS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdMProNesCounts.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMProNesCounts.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMProNesCounts.mm");
        }
        if (mm == null) {
            return map;
        }

        PrdMProNesCounts prdMProNesCounts = PrdMProNesCounts.get(proHinban, yyyy, mm);
        prdMProNesCounts.referPrdYProNesCounts();
        map.put("PrdMProNesCounts", prdMProNesCounts);
        return map;
    }

}
