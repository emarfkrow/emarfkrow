package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_PROCESS_DET登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockProcessDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockProcessDetRegistForm.class);

    /** LOCATION_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * @param p LOCATION_CODE
     */
    public void setLocationCode(final String p) {
        this.locationCode = p;
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

    /** IN_OUT_YMD */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String inOutYmd;

    /**
     * @return IN_OUT_YMD
     */
    public String getInOutYmd() {
        return inOutYmd;
    }

    /**
     * @param p IN_OUT_YMD
     */
    public void setInOutYmd(final String p) {
        this.inOutYmd = p;
    }

    /** IN_OUT_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String inOutSeq;

    /**
     * @return IN_OUT_SEQ
     */
    public String getInOutSeq() {
        return inOutSeq;
    }

    /**
     * @param p IN_OUT_SEQ
     */
    public void setInOutSeq(final String p) {
        this.inOutSeq = p;
    }

    /** ROUTING_GROUP */
    @jakarta.validation.constraints.Size(max = 2)
    private String routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    public String getRoutingGroup() {
        return routingGroup;
    }

    /**
     * @param p ROUTING_GROUP
     */
    public void setRoutingGroup(final String p) {
        this.routingGroup = p;
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

    /** IN_OUT_KB */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String inOutKb;

    /**
     * @return IN_OUT_KB
     */
    public String getInOutKb() {
        return inOutKb;
    }

    /**
     * @param p IN_OUT_KB
     */
    public void setInOutKb(final String p) {
        this.inOutKb = p;
    }

    /** IN_OUT_QT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 11)
    private String inOutQt;

    /**
     * @return IN_OUT_QT
     */
    public String getInOutQt() {
        return inOutQt;
    }

    /**
     * @param p IN_OUT_QT
     */
    public void setInOutQt(final String p) {
        this.inOutQt = p;
    }

    /** INV_CMT */
    @jakarta.validation.constraints.Size(max = 25)
    private String invCmt;

    /**
     * @return INV_CMT
     */
    public String getInvCmt() {
        return invCmt;
    }

    /**
     * @param p INV_CMT
     */
    public void setInvCmt(final String p) {
        this.invCmt = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
