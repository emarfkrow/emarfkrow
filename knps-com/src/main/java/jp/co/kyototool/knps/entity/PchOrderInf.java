package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_ORDER_INF
 *
 * @author emarfkrow
 */
public class PchOrderInf implements IEntity {

    /** ORDER_NO */
    private String orderNo;

    /**
     * @return ORDER_NO
     */
    public String getOrderNo() {
        return this.orderNo;
    }

    /**
     * @param o ORDER_NO
     */
    public void setOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderNo = String.valueOf(o.toString());
        } else {
            this.orderNo = null;
        }
    }

    /** ORDER_KBN */
    private java.math.BigDecimal orderKbn;

    /**
     * @return ORDER_KBN
     */
    public java.math.BigDecimal getOrderKbn() {
        return this.orderKbn;
    }

    /**
     * @param o ORDER_KBN
     */
    public void setOrderKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.orderKbn = null;
        }
    }

    /** ORDER_ID */
    private String orderId;

    /**
     * @return ORDER_ID
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @param o ORDER_ID
     */
    public void setOrderId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderId = String.valueOf(o.toString());
        } else {
            this.orderId = null;
        }
    }

    /** ARRANGE_KBN */
    private String arrangeKbn;

    /**
     * @return ARRANGE_KBN
     */
    public String getArrangeKbn() {
        return this.arrangeKbn;
    }

    /**
     * @param o ARRANGE_KBN
     */
    public void setArrangeKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.arrangeKbn = String.valueOf(o.toString());
        } else {
            this.arrangeKbn = null;
        }
    }

    /** KANBAN_ID */
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    public String getKanbanId() {
        return this.kanbanId;
    }

    /**
     * @param o KANBAN_ID
     */
    public void setKanbanId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanId = String.valueOf(o.toString());
        } else {
            this.kanbanId = null;
        }
    }

    /** SERIAL_NO */
    private java.math.BigDecimal serialNo;

    /**
     * @return SERIAL_NO
     */
    public java.math.BigDecimal getSerialNo() {
        return this.serialNo;
    }

    /**
     * @param o SERIAL_NO
     */
    public void setSerialNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.serialNo = new java.math.BigDecimal(o.toString());
        } else {
            this.serialNo = null;
        }
    }

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    public java.math.BigDecimal getRouting() {
        return this.routing;
    }

    /**
     * @param o ROUTING
     */
    public void setRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing = new java.math.BigDecimal(o.toString());
        } else {
            this.routing = null;
        }
    }

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return this.wcCode;
    }

    /**
     * @param o WC_CODE
     */
    public void setWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcCode = String.valueOf(o.toString());
        } else {
            this.wcCode = null;
        }
    }

    /** OPE_DETAIL */
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return this.opeDetail;
    }

    /**
     * @param o OPE_DETAIL
     */
    public void setOpeDetail(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeDetail = String.valueOf(o.toString());
        } else {
            this.opeDetail = null;
        }
    }

    /** COMMENT1 */
    private String comment1;

    /**
     * @return COMMENT1
     */
    public String getComment1() {
        return this.comment1;
    }

    /**
     * @param o COMMENT1
     */
    public void setComment1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment1 = String.valueOf(o.toString());
        } else {
            this.comment1 = null;
        }
    }

    /** COMMENT2 */
    private String comment2;

    /**
     * @return COMMENT2
     */
    public String getComment2() {
        return this.comment2;
    }

    /**
     * @param o COMMENT2
     */
    public void setComment2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment2 = String.valueOf(o.toString());
        } else {
            this.comment2 = null;
        }
    }

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** ORDER_COUNTS */
    private java.math.BigDecimal orderCounts;

    /**
     * @return ORDER_COUNTS
     */
    public java.math.BigDecimal getOrderCounts() {
        return this.orderCounts;
    }

    /**
     * @param o ORDER_COUNTS
     */
    public void setOrderCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.orderCounts = null;
        }
    }

    /** UNIT_CODE */
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    public String getUnitCode() {
        return this.unitCode;
    }

    /**
     * @param o UNIT_CODE
     */
    public void setUnitCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCode = String.valueOf(o.toString());
        } else {
            this.unitCode = null;
        }
    }

    /** MEMO */
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @param o MEMO
     */
    public void setMemo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.memo = String.valueOf(o.toString());
        } else {
            this.memo = null;
        }
    }

    /** PERIOD */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime period;

    /**
     * @return PERIOD
     */
    public java.time.LocalDateTime getPeriod() {
        return this.period;
    }

    /**
     * @param o PERIOD
     */
    public void setPeriod(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.period = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.period = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.period = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.period = null;
        }
    }

    /** PERIOD_CHG */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime periodChg;

    /**
     * @return PERIOD_CHG
     */
    public java.time.LocalDateTime getPeriodChg() {
        return this.periodChg;
    }

    /**
     * @param o PERIOD_CHG
     */
    public void setPeriodChg(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.periodChg = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.periodChg = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.periodChg = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.periodChg = null;
        }
    }

    /** ORDER_LT */
    private java.math.BigDecimal orderLt;

    /**
     * @return ORDER_LT
     */
    public java.math.BigDecimal getOrderLt() {
        return this.orderLt;
    }

    /**
     * @param o ORDER_LT
     */
    public void setOrderLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderLt = new java.math.BigDecimal(o.toString());
        } else {
            this.orderLt = null;
        }
    }

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return this.supCode;
    }

    /**
     * @param o SUP_CODE
     */
    public void setSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supCode = String.valueOf(o.toString());
        } else {
            this.supCode = null;
        }
    }

    /** SUBINV_CODE */
    private String subinvCode;

    /**
     * @return SUBINV_CODE
     */
    public String getSubinvCode() {
        return this.subinvCode;
    }

    /**
     * @param o SUBINV_CODE
     */
    public void setSubinvCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.subinvCode = String.valueOf(o.toString());
        } else {
            this.subinvCode = null;
        }
    }

    /** SHIP_CODE */
    private String shipCode;

    /**
     * @return SHIP_CODE
     */
    public String getShipCode() {
        return this.shipCode;
    }

    /**
     * @param o SHIP_CODE
     */
    public void setShipCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipCode = String.valueOf(o.toString());
        } else {
            this.shipCode = null;
        }
    }

    /** ORDER_UNIT */
    private java.math.BigDecimal orderUnit;

    /**
     * @return ORDER_UNIT
     */
    public java.math.BigDecimal getOrderUnit() {
        return this.orderUnit;
    }

    /**
     * @param o ORDER_UNIT
     */
    public void setOrderUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.orderUnit = null;
        }
    }

    /** ACCEPT_KBN */
    private java.math.BigDecimal acceptKbn;

    /**
     * @return ACCEPT_KBN
     */
    public java.math.BigDecimal getAcceptKbn() {
        return this.acceptKbn;
    }

    /**
     * @param o ACCEPT_KBN
     */
    public void setAcceptKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.acceptKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.acceptKbn = null;
        }
    }

    /** INSPECT_LANE */
    private java.math.BigDecimal inspectLane;

    /**
     * @return INSPECT_LANE
     */
    public java.math.BigDecimal getInspectLane() {
        return this.inspectLane;
    }

    /**
     * @param o INSPECT_LANE
     */
    public void setInspectLane(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectLane = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectLane = null;
        }
    }

    /** INSPECT_KBN */
    private java.math.BigDecimal inspectKbn;

    /**
     * @return INSPECT_KBN
     */
    public java.math.BigDecimal getInspectKbn() {
        return this.inspectKbn;
    }

    /**
     * @param o INSPECT_KBN
     */
    public void setInspectKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectKbn = null;
        }
    }

    /** REQUEST_REGIST */
    private String requestRegist;

    /**
     * @return REQUEST_REGIST
     */
    public String getRequestRegist() {
        return this.requestRegist;
    }

    /**
     * @param o REQUEST_REGIST
     */
    public void setRequestRegist(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.requestRegist = String.valueOf(o.toString());
        } else {
            this.requestRegist = null;
        }
    }

    /** REQUEST_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime requestDate;

    /**
     * @return REQUEST_DATE
     */
    public java.time.LocalDateTime getRequestDate() {
        return this.requestDate;
    }

    /**
     * @param o REQUEST_DATE
     */
    public void setRequestDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.requestDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.requestDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.requestDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.requestDate = null;
        }
    }

    /** ORDER_REGIST */
    private String orderRegist;

    /**
     * @return ORDER_REGIST
     */
    public String getOrderRegist() {
        return this.orderRegist;
    }

    /**
     * @param o ORDER_REGIST
     */
    public void setOrderRegist(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderRegist = String.valueOf(o.toString());
        } else {
            this.orderRegist = null;
        }
    }

    /** ORDER_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime orderDate;

    /**
     * @return ORDER_DATE
     */
    public java.time.LocalDateTime getOrderDate() {
        return this.orderDate;
    }

    /**
     * @param o ORDER_DATE
     */
    public void setOrderDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.orderDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.orderDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.orderDate = null;
        }
    }

    /** ORDER_STATUS */
    private java.math.BigDecimal orderStatus;

    /**
     * @return ORDER_STATUS
     */
    public java.math.BigDecimal getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @param o ORDER_STATUS
     */
    public void setOrderStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.orderStatus = null;
        }
    }

    /** ACCEPT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime acceptDate;

    /**
     * @return ACCEPT_DATE
     */
    public java.time.LocalDateTime getAcceptDate() {
        return this.acceptDate;
    }

    /**
     * @param o ACCEPT_DATE
     */
    public void setAcceptDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.acceptDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.acceptDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.acceptDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.acceptDate = null;
        }
    }

    /** ACCEPT_REGIST */
    private String acceptRegist;

    /**
     * @return ACCEPT_REGIST
     */
    public String getAcceptRegist() {
        return this.acceptRegist;
    }

    /**
     * @param o ACCEPT_REGIST
     */
    public void setAcceptRegist(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.acceptRegist = String.valueOf(o.toString());
        } else {
            this.acceptRegist = null;
        }
    }

    /** ACCEPT_COUNTS */
    private java.math.BigDecimal acceptCounts;

    /**
     * @return ACCEPT_COUNTS
     */
    public java.math.BigDecimal getAcceptCounts() {
        return this.acceptCounts;
    }

    /**
     * @param o ACCEPT_COUNTS
     */
    public void setAcceptCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.acceptCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.acceptCounts = null;
        }
    }

    /** INSPECT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime inspectDate;

    /**
     * @return INSPECT_DATE
     */
    public java.time.LocalDateTime getInspectDate() {
        return this.inspectDate;
    }

    /**
     * @param o INSPECT_DATE
     */
    public void setInspectDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.inspectDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.inspectDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.inspectDate = null;
        }
    }

    /** INSPECT_REGIST */
    private String inspectRegist;

    /**
     * @return INSPECT_REGIST
     */
    public String getInspectRegist() {
        return this.inspectRegist;
    }

    /**
     * @param o INSPECT_REGIST
     */
    public void setInspectRegist(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectRegist = String.valueOf(o.toString());
        } else {
            this.inspectRegist = null;
        }
    }

    /** INSPECT_COUNTS */
    private java.math.BigDecimal inspectCounts;

    /**
     * @return INSPECT_COUNTS
     */
    public java.math.BigDecimal getInspectCounts() {
        return this.inspectCounts;
    }

    /**
     * @param o INSPECT_COUNTS
     */
    public void setInspectCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectCounts = null;
        }
    }

    /** GOOD_COUNTS */
    private java.math.BigDecimal goodCounts;

    /**
     * @return GOOD_COUNTS
     */
    public java.math.BigDecimal getGoodCounts() {
        return this.goodCounts;
    }

    /**
     * @param o GOOD_COUNTS
     */
    public void setGoodCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.goodCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.goodCounts = null;
        }
    }

    /** REJECT_COUNTS */
    private java.math.BigDecimal rejectCounts;

    /**
     * @return REJECT_COUNTS
     */
    public java.math.BigDecimal getRejectCounts() {
        return this.rejectCounts;
    }

    /**
     * @param o REJECT_COUNTS
     */
    public void setRejectCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rejectCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.rejectCounts = null;
        }
    }

    /** INSPECT_UNIT */
    private java.math.BigDecimal inspectUnit;

    /**
     * @return INSPECT_UNIT
     */
    public java.math.BigDecimal getInspectUnit() {
        return this.inspectUnit;
    }

    /**
     * @param o INSPECT_UNIT
     */
    public void setInspectUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectUnit = null;
        }
    }

    /** REJECT_REASON */
    private String rejectReason;

    /**
     * @return REJECT_REASON
     */
    public String getRejectReason() {
        return this.rejectReason;
    }

    /**
     * @param o REJECT_REASON
     */
    public void setRejectReason(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rejectReason = String.valueOf(o.toString());
        } else {
            this.rejectReason = null;
        }
    }

    /** RETURN_REASON */
    private String returnReason;

    /**
     * @return RETURN_REASON
     */
    public String getReturnReason() {
        return this.returnReason;
    }

    /**
     * @param o RETURN_REASON
     */
    public void setReturnReason(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.returnReason = String.valueOf(o.toString());
        } else {
            this.returnReason = null;
        }
    }

    /** PERIOD_CHG_COUNTS */
    private java.math.BigDecimal periodChgCounts;

    /**
     * @return PERIOD_CHG_COUNTS
     */
    public java.math.BigDecimal getPeriodChgCounts() {
        return this.periodChgCounts;
    }

    /**
     * @param o PERIOD_CHG_COUNTS
     */
    public void setPeriodChgCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.periodChgCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.periodChgCounts = null;
        }
    }

    /** OUTPUT_STATUS */
    private java.math.BigDecimal outputStatus;

    /**
     * @return OUTPUT_STATUS
     */
    public java.math.BigDecimal getOutputStatus() {
        return this.outputStatus;
    }

    /**
     * @param o OUTPUT_STATUS
     */
    public void setOutputStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.outputStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.outputStatus = null;
        }
    }

    /** SHORT_NO */
    private java.math.BigDecimal shortNo;

    /**
     * @return SHORT_NO
     */
    public java.math.BigDecimal getShortNo() {
        return this.shortNo;
    }

    /**
     * @param o SHORT_NO
     */
    public void setShortNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shortNo = new java.math.BigDecimal(o.toString());
        } else {
            this.shortNo = null;
        }
    }

    /** TIME_STAMP_CREATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampCreate;

    /**
     * @return TIME_STAMP_CREATE
     */
    public java.time.LocalDateTime getTimeStampCreate() {
        return this.timeStampCreate;
    }

    /**
     * @param o TIME_STAMP_CREATE
     */
    public void setTimeStampCreate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampCreate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampCreate = null;
        }
    }

    /** TIME_STAMP_CHANGE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampChange;

    /**
     * @return TIME_STAMP_CHANGE
     */
    public java.time.LocalDateTime getTimeStampChange() {
        return this.timeStampChange;
    }

    /**
     * @param o TIME_STAMP_CHANGE
     */
    public void setTimeStampChange(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampChange = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampChange = null;
        }
    }

    /** USER_ID_CREATE */
    private String userIdCreate;

    /**
     * @return USER_ID_CREATE
     */
    public String getUserIdCreate() {
        return this.userIdCreate;
    }

    /**
     * @param o USER_ID_CREATE
     */
    public void setUserIdCreate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdCreate = String.valueOf(o.toString());
        } else {
            this.userIdCreate = null;
        }
    }

    /** USER_ID_CHANGE */
    private String userIdChange;

    /**
     * @return USER_ID_CHANGE
     */
    public String getUserIdChange() {
        return this.userIdChange;
    }

    /**
     * @param o USER_ID_CHANGE
     */
    public void setUserIdChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdChange = String.valueOf(o.toString());
        } else {
            this.userIdChange = null;
        }
    }

    /** ORG_ORDER_UNIT */
    private java.math.BigDecimal orgOrderUnit;

    /**
     * @return ORG_ORDER_UNIT
     */
    public java.math.BigDecimal getOrgOrderUnit() {
        return this.orgOrderUnit;
    }

    /**
     * @param o ORG_ORDER_UNIT
     */
    public void setOrgOrderUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orgOrderUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.orgOrderUnit = null;
        }
    }

    /** MUSHO_HACCHU_F */
    private String mushoHacchuF;

    /**
     * @return MUSHO_HACCHU_F
     */
    public String getMushoHacchuF() {
        return this.mushoHacchuF;
    }

    /**
     * @param o MUSHO_HACCHU_F
     */
    public void setMushoHacchuF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mushoHacchuF = String.valueOf(o.toString());
        } else {
            this.mushoHacchuF = null;
        }
    }

    /** SUP_MEMO */
    private String supMemo;

    /**
     * @return SUP_MEMO
     */
    public String getSupMemo() {
        return this.supMemo;
    }

    /**
     * @param o SUP_MEMO
     */
    public void setSupMemo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supMemo = String.valueOf(o.toString());
        } else {
            this.supMemo = null;
        }
    }

    /** SHIHARAI_HOHO_KBN */
    private String shiharaiHohoKbn;

    /**
     * @return SHIHARAI_HOHO_KBN
     */
    public String getShiharaiHohoKbn() {
        return this.shiharaiHohoKbn;
    }

    /**
     * @param o SHIHARAI_HOHO_KBN
     */
    public void setShiharaiHohoKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shiharaiHohoKbn = String.valueOf(o.toString());
        } else {
            this.shiharaiHohoKbn = null;
        }
    }

    /** ORDER_ISSHIKI_UNIT_F */
    private String orderIsshikiUnitF;

    /**
     * @return ORDER_ISSHIKI_UNIT_F
     */
    public String getOrderIsshikiUnitF() {
        return this.orderIsshikiUnitF;
    }

    /**
     * @param o ORDER_ISSHIKI_UNIT_F
     */
    public void setOrderIsshikiUnitF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderIsshikiUnitF = String.valueOf(o.toString());
        } else {
            this.orderIsshikiUnitF = null;
        }
    }

    /** ORDER_ISSHIKI_COUNTS */
    private java.math.BigDecimal orderIsshikiCounts;

    /**
     * @return ORDER_ISSHIKI_COUNTS
     */
    public java.math.BigDecimal getOrderIsshikiCounts() {
        return this.orderIsshikiCounts;
    }

    /**
     * @param o ORDER_ISSHIKI_COUNTS
     */
    public void setOrderIsshikiCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderIsshikiCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.orderIsshikiCounts = null;
        }
    }

    /** ORDER_ISSHIKI_UNIT */
    private java.math.BigDecimal orderIsshikiUnit;

    /**
     * @return ORDER_ISSHIKI_UNIT
     */
    public java.math.BigDecimal getOrderIsshikiUnit() {
        return this.orderIsshikiUnit;
    }

    /**
     * @param o ORDER_ISSHIKI_UNIT
     */
    public void setOrderIsshikiUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderIsshikiUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.orderIsshikiUnit = null;
        }
    }

    /** INSPECT_ISSHIKI_UNIT_F */
    private String inspectIsshikiUnitF;

    /**
     * @return INSPECT_ISSHIKI_UNIT_F
     */
    public String getInspectIsshikiUnitF() {
        return this.inspectIsshikiUnitF;
    }

    /**
     * @param o INSPECT_ISSHIKI_UNIT_F
     */
    public void setInspectIsshikiUnitF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectIsshikiUnitF = String.valueOf(o.toString());
        } else {
            this.inspectIsshikiUnitF = null;
        }
    }

    /** INSPECT_ISSHIKI_COUNTS */
    private java.math.BigDecimal inspectIsshikiCounts;

    /**
     * @return INSPECT_ISSHIKI_COUNTS
     */
    public java.math.BigDecimal getInspectIsshikiCounts() {
        return this.inspectIsshikiCounts;
    }

    /**
     * @param o INSPECT_ISSHIKI_COUNTS
     */
    public void setInspectIsshikiCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectIsshikiCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectIsshikiCounts = null;
        }
    }

    /** INSPECT_ISSHIKI_UNIT */
    private java.math.BigDecimal inspectIsshikiUnit;

    /**
     * @return INSPECT_ISSHIKI_UNIT
     */
    public java.math.BigDecimal getInspectIsshikiUnit() {
        return this.inspectIsshikiUnit;
    }

    /**
     * @param o INSPECT_ISSHIKI_UNIT
     */
    public void setInspectIsshikiUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectIsshikiUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectIsshikiUnit = null;
        }
    }

    /** ORG_BASE_ORDER_UNIT */
    private java.math.BigDecimal orgBaseOrderUnit;

    /**
     * @return ORG_BASE_ORDER_UNIT
     */
    public java.math.BigDecimal getOrgBaseOrderUnit() {
        return this.orgBaseOrderUnit;
    }

    /**
     * @param o ORG_BASE_ORDER_UNIT
     */
    public void setOrgBaseOrderUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orgBaseOrderUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.orgBaseOrderUnit = null;
        }
    }

    /** ORG_MIN_ORDER_AMOUNT */
    private java.math.BigDecimal orgMinOrderAmount;

    /**
     * @return ORG_MIN_ORDER_AMOUNT
     */
    public java.math.BigDecimal getOrgMinOrderAmount() {
        return this.orgMinOrderAmount;
    }

    /**
     * @param o ORG_MIN_ORDER_AMOUNT
     */
    public void setOrgMinOrderAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orgMinOrderAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.orgMinOrderAmount = null;
        }
    }

    /**
     * PCH_ORDER_INF照会
     *
     * @param param1 ORDER_NO
     * @return PCH_ORDER_INF
     */
    public static PchOrderInf get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (order_no) = TRIM (:order_no)");

        String sql = "SELECT * FROM PCH_ORDER_INF WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("order_no", param1);

        return Queries.get(sql, params, PchOrderInf.class);
    }

    /**
     * PCH_ORDER_INF追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ORDER_NOの採番処理
        numbering();

        // PCH_ORDER_INFの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("order_no -- :order_no");
        nameList.add("order_kbn -- :order_kbn");
        nameList.add("order_id -- :order_id");
        nameList.add("arrange_kbn -- :arrange_kbn");
        nameList.add("kanban_id -- :kanban_id");
        nameList.add("serial_no -- :serial_no");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("comment1 -- :comment1");
        nameList.add("comment2 -- :comment2");
        nameList.add("hinban -- :hinban");
        nameList.add("order_counts -- :order_counts");
        nameList.add("unit_code -- :unit_code");
        nameList.add("memo -- :memo");
        nameList.add("period -- :period");
        nameList.add("period_chg -- :period_chg");
        nameList.add("order_lt -- :order_lt");
        nameList.add("sup_code -- :sup_code");
        nameList.add("subinv_code -- :subinv_code");
        nameList.add("ship_code -- :ship_code");
        nameList.add("order_unit -- :order_unit");
        nameList.add("accept_kbn -- :accept_kbn");
        nameList.add("inspect_lane -- :inspect_lane");
        nameList.add("inspect_kbn -- :inspect_kbn");
        nameList.add("request_regist -- :request_regist");
        nameList.add("request_date -- :request_date");
        nameList.add("order_regist -- :order_regist");
        nameList.add("order_date -- :order_date");
        nameList.add("order_status -- :order_status");
        nameList.add("accept_date -- :accept_date");
        nameList.add("accept_regist -- :accept_regist");
        nameList.add("accept_counts -- :accept_counts");
        nameList.add("inspect_date -- :inspect_date");
        nameList.add("inspect_regist -- :inspect_regist");
        nameList.add("inspect_counts -- :inspect_counts");
        nameList.add("good_counts -- :good_counts");
        nameList.add("reject_counts -- :reject_counts");
        nameList.add("inspect_unit -- :inspect_unit");
        nameList.add("reject_reason -- :reject_reason");
        nameList.add("return_reason -- :return_reason");
        nameList.add("period_chg_counts -- :period_chg_counts");
        nameList.add("output_status -- :output_status");
        nameList.add("short_no -- :short_no");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("org_order_unit -- :org_order_unit");
        nameList.add("musho_hacchu_f -- :musho_hacchu_f");
        nameList.add("sup_memo -- :sup_memo");
        nameList.add("shiharai_hoho_kbn -- :shiharai_hoho_kbn");
        nameList.add("order_isshiki_unit_f -- :order_isshiki_unit_f");
        nameList.add("order_isshiki_counts -- :order_isshiki_counts");
        nameList.add("order_isshiki_unit -- :order_isshiki_unit");
        nameList.add("inspect_isshiki_unit_f -- :inspect_isshiki_unit_f");
        nameList.add("inspect_isshiki_counts -- :inspect_isshiki_counts");
        nameList.add("inspect_isshiki_unit -- :inspect_isshiki_unit");
        nameList.add("org_base_order_unit -- :org_base_order_unit");
        nameList.add("org_min_order_amount -- :org_min_order_amount");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_ORDER_INF(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":order_no");
        valueList.add(":order_kbn");
        valueList.add(":order_id");
        valueList.add(":arrange_kbn");
        valueList.add(":kanban_id");
        valueList.add(":serial_no");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":ope_detail");
        valueList.add(":comment1");
        valueList.add(":comment2");
        valueList.add(":hinban");
        valueList.add(":order_counts");
        valueList.add(":unit_code");
        valueList.add(":memo");
        valueList.add("TO_TIMESTAMP (:period, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:period_chg, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":order_lt");
        valueList.add(":sup_code");
        valueList.add(":subinv_code");
        valueList.add(":ship_code");
        valueList.add(":order_unit");
        valueList.add(":accept_kbn");
        valueList.add(":inspect_lane");
        valueList.add(":inspect_kbn");
        valueList.add(":request_regist");
        valueList.add("TO_TIMESTAMP (:request_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":order_regist");
        valueList.add("TO_TIMESTAMP (:order_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":order_status");
        valueList.add("TO_TIMESTAMP (:accept_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":accept_regist");
        valueList.add(":accept_counts");
        valueList.add("TO_TIMESTAMP (:inspect_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":inspect_regist");
        valueList.add(":inspect_counts");
        valueList.add(":good_counts");
        valueList.add(":reject_counts");
        valueList.add(":inspect_unit");
        valueList.add(":reject_reason");
        valueList.add(":return_reason");
        valueList.add(":period_chg_counts");
        valueList.add(":output_status");
        valueList.add(":short_no");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":org_order_unit");
        valueList.add(":musho_hacchu_f");
        valueList.add(":sup_memo");
        valueList.add(":shiharai_hoho_kbn");
        valueList.add(":order_isshiki_unit_f");
        valueList.add(":order_isshiki_counts");
        valueList.add(":order_isshiki_unit");
        valueList.add(":inspect_isshiki_unit_f");
        valueList.add(":inspect_isshiki_counts");
        valueList.add(":inspect_isshiki_unit");
        valueList.add(":org_base_order_unit");
        valueList.add(":org_min_order_amount");
        return String.join("\r\n    , ", valueList);
    }

    /** ORDER_NOの採番処理 */
    private void numbering() {

        if (this.orderNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.ORDER_NO) IS NULL THEN 0 ELSE MAX(e.ORDER_NO) * 1 END + 1, 10, '0') AS ORDER_NO FROM PCH_ORDER_INF e WHERE e.ORDER_NO < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("ORDER_NO");

        this.setOrderNo(o);
    }

    /**
     * PCH_ORDER_INF更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_ORDER_INFの登録
        String sql = "UPDATE PCH_ORDER_INF\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("order_no = :order_no");
        setList.add("order_kbn = :order_kbn");
        setList.add("order_id = :order_id");
        setList.add("arrange_kbn = :arrange_kbn");
        setList.add("kanban_id = :kanban_id");
        setList.add("serial_no = :serial_no");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("ope_detail = :ope_detail");
        setList.add("comment1 = :comment1");
        setList.add("comment2 = :comment2");
        setList.add("hinban = :hinban");
        setList.add("order_counts = :order_counts");
        setList.add("unit_code = :unit_code");
        setList.add("memo = :memo");
        setList.add("period = TO_TIMESTAMP (:period, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("period_chg = TO_TIMESTAMP (:period_chg, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("order_lt = :order_lt");
        setList.add("sup_code = :sup_code");
        setList.add("subinv_code = :subinv_code");
        setList.add("ship_code = :ship_code");
        setList.add("order_unit = :order_unit");
        setList.add("accept_kbn = :accept_kbn");
        setList.add("inspect_lane = :inspect_lane");
        setList.add("inspect_kbn = :inspect_kbn");
        setList.add("request_regist = :request_regist");
        setList.add("request_date = TO_TIMESTAMP (:request_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("order_regist = :order_regist");
        setList.add("order_date = TO_TIMESTAMP (:order_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("order_status = :order_status");
        setList.add("accept_date = TO_TIMESTAMP (:accept_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("accept_regist = :accept_regist");
        setList.add("accept_counts = :accept_counts");
        setList.add("inspect_date = TO_TIMESTAMP (:inspect_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("inspect_regist = :inspect_regist");
        setList.add("inspect_counts = :inspect_counts");
        setList.add("good_counts = :good_counts");
        setList.add("reject_counts = :reject_counts");
        setList.add("inspect_unit = :inspect_unit");
        setList.add("reject_reason = :reject_reason");
        setList.add("return_reason = :return_reason");
        setList.add("period_chg_counts = :period_chg_counts");
        setList.add("output_status = :output_status");
        setList.add("short_no = :short_no");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("org_order_unit = :org_order_unit");
        setList.add("musho_hacchu_f = :musho_hacchu_f");
        setList.add("sup_memo = :sup_memo");
        setList.add("shiharai_hoho_kbn = :shiharai_hoho_kbn");
        setList.add("order_isshiki_unit_f = :order_isshiki_unit_f");
        setList.add("order_isshiki_counts = :order_isshiki_counts");
        setList.add("order_isshiki_unit = :order_isshiki_unit");
        setList.add("inspect_isshiki_unit_f = :inspect_isshiki_unit_f");
        setList.add("inspect_isshiki_counts = :inspect_isshiki_counts");
        setList.add("inspect_isshiki_unit = :inspect_isshiki_unit");
        setList.add("org_base_order_unit = :org_base_order_unit");
        setList.add("org_min_order_amount = :org_min_order_amount");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_ORDER_INF削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_ORDER_INFの削除
        String sql = "DELETE FROM PCH_ORDER_INF WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (order_no) = TRIM (:order_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ORDER_NO", this.orderNo);
        params.put("ORDER_KBN", this.orderKbn);
        params.put("ORDER_ID", this.orderId);
        params.put("ARRANGE_KBN", this.arrangeKbn);
        params.put("KANBAN_ID", this.kanbanId);
        params.put("SERIAL_NO", this.serialNo);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("COMMENT1", this.comment1);
        params.put("COMMENT2", this.comment2);
        params.put("HINBAN", this.hinban);
        params.put("ORDER_COUNTS", this.orderCounts);
        params.put("UNIT_CODE", this.unitCode);
        params.put("MEMO", this.memo);
        params.put("PERIOD", this.period);
        params.put("PERIOD_CHG", this.periodChg);
        params.put("ORDER_LT", this.orderLt);
        params.put("SUP_CODE", this.supCode);
        params.put("SUBINV_CODE", this.subinvCode);
        params.put("SHIP_CODE", this.shipCode);
        params.put("ORDER_UNIT", this.orderUnit);
        params.put("ACCEPT_KBN", this.acceptKbn);
        params.put("INSPECT_LANE", this.inspectLane);
        params.put("INSPECT_KBN", this.inspectKbn);
        params.put("REQUEST_REGIST", this.requestRegist);
        params.put("REQUEST_DATE", this.requestDate);
        params.put("ORDER_REGIST", this.orderRegist);
        params.put("ORDER_DATE", this.orderDate);
        params.put("ORDER_STATUS", this.orderStatus);
        params.put("ACCEPT_DATE", this.acceptDate);
        params.put("ACCEPT_REGIST", this.acceptRegist);
        params.put("ACCEPT_COUNTS", this.acceptCounts);
        params.put("INSPECT_DATE", this.inspectDate);
        params.put("INSPECT_REGIST", this.inspectRegist);
        params.put("INSPECT_COUNTS", this.inspectCounts);
        params.put("GOOD_COUNTS", this.goodCounts);
        params.put("REJECT_COUNTS", this.rejectCounts);
        params.put("INSPECT_UNIT", this.inspectUnit);
        params.put("REJECT_REASON", this.rejectReason);
        params.put("RETURN_REASON", this.returnReason);
        params.put("PERIOD_CHG_COUNTS", this.periodChgCounts);
        params.put("OUTPUT_STATUS", this.outputStatus);
        params.put("SHORT_NO", this.shortNo);
        params.put("ORG_ORDER_UNIT", this.orgOrderUnit);
        params.put("MUSHO_HACCHU_F", this.mushoHacchuF);
        params.put("SUP_MEMO", this.supMemo);
        params.put("SHIHARAI_HOHO_KBN", this.shiharaiHohoKbn);
        params.put("ORDER_ISSHIKI_UNIT_F", this.orderIsshikiUnitF);
        params.put("ORDER_ISSHIKI_COUNTS", this.orderIsshikiCounts);
        params.put("ORDER_ISSHIKI_UNIT", this.orderIsshikiUnit);
        params.put("INSPECT_ISSHIKI_UNIT_F", this.inspectIsshikiUnitF);
        params.put("INSPECT_ISSHIKI_COUNTS", this.inspectIsshikiCounts);
        params.put("INSPECT_ISSHIKI_UNIT", this.inspectIsshikiUnit);
        params.put("ORG_BASE_ORDER_UNIT", this.orgBaseOrderUnit);
        params.put("ORG_MIN_ORDER_AMOUNT", this.orgMinOrderAmount);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
