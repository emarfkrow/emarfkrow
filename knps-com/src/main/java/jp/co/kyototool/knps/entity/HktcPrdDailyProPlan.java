package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * HKTC_PRD_DAILY_PRO_PLAN
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlan implements IEntity {

    /** PLAN_NO */
    private String planNo;

    /**
     * @return PLAN_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PLAN_NO")
    public String getPlanNo() {
        return this.planNo;
    }

    /**
     * @param o PLAN_NO
     */
    public void setPlanNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planNo = String.valueOf(o.toString());
        } else {
            this.planNo = null;
        }
    }

    /** ARRANGE_KBN */
    private String arrangeKbn;

    /**
     * @return ARRANGE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ARRANGE_KBN")
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

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN")
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

    /** DETAIL_PLAN_COUNTS */
    private java.math.BigDecimal detailPlanCounts;

    /**
     * @return DETAIL_PLAN_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DETAIL_PLAN_COUNTS")
    public java.math.BigDecimal getDetailPlanCounts() {
        return this.detailPlanCounts;
    }

    /**
     * @param o DETAIL_PLAN_COUNTS
     */
    public void setDetailPlanCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.detailPlanCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.detailPlanCounts = null;
        }
    }

    /** PLAN_COMMENT */
    private String planComment;

    /**
     * @return PLAN_COMMENT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PLAN_COMMENT")
    public String getPlanComment() {
        return this.planComment;
    }

    /**
     * @param o PLAN_COMMENT
     */
    public void setPlanComment(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planComment = String.valueOf(o.toString());
        } else {
            this.planComment = null;
        }
    }

    /** PLAN_STATUS */
    private java.math.BigDecimal planStatus;

    /**
     * @return PLAN_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PLAN_STATUS")
    public java.math.BigDecimal getPlanStatus() {
        return this.planStatus;
    }

    /**
     * @param o PLAN_STATUS
     */
    public void setPlanStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.planStatus = null;
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
    @com.fasterxml.jackson.annotation.JsonProperty("PERIOD")
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
    @com.fasterxml.jackson.annotation.JsonProperty("PERIOD_CHG")
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

    /** PERIOD_CHG_COUNTS */
    private java.math.BigDecimal periodChgCounts;

    /**
     * @return PERIOD_CHG_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PERIOD_CHG_COUNTS")
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

    /** PLAN_DATE_APPOINT */
    private java.math.BigDecimal planDateAppoint;

    /**
     * @return PLAN_DATE_APPOINT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PLAN_DATE_APPOINT")
    public java.math.BigDecimal getPlanDateAppoint() {
        return this.planDateAppoint;
    }

    /**
     * @param o PLAN_DATE_APPOINT
     */
    public void setPlanDateAppoint(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planDateAppoint = new java.math.BigDecimal(o.toString());
        } else {
            this.planDateAppoint = null;
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
    private java.math.BigDecimal deleteFlag = new java.math.BigDecimal(0);

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

    /** ITEM */
    private String item;

    /**
     * @return ITEM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ITEM")
    public String getItem() {
        return this.item;
    }

    /**
     * @param o ITEM
     */
    public void setItem(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.item = String.valueOf(o.toString());
        } else {
            this.item = null;
        }
    }

    /** UPDATE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateDate;

    /**
     * @return UPDATE_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_DATE")
    public java.time.LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    /**
     * @param o UPDATE_DATE
     */
    public void setUpdateDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.updateDate = null;
        }
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN照会
     *
     * @param param1 PLAN_NO
     * @return HKTC_PRD_DAILY_PRO_PLAN
     */
    public static HktcPrdDailyProPlan get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PLAN_NO\") = TRIM (:plan_no)");

        String sql = "SELECT * FROM HKTC_PRD_DAILY_PRO_PLAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("plan_no", param1);

        return Queries.get(sql, params, HktcPrdDailyProPlan.class);
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PLAN_NOの採番処理
        numbering();

        // PRD_DAILY_PRO_PLANの登録
        if (this.prdDailyProPlan != null) {
            this.prdDailyProPlan.setPlanNo(this.getPlanNo());
            this.prdDailyProPlan.insert(now, id);
        }

        // HKTC_PRD_DAILY_PRO_PLANの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PLAN_NO\" -- :plan_no");
        nameList.add("\"ARRANGE_KBN\" -- :arrange_kbn");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"DETAIL_PLAN_COUNTS\" -- :detail_plan_counts");
        nameList.add("\"PLAN_COMMENT\" -- :plan_comment");
        nameList.add("\"PLAN_STATUS\" -- :plan_status");
        nameList.add("\"PERIOD\" -- :period");
        nameList.add("\"PERIOD_CHG\" -- :period_chg");
        nameList.add("\"PERIOD_CHG_COUNTS\" -- :period_chg_counts");
        nameList.add("\"PLAN_DATE_APPOINT\" -- :plan_date_appoint");
        nameList.add("\"BEG_DATE\" -- :beg_date");
        nameList.add("\"END_DATE\" -- :end_date");
        nameList.add("\"START_DATE\" -- :start_date");
        nameList.add("\"COMP_DATE\" -- :comp_date");
        nameList.add("\"SHORT_NO\" -- :short_no");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"ITEM\" -- :item");
        nameList.add("\"UPDATE_DATE\" -- :update_date");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO HKTC_PRD_DAILY_PRO_PLAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":plan_no");
        valueList.add(":arrange_kbn");
        valueList.add(":hinban");
        valueList.add(":detail_plan_counts");
        valueList.add(":plan_comment");
        valueList.add(":plan_status");
        valueList.add("TO_TIMESTAMP (:period, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:period_chg, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":period_chg_counts");
        valueList.add(":plan_date_appoint");
        valueList.add("TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":short_no");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":item");
        valueList.add("TO_TIMESTAMP (:update_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join("\r\n    , ", valueList);
    }

    /** PLAN_NOの採番処理 */
    private void numbering() {

        if (this.planNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"PLAN_NO\") IS NULL THEN 0 ELSE MAX(e.\"PLAN_NO\") * 1 END + 1, 10, '0') AS \"PLAN_NO\" FROM HKTC_PRD_DAILY_PRO_PLAN e WHERE e.\"PLAN_NO\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PLAN_NO");

        this.setPlanNo(o);
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_DAILY_PRO_PLANの登録
        if (this.prdDailyProPlan != null) {
            prdDailyProPlan.setPlanNo(this.getPlanNo());
            try {
                prdDailyProPlan.insert(now, id);
            } catch (Exception e) {
                prdDailyProPlan.update(now, id);
            }
        }

        // HKTC_PRD_DAILY_PRO_PLANの登録
        String sql = "UPDATE HKTC_PRD_DAILY_PRO_PLAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PLAN_NO\" = :plan_no");
        setList.add("\"ARRANGE_KBN\" = :arrange_kbn");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"DETAIL_PLAN_COUNTS\" = :detail_plan_counts");
        setList.add("\"PLAN_COMMENT\" = :plan_comment");
        setList.add("\"PLAN_STATUS\" = :plan_status");
        setList.add("\"PERIOD\" = TO_TIMESTAMP (:period, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"PERIOD_CHG\" = TO_TIMESTAMP (:period_chg, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"PERIOD_CHG_COUNTS\" = :period_chg_counts");
        setList.add("\"PLAN_DATE_APPOINT\" = :plan_date_appoint");
        setList.add("\"BEG_DATE\" = TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"END_DATE\" = TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"START_DATE\" = TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"COMP_DATE\" = TO_TIMESTAMP (:comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"SHORT_NO\" = :short_no");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"ITEM\" = :item");
        setList.add("\"UPDATE_DATE\" = TO_TIMESTAMP (:update_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_DAILY_PRO_PLANの削除
        if (this.prdDailyProPlan != null) {
            this.prdDailyProPlan.delete();
        }

        // HKTC_PRD_DAILY_PRO_PLANの削除
        String sql = "DELETE FROM HKTC_PRD_DAILY_PRO_PLAN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PLAN_NO\") = TRIM (:plan_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("plan_no", this.planNo);
        params.put("arrange_kbn", this.arrangeKbn);
        params.put("hinban", this.hinban);
        params.put("detail_plan_counts", this.detailPlanCounts);
        params.put("plan_comment", this.planComment);
        params.put("plan_status", this.planStatus);
        params.put("period", this.period);
        params.put("period_chg", this.periodChg);
        params.put("period_chg_counts", this.periodChgCounts);
        params.put("plan_date_appoint", this.planDateAppoint);
        params.put("beg_date", this.begDate);
        params.put("end_date", this.endDate);
        params.put("start_date", this.startDate);
        params.put("comp_date", this.compDate);
        params.put("short_no", this.shortNo);
        params.put("delete_flag", this.deleteFlag);
        params.put("item", this.item);
        params.put("update_date", this.updateDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_DAILY_PRO_PLAN
     */
    private PrdDailyProPlan prdDailyProPlan;

    /**
     * @return PRD_DAILY_PRO_PLAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdDailyProPlan")
    public PrdDailyProPlan getPrdDailyProPlan() {
        return this.prdDailyProPlan;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN
     */
    public void setPrdDailyProPlan(final PrdDailyProPlan p) {
        this.prdDailyProPlan = p;
    }

    /**
     * @return PRD_DAILY_PRO_PLAN
     */
    public PrdDailyProPlan referPrdDailyProPlan() {
        if (this.prdDailyProPlan == null) {
            try {
                this.prdDailyProPlan = PrdDailyProPlan.get(this.planNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdDailyProPlan;
    }
}
