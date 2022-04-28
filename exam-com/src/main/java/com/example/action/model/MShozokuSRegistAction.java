package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MShozoku;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 所属マスタ一覧登録
 *
 * @author emarfkrow
 */
public class MShozokuSRegistAction extends BaseAction {

    /** 所属マスタ一覧登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MShozokuGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            MShozoku e = FormValidator.toBean(MShozoku.class.getName(), gridRow);

            // 主キーが不足していたらINSERT
            boolean isNew = false;
            if (StringUtil.isNullOrBlank(e.getBushoId())) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(e.getShokuiId())) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(e.getUserId())) {
                isNew = true;
            }

            if (isNew) {

                if (e.insert(now, id) != 1) {
                    throw new OptLockError("error.cant.insert");
                }

            } else {

                if (e.update(now, id) != 1) {
                    throw new OptLockError("error.cant.update");
                }
            }
        }

        map.put("INFO", Messages.get("info.regist"));
        return map;
    }

}
