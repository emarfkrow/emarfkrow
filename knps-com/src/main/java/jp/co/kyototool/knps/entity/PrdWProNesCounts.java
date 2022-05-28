package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_W_PRO_NES_COUNTS
 *
 * @author emarfkrow
 */
public class PrdWProNesCounts implements IEntity {

    /** PRD_W_PRO_NES_COUNTS_KEY */
    private java.math.BigDecimal prdWProNesCountsKey;

    /**
     * @return PRD_W_PRO_NES_COUNTS_KEY
     */
    public java.math.BigDecimal getPrdWProNesCountsKey() {
        return this.prdWProNesCountsKey;
    }

    /**
     * @param o PRD_W_PRO_NES_COUNTS_KEY
     */
    public void setPrdWProNesCountsKey(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.prdWProNesCountsKey = new java.math.BigDecimal(o.toString());
        } else {
            this.prdWProNesCountsKey = null;
        }
    }

    /** PRO_HINBAN */
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    public String getProHinban() {
        return this.proHinban;
    }

    /**
     * @param o PRO_HINBAN
     */
    public void setProHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proHinban = String.valueOf(o.toString());
        } else {
            this.proHinban = null;
        }
    }

    /** SCHEDULED_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime scheduledDate;

    /**
     * @return SCHEDULED_DATE
     */
    public java.time.LocalDateTime getScheduledDate() {
        return this.scheduledDate;
    }

    /**
     * @param o SCHEDULED_DATE
     */
    public void setScheduledDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.scheduledDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.scheduledDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.scheduledDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.scheduledDate = null;
        }
    }

    /** PRO_NES_COUNTS */
    private java.math.BigDecimal proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
    public java.math.BigDecimal getProNesCounts() {
        return this.proNesCounts;
    }

    /**
     * @param o PRO_NES_COUNTS
     */
    public void setProNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.proNesCounts = null;
        }
    }

    /** PRO_NES_COMMENT */
    private String proNesComment;

    /**
     * @return PRO_NES_COMMENT
     */
    public String getProNesComment() {
        return this.proNesComment;
    }

    /**
     * @param o PRO_NES_COMMENT
     */
    public void setProNesComment(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNesComment = String.valueOf(o.toString());
        } else {
            this.proNesComment = null;
        }
    }

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
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

    /** EMP_CODE */
    private String empCode;

    /**
     * @return EMP_CODE
     */
    public String getEmpCode() {
        return this.empCode;
    }

    /**
     * @param o EMP_CODE
     */
    public void setEmpCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.empCode = String.valueOf(o.toString());
        } else {
            this.empCode = null;
        }
    }

    /**
     * PRD_W_PRO_NES_COUNTS照会
     *
     * @param param1 PRD_W_PRO_NES_COUNTS_KEY
     * @return PRD_W_PRO_NES_COUNTS
     */
    public static PrdWProNesCounts get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("prd_w_pro_nes_counts_key = :prd_w_pro_nes_counts_key");

        String sql = "SELECT * FROM PRD_W_PRO_NES_COUNTS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_w_pro_nes_counts_key", param1);

        return Queries.get(sql, params, PrdWProNesCounts.class);
    }

    /**
     * PRD_W_PRO_NES_COUNTS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_W_PRO_NES_COUNTSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("prd_w_pro_nes_counts_key -- :prd_w_pro_nes_counts_key");
        nameList.add("pro_hinban -- :pro_hinban");
        nameList.add("scheduled_date -- :scheduled_date");
        nameList.add("pro_nes_counts -- :pro_nes_counts");
        nameList.add("pro_nes_comment -- :pro_nes_comment");
        nameList.add("delete_flag -- :delete_flag");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("emp_code -- :emp_code");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_W_PRO_NES_COUNTS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":prd_w_pro_nes_counts_key");
        valueList.add(":pro_hinban");
        valueList.add("TO_TIMESTAMP (:scheduled_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":pro_nes_counts");
        valueList.add(":pro_nes_comment");
        valueList.add(":delete_flag");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":emp_code");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_W_PRO_NES_COUNTS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_W_PRO_NES_COUNTSの登録
        String sql = "UPDATE PRD_W_PRO_NES_COUNTS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("prd_w_pro_nes_counts_key = :prd_w_pro_nes_counts_key");
        setList.add("pro_hinban = :pro_hinban");
        setList.add("scheduled_date = TO_TIMESTAMP (:scheduled_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("pro_nes_counts = :pro_nes_counts");
        setList.add("pro_nes_comment = :pro_nes_comment");
        setList.add("delete_flag = :delete_flag");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("emp_code = :emp_code");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_W_PRO_NES_COUNTS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_W_PRO_NES_COUNTSの削除
        String sql = "DELETE FROM PRD_W_PRO_NES_COUNTS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("prd_w_pro_nes_counts_key = :prd_w_pro_nes_counts_key");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PRD_W_PRO_NES_COUNTS_KEY", this.prdWProNesCountsKey);
        params.put("PRO_HINBAN", this.proHinban);
        params.put("SCHEDULED_DATE", this.scheduledDate);
        params.put("PRO_NES_COUNTS", this.proNesCounts);
        params.put("PRO_NES_COMMENT", this.proNesComment);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("EMP_CODE", this.empCode);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
