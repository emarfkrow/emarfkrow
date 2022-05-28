package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstId;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_ID照会
 *
 * @author emarfkrow
 */
public class MstIdGetAction extends BaseAction {

    /** MST_ID照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object idType = postJson.get("idType");
        if (idType == null) {
            idType = postJson.get("MstId.idType");
        }
        if (idType == null) {
            return map;
        }

        MstId mstId = MstId.get(idType);
        map.put("MstId", mstId);
        return map;
    }

}
