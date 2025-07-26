package jp.co.golorp.emarf.action.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.form.LoginForm;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.servlet.LoginFilter;

/**
 * ログイン
 * @author toshiyuki
 *
 */
public abstract class LoginActionBase extends BaseAction {

    /** パスワードのハッシュアルゴリズム */
    private static final String HASH = App.get("loginfilter.hash");

    /**
     * ログイン処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        //login.htmlからのpost値
        String userId = postJson.get("userId").toString();
        String passwd = postJson.get("passwd").toString();

        //ユーザマスタからログインフォームを生成
        LoginForm loginForm = this.getLoginForm(userId);

        //該当ユーザなしエラー
        if (loginForm == null) {
            throw new AppError("error.login");
        }

        //ハッシュ値を指定済みならハッシュ
        if (!StringUtil.isNullOrWhiteSpace(HASH)) {
            passwd = StringUtil.hash(passwd);
        }

        //パスワード不一致エラー
        if (!passwd.equals(loginForm.getPasswd())) {
            throw new AppError("error.login");
        }

        //権限情報取得
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put(LoginFilter.AUTHN_KEY, userId);
        ret.put(LoginFilter.AUTHN_MEI, loginForm.getAuthnMei());
        ret.put(LoginFilter.AUTHN_INFO, loginForm.getAuthnInfo());
        ret.put(LoginFilter.AUTHZ_INFO, loginForm.getAuthzInfo());

        return ret;
    }

    /**
     * @param userId
     * @return LoginForm
     */
    protected abstract LoginForm getLoginForm(String userId);

}
