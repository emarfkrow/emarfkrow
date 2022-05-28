package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_Y_STK_AMOUNT_PROG登録フォーム
 *
 * @author emarfkrow
 */
public class InvYStkAmountProgRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvYStkAmountProgRegistForm.class);

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

    /** ROUTING */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routing;

    /**
     * @return ROUTING
     */
    public String getRouting() {
        return routing;
    }

    /**
     * @param p ROUTING
     */
    public void setRouting(final String p) {
        this.routing = p;
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

    /** NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String nesCounts;

    /**
     * @return NES_COUNTS
     */
    public String getNesCounts() {
        return nesCounts;
    }

    /**
     * @param p NES_COUNTS
     */
    public void setNesCounts(final String p) {
        this.nesCounts = p;
    }

    /** ROU_AMOUNT */
    @jakarta.validation.constraints.Size(max = 9)
    private String rouAmount;

    /**
     * @return ROU_AMOUNT
     */
    public String getRouAmount() {
        return rouAmount;
    }

    /**
     * @param p ROU_AMOUNT
     */
    public void setRouAmount(final String p) {
        this.rouAmount = p;
    }

    /** ROU_LT */
    @jakarta.validation.constraints.Size(max = 6)
    private String rouLt;

    /**
     * @return ROU_LT
     */
    public String getRouLt() {
        return rouLt;
    }

    /**
     * @param p ROU_LT
     */
    public void setRouLt(final String p) {
        this.rouLt = p;
    }

    /** PRD_M_SUP_BUDGET_OUT */
    @jakarta.validation.Valid
    private PrdMSupBudgetOutRegistForm prdMSupBudgetOutRegistForm;

    /**
     * @return PrdMSupBudgetOutRegistForm
     */
    public PrdMSupBudgetOutRegistForm getPrdMSupBudgetOutRegistForm() {
        return prdMSupBudgetOutRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdMSupBudgetOutRegistForm(final PrdMSupBudgetOutRegistForm p) {
        this.prdMSupBudgetOutRegistForm = p;
    }

    /** PRD_STORE_MAINTE */
    @jakarta.validation.Valid
    private PrdStoreMainteRegistForm prdStoreMainteRegistForm;

    /**
     * @return PrdStoreMainteRegistForm
     */
    public PrdStoreMainteRegistForm getPrdStoreMainteRegistForm() {
        return prdStoreMainteRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdStoreMainteRegistForm(final PrdStoreMainteRegistForm p) {
        this.prdStoreMainteRegistForm = p;
    }

    /** PRD_Y_SUP_BUDGET_OUT */
    @jakarta.validation.Valid
    private PrdYSupBudgetOutRegistForm prdYSupBudgetOutRegistForm;

    /**
     * @return PrdYSupBudgetOutRegistForm
     */
    public PrdYSupBudgetOutRegistForm getPrdYSupBudgetOutRegistForm() {
        return prdYSupBudgetOutRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdYSupBudgetOutRegistForm(final PrdYSupBudgetOutRegistForm p) {
        this.prdYSupBudgetOutRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
