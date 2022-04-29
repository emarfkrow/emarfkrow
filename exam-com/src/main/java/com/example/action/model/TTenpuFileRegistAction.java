package com.example.action.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.TTenpuFile;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 添付ファイル登録
 *
 * @author emarfkrow
 */
public class TTenpuFileRegistAction extends BaseAction {

    /** 添付ファイル登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        TTenpuFile e = FormValidator.toBean(TTenpuFile.class.getName(), postJson);

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
        if (StringUtil.isNullOrBlank(e.getTenpuFileSn())) {
            isNew = true;
        }

        if (isNew) {

            if (e.insert(now, id) != 1) {
                throw new OptLockError("error.cant.insert");
            }

            map.put("INFO", Messages.get("info.insert"));

        } else {

            if (e.update(now, id) == 1) {
                map.put("INFO", Messages.get("info.update"));
            } else if (e.insert(now, id) == 1) {
                map.put("INFO", Messages.get("info.insert"));
            } else {
                throw new OptLockError("error.cant.update");
            }
        }

        return map;
    }

}
