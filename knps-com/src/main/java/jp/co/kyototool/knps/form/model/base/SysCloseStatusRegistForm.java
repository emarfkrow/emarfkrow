package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * SYS_CLOSE_STATUS登録フォーム
 *
 * @author emarfkrow
 */
public class SysCloseStatusRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(SysCloseStatusRegistForm.class);

    /** REC_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String recNo;

    /**
     * @return REC_NO
     */
    public String getRecNo() {
        return recNo;
    }

    /**
     * @param p REC_NO
     */
    public void setRecNo(final String p) {
        this.recNo = p;
    }

    /** DAIRY_CLOSE_TARGET_DATE */
    @jakarta.validation.constraints.Size(max = 8)
    private String dairyCloseTargetDate;

    /**
     * @return DAIRY_CLOSE_TARGET_DATE
     */
    public String getDairyCloseTargetDate() {
        return dairyCloseTargetDate;
    }

    /**
     * @param p DAIRY_CLOSE_TARGET_DATE
     */
    public void setDairyCloseTargetDate(final String p) {
        this.dairyCloseTargetDate = p;
    }

    /** DAIRY_CLOSE_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String dairyCloseStatus;

    /**
     * @return DAIRY_CLOSE_STATUS
     */
    public String getDairyCloseStatus() {
        return dairyCloseStatus;
    }

    /**
     * @param p DAIRY_CLOSE_STATUS
     */
    public void setDairyCloseStatus(final String p) {
        this.dairyCloseStatus = p;
    }

    /** DAIRY_CLOSE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String dairyCloseDate;

    /**
     * @return DAIRY_CLOSE_DATE
     */
    public String getDairyCloseDate() {
        return dairyCloseDate;
    }

    /**
     * @param p DAIRY_CLOSE_DATE
     */
    public void setDairyCloseDate(final String p) {
        this.dairyCloseDate = p;
    }

    /** MONTHRY_CLOSE_TARGET_DATE */
    @jakarta.validation.constraints.Size(max = 6)
    private String monthryCloseTargetDate;

    /**
     * @return MONTHRY_CLOSE_TARGET_DATE
     */
    public String getMonthryCloseTargetDate() {
        return monthryCloseTargetDate;
    }

    /**
     * @param p MONTHRY_CLOSE_TARGET_DATE
     */
    public void setMonthryCloseTargetDate(final String p) {
        this.monthryCloseTargetDate = p;
    }

    /** MONTHRY_CLOSE_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String monthryCloseStatus;

    /**
     * @return MONTHRY_CLOSE_STATUS
     */
    public String getMonthryCloseStatus() {
        return monthryCloseStatus;
    }

    /**
     * @param p MONTHRY_CLOSE_STATUS
     */
    public void setMonthryCloseStatus(final String p) {
        this.monthryCloseStatus = p;
    }

    /** MONTHRY_CLOSE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String monthryCloseDate;

    /**
     * @return MONTHRY_CLOSE_DATE
     */
    public String getMonthryCloseDate() {
        return monthryCloseDate;
    }

    /**
     * @param p MONTHRY_CLOSE_DATE
     */
    public void setMonthryCloseDate(final String p) {
        this.monthryCloseDate = p;
    }

    /** MONTHRY_SETTLE_TARGET_DATE */
    @jakarta.validation.constraints.Size(max = 6)
    private String monthrySettleTargetDate;

    /**
     * @return MONTHRY_SETTLE_TARGET_DATE
     */
    public String getMonthrySettleTargetDate() {
        return monthrySettleTargetDate;
    }

    /**
     * @param p MONTHRY_SETTLE_TARGET_DATE
     */
    public void setMonthrySettleTargetDate(final String p) {
        this.monthrySettleTargetDate = p;
    }

    /** MONTHRY_SETTLE_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String monthrySettleStatus;

    /**
     * @return MONTHRY_SETTLE_STATUS
     */
    public String getMonthrySettleStatus() {
        return monthrySettleStatus;
    }

    /**
     * @param p MONTHRY_SETTLE_STATUS
     */
    public void setMonthrySettleStatus(final String p) {
        this.monthrySettleStatus = p;
    }

    /** MONTHRY_SETTLE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String monthrySettleDate;

    /**
     * @return MONTHRY_SETTLE_DATE
     */
    public String getMonthrySettleDate() {
        return monthrySettleDate;
    }

    /**
     * @param p MONTHRY_SETTLE_DATE
     */
    public void setMonthrySettleDate(final String p) {
        this.monthrySettleDate = p;
    }

    /** MONTHRY_SETTLE_COST_FIXED */
    @jakarta.validation.constraints.Size(max = 1)
    private String monthrySettleCostFixed;

    /**
     * @return MONTHRY_SETTLE_COST_FIXED
     */
    public String getMonthrySettleCostFixed() {
        return monthrySettleCostFixed;
    }

    /**
     * @param p MONTHRY_SETTLE_COST_FIXED
     */
    public void setMonthrySettleCostFixed(final String p) {
        this.monthrySettleCostFixed = p;
    }

    /** ANNUAL_SETTLE_TARGET_DATE */
    @jakarta.validation.constraints.Size(max = 4)
    private String annualSettleTargetDate;

    /**
     * @return ANNUAL_SETTLE_TARGET_DATE
     */
    public String getAnnualSettleTargetDate() {
        return annualSettleTargetDate;
    }

    /**
     * @param p ANNUAL_SETTLE_TARGET_DATE
     */
    public void setAnnualSettleTargetDate(final String p) {
        this.annualSettleTargetDate = p;
    }

    /** ANNUAL_SETTLE_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String annualSettleStatus;

    /**
     * @return ANNUAL_SETTLE_STATUS
     */
    public String getAnnualSettleStatus() {
        return annualSettleStatus;
    }

    /**
     * @param p ANNUAL_SETTLE_STATUS
     */
    public void setAnnualSettleStatus(final String p) {
        this.annualSettleStatus = p;
    }

    /** ANNUAL_SETTLE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String annualSettleDate;

    /**
     * @return ANNUAL_SETTLE_DATE
     */
    public String getAnnualSettleDate() {
        return annualSettleDate;
    }

    /**
     * @param p ANNUAL_SETTLE_DATE
     */
    public void setAnnualSettleDate(final String p) {
        this.annualSettleDate = p;
    }

    /** ANNUAL_SETTLE_COST_FIXED */
    @jakarta.validation.constraints.Size(max = 1)
    private String annualSettleCostFixed;

    /**
     * @return ANNUAL_SETTLE_COST_FIXED
     */
    public String getAnnualSettleCostFixed() {
        return annualSettleCostFixed;
    }

    /**
     * @param p ANNUAL_SETTLE_COST_FIXED
     */
    public void setAnnualSettleCostFixed(final String p) {
        this.annualSettleCostFixed = p;
    }

    /** MASTER_COPY_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String masterCopyFlag;

    /**
     * @return MASTER_COPY_FLAG
     */
    public String getMasterCopyFlag() {
        return masterCopyFlag;
    }

    /**
     * @param p MASTER_COPY_FLAG
     */
    public void setMasterCopyFlag(final String p) {
        this.masterCopyFlag = p;
    }

    /** MASTER_COPY_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String masterCopyDate;

    /**
     * @return MASTER_COPY_DATE
     */
    public String getMasterCopyDate() {
        return masterCopyDate;
    }

    /**
     * @param p MASTER_COPY_DATE
     */
    public void setMasterCopyDate(final String p) {
        this.masterCopyDate = p;
    }

    /** QUARTER_SETTLE_TARGET_DATE */
    @jakarta.validation.constraints.Size(max = 6)
    private String quarterSettleTargetDate;

    /**
     * @return QUARTER_SETTLE_TARGET_DATE
     */
    public String getQuarterSettleTargetDate() {
        return quarterSettleTargetDate;
    }

    /**
     * @param p QUARTER_SETTLE_TARGET_DATE
     */
    public void setQuarterSettleTargetDate(final String p) {
        this.quarterSettleTargetDate = p;
    }

    /** QUARTER_SETTLE_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String quarterSettleStatus;

    /**
     * @return QUARTER_SETTLE_STATUS
     */
    public String getQuarterSettleStatus() {
        return quarterSettleStatus;
    }

    /**
     * @param p QUARTER_SETTLE_STATUS
     */
    public void setQuarterSettleStatus(final String p) {
        this.quarterSettleStatus = p;
    }

    /** QUARTER_SETTLE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String quarterSettleDate;

    /**
     * @return QUARTER_SETTLE_DATE
     */
    public String getQuarterSettleDate() {
        return quarterSettleDate;
    }

    /**
     * @param p QUARTER_SETTLE_DATE
     */
    public void setQuarterSettleDate(final String p) {
        this.quarterSettleDate = p;
    }

    /** QUARTER_SETTLE_COST_FIXED */
    @jakarta.validation.constraints.Size(max = 1)
    private String quarterSettleCostFixed;

    /**
     * @return QUARTER_SETTLE_COST_FIXED
     */
    public String getQuarterSettleCostFixed() {
        return quarterSettleCostFixed;
    }

    /**
     * @param p QUARTER_SETTLE_COST_FIXED
     */
    public void setQuarterSettleCostFixed(final String p) {
        this.quarterSettleCostFixed = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
