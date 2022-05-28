package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_WC_MCN_LOAD_PLAN登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWWcMcnLoadPlanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWWcMcnLoadPlanRegistForm.class);

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

    /** WC_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String wcName;

    /**
     * @return WC_NAME
     */
    public String getWcName() {
        return wcName;
    }

    /**
     * @param p WC_NAME
     */
    public void setWcName(final String p) {
        this.wcName = p;
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

    /** WS_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String wsName;

    /**
     * @return WS_NAME
     */
    public String getWsName() {
        return wsName;
    }

    /**
     * @param p WS_NAME
     */
    public void setWsName(final String p) {
        this.wsName = p;
    }

    /** OPE_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return opeDetail;
    }

    /**
     * @param p OPE_DETAIL
     */
    public void setOpeDetail(final String p) {
        this.opeDetail = p;
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

    /** HUM_TOTAL_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String humTotalTime;

    /**
     * @return HUM_TOTAL_TIME
     */
    public String getHumTotalTime() {
        return humTotalTime;
    }

    /**
     * @param p HUM_TOTAL_TIME
     */
    public void setHumTotalTime(final String p) {
        this.humTotalTime = p;
    }

    /** MAC_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    public String getMacPreTime() {
        return macPreTime;
    }

    /**
     * @param p MAC_PRE_TIME
     */
    public void setMacPreTime(final String p) {
        this.macPreTime = p;
    }

    /** MAC_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    public String getMacActTime() {
        return macActTime;
    }

    /**
     * @param p MAC_ACT_TIME
     */
    public void setMacActTime(final String p) {
        this.macActTime = p;
    }

    /** MAC_TOTAL_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String macTotalTime;

    /**
     * @return MAC_TOTAL_TIME
     */
    public String getMacTotalTime() {
        return macTotalTime;
    }

    /**
     * @param p MAC_TOTAL_TIME
     */
    public void setMacTotalTime(final String p) {
        this.macTotalTime = p;
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

    /** PRO_NES_WEIGHT */
    @jakarta.validation.constraints.Size(max = 12)
    private String proNesWeight;

    /**
     * @return PRO_NES_WEIGHT
     */
    public String getProNesWeight() {
        return proNesWeight;
    }

    /**
     * @param p PRO_NES_WEIGHT
     */
    public void setProNesWeight(final String p) {
        this.proNesWeight = p;
    }

    /** DATA_SOURCE_KBN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String dataSourceKbn;

    /**
     * @return DATA_SOURCE_KBN
     */
    public String getDataSourceKbn() {
        return dataSourceKbn;
    }

    /**
     * @param p DATA_SOURCE_KBN
     */
    public void setDataSourceKbn(final String p) {
        this.dataSourceKbn = p;
    }

    /** PERIOD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
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

    /** PLAN_NO */
    @jakarta.validation.constraints.Size(max = 12)
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
