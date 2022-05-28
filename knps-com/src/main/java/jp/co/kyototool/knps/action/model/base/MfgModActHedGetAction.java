package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgModActHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_MOD_ACT_HED照会
 *
 * @author emarfkrow
 */
public class MfgModActHedGetAction extends BaseAction {

    /** MFG_MOD_ACT_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object modActNo = postJson.get("modActNo");
        if (modActNo == null) {
            modActNo = postJson.get("MfgModActHed.modActNo");
        }
        if (modActNo == null) {
            return map;
        }

        MfgModActHed mfgModActHed = MfgModActHed.get(modActNo);
        mfgModActHed.referMfgModActDets();
        map.put("MfgModActHed", mfgModActHed);
        return map;
    }

}
