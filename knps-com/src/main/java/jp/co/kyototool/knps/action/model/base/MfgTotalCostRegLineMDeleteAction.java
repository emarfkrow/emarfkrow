package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgTotalCostRegLineM;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_TOTAL_COST_REG_LINE_M削除
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineMDeleteAction extends BaseAction {

    /** MFG_TOTAL_COST_REG_LINE_M削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgTotalCostRegLineM.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MfgTotalCostRegLineM.proGroupNo");
        }
        if (proGroupNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MfgTotalCostRegLineM.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MfgTotalCostRegLineM.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MfgTotalCostRegLineM.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgTotalCostRegLineM e = FormValidator.toBean(MfgTotalCostRegLineM.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
