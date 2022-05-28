package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_Y_STK_PROD_AMOUNT_PROD登録フォーム
 *
 * @author emarfkrow
 */
public class InvYStkProdAmountProdRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvYStkProdAmountProdRegistForm.class);

    /** PRO_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
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

    /** STAN_COSTS */
    @jakarta.validation.constraints.Size(max = 9)
    private String stanCosts;

    /**
     * @return STAN_COSTS
     */
    public String getStanCosts() {
        return stanCosts;
    }

    /**
     * @param p STAN_COSTS
     */
    public void setStanCosts(final String p) {
        this.stanCosts = p;
    }

    /** SHIKAKE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String shikakeKbn;

    /**
     * @return SHIKAKE_KBN
     */
    public String getShikakeKbn() {
        return shikakeKbn;
    }

    /**
     * @param p SHIKAKE_KBN
     */
    public void setShikakeKbn(final String p) {
        this.shikakeKbn = p;
    }

    /** PRO_LT */
    @jakarta.validation.constraints.Size(max = 6)
    private String proLt;

    /**
     * @return PRO_LT
     */
    public String getProLt() {
        return proLt;
    }

    /**
     * @param p PRO_LT
     */
    public void setProLt(final String p) {
        this.proLt = p;
    }

    /** PRD_M_PRO_NES_COUNTS */
    @jakarta.validation.Valid
    private PrdMProNesCountsRegistForm prdMProNesCountsRegistForm;

    /**
     * @return PrdMProNesCountsRegistForm
     */
    public PrdMProNesCountsRegistForm getPrdMProNesCountsRegistForm() {
        return prdMProNesCountsRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdMProNesCountsRegistForm(final PrdMProNesCountsRegistForm p) {
        this.prdMProNesCountsRegistForm = p;
    }

    /** PRD_Y_PRO_NES_COUNTS */
    @jakarta.validation.Valid
    private PrdYProNesCountsRegistForm prdYProNesCountsRegistForm;

    /**
     * @return PrdYProNesCountsRegistForm
     */
    public PrdYProNesCountsRegistForm getPrdYProNesCountsRegistForm() {
        return prdYProNesCountsRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdYProNesCountsRegistForm(final PrdYProNesCountsRegistForm p) {
        this.prdYProNesCountsRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
