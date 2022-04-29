package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TTenpuFile;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 添付ファイル照会
 *
 * @author emarfkrow
 */
public class TTenpuFileGetAction extends BaseAction {

    /** 添付ファイル照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("TTenpuFile.sosenId");
        }
        if (sosenId == null) {
            return map;
        }
        Object oyaSn = postJson.get("oyaSn");
        if (oyaSn == null) {
            oyaSn = postJson.get("TTenpuFile.oyaSn");
        }
        if (oyaSn == null) {
            return map;
        }
        Object entitySn = postJson.get("entitySn");
        if (entitySn == null) {
            entitySn = postJson.get("TTenpuFile.entitySn");
        }
        if (entitySn == null) {
            return map;
        }
        Object tenpuFileSn = postJson.get("tenpuFileSn");
        if (tenpuFileSn == null) {
            tenpuFileSn = postJson.get("TTenpuFile.tenpuFileSn");
        }
        if (tenpuFileSn == null) {
            return map;
        }

        TTenpuFile tTenpuFile = TTenpuFile.get(sosenId, oyaSn, entitySn, tenpuFileSn);
        map.put("TTenpuFile", tTenpuFile);
        return map;
    }

}
