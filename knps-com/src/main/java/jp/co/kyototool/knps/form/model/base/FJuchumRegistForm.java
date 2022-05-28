package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * F_JUCHUM登録フォーム
 *
 * @author emarfkrow
 */
public class FJuchumRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FJuchumRegistForm.class);

    /** TOKUCD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String tokucd;

    /**
     * @return TOKUCD
     */
    public String getTokucd() {
        return tokucd;
    }

    /**
     * @param p TOKUCD
     */
    public void setTokucd(final String p) {
        this.tokucd = p;
    }

    /** CHOKUCD */
    @jakarta.validation.constraints.Size(max = 8)
    private String chokucd;

    /**
     * @return CHOKUCD
     */
    public String getChokucd() {
        return chokucd;
    }

    /**
     * @param p CHOKUCD
     */
    public void setChokucd(final String p) {
        this.chokucd = p;
    }

    /** HHINBAN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String hhinban;

    /**
     * @return HHINBAN
     */
    public String getHhinban() {
        return hhinban;
    }

    /**
     * @param p HHINBAN
     */
    public void setHhinban(final String p) {
        this.hhinban = p;
    }

    /** CHUBAN */
    @jakarta.validation.constraints.Size(max = 10)
    private String chuban;

    /**
     * @return CHUBAN
     */
    public String getChuban() {
        return chuban;
    }

    /**
     * @param p CHUBAN
     */
    public void setChuban(final String p) {
        this.chuban = p;
    }

    /** JUCHUSU */
    @jakarta.validation.constraints.Size(max = 7)
    private String juchusu;

    /**
     * @return JUCHUSU
     */
    public String getJuchusu() {
        return juchusu;
    }

    /**
     * @param p JUCHUSU
     */
    public void setJuchusu(final String p) {
        this.juchusu = p;
    }

    /** JUCHUNO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 16)
    private String juchuno;

    /**
     * @return JUCHUNO
     */
    public String getJuchuno() {
        return juchuno;
    }

    /**
     * @param p JUCHUNO
     */
    public void setJuchuno(final String p) {
        this.juchuno = p;
    }

    /** F_JUCHUZ */
    @jakarta.validation.Valid
    private FJuchuzRegistForm fJuchuzRegistForm;

    /**
     * @return FJuchuzRegistForm
     */
    public FJuchuzRegistForm getFJuchuzRegistForm() {
        return fJuchuzRegistForm;
    }

    /**
     * @param p
     */
    public void setFJuchuzRegistForm(final FJuchuzRegistForm p) {
        this.fJuchuzRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
