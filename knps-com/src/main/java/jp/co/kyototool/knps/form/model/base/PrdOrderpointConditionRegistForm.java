package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_ORDERPOINT_CONDITION登録フォーム
 *
 * @author emarfkrow
 */
public class PrdOrderpointConditionRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdOrderpointConditionRegistForm.class);

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

    /** YYYY */
    @jakarta.validation.constraints.NotBlank
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
    @jakarta.validation.constraints.NotBlank
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

    /** LAST_PROCESS_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String lastProcessDate;

    /**
     * @return LAST_PROCESS_DATE
     */
    public String getLastProcessDate() {
        return lastProcessDate;
    }

    /**
     * @param p LAST_PROCESS_DATE
     */
    public void setLastProcessDate(final String p) {
        this.lastProcessDate = p;
    }

    /** PRD_PRE_STATUS_HEAD */
    @jakarta.validation.Valid
    private PrdPreStatusHeadRegistForm prdPreStatusHeadRegistForm;

    /**
     * @return PrdPreStatusHeadRegistForm
     */
    public PrdPreStatusHeadRegistForm getPrdPreStatusHeadRegistForm() {
        return prdPreStatusHeadRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdPreStatusHeadRegistForm(final PrdPreStatusHeadRegistForm p) {
        this.prdPreStatusHeadRegistForm = p;
    }

    /** SYS_CLOSE_STATUS */
    @jakarta.validation.Valid
    private SysCloseStatusRegistForm sysCloseStatusRegistForm;

    /**
     * @return SysCloseStatusRegistForm
     */
    public SysCloseStatusRegistForm getSysCloseStatusRegistForm() {
        return sysCloseStatusRegistForm;
    }

    /**
     * @param p
     */
    public void setSysCloseStatusRegistForm(final SysCloseStatusRegistForm p) {
        this.sysCloseStatusRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
