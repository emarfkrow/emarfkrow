package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MYosin;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 与信管理マスタ照会
 *
 * @author emarfkrow
 */
public class MYosinGetAction extends BaseAction {

    /** 与信管理マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object shukincd = postJson.get("shukincd");
        if (shukincd == null) {
            shukincd = postJson.get("MYosin.shukincd");
        }
        if (shukincd == null) {
            return map;
        }

        MYosin mYosin = MYosin.get(shukincd);
        map.put("MYosin", mYosin);
        return map;
    }

}
