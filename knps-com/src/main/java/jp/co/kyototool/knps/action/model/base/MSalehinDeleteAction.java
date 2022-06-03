package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSalehin;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * セール品目マスタ削除
 *
 * @author emarfkrow
 */
public class MSalehinDeleteAction extends BaseAction {

    /** セール品目マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object salekbn = postJson.get("salekbn");
        if (salekbn == null) {
            salekbn = postJson.get("MSalehin.salekbn");
        }
        if (salekbn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MSalehin.hhinban");
        }
        if (hhinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object kaisiYy = postJson.get("kaisiYy");
        if (kaisiYy == null) {
            kaisiYy = postJson.get("MSalehin.kaisiYy");
        }
        if (kaisiYy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object kaisiMm = postJson.get("kaisiMm");
        if (kaisiMm == null) {
            kaisiMm = postJson.get("MSalehin.kaisiMm");
        }
        if (kaisiMm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object kaisiDd = postJson.get("kaisiDd");
        if (kaisiDd == null) {
            kaisiDd = postJson.get("MSalehin.kaisiDd");
        }
        if (kaisiDd == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shuryoYy = postJson.get("shuryoYy");
        if (shuryoYy == null) {
            shuryoYy = postJson.get("MSalehin.shuryoYy");
        }
        if (shuryoYy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shuryoMm = postJson.get("shuryoMm");
        if (shuryoMm == null) {
            shuryoMm = postJson.get("MSalehin.shuryoMm");
        }
        if (shuryoMm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shuryoDd = postJson.get("shuryoDd");
        if (shuryoDd == null) {
            shuryoDd = postJson.get("MSalehin.shuryoDd");
        }
        if (shuryoDd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MSalehin e = FormValidator.toBean(MSalehin.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
