package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdPreStatusM;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_PRE_STATUS_M照会
 *
 * @author emarfkrow
 */
public class PrdPreStatusMGetAction extends BaseAction {

    /** PRD_PRE_STATUS_M照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("PrdPreStatusM.yy");
        }
        if (yy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdPreStatusM.mm");
        }
        if (mm == null) {
            return map;
        }

        PrdPreStatusM prdPreStatusM = PrdPreStatusM.get(yy, mm);
        map.put("PrdPreStatusM", prdPreStatusM);
        return map;
    }

}
