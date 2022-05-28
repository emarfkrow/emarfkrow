package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_SHIP_ORDER登録フォーム
 *
 * @author emarfkrow
 */
public class MfgShipOrderRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgShipOrderRegistForm.class);

    /** SHIP_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 12)
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

    /** SHIP_DIRECT_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String shipDirectCounts;

    /**
     * @return SHIP_DIRECT_COUNTS
     */
    public String getShipDirectCounts() {
        return shipDirectCounts;
    }

    /**
     * @param p SHIP_DIRECT_COUNTS
     */
    public void setShipDirectCounts(final String p) {
        this.shipDirectCounts = p;
    }

    /** SHIP_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String shipStatus;

    /**
     * @return SHIP_STATUS
     */
    public String getShipStatus() {
        return shipStatus;
    }

    /**
     * @param p SHIP_STATUS
     */
    public void setShipStatus(final String p) {
        this.shipStatus = p;
    }

    /** SHIP_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String shipCounts;

    /**
     * @return SHIP_COUNTS
     */
    public String getShipCounts() {
        return shipCounts;
    }

    /**
     * @param p SHIP_COUNTS
     */
    public void setShipCounts(final String p) {
        this.shipCounts = p;
    }

    /** SHIP_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String shipDate;

    /**
     * @return SHIP_DATE
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * @param p SHIP_DATE
     */
    public void setShipDate(final String p) {
        this.shipDate = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
