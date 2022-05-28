package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstAntenna;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_ANTENNA削除
 *
 * @author emarfkrow
 */
public class MstAntennaDeleteAction extends BaseAction {

    /** MST_ANTENNA削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object readerNo = postJson.get("readerNo");
        if (readerNo == null) {
            readerNo = postJson.get("MstAntenna.readerNo");
        }
        if (readerNo == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object antennaNo = postJson.get("antennaNo");
        if (antennaNo == null) {
            antennaNo = postJson.get("MstAntenna.antennaNo");
        }
        if (antennaNo == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstAntenna e = FormValidator.toBean(MstAntenna.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
