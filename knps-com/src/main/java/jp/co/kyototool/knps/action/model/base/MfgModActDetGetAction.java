package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgModActDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_MOD_ACT_DET照会
 *
 * @author emarfkrow
 */
public class MfgModActDetGetAction extends BaseAction {

    /** MFG_MOD_ACT_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object modActNo = postJson.get("modActNo");
        if (modActNo == null) {
            modActNo = postJson.get("MfgModActDet.modActNo");
        }
        if (modActNo == null) {
            return map;
        }
        Object modActBranchNo = postJson.get("modActBranchNo");
        if (modActBranchNo == null) {
            modActBranchNo = postJson.get("MfgModActDet.modActBranchNo");
        }
        if (modActBranchNo == null) {
            return map;
        }

        MfgModActDet mfgModActDet = MfgModActDet.get(modActNo, modActBranchNo);
        map.put("MfgModActDet", mfgModActDet);
        return map;
    }

}
