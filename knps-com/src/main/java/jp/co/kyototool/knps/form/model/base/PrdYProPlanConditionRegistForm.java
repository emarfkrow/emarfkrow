package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_Y_PRO_PLAN_CONDITION登録フォーム
 *
 * @author emarfkrow
 */
public class PrdYProPlanConditionRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdYProPlanConditionRegistForm.class);

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

    /** OPE_DAYS */
    @jakarta.validation.constraints.Size(max = 2)
    private String opeDays;

    /**
     * @return OPE_DAYS
     */
    public String getOpeDays() {
        return opeDays;
    }

    /**
     * @param p OPE_DAYS
     */
    public void setOpeDays(final String p) {
        this.opeDays = p;
    }

    /** FIXED_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String fixedStatus;

    /**
     * @return FIXED_STATUS
     */
    public String getFixedStatus() {
        return fixedStatus;
    }

    /**
     * @param p FIXED_STATUS
     */
    public void setFixedStatus(final String p) {
        this.fixedStatus = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
