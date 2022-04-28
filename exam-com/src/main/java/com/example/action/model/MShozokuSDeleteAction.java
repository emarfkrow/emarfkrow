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
 * 所属マスタ一覧削除
 *
 * @author emarfkrow
 */
public class MShozokuSDeleteAction extends BaseAction {

    /** 所属マスタ一覧削除処理 */
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

            // 主キーが不足していたらエラー
            if (StringUtil.isNullOrBlank(gridRow.get("BUSHO_ID"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (StringUtil.isNullOrBlank(gridRow.get("SHOKUI_ID"))) {
                throw new OptLockError("error.cant.delete");
            }
            if (StringUtil.isNullOrBlank(gridRow.get("USER_ID"))) {
                throw new OptLockError("error.cant.delete");
            }

            MShozoku e = FormValidator.toBean(MShozoku.class.getName(), gridRow);
            if (e.delete() != 1) {
                throw new OptLockError("error.cant.delete");
            }
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
