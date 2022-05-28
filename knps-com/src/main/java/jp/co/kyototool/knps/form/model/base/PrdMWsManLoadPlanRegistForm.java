package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_WS_MAN_LOAD_PLAN登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMWsManLoadPlanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMWsManLoadPlanRegistForm.class);

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

    /** MAN_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    public String getManHinban() {
        return manHinban;
    }

    /**
     * @param p MAN_HINBAN
     */
    public void setManHinban(final String p) {
        this.manHinban = p;
    }

    /** WS_CODE */
    @jakarta.validation.constraints.Size(max = 4)
    private String wsCode;

    /**
     * @return WS_CODE
     */
    public String getWsCode() {
        return wsCode;
    }

    /**
     * @param p WS_CODE
     */
    public void setWsCode(final String p) {
        this.wsCode = p;
    }

    /** PRO_NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
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

    /** HUM_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    public String getHumPreTime() {
        return humPreTime;
    }

    /**
     * @param p HUM_PRE_TIME
     */
    public void setHumPreTime(final String p) {
        this.humPreTime = p;
    }

    /** HUM_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    public String getHumActTime() {
        return humActTime;
    }

    /**
     * @param p HUM_ACT_TIME
     */
    public void setHumActTime(final String p) {
        this.humActTime = p;
    }

    /** MAC_PRE_TIME_IN */
    @jakarta.validation.constraints.Size(max = 7)
    private String macPreTimeIn;

    /**
     * @return MAC_PRE_TIME_IN
     */
    public String getMacPreTimeIn() {
        return macPreTimeIn;
    }

    /**
     * @param p MAC_PRE_TIME_IN
     */
    public void setMacPreTimeIn(final String p) {
        this.macPreTimeIn = p;
    }

    /** MAC_ACT_TIME_IN */
    @jakarta.validation.constraints.Size(max = 7)
    private String macActTimeIn;

    /**
     * @return MAC_ACT_TIME_IN
     */
    public String getMacActTimeIn() {
        return macActTimeIn;
    }

    /**
     * @param p MAC_ACT_TIME_IN
     */
    public void setMacActTimeIn(final String p) {
        this.macActTimeIn = p;
    }

    /** MAC_PRE_TIME_OUT */
    @jakarta.validation.constraints.Size(max = 7)
    private String macPreTimeOut;

    /**
     * @return MAC_PRE_TIME_OUT
     */
    public String getMacPreTimeOut() {
        return macPreTimeOut;
    }

    /**
     * @param p MAC_PRE_TIME_OUT
     */
    public void setMacPreTimeOut(final String p) {
        this.macPreTimeOut = p;
    }

    /** MAC_ACT_TIME_OUT */
    @jakarta.validation.constraints.Size(max = 7)
    private String macActTimeOut;

    /**
     * @return MAC_ACT_TIME_OUT
     */
    public String getMacActTimeOut() {
        return macActTimeOut;
    }

    /**
     * @param p MAC_ACT_TIME_OUT
     */
    public void setMacActTimeOut(final String p) {
        this.macActTimeOut = p;
    }

    /** MAC_PRE_TIME_KANBAN */
    @jakarta.validation.constraints.Size(max = 7)
    private String macPreTimeKanban;

    /**
     * @return MAC_PRE_TIME_KANBAN
     */
    public String getMacPreTimeKanban() {
        return macPreTimeKanban;
    }

    /**
     * @param p MAC_PRE_TIME_KANBAN
     */
    public void setMacPreTimeKanban(final String p) {
        this.macPreTimeKanban = p;
    }

    /** MAC_ACT_TIME_KANBAN */
    @jakarta.validation.constraints.Size(max = 7)
    private String macActTimeKanban;

    /**
     * @return MAC_ACT_TIME_KANBAN
     */
    public String getMacActTimeKanban() {
        return macActTimeKanban;
    }

    /**
     * @param p MAC_ACT_TIME_KANBAN
     */
    public void setMacActTimeKanban(final String p) {
        this.macActTimeKanban = p;
    }

    /** PRD_Y_WS_MAN_LOAD_PLAN */
    @jakarta.validation.Valid
    private PrdYWsManLoadPlanRegistForm prdYWsManLoadPlanRegistForm;

    /**
     * @return PrdYWsManLoadPlanRegistForm
     */
    public PrdYWsManLoadPlanRegistForm getPrdYWsManLoadPlanRegistForm() {
        return prdYWsManLoadPlanRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdYWsManLoadPlanRegistForm(final PrdYWsManLoadPlanRegistForm p) {
        this.prdYWsManLoadPlanRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
