package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.TKo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子一覧登録
 *
 * @author emarfkrow
 */
public class TKoSRegistAction extends BaseAction {

    /** 子一覧登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("TKoGrid");

        if (gridData.size() == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        for (Map<String, Object> gridRow : gridData) {

            TKo e = FormValidator.toBean(TKo.class.getName(), gridRow);

            // 主キーが不足していたらINSERT
            boolean isNew = false;
            if (StringUtil.isNullOrBlank(e.getSosenId())) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(e.getOyaSn())) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(e.getEntitySn())) {
                isNew = true;
            }
            if (StringUtil.isNullOrBlank(e.getKoSn())) {
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
