package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstGroup;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_GROUP照会
 *
 * @author emarfkrow
 */
public class MstGroupGetAction extends BaseAction {

    /** MST_GROUP照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object groupCode = postJson.get("groupCode");
        if (groupCode == null) {
            groupCode = postJson.get("MstGroup.groupCode");
        }
        if (groupCode == null) {
            return map;
        }

        MstGroup mstGroup = MstGroup.get(groupCode);
        map.put("MstGroup", mstGroup);
        return map;
    }

}
