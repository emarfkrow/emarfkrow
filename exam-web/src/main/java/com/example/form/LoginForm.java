package com.example.form;

import java.util.Map;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class LoginForm implements IForm {

    /***/
    @NotBlank
    @Pattern(regexp = "[ -~]+")
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

    /***/
    @NotBlank
    @Pattern(regexp = "[ -~]+")
    private String password;

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param p
     */
    public void setPassword(final String p) {
        this.password = p;
    }

    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        // TODO 自動生成されたメソッド・スタブ

    }

}
