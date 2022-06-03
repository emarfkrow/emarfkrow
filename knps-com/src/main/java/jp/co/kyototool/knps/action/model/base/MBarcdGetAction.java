package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MBarcd;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * バーコードマスタ照会
 *
 * @author emarfkrow
 */
public class MBarcdGetAction extends BaseAction {

    /** バーコードマスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MBarcd.hhinban");
        }
        if (hhinban == null) {
            return map;
        }

        MBarcd mBarcd = MBarcd.get(hhinban);
        mBarcd.referMGenka();
        mBarcd.referMHhinmok();
        mBarcd.referMNtanka();
        mBarcd.referMSgenka();
        mBarcd.referMSkhin();
        mBarcd.referMTanka();
        mBarcd.referMWebkan();
        mBarcd.referMHososets();
        mBarcd.referMPkoses();
        map.put("MBarcd", mBarcd);
        return map;
    }

}
