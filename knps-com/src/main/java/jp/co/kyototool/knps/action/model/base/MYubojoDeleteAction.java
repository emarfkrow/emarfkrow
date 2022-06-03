package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MYubojo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 有力店ボーナス条件削除
 *
 * @author emarfkrow
 */
public class MYubojoDeleteAction extends BaseAction {

    /** 有力店ボーナス条件削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yuryokukbn = postJson.get("yuryokukbn");
        if (yuryokukbn == null) {
            yuryokukbn = postJson.get("MYubojo.yuryokukbn");
        }
        if (yuryokukbn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object yuryocd = postJson.get("yuryocd");
        if (yuryocd == null) {
            yuryocd = postJson.get("MYubojo.yuryocd");
        }
        if (yuryocd == null) {
            throw new OptLockError("error.cant.delete");
        }

        MYubojo e = FormValidator.toBean(MYubojo.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
