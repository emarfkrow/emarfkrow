package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_TOOL_MNG_DET登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockToolMngDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockToolMngDetRegistForm.class);

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

    /** IN_OUT_DATE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String inOutDate;

    /**
     * @return IN_OUT_DATE
     */
    public String getInOutDate() {
        return inOutDate;
    }

    /**
     * @param p IN_OUT_DATE
     */
    public void setInOutDate(final String p) {
        this.inOutDate = p;
    }

    /** STOCK_BRANCH_NUMBER */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 5)
    private String stockBranchNumber;

    /**
     * @return STOCK_BRANCH_NUMBER
     */
    public String getStockBranchNumber() {
        return stockBranchNumber;
    }

    /**
     * @param p STOCK_BRANCH_NUMBER
     */
    public void setStockBranchNumber(final String p) {
        this.stockBranchNumber = p;
    }

    /** IN_OUT_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String inOutStatus;

    /**
     * @return IN_OUT_STATUS
     */
    public String getInOutStatus() {
        return inOutStatus;
    }

    /**
     * @param p IN_OUT_STATUS
     */
    public void setInOutStatus(final String p) {
        this.inOutStatus = p;
    }

    /** RECEIPT_SUP_CODE */
    @jakarta.validation.constraints.Size(max = 6)
    private String receiptSupCode;

    /**
     * @return RECEIPT_SUP_CODE
     */
    public String getReceiptSupCode() {
        return receiptSupCode;
    }

    /**
     * @param p RECEIPT_SUP_CODE
     */
    public void setReceiptSupCode(final String p) {
        this.receiptSupCode = p;
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

    /** INV_COMMENT */
    @jakarta.validation.constraints.Size(max = 25)
    private String invComment;

    /**
     * @return INV_COMMENT
     */
    public String getInvComment() {
        return invComment;
    }

    /**
     * @param p INV_COMMENT
     */
    public void setInvComment(final String p) {
        this.invComment = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
