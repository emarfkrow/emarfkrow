package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.WkInspectionList1;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * WK_INSPECTION_LIST1照会
 *
 * @author emarfkrow
 */
public class WkInspectionList1GetAction extends BaseAction {

    /** WK_INSPECTION_LIST1照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了

        WkInspectionList1 wkInspectionList1 = WkInspectionList1.get();
        map.put("WkInspectionList1", wkInspectionList1);
        return map;
    }

}
