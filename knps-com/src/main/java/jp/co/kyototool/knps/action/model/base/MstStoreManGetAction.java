package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstStoreMan;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_STORE_MAN照会
 *
 * @author emarfkrow
 */
public class MstStoreManGetAction extends BaseAction {

    /** MST_STORE_MAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object storeManId = postJson.get("storeManId");
        if (storeManId == null) {
            storeManId = postJson.get("MstStoreMan.storeManId");
        }
        if (storeManId == null) {
            return map;
        }

        MstStoreMan mstStoreMan = MstStoreMan.get(storeManId);
        map.put("MstStoreMan", mstStoreMan);
        return map;
    }

}
