package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_MANAGEMENT_INV登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockManagementInvRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockManagementInvRegistForm.class);

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

    /** STOCK */
    @jakarta.validation.constraints.Size(max = 11)
    private String stock;

    /**
     * @return STOCK
     */
    public String getStock() {
        return stock;
    }

    /**
     * @param p STOCK
     */
    public void setStock(final String p) {
        this.stock = p;
    }

    /** UNIT_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String unitCost;

    /**
     * @return UNIT_COST
     */
    public String getUnitCost() {
        return unitCost;
    }

    /**
     * @param p UNIT_COST
     */
    public void setUnitCost(final String p) {
        this.unitCost = p;
    }

    /** LAST_IN_OUT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String lastInOutDate;

    /**
     * @return LAST_IN_OUT_DATE
     */
    public String getLastInOutDate() {
        return lastInOutDate;
    }

    /**
     * @param p LAST_IN_OUT_DATE
     */
    public void setLastInOutDate(final String p) {
        this.lastInOutDate = p;
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

    /** STORE_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String storeNo;

    /**
     * @return STORE_NO
     */
    public String getStoreNo() {
        return storeNo;
    }

    /**
     * @param p STORE_NO
     */
    public void setStoreNo(final String p) {
        this.storeNo = p;
    }

    /** INV_STOCK_MANAGEMENT_INV_MER */
    @jakarta.validation.Valid
    private InvStockManagementInvMerRegistForm invStockManagementInvMerRegistForm;

    /**
     * @return InvStockManagementInvMerRegistForm
     */
    public InvStockManagementInvMerRegistForm getInvStockManagementInvMerRegistForm() {
        return invStockManagementInvMerRegistForm;
    }

    /**
     * @param p
     */
    public void setInvStockManagementInvMerRegistForm(final InvStockManagementInvMerRegistForm p) {
        this.invStockManagementInvMerRegistForm = p;
    }

    /** INV_STOCK_MANAGEMENT_INV_DET */
    @jakarta.validation.Valid
    private List<InvStockManagementInvDetRegistForm> invStockManagementInvDetGrid;

    /**
     * @return INV_STOCK_MANAGEMENT_INV_DET
     */
    public List<InvStockManagementInvDetRegistForm> getInvStockManagementInvDetGrid() {
        return invStockManagementInvDetGrid;
    }

    /**
     * @param p
     */
    public void setInvStockManagementInvDetGrid(final List<InvStockManagementInvDetRegistForm> p) {
        this.invStockManagementInvDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
