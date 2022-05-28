package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_WC_BK登録フォーム
 *
 * @author emarfkrow
 */
public class MstWcBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstWcBkRegistForm.class);

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
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

    /** WC_NAME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String wcName;

    /**
     * @return WC_NAME
     */
    public String getWcName() {
        return wcName;
    }

    /**
     * @param p WC_NAME
     */
    public void setWcName(final String p) {
        this.wcName = p;
    }

    /** NORM_LT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 6)
    private String normLt;

    /**
     * @return NORM_LT
     */
    public String getNormLt() {
        return normLt;
    }

    /**
     * @param p NORM_LT
     */
    public void setNormLt(final String p) {
        this.normLt = p;
    }

    /** MAC_NORM_ABILITY */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String macNormAbility;

    /**
     * @return MAC_NORM_ABILITY
     */
    public String getMacNormAbility() {
        return macNormAbility;
    }

    /**
     * @param p MAC_NORM_ABILITY
     */
    public void setMacNormAbility(final String p) {
        this.macNormAbility = p;
    }

    /** MAC_MAX_ABILITY */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String macMaxAbility;

    /**
     * @return MAC_MAX_ABILITY
     */
    public String getMacMaxAbility() {
        return macMaxAbility;
    }

    /**
     * @param p MAC_MAX_ABILITY
     */
    public void setMacMaxAbility(final String p) {
        this.macMaxAbility = p;
    }

    /** MAC_COUNTS */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String macCounts;

    /**
     * @return MAC_COUNTS
     */
    public String getMacCounts() {
        return macCounts;
    }

    /**
     * @param p MAC_COUNTS
     */
    public void setMacCounts(final String p) {
        this.macCounts = p;
    }

    /** ACT_GATHER_PAT_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String actGatherPatNo;

    /**
     * @return ACT_GATHER_PAT_NO
     */
    public String getActGatherPatNo() {
        return actGatherPatNo;
    }

    /**
     * @param p ACT_GATHER_PAT_NO
     */
    public void setActGatherPatNo(final String p) {
        this.actGatherPatNo = p;
    }

    /** OPE_FORM_PAT_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String opeFormPatNo;

    /**
     * @return OPE_FORM_PAT_NO
     */
    public String getOpeFormPatNo() {
        return opeFormPatNo;
    }

    /**
     * @param p OPE_FORM_PAT_NO
     */
    public void setOpeFormPatNo(final String p) {
        this.opeFormPatNo = p;
    }

    /** DELAY_ALERT_DAYS */
    @jakarta.validation.constraints.Size(max = 3)
    private String delayAlertDays;

    /**
     * @return DELAY_ALERT_DAYS
     */
    public String getDelayAlertDays() {
        return delayAlertDays;
    }

    /**
     * @param p DELAY_ALERT_DAYS
     */
    public void setDelayAlertDays(final String p) {
        this.delayAlertDays = p;
    }

    /** ATO_CONTROL */
    @jakarta.validation.constraints.Size(max = 1)
    private String atoControl;

    /**
     * @return ATO_CONTROL
     */
    public String getAtoControl() {
        return atoControl;
    }

    /**
     * @param p ATO_CONTROL
     */
    public void setAtoControl(final String p) {
        this.atoControl = p;
    }

    /** ROUTING_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String routingCode;

    /**
     * @return ROUTING_CODE
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * @param p ROUTING_CODE
     */
    public void setRoutingCode(final String p) {
        this.routingCode = p;
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

    /** WS_CODE */
    @jakarta.validation.constraints.Size(max = 4)
    private String wsCode;

    /**
     * @return WS_CODE
     */
    public String getWsCode() {
        return wsCode;
    }

    /**
     * @param p WS_CODE
     */
    public void setWsCode(final String p) {
        this.wsCode = p;
    }

    /** COST_CENTER_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String costCenterCode;

    /**
     * @return COST_CENTER_CODE
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * @param p COST_CENTER_CODE
     */
    public void setCostCenterCode(final String p) {
        this.costCenterCode = p;
    }

    /** NECK_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String neckKbn;

    /**
     * @return NECK_KBN
     */
    public String getNeckKbn() {
        return neckKbn;
    }

    /**
     * @param p NECK_KBN
     */
    public void setNeckKbn(final String p) {
        this.neckKbn = p;
    }

    /** SUB_INV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    public String getSubInvCode() {
        return subInvCode;
    }

    /**
     * @param p SUB_INV_CODE
     */
    public void setSubInvCode(final String p) {
        this.subInvCode = p;
    }

    /** STOCK_CONTROL */
    @jakarta.validation.constraints.Size(max = 1)
    private String stockControl;

    /**
     * @return STOCK_CONTROL
     */
    public String getStockControl() {
        return stockControl;
    }

    /**
     * @param p STOCK_CONTROL
     */
    public void setStockControl(final String p) {
        this.stockControl = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** ST_ALERT_RATIO */
    @jakarta.validation.constraints.Size(max = 3)
    private String stAlertRatio;

    /**
     * @return ST_ALERT_RATIO
     */
    public String getStAlertRatio() {
        return stAlertRatio;
    }

    /**
     * @param p ST_ALERT_RATIO
     */
    public void setStAlertRatio(final String p) {
        this.stAlertRatio = p;
    }

    /** ACT_INPUT_TYPE */
    @jakarta.validation.constraints.Size(max = 1)
    private String actInputType;

    /**
     * @return ACT_INPUT_TYPE
     */
    public String getActInputType() {
        return actInputType;
    }

    /**
     * @param p ACT_INPUT_TYPE
     */
    public void setActInputType(final String p) {
        this.actInputType = p;
    }

    /** NICHIJI_SHIME_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String nichijiShimeF;

    /**
     * @return NICHIJI_SHIME_F
     */
    public String getNichijiShimeF() {
        return nichijiShimeF;
    }

    /**
     * @param p NICHIJI_SHIME_F
     */
    public void setNichijiShimeF(final String p) {
        this.nichijiShimeF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
