package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdOrderpointSummary;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_ORDERPOINT_SUMMARY照会
 *
 * @author emarfkrow
 */
public class PrdOrderpointSummaryGetAction extends BaseAction {

    /** PRD_ORDERPOINT_SUMMARY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdOrderpointSummary.hinban");
        }
        if (hinban == null) {
            return map;
        }

        PrdOrderpointSummary prdOrderpointSummary = PrdOrderpointSummary.get(hinban);
        map.put("PrdOrderpointSummary", prdOrderpointSummary);
        return map;
    }

}
