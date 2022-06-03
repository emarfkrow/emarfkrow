package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MJinji;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 人事マスタ照会
 *
 * @author emarfkrow
 */
public class MJinjiGetAction extends BaseAction {

    /** 人事マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shainNo = postJson.get("shainNo");
        if (shainNo == null) {
            shainNo = postJson.get("MJinji.shainNo");
        }
        if (shainNo == null) {
            return map;
        }

        MJinji mJinji = MJinji.get(shainNo);
        map.put("MJinji", mJinji);
        return map;
    }

}
