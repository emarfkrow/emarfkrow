package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstHinbanEmp;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_HINBAN_EMP照会
 *
 * @author emarfkrow
 */
public class MstHinbanEmpGetAction extends BaseAction {

    /** MST_HINBAN_EMP照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinbanOpeCode = postJson.get("hinbanOpeCode");
        if (hinbanOpeCode == null) {
            hinbanOpeCode = postJson.get("MstHinbanEmp.hinbanOpeCode");
        }
        if (hinbanOpeCode == null) {
            return map;
        }

        MstHinbanEmp mstHinbanEmp = MstHinbanEmp.get(hinbanOpeCode);
        map.put("MstHinbanEmp", mstHinbanEmp);
        return map;
    }

}
