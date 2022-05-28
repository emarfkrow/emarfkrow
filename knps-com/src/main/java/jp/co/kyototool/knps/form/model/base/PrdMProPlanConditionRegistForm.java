package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_PRO_PLAN_CONDITION登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMProPlanConditionRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMProPlanConditionRegistForm.class);

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

    /** PRD_Y_PRO_PLAN_CONDITION */
    @jakarta.validation.Valid
    private PrdYProPlanConditionRegistForm prdYProPlanConditionRegistForm;

    /**
     * @return PrdYProPlanConditionRegistForm
     */
    public PrdYProPlanConditionRegistForm getPrdYProPlanConditionRegistForm() {
        return prdYProPlanConditionRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdYProPlanConditionRegistForm(final PrdYProPlanConditionRegistForm p) {
        this.prdYProPlanConditionRegistForm = p;
    }

    /** MFG_OBSERVANCE_RATE_IN */
    @jakarta.validation.Valid
    private List<MfgObservanceRateInRegistForm> mfgObservanceRateInGrid;

    /**
     * @return MFG_OBSERVANCE_RATE_IN
     */
    public List<MfgObservanceRateInRegistForm> getMfgObservanceRateInGrid() {
        return mfgObservanceRateInGrid;
    }

    /**
     * @param p
     */
    public void setMfgObservanceRateInGrid(final List<MfgObservanceRateInRegistForm> p) {
        this.mfgObservanceRateInGrid = p;
    }

    /** PRD_MATE_NES_COUNTS */
    @jakarta.validation.Valid
    private List<PrdMateNesCountsRegistForm> prdMateNesCountsGrid;

    /**
     * @return PRD_MATE_NES_COUNTS
     */
    public List<PrdMateNesCountsRegistForm> getPrdMateNesCountsGrid() {
        return prdMateNesCountsGrid;
    }

    /**
     * @param p
     */
    public void setPrdMateNesCountsGrid(final List<PrdMateNesCountsRegistForm> p) {
        this.prdMateNesCountsGrid = p;
    }

    /** PRD_RACK_MAINTE */
    @jakarta.validation.Valid
    private List<PrdRackMainteRegistForm> prdRackMainteGrid;

    /**
     * @return PRD_RACK_MAINTE
     */
    public List<PrdRackMainteRegistForm> getPrdRackMainteGrid() {
        return prdRackMainteGrid;
    }

    /**
     * @param p
     */
    public void setPrdRackMainteGrid(final List<PrdRackMainteRegistForm> p) {
        this.prdRackMainteGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
