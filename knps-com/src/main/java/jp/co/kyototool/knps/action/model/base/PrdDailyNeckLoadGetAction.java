package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdDailyNeckLoad;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_DAILY_NECK_LOAD照会
 *
 * @author emarfkrow
 */
public class PrdDailyNeckLoadGetAction extends BaseAction {

    /** PRD_DAILY_NECK_LOAD照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proNo = postJson.get("proNo");
        if (proNo == null) {
            proNo = postJson.get("PrdDailyNeckLoad.proNo");
        }
        if (proNo == null) {
            return map;
        }
        Object branchNo = postJson.get("branchNo");
        if (branchNo == null) {
            branchNo = postJson.get("PrdDailyNeckLoad.branchNo");
        }
        if (branchNo == null) {
            return map;
        }

        PrdDailyNeckLoad prdDailyNeckLoad = PrdDailyNeckLoad.get(proNo, branchNo);
        map.put("PrdDailyNeckLoad", prdDailyNeckLoad);
        return map;
    }

}
