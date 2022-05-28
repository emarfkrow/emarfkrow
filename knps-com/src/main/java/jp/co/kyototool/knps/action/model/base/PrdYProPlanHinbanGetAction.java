package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdYProPlanHinban;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_Y_PRO_PLAN_HINBAN照会
 *
 * @author emarfkrow
 */
public class PrdYProPlanHinbanGetAction extends BaseAction {

    /** PRD_Y_PRO_PLAN_HINBAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdYProPlanHinban.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdYProPlanHinban.mm");
        }
        if (mm == null) {
            return map;
        }
        Object proHinban = postJson.get("proHinban");
        if (proHinban == null) {
            proHinban = postJson.get("PrdYProPlanHinban.proHinban");
        }
        if (proHinban == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdYProPlanHinban.hinban");
        }
        if (hinban == null) {
            return map;
        }

        PrdYProPlanHinban prdYProPlanHinban = PrdYProPlanHinban.get(yyyy, mm, proHinban, hinban);
        prdYProPlanHinban.referPrdYProPlanRoutings();
        map.put("PrdYProPlanHinban", prdYProPlanHinban);
        return map;
    }

}
