package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_PRO_PLAN_ROUTING登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMProPlanRoutingRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMProPlanRoutingRegistForm.class);

    /** YYYY */
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

    /** PRO_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    public String getProHinban() {
        return proHinban;
    }

    /**
     * @param p PRO_HINBAN
     */
    public void setProHinban(final String p) {
        this.proHinban = p;
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

    /** ROUTING_GROUP */
    @jakarta.validation.constraints.NotBlank
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

    /** ROUTING */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routing;

    /**
     * @return ROUTING
     */
    public String getRouting() {
        return routing;
    }

    /**
     * @param p ROUTING
     */
    public void setRouting(final String p) {
        this.routing = p;
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

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** WSCODE */
    @jakarta.validation.constraints.Size(max = 4)
    private String wscode;

    /**
     * @return WSCODE
     */
    public String getWscode() {
        return wscode;
    }

    /**
     * @param p WSCODE
     */
    public void setWscode(final String p) {
        this.wscode = p;
    }

    /** IN_OUT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    public String getInOutKbn() {
        return inOutKbn;
    }

    /**
     * @param p IN_OUT_KBN
     */
    public void setInOutKbn(final String p) {
        this.inOutKbn = p;
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

    /** NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
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

    /** MAC_LOAD_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String macLoadKbn;

    /**
     * @return MAC_LOAD_KBN
     */
    public String getMacLoadKbn() {
        return macLoadKbn;
    }

    /**
     * @param p MAC_LOAD_KBN
     */
    public void setMacLoadKbn(final String p) {
        this.macLoadKbn = p;
    }

    /** HUM_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    public String getHumPreTime() {
        return humPreTime;
    }

    /**
     * @param p HUM_PRE_TIME
     */
    public void setHumPreTime(final String p) {
        this.humPreTime = p;
    }

    /** HUM_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    public String getHumActTime() {
        return humActTime;
    }

    /**
     * @param p HUM_ACT_TIME
     */
    public void setHumActTime(final String p) {
        this.humActTime = p;
    }

    /** MAC_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    public String getMacPreTime() {
        return macPreTime;
    }

    /**
     * @param p MAC_PRE_TIME
     */
    public void setMacPreTime(final String p) {
        this.macPreTime = p;
    }

    /** MAC_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    public String getMacActTime() {
        return macActTime;
    }

    /**
     * @param p MAC_ACT_TIME
     */
    public void setMacActTime(final String p) {
        this.macActTime = p;
    }

    /** COMMENT1 */
    @jakarta.validation.constraints.Size(max = 25)
    private String comment1;

    /**
     * @return COMMENT1
     */
    public String getComment1() {
        return comment1;
    }

    /**
     * @param p COMMENT1
     */
    public void setComment1(final String p) {
        this.comment1 = p;
    }

    /** COMMENT2 */
    @jakarta.validation.constraints.Size(max = 25)
    private String comment2;

    /**
     * @return COMMENT2
     */
    public String getComment2() {
        return comment2;
    }

    /**
     * @param p COMMENT2
     */
    public void setComment2(final String p) {
        this.comment2 = p;
    }

    /** UNIT_WEIGHT */
    @jakarta.validation.constraints.Size(max = 11)
    private String unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
    public String getUnitWeight() {
        return unitWeight;
    }

    /**
     * @param p UNIT_WEIGHT
     */
    public void setUnitWeight(final String p) {
        this.unitWeight = p;
    }

    /** ORDER_UNIT_PRICE */
    @jakarta.validation.constraints.Size(max = 9)
    private String orderUnitPrice;

    /**
     * @return ORDER_UNIT_PRICE
     */
    public String getOrderUnitPrice() {
        return orderUnitPrice;
    }

    /**
     * @param p ORDER_UNIT_PRICE
     */
    public void setOrderUnitPrice(final String p) {
        this.orderUnitPrice = p;
    }

    /** PROC_LT */
    @jakarta.validation.constraints.Size(max = 6)
    private String procLt;

    /**
     * @return PROC_LT
     */
    public String getProcLt() {
        return procLt;
    }

    /**
     * @param p PROC_LT
     */
    public void setProcLt(final String p) {
        this.procLt = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
