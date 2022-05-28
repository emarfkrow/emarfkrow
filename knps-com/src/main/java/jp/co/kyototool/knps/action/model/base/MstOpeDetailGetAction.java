package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstOpeDetail;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_OPE_DETAIL照会
 *
 * @author emarfkrow
 */
public class MstOpeDetailGetAction extends BaseAction {

    /** MST_OPE_DETAIL照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object opeDetail = postJson.get("opeDetail");
        if (opeDetail == null) {
            opeDetail = postJson.get("MstOpeDetail.opeDetail");
        }
        if (opeDetail == null) {
            return map;
        }

        MstOpeDetail mstOpeDetail = MstOpeDetail.get(opeDetail);
        map.put("MstOpeDetail", mstOpeDetail);
        return map;
    }

}
