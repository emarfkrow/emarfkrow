package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdOrderpointStatus;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_ORDERPOINT_STATUS照会
 *
 * @author emarfkrow
 */
public class PrdOrderpointStatusGetAction extends BaseAction {

    /** PRD_ORDERPOINT_STATUS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdOrderpointStatus.hinban");
        }
        if (hinban == null) {
            return map;
        }

        PrdOrderpointStatus prdOrderpointStatus = PrdOrderpointStatus.get(hinban);
        prdOrderpointStatus.referPrdOrderpointSummary();
        map.put("PrdOrderpointStatus", prdOrderpointStatus);
        return map;
    }

}
