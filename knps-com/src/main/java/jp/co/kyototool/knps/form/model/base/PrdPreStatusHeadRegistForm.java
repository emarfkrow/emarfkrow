package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_PRE_STATUS_HEAD登録フォーム
 *
 * @author emarfkrow
 */
public class PrdPreStatusHeadRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdPreStatusHeadRegistForm.class);

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

    /** CURRENT_YEAR_Y */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4})?")
    private String currentYearY;

    /**
     * @return CURRENT_YEAR_Y
     */
    public String getCurrentYearY() {
        return currentYearY;
    }

    /**
     * @param p CURRENT_YEAR_Y
     */
    public void setCurrentYearY(final String p) {
        this.currentYearY = p;
    }

    /** CURRENT_YEAR_M */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String currentYearM;

    /**
     * @return CURRENT_YEAR_M
     */
    public String getCurrentYearM() {
        return currentYearM;
    }

    /**
     * @param p CURRENT_YEAR_M
     */
    public void setCurrentYearM(final String p) {
        this.currentYearM = p;
    }

    /** CURRENT_MONTH_M */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String currentMonthM;

    /**
     * @return CURRENT_MONTH_M
     */
    public String getCurrentMonthM() {
        return currentMonthM;
    }

    /**
     * @param p CURRENT_MONTH_M
     */
    public void setCurrentMonthM(final String p) {
        this.currentMonthM = p;
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
