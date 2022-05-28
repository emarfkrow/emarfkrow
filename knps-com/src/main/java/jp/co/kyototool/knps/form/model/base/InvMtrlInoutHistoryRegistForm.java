package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_MTRL_INOUT_HISTORY登録フォーム
 *
 * @author emarfkrow
 */
public class InvMtrlInoutHistoryRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvMtrlInoutHistoryRegistForm.class);

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

    /** ACT_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String actNo;

    /**
     * @return ACT_NO
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * @param p ACT_NO
     */
    public void setActNo(final String p) {
        this.actNo = p;
    }

    /** ACT_BRANCH_NO */
    @jakarta.validation.constraints.Size(max = 2)
    private String actBranchNo;

    /**
     * @return ACT_BRANCH_NO
     */
    public String getActBranchNo() {
        return actBranchNo;
    }

    /**
     * @param p ACT_BRANCH_NO
     */
    public void setActBranchNo(final String p) {
        this.actBranchNo = p;
    }

    /** ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String orderNo;

    /**
     * @return ORDER_NO
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param p ORDER_NO
     */
    public void setOrderNo(final String p) {
        this.orderNo = p;
    }

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
    @jakarta.validation.constraints.Size(max = 10)
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

    /** ISSUE_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String issueHinban;

    /**
     * @return ISSUE_HINBAN
     */
    public String getIssueHinban() {
        return issueHinban;
    }

    /**
     * @param p ISSUE_HINBAN
     */
    public void setIssueHinban(final String p) {
        this.issueHinban = p;
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

    /** GOOD_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String goodCounts;

    /**
     * @return GOOD_COUNTS
     */
    public String getGoodCounts() {
        return goodCounts;
    }

    /**
     * @param p GOOD_COUNTS
     */
    public void setGoodCounts(final String p) {
        this.goodCounts = p;
    }

    /** MASTER_COUNTS */
    @jakarta.validation.constraints.Size(max = 12)
    private String masterCounts;

    /**
     * @return MASTER_COUNTS
     */
    public String getMasterCounts() {
        return masterCounts;
    }

    /**
     * @param p MASTER_COUNTS
     */
    public void setMasterCounts(final String p) {
        this.masterCounts = p;
    }

    /** AMOUNT_USED_PHI */
    @jakarta.validation.constraints.Size(max = 5)
    private String amountUsedPhi;

    /**
     * @return AMOUNT_USED_PHI
     */
    public String getAmountUsedPhi() {
        return amountUsedPhi;
    }

    /**
     * @param p AMOUNT_USED_PHI
     */
    public void setAmountUsedPhi(final String p) {
        this.amountUsedPhi = p;
    }

    /** AMOUNT_USED_LENGTH */
    @jakarta.validation.constraints.Size(max = 5)
    private String amountUsedLength;

    /**
     * @return AMOUNT_USED_LENGTH
     */
    public String getAmountUsedLength() {
        return amountUsedLength;
    }

    /**
     * @param p AMOUNT_USED_LENGTH
     */
    public void setAmountUsedLength(final String p) {
        this.amountUsedLength = p;
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

    /** INV_STOCK_TOOL_MNG_DET */
    @jakarta.validation.Valid
    private InvStockToolMngDetRegistForm invStockToolMngDetRegistForm;

    /**
     * @return InvStockToolMngDetRegistForm
     */
    public InvStockToolMngDetRegistForm getInvStockToolMngDetRegistForm() {
        return invStockToolMngDetRegistForm;
    }

    /**
     * @param p
     */
    public void setInvStockToolMngDetRegistForm(final InvStockToolMngDetRegistForm p) {
        this.invStockToolMngDetRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
