package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteGyoHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE_GYO_HED照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGyoHedGetAction extends BaseAction {

    /** PRD_STORE_MAINTE_GYO_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object gyoNo = postJson.get("gyoNo");
        if (gyoNo == null) {
            gyoNo = postJson.get("PrdStoreMainteGyoHed.gyoNo");
        }
        if (gyoNo == null) {
            return map;
        }

        PrdStoreMainteGyoHed prdStoreMainteGyoHed = PrdStoreMainteGyoHed.get(gyoNo);
        prdStoreMainteGyoHed.referPrdStoreMainteGyoDets();
        map.put("PrdStoreMainteGyoHed", prdStoreMainteGyoHed);
        return map;
    }

}
