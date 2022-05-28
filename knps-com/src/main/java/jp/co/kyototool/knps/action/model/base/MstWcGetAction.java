package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstWc;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_WC照会
 *
 * @author emarfkrow
 */
public class MstWcGetAction extends BaseAction {

    /** MST_WC照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MstWc.wcCode");
        }
        if (wcCode == null) {
            return map;
        }

        MstWc mstWc = MstWc.get(wcCode);
        mstWc.referMstWcBks();
        map.put("MstWc", mstWc);
        return map;
    }

}
