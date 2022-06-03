package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MBarindx;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * バーコード管理マスタ照会
 *
 * @author emarfkrow
 */
public class MBarindxGetAction extends BaseAction {

    /** バーコード管理マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object keycd = postJson.get("keycd");
        if (keycd == null) {
            keycd = postJson.get("MBarindx.keycd");
        }
        if (keycd == null) {
            return map;
        }

        MBarindx mBarindx = MBarindx.get(keycd);
        mBarindx.referMHseigyo();
        map.put("MBarindx", mBarindx);
        return map;
    }

}
