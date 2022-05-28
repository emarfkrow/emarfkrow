package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_NECK_LOAD登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyNeckLoadRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyNeckLoadRegistForm.class);

    /** PRO_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return proNo;
    }

    /**
     * @param p PRO_NO
     */
    public void setProNo(final String p) {
        this.proNo = p;
    }

    /** BRANCH_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String branchNo;

    /**
     * @return BRANCH_NO
     */
    public String getBranchNo() {
        return branchNo;
    }

    /**
     * @param p BRANCH_NO
     */
    public void setBranchNo(final String p) {
        this.branchNo = p;
    }

    /** LOAD_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String loadDate;

    /**
     * @return LOAD_DATE
     */
    public String getLoadDate() {
        return loadDate;
    }

    /**
     * @param p LOAD_DATE
     */
    public void setLoadDate(final String p) {
        this.loadDate = p;
    }

    /** LOAD_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String loadTime;

    /**
     * @return LOAD_TIME
     */
    public String getLoadTime() {
        return loadTime;
    }

    /**
     * @param p LOAD_TIME
     */
    public void setLoadTime(final String p) {
        this.loadTime = p;
    }

    /** LOAD_OVER_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String loadOverTime;

    /**
     * @return LOAD_OVER_TIME
     */
    public String getLoadOverTime() {
        return loadOverTime;
    }

    /**
     * @param p LOAD_OVER_TIME
     */
    public void setLoadOverTime(final String p) {
        this.loadOverTime = p;
    }

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
