package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHososet;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 包装材構成マスタ照会
 *
 * @author emarfkrow
 */
public class MHososetGetAction extends BaseAction {

    /** 包装材構成マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MHososet.hhinban");
        }
        if (hhinban == null) {
            return map;
        }
        Object hosoHinban = postJson.get("hosoHinban");
        if (hosoHinban == null) {
            hosoHinban = postJson.get("MHososet.hosoHinban");
        }
        if (hosoHinban == null) {
            return map;
        }

        MHososet mHososet = MHososet.get(hhinban, hosoHinban);
        map.put("MHososet", mHososet);
        return map;
    }

}
