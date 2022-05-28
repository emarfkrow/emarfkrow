package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteGyoDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE_GYO_DET照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGyoDetGetAction extends BaseAction {

    /** PRD_STORE_MAINTE_GYO_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object gyoNo = postJson.get("gyoNo");
        if (gyoNo == null) {
            gyoNo = postJson.get("PrdStoreMainteGyoDet.gyoNo");
        }
        if (gyoNo == null) {
            return map;
        }
        Object gyoPos = postJson.get("gyoPos");
        if (gyoPos == null) {
            gyoPos = postJson.get("PrdStoreMainteGyoDet.gyoPos");
        }
        if (gyoPos == null) {
            return map;
        }

        PrdStoreMainteGyoDet prdStoreMainteGyoDet = PrdStoreMainteGyoDet.get(gyoNo, gyoPos);
        map.put("PrdStoreMainteGyoDet", prdStoreMainteGyoDet);
        return map;
    }

}
