package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MTokuyak;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * ネプロス特約店マスタ照会
 *
 * @author emarfkrow
 */
public class MTokuyakGetAction extends BaseAction {

    /** ネプロス特約店マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tokuyakucd = postJson.get("tokuyakucd");
        if (tokuyakucd == null) {
            tokuyakucd = postJson.get("MTokuyak.tokuyakucd");
        }
        if (tokuyakucd == null) {
            return map;
        }

        MTokuyak mTokuyak = MTokuyak.get(tokuyakucd);
        map.put("MTokuyak", mTokuyak);
        return map;
    }

}
