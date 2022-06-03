package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MKtanka;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 契約単価マスタ照会
 *
 * @author emarfkrow
 */
public class MKtankaGetAction extends BaseAction {

    /** 契約単価マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object honshacd = postJson.get("honshacd");
        if (honshacd == null) {
            honshacd = postJson.get("MKtanka.honshacd");
        }
        if (honshacd == null) {
            return map;
        }
        Object shagaiHinban = postJson.get("shagaiHinban");
        if (shagaiHinban == null) {
            shagaiHinban = postJson.get("MKtanka.shagaiHinban");
        }
        if (shagaiHinban == null) {
            return map;
        }

        MKtanka mKtanka = MKtanka.get(honshacd, shagaiHinban);
        map.put("MKtanka", mKtanka);
        return map;
    }

}
