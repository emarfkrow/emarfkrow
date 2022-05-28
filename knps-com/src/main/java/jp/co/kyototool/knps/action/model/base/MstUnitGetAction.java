package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstUnit;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_UNIT照会
 *
 * @author emarfkrow
 */
public class MstUnitGetAction extends BaseAction {

    /** MST_UNIT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object unitCode = postJson.get("unitCode");
        if (unitCode == null) {
            unitCode = postJson.get("MstUnit.unitCode");
        }
        if (unitCode == null) {
            return map;
        }

        MstUnit mstUnit = MstUnit.get(unitCode);
        map.put("MstUnit", mstUnit);
        return map;
    }

}
