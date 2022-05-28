package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdTehaiFlow;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_TEHAI_FLOW照会
 *
 * @author emarfkrow
 */
public class PrdTehaiFlowGetAction extends BaseAction {

    /** PRD_TEHAI_FLOW照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object prdTehaiNo = postJson.get("prdTehaiNo");
        if (prdTehaiNo == null) {
            prdTehaiNo = postJson.get("PrdTehaiFlow.prdTehaiNo");
        }
        if (prdTehaiNo == null) {
            return map;
        }
        Object tehaiFlowSeq = postJson.get("tehaiFlowSeq");
        if (tehaiFlowSeq == null) {
            tehaiFlowSeq = postJson.get("PrdTehaiFlow.tehaiFlowSeq");
        }
        if (tehaiFlowSeq == null) {
            return map;
        }

        PrdTehaiFlow prdTehaiFlow = PrdTehaiFlow.get(prdTehaiNo, tehaiFlowSeq);
        map.put("PrdTehaiFlow", prdTehaiFlow);
        return map;
    }

}
