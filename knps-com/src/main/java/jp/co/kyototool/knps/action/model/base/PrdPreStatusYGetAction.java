package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdPreStatusY;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_PRE_STATUS_Y照会
 *
 * @author emarfkrow
 */
public class PrdPreStatusYGetAction extends BaseAction {

    /** PRD_PRE_STATUS_Y照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("PrdPreStatusY.yy");
        }
        if (yy == null) {
            return map;
        }

        PrdPreStatusY prdPreStatusY = PrdPreStatusY.get(yy);
        prdPreStatusY.referMfgRateBks();
        prdPreStatusY.referPrdPreStatusMs();
        map.put("PrdPreStatusY", prdPreStatusY);
        return map;
    }

}
