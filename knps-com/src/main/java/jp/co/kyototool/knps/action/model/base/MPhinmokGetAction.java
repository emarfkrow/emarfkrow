package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MPhinmok;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 部品マスタ照会
 *
 * @author emarfkrow
 */
public class MPhinmokGetAction extends BaseAction {

    /** 部品マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object phinban = postJson.get("phinban");
        if (phinban == null) {
            phinban = postJson.get("MPhinmok.phinban");
        }
        if (phinban == null) {
            return map;
        }

        MPhinmok mPhinmok = MPhinmok.get(phinban);
        map.put("MPhinmok", mPhinmok);
        return map;
    }

}
