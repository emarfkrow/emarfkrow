package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MSimuke;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 仕向先マスタ照会
 *
 * @author emarfkrow
 */
public class MSimukeGetAction extends BaseAction {

    /** 仕向先マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object simukecd = postJson.get("simukecd");
        if (simukecd == null) {
            simukecd = postJson.get("MSimuke.simukecd");
        }
        if (simukecd == null) {
            return map;
        }

        MSimuke mSimuke = MSimuke.get(simukecd);
        map.put("MSimuke", mSimuke);
        return map;
    }

}
