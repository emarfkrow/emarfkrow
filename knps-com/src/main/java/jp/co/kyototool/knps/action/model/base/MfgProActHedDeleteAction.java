package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgProActHed;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MFG_PRO_ACT_HED削除
 *
 * @author emarfkrow
 */
public class MfgProActHedDeleteAction extends BaseAction {

    /** MFG_PRO_ACT_HED削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object proNo = postJson.get("proNo");
        if (proNo == null) {
            proNo = postJson.get("MfgProActHed.proNo");
        }
        if (proNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object proRoutingBranch = postJson.get("proRoutingBranch");
        if (proRoutingBranch == null) {
            proRoutingBranch = postJson.get("MfgProActHed.proRoutingBranch");
        }
        if (proRoutingBranch == null) {
            throw new OptLockError("error.cant.delete");
        }

        MfgProActHed e = FormValidator.toBean(MfgProActHed.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
