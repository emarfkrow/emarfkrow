package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMSupBudgetPurBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_SUP_BUDGET_PUR_BK照会
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetPurBkGetAction extends BaseAction {

    /** PRD_M_SUP_BUDGET_PUR_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        PrdMSupBudgetPurBk prdMSupBudgetPurBk = PrdMSupBudgetPurBk.get();
        map.put("PrdMSupBudgetPurBk", prdMSupBudgetPurBk);
        return map;
    }

}
