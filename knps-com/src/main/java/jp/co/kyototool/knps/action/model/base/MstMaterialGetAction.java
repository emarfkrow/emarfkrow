package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.MstMaterial;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * MST_MATERIAL照会
 *
 * @author emarfkrow
 */
public class MstMaterialGetAction extends BaseAction {

    /** MST_MATERIAL照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object material = postJson.get("material");
        if (material == null) {
            material = postJson.get("MstMaterial.material");
        }
        if (material == null) {
            return map;
        }

        MstMaterial mstMaterial = MstMaterial.get(material);
        map.put("MstMaterial", mstMaterial);
        return map;
    }

}
