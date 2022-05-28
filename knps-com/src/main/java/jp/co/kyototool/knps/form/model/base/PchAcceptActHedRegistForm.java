package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_ACCEPT_ACT_HED登録フォーム
 *
 * @author emarfkrow
 */
public class PchAcceptActHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchAcceptActHedRegistForm.class);

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

    /** SUP_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return supCode;
    }

    /**
     * @param p SUP_CODE
     */
    public void setSupCode(final String p) {
        this.supCode = p;
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

    /** ITEM */
    @jakarta.validation.constraints.Size(max = 60)
    private String item;

    /**
     * @return ITEM
     */
    public String getItem() {
        return item;
    }

    /**
     * @param p ITEM
     */
    public void setItem(final String p) {
        this.item = p;
    }

    /** ACCEPT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String acceptDate;

    /**
     * @return ACCEPT_DATE
     */
    public String getAcceptDate() {
        return acceptDate;
    }

    /**
     * @param p ACCEPT_DATE
     */
    public void setAcceptDate(final String p) {
        this.acceptDate = p;
    }

    /** UNIT_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * @param p UNIT_CODE
     */
    public void setUnitCode(final String p) {
        this.unitCode = p;
    }

    /** TAX_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String taxCode;

    /**
     * @return TAX_CODE
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * @param p TAX_CODE
     */
    public void setTaxCode(final String p) {
        this.taxCode = p;
    }

    /** TAX_CAL_CODE */
    @jakarta.validation.constraints.Size(max = 1)
    private String taxCalCode;

    /**
     * @return TAX_CAL_CODE
     */
    public String getTaxCalCode() {
        return taxCalCode;
    }

    /**
     * @param p TAX_CAL_CODE
     */
    public void setTaxCalCode(final String p) {
        this.taxCalCode = p;
    }

    /** SUBINV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subinvCode;

    /**
     * @return SUBINV_CODE
     */
    public String getSubinvCode() {
        return subinvCode;
    }

    /**
     * @param p SUBINV_CODE
     */
    public void setSubinvCode(final String p) {
        this.subinvCode = p;
    }

    /** ACCOUNT_CODE */
    @jakarta.validation.constraints.Size(max = 5)
    private String accountCode;

    /**
     * @return ACCOUNT_CODE
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * @param p ACCOUNT_CODE
     */
    public void setAccountCode(final String p) {
        this.accountCode = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
