package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstStructure;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_STRUCTURE照会
 *
 * @author emarfkrow
 */
public class MstStructureGetAction extends BaseAction {

    /** MST_STRUCTURE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstStructure.manHinban");
        }
        if (manHinban == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstStructure.hinban");
        }
        if (hinban == null) {
            return map;
        }

        MstStructure mstStructure = MstStructure.get(manHinban, hinban);
        mstStructure.referMstStructureBks();
        map.put("MstStructure", mstStructure);
        return map;
    }

}
