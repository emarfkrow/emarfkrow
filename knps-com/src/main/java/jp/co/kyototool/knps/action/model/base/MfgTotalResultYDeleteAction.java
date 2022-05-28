package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalResultY;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_TOTAL_RESULT_Y削除
 *
 * @author emarfkrow
 */
public class MfgTotalResultYDeleteAction extends BaseAction {

    /** MFG_TOTAL_RESULT_Y削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object resultDate = postJson.get("resultDate");
        if (resultDate == null) {
            resultDate = postJson.get("MfgTotalResultY.resultDate");
        }
        if (resultDate == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalResultY.proGroupNo");
        }
        if (proGroupNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalResultY.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalResultY.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object wcCode = postJson.get("wcCode");
        if (wcCode == null) {
            wcCode = postJson.get("MfgTotalResultY.wcCode");
        }
        if (wcCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object opeDetail = postJson.get("opeDetail");
        if (opeDetail == null) {
            opeDetail = postJson.get("MfgTotalResultY.opeDetail");
        }
        if (opeDetail == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgTotalResultY e = FormValidator.toBean(MfgTotalResultY.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
