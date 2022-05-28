package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstOpeForm;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_OPE_FORM照会
 *
 * @author emarfkrow
 */
public class MstOpeFormGetAction extends BaseAction {

    /** MST_OPE_FORM照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object patternNo = postJson.get("patternNo");
        if (patternNo == null) {
            patternNo = postJson.get("MstOpeForm.patternNo");
        }
        if (patternNo == null) {
            return map;
        }

        MstOpeForm mstOpeForm = MstOpeForm.get(patternNo);
        map.put("MstOpeForm", mstOpeForm);
        return map;
    }

}
