package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_MANAGEMENT_INV_DET登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockManagementInvDetRegistForm.class);

    /** INV_PHASE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String invPhase;

    /**
     * @return INV_PHASE
     */
    public String getInvPhase() {
        return invPhase;
    }

    /**
     * @param p INV_PHASE
     */
    public void setInvPhase(final String p) {
        this.invPhase = p;
    }

    /** INV_PHASE_MONTH */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String invPhaseMonth;

    /**
     * @return INV_PHASE_MONTH
     */
    public String getInvPhaseMonth() {
        return invPhaseMonth;
    }

    /**
     * @param p INV_PHASE_MONTH
     */
    public void setInvPhaseMonth(final String p) {
        this.invPhaseMonth = p;
    }

    /** STOCK_MANAGEMENT_SECTION */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String stockManagementSection;

    /**
     * @return STOCK_MANAGEMENT_SECTION
     */
    public String getStockManagementSection() {
        return stockManagementSection;
    }

    /**
     * @param p STOCK_MANAGEMENT_SECTION
     */
    public void setStockManagementSection(final String p) {
        this.stockManagementSection = p;
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

    /** SUB_INV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    public String getSubInvCode() {
        return subInvCode;
    }

    /**
     * @param p SUB_INV_CODE
     */
    public void setSubInvCode(final String p) {
        this.subInvCode = p;
    }

    /** INV_BRANCH_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String invBranchNo;

    /**
     * @return INV_BRANCH_NO
     */
    public String getInvBranchNo() {
        return invBranchNo;
    }

    /**
     * @param p INV_BRANCH_NO
     */
    public void setInvBranchNo(final String p) {
        this.invBranchNo = p;
    }

    /** SLIP_NO */
    @jakarta.validation.constraints.Size(max = 5)
    private String slipNo;

    /**
     * @return SLIP_NO
     */
    public String getSlipNo() {
        return slipNo;
    }

    /**
     * @param p SLIP_NO
     */
    public void setSlipNo(final String p) {
        this.slipNo = p;
    }

    /** STOCK_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String stockCode;

    /**
     * @return STOCK_CODE
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * @param p STOCK_CODE
     */
    public void setStockCode(final String p) {
        this.stockCode = p;
    }

    /** INV_STOCK */
    @jakarta.validation.constraints.Size(max = 11)
    private String invStock;

    /**
     * @return INV_STOCK
     */
    public String getInvStock() {
        return invStock;
    }

    /**
     * @param p INV_STOCK
     */
    public void setInvStock(final String p) {
        this.invStock = p;
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

    /** INV_STOCK_MANAGEMENT_INV_DET_M */
    @jakarta.validation.Valid
    private InvStockManagementInvDetMRegistForm invStockManagementInvDetMRegistForm;

    /**
     * @return InvStockManagementInvDetMRegistForm
     */
    public InvStockManagementInvDetMRegistForm getInvStockManagementInvDetMRegistForm() {
        return invStockManagementInvDetMRegistForm;
    }

    /**
     * @param p
     */
    public void setInvStockManagementInvDetMRegistForm(final InvStockManagementInvDetMRegistForm p) {
        this.invStockManagementInvDetMRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
