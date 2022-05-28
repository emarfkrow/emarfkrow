package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchPayActDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_PAY_ACT_DET照会
 *
 * @author emarfkrow
 */
public class PchPayActDetGetAction extends BaseAction {

    /** PCH_PAY_ACT_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object payNo = postJson.get("payNo");
        if (payNo == null) {
            payNo = postJson.get("PchPayActDet.payNo");
        }
        if (payNo == null) {
            return map;
        }
        Object payBranchNo = postJson.get("payBranchNo");
        if (payBranchNo == null) {
            payBranchNo = postJson.get("PchPayActDet.payBranchNo");
        }
        if (payBranchNo == null) {
            return map;
        }

        PchPayActDet pchPayActDet = PchPayActDet.get(payNo, payBranchNo);
        map.put("PchPayActDet", pchPayActDet);
        return map;
    }

}
