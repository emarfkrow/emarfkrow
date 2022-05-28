package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdYWsManLoadPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_Y_WS_MAN_LOAD_PLAN照会
 *
 * @author emarfkrow
 */
public class PrdYWsManLoadPlanGetAction extends BaseAction {

    /** PRD_Y_WS_MAN_LOAD_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdYWsManLoadPlan.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdYWsManLoadPlan.mm");
        }
        if (mm == null) {
            return map;
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("PrdYWsManLoadPlan.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object wsCode = postJson.get("wsCode");
        if (wsCode == null) {
            wsCode = postJson.get("PrdYWsManLoadPlan.wsCode");
        }
        if (wsCode == null) {
            return map;
        }

        PrdYWsManLoadPlan prdYWsManLoadPlan = PrdYWsManLoadPlan.get(yyyy, mm, manHinban, wsCode);
        map.put("PrdYWsManLoadPlan", prdYWsManLoadPlan);
        return map;
    }

}
