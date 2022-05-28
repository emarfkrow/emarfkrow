package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdTehaiKaitoDetHis;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_TEHAI_KAITO_DET_HIS照会
 *
 * @author emarfkrow
 */
public class PrdTehaiKaitoDetHisGetAction extends BaseAction {

    /** PRD_TEHAI_KAITO_DET_HIS照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object prdTehaiNo = postJson.get("prdTehaiNo");
        if (prdTehaiNo == null) {
            prdTehaiNo = postJson.get("PrdTehaiKaitoDetHis.prdTehaiNo");
        }
        if (prdTehaiNo == null) {
            return map;
        }
        Object kaitoDetHisSeq = postJson.get("kaitoDetHisSeq");
        if (kaitoDetHisSeq == null) {
            kaitoDetHisSeq = postJson.get("PrdTehaiKaitoDetHis.kaitoDetHisSeq");
        }
        if (kaitoDetHisSeq == null) {
            return map;
        }
        Object kaitoDetSeq = postJson.get("kaitoDetSeq");
        if (kaitoDetSeq == null) {
            kaitoDetSeq = postJson.get("PrdTehaiKaitoDetHis.kaitoDetSeq");
        }
        if (kaitoDetSeq == null) {
            return map;
        }

        PrdTehaiKaitoDetHis prdTehaiKaitoDetHis = PrdTehaiKaitoDetHis.get(prdTehaiNo, kaitoDetHisSeq, kaitoDetSeq);
        map.put("PrdTehaiKaitoDetHis", prdTehaiKaitoDetHis);
        return map;
    }

}
