package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdTehaiIraiDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_TEHAI_IRAI_DET照会
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiDetGetAction extends BaseAction {

    /** PRD_TEHAI_IRAI_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object prdTehaiNo = postJson.get("prdTehaiNo");
        if (prdTehaiNo == null) {
            prdTehaiNo = postJson.get("PrdTehaiIraiDet.prdTehaiNo");
        }
        if (prdTehaiNo == null) {
            return map;
        }
        Object iraiDetSeq = postJson.get("iraiDetSeq");
        if (iraiDetSeq == null) {
            iraiDetSeq = postJson.get("PrdTehaiIraiDet.iraiDetSeq");
        }
        if (iraiDetSeq == null) {
            return map;
        }

        PrdTehaiIraiDet prdTehaiIraiDet = PrdTehaiIraiDet.get(prdTehaiNo, iraiDetSeq);
        prdTehaiIraiDet.referPrdTehaiIraiDetHiss();
        map.put("PrdTehaiIraiDet", prdTehaiIraiDet);
        return map;
    }

}
