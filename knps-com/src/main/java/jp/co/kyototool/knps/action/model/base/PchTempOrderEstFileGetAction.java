package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.PchTempOrderEstFile;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * PCH_TEMP_ORDER_EST_FILE照会
 *
 * @author emarfkrow
 */
public class PchTempOrderEstFileGetAction extends BaseAction {

    /** PCH_TEMP_ORDER_EST_FILE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object tempOrderNo = postJson.get("tempOrderNo");
        if (tempOrderNo == null) {
            tempOrderNo = postJson.get("PchTempOrderEstFile.tempOrderNo");
        }
        if (tempOrderNo == null) {
            return map;
        }
        Object estFileSeq = postJson.get("estFileSeq");
        if (estFileSeq == null) {
            estFileSeq = postJson.get("PchTempOrderEstFile.estFileSeq");
        }
        if (estFileSeq == null) {
            return map;
        }

        PchTempOrderEstFile pchTempOrderEstFile = PchTempOrderEstFile.get(tempOrderNo, estFileSeq);
        map.put("PchTempOrderEstFile", pchTempOrderEstFile);
        return map;
    }

}
