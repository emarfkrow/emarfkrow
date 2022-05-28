package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWProNesCounts;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_W_PRO_NES_COUNTS照会
 *
 * @author emarfkrow
 */
public class PrdWProNesCountsGetAction extends BaseAction {

    /** PRD_W_PRO_NES_COUNTS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object prdWProNesCountsKey = postJson.get("prdWProNesCountsKey");
        if (prdWProNesCountsKey == null) {
            prdWProNesCountsKey = postJson.get("PrdWProNesCounts.prdWProNesCountsKey");
        }
        if (prdWProNesCountsKey == null) {
            return map;
        }

        PrdWProNesCounts prdWProNesCounts = PrdWProNesCounts.get(prdWProNesCountsKey);
        map.put("PrdWProNesCounts", prdWProNesCounts);
        return map;
    }

}
