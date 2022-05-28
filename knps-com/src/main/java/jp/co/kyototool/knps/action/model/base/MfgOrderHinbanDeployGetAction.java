package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MfgOrderHinbanDeploy;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MFG_ORDER_HINBAN_DEPLOY照会
 *
 * @author emarfkrow
 */
public class MfgOrderHinbanDeployGetAction extends BaseAction {

    /** MFG_ORDER_HINBAN_DEPLOY照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object reqid = postJson.get("reqid");
        if (reqid == null) {
            reqid = postJson.get("MfgOrderHinbanDeploy.reqid");
        }
        if (reqid == null) {
            return map;
        }
        Object hinban = postJson.get("hinban");
        if (hinban == null) {
            hinban = postJson.get("MfgOrderHinbanDeploy.hinban");
        }
        if (hinban == null) {
            return map;
        }
        Object deliveryDate = postJson.get("deliveryDate");
        if (deliveryDate == null) {
            deliveryDate = postJson.get("MfgOrderHinbanDeploy.deliveryDate");
        }
        if (deliveryDate == null) {
            return map;
        }

        MfgOrderHinbanDeploy mfgOrderHinbanDeploy = MfgOrderHinbanDeploy.get(reqid, hinban, deliveryDate);
        map.put("MfgOrderHinbanDeploy", mfgOrderHinbanDeploy);
        return map;
    }

}
