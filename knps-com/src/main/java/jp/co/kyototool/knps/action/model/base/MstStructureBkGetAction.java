package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstStructureBk;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_STRUCTURE_BK照会
 *
 * @author emarfkrow
 */
public class MstStructureBkGetAction extends BaseAction {

    /** MST_STRUCTURE_BK照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstStructureBk.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstStructureBk.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstStructureBk.yy");
        }
        if (yy == null) {
            return map;
        }

        MstStructureBk mstStructureBk = MstStructureBk.get(manHinban, hinban, yy);
        map.put("MstStructureBk", mstStructureBk);
        return map;
    }

}
