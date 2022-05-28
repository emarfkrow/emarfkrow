package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * HKTC_PRD_DAILY_PRO_PLAN_ARR登録フォーム
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanArrRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(HktcPrdDailyProPlanArrRegistForm.class);

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
    @jakarta.validation.constraints.Size(max = 50)
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
    @jakarta.validation.constraints.Size(max = 50)
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

    /** NECK_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String neckFlag;

    /**
     * @return NECK_FLAG
     */
    public String getNeckFlag() {
        return neckFlag;
    }

    /**
     * @param p NECK_FLAG
     */
    public void setNeckFlag(final String p) {
        this.neckFlag = p;
    }

    /** NEXT_ROUT_PRO_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String nextRoutProNo;

    /**
     * @return NEXT_ROUT_PRO_NO
     */
    public String getNextRoutProNo() {
        return nextRoutProNo;
    }

    /**
     * @param p NEXT_ROUT_PRO_NO
     */
    public void setNextRoutProNo(final String p) {
        this.nextRoutProNo = p;
    }

    /** INITIAL_BEG_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String initialBegDate;

    /**
     * @return INITIAL_BEG_DATE
     */
    public String getInitialBegDate() {
        return initialBegDate;
    }

    /**
     * @param p INITIAL_BEG_DATE
     */
    public void setInitialBegDate(final String p) {
        this.initialBegDate = p;
    }

    /** INITIAL_END_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String initialEndDate;

    /**
     * @return INITIAL_END_DATE
     */
    public String getInitialEndDate() {
        return initialEndDate;
    }

    /**
     * @param p INITIAL_END_DATE
     */
    public void setInitialEndDate(final String p) {
        this.initialEndDate = p;
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

    /** START_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String startDate;

    /**
     * @return START_DATE
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param p START_DATE
     */
    public void setStartDate(final String p) {
        this.startDate = p;
    }

    /** COMP_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String compDate;

    /**
     * @return COMP_DATE
     */
    public String getCompDate() {
        return compDate;
    }

    /**
     * @param p COMP_DATE
     */
    public void setCompDate(final String p) {
        this.compDate = p;
    }

    /** OPE_WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String opeWcCode;

    /**
     * @return OPE_WC_CODE
     */
    public String getOpeWcCode() {
        return opeWcCode;
    }

    /**
     * @param p OPE_WC_CODE
     */
    public void setOpeWcCode(final String p) {
        this.opeWcCode = p;
    }

    /** PRO_STATUS */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String proStatus;

    /**
     * @return PRO_STATUS
     */
    public String getProStatus() {
        return proStatus;
    }

    /**
     * @param p PRO_STATUS
     */
    public void setProStatus(final String p) {
        this.proStatus = p;
    }

    /** DEL_CAN_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String delCanDate;

    /**
     * @return DEL_CAN_DATE
     */
    public String getDelCanDate() {
        return delCanDate;
    }

    /**
     * @param p DEL_CAN_DATE
     */
    public void setDelCanDate(final String p) {
        this.delCanDate = p;
    }

    /** EXP_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String expFlag;

    /**
     * @return EXP_FLAG
     */
    public String getExpFlag() {
        return expFlag;
    }

    /**
     * @param p EXP_FLAG
     */
    public void setExpFlag(final String p) {
        this.expFlag = p;
    }

    /** VISIBLE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String visibleFlag;

    /**
     * @return VISIBLE_FLAG
     */
    public String getVisibleFlag() {
        return visibleFlag;
    }

    /**
     * @param p VISIBLE_FLAG
     */
    public void setVisibleFlag(final String p) {
        this.visibleFlag = p;
    }

    /** SUP_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String supFlag;

    /**
     * @return SUP_FLAG
     */
    public String getSupFlag() {
        return supFlag;
    }

    /**
     * @param p SUP_FLAG
     */
    public void setSupFlag(final String p) {
        this.supFlag = p;
    }

    /** SHORT_NO */
    @jakarta.validation.constraints.Size(max = 7)
    private String shortNo;

    /**
     * @return SHORT_NO
     */
    public String getShortNo() {
        return shortNo;
    }

    /**
     * @param p SHORT_NO
     */
    public void setShortNo(final String p) {
        this.shortNo = p;
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

    /** NYUKO_FLAG */
    @jakarta.validation.constraints.Size(max = 2)
    private String nyukoFlag;

    /**
     * @return NYUKO_FLAG
     */
    public String getNyukoFlag() {
        return nyukoFlag;
    }

    /**
     * @param p NYUKO_FLAG
     */
    public void setNyukoFlag(final String p) {
        this.nyukoFlag = p;
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

    /** PRD_DAILY_PRO_PLAN_ARR */
    @jakarta.validation.Valid
    private PrdDailyProPlanArrRegistForm prdDailyProPlanArrRegistForm;

    /**
     * @return PrdDailyProPlanArrRegistForm
     */
    public PrdDailyProPlanArrRegistForm getPrdDailyProPlanArrRegistForm() {
        return prdDailyProPlanArrRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdDailyProPlanArrRegistForm(final PrdDailyProPlanArrRegistForm p) {
        this.prdDailyProPlanArrRegistForm = p;
    }

    /** MFG_PRO_ACT_HED */
    @jakarta.validation.Valid
    private List<MfgProActHedRegistForm> mfgProActHedGrid;

    /**
     * @return MFG_PRO_ACT_HED
     */
    public List<MfgProActHedRegistForm> getMfgProActHedGrid() {
        return mfgProActHedGrid;
    }

    /**
     * @param p
     */
    public void setMfgProActHedGrid(final List<MfgProActHedRegistForm> p) {
        this.mfgProActHedGrid = p;
    }

    /** PRD_DAILY_NECK_LOAD */
    @jakarta.validation.Valid
    private List<PrdDailyNeckLoadRegistForm> prdDailyNeckLoadGrid;

    /**
     * @return PRD_DAILY_NECK_LOAD
     */
    public List<PrdDailyNeckLoadRegistForm> getPrdDailyNeckLoadGrid() {
        return prdDailyNeckLoadGrid;
    }

    /**
     * @param p
     */
    public void setPrdDailyNeckLoadGrid(final List<PrdDailyNeckLoadRegistForm> p) {
        this.prdDailyNeckLoadGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
