package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstAccountCode;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_ACCOUNT_CODE照会
 *
 * @author emarfkrow
 */
public class MstAccountCodeGetAction extends BaseAction {

    /** MST_ACCOUNT_CODE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object accountCode = postJson.get("accountCode");
        if (accountCode == null) {
            accountCode = postJson.get("MstAccountCode.accountCode");
        }
        if (accountCode == null) {
            return map;
        }

        MstAccountCode mstAccountCode = MstAccountCode.get(accountCode);
        map.put("MstAccountCode", mstAccountCode);
        return map;
    }

}
