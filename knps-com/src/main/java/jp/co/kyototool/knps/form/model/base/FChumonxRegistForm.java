package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * F_CHUMONX登録フォーム
 *
 * @author emarfkrow
 */
public class FChumonxRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FChumonxRegistForm.class);

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

    /** SHUKKASU-RUI */
    @jakarta.validation.constraints.Size(max = 7)
    private String shukkasuRui;

    /**
     * @return SHUKKASU-RUI
     */
    public String getShukkasuRui() {
        return shukkasuRui;
    }

    /**
     * @param p SHUKKASU-RUI
     */
    public void setShukkasuRui(final String p) {
        this.shukkasuRui = p;
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

    /** F_JUCHUM */
    @jakarta.validation.Valid
    private FJuchumRegistForm fJuchumRegistForm;

    /**
     * @return FJuchumRegistForm
     */
    public FJuchumRegistForm getFJuchumRegistForm() {
        return fJuchumRegistForm;
    }

    /**
     * @param p
     */
    public void setFJuchumRegistForm(final FJuchumRegistForm p) {
        this.fJuchumRegistForm = p;
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
