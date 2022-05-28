package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteRetsuHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE_RETSU_HED照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteRetsuHedGetAction extends BaseAction {

    /** PRD_STORE_MAINTE_RETSU_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object retsuNo = postJson.get("retsuNo");
        if (retsuNo == null) {
            retsuNo = postJson.get("PrdStoreMainteRetsuHed.retsuNo");
        }
        if (retsuNo == null) {
            return map;
        }

        PrdStoreMainteRetsuHed prdStoreMainteRetsuHed = PrdStoreMainteRetsuHed.get(retsuNo);
        prdStoreMainteRetsuHed.referPrdStoreMainteRetsuDets();
        map.put("PrdStoreMainteRetsuHed", prdStoreMainteRetsuHed);
        return map;
    }

}
