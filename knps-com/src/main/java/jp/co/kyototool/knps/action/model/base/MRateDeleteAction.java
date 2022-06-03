package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MRate;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 為替レートマスタ削除
 *
 * @author emarfkrow
 */
public class MRateDeleteAction extends BaseAction {

    /** 為替レートマスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MRate.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MRate.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object dd = postJson.get("dd");
        if (dd == null) {
            dd = postJson.get("MRate.dd");
        }
        if (dd == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object tuuka = postJson.get("tuuka");
        if (tuuka == null) {
            tuuka = postJson.get("MRate.tuuka");
        }
        if (tuuka == null) {
            throw new OptLockError("error.cant.delete");
        }

        MRate e = FormValidator.toBean(MRate.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
