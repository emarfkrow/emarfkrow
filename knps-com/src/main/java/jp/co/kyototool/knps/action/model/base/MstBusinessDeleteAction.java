package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstBusiness;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_BUSINESS削除
 *
 * @author emarfkrow
 */
public class MstBusinessDeleteAction extends BaseAction {

    /** MST_BUSINESS削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object businessId = postJson.get("businessId");
        if (businessId == null) {
            businessId = postJson.get("MstBusiness.businessId");
        }
        if (businessId == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstBusiness e = FormValidator.toBean(MstBusiness.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
