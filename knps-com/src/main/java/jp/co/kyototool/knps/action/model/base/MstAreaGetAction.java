package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstArea;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_AREA照会
 *
 * @author emarfkrow
 */
public class MstAreaGetAction extends BaseAction {

    /** MST_AREA照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object areaCd = postJson.get("areaCd");
        if (areaCd == null) {
            areaCd = postJson.get("MstArea.areaCd");
        }
        if (areaCd == null) {
            return map;
        }

        MstArea mstArea = MstArea.get(areaCd);
        map.put("MstArea", mstArea);
        return map;
    }

}
