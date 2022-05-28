package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdTehaiIrai;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_TEHAI_IRAI照会
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiGetAction extends BaseAction {

    /** PRD_TEHAI_IRAI照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object prdTehaiNo = postJson.get("prdTehaiNo");
        if (prdTehaiNo == null) {
            prdTehaiNo = postJson.get("PrdTehaiIrai.prdTehaiNo");
        }
        if (prdTehaiNo == null) {
            return map;
        }

        PrdTehaiIrai prdTehaiIrai = PrdTehaiIrai.get(prdTehaiNo);
        prdTehaiIrai.referPrdTehaiFlows();
        prdTehaiIrai.referPrdTehaiIraiDets();
        prdTehaiIrai.referPrdTehaiKaitoDets();
        map.put("PrdTehaiIrai", prdTehaiIrai);
        return map;
    }

}
