package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_MONTH_TIME_SCH登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMonthTimeSchRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMonthTimeSchRegistForm.class);

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

    /** LAYOUT_IN_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String layoutInTime;

    /**
     * @return LAYOUT_IN_TIME
     */
    public String getLayoutInTime() {
        return layoutInTime;
    }

    /**
     * @param p LAYOUT_IN_TIME
     */
    public void setLayoutInTime(final String p) {
        this.layoutInTime = p;
    }

    /** CHANGE_STAT */
    @jakarta.validation.constraints.Size(max = 1)
    private String changeStat;

    /**
     * @return CHANGE_STAT
     */
    public String getChangeStat() {
        return changeStat;
    }

    /**
     * @param p CHANGE_STAT
     */
    public void setChangeStat(final String p) {
        this.changeStat = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
