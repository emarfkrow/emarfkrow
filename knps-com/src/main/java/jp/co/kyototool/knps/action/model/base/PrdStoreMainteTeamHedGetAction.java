package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteTeamHed;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE_TEAM_HED照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamHedGetAction extends BaseAction {

    /** PRD_STORE_MAINTE_TEAM_HED照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object mfgTeamCode = postJson.get("mfgTeamCode");
        if (mfgTeamCode == null) {
            mfgTeamCode = postJson.get("PrdStoreMainteTeamHed.mfgTeamCode");
        }
        if (mfgTeamCode == null) {
            return map;
        }

        PrdStoreMainteTeamHed prdStoreMainteTeamHed = PrdStoreMainteTeamHed.get(mfgTeamCode);
        prdStoreMainteTeamHed.referPrdStoreMainteTeamDets();
        map.put("PrdStoreMainteTeamHed", prdStoreMainteTeamHed);
        return map;
    }

}
