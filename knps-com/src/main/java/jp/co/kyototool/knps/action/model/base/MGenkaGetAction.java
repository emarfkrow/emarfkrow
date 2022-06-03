package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MGenka;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 原価マスタ照会
 *
 * @author emarfkrow
 */
public class MGenkaGetAction extends BaseAction {

    /** 原価マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MGenka.hhinban");
        }
        if (hhinban == null) {
            return map;
        }

        MGenka mGenka = MGenka.get(hhinban);
        mGenka.referMHhinmok();
        mGenka.referMNtanka();
        mGenka.referMSgenka();
        mGenka.referMSkhin();
        mGenka.referMTanka();
        mGenka.referMWebkan();
        map.put("MGenka", mGenka);
        return map;
    }

}
