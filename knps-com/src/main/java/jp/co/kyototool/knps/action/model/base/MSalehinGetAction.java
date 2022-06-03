package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSalehin;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * セール品目マスタ照会
 *
 * @author emarfkrow
 */
public class MSalehinGetAction extends BaseAction {

    /** セール品目マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object salekbn = postJson.get("salekbn");
        if (salekbn == null) {
            salekbn = postJson.get("MSalehin.salekbn");
        }
        if (salekbn == null) {
            return map;
        }
        Object hhinban = postJson.get("hhinban");
        if (hhinban == null) {
            hhinban = postJson.get("MSalehin.hhinban");
        }
        if (hhinban == null) {
            return map;
        }
        Object kaisiYy = postJson.get("kaisiYy");
        if (kaisiYy == null) {
            kaisiYy = postJson.get("MSalehin.kaisiYy");
        }
        if (kaisiYy == null) {
            return map;
        }
        Object kaisiMm = postJson.get("kaisiMm");
        if (kaisiMm == null) {
            kaisiMm = postJson.get("MSalehin.kaisiMm");
        }
        if (kaisiMm == null) {
            return map;
        }
        Object kaisiDd = postJson.get("kaisiDd");
        if (kaisiDd == null) {
            kaisiDd = postJson.get("MSalehin.kaisiDd");
        }
        if (kaisiDd == null) {
            return map;
        }
        Object shuryoYy = postJson.get("shuryoYy");
        if (shuryoYy == null) {
            shuryoYy = postJson.get("MSalehin.shuryoYy");
        }
        if (shuryoYy == null) {
            return map;
        }
        Object shuryoMm = postJson.get("shuryoMm");
        if (shuryoMm == null) {
            shuryoMm = postJson.get("MSalehin.shuryoMm");
        }
        if (shuryoMm == null) {
            return map;
        }
        Object shuryoDd = postJson.get("shuryoDd");
        if (shuryoDd == null) {
            shuryoDd = postJson.get("MSalehin.shuryoDd");
        }
        if (shuryoDd == null) {
            return map;
        }

        MSalehin mSalehin = MSalehin.get(salekbn, hhinban, kaisiYy, kaisiMm, kaisiDd, shuryoYy, shuryoMm, shuryoDd);
        map.put("MSalehin", mSalehin);
        return map;
    }

}
