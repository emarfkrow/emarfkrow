package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdWProNesCounts;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_W_PRO_NES_COUNTS削除
 *
 * @author emarfkrow
 */
public class PrdWProNesCountsDeleteAction extends BaseAction {

    /** PRD_W_PRO_NES_COUNTS削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object prdWProNesCountsKey = postJson.get("prdWProNesCountsKey");
        if (prdWProNesCountsKey == null) {
            prdWProNesCountsKey = postJson.get("PrdWProNesCounts.prdWProNesCountsKey");
        }
        if (prdWProNesCountsKey == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdWProNesCounts e = FormValidator.toBean(PrdWProNesCounts.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
