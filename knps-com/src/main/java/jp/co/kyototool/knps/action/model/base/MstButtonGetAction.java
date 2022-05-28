package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstButton;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_BUTTON照会
 *
 * @author emarfkrow
 */
public class MstButtonGetAction extends BaseAction {

    /** MST_BUTTON照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object btnId = postJson.get("btnId");
        if (btnId == null) {
            btnId = postJson.get("MstButton.btnId");
        }
        if (btnId == null) {
            return map;
        }

        MstButton mstButton = MstButton.get(btnId);
        map.put("MstButton", mstButton);
        return map;
    }

}
