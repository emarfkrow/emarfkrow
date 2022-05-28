package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstCode;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_CODE照会
 *
 * @author emarfkrow
 */
public class MstCodeGetAction extends BaseAction {

    /** MST_CODE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object codeNm = postJson.get("codeNm");
        if (codeNm == null) {
            codeNm = postJson.get("MstCode.codeNm");
        }
        if (codeNm == null) {
            return map;
        }

        MstCode mstCode = MstCode.get(codeNm);
        mstCode.referMstCodeValues();
        map.put("MstCode", mstCode);
        return map;
    }

}
