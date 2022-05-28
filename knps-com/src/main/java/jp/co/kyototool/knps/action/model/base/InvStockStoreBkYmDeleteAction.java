package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockStoreBkYm;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_STOCK_STORE_BK_YM削除
 *
 * @author emarfkrow
 */
public class InvStockStoreBkYmDeleteAction extends BaseAction {

    /** INV_STOCK_STORE_BK_YM削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("InvStockStoreBkYm.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("InvStockStoreBkYm.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("InvStockStoreBkYm.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object storeNo = postJson.get("storeNo");
        if (storeNo == null) {
            storeNo = postJson.get("InvStockStoreBkYm.storeNo");
        }
        if (storeNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvStockStoreBkYm e = FormValidator.toBean(InvStockStoreBkYm.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
