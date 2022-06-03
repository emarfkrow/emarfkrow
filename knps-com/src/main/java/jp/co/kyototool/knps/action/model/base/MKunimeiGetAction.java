package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MKunimei;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 国名マスタ照会
 *
 * @author emarfkrow
 */
public class MKunimeiGetAction extends BaseAction {

    /** 国名マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kokusaicd = postJson.get("kokusaicd");
        if (kokusaicd == null) {
            kokusaicd = postJson.get("MKunimei.kokusaicd");
        }
        if (kokusaicd == null) {
            return map;
        }
        Object kunicd = postJson.get("kunicd");
        if (kunicd == null) {
            kunicd = postJson.get("MKunimei.kunicd");
        }
        if (kunicd == null) {
            return map;
        }

        MKunimei mKunimei = MKunimei.get(kokusaicd, kunicd);
        map.put("MKunimei", mKunimei);
        return map;
    }

}
