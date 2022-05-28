package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_PERIOD_PLAN登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWPeriodPlanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWPeriodPlanRegistForm.class);

    /** W_PLAN_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 6)
    private String wPlanId;

    /**
     * @return W_PLAN_ID
     */
    public String getWPlanId() {
        return wPlanId;
    }

    /**
     * @param p W_PLAN_ID
     */
    public void setWPlanId(final String p) {
        this.wPlanId = p;
    }

    /** DATE_OF_PROC */
    @jakarta.validation.constraints.Size(max = 7)
    private String dateOfProc;

    /**
     * @return DATE_OF_PROC
     */
    public String getDateOfProc() {
        return dateOfProc;
    }

    /**
     * @param p DATE_OF_PROC
     */
    public void setDateOfProc(final String p) {
        this.dateOfProc = p;
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

    /** PROC_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String procStatus;

    /**
     * @return PROC_STATUS
     */
    public String getProcStatus() {
        return procStatus;
    }

    /**
     * @param p PROC_STATUS
     */
    public void setProcStatus(final String p) {
        this.procStatus = p;
    }

    /** RESULT_PROC_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String resultProcStatus;

    /**
     * @return RESULT_PROC_STATUS
     */
    public String getResultProcStatus() {
        return resultProcStatus;
    }

    /**
     * @param p RESULT_PROC_STATUS
     */
    public void setResultProcStatus(final String p) {
        this.resultProcStatus = p;
    }

    /** PLAN_COMMENT */
    @jakarta.validation.constraints.Size(max = 60)
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
