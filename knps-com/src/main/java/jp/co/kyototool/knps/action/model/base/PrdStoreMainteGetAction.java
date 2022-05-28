package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainte;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGetAction extends BaseAction {

    /** PRD_STORE_MAINTE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yyyy = postJson.get("yyyy");
        if (yyyy == null) {
            yyyy = postJson.get("PrdStoreMainte.yyyy");
        }
        if (yyyy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("PrdStoreMainte.mm");
        }
        if (mm == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("PrdStoreMainte.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("PrdStoreMainte.routing");
        }
        if (routing == null) {
            return map;
        }

        PrdStoreMainte prdStoreMainte = PrdStoreMainte.get(yyyy, mm, hinban, routing);
        prdStoreMainte.referPrdYSupBudgetOut();
        map.put("PrdStoreMainte", prdStoreMainte);
        return map;
    }

}
