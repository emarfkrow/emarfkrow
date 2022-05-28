package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_PRO_ACT_HED登録フォーム
 *
 * @author emarfkrow
 */
public class MfgProActHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgProActHedRegistForm.class);

    /** PRO_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return proNo;
    }

    /**
     * @param p PRO_NO
     */
    public void setProNo(final String p) {
        this.proNo = p;
    }

    /** PRO_ROUTING_BRANCH */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String proRoutingBranch;

    /**
     * @return PRO_ROUTING_BRANCH
     */
    public String getProRoutingBranch() {
        return proRoutingBranch;
    }

    /**
     * @param p PRO_ROUTING_BRANCH
     */
    public void setProRoutingBranch(final String p) {
        this.proRoutingBranch = p;
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

    /** CHARGE_NO */
    @jakarta.validation.constraints.Size(max = 2)
    private String chargeNo;

    /**
     * @return CHARGE_NO
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * @param p CHARGE_NO
     */
    public void setChargeNo(final String p) {
        this.chargeNo = p;
    }

    /** MAC_CODE */
    @jakarta.validation.constraints.Size(max = 4)
    private String macCode;

    /**
     * @return MAC_CODE
     */
    public String getMacCode() {
        return macCode;
    }

    /**
     * @param p MAC_CODE
     */
    public void setMacCode(final String p) {
        this.macCode = p;
    }

    /** HUM_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 6)
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
    @jakarta.validation.constraints.Size(max = 6)
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
    @jakarta.validation.constraints.Size(max = 6)
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
    @jakarta.validation.constraints.Size(max = 6)
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

    /** GOOD_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String goodCounts;

    /**
     * @return GOOD_COUNTS
     */
    public String getGoodCounts() {
        return goodCounts;
    }

    /**
     * @param p GOOD_COUNTS
     */
    public void setGoodCounts(final String p) {
        this.goodCounts = p;
    }

    /** REJECT_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String rejectCounts;

    /**
     * @return REJECT_COUNTS
     */
    public String getRejectCounts() {
        return rejectCounts;
    }

    /**
     * @param p REJECT_COUNTS
     */
    public void setRejectCounts(final String p) {
        this.rejectCounts = p;
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

    /** ACT_LT */
    @jakarta.validation.constraints.Size(max = 8)
    private String actLt;

    /**
     * @return ACT_LT
     */
    public String getActLt() {
        return actLt;
    }

    /**
     * @param p ACT_LT
     */
    public void setActLt(final String p) {
        this.actLt = p;
    }

    /** ACT_WAIT_TIME */
    @jakarta.validation.constraints.Size(max = 8)
    private String actWaitTime;

    /**
     * @return ACT_WAIT_TIME
     */
    public String getActWaitTime() {
        return actWaitTime;
    }

    /**
     * @param p ACT_WAIT_TIME
     */
    public void setActWaitTime(final String p) {
        this.actWaitTime = p;
    }

    /** EXP_WAIT_TIME */
    @jakarta.validation.constraints.Size(max = 8)
    private String expWaitTime;

    /**
     * @return EXP_WAIT_TIME
     */
    public String getExpWaitTime() {
        return expWaitTime;
    }

    /**
     * @param p EXP_WAIT_TIME
     */
    public void setExpWaitTime(final String p) {
        this.expWaitTime = p;
    }

    /** EXP_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expPreTime;

    /**
     * @return EXP_PRE_TIME
     */
    public String getExpPreTime() {
        return expPreTime;
    }

    /**
     * @param p EXP_PRE_TIME
     */
    public void setExpPreTime(final String p) {
        this.expPreTime = p;
    }

    /** EXP_PRO_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expProTime;

    /**
     * @return EXP_PRO_TIME
     */
    public String getExpProTime() {
        return expProTime;
    }

    /**
     * @param p EXP_PRO_TIME
     */
    public void setExpProTime(final String p) {
        this.expProTime = p;
    }

    /** EXP_REST_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expRestTime;

    /**
     * @return EXP_REST_TIME
     */
    public String getExpRestTime() {
        return expRestTime;
    }

    /**
     * @param p EXP_REST_TIME
     */
    public void setExpRestTime(final String p) {
        this.expRestTime = p;
    }

    /** EXP_CHOKO_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expChokoTime;

    /**
     * @return EXP_CHOKO_TIME
     */
    public String getExpChokoTime() {
        return expChokoTime;
    }

    /**
     * @param p EXP_CHOKO_TIME
     */
    public void setExpChokoTime(final String p) {
        this.expChokoTime = p;
    }

    /** EXP_TROUB_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expTroubTime;

    /**
     * @return EXP_TROUB_TIME
     */
    public String getExpTroubTime() {
        return expTroubTime;
    }

    /**
     * @param p EXP_TROUB_TIME
     */
    public void setExpTroubTime(final String p) {
        this.expTroubTime = p;
    }

    /** EXP_SELF_MOD_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expSelfModTime;

    /**
     * @return EXP_SELF_MOD_TIME
     */
    public String getExpSelfModTime() {
        return expSelfModTime;
    }

    /**
     * @param p EXP_SELF_MOD_TIME
     */
    public void setExpSelfModTime(final String p) {
        this.expSelfModTime = p;
    }

    /** EXP_OTHR_MOD_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expOthrModTime;

    /**
     * @return EXP_OTHR_MOD_TIME
     */
    public String getExpOthrModTime() {
        return expOthrModTime;
    }

    /**
     * @param p EXP_OTHR_MOD_TIME
     */
    public void setExpOthrModTime(final String p) {
        this.expOthrModTime = p;
    }

    /** EXP_ETC_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expEtcTime;

    /**
     * @return EXP_ETC_TIME
     */
    public String getExpEtcTime() {
        return expEtcTime;
    }

    /**
     * @param p EXP_ETC_TIME
     */
    public void setExpEtcTime(final String p) {
        this.expEtcTime = p;
    }

    /** SET_STOCK_NOTICE */
    @jakarta.validation.constraints.Size(max = 1)
    private String setStockNotice;

    /**
     * @return SET_STOCK_NOTICE
     */
    public String getSetStockNotice() {
        return setStockNotice;
    }

    /**
     * @param p SET_STOCK_NOTICE
     */
    public void setSetStockNotice(final String p) {
        this.setStockNotice = p;
    }

    /** PRO_STOCK_NOTICE */
    @jakarta.validation.constraints.Size(max = 1)
    private String proStockNotice;

    /**
     * @return PRO_STOCK_NOTICE
     */
    public String getProStockNotice() {
        return proStockNotice;
    }

    /**
     * @param p PRO_STOCK_NOTICE
     */
    public void setProStockNotice(final String p) {
        this.proStockNotice = p;
    }

    /** VOLUME_WEIGHT */
    @jakarta.validation.constraints.Size(max = 11)
    private String volumeWeight;

    /**
     * @return VOLUME_WEIGHT
     */
    public String getVolumeWeight() {
        return volumeWeight;
    }

    /**
     * @param p VOLUME_WEIGHT
     */
    public void setVolumeWeight(final String p) {
        this.volumeWeight = p;
    }

    /** BEG_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String begDate;

    /**
     * @return BEG_DATE
     */
    public String getBegDate() {
        return begDate;
    }

    /**
     * @param p BEG_DATE
     */
    public void setBegDate(final String p) {
        this.begDate = p;
    }

    /** END_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String endDate;

    /**
     * @return END_DATE
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param p END_DATE
     */
    public void setEndDate(final String p) {
        this.endDate = p;
    }

    /** END_MATERIAL_WEIGHT */
    @jakarta.validation.constraints.Size(max = 11)
    private String endMaterialWeight;

    /**
     * @return END_MATERIAL_WEIGHT
     */
    public String getEndMaterialWeight() {
        return endMaterialWeight;
    }

    /**
     * @param p END_MATERIAL_WEIGHT
     */
    public void setEndMaterialWeight(final String p) {
        this.endMaterialWeight = p;
    }

    /** MFG_PRO_ACT_DET */
    @jakarta.validation.Valid
    private List<MfgProActDetRegistForm> mfgProActDetGrid;

    /**
     * @return MFG_PRO_ACT_DET
     */
    public List<MfgProActDetRegistForm> getMfgProActDetGrid() {
        return mfgProActDetGrid;
    }

    /**
     * @param p
     */
    public void setMfgProActDetGrid(final List<MfgProActDetRegistForm> p) {
        this.mfgProActDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
