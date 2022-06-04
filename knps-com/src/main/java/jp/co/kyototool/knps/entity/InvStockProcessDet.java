package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STOCK_PROCESS_DET
 *
 * @author emarfkrow
 */
public class InvStockProcessDet implements IEntity {

    /** LOCATION_CODE */
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * @param o LOCATION_CODE
     */
    public void setLocationCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locationCode = String.valueOf(o.toString());
        } else {
            this.locationCode = null;
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

    /** IN_OUT_YMD */
    private String inOutYmd;

    /**
     * @return IN_OUT_YMD
     */
    public String getInOutYmd() {
        return this.inOutYmd;
    }

    /**
     * @param o IN_OUT_YMD
     */
    public void setInOutYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutYmd = String.valueOf(o.toString());
        } else {
            this.inOutYmd = null;
        }
    }

    /** IN_OUT_SEQ */
    private java.math.BigDecimal inOutSeq;

    /**
     * @return IN_OUT_SEQ
     */
    public java.math.BigDecimal getInOutSeq() {
        return this.inOutSeq;
    }

    /**
     * @param o IN_OUT_SEQ
     */
    public void setInOutSeq(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutSeq = new java.math.BigDecimal(o.toString());
        } else {
            this.inOutSeq = null;
        }
    }

    /** ROUTING_GROUP */
    private java.math.BigDecimal routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    public java.math.BigDecimal getRoutingGroup() {
        return this.routingGroup;
    }

    /**
     * @param o ROUTING_GROUP
     */
    public void setRoutingGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.routingGroup = null;
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

    /** IN_OUT_KB */
    private String inOutKb;

    /**
     * @return IN_OUT_KB
     */
    public String getInOutKb() {
        return this.inOutKb;
    }

    /**
     * @param o IN_OUT_KB
     */
    public void setInOutKb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutKb = String.valueOf(o.toString());
        } else {
            this.inOutKb = null;
        }
    }

    /** IN_OUT_QT */
    private java.math.BigDecimal inOutQt;

    /**
     * @return IN_OUT_QT
     */
    public java.math.BigDecimal getInOutQt() {
        return this.inOutQt;
    }

    /**
     * @param o IN_OUT_QT
     */
    public void setInOutQt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutQt = new java.math.BigDecimal(o.toString());
        } else {
            this.inOutQt = null;
        }
    }

    /** INV_CMT */
    private String invCmt;

    /**
     * @return INV_CMT
     */
    public String getInvCmt() {
        return this.invCmt;
    }

    /**
     * @param o INV_CMT
     */
    public void setInvCmt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invCmt = String.valueOf(o.toString());
        } else {
            this.invCmt = null;
        }
    }

    /** CHILD_PLAN_NO */
    private String childPlanNo;

    /**
     * @return CHILD_PLAN_NO
     */
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
     * INV_STOCK_PROCESS_DET照会
     *
     * @param param1 LOCATION_CODE
     * @param param2 HINBAN
     * @param param3 IN_OUT_YMD
     * @param param4 IN_OUT_SEQ
     * @return INV_STOCK_PROCESS_DET
     */
    public static InvStockProcessDet get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"LOCATION_CODE\" = :location_code");
        whereList.add("\"HINBAN\" = :hinban");
        whereList.add("TRIM (\"IN_OUT_YMD\") = TRIM (:in_out_ymd)");
        whereList.add("\"IN_OUT_SEQ\" = :in_out_seq");

        String sql = "SELECT * FROM INV_STOCK_PROCESS_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", param1);
        params.put("hinban", param2);
        params.put("in_out_ymd", param3);
        params.put("in_out_seq", param4);

        return Queries.get(sql, params, InvStockProcessDet.class);
    }

    /**
     * INV_STOCK_PROCESS_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STOCK_PROCESS_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"LOCATION_CODE\" -- :location_code");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"IN_OUT_YMD\" -- :in_out_ymd");
        nameList.add("\"IN_OUT_SEQ\" -- :in_out_seq");
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"OPE_DETAIL\" -- :ope_detail");
        nameList.add("\"IN_OUT_KB\" -- :in_out_kb");
        nameList.add("\"IN_OUT_QT\" -- :in_out_qt");
        nameList.add("\"INV_CMT\" -- :inv_cmt");
        nameList.add("\"CHILD_PLAN_NO\" -- :child_plan_no");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STOCK_PROCESS_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":location_code");
        valueList.add(":hinban");
        valueList.add(":in_out_ymd");
        valueList.add(":in_out_seq");
        valueList.add(":routing_group");
        valueList.add(":ope_detail");
        valueList.add(":in_out_kb");
        valueList.add(":in_out_qt");
        valueList.add(":inv_cmt");
        valueList.add(":child_plan_no");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_STOCK_PROCESS_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_PROCESS_DETの登録
        String sql = "UPDATE INV_STOCK_PROCESS_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"LOCATION_CODE\" = :location_code");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"IN_OUT_YMD\" = :in_out_ymd");
        setList.add("\"IN_OUT_SEQ\" = :in_out_seq");
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"OPE_DETAIL\" = :ope_detail");
        setList.add("\"IN_OUT_KB\" = :in_out_kb");
        setList.add("\"IN_OUT_QT\" = :in_out_qt");
        setList.add("\"INV_CMT\" = :inv_cmt");
        setList.add("\"CHILD_PLAN_NO\" = :child_plan_no");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STOCK_PROCESS_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_PROCESS_DETの削除
        String sql = "DELETE FROM INV_STOCK_PROCESS_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"LOCATION_CODE\" = :location_code");
        whereList.add("\"HINBAN\" = :hinban");
        whereList.add("TRIM (\"IN_OUT_YMD\") = TRIM (:in_out_ymd)");
        whereList.add("\"IN_OUT_SEQ\" = :in_out_seq");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", this.locationCode);
        params.put("hinban", this.hinban);
        params.put("in_out_ymd", this.inOutYmd);
        params.put("in_out_seq", this.inOutSeq);
        params.put("routing_group", this.routingGroup);
        params.put("ope_detail", this.opeDetail);
        params.put("in_out_kb", this.inOutKb);
        params.put("in_out_qt", this.inOutQt);
        params.put("inv_cmt", this.invCmt);
        params.put("child_plan_no", this.childPlanNo);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
