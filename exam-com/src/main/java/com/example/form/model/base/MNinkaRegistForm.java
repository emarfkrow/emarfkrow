package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 認可マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MNinkaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MNinkaRegistForm.class);

    /** 部署ID */
    @Size(max = 10)
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
    @Size(max = 10)
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

    /** 画面名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 20)
    private String gamenNm;

    /**
     * @return 画面名
     */
    public String getGamenNm() {
        return gamenNm;
    }

    /**
     * @param p 画面名
     */
    public void setGamenNm(final String p) {
        this.gamenNm = p;
    }

    /** 権限区分 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 2)
    private String kengenKb;

    /**
     * @return 権限区分
     */
    public String getKengenKb() {
        return kengenKb;
    }

    /**
     * @param p 権限区分
     */
    public void setKengenKb(final String p) {
        this.kengenKb = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
