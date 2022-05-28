package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstComponentSales;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_COMPONENT_SALES削除
 *
 * @author emarfkrow
 */
public class MstComponentSalesDeleteAction extends BaseAction {

    /** MST_COMPONENT_SALES削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object compHinbanParent = postJson.get("compHinbanParent");
        if (compHinbanParent == null) {
            compHinbanParent = postJson.get("MstComponentSales.compHinbanParent");
        }
        if (compHinbanParent == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object compHinbanChild = postJson.get("compHinbanChild");
        if (compHinbanChild == null) {
            compHinbanChild = postJson.get("MstComponentSales.compHinbanChild");
        }
        if (compHinbanChild == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstComponentSales e = FormValidator.toBean(MstComponentSales.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
