package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstHinban;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_HINBAN照会
 *
 * @author emarfkrow
 */
public class MstHinbanGetAction extends BaseAction {

    /** MST_HINBAN照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MstHinban.hinban");
        }
        if (hinban == null) {
            return map;
        }

        MstHinban mstHinban = MstHinban.get(hinban);
        mstHinban.referPrdOrderpointStatus();
        mstHinban.referPrdOrderpointSummary();
        mstHinban.referInvPrintWarehousingslips();
        mstHinban.referInvStockStores();
        mstHinban.referMstHinbanBks();
        mstHinban.referMstSupUnitprices();
        map.put("MstHinban", mstHinban);
        return map;
    }

}
