package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_PRO_PLAN登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyProPlanRegistForm.class);

    /** PLAN_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String planNo;

    /**
     * @return PLAN_NO
     */
    public String getPlanNo() {
        return planNo;
    }

    /**
     * @param p PLAN_NO
     */
    public void setPlanNo(final String p) {
        this.planNo = p;
    }

    /** ARRANGE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String arrangeKbn;

    /**
     * @return ARRANGE_KBN
     */
    public String getArrangeKbn() {
        return arrangeKbn;
    }

    /**
     * @param p ARRANGE_KBN
     */
    public void setArrangeKbn(final String p) {
        this.arrangeKbn = p;
    }

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** DETAIL_PLAN_COUNTS */
    @jakarta.validation.constraints.Size(max = 2)
    private String detailPlanCounts;

    /**
     * @return DETAIL_PLAN_COUNTS
     */
    public String getDetailPlanCounts() {
        return detailPlanCounts;
    }

    /**
     * @param p DETAIL_PLAN_COUNTS
     */
    public void setDetailPlanCounts(final String p) {
        this.detailPlanCounts = p;
    }

    /** PLAN_COMMENT */
    @jakarta.validation.constraints.Size(max = 50)
    private String planComment;

    /**
     * @return PLAN_COMMENT
     */
    public String getPlanComment() {
        return planComment;
    }

    /**
     * @param p PLAN_COMMENT
     */
    public void setPlanComment(final String p) {
        this.planComment = p;
    }

    /** PLAN_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String planStatus;

    /**
     * @return PLAN_STATUS
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * @param p PLAN_STATUS
     */
    public void setPlanStatus(final String p) {
        this.planStatus = p;
    }

    /** PERIOD */
    @jakarta.validation.constraints.Size(max = 7)
    private String period;

    /**
     * @return PERIOD
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @param p PERIOD
     */
    public void setPeriod(final String p) {
        this.period = p;
    }

    /** PERIOD_CHG */
    @jakarta.validation.constraints.Size(max = 7)
    private String periodChg;

    /**
     * @return PERIOD_CHG
     */
    public String getPeriodChg() {
        return periodChg;
    }

    /**
     * @param p PERIOD_CHG
     */
    public void setPeriodChg(final String p) {
        this.periodChg = p;
    }

    /** PERIOD_CHG_COUNTS */
    @jakarta.validation.constraints.Size(max = 2)
    private String periodChgCounts;

    /**
     * @return PERIOD_CHG_COUNTS
     */
    public String getPeriodChgCounts() {
        return periodChgCounts;
    }

    /**
     * @param p PERIOD_CHG_COUNTS
     */
    public void setPeriodChgCounts(final String p) {
        this.periodChgCounts = p;
    }

    /** PLAN_DATE_APPOINT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String planDateAppoint;

    /**
     * @return PLAN_DATE_APPOINT
     */
    public String getPlanDateAppoint() {
        return planDateAppoint;
    }

    /**
     * @param p PLAN_DATE_APPOINT
     */
    public void setPlanDateAppoint(final String p) {
        this.planDateAppoint = p;
    }

    /** BEG_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String begDate;

    /**
     * @return BEG_DATE
     */
    public String getBegDate() {
        return begDate;
    }

    /**
     * @param p BEG_DATE
     */
    public void setBegDate(final String p) {
        this.begDate = p;
    }

    /** END_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String endDate;

    /**
     * @return END_DATE
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param p END_DATE
     */
    public void setEndDate(final String p) {
        this.endDate = p;
    }

    /** START_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String startDate;

    /**
     * @return START_DATE
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param p START_DATE
     */
    public void setStartDate(final String p) {
        this.startDate = p;
    }

    /** COMP_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String compDate;

    /**
     * @return COMP_DATE
     */
    public String getCompDate() {
        return compDate;
    }

    /**
     * @param p COMP_DATE
     */
    public void setCompDate(final String p) {
        this.compDate = p;
    }

    /** SHORT_NO */
    @jakarta.validation.constraints.Size(max = 7)
    private String shortNo;

    /**
     * @return SHORT_NO
     */
    public String getShortNo() {
        return shortNo;
    }

    /**
     * @param p SHORT_NO
     */
    public void setShortNo(final String p) {
        this.shortNo = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
