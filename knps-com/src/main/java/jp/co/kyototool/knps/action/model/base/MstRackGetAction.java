package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstRack;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_RACK照会
 *
 * @author emarfkrow
 */
public class MstRackGetAction extends BaseAction {

    /** MST_RACK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstRack.manHinban");
        }
        if (manHinban == null) {
            return map;
        }

        MstRack mstRack = MstRack.get(manHinban);
        mstRack.referMstRoutingDefs();
        mstRack.referMstStructures();
        map.put("MstRack", mstRack);
        return map;
    }

}
