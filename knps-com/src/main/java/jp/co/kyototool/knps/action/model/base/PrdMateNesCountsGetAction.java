package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMateNesCounts;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_MATE_NES_COUNTS照会
 *
 * @author emarfkrow
 */
public class PrdMateNesCountsGetAction extends BaseAction {

    /** PRD_MATE_NES_COUNTS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMateNesCounts.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMateNesCounts.mm");
        }
        if (mm == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdMateNesCounts.hinban");
        }
        if (hinban == null) {
            return map;
        }

        PrdMateNesCounts prdMateNesCounts = PrdMateNesCounts.get(yyyy, mm, hinban);
        prdMateNesCounts.referInvYStkAmountProgs();
        prdMateNesCounts.referPrdMSupBudgetPurs();
        map.put("PrdMateNesCounts", prdMateNesCounts);
        return map;
    }

}
