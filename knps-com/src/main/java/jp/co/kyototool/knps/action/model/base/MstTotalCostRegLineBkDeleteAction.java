package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTotalCostRegLineBk;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_TOTAL_COST_REG_LINE_BK削除
 *
 * @author emarfkrow
 */
public class MstTotalCostRegLineBkDeleteAction extends BaseAction {

    /** MST_TOTAL_COST_REG_LINE_BK削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstTotalCostRegLineBk.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object proGroupNo = postJson.get("proGroupNo");
        if (proGroupNo == null) {
            proGroupNo = postJson.get("MstTotalCostRegLineBk.proGroupNo");
        }
        if (proGroupNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object routing = postJson.get("routing");
        if (routing == null) {
            routing = postJson.get("MstTotalCostRegLineBk.routing");
        }
        if (routing == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstTotalCostRegLineBk.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstTotalCostRegLineBk e = FormValidator.toBean(MstTotalCostRegLineBk.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
