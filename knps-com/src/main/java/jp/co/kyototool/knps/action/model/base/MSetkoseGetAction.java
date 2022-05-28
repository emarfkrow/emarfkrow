package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSetkose;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * M_SETKOSE照会
 *
 * @author emarfkrow
 */
public class MSetkoseGetAction extends BaseAction {

    /** M_SETKOSE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object setHinban = postJson.get("setHinban");
        if (setHinban == null) {
            setHinban = postJson.get("MSetkose.setHinban");
        }
        if (setHinban == null) {
            return map;
        }
        Object setKhinban = postJson.get("setKhinban");
        if (setKhinban == null) {
            setKhinban = postJson.get("MSetkose.setKhinban");
        }
        if (setKhinban == null) {
            return map;
        }

        MSetkose mSetkose = MSetkose.get(setHinban, setKhinban);
        map.put("MSetkose", mSetkose);
        return map;
    }

}
