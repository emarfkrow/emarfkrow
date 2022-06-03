package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * SYS_CLOSE_STATUS
 *
 * @author emarfkrow
 */
public class SysCloseStatus implements IEntity {

    /** REC_NO */
    private String recNo;

    /**
     * @return REC_NO
     */
    public String getRecNo() {
        return this.recNo;
    }

    /**
     * @param o REC_NO
     */
    public void setRecNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.recNo = String.valueOf(o.toString());
        } else {
            this.recNo = null;
        }
    }

    /** DAIRY_CLOSE_TARGET_DATE */
    private String dairyCloseTargetDate;

    /**
     * @return DAIRY_CLOSE_TARGET_DATE
     */
    public String getDairyCloseTargetDate() {
        return this.dairyCloseTargetDate;
    }

    /**
     * @param o DAIRY_CLOSE_TARGET_DATE
     */
    public void setDairyCloseTargetDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dairyCloseTargetDate = String.valueOf(o.toString());
        } else {
            this.dairyCloseTargetDate = null;
        }
    }

    /** DAIRY_CLOSE_STATUS */
    private java.math.BigDecimal dairyCloseStatus;

    /**
     * @return DAIRY_CLOSE_STATUS
     */
    public java.math.BigDecimal getDairyCloseStatus() {
        return this.dairyCloseStatus;
    }

    /**
     * @param o DAIRY_CLOSE_STATUS
     */
    public void setDairyCloseStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dairyCloseStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.dairyCloseStatus = null;
        }
    }

    /** DAIRY_CLOSE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime dairyCloseDate;

    /**
     * @return DAIRY_CLOSE_DATE
     */
    public java.time.LocalDateTime getDairyCloseDate() {
        return this.dairyCloseDate;
    }

    /**
     * @param o DAIRY_CLOSE_DATE
     */
    public void setDairyCloseDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.dairyCloseDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.dairyCloseDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dairyCloseDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.dairyCloseDate = null;
        }
    }

    /** MONTHRY_CLOSE_TARGET_DATE */
    private String monthryCloseTargetDate;

    /**
     * @return MONTHRY_CLOSE_TARGET_DATE
     */
    public String getMonthryCloseTargetDate() {
        return this.monthryCloseTargetDate;
    }

    /**
     * @param o MONTHRY_CLOSE_TARGET_DATE
     */
    public void setMonthryCloseTargetDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.monthryCloseTargetDate = String.valueOf(o.toString());
        } else {
            this.monthryCloseTargetDate = null;
        }
    }

    /** MONTHRY_CLOSE_STATUS */
    private java.math.BigDecimal monthryCloseStatus;

    /**
     * @return MONTHRY_CLOSE_STATUS
     */
    public java.math.BigDecimal getMonthryCloseStatus() {
        return this.monthryCloseStatus;
    }

    /**
     * @param o MONTHRY_CLOSE_STATUS
     */
    public void setMonthryCloseStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.monthryCloseStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.monthryCloseStatus = null;
        }
    }

    /** MONTHRY_CLOSE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime monthryCloseDate;

    /**
     * @return MONTHRY_CLOSE_DATE
     */
    public java.time.LocalDateTime getMonthryCloseDate() {
        return this.monthryCloseDate;
    }

    /**
     * @param o MONTHRY_CLOSE_DATE
     */
    public void setMonthryCloseDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.monthryCloseDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.monthryCloseDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.monthryCloseDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.monthryCloseDate = null;
        }
    }

    /** MONTHRY_SETTLE_TARGET_DATE */
    private String monthrySettleTargetDate;

    /**
     * @return MONTHRY_SETTLE_TARGET_DATE
     */
    public String getMonthrySettleTargetDate() {
        return this.monthrySettleTargetDate;
    }

    /**
     * @param o MONTHRY_SETTLE_TARGET_DATE
     */
    public void setMonthrySettleTargetDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.monthrySettleTargetDate = String.valueOf(o.toString());
        } else {
            this.monthrySettleTargetDate = null;
        }
    }

    /** MONTHRY_SETTLE_STATUS */
    private java.math.BigDecimal monthrySettleStatus;

    /**
     * @return MONTHRY_SETTLE_STATUS
     */
    public java.math.BigDecimal getMonthrySettleStatus() {
        return this.monthrySettleStatus;
    }

    /**
     * @param o MONTHRY_SETTLE_STATUS
     */
    public void setMonthrySettleStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.monthrySettleStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.monthrySettleStatus = null;
        }
    }

    /** MONTHRY_SETTLE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime monthrySettleDate;

    /**
     * @return MONTHRY_SETTLE_DATE
     */
    public java.time.LocalDateTime getMonthrySettleDate() {
        return this.monthrySettleDate;
    }

    /**
     * @param o MONTHRY_SETTLE_DATE
     */
    public void setMonthrySettleDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.monthrySettleDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.monthrySettleDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.monthrySettleDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.monthrySettleDate = null;
        }
    }

    /** MONTHRY_SETTLE_COST_FIXED */
    private java.math.BigDecimal monthrySettleCostFixed;

    /**
     * @return MONTHRY_SETTLE_COST_FIXED
     */
    public java.math.BigDecimal getMonthrySettleCostFixed() {
        return this.monthrySettleCostFixed;
    }

    /**
     * @param o MONTHRY_SETTLE_COST_FIXED
     */
    public void setMonthrySettleCostFixed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.monthrySettleCostFixed = new java.math.BigDecimal(o.toString());
        } else {
            this.monthrySettleCostFixed = null;
        }
    }

    /** ANNUAL_SETTLE_TARGET_DATE */
    private String annualSettleTargetDate;

    /**
     * @return ANNUAL_SETTLE_TARGET_DATE
     */
    public String getAnnualSettleTargetDate() {
        return this.annualSettleTargetDate;
    }

    /**
     * @param o ANNUAL_SETTLE_TARGET_DATE
     */
    public void setAnnualSettleTargetDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.annualSettleTargetDate = String.valueOf(o.toString());
        } else {
            this.annualSettleTargetDate = null;
        }
    }

    /** ANNUAL_SETTLE_STATUS */
    private java.math.BigDecimal annualSettleStatus;

    /**
     * @return ANNUAL_SETTLE_STATUS
     */
    public java.math.BigDecimal getAnnualSettleStatus() {
        return this.annualSettleStatus;
    }

    /**
     * @param o ANNUAL_SETTLE_STATUS
     */
    public void setAnnualSettleStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.annualSettleStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.annualSettleStatus = null;
        }
    }

    /** ANNUAL_SETTLE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime annualSettleDate;

    /**
     * @return ANNUAL_SETTLE_DATE
     */
    public java.time.LocalDateTime getAnnualSettleDate() {
        return this.annualSettleDate;
    }

    /**
     * @param o ANNUAL_SETTLE_DATE
     */
    public void setAnnualSettleDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.annualSettleDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.annualSettleDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.annualSettleDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.annualSettleDate = null;
        }
    }

    /** ANNUAL_SETTLE_COST_FIXED */
    private java.math.BigDecimal annualSettleCostFixed;

    /**
     * @return ANNUAL_SETTLE_COST_FIXED
     */
    public java.math.BigDecimal getAnnualSettleCostFixed() {
        return this.annualSettleCostFixed;
    }

    /**
     * @param o ANNUAL_SETTLE_COST_FIXED
     */
    public void setAnnualSettleCostFixed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.annualSettleCostFixed = new java.math.BigDecimal(o.toString());
        } else {
            this.annualSettleCostFixed = null;
        }
    }

    /** MASTER_COPY_FLAG */
    private java.math.BigDecimal masterCopyFlag;

    /**
     * @return MASTER_COPY_FLAG
     */
    public java.math.BigDecimal getMasterCopyFlag() {
        return this.masterCopyFlag;
    }

    /**
     * @param o MASTER_COPY_FLAG
     */
    public void setMasterCopyFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.masterCopyFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.masterCopyFlag = null;
        }
    }

    /** MASTER_COPY_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime masterCopyDate;

    /**
     * @return MASTER_COPY_DATE
     */
    public java.time.LocalDateTime getMasterCopyDate() {
        return this.masterCopyDate;
    }

    /**
     * @param o MASTER_COPY_DATE
     */
    public void setMasterCopyDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.masterCopyDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.masterCopyDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.masterCopyDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.masterCopyDate = null;
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

    /** QUARTER_SETTLE_TARGET_DATE */
    private String quarterSettleTargetDate;

    /**
     * @return QUARTER_SETTLE_TARGET_DATE
     */
    public String getQuarterSettleTargetDate() {
        return this.quarterSettleTargetDate;
    }

    /**
     * @param o QUARTER_SETTLE_TARGET_DATE
     */
    public void setQuarterSettleTargetDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.quarterSettleTargetDate = String.valueOf(o.toString());
        } else {
            this.quarterSettleTargetDate = null;
        }
    }

    /** QUARTER_SETTLE_STATUS */
    private java.math.BigDecimal quarterSettleStatus;

    /**
     * @return QUARTER_SETTLE_STATUS
     */
    public java.math.BigDecimal getQuarterSettleStatus() {
        return this.quarterSettleStatus;
    }

    /**
     * @param o QUARTER_SETTLE_STATUS
     */
    public void setQuarterSettleStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.quarterSettleStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.quarterSettleStatus = null;
        }
    }

    /** QUARTER_SETTLE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime quarterSettleDate;

    /**
     * @return QUARTER_SETTLE_DATE
     */
    public java.time.LocalDateTime getQuarterSettleDate() {
        return this.quarterSettleDate;
    }

    /**
     * @param o QUARTER_SETTLE_DATE
     */
    public void setQuarterSettleDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.quarterSettleDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.quarterSettleDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.quarterSettleDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.quarterSettleDate = null;
        }
    }

    /** QUARTER_SETTLE_COST_FIXED */
    private java.math.BigDecimal quarterSettleCostFixed;

    /**
     * @return QUARTER_SETTLE_COST_FIXED
     */
    public java.math.BigDecimal getQuarterSettleCostFixed() {
        return this.quarterSettleCostFixed;
    }

    /**
     * @param o QUARTER_SETTLE_COST_FIXED
     */
    public void setQuarterSettleCostFixed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.quarterSettleCostFixed = new java.math.BigDecimal(o.toString());
        } else {
            this.quarterSettleCostFixed = null;
        }
    }

    /**
     * SYS_CLOSE_STATUS照会
     *
     * @param param1 REC_NO
     * @return SYS_CLOSE_STATUS
     */
    public static SysCloseStatus get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"REC_NO\") = TRIM (:rec_no)");

        String sql = "SELECT * FROM SYS_CLOSE_STATUS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rec_no", param1);

        return Queries.get(sql, params, SysCloseStatus.class);
    }

    /**
     * SYS_CLOSE_STATUS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // REC_NOの採番処理
        numbering();

        // SYS_CLOSE_STATUSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("rec_no -- :rec_no");
        nameList.add("dairy_close_target_date -- :dairy_close_target_date");
        nameList.add("dairy_close_status -- :dairy_close_status");
        nameList.add("dairy_close_date -- :dairy_close_date");
        nameList.add("monthry_close_target_date -- :monthry_close_target_date");
        nameList.add("monthry_close_status -- :monthry_close_status");
        nameList.add("monthry_close_date -- :monthry_close_date");
        nameList.add("monthry_settle_target_date -- :monthry_settle_target_date");
        nameList.add("monthry_settle_status -- :monthry_settle_status");
        nameList.add("monthry_settle_date -- :monthry_settle_date");
        nameList.add("monthry_settle_cost_fixed -- :monthry_settle_cost_fixed");
        nameList.add("annual_settle_target_date -- :annual_settle_target_date");
        nameList.add("annual_settle_status -- :annual_settle_status");
        nameList.add("annual_settle_date -- :annual_settle_date");
        nameList.add("annual_settle_cost_fixed -- :annual_settle_cost_fixed");
        nameList.add("master_copy_flag -- :master_copy_flag");
        nameList.add("master_copy_date -- :master_copy_date");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("quarter_settle_target_date -- :quarter_settle_target_date");
        nameList.add("quarter_settle_status -- :quarter_settle_status");
        nameList.add("quarter_settle_date -- :quarter_settle_date");
        nameList.add("quarter_settle_cost_fixed -- :quarter_settle_cost_fixed");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO SYS_CLOSE_STATUS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":rec_no");
        valueList.add(":dairy_close_target_date");
        valueList.add(":dairy_close_status");
        valueList.add("TO_TIMESTAMP (:dairy_close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":monthry_close_target_date");
        valueList.add(":monthry_close_status");
        valueList.add("TO_TIMESTAMP (:monthry_close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":monthry_settle_target_date");
        valueList.add(":monthry_settle_status");
        valueList.add("TO_TIMESTAMP (:monthry_settle_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":monthry_settle_cost_fixed");
        valueList.add(":annual_settle_target_date");
        valueList.add(":annual_settle_status");
        valueList.add("TO_TIMESTAMP (:annual_settle_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":annual_settle_cost_fixed");
        valueList.add(":master_copy_flag");
        valueList.add("TO_TIMESTAMP (:master_copy_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":quarter_settle_target_date");
        valueList.add(":quarter_settle_status");
        valueList.add("TO_TIMESTAMP (:quarter_settle_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":quarter_settle_cost_fixed");
        return String.join("\r\n    , ", valueList);
    }

    /** REC_NOの採番処理 */
    private void numbering() {

        if (this.recNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.REC_NO) IS NULL THEN 0 ELSE MAX(e.REC_NO) * 1 END + 1, 3, '0') AS REC_NO FROM SYS_CLOSE_STATUS e WHERE e.REC_NO < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("REC_NO");

        this.setRecNo(o);
    }

    /**
     * SYS_CLOSE_STATUS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // SYS_CLOSE_STATUSの登録
        String sql = "UPDATE SYS_CLOSE_STATUS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("rec_no = :rec_no");
        setList.add("dairy_close_target_date = :dairy_close_target_date");
        setList.add("dairy_close_status = :dairy_close_status");
        setList.add("dairy_close_date = TO_TIMESTAMP (:dairy_close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("monthry_close_target_date = :monthry_close_target_date");
        setList.add("monthry_close_status = :monthry_close_status");
        setList.add("monthry_close_date = TO_TIMESTAMP (:monthry_close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("monthry_settle_target_date = :monthry_settle_target_date");
        setList.add("monthry_settle_status = :monthry_settle_status");
        setList.add("monthry_settle_date = TO_TIMESTAMP (:monthry_settle_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("monthry_settle_cost_fixed = :monthry_settle_cost_fixed");
        setList.add("annual_settle_target_date = :annual_settle_target_date");
        setList.add("annual_settle_status = :annual_settle_status");
        setList.add("annual_settle_date = TO_TIMESTAMP (:annual_settle_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("annual_settle_cost_fixed = :annual_settle_cost_fixed");
        setList.add("master_copy_flag = :master_copy_flag");
        setList.add("master_copy_date = TO_TIMESTAMP (:master_copy_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("quarter_settle_target_date = :quarter_settle_target_date");
        setList.add("quarter_settle_status = :quarter_settle_status");
        setList.add("quarter_settle_date = TO_TIMESTAMP (:quarter_settle_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("quarter_settle_cost_fixed = :quarter_settle_cost_fixed");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * SYS_CLOSE_STATUS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // SYS_CLOSE_STATUSの削除
        String sql = "DELETE FROM SYS_CLOSE_STATUS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (rec_no) = TRIM (:rec_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("REC_NO", this.recNo);
        params.put("DAIRY_CLOSE_TARGET_DATE", this.dairyCloseTargetDate);
        params.put("DAIRY_CLOSE_STATUS", this.dairyCloseStatus);
        params.put("DAIRY_CLOSE_DATE", this.dairyCloseDate);
        params.put("MONTHRY_CLOSE_TARGET_DATE", this.monthryCloseTargetDate);
        params.put("MONTHRY_CLOSE_STATUS", this.monthryCloseStatus);
        params.put("MONTHRY_CLOSE_DATE", this.monthryCloseDate);
        params.put("MONTHRY_SETTLE_TARGET_DATE", this.monthrySettleTargetDate);
        params.put("MONTHRY_SETTLE_STATUS", this.monthrySettleStatus);
        params.put("MONTHRY_SETTLE_DATE", this.monthrySettleDate);
        params.put("MONTHRY_SETTLE_COST_FIXED", this.monthrySettleCostFixed);
        params.put("ANNUAL_SETTLE_TARGET_DATE", this.annualSettleTargetDate);
        params.put("ANNUAL_SETTLE_STATUS", this.annualSettleStatus);
        params.put("ANNUAL_SETTLE_DATE", this.annualSettleDate);
        params.put("ANNUAL_SETTLE_COST_FIXED", this.annualSettleCostFixed);
        params.put("MASTER_COPY_FLAG", this.masterCopyFlag);
        params.put("MASTER_COPY_DATE", this.masterCopyDate);
        params.put("QUARTER_SETTLE_TARGET_DATE", this.quarterSettleTargetDate);
        params.put("QUARTER_SETTLE_STATUS", this.quarterSettleStatus);
        params.put("QUARTER_SETTLE_DATE", this.quarterSettleDate);
        params.put("QUARTER_SETTLE_COST_FIXED", this.quarterSettleCostFixed);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
