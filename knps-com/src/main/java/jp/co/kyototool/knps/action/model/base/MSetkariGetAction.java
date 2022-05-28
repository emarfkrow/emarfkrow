package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSetkari;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * M_SETKARI照会
 *
 * @author emarfkrow
 */
public class MSetkariGetAction extends BaseAction {

    /** M_SETKARI照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object setHinban = postJson.get("setHinban");
        if (setHinban == null) {
            setHinban = postJson.get("MSetkari.setHinban");
        }
        if (setHinban == null) {
            return map;
        }
        Object setKhinban = postJson.get("setKhinban");
        if (setKhinban == null) {
            setKhinban = postJson.get("MSetkari.setKhinban");
        }
        if (setKhinban == null) {
            return map;
        }

        MSetkari mSetkari = MSetkari.get(setHinban, setKhinban);
        mSetkari.referMSetkose();
        map.put("MSetkari", mSetkari);
        return map;
    }

}
