package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSkhin;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * ＳＫ品番マスタ照会
 *
 * @author emarfkrow
 */
public class MSkhinGetAction extends BaseAction {

    /** ＳＫ品番マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MSkhin.hhinban");
        }
        if (hhinban == null) {
            return map;
        }

        MSkhin mSkhin = MSkhin.get(hhinban);
        mSkhin.referMBarcd();
        mSkhin.referMGenka();
        mSkhin.referMTanka();
        mSkhin.referMWebkan();
        map.put("MSkhin", mSkhin);
        return map;
    }

}
