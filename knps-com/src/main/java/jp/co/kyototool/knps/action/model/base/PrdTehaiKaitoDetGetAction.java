package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdTehaiKaitoDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_TEHAI_KAITO_DET照会
 *
 * @author emarfkrow
 */
public class PrdTehaiKaitoDetGetAction extends BaseAction {

    /** PRD_TEHAI_KAITO_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object prdTehaiNo = postJson.get("prdTehaiNo");
        if (prdTehaiNo == null) {
            prdTehaiNo = postJson.get("PrdTehaiKaitoDet.prdTehaiNo");
        }
        if (prdTehaiNo == null) {
            return map;
        }
        Object kaitoDetSeq = postJson.get("kaitoDetSeq");
        if (kaitoDetSeq == null) {
            kaitoDetSeq = postJson.get("PrdTehaiKaitoDet.kaitoDetSeq");
        }
        if (kaitoDetSeq == null) {
            return map;
        }

        PrdTehaiKaitoDet prdTehaiKaitoDet = PrdTehaiKaitoDet.get(prdTehaiNo, kaitoDetSeq);
        map.put("PrdTehaiKaitoDet", prdTehaiKaitoDet);
        return map;
    }

}
