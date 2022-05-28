package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteRetsuDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE_RETSU_DET照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteRetsuDetGetAction extends BaseAction {

    /** PRD_STORE_MAINTE_RETSU_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object retsuNo = postJson.get("retsuNo");
        if (retsuNo == null) {
            retsuNo = postJson.get("PrdStoreMainteRetsuDet.retsuNo");
        }
        if (retsuNo == null) {
            return map;
        }
        Object retsuPos = postJson.get("retsuPos");
        if (retsuPos == null) {
            retsuPos = postJson.get("PrdStoreMainteRetsuDet.retsuPos");
        }
        if (retsuPos == null) {
            return map;
        }

        PrdStoreMainteRetsuDet prdStoreMainteRetsuDet = PrdStoreMainteRetsuDet.get(retsuNo, retsuPos);
        map.put("PrdStoreMainteRetsuDet", prdStoreMainteRetsuDet);
        return map;
    }

}
