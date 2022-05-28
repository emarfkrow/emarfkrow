package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_RACK_MAINTE登録フォーム
 *
 * @author emarfkrow
 */
public class PrdRackMainteRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdRackMainteRegistForm.class);

    /** YYYY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return yyyy;
    }

    /**
     * @param p YYYY
     */
    public void setYyyy(final String p) {
        this.yyyy = p;
    }

    /** MM */
    @jakarta.validation.constraints.Size(max = 2)
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param p MM
     */
    public void setMm(final String p) {
        this.mm = p;
    }

    /** RACK_NAME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 40)
    private String rackName;

    /**
     * @return RACK_NAME
     */
    public String getRackName() {
        return rackName;
    }

    /**
     * @param p RACK_NAME
     */
    public void setRackName(final String p) {
        this.rackName = p;
    }

    /** RACK_NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 3)
    private String rackNesCounts;

    /**
     * @return RACK_NES_COUNTS
     */
    public String getRackNesCounts() {
        return rackNesCounts;
    }

    /**
     * @param p RACK_NES_COUNTS
     */
    public void setRackNesCounts(final String p) {
        this.rackNesCounts = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
