package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteTeamHed;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * PRD_STORE_MAINTE_TEAM_HED削除
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamHedDeleteAction extends BaseAction {

    /** PRD_STORE_MAINTE_TEAM_HED削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object mfgTeamCode = postJson.get("mfgTeamCode");
        if (mfgTeamCode == null) {
            mfgTeamCode = postJson.get("PrdStoreMainteTeamHed.mfgTeamCode");
        }
        if (mfgTeamCode == null) {
            throw new OptLockError("error.cant.delete");
        }

        PrdStoreMainteTeamHed e = FormValidator.toBean(PrdStoreMainteTeamHed.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
