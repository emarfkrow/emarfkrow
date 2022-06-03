package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSimuke;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 仕向先マスタ削除
 *
 * @author emarfkrow
 */
public class MSimukeDeleteAction extends BaseAction {

    /** 仕向先マスタ削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object simukecd = postJson.get("simukecd");
        if (simukecd == null) {
            simukecd = postJson.get("MSimuke.simukecd");
        }
        if (simukecd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MSimuke e = FormValidator.toBean(MSimuke.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
