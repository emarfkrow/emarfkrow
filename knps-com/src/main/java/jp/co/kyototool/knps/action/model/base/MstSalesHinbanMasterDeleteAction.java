package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstSalesHinbanMaster;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_SALES_HINBAN_MASTER削除
 *
 * @author emarfkrow
 */
public class MstSalesHinbanMasterDeleteAction extends BaseAction {

    /** MST_SALES_HINBAN_MASTER削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object salesHinban = postJson.get("salesHinban");
        if (salesHinban == null) {
            salesHinban = postJson.get("MstSalesHinbanMaster.salesHinban");
        }
        if (salesHinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstSalesHinbanMaster e = FormValidator.toBean(MstSalesHinbanMaster.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
