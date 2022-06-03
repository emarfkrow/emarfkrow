package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MYubojo;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 有力店ボーナス条件照会
 *
 * @author emarfkrow
 */
public class MYubojoGetAction extends BaseAction {

    /** 有力店ボーナス条件照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object yuryokukbn = postJson.get("yuryokukbn");
        if (yuryokukbn == null) {
            yuryokukbn = postJson.get("MYubojo.yuryokukbn");
        }
        if (yuryokukbn == null) {
            return map;
        }
        Object yuryocd = postJson.get("yuryocd");
        if (yuryocd == null) {
            yuryocd = postJson.get("MYubojo.yuryocd");
        }
        if (yuryocd == null) {
            return map;
        }

        MYubojo mYubojo = MYubojo.get(yuryokukbn, yuryocd);
        map.put("MYubojo", mYubojo);
        return map;
    }

}
