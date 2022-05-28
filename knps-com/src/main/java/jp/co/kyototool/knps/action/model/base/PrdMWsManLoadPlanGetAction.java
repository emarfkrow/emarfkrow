package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdMWsManLoadPlan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_M_WS_MAN_LOAD_PLAN照会
 *
 * @author emarfkrow
 */
public class PrdMWsManLoadPlanGetAction extends BaseAction {

    /** PRD_M_WS_MAN_LOAD_PLAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdMWsManLoadPlan.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdMWsManLoadPlan.mm");
        }
        if (mm == null) {
            return map;
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("PrdMWsManLoadPlan.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object wsCode = postJson.get("wsCode");
        if (wsCode == null) {
            wsCode = postJson.get("PrdMWsManLoadPlan.wsCode");
        }
        if (wsCode == null) {
            return map;
        }

        PrdMWsManLoadPlan prdMWsManLoadPlan = PrdMWsManLoadPlan.get(yyyy, mm, manHinban, wsCode);
        prdMWsManLoadPlan.referPrdYWsManLoadPlan();
        map.put("PrdMWsManLoadPlan", prdMWsManLoadPlan);
        return map;
    }

}
