package com.example.form;

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
public class LoginForm implements IForm {

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

    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        // TODO 自動生成されたメソッド・スタブ

    }

}
