package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdTehaiIraiDetHis;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_TEHAI_IRAI_DET_HIS照会
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiDetHisGetAction extends BaseAction {

    /** PRD_TEHAI_IRAI_DET_HIS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object prdTehaiNo = postJson.get("prdTehaiNo");
        if (prdTehaiNo == null) {
            prdTehaiNo = postJson.get("PrdTehaiIraiDetHis.prdTehaiNo");
        }
        if (prdTehaiNo == null) {
            return map;
        }
        Object iraiDetSeq = postJson.get("iraiDetSeq");
        if (iraiDetSeq == null) {
            iraiDetSeq = postJson.get("PrdTehaiIraiDetHis.iraiDetSeq");
        }
        if (iraiDetSeq == null) {
            return map;
        }
        Object iraiDetHisSeq = postJson.get("iraiDetHisSeq");
        if (iraiDetHisSeq == null) {
            iraiDetHisSeq = postJson.get("PrdTehaiIraiDetHis.iraiDetHisSeq");
        }
        if (iraiDetHisSeq == null) {
            return map;
        }

        PrdTehaiIraiDetHis prdTehaiIraiDetHis = PrdTehaiIraiDetHis.get(prdTehaiNo, iraiDetSeq, iraiDetHisSeq);
        map.put("PrdTehaiIraiDetHis", prdTehaiIraiDetHis);
        return map;
    }

}
