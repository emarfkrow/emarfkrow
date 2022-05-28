package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstAntenna;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_ANTENNA照会
 *
 * @author emarfkrow
 */
public class MstAntennaGetAction extends BaseAction {

    /** MST_ANTENNA照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object readerNo = postJson.get("readerNo");
        if (readerNo == null) {
            readerNo = postJson.get("MstAntenna.readerNo");
        }
        if (readerNo == null) {
            return map;
        }
        Object antennaNo = postJson.get("antennaNo");
        if (antennaNo == null) {
            antennaNo = postJson.get("MstAntenna.antennaNo");
        }
        if (antennaNo == null) {
            return map;
        }

        MstAntenna mstAntenna = MstAntenna.get(readerNo, antennaNo);
        map.put("MstAntenna", mstAntenna);
        return map;
    }

}
