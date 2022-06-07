package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * HKTC_PRD_DAILY_PRO_PLAN_ARR
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanArr implements IEntity {

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_NO")
    public String getProNo() {
        return this.proNo;
    }

    /**
     * @param o PRO_NO
     */
    public void setProNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNo = String.valueOf(o.toString());
        } else {
            this.proNo = null;
        }
    }

    /** CHILD_PLAN_NO */
    private String childPlanNo;

    /**
     * @return CHILD_PLAN_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHILD_PLAN_NO")
    public String getChildPlanNo() {
        return this.childPlanNo;
    }

    /**
     * @param o CHILD_PLAN_NO
     */
    public void setChildPlanNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.childPlanNo = String.valueOf(o.toString());
        } else {
            this.childPlanNo = null;
        }
    }

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING")
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
    @com.fasterxml.jackson.annotation.JsonProperty("WC_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_DETAIL")
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

    /** MAC_LOAD_KBN */
    private java.math.BigDecimal macLoadKbn;

    /**
     * @return MAC_LOAD_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_LOAD_KBN")
    public java.math.BigDecimal getMacLoadKbn() {
        return this.macLoadKbn;
    }

    /**
     * @param o MAC_LOAD_KBN
     */
    public void setMacLoadKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macLoadKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.macLoadKbn = null;
        }
    }

    /** HUM_PRE_TIME */
    private java.math.BigDecimal humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_PRE_TIME")
    public java.math.BigDecimal getHumPreTime() {
        return this.humPreTime;
    }

    /**
     * @param o HUM_PRE_TIME
     */
    public void setHumPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humPreTime = null;
        }
    }

    /** HUM_ACT_TIME */
    private java.math.BigDecimal humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_ACT_TIME")
    public java.math.BigDecimal getHumActTime() {
        return this.humActTime;
    }

    /**
     * @param o HUM_ACT_TIME
     */
    public void setHumActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humActTime = null;
        }
    }

    /** MAC_PRE_TIME */
    private java.math.BigDecimal macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_PRE_TIME")
    public java.math.BigDecimal getMacPreTime() {
        return this.macPreTime;
    }

    /**
     * @param o MAC_PRE_TIME
     */
    public void setMacPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTime = null;
        }
    }

    /** MAC_ACT_TIME */
    private java.math.BigDecimal macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_ACT_TIME")
    public java.math.BigDecimal getMacActTime() {
        return this.macActTime;
    }

    /**
     * @param o MAC_ACT_TIME
     */
    public void setMacActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTime = null;
        }
    }

    /** COMMENT1 */
    private String comment1;

    /**
     * @return COMMENT1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMMENT1")
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
    @com.fasterxml.jackson.annotation.JsonProperty("COMMENT2")
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

    /** UNIT_WEIGHT */
    private java.math.BigDecimal unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_WEIGHT")
    public java.math.BigDecimal getUnitWeight() {
        return this.unitWeight;
    }

    /**
     * @param o UNIT_WEIGHT
     */
    public void setUnitWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.unitWeight = null;
        }
    }

    /** NECK_FLAG */
    private java.math.BigDecimal neckFlag;

    /**
     * @return NECK_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NECK_FLAG")
    public java.math.BigDecimal getNeckFlag() {
        return this.neckFlag;
    }

    /**
     * @param o NECK_FLAG
     */
    public void setNeckFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.neckFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.neckFlag = null;
        }
    }

    /** NEXT_ROUT_PRO_NO */
    private String nextRoutProNo;

    /**
     * @return NEXT_ROUT_PRO_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NEXT_ROUT_PRO_NO")
    public String getNextRoutProNo() {
        return this.nextRoutProNo;
    }

    /**
     * @param o NEXT_ROUT_PRO_NO
     */
    public void setNextRoutProNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nextRoutProNo = String.valueOf(o.toString());
        } else {
            this.nextRoutProNo = null;
        }
    }

    /** INITIAL_BEG_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime initialBegDate;

    /**
     * @return INITIAL_BEG_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("INITIAL_BEG_DATE")
    public java.time.LocalDateTime getInitialBegDate() {
        return this.initialBegDate;
    }

    /**
     * @param o INITIAL_BEG_DATE
     */
    public void setInitialBegDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.initialBegDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.initialBegDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.initialBegDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.initialBegDate = null;
        }
    }

    /** INITIAL_END_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime initialEndDate;

    /**
     * @return INITIAL_END_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("INITIAL_END_DATE")
    public java.time.LocalDateTime getInitialEndDate() {
        return this.initialEndDate;
    }

    /**
     * @param o INITIAL_END_DATE
     */
    public void setInitialEndDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.initialEndDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.initialEndDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.initialEndDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.initialEndDate = null;
        }
    }

    /** BEG_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime begDate;

    /**
     * @return BEG_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BEG_DATE")
    public java.time.LocalDateTime getBegDate() {
        return this.begDate;
    }

    /**
     * @param o BEG_DATE
     */
    public void setBegDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.begDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.begDate = null;
        }
    }

    /** END_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime endDate;

    /**
     * @return END_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("END_DATE")
    public java.time.LocalDateTime getEndDate() {
        return this.endDate;
    }

    /**
     * @param o END_DATE
     */
    public void setEndDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.endDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.endDate = null;
        }
    }

    /** START_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime startDate;

    /**
     * @return START_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("START_DATE")
    public java.time.LocalDateTime getStartDate() {
        return this.startDate;
    }

    /**
     * @param o START_DATE
     */
    public void setStartDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.startDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.startDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.startDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.startDate = null;
        }
    }

    /** COMP_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime compDate;

    /**
     * @return COMP_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMP_DATE")
    public java.time.LocalDateTime getCompDate() {
        return this.compDate;
    }

    /**
     * @param o COMP_DATE
     */
    public void setCompDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.compDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.compDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.compDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.compDate = null;
        }
    }

    /** OPE_WC_CODE */
    private String opeWcCode;

    /**
     * @return OPE_WC_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_WC_CODE")
    public String getOpeWcCode() {
        return this.opeWcCode;
    }

    /**
     * @param o OPE_WC_CODE
     */
    public void setOpeWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeWcCode = String.valueOf(o.toString());
        } else {
            this.opeWcCode = null;
        }
    }

    /** PRO_STATUS */
    private java.math.BigDecimal proStatus;

    /**
     * @return PRO_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_STATUS")
    public java.math.BigDecimal getProStatus() {
        return this.proStatus;
    }

    /**
     * @param o PRO_STATUS
     */
    public void setProStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.proStatus = null;
        }
    }

    /** DEL_CAN_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime delCanDate;

    /**
     * @return DEL_CAN_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DEL_CAN_DATE")
    public java.time.LocalDateTime getDelCanDate() {
        return this.delCanDate;
    }

    /**
     * @param o DEL_CAN_DATE
     */
    public void setDelCanDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.delCanDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.delCanDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.delCanDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.delCanDate = null;
        }
    }

    /** EXP_FLAG */
    private java.math.BigDecimal expFlag;

    /**
     * @return EXP_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_FLAG")
    public java.math.BigDecimal getExpFlag() {
        return this.expFlag;
    }

    /**
     * @param o EXP_FLAG
     */
    public void setExpFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.expFlag = null;
        }
    }

    /** VISIBLE_FLAG */
    private java.math.BigDecimal visibleFlag;

    /**
     * @return VISIBLE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("VISIBLE_FLAG")
    public java.math.BigDecimal getVisibleFlag() {
        return this.visibleFlag;
    }

    /**
     * @param o VISIBLE_FLAG
     */
    public void setVisibleFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.visibleFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.visibleFlag = null;
        }
    }

    /** SUP_FLAG */
    private java.math.BigDecimal supFlag;

    /**
     * @return SUP_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_FLAG")
    public java.math.BigDecimal getSupFlag() {
        return this.supFlag;
    }

    /**
     * @param o SUP_FLAG
     */
    public void setSupFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.supFlag = null;
        }
    }

    /** SHORT_NO */
    private java.math.BigDecimal shortNo;

    /**
     * @return SHORT_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHORT_NO")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CHANGE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CHANGE")
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
    public java.math.BigDecimal getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * @param o DELETE_FLAG
     */
    public void setDeleteFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.deleteFlag = null;
        }
    }

    /** NYUKO_FLAG */
    private java.math.BigDecimal nyukoFlag;

    /**
     * @return NYUKO_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NYUKO_FLAG")
    public java.math.BigDecimal getNyukoFlag() {
        return this.nyukoFlag;
    }

    /**
     * @param o NYUKO_FLAG
     */
    public void setNyukoFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nyukoFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.nyukoFlag = null;
        }
    }

    /** GOOD_COUNTS */
    private java.math.BigDecimal goodCounts;

    /**
     * @return GOOD_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GOOD_COUNTS")
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

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_ARR照会
     *
     * @param param1 PRO_NO
     * @return HKTC_PRD_DAILY_PRO_PLAN_ARR
     */
    public static HktcPrdDailyProPlanArr get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_NO\") = TRIM (:pro_no)");

        String sql = "SELECT * FROM HKTC_PRD_DAILY_PRO_PLAN_ARR WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", param1);

        return Queries.get(sql, params, HktcPrdDailyProPlanArr.class);
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_ARR追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRO_NOの採番処理
        numbering();

        // MFG_PRO_ACT_HEDの登録
        if (this.mfgProActHeds != null) {
            for (MfgProActHed mfgProActHed : this.mfgProActHeds) {
                mfgProActHed.setProNo(this.getProNo());
                mfgProActHed.insert(now, id);
            }
        }

        // PRD_DAILY_NECK_LOADの登録
        if (this.prdDailyNeckLoads != null) {
            for (PrdDailyNeckLoad prdDailyNeckLoad : this.prdDailyNeckLoads) {
                prdDailyNeckLoad.setProNo(this.getProNo());
                prdDailyNeckLoad.insert(now, id);
            }
        }

        // PRD_DAILY_PRO_PLAN_ARRの登録
        if (this.prdDailyProPlanArr != null) {
            this.prdDailyProPlanArr.setProNo(this.getProNo());
            this.prdDailyProPlanArr.insert(now, id);
        }

        // HKTC_PRD_DAILY_PRO_PLAN_ARRの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRO_NO\" -- :pro_no");
        nameList.add("\"CHILD_PLAN_NO\" -- :child_plan_no");
        nameList.add("\"ROUTING\" -- :routing");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"OPE_DETAIL\" -- :ope_detail");
        nameList.add("\"MAC_LOAD_KBN\" -- :mac_load_kbn");
        nameList.add("\"HUM_PRE_TIME\" -- :hum_pre_time");
        nameList.add("\"HUM_ACT_TIME\" -- :hum_act_time");
        nameList.add("\"MAC_PRE_TIME\" -- :mac_pre_time");
        nameList.add("\"MAC_ACT_TIME\" -- :mac_act_time");
        nameList.add("\"COMMENT1\" -- :comment1");
        nameList.add("\"COMMENT2\" -- :comment2");
        nameList.add("\"UNIT_WEIGHT\" -- :unit_weight");
        nameList.add("\"NECK_FLAG\" -- :neck_flag");
        nameList.add("\"NEXT_ROUT_PRO_NO\" -- :next_rout_pro_no");
        nameList.add("\"INITIAL_BEG_DATE\" -- :initial_beg_date");
        nameList.add("\"INITIAL_END_DATE\" -- :initial_end_date");
        nameList.add("\"BEG_DATE\" -- :beg_date");
        nameList.add("\"END_DATE\" -- :end_date");
        nameList.add("\"START_DATE\" -- :start_date");
        nameList.add("\"COMP_DATE\" -- :comp_date");
        nameList.add("\"OPE_WC_CODE\" -- :ope_wc_code");
        nameList.add("\"PRO_STATUS\" -- :pro_status");
        nameList.add("\"DEL_CAN_DATE\" -- :del_can_date");
        nameList.add("\"EXP_FLAG\" -- :exp_flag");
        nameList.add("\"VISIBLE_FLAG\" -- :visible_flag");
        nameList.add("\"SUP_FLAG\" -- :sup_flag");
        nameList.add("\"SHORT_NO\" -- :short_no");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"NYUKO_FLAG\" -- :nyuko_flag");
        nameList.add("\"GOOD_COUNTS\" -- :good_counts");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO HKTC_PRD_DAILY_PRO_PLAN_ARR(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pro_no");
        valueList.add(":child_plan_no");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":ope_detail");
        valueList.add(":mac_load_kbn");
        valueList.add(":hum_pre_time");
        valueList.add(":hum_act_time");
        valueList.add(":mac_pre_time");
        valueList.add(":mac_act_time");
        valueList.add(":comment1");
        valueList.add(":comment2");
        valueList.add(":unit_weight");
        valueList.add(":neck_flag");
        valueList.add(":next_rout_pro_no");
        valueList.add("TO_TIMESTAMP (:initial_beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:initial_end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":ope_wc_code");
        valueList.add(":pro_status");
        valueList.add("TO_TIMESTAMP (:del_can_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":exp_flag");
        valueList.add(":visible_flag");
        valueList.add(":sup_flag");
        valueList.add(":short_no");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":nyuko_flag");
        valueList.add(":good_counts");
        return String.join("\r\n    , ", valueList);
    }

    /** PRO_NOの採番処理 */
    private void numbering() {

        if (this.proNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"PRO_NO\") IS NULL THEN 0 ELSE MAX(e.\"PRO_NO\") * 1 END + 1, 14, '0') AS \"PRO_NO\" FROM HKTC_PRD_DAILY_PRO_PLAN_ARR e WHERE e.\"PRO_NO\" < '99999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PRO_NO");

        this.setProNo(o);
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_ARR更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_PRO_ACT_HEDの登録
        if (this.mfgProActHeds != null) {
            for (MfgProActHed mfgProActHed : this.mfgProActHeds) {
                mfgProActHed.setProNo(this.proNo);
                try {
                    mfgProActHed.insert(now, id);
                } catch (Exception e) {
                    mfgProActHed.update(now, id);
                }
            }
            this.mfgProActHeds = null;
            this.referMfgProActHeds();
            if (this.mfgProActHeds != null) {
                for (MfgProActHed mfgProActHed : this.mfgProActHeds) {
                    if (!mfgProActHed.getTimeStampChange().equals(now)) {
                        mfgProActHed.delete();
                    }
                }
            }
        }

        // PRD_DAILY_NECK_LOADの登録
        if (this.prdDailyNeckLoads != null) {
            for (PrdDailyNeckLoad prdDailyNeckLoad : this.prdDailyNeckLoads) {
                prdDailyNeckLoad.setProNo(this.proNo);
                try {
                    prdDailyNeckLoad.insert(now, id);
                } catch (Exception e) {
                    prdDailyNeckLoad.update(now, id);
                }
            }
            this.prdDailyNeckLoads = null;
            this.referPrdDailyNeckLoads();
            if (this.prdDailyNeckLoads != null) {
                for (PrdDailyNeckLoad prdDailyNeckLoad : this.prdDailyNeckLoads) {
                    if (!prdDailyNeckLoad.getTimeStampChange().equals(now)) {
                        prdDailyNeckLoad.delete();
                    }
                }
            }
        }

        // PRD_DAILY_PRO_PLAN_ARRの登録
        if (this.prdDailyProPlanArr != null) {
            prdDailyProPlanArr.setProNo(this.getProNo());
            try {
                prdDailyProPlanArr.insert(now, id);
            } catch (Exception e) {
                prdDailyProPlanArr.update(now, id);
            }
        }

        // HKTC_PRD_DAILY_PRO_PLAN_ARRの登録
        String sql = "UPDATE HKTC_PRD_DAILY_PRO_PLAN_ARR\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRO_NO\" = :pro_no");
        setList.add("\"CHILD_PLAN_NO\" = :child_plan_no");
        setList.add("\"ROUTING\" = :routing");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"OPE_DETAIL\" = :ope_detail");
        setList.add("\"MAC_LOAD_KBN\" = :mac_load_kbn");
        setList.add("\"HUM_PRE_TIME\" = :hum_pre_time");
        setList.add("\"HUM_ACT_TIME\" = :hum_act_time");
        setList.add("\"MAC_PRE_TIME\" = :mac_pre_time");
        setList.add("\"MAC_ACT_TIME\" = :mac_act_time");
        setList.add("\"COMMENT1\" = :comment1");
        setList.add("\"COMMENT2\" = :comment2");
        setList.add("\"UNIT_WEIGHT\" = :unit_weight");
        setList.add("\"NECK_FLAG\" = :neck_flag");
        setList.add("\"NEXT_ROUT_PRO_NO\" = :next_rout_pro_no");
        setList.add("\"INITIAL_BEG_DATE\" = TO_TIMESTAMP (:initial_beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"INITIAL_END_DATE\" = TO_TIMESTAMP (:initial_end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"BEG_DATE\" = TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"END_DATE\" = TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"START_DATE\" = TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"COMP_DATE\" = TO_TIMESTAMP (:comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"OPE_WC_CODE\" = :ope_wc_code");
        setList.add("\"PRO_STATUS\" = :pro_status");
        setList.add("\"DEL_CAN_DATE\" = TO_TIMESTAMP (:del_can_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"EXP_FLAG\" = :exp_flag");
        setList.add("\"VISIBLE_FLAG\" = :visible_flag");
        setList.add("\"SUP_FLAG\" = :sup_flag");
        setList.add("\"SHORT_NO\" = :short_no");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"NYUKO_FLAG\" = :nyuko_flag");
        setList.add("\"GOOD_COUNTS\" = :good_counts");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_ARR削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_PRO_ACT_HEDの削除
        if (this.mfgProActHeds != null) {
            for (MfgProActHed mfgProActHed : this.mfgProActHeds) {
                mfgProActHed.delete();
            }
        }

        // PRD_DAILY_NECK_LOADの削除
        if (this.prdDailyNeckLoads != null) {
            for (PrdDailyNeckLoad prdDailyNeckLoad : this.prdDailyNeckLoads) {
                prdDailyNeckLoad.delete();
            }
        }

        // PRD_DAILY_PRO_PLAN_ARRの削除
        if (this.prdDailyProPlanArr != null) {
            this.prdDailyProPlanArr.delete();
        }

        // HKTC_PRD_DAILY_PRO_PLAN_ARRの削除
        String sql = "DELETE FROM HKTC_PRD_DAILY_PRO_PLAN_ARR WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_NO\") = TRIM (:pro_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", this.proNo);
        params.put("child_plan_no", this.childPlanNo);
        params.put("routing", this.routing);
        params.put("wc_code", this.wcCode);
        params.put("ope_detail", this.opeDetail);
        params.put("mac_load_kbn", this.macLoadKbn);
        params.put("hum_pre_time", this.humPreTime);
        params.put("hum_act_time", this.humActTime);
        params.put("mac_pre_time", this.macPreTime);
        params.put("mac_act_time", this.macActTime);
        params.put("comment1", this.comment1);
        params.put("comment2", this.comment2);
        params.put("unit_weight", this.unitWeight);
        params.put("neck_flag", this.neckFlag);
        params.put("next_rout_pro_no", this.nextRoutProNo);
        params.put("initial_beg_date", this.initialBegDate);
        params.put("initial_end_date", this.initialEndDate);
        params.put("beg_date", this.begDate);
        params.put("end_date", this.endDate);
        params.put("start_date", this.startDate);
        params.put("comp_date", this.compDate);
        params.put("ope_wc_code", this.opeWcCode);
        params.put("pro_status", this.proStatus);
        params.put("del_can_date", this.delCanDate);
        params.put("exp_flag", this.expFlag);
        params.put("visible_flag", this.visibleFlag);
        params.put("sup_flag", this.supFlag);
        params.put("short_no", this.shortNo);
        params.put("delete_flag", this.deleteFlag);
        params.put("nyuko_flag", this.nyukoFlag);
        params.put("good_counts", this.goodCounts);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_DAILY_PRO_PLAN_ARR
     */
    private PrdDailyProPlanArr prdDailyProPlanArr;

    /**
     * @return PRD_DAILY_PRO_PLAN_ARR
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdDailyProPlanArr")
    public PrdDailyProPlanArr getPrdDailyProPlanArr() {
        return this.prdDailyProPlanArr;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN_ARR
     */
    public void setPrdDailyProPlanArr(final PrdDailyProPlanArr p) {
        this.prdDailyProPlanArr = p;
    }

    /**
     * @return PRD_DAILY_PRO_PLAN_ARR
     */
    public PrdDailyProPlanArr referPrdDailyProPlanArr() {
        if (this.prdDailyProPlanArr == null) {
            try {
                this.prdDailyProPlanArr = PrdDailyProPlanArr.get(this.proNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdDailyProPlanArr;
    }

    /**
     * MFG_PRO_ACT_HEDのリスト
     */
    private List<MfgProActHed> mfgProActHeds;

    /**
     * @return MFG_PRO_ACT_HEDのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgProActHeds")
    public List<MfgProActHed> getMfgProActHeds() {
        return this.mfgProActHeds;
    }

    /**
     * @param list MFG_PRO_ACT_HEDのリスト
     */
    public void setMfgProActHeds(final List<MfgProActHed> list) {
        this.mfgProActHeds = list;
    }

    /**
     * @param mfgProActHed
     */
    public void addMfgProActHeds(final MfgProActHed mfgProActHed) {
        if (this.mfgProActHeds == null) {
            this.mfgProActHeds = new ArrayList<MfgProActHed>();
        }
        this.mfgProActHeds.add(mfgProActHed);
    }

    /**
     * @return MFG_PRO_ACT_HEDのリスト
     */
    public List<MfgProActHed> referMfgProActHeds() {
        if (this.mfgProActHeds == null) {
            this.mfgProActHeds = HktcPrdDailyProPlanArr.referMfgProActHeds(this.proNo);
        }
        return this.mfgProActHeds;
    }

    /**
     * @param param1 proNo
     * @return List<MfgProActHed>
     */
    public static List<MfgProActHed> referMfgProActHeds(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("pro_no = :pro_no");

        String sql = "SELECT * FROM MFG_PRO_ACT_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", param1);

        return Queries.select(sql, params, MfgProActHed.class);
    }

    /**
     * PRD_DAILY_NECK_LOADのリスト
     */
    private List<PrdDailyNeckLoad> prdDailyNeckLoads;

    /**
     * @return PRD_DAILY_NECK_LOADのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdDailyNeckLoads")
    public List<PrdDailyNeckLoad> getPrdDailyNeckLoads() {
        return this.prdDailyNeckLoads;
    }

    /**
     * @param list PRD_DAILY_NECK_LOADのリスト
     */
    public void setPrdDailyNeckLoads(final List<PrdDailyNeckLoad> list) {
        this.prdDailyNeckLoads = list;
    }

    /**
     * @param prdDailyNeckLoad
     */
    public void addPrdDailyNeckLoads(final PrdDailyNeckLoad prdDailyNeckLoad) {
        if (this.prdDailyNeckLoads == null) {
            this.prdDailyNeckLoads = new ArrayList<PrdDailyNeckLoad>();
        }
        this.prdDailyNeckLoads.add(prdDailyNeckLoad);
    }

    /**
     * @return PRD_DAILY_NECK_LOADのリスト
     */
    public List<PrdDailyNeckLoad> referPrdDailyNeckLoads() {
        if (this.prdDailyNeckLoads == null) {
            this.prdDailyNeckLoads = HktcPrdDailyProPlanArr.referPrdDailyNeckLoads(this.proNo);
        }
        return this.prdDailyNeckLoads;
    }

    /**
     * @param param1 proNo
     * @return List<PrdDailyNeckLoad>
     */
    public static List<PrdDailyNeckLoad> referPrdDailyNeckLoads(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("pro_no = :pro_no");

        String sql = "SELECT * FROM PRD_DAILY_NECK_LOAD WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", param1);

        return Queries.select(sql, params, PrdDailyNeckLoad.class);
    }
}
