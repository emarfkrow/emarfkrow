package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MKtanka;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 契約単価マスタ削除
 *
 * @author emarfkrow
 */
public class MKtankaDeleteAction extends BaseAction {

    /** 契約単価マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object honshacd = postJson.get("honshacd");
        if (honshacd == null) {
            honshacd = postJson.get("MKtanka.honshacd");
        }
        if (honshacd == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object shagaiHinban = postJson.get("shagaiHinban");
        if (shagaiHinban == null) {
            shagaiHinban = postJson.get("MKtanka.shagaiHinban");
        }
        if (shagaiHinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MKtanka e = FormValidator.toBean(MKtanka.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
