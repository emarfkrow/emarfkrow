package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MYuryoku;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 有力店マスタ照会
 *
 * @author emarfkrow
 */
public class MYuryokuGetAction extends BaseAction {

    /** 有力店マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yuryocd = postJson.get("yuryocd");
        if (yuryocd == null) {
            yuryocd = postJson.get("MYuryoku.yuryocd");
        }
        if (yuryocd == null) {
            return map;
        }

        MYuryoku mYuryoku = MYuryoku.get(yuryocd);
        map.put("MYuryoku", mYuryoku);
        return map;
    }

}
