package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PAY_ACT_DET登録フォーム
 *
 * @author emarfkrow
 */
public class PchPayActDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchPayActDetRegistForm.class);

    /** PAY_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String payNo;

    /**
     * @return PAY_NO
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * @param p PAY_NO
     */
    public void setPayNo(final String p) {
        this.payNo = p;
    }

    /** PAY_BRANCH_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String payBranchNo;

    /**
     * @return PAY_BRANCH_NO
     */
    public String getPayBranchNo() {
        return payBranchNo;
    }

    /**
     * @param p PAY_BRANCH_NO
     */
    public void setPayBranchNo(final String p) {
        this.payBranchNo = p;
    }

    /** PAY_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String payCounts;

    /**
     * @return PAY_COUNTS
     */
    public String getPayCounts() {
        return payCounts;
    }

    /**
     * @param p PAY_COUNTS
     */
    public void setPayCounts(final String p) {
        this.payCounts = p;
    }

    /** UNIT_PRICE */
    @jakarta.validation.constraints.Size(max = 9)
    private String unitPrice;

    /**
     * @return UNIT_PRICE
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param p UNIT_PRICE
     */
    public void setUnitPrice(final String p) {
        this.unitPrice = p;
    }

    /** AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String amount;

    /**
     * @return AMOUNT
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param p AMOUNT
     */
    public void setAmount(final String p) {
        this.amount = p;
    }

    /** TAX_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String taxAmount;

    /**
     * @return TAX_AMOUNT
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * @param p TAX_AMOUNT
     */
    public void setTaxAmount(final String p) {
        this.taxAmount = p;
    }

    /** MEMO */
    @jakarta.validation.constraints.Size(max = 30)
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p MEMO
     */
    public void setMemo(final String p) {
        this.memo = p;
    }

    /** CLOSE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String closeDate;

    /**
     * @return CLOSE_DATE
     */
    public String getCloseDate() {
        return closeDate;
    }

    /**
     * @param p CLOSE_DATE
     */
    public void setCloseDate(final String p) {
        this.closeDate = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
