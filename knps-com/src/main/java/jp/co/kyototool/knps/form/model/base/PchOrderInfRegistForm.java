package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_ORDER_INF登録フォーム
 *
 * @author emarfkrow
 */
public class PchOrderInfRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchOrderInfRegistForm.class);

    /** ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String orderNo;

    /**
     * @return ORDER_NO
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param p ORDER_NO
     */
    public void setOrderNo(final String p) {
        this.orderNo = p;
    }

    /** ORDER_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String orderKbn;

    /**
     * @return ORDER_KBN
     */
    public String getOrderKbn() {
        return orderKbn;
    }

    /**
     * @param p ORDER_KBN
     */
    public void setOrderKbn(final String p) {
        this.orderKbn = p;
    }

    /** ORDER_ID */
    @jakarta.validation.constraints.Size(max = 14)
    private String orderId;

    /**
     * @return ORDER_ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param p ORDER_ID
     */
    public void setOrderId(final String p) {
        this.orderId = p;
    }

    /** ARRANGE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String arrangeKbn;

    /**
     * @return ARRANGE_KBN
     */
    public String getArrangeKbn() {
        return arrangeKbn;
    }

    /**
     * @param p ARRANGE_KBN
     */
    public void setArrangeKbn(final String p) {
        this.arrangeKbn = p;
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

    /** MEMO */
    @jakarta.validation.constraints.Size(max = 30)
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p MEMO
     */
    public void setMemo(final String p) {
        this.memo = p;
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

    /** PERIOD_CHG */
    @jakarta.validation.constraints.Size(max = 7)
    private String periodChg;

    /**
     * @return PERIOD_CHG
     */
    public String getPeriodChg() {
        return periodChg;
    }

    /**
     * @param p PERIOD_CHG
     */
    public void setPeriodChg(final String p) {
        this.periodChg = p;
    }

    /** ORDER_LT */
    @jakarta.validation.constraints.Size(max = 9)
    private String orderLt;

    /**
     * @return ORDER_LT
     */
    public String getOrderLt() {
        return orderLt;
    }

    /**
     * @param p ORDER_LT
     */
    public void setOrderLt(final String p) {
        this.orderLt = p;
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

    /** SUBINV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subinvCode;

    /**
     * @return SUBINV_CODE
     */
    public String getSubinvCode() {
        return subinvCode;
    }

    /**
     * @param p SUBINV_CODE
     */
    public void setSubinvCode(final String p) {
        this.subinvCode = p;
    }

    /** SHIP_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String shipCode;

    /**
     * @return SHIP_CODE
     */
    public String getShipCode() {
        return shipCode;
    }

    /**
     * @param p SHIP_CODE
     */
    public void setShipCode(final String p) {
        this.shipCode = p;
    }

    /** ORDER_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String orderUnit;

    /**
     * @return ORDER_UNIT
     */
    public String getOrderUnit() {
        return orderUnit;
    }

    /**
     * @param p ORDER_UNIT
     */
    public void setOrderUnit(final String p) {
        this.orderUnit = p;
    }

    /** ACCEPT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String acceptKbn;

    /**
     * @return ACCEPT_KBN
     */
    public String getAcceptKbn() {
        return acceptKbn;
    }

    /**
     * @param p ACCEPT_KBN
     */
    public void setAcceptKbn(final String p) {
        this.acceptKbn = p;
    }

    /** INSPECT_LANE */
    @jakarta.validation.constraints.Size(max = 1)
    private String inspectLane;

    /**
     * @return INSPECT_LANE
     */
    public String getInspectLane() {
        return inspectLane;
    }

    /**
     * @param p INSPECT_LANE
     */
    public void setInspectLane(final String p) {
        this.inspectLane = p;
    }

    /** INSPECT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String inspectKbn;

    /**
     * @return INSPECT_KBN
     */
    public String getInspectKbn() {
        return inspectKbn;
    }

    /**
     * @param p INSPECT_KBN
     */
    public void setInspectKbn(final String p) {
        this.inspectKbn = p;
    }

    /** REQUEST_REGIST */
    @jakarta.validation.constraints.Size(max = 10)
    private String requestRegist;

    /**
     * @return REQUEST_REGIST
     */
    public String getRequestRegist() {
        return requestRegist;
    }

    /**
     * @param p REQUEST_REGIST
     */
    public void setRequestRegist(final String p) {
        this.requestRegist = p;
    }

    /** REQUEST_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String requestDate;

    /**
     * @return REQUEST_DATE
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * @param p REQUEST_DATE
     */
    public void setRequestDate(final String p) {
        this.requestDate = p;
    }

    /** ORDER_REGIST */
    @jakarta.validation.constraints.Size(max = 10)
    private String orderRegist;

    /**
     * @return ORDER_REGIST
     */
    public String getOrderRegist() {
        return orderRegist;
    }

    /**
     * @param p ORDER_REGIST
     */
    public void setOrderRegist(final String p) {
        this.orderRegist = p;
    }

    /** ORDER_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String orderDate;

    /**
     * @return ORDER_DATE
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param p ORDER_DATE
     */
    public void setOrderDate(final String p) {
        this.orderDate = p;
    }

    /** ORDER_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String orderStatus;

    /**
     * @return ORDER_STATUS
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param p ORDER_STATUS
     */
    public void setOrderStatus(final String p) {
        this.orderStatus = p;
    }

    /** ACCEPT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String acceptDate;

    /**
     * @return ACCEPT_DATE
     */
    public String getAcceptDate() {
        return acceptDate;
    }

    /**
     * @param p ACCEPT_DATE
     */
    public void setAcceptDate(final String p) {
        this.acceptDate = p;
    }

    /** ACCEPT_REGIST */
    @jakarta.validation.constraints.Size(max = 10)
    private String acceptRegist;

    /**
     * @return ACCEPT_REGIST
     */
    public String getAcceptRegist() {
        return acceptRegist;
    }

    /**
     * @param p ACCEPT_REGIST
     */
    public void setAcceptRegist(final String p) {
        this.acceptRegist = p;
    }

    /** ACCEPT_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String acceptCounts;

    /**
     * @return ACCEPT_COUNTS
     */
    public String getAcceptCounts() {
        return acceptCounts;
    }

    /**
     * @param p ACCEPT_COUNTS
     */
    public void setAcceptCounts(final String p) {
        this.acceptCounts = p;
    }

    /** INSPECT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String inspectDate;

    /**
     * @return INSPECT_DATE
     */
    public String getInspectDate() {
        return inspectDate;
    }

    /**
     * @param p INSPECT_DATE
     */
    public void setInspectDate(final String p) {
        this.inspectDate = p;
    }

    /** INSPECT_REGIST */
    @jakarta.validation.constraints.Size(max = 10)
    private String inspectRegist;

    /**
     * @return INSPECT_REGIST
     */
    public String getInspectRegist() {
        return inspectRegist;
    }

    /**
     * @param p INSPECT_REGIST
     */
    public void setInspectRegist(final String p) {
        this.inspectRegist = p;
    }

    /** INSPECT_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String inspectCounts;

    /**
     * @return INSPECT_COUNTS
     */
    public String getInspectCounts() {
        return inspectCounts;
    }

    /**
     * @param p INSPECT_COUNTS
     */
    public void setInspectCounts(final String p) {
        this.inspectCounts = p;
    }

    /** GOOD_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
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
    @jakarta.validation.constraints.Size(max = 11)
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

    /** INSPECT_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String inspectUnit;

    /**
     * @return INSPECT_UNIT
     */
    public String getInspectUnit() {
        return inspectUnit;
    }

    /**
     * @param p INSPECT_UNIT
     */
    public void setInspectUnit(final String p) {
        this.inspectUnit = p;
    }

    /** REJECT_REASON */
    @jakarta.validation.constraints.Size(max = 3)
    private String rejectReason;

    /**
     * @return REJECT_REASON
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * @param p REJECT_REASON
     */
    public void setRejectReason(final String p) {
        this.rejectReason = p;
    }

    /** RETURN_REASON */
    @jakarta.validation.constraints.Size(max = 3)
    private String returnReason;

    /**
     * @return RETURN_REASON
     */
    public String getReturnReason() {
        return returnReason;
    }

    /**
     * @param p RETURN_REASON
     */
    public void setReturnReason(final String p) {
        this.returnReason = p;
    }

    /** PERIOD_CHG_COUNTS */
    @jakarta.validation.constraints.Size(max = 2)
    private String periodChgCounts;

    /**
     * @return PERIOD_CHG_COUNTS
     */
    public String getPeriodChgCounts() {
        return periodChgCounts;
    }

    /**
     * @param p PERIOD_CHG_COUNTS
     */
    public void setPeriodChgCounts(final String p) {
        this.periodChgCounts = p;
    }

    /** OUTPUT_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String outputStatus;

    /**
     * @return OUTPUT_STATUS
     */
    public String getOutputStatus() {
        return outputStatus;
    }

    /**
     * @param p OUTPUT_STATUS
     */
    public void setOutputStatus(final String p) {
        this.outputStatus = p;
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

    /** ORG_ORDER_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String orgOrderUnit;

    /**
     * @return ORG_ORDER_UNIT
     */
    public String getOrgOrderUnit() {
        return orgOrderUnit;
    }

    /**
     * @param p ORG_ORDER_UNIT
     */
    public void setOrgOrderUnit(final String p) {
        this.orgOrderUnit = p;
    }

    /** MUSHO_HACCHU_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String mushoHacchuF;

    /**
     * @return MUSHO_HACCHU_F
     */
    public String getMushoHacchuF() {
        return mushoHacchuF;
    }

    /**
     * @param p MUSHO_HACCHU_F
     */
    public void setMushoHacchuF(final String p) {
        this.mushoHacchuF = p;
    }

    /** SUP_MEMO */
    @jakarta.validation.constraints.Size(max = 30)
    private String supMemo;

    /**
     * @return SUP_MEMO
     */
    public String getSupMemo() {
        return supMemo;
    }

    /**
     * @param p SUP_MEMO
     */
    public void setSupMemo(final String p) {
        this.supMemo = p;
    }

    /** SHIHARAI_HOHO_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String shiharaiHohoKbn;

    /**
     * @return SHIHARAI_HOHO_KBN
     */
    public String getShiharaiHohoKbn() {
        return shiharaiHohoKbn;
    }

    /**
     * @param p SHIHARAI_HOHO_KBN
     */
    public void setShiharaiHohoKbn(final String p) {
        this.shiharaiHohoKbn = p;
    }

    /** ORDER_ISSHIKI_UNIT_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String orderIsshikiUnitF;

    /**
     * @return ORDER_ISSHIKI_UNIT_F
     */
    public String getOrderIsshikiUnitF() {
        return orderIsshikiUnitF;
    }

    /**
     * @param p ORDER_ISSHIKI_UNIT_F
     */
    public void setOrderIsshikiUnitF(final String p) {
        this.orderIsshikiUnitF = p;
    }

    /** ORDER_ISSHIKI_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String orderIsshikiCounts;

    /**
     * @return ORDER_ISSHIKI_COUNTS
     */
    public String getOrderIsshikiCounts() {
        return orderIsshikiCounts;
    }

    /**
     * @param p ORDER_ISSHIKI_COUNTS
     */
    public void setOrderIsshikiCounts(final String p) {
        this.orderIsshikiCounts = p;
    }

    /** ORDER_ISSHIKI_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String orderIsshikiUnit;

    /**
     * @return ORDER_ISSHIKI_UNIT
     */
    public String getOrderIsshikiUnit() {
        return orderIsshikiUnit;
    }

    /**
     * @param p ORDER_ISSHIKI_UNIT
     */
    public void setOrderIsshikiUnit(final String p) {
        this.orderIsshikiUnit = p;
    }

    /** INSPECT_ISSHIKI_UNIT_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String inspectIsshikiUnitF;

    /**
     * @return INSPECT_ISSHIKI_UNIT_F
     */
    public String getInspectIsshikiUnitF() {
        return inspectIsshikiUnitF;
    }

    /**
     * @param p INSPECT_ISSHIKI_UNIT_F
     */
    public void setInspectIsshikiUnitF(final String p) {
        this.inspectIsshikiUnitF = p;
    }

    /** INSPECT_ISSHIKI_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String inspectIsshikiCounts;

    /**
     * @return INSPECT_ISSHIKI_COUNTS
     */
    public String getInspectIsshikiCounts() {
        return inspectIsshikiCounts;
    }

    /**
     * @param p INSPECT_ISSHIKI_COUNTS
     */
    public void setInspectIsshikiCounts(final String p) {
        this.inspectIsshikiCounts = p;
    }

    /** INSPECT_ISSHIKI_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String inspectIsshikiUnit;

    /**
     * @return INSPECT_ISSHIKI_UNIT
     */
    public String getInspectIsshikiUnit() {
        return inspectIsshikiUnit;
    }

    /**
     * @param p INSPECT_ISSHIKI_UNIT
     */
    public void setInspectIsshikiUnit(final String p) {
        this.inspectIsshikiUnit = p;
    }

    /** ORG_BASE_ORDER_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String orgBaseOrderUnit;

    /**
     * @return ORG_BASE_ORDER_UNIT
     */
    public String getOrgBaseOrderUnit() {
        return orgBaseOrderUnit;
    }

    /**
     * @param p ORG_BASE_ORDER_UNIT
     */
    public void setOrgBaseOrderUnit(final String p) {
        this.orgBaseOrderUnit = p;
    }

    /** ORG_MIN_ORDER_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String orgMinOrderAmount;

    /**
     * @return ORG_MIN_ORDER_AMOUNT
     */
    public String getOrgMinOrderAmount() {
        return orgMinOrderAmount;
    }

    /**
     * @param p ORG_MIN_ORDER_AMOUNT
     */
    public void setOrgMinOrderAmount(final String p) {
        this.orgMinOrderAmount = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
