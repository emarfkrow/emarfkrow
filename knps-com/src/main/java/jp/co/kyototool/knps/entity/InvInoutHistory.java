package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_INOUT_HISTORY
 *
 * @author emarfkrow
 */
public class InvInoutHistory implements IEntity {

    /** ACTION_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime actionDate;

    /**
     * @return ACTION_DATE
     */
    public java.time.LocalDateTime getActionDate() {
        return this.actionDate;
    }

    /**
     * @param o ACTION_DATE
     */
    public void setActionDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.actionDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.actionDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actionDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.actionDate = null;
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

    /** IN_OUT_COUNTS */
    private java.math.BigDecimal inOutCounts;

    /**
     * @return IN_OUT_COUNTS
     */
    public java.math.BigDecimal getInOutCounts() {
        return this.inOutCounts;
    }

    /**
     * @param o IN_OUT_COUNTS
     */
    public void setInOutCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.inOutCounts = null;
        }
    }

    /** IN_OUT_KBN */
    private java.math.BigDecimal inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    public java.math.BigDecimal getInOutKbn() {
        return this.inOutKbn;
    }

    /**
     * @param o IN_OUT_KBN
     */
    public void setInOutKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.inOutKbn = null;
        }
    }

    /** FROM_PAY */
    private String fromPay;

    /**
     * @return FROM_PAY
     */
    public String getFromPay() {
        return this.fromPay;
    }

    /**
     * @param o FROM_PAY
     */
    public void setFromPay(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fromPay = String.valueOf(o.toString());
        } else {
            this.fromPay = null;
        }
    }

    /** TO_PAY */
    private String toPay;

    /**
     * @return TO_PAY
     */
    public String getToPay() {
        return this.toPay;
    }

    /**
     * @param o TO_PAY
     */
    public void setToPay(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.toPay = String.valueOf(o.toString());
        } else {
            this.toPay = null;
        }
    }

    /** REQ_NAME */
    private String reqName;

    /**
     * @return REQ_NAME
     */
    public String getReqName() {
        return this.reqName;
    }

    /**
     * @param o REQ_NAME
     */
    public void setReqName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqName = String.valueOf(o.toString());
        } else {
            this.reqName = null;
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

    /**
     * INV_INOUT_HISTORY照会
     *
     * @param param1 ACTION_DATE
     * @param param2 HINBAN
     * @param param3 IN_OUT_COUNTS
     * @param param4 IN_OUT_KBN
     * @return INV_INOUT_HISTORY
     */
    public static InvInoutHistory get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("action_date = :action_date");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("in_out_counts = :in_out_counts");
        whereList.add("in_out_kbn = :in_out_kbn");

        String sql = "SELECT * FROM INV_INOUT_HISTORY WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("action_date", param1);
        params.put("hinban", param2);
        params.put("in_out_counts", param3);
        params.put("in_out_kbn", param4);

        return Queries.get(sql, params, InvInoutHistory.class);
    }

    /**
     * INV_INOUT_HISTORY追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_INOUT_HISTORYの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("action_date -- :action_date");
        nameList.add("hinban -- :hinban");
        nameList.add("in_out_counts -- :in_out_counts");
        nameList.add("in_out_kbn -- :in_out_kbn");
        nameList.add("from_pay -- :from_pay");
        nameList.add("to_pay -- :to_pay");
        nameList.add("req_name -- :req_name");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_INOUT_HISTORY(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add("TO_TIMESTAMP (:action_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":hinban");
        valueList.add(":in_out_counts");
        valueList.add(":in_out_kbn");
        valueList.add(":from_pay");
        valueList.add(":to_pay");
        valueList.add(":req_name");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_INOUT_HISTORY更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_INOUT_HISTORYの登録
        String sql = "UPDATE INV_INOUT_HISTORY\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("action_date = TO_TIMESTAMP (:action_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("hinban = :hinban");
        setList.add("in_out_counts = :in_out_counts");
        setList.add("in_out_kbn = :in_out_kbn");
        setList.add("from_pay = :from_pay");
        setList.add("to_pay = :to_pay");
        setList.add("req_name = :req_name");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_INOUT_HISTORY削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_INOUT_HISTORYの削除
        String sql = "DELETE FROM INV_INOUT_HISTORY WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("action_date = :action_date");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("in_out_counts = :in_out_counts");
        whereList.add("in_out_kbn = :in_out_kbn");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ACTION_DATE", this.actionDate);
        params.put("HINBAN", this.hinban);
        params.put("IN_OUT_COUNTS", this.inOutCounts);
        params.put("IN_OUT_KBN", this.inOutKbn);
        params.put("FROM_PAY", this.fromPay);
        params.put("TO_PAY", this.toPay);
        params.put("REQ_NAME", this.reqName);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
