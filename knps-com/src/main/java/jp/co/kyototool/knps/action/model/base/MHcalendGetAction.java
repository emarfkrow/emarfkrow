package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHcalend;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 販売カレンダー照会
 *
 * @author emarfkrow
 */
public class MHcalendGetAction extends BaseAction {

    /** 販売カレンダー照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yymm = postJson.get("yymm");
        if (yymm == null) {
            yymm = postJson.get("MHcalend.yymm");
        }
        if (yymm == null) {
            return map;
        }
        Object calendkbn = postJson.get("calendkbn");
        if (calendkbn == null) {
            calendkbn = postJson.get("MHcalend.calendkbn");
        }
        if (calendkbn == null) {
            return map;
        }

        MHcalend mHcalend = MHcalend.get(yymm, calendkbn);
        map.put("MHcalend", mHcalend);
        return map;
    }

}
