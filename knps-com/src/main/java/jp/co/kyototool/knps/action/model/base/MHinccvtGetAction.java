package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHinccvt;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 品番変換マスタ照会
 *
 * @author emarfkrow
 */
public class MHinccvtGetAction extends BaseAction {

    /** 品番変換マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object cvthinban = postJson.get("cvthinban");
        if (cvthinban == null) {
            cvthinban = postJson.get("MHinccvt.cvthinban");
        }
        if (cvthinban == null) {
            return map;
        }
        Object chokuhinkbn = postJson.get("chokuhinkbn");
        if (chokuhinkbn == null) {
            chokuhinkbn = postJson.get("MHinccvt.chokuhinkbn");
        }
        if (chokuhinkbn == null) {
            return map;
        }

        MHinccvt mHinccvt = MHinccvt.get(cvthinban, chokuhinkbn);
        map.put("MHinccvt", mHinccvt);
        return map;
    }

}
