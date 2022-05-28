package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstWcBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_WC_BK照会
 *
 * @author emarfkrow
 */
public class MstWcBkGetAction extends BaseAction {

    /** MST_WC_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MstWcBk.wcCode");
        }
        if (wcCode == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstWcBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstWcBk mstWcBk = MstWcBk.get(wcCode, yy);
        map.put("MstWcBk", mstWcBk);
        return map;
    }

}
