package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstActGatherPat;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_ACT_GATHER_PAT削除
 *
 * @author emarfkrow
 */
public class MstActGatherPatDeleteAction extends BaseAction {

    /** MST_ACT_GATHER_PAT削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object actGatherPatNo = postJson.get("actGatherPatNo");
        if (actGatherPatNo == null) {
            actGatherPatNo = postJson.get("MstActGatherPat.actGatherPatNo");
        }
        if (actGatherPatNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstActGatherPat e = FormValidator.toBean(MstActGatherPat.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
