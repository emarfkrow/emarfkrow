package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PAY_ACT_HED登録フォーム
 *
 * @author emarfkrow
 */
public class PchPayActHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchPayActHedRegistForm.class);

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

    /** SUPPLY_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String supplyKbn;

    /**
     * @return SUPPLY_KBN
     */
    public String getSupplyKbn() {
        return supplyKbn;
    }

    /**
     * @param p SUPPLY_KBN
     */
    public void setSupplyKbn(final String p) {
        this.supplyKbn = p;
    }

    /** FROM_PAY */
    @jakarta.validation.constraints.Size(max = 10)
    private String fromPay;

    /**
     * @return FROM_PAY
     */
    public String getFromPay() {
        return fromPay;
    }

    /**
     * @param p FROM_PAY
     */
    public void setFromPay(final String p) {
        this.fromPay = p;
    }

    /** TO_PAY */
    @jakarta.validation.constraints.Size(max = 10)
    private String toPay;

    /**
     * @return TO_PAY
     */
    public String getToPay() {
        return toPay;
    }

    /**
     * @param p TO_PAY
     */
    public void setToPay(final String p) {
        this.toPay = p;
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

    /** SUPPLY_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String supplyNo;

    /**
     * @return SUPPLY_NO
     */
    public String getSupplyNo() {
        return supplyNo;
    }

    /**
     * @param p SUPPLY_NO
     */
    public void setSupplyNo(final String p) {
        this.supplyNo = p;
    }

    /** SHIP_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String shipOrderNo;

    /**
     * @return SHIP_ORDER_NO
     */
    public String getShipOrderNo() {
        return shipOrderNo;
    }

    /**
     * @param p SHIP_ORDER_NO
     */
    public void setShipOrderNo(final String p) {
        this.shipOrderNo = p;
    }

    /** PAY_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String payDate;

    /**
     * @return PAY_DATE
     */
    public String getPayDate() {
        return payDate;
    }

    /**
     * @param p PAY_DATE
     */
    public void setPayDate(final String p) {
        this.payDate = p;
    }

    /** PCH_PAY_ACT_DET */
    @jakarta.validation.Valid
    private List<PchPayActDetRegistForm> pchPayActDetGrid;

    /**
     * @return PCH_PAY_ACT_DET
     */
    public List<PchPayActDetRegistForm> getPchPayActDetGrid() {
        return pchPayActDetGrid;
    }

    /**
     * @param p
     */
    public void setPchPayActDetGrid(final List<PchPayActDetRegistForm> p) {
        this.pchPayActDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
