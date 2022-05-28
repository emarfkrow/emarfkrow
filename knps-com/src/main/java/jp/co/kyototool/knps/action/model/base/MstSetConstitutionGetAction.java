package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSetConstitution;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_SET_CONSTITUTION照会
 *
 * @author emarfkrow
 */
public class MstSetConstitutionGetAction extends BaseAction {

    /** MST_SET_CONSTITUTION照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object setHinban = postJson.get("setHinban");
        if (setHinban == null) {
            setHinban = postJson.get("MstSetConstitution.setHinban");
        }
        if (setHinban == null) {
            return map;
        }
        Object setChildHinban = postJson.get("setChildHinban");
        if (setChildHinban == null) {
            setChildHinban = postJson.get("MstSetConstitution.setChildHinban");
        }
        if (setChildHinban == null) {
            return map;
        }

        MstSetConstitution mstSetConstitution = MstSetConstitution.get(setHinban, setChildHinban);
        map.put("MstSetConstitution", mstSetConstitution);
        return map;
    }

}
