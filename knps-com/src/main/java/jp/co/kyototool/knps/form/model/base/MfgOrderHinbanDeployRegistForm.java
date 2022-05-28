package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_ORDER_HINBAN_DEPLOY登録フォーム
 *
 * @author emarfkrow
 */
public class MfgOrderHinbanDeployRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgOrderHinbanDeployRegistForm.class);

    /** REQID */
    @jakarta.validation.constraints.Size(max = 12)
    private String reqid;

    /**
     * @return REQID
     */
    public String getReqid() {
        return reqid;
    }

    /**
     * @param p REQID
     */
    public void setReqid(final String p) {
        this.reqid = p;
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

    /** DELIVERY_DATE */
    @jakarta.validation.constraints.Size(max = 10)
    private String deliveryDate;

    /**
     * @return DELIVERY_DATE
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * @param p DELIVERY_DATE
     */
    public void setDeliveryDate(final String p) {
        this.deliveryDate = p;
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

    /** COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String counts;

    /**
     * @return COUNTS
     */
    public String getCounts() {
        return counts;
    }

    /**
     * @param p COUNTS
     */
    public void setCounts(final String p) {
        this.counts = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
