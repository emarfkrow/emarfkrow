package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgProActDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_PRO_ACT_DET照会
 *
 * @author emarfkrow
 */
public class MfgProActDetGetAction extends BaseAction {

    /** MFG_PRO_ACT_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object proNo = postJson.get("proNo");
        if (proNo == null) {
            proNo = postJson.get("MfgProActDet.proNo");
        }
        if (proNo == null) {
            return map;
        }
        Object proRoutingBranch = postJson.get("proRoutingBranch");
        if (proRoutingBranch == null) {
            proRoutingBranch = postJson.get("MfgProActDet.proRoutingBranch");
        }
        if (proRoutingBranch == null) {
            return map;
        }
        Object proActBranchNo = postJson.get("proActBranchNo");
        if (proActBranchNo == null) {
            proActBranchNo = postJson.get("MfgProActDet.proActBranchNo");
        }
        if (proActBranchNo == null) {
            return map;
        }

        MfgProActDet mfgProActDet = MfgProActDet.get(proNo, proRoutingBranch, proActBranchNo);
        map.put("MfgProActDet", mfgProActDet);
        return map;
    }

}
