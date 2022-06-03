package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 為替レートマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MRateRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MRateRegistForm.class);

    /** 年 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return 年
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p 年
     */
    public void setYy(final String p) {
        this.yy = p;
    }

    /** 月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String mm;

    /**
     * @return 月
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param p 月
     */
    public void setMm(final String p) {
        this.mm = p;
    }

    /** 日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String dd;

    /**
     * @return 日
     */
    public String getDd() {
        return dd;
    }

    /**
     * @param p 日
     */
    public void setDd(final String p) {
        this.dd = p;
    }

    /** 通貨 */
    @jakarta.validation.constraints.Size(max = 3)
    private String tuuka;

    /**
     * @return 通貨
     */
    public String getTuuka() {
        return tuuka;
    }

    /**
     * @param p 通貨
     */
    public void setTuuka(final String p) {
        this.tuuka = p;
    }

    /** 中値 */
    @jakarta.validation.constraints.Size(max = 5)
    private String ttm;

    /**
     * @return 中値
     */
    public String getTtm() {
        return ttm;
    }

    /**
     * @param p 中値
     */
    public void setTtm(final String p) {
        this.ttm = p;
    }

    /** 売相場 */
    @jakarta.validation.constraints.Size(max = 5)
    private String tts;

    /**
     * @return 売相場
     */
    public String getTts() {
        return tts;
    }

    /**
     * @param p 売相場
     */
    public void setTts(final String p) {
        this.tts = p;
    }

    /** 買相場 */
    @jakarta.validation.constraints.Size(max = 5)
    private String ttb;

    /**
     * @return 買相場
     */
    public String getTtb() {
        return ttb;
    }

    /**
     * @param p 買相場
     */
    public void setTtb(final String p) {
        this.ttb = p;
    }

    /** 売相場－公表レート */
    @jakarta.validation.constraints.Size(max = 5)
    private String ttsOrg;

    /**
     * @return 売相場－公表レート
     */
    public String getTtsOrg() {
        return ttsOrg;
    }

    /**
     * @param p 売相場－公表レート
     */
    public void setTtsOrg(final String p) {
        this.ttsOrg = p;
    }

    /** 買相場－公表レート */
    @jakarta.validation.constraints.Size(max = 5)
    private String ttbOrg;

    /**
     * @return 買相場－公表レート
     */
    public String getTtbOrg() {
        return ttbOrg;
    }

    /**
     * @param p 買相場－公表レート
     */
    public void setTtbOrg(final String p) {
        this.ttbOrg = p;
    }

    /** 最終更新日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String lstymd;

    /**
     * @return 最終更新日
     */
    public String getLstymd() {
        return lstymd;
    }

    /**
     * @param p 最終更新日
     */
    public void setLstymd(final String p) {
        this.lstymd = p;
    }

    /** 最終更新時間 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lsthm;

    /**
     * @return 最終更新時間
     */
    public String getLsthm() {
        return lsthm;
    }

    /**
     * @param p 最終更新時間
     */
    public void setLsthm(final String p) {
        this.lsthm = p;
    }

    /** 更新日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String upddate;

    /**
     * @return 更新日
     */
    public String getUpddate() {
        return upddate;
    }

    /**
     * @param p 更新日
     */
    public void setUpddate(final String p) {
        this.upddate = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
