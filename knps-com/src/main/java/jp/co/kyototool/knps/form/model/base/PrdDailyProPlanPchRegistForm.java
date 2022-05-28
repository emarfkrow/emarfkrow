package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_PRO_PLAN_PCH登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanPchRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyProPlanPchRegistForm.class);

    /** PCH_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String pchOrderNo;

    /**
     * @return PCH_ORDER_NO
     */
    public String getPchOrderNo() {
        return pchOrderNo;
    }

    /**
     * @param p PCH_ORDER_NO
     */
    public void setPchOrderNo(final String p) {
        this.pchOrderNo = p;
    }

    /** CHILD_PLAN_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String childPlanNo;

    /**
     * @return CHILD_PLAN_NO
     */
    public String getChildPlanNo() {
        return childPlanNo;
    }

    /**
     * @param p CHILD_PLAN_NO
     */
    public void setChildPlanNo(final String p) {
        this.childPlanNo = p;
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

    /** NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
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

    /** ORDER_LIMIT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String orderLimitDate;

    /**
     * @return ORDER_LIMIT_DATE
     */
    public String getOrderLimitDate() {
        return orderLimitDate;
    }

    /**
     * @param p ORDER_LIMIT_DATE
     */
    public void setOrderLimitDate(final String p) {
        this.orderLimitDate = p;
    }

    /** PERIOD */
    @jakarta.validation.constraints.Size(max = 7)
    private String period;

    /**
     * @return PERIOD
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @param p PERIOD
     */
    public void setPeriod(final String p) {
        this.period = p;
    }

    /** PCH_ORDER_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String pchOrderStatus;

    /**
     * @return PCH_ORDER_STATUS
     */
    public String getPchOrderStatus() {
        return pchOrderStatus;
    }

    /**
     * @param p PCH_ORDER_STATUS
     */
    public void setPchOrderStatus(final String p) {
        this.pchOrderStatus = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
