package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstStructureBkYm;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_STRUCTURE_BK_YM照会
 *
 * @author emarfkrow
 */
public class MstStructureBkYmGetAction extends BaseAction {

    /** MST_STRUCTURE_BK_YM照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstStructureBkYm.yy");
        }
        if (yy == null) {
            return map;
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MstStructureBkYm.mm");
        }
        if (mm == null) {
            return map;
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstStructureBkYm.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstStructureBkYm.hinban");
        }
        if (hinban == null) {
            return map;
        }

        MstStructureBkYm mstStructureBkYm = MstStructureBkYm.get(yy, mm, manHinban, hinban);
        map.put("MstStructureBkYm", mstStructureBkYm);
        return map;
    }

}
