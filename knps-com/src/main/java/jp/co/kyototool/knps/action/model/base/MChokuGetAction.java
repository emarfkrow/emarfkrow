package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MChoku;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 直送先マスタ照会
 *
 * @author emarfkrow
 */
public class MChokuGetAction extends BaseAction {

    /** 直送先マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object chokucd = postJson.get("chokucd");
        if (chokucd == null) {
            chokucd = postJson.get("MChoku.chokucd");
        }
        if (chokucd == null) {
            return map;
        }

        MChoku mChoku = MChoku.get(chokucd);
        map.put("MChoku", mChoku);
        return map;
    }

}
