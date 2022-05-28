package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstCodeValue;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_CODE_VALUE照会
 *
 * @author emarfkrow
 */
public class MstCodeValueGetAction extends BaseAction {

    /** MST_CODE_VALUE照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object codeNm = postJson.get("codeNm");
        if (codeNm == null) {
            codeNm = postJson.get("MstCodeValue.codeNm");
        }
        if (codeNm == null) {
            return map;
        }
        Object codeValue = postJson.get("codeValue");
        if (codeValue == null) {
            codeValue = postJson.get("MstCodeValue.codeValue");
        }
        if (codeValue == null) {
            return map;
        }

        MstCodeValue mstCodeValue = MstCodeValue.get(codeNm, codeValue);
        map.put("MstCodeValue", mstCodeValue);
        return map;
    }

}
