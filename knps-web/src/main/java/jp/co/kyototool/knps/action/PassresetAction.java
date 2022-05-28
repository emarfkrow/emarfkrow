package jp.co.kyototool.knps.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.kyototool.knps.entity.MstEmp;

/**
 * パスワードリセット
 * @author toshiyuki
 *
 */
public class PassresetAction extends BaseAction {

    /**
     * パスワードリセット処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String passwd = postJson.get("passwd").toString();
        String passwd2 = postJson.get("passwd2").toString();
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

        // 有効期限切れ
        if (userId == null) {
            throw new AppError("error.passreset");
        }

        // 該当データなし
        MstEmp mUser = MstEmp.get(userId);
        if (mUser == null) {
            throw new AppError("error.passreset.user");
        }

        mUser.setPassword(StringUtil.hash(passwd));
        if (mUser.update(now, id) != 1) {
            throw new AppError("error.cant.update");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.update"));
        return map;
    }

}
