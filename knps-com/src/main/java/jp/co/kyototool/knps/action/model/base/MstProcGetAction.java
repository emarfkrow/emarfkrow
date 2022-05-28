package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstProc;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_PROC照会
 *
 * @author emarfkrow
 */
public class MstProcGetAction extends BaseAction {

    /** MST_PROC照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object routingCode = postJson.get("routingCode");
        if (routingCode == null) {
            routingCode = postJson.get("MstProc.routingCode");
        }
        if (routingCode == null) {
            return map;
        }

        MstProc mstProc = MstProc.get(routingCode);
        map.put("MstProc", mstProc);
        return map;
    }

}
