package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * HKTC_PRD_DAILY_PRO_PLAN_DETAIL登録フォーム
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanDetailRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(HktcPrdDailyProPlanDetailRegistForm.class);

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

    /** PARENT_PLAN_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String parentPlanNo;

    /**
     * @return PARENT_PLAN_NO
     */
    public String getParentPlanNo() {
        return parentPlanNo;
    }

    /**
     * @param p PARENT_PLAN_NO
     */
    public void setParentPlanNo(final String p) {
        this.parentPlanNo = p;
    }

    /** PLAN_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String planNo;

    /**
     * @return PLAN_NO
     */
    public String getPlanNo() {
        return planNo;
    }

    /**
     * @param p PLAN_NO
     */
    public void setPlanNo(final String p) {
        this.planNo = p;
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

    /** LOT_SIZE */
    @jakarta.validation.constraints.Size(max = 6)
    private String lotSize;

    /**
     * @return LOT_SIZE
     */
    public String getLotSize() {
        return lotSize;
    }

    /**
     * @param p LOT_SIZE
     */
    public void setLotSize(final String p) {
        this.lotSize = p;
    }

    /** LOT_SIZE_CHANGE */
    @jakarta.validation.constraints.Size(max = 6)
    private String lotSizeChange;

    /**
     * @return LOT_SIZE_CHANGE
     */
    public String getLotSizeChange() {
        return lotSizeChange;
    }

    /**
     * @param p LOT_SIZE_CHANGE
     */
    public void setLotSizeChange(final String p) {
        this.lotSizeChange = p;
    }

    /** KANBAN_ID */
    @jakarta.validation.constraints.Size(max = 9)
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    public String getKanbanId() {
        return kanbanId;
    }

    /**
     * @param p KANBAN_ID
     */
    public void setKanbanId(final String p) {
        this.kanbanId = p;
    }

    /** SERIAL_NO */
    @jakarta.validation.constraints.Size(max = 4)
    private String serialNo;

    /**
     * @return SERIAL_NO
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param p SERIAL_NO
     */
    public void setSerialNo(final String p) {
        this.serialNo = p;
    }

    /** ROUTING_COUNTS */
    @jakarta.validation.constraints.Size(max = 2)
    private String routingCounts;

    /**
     * @return ROUTING_COUNTS
     */
    public String getRoutingCounts() {
        return routingCounts;
    }

    /**
     * @param p ROUTING_COUNTS
     */
    public void setRoutingCounts(final String p) {
        this.routingCounts = p;
    }

    /** PLAN_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String planStatus;

    /**
     * @return PLAN_STATUS
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * @param p PLAN_STATUS
     */
    public void setPlanStatus(final String p) {
        this.planStatus = p;
    }

    /** PRO_GROUP_NO */
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

    /** OUT_PLAN_TRANS */
    @jakarta.validation.constraints.Size(max = 1)
    private String outPlanTrans;

    /**
     * @return OUT_PLAN_TRANS
     */
    public String getOutPlanTrans() {
        return outPlanTrans;
    }

    /**
     * @param p OUT_PLAN_TRANS
     */
    public void setOutPlanTrans(final String p) {
        this.outPlanTrans = p;
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

    /** PCH_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String pchFlag;

    /**
     * @return PCH_FLAG
     */
    public String getPchFlag() {
        return pchFlag;
    }

    /**
     * @param p PCH_FLAG
     */
    public void setPchFlag(final String p) {
        this.pchFlag = p;
    }

    /** PRINT_ORDER */
    @jakarta.validation.constraints.Size(max = 3)
    private String printOrder;

    /**
     * @return PRINT_ORDER
     */
    public String getPrintOrder() {
        return printOrder;
    }

    /**
     * @param p PRINT_ORDER
     */
    public void setPrintOrder(final String p) {
        this.printOrder = p;
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

    /** MFG_PRO_ACT_STATUS */
    @jakarta.validation.Valid
    private MfgProActStatusRegistForm mfgProActStatusRegistForm;

    /**
     * @return MfgProActStatusRegistForm
     */
    public MfgProActStatusRegistForm getMfgProActStatusRegistForm() {
        return mfgProActStatusRegistForm;
    }

    /**
     * @param p
     */
    public void setMfgProActStatusRegistForm(final MfgProActStatusRegistForm p) {
        this.mfgProActStatusRegistForm = p;
    }

    /** PRD_DAILY_PRO_PLAN_DETAIL */
    @jakarta.validation.Valid
    private PrdDailyProPlanDetailRegistForm prdDailyProPlanDetailRegistForm;

    /**
     * @return PrdDailyProPlanDetailRegistForm
     */
    public PrdDailyProPlanDetailRegistForm getPrdDailyProPlanDetailRegistForm() {
        return prdDailyProPlanDetailRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdDailyProPlanDetailRegistForm(final PrdDailyProPlanDetailRegistForm p) {
        this.prdDailyProPlanDetailRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
