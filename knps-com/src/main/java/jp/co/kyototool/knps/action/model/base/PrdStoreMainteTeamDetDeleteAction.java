package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteTeamDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_STORE_MAINTE_TEAM_DET削除
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamDetDeleteAction extends BaseAction {

    /** PRD_STORE_MAINTE_TEAM_DET削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object mfgTeamCode = postJson.get("mfgTeamCode");
        if (mfgTeamCode == null) {
            mfgTeamCode = postJson.get("PrdStoreMainteTeamDet.mfgTeamCode");
        }
        if (mfgTeamCode == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object wsCode = postJson.get("wsCode");
        if (wsCode == null) {
            wsCode = postJson.get("PrdStoreMainteTeamDet.wsCode");
        }
        if (wsCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdStoreMainteTeamDet e = FormValidator.toBean(PrdStoreMainteTeamDet.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
