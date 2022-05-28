package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstStructureBkYm;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * MST_STRUCTURE_BK_YM削除
 *
 * @author emarfkrow
 */
public class MstStructureBkYmDeleteAction extends BaseAction {

    /** MST_STRUCTURE_BK_YM削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object yy = postJson.get("yy");
        if (yy == null) {
            yy = postJson.get("MstStructureBkYm.yy");
        }
        if (yy == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object mm = postJson.get("mm");
        if (mm == null) {
            mm = postJson.get("MstStructureBkYm.mm");
        }
        if (mm == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object manHinban = postJson.get("manHinban");
        if (manHinban == null) {
            manHinban = postJson.get("MstStructureBkYm.manHinban");
        }
        if (manHinban == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstStructureBkYm.hinban");
        }
        if (hinban == null) {
            throw new OptLockError("error.cant.delete");
        }

        MstStructureBkYm e = FormValidator.toBean(MstStructureBkYm.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
