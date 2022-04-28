package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ユーザマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MUserRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MUserRegistForm.class);

    /** ユーザID */
    @Size(max = 10)
    private String userId;

    /**
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param p ユーザID
     */
    public void setUserId(final String p) {
        this.userId = p;
    }

    /** ユーザ姓 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String userSei;

    /**
     * @return ユーザ姓
     */
    public String getUserSei() {
        return userSei;
    }

    /**
     * @param p ユーザ姓
     */
    public void setUserSei(final String p) {
        this.userSei = p;
    }

    /** ユーザ名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String userMei;

    /**
     * @return ユーザ名
     */
    public String getUserMei() {
        return userMei;
    }

    /**
     * @param p ユーザ名
     */
    public void setUserMei(final String p) {
        this.userMei = p;
    }

    /** メールアドレス */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 200)
    private String email;

    /**
     * @return メールアドレス
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param p メールアドレス
     */
    public void setEmail(final String p) {
        this.email = p;
    }

    /** パスワード */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 200)
    private String password;

    /**
     * @return パスワード
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param p パスワード
     */
    public void setPassword(final String p) {
        this.password = p;
    }

    /** 削除フラグ */
    @Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /**
     * 関連チェック
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
