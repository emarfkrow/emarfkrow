package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalCostRegLineIQ;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_TOTAL_COST_REG_LINE_I_Q削除
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineIQDeleteAction extends BaseAction {

    /** MFG_TOTAL_COST_REG_LINE_I_Q削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalCostRegLineIQ.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalCostRegLineIQ.proGroupNo");
        }
        if (proGroupNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalCostRegLineIQ.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MfgTotalCostRegLineIQ.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MfgTotalCostRegLineIQ.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgTotalCostRegLineIQ e = FormValidator.toBean(MfgTotalCostRegLineIQ.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
