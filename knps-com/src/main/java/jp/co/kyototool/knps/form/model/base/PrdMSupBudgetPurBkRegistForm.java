package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_SUP_BUDGET_PUR_BK登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetPurBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMSupBudgetPurBkRegistForm.class);

    /** YYYY */
    @jakarta.validation.constraints.NotBlank
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
    @jakarta.validation.constraints.NotBlank
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
    @jakarta.validation.constraints.NotBlank
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

    /** SUP_CODE */
    @jakarta.validation.constraints.NotBlank
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

    /** ORDER_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String orderCounts;

    /**
     * @return ORDER_COUNTS
     */
    public String getOrderCounts() {
        return orderCounts;
    }

    /**
     * @param p ORDER_COUNTS
     */
    public void setOrderCounts(final String p) {
        this.orderCounts = p;
    }

    /** ORDER_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String orderUnit;

    /**
     * @return ORDER_UNIT
     */
    public String getOrderUnit() {
        return orderUnit;
    }

    /**
     * @param p ORDER_UNIT
     */
    public void setOrderUnit(final String p) {
        this.orderUnit = p;
    }

    /** ORDER_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String orderAmount;

    /**
     * @return ORDER_AMOUNT
     */
    public String getOrderAmount() {
        return orderAmount;
    }

    /**
     * @param p ORDER_AMOUNT
     */
    public void setOrderAmount(final String p) {
        this.orderAmount = p;
    }

    /** ITEM_KBN */
    @jakarta.validation.constraints.Size(max = 2)
    private String itemKbn;

    /**
     * @return ITEM_KBN
     */
    public String getItemKbn() {
        return itemKbn;
    }

    /**
     * @param p ITEM_KBN
     */
    public void setItemKbn(final String p) {
        this.itemKbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
