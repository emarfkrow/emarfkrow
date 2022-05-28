package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitpriceDetailHs;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_SUP_UNITPRICE_DETAIL_HS削除
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailHsDeleteAction extends BaseAction {

    /** MST_SUP_UNITPRICE_DETAIL_HS削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitpriceDetailHs.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitpriceDetailHs.supCode");
        }
        if (supCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object minOrder = postJson.get("minOrder");
        if (minOrder == null) {
            minOrder = postJson.get("MstSupUnitpriceDetailHs.minOrder");
        }
        if (minOrder == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object timeStampChange = postJson.get("timeStampChange");
        if (timeStampChange == null) {
            timeStampChange = postJson.get("MstSupUnitpriceDetailHs.timeStampChange");
        }
        if (timeStampChange == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstSupUnitpriceDetailHs e = FormValidator.toBean(MstSupUnitpriceDetailHs.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
