package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdPreStatusHead;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_PRE_STATUS_HEAD照会
 *
 * @author emarfkrow
 */
public class PrdPreStatusHeadGetAction extends BaseAction {

    /** PRD_PRE_STATUS_HEAD照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object recNo = postJson.get("recNo");
        if (recNo == null) {
            recNo = postJson.get("PrdPreStatusHead.recNo");
        }
        if (recNo == null) {
            return map;
        }

        PrdPreStatusHead prdPreStatusHead = PrdPreStatusHead.get(recNo);
        prdPreStatusHead.referSysCloseStatus();
        map.put("PrdPreStatusHead", prdPreStatusHead);
        return map;
    }

}
