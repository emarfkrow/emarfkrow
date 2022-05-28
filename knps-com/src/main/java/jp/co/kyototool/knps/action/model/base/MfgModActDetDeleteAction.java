package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgModActDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_MOD_ACT_DET削除
 *
 * @author emarfkrow
 */
public class MfgModActDetDeleteAction extends BaseAction {

    /** MFG_MOD_ACT_DET削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object modActNo = postJson.get("modActNo");
        if (modActNo == null) {
            modActNo = postJson.get("MfgModActDet.modActNo");
        }
        if (modActNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object modActBranchNo = postJson.get("modActBranchNo");
        if (modActBranchNo == null) {
            modActBranchNo = postJson.get("MfgModActDet.modActBranchNo");
        }
        if (modActBranchNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgModActDet e = FormValidator.toBean(MfgModActDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
