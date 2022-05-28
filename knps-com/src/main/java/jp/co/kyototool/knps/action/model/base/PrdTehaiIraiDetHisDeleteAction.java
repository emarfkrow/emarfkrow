package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdTehaiIraiDetHis;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_TEHAI_IRAI_DET_HIS削除
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiDetHisDeleteAction extends BaseAction {

    /** PRD_TEHAI_IRAI_DET_HIS削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object prdTehaiNo = postJson.get("prdTehaiNo");
        if (prdTehaiNo == null) {
            prdTehaiNo = postJson.get("PrdTehaiIraiDetHis.prdTehaiNo");
        }
        if (prdTehaiNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object iraiDetSeq = postJson.get("iraiDetSeq");
        if (iraiDetSeq == null) {
            iraiDetSeq = postJson.get("PrdTehaiIraiDetHis.iraiDetSeq");
        }
        if (iraiDetSeq == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object iraiDetHisSeq = postJson.get("iraiDetHisSeq");
        if (iraiDetHisSeq == null) {
            iraiDetHisSeq = postJson.get("PrdTehaiIraiDetHis.iraiDetHisSeq");
        }
        if (iraiDetHisSeq == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdTehaiIraiDetHis e = FormValidator.toBean(PrdTehaiIraiDetHis.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
