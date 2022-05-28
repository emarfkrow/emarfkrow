package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdOrderpointCondition;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_ORDERPOINT_CONDITION照会
 *
 * @author emarfkrow
 */
public class PrdOrderpointConditionGetAction extends BaseAction {

    /** PRD_ORDERPOINT_CONDITION照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object recNo = postJson.get("recNo");
        if (recNo == null) {
            recNo = postJson.get("PrdOrderpointCondition.recNo");
        }
        if (recNo == null) {
            return map;
        }

        PrdOrderpointCondition prdOrderpointCondition = PrdOrderpointCondition.get(recNo);
        prdOrderpointCondition.referPrdPreStatusHead();
        prdOrderpointCondition.referSysCloseStatus();
        map.put("PrdOrderpointCondition", prdOrderpointCondition);
        return map;
    }

}
