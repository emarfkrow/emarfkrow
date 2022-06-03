package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHcalend;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 販売カレンダー削除
 *
 * @author emarfkrow
 */
public class MHcalendDeleteAction extends BaseAction {

    /** 販売カレンダー削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yymm = postJson.get("yymm");
        if (yymm == null) {
            yymm = postJson.get("MHcalend.yymm");
        }
        if (yymm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object calendkbn = postJson.get("calendkbn");
        if (calendkbn == null) {
            calendkbn = postJson.get("MHcalend.calendkbn");
        }
        if (calendkbn == null) {
            throw new OptLockError("error.cant.delete");
        }

        MHcalend e = FormValidator.toBean(MHcalend.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
