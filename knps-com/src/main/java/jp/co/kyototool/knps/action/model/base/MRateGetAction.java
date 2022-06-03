package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MRate;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 為替レートマスタ照会
 *
 * @author emarfkrow
 */
public class MRateGetAction extends BaseAction {

    /** 為替レートマスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MRate.yy");
        }
        if (yy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MRate.mm");
        }
        if (mm == null) {
            return map;
        }
        Object dd = postJson.get("dd");
        if (dd == null) {
            dd = postJson.get("MRate.dd");
        }
        if (dd == null) {
            return map;
        }
        Object tuuka = postJson.get("tuuka");
        if (tuuka == null) {
            tuuka = postJson.get("MRate.tuuka");
        }
        if (tuuka == null) {
            return map;
        }

        MRate mRate = MRate.get(yy, mm, dd, tuuka);
        map.put("MRate", mRate);
        return map;
    }

}
