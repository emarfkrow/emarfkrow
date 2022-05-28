package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgProActHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_PRO_ACT_HED照会
 *
 * @author emarfkrow
 */
public class MfgProActHedGetAction extends BaseAction {

    /** MFG_PRO_ACT_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proNo = postJson.get("proNo");
        if (proNo == null) {
            proNo = postJson.get("MfgProActHed.proNo");
        }
        if (proNo == null) {
            return map;
        }
        Object proRoutingBranch = postJson.get("proRoutingBranch");
        if (proRoutingBranch == null) {
            proRoutingBranch = postJson.get("MfgProActHed.proRoutingBranch");
        }
        if (proRoutingBranch == null) {
            return map;
        }

        MfgProActHed mfgProActHed = MfgProActHed.get(proNo, proRoutingBranch);
        mfgProActHed.referMfgProActDets();
        map.put("MfgProActHed", mfgProActHed);
        return map;
    }

}
