package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_RATE_BK登録フォーム
 *
 * @author emarfkrow
 */
public class MfgRateBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgRateBkRegistForm.class);

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
    }

    /** RATE_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String rateCode;

    /**
     * @return RATE_CODE
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * @param p RATE_CODE
     */
    public void setRateCode(final String p) {
        this.rateCode = p;
    }

    /** IN_OUT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    public String getInOutKbn() {
        return inOutKbn;
    }

    /**
     * @param p IN_OUT_KBN
     */
    public void setInOutKbn(final String p) {
        this.inOutKbn = p;
    }

    /** RATE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String rateKbn;

    /**
     * @return RATE_KBN
     */
    public String getRateKbn() {
        return rateKbn;
    }

    /**
     * @param p RATE_KBN
     */
    public void setRateKbn(final String p) {
        this.rateKbn = p;
    }

    /** HUM_LABOR_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String humLaborCostFirst;

    /**
     * @return HUM_LABOR_COST_FIRST
     */
    public String getHumLaborCostFirst() {
        return humLaborCostFirst;
    }

    /**
     * @param p HUM_LABOR_COST_FIRST
     */
    public void setHumLaborCostFirst(final String p) {
        this.humLaborCostFirst = p;
    }

    /** HUM_EXPENSES_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String humExpensesFirst;

    /**
     * @return HUM_EXPENSES_FIRST
     */
    public String getHumExpensesFirst() {
        return humExpensesFirst;
    }

    /**
     * @param p HUM_EXPENSES_FIRST
     */
    public void setHumExpensesFirst(final String p) {
        this.humExpensesFirst = p;
    }

    /** HUM_LABOR_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String humLaborCostSecond;

    /**
     * @return HUM_LABOR_COST_SECOND
     */
    public String getHumLaborCostSecond() {
        return humLaborCostSecond;
    }

    /**
     * @param p HUM_LABOR_COST_SECOND
     */
    public void setHumLaborCostSecond(final String p) {
        this.humLaborCostSecond = p;
    }

    /** HUM_EXPENSES_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String humExpensesSecond;

    /**
     * @return HUM_EXPENSES_SECOND
     */
    public String getHumExpensesSecond() {
        return humExpensesSecond;
    }

    /**
     * @param p HUM_EXPENSES_SECOND
     */
    public void setHumExpensesSecond(final String p) {
        this.humExpensesSecond = p;
    }

    /** MAC_LABOR_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String macLaborCostFirst;

    /**
     * @return MAC_LABOR_COST_FIRST
     */
    public String getMacLaborCostFirst() {
        return macLaborCostFirst;
    }

    /**
     * @param p MAC_LABOR_COST_FIRST
     */
    public void setMacLaborCostFirst(final String p) {
        this.macLaborCostFirst = p;
    }

    /** MAC_EXPENSES_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String macExpensesFirst;

    /**
     * @return MAC_EXPENSES_FIRST
     */
    public String getMacExpensesFirst() {
        return macExpensesFirst;
    }

    /**
     * @param p MAC_EXPENSES_FIRST
     */
    public void setMacExpensesFirst(final String p) {
        this.macExpensesFirst = p;
    }

    /** MAC_LABOR_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String macLaborCostSecond;

    /**
     * @return MAC_LABOR_COST_SECOND
     */
    public String getMacLaborCostSecond() {
        return macLaborCostSecond;
    }

    /**
     * @param p MAC_LABOR_COST_SECOND
     */
    public void setMacLaborCostSecond(final String p) {
        this.macLaborCostSecond = p;
    }

    /** MAC_EXPENSES_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String macExpensesSecond;

    /**
     * @return MAC_EXPENSES_SECOND
     */
    public String getMacExpensesSecond() {
        return macExpensesSecond;
    }

    /**
     * @param p MAC_EXPENSES_SECOND
     */
    public void setMacExpensesSecond(final String p) {
        this.macExpensesSecond = p;
    }

    /** OUT_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 6)
    private String outCostSecond;

    /**
     * @return OUT_COST_SECOND
     */
    public String getOutCostSecond() {
        return outCostSecond;
    }

    /**
     * @param p OUT_COST_SECOND
     */
    public void setOutCostSecond(final String p) {
        this.outCostSecond = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
