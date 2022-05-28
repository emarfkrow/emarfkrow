package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstTeam;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_TEAM照会
 *
 * @author emarfkrow
 */
public class MstTeamGetAction extends BaseAction {

    /** MST_TEAM照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object teamCode = postJson.get("teamCode");
        if (teamCode == null) {
            teamCode = postJson.get("MstTeam.teamCode");
        }
        if (teamCode == null) {
            return map;
        }

        MstTeam mstTeam = MstTeam.get(teamCode);
        map.put("MstTeam", mstTeam);
        return map;
    }

}
