package jp.co.golorp.emarf.form.base;

import java.util.Map;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ログインフォーム
 * @author toshiyuki
 *
 */
public abstract class LoginFormBase implements IForm {

    /***/
    @NotBlank
    @Pattern(regexp = "[ -~]*")
    private String userId;

    /**
     * @return email
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param p
     */
    public void setUserId(final String p) {
        this.userId = p;
    }

    /***/
    @NotBlank
    @Pattern(regexp = "[ -~]*")
    private String passwd;

    /**
     * @return password
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param p
     */
    public void setPasswd(final String p) {
        this.passwd = p;
    }

    /**
     * ログインユーザ名
     */
    private String authnMei;

    /**
     * @return authnMei
     */
    public String getAuthnMei() {
        return authnMei;
    }

    /**
     * @param p
     */
    public void setAuthnMei(final String p) {
        this.authnMei = p;
    }

    /** */
    private String email;

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param p
     */
    public void setEmail(final String p) {
        this.email = p;
    }

    /**
     * 認証情報
     */
    private Map<String, String> authnInfo;

    /**
     * @return authInfo
     */
    public Map<String, String> getAuthnInfo() {
        return authnInfo;
    }

    /**
     * @param p
     */
    public void setAuthnInfo(final Map<String, String> p) {
        this.authnInfo = p;
    }

    /**
     * 認可情報
     */
    private Map<String, Integer> authzInfo;

    /**
     * @return authzInfo
     */
    public Map<String, Integer> getAuthzInfo() {
        return authzInfo;
    }

    /**
     * @param p
     */
    public void setAuthzInfo(final Map<String, Integer> p) {
        this.authzInfo = p;
    }

    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        // TODO 自動生成されたメソッド・スタブ
    }

    /**
     * @param requestUri
     * @return String エラーID
     */
    public abstract String getAuthZ(String requestUri);

}
