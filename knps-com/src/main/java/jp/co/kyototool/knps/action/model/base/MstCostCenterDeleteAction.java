package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstCostCenter;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_COST_CENTER削除
 *
 * @author emarfkrow
 */
public class MstCostCenterDeleteAction extends BaseAction {

    /** MST_COST_CENTER削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object costCenterCode = postJson.get("costCenterCode");
        if (costCenterCode == null) {
            costCenterCode = postJson.get("MstCostCenter.costCenterCode");
        }
        if (costCenterCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstCostCenter e = FormValidator.toBean(MstCostCenter.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
