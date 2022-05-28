package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PrdStoreMainteTeamDet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PRD_STORE_MAINTE_TEAM_DET照会
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamDetGetAction extends BaseAction {

    /** PRD_STORE_MAINTE_TEAM_DET照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object mfgTeamCode = postJson.get("mfgTeamCode");
        if (mfgTeamCode == null) {
            mfgTeamCode = postJson.get("PrdStoreMainteTeamDet.mfgTeamCode");
        }
        if (mfgTeamCode == null) {
            return map;
        }
        Object wsCode = postJson.get("wsCode");
        if (wsCode == null) {
            wsCode = postJson.get("PrdStoreMainteTeamDet.wsCode");
        }
        if (wsCode == null) {
            return map;
        }

        PrdStoreMainteTeamDet prdStoreMainteTeamDet = PrdStoreMainteTeamDet.get(mfgTeamCode, wsCode);
        map.put("PrdStoreMainteTeamDet", prdStoreMainteTeamDet);
        return map;
    }

}
