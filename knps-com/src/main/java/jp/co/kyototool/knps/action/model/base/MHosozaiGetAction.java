package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MHosozai;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 包装材マスタ照会
 *
 * @author emarfkrow
 */
public class MHosozaiGetAction extends BaseAction {

    /** 包装材マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object hosoHinban = postJson.get("hosoHinban");
        if (hosoHinban == null) {
            hosoHinban = postJson.get("MHosozai.hosoHinban");
        }
        if (hosoHinban == null) {
            return map;
        }

        MHosozai mHosozai = MHosozai.get(hosoHinban);
        map.put("MHosozai", mHosozai);
        return map;
    }

}
