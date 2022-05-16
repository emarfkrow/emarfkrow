package com.example.form;

import java.util.Map;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class PassmailForm implements IForm {

    /***/
    @NotBlank
    @Email
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

    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        // TODO 自動生成されたメソッド・スタブ

    }

}
