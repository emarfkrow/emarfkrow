package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockSurveyStat;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * INV_STOCK_SURVEY_STAT削除
 *
 * @author emarfkrow
 */
public class InvStockSurveyStatDeleteAction extends BaseAction {

    /** INV_STOCK_SURVEY_STAT削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object recNo = postJson.get("recNo");
        if (recNo == null) {
            recNo = postJson.get("InvStockSurveyStat.recNo");
        }
        if (recNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        InvStockSurveyStat e = FormValidator.toBean(InvStockSurveyStat.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
