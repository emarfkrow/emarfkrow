package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_INSPECTION_LIST登録フォーム
 *
 * @author emarfkrow
 */
public class PchInspectionListRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchInspectionListRegistForm.class);

    /** TARGET_DATE */
    @jakarta.validation.constraints.Size(max = 6)
    private String targetDate;

    /**
     * @return TARGET_DATE
     */
    public String getTargetDate() {
        return targetDate;
    }

    /**
     * @param p TARGET_DATE
     */
    public void setTargetDate(final String p) {
        this.targetDate = p;
    }

    /** SUP_CODE */
    @jakarta.validation.constraints.Size(max = 6)
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

    /** SUP_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String supName;

    /**
     * @return SUP_NAME
     */
    public String getSupName() {
        return supName;
    }

    /**
     * @param p SUP_NAME
     */
    public void setSupName(final String p) {
        this.supName = p;
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

    /** SUM_INSPECT_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String sumInspectCounts;

    /**
     * @return SUM_INSPECT_COUNTS
     */
    public String getSumInspectCounts() {
        return sumInspectCounts;
    }

    /**
     * @param p SUM_INSPECT_COUNTS
     */
    public void setSumInspectCounts(final String p) {
        this.sumInspectCounts = p;
    }

    /** INSPECT_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String inspectUnit;

    /**
     * @return INSPECT_UNIT
     */
    public String getInspectUnit() {
        return inspectUnit;
    }

    /**
     * @param p INSPECT_UNIT
     */
    public void setInspectUnit(final String p) {
        this.inspectUnit = p;
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

    /** SUM_INSPECT_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String sumInspectAmount;

    /**
     * @return SUM_INSPECT_AMOUNT
     */
    public String getSumInspectAmount() {
        return sumInspectAmount;
    }

    /**
     * @param p SUM_INSPECT_AMOUNT
     */
    public void setSumInspectAmount(final String p) {
        this.sumInspectAmount = p;
    }

    /** SUM_TAX_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String sumTaxAmount;

    /**
     * @return SUM_TAX_AMOUNT
     */
    public String getSumTaxAmount() {
        return sumTaxAmount;
    }

    /**
     * @param p SUM_TAX_AMOUNT
     */
    public void setSumTaxAmount(final String p) {
        this.sumTaxAmount = p;
    }

    /** SUM_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String sumAmount;

    /**
     * @return SUM_AMOUNT
     */
    public String getSumAmount() {
        return sumAmount;
    }

    /**
     * @param p SUM_AMOUNT
     */
    public void setSumAmount(final String p) {
        this.sumAmount = p;
    }

    /** SEND_INSPECT_LIST */
    @jakarta.validation.constraints.Size(max = 1)
    private String sendInspectList;

    /**
     * @return SEND_INSPECT_LIST
     */
    public String getSendInspectList() {
        return sendInspectList;
    }

    /**
     * @param p SEND_INSPECT_LIST
     */
    public void setSendInspectList(final String p) {
        this.sendInspectList = p;
    }

    /** ISSHIKI_UNIT_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String isshikiUnitF;

    /**
     * @return ISSHIKI_UNIT_F
     */
    public String getIsshikiUnitF() {
        return isshikiUnitF;
    }

    /**
     * @param p ISSHIKI_UNIT_F
     */
    public void setIsshikiUnitF(final String p) {
        this.isshikiUnitF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
