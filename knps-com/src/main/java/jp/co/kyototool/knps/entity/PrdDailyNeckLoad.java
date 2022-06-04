package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_DAILY_NECK_LOAD
 *
 * @author emarfkrow
 */
public class PrdDailyNeckLoad implements IEntity {

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
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

    /** BRANCH_NO */
    private java.math.BigDecimal branchNo;

    /**
     * @return BRANCH_NO
     */
    public java.math.BigDecimal getBranchNo() {
        return this.branchNo;
    }

    /**
     * @param o BRANCH_NO
     */
    public void setBranchNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.branchNo = new java.math.BigDecimal(o.toString());
        } else {
            this.branchNo = null;
        }
    }

    /** LOAD_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime loadDate;

    /**
     * @return LOAD_DATE
     */
    public java.time.LocalDateTime getLoadDate() {
        return this.loadDate;
    }

    /**
     * @param o LOAD_DATE
     */
    public void setLoadDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.loadDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.loadDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.loadDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.loadDate = null;
        }
    }

    /** LOAD_TIME */
    private java.math.BigDecimal loadTime;

    /**
     * @return LOAD_TIME
     */
    public java.math.BigDecimal getLoadTime() {
        return this.loadTime;
    }

    /**
     * @param o LOAD_TIME
     */
    public void setLoadTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.loadTime = new java.math.BigDecimal(o.toString());
        } else {
            this.loadTime = null;
        }
    }

    /** LOAD_OVER_TIME */
    private java.math.BigDecimal loadOverTime;

    /**
     * @return LOAD_OVER_TIME
     */
    public java.math.BigDecimal getLoadOverTime() {
        return this.loadOverTime;
    }

    /**
     * @param o LOAD_OVER_TIME
     */
    public void setLoadOverTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.loadOverTime = new java.math.BigDecimal(o.toString());
        } else {
            this.loadOverTime = null;
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

    /**
     * PRD_DAILY_NECK_LOAD照会
     *
     * @param param1 PRO_NO
     * @param param2 BRANCH_NO
     * @return PRD_DAILY_NECK_LOAD
     */
    public static PrdDailyNeckLoad get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_NO\") = TRIM (:pro_no)");
        whereList.add("\"BRANCH_NO\" = :branch_no");

        String sql = "SELECT * FROM PRD_DAILY_NECK_LOAD WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", param1);
        params.put("branch_no", param2);

        return Queries.get(sql, params, PrdDailyNeckLoad.class);
    }

    /**
     * PRD_DAILY_NECK_LOAD追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_DAILY_NECK_LOADの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRO_NO\" -- :pro_no");
        nameList.add("\"BRANCH_NO\" -- :branch_no");
        nameList.add("\"LOAD_DATE\" -- :load_date");
        nameList.add("\"LOAD_TIME\" -- :load_time");
        nameList.add("\"LOAD_OVER_TIME\" -- :load_over_time");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"WC_CODE\" -- :wc_code");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_DAILY_NECK_LOAD(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pro_no");
        valueList.add(":branch_no");
        valueList.add("TO_TIMESTAMP (:load_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":load_time");
        valueList.add(":load_over_time");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":wc_code");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_DAILY_NECK_LOAD更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_DAILY_NECK_LOADの登録
        String sql = "UPDATE PRD_DAILY_NECK_LOAD\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRO_NO\" = :pro_no");
        setList.add("\"BRANCH_NO\" = :branch_no");
        setList.add("\"LOAD_DATE\" = TO_TIMESTAMP (:load_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"LOAD_TIME\" = :load_time");
        setList.add("\"LOAD_OVER_TIME\" = :load_over_time");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"WC_CODE\" = :wc_code");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_DAILY_NECK_LOAD削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_DAILY_NECK_LOADの削除
        String sql = "DELETE FROM PRD_DAILY_NECK_LOAD WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_NO\") = TRIM (:pro_no)");
        whereList.add("\"BRANCH_NO\" = :branch_no");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", this.proNo);
        params.put("branch_no", this.branchNo);
        params.put("load_date", this.loadDate);
        params.put("load_time", this.loadTime);
        params.put("load_over_time", this.loadOverTime);
        params.put("wc_code", this.wcCode);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
