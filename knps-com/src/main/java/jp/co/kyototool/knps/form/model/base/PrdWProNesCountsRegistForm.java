package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_PRO_NES_COUNTS登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWProNesCountsRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWProNesCountsRegistForm.class);

    /** PRD_W_PRO_NES_COUNTS_KEY */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String prdWProNesCountsKey;

    /**
     * @return PRD_W_PRO_NES_COUNTS_KEY
     */
    public String getPrdWProNesCountsKey() {
        return prdWProNesCountsKey;
    }

    /**
     * @param p PRD_W_PRO_NES_COUNTS_KEY
     */
    public void setPrdWProNesCountsKey(final String p) {
        this.prdWProNesCountsKey = p;
    }

    /** PRO_HINBAN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    public String getProHinban() {
        return proHinban;
    }

    /**
     * @param p PRO_HINBAN
     */
    public void setProHinban(final String p) {
        this.proHinban = p;
    }

    /** SCHEDULED_DATE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String scheduledDate;

    /**
     * @return SCHEDULED_DATE
     */
    public String getScheduledDate() {
        return scheduledDate;
    }

    /**
     * @param p SCHEDULED_DATE
     */
    public void setScheduledDate(final String p) {
        this.scheduledDate = p;
    }

    /** PRO_NES_COUNTS */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 6)
    private String proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
    public String getProNesCounts() {
        return proNesCounts;
    }

    /**
     * @param p PRO_NES_COUNTS
     */
    public void setProNesCounts(final String p) {
        this.proNesCounts = p;
    }

    /** PRO_NES_COMMENT */
    @jakarta.validation.constraints.Size(max = 60)
    private String proNesComment;

    /**
     * @return PRO_NES_COMMENT
     */
    public String getProNesComment() {
        return proNesComment;
    }

    /**
     * @param p PRO_NES_COMMENT
     */
    public void setProNesComment(final String p) {
        this.proNesComment = p;
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

    /** EMP_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String empCode;

    /**
     * @return EMP_CODE
     */
    public String getEmpCode() {
        return empCode;
    }

    /**
     * @param p EMP_CODE
     */
    public void setEmpCode(final String p) {
        this.empCode = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
