package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSupUnitpriceDetailBk;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_SUP_UNITPRICE_DETAIL_BK削除
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailBkDeleteAction extends BaseAction {

    /** MST_SUP_UNITPRICE_DETAIL_BK削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstSupUnitpriceDetailBk.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object supCode = postJson.get("supCode");
        if (supCode == null) {
            supCode = postJson.get("MstSupUnitpriceDetailBk.supCode");
        }
        if (supCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object minOrder = postJson.get("minOrder");
        if (minOrder == null) {
            minOrder = postJson.get("MstSupUnitpriceDetailBk.minOrder");
        }
        if (minOrder == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstSupUnitpriceDetailBk.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstSupUnitpriceDetailBk e = FormValidator.toBean(MstSupUnitpriceDetailBk.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
