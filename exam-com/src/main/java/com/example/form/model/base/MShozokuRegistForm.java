package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 所属マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MShozokuRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MShozokuRegistForm.class);

    /** 部署ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String bushoId;

    /**
     * @return 部署ID
     */
    public String getBushoId() {
        return bushoId;
    }

    /**
     * @param p 部署ID
     */
    public void setBushoId(final String p) {
        this.bushoId = p;
    }

    /** 職位ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String shokuiId;

    /**
     * @return 職位ID
     */
    public String getShokuiId() {
        return shokuiId;
    }

    /**
     * @param p 職位ID
     */
    public void setShokuiId(final String p) {
        this.shokuiId = p;
    }

    /** ユーザID */
    @jakarta.validation.constraints.Size(max = 10)
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

    /** 開始日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String kaishiYmd;

    /**
     * @return 開始日
     */
    public String getKaishiYmd() {
        return kaishiYmd;
    }

    /**
     * @param p 開始日
     */
    public void setKaishiYmd(final String p) {
        this.kaishiYmd = p;
    }

    /** 終了日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String shuryoYmd;

    /**
     * @return 終了日
     */
    public String getShuryoYmd() {
        return shuryoYmd;
    }

    /**
     * @param p 終了日
     */
    public void setShuryoYmd(final String p) {
        this.shuryoYmd = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
