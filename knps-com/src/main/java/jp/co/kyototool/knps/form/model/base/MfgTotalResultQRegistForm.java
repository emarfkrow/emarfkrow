package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_RESULT_Q登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalResultQRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalResultQRegistForm.class);

    /** RESULT_DATE */
    @jakarta.validation.constraints.Size(max = 6)
    private String resultDate;

    /**
     * @return RESULT_DATE
     */
    public String getResultDate() {
        return resultDate;
    }

    /**
     * @param p RESULT_DATE
     */
    public void setResultDate(final String p) {
        this.resultDate = p;
    }

    /** PRO_GROUP_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String proGroupNo;

    /**
     * @return PRO_GROUP_NO
     */
    public String getProGroupNo() {
        return proGroupNo;
    }

    /**
     * @param p PRO_GROUP_NO
     */
    public void setProGroupNo(final String p) {
        this.proGroupNo = p;
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

    /** ROUTING */
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

    /** HUM_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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
    @jakarta.validation.constraints.Size(max = 8)
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

    /** PRO_COUNTS */
    @jakarta.validation.constraints.Size(max = 3)
    private String proCounts;

    /**
     * @return PRO_COUNTS
     */
    public String getProCounts() {
        return proCounts;
    }

    /**
     * @param p PRO_COUNTS
     */
    public void setProCounts(final String p) {
        this.proCounts = p;
    }

    /** LAST_ROUTING */
    @jakarta.validation.constraints.Size(max = 1)
    private String lastRouting;

    /**
     * @return LAST_ROUTING
     */
    public String getLastRouting() {
        return lastRouting;
    }

    /**
     * @param p LAST_ROUTING
     */
    public void setLastRouting(final String p) {
        this.lastRouting = p;
    }

    /** MFG_TOTAL_RESULT_Y */
    @jakarta.validation.Valid
    private MfgTotalResultYRegistForm mfgTotalResultYRegistForm;

    /**
     * @return MfgTotalResultYRegistForm
     */
    public MfgTotalResultYRegistForm getMfgTotalResultYRegistForm() {
        return mfgTotalResultYRegistForm;
    }

    /**
     * @param p
     */
    public void setMfgTotalResultYRegistForm(final MfgTotalResultYRegistForm p) {
        this.mfgTotalResultYRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
