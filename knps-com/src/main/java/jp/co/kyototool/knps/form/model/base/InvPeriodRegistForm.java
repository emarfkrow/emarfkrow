package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_PERIOD登録フォーム
 *
 * @author emarfkrow
 */
public class InvPeriodRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvPeriodRegistForm.class);

    /** STOCK_MANAGEMENT_SECTION */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String stockManagementSection;

    /**
     * @return STOCK_MANAGEMENT_SECTION
     */
    public String getStockManagementSection() {
        return stockManagementSection;
    }

    /**
     * @param p STOCK_MANAGEMENT_SECTION
     */
    public void setStockManagementSection(final String p) {
        this.stockManagementSection = p;
    }

    /** INV_PHASE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String invPhase;

    /**
     * @return INV_PHASE
     */
    public String getInvPhase() {
        return invPhase;
    }

    /**
     * @param p INV_PHASE
     */
    public void setInvPhase(final String p) {
        this.invPhase = p;
    }

    /** INV_PHASE_MONTH */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String invPhaseMonth;

    /**
     * @return INV_PHASE_MONTH
     */
    public String getInvPhaseMonth() {
        return invPhaseMonth;
    }

    /**
     * @param p INV_PHASE_MONTH
     */
    public void setInvPhaseMonth(final String p) {
        this.invPhaseMonth = p;
    }

    /** SUB_INV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    public String getSubInvCode() {
        return subInvCode;
    }

    /**
     * @param p SUB_INV_CODE
     */
    public void setSubInvCode(final String p) {
        this.subInvCode = p;
    }

    /** INV_DATE_FROM */
    @jakarta.validation.constraints.Size(max = 7)
    private String invDateFrom;

    /**
     * @return INV_DATE_FROM
     */
    public String getInvDateFrom() {
        return invDateFrom;
    }

    /**
     * @param p INV_DATE_FROM
     */
    public void setInvDateFrom(final String p) {
        this.invDateFrom = p;
    }

    /** INV_DATE_TO */
    @jakarta.validation.constraints.Size(max = 7)
    private String invDateTo;

    /**
     * @return INV_DATE_TO
     */
    public String getInvDateTo() {
        return invDateTo;
    }

    /**
     * @param p INV_DATE_TO
     */
    public void setInvDateTo(final String p) {
        this.invDateTo = p;
    }

    /** INV_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String invStatus;

    /**
     * @return INV_STATUS
     */
    public String getInvStatus() {
        return invStatus;
    }

    /**
     * @param p INV_STATUS
     */
    public void setInvStatus(final String p) {
        this.invStatus = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
