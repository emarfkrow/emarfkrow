package jp.co.golorp.emarf.action.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.util.Messages;

/**
 * パスワードリセット
 * @author toshiyuki
 *
 */
public abstract class PassresetActionBase extends BaseAction {

    /**
     * パスワードリセット処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String passwd = postJson.get("passwd").toString();
        String passwd2 = postJson.get("passwd2").toString();

        //確認パスワード違い
        if (!passwd.equals(passwd2)) {
            throw new AppError("error.passreset.passwd2");
        }

        String hash = null;
        if (postJson.get("hash") != null) {
            hash = postJson.get("hash").toString();
        }

        String userId = null;
        if (hash != null) {
            if (this.getSession().getAttribute(hash) != null) {
                userId = this.getSession().getAttribute(hash).toString();
            }
        }

        // セッション切れ
        if (userId == null) {
            throw new AppError("error.passreset");
        }

        if (!resetPassword(now, id, passwd, userId)) {
            throw new AppError("error.cant.update");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.update"));
        return map;
    }

    /**
     * @param now
     * @param id
     * @param passwd
     * @param userId
     * @return boolean
     */
    protected abstract boolean resetPassword(LocalDateTime now, String id, String passwd, String userId);

}
