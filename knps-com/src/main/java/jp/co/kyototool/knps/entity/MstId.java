package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_ID
 *
 * @author emarfkrow
 */
public class MstId implements IEntity {

    /** ID_TYPE */
    private java.math.BigDecimal idType;

    /**
     * @return ID_TYPE
     */
    public java.math.BigDecimal getIdType() {
        return this.idType;
    }

    /**
     * @param o ID_TYPE
     */
    public void setIdType(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idType = new java.math.BigDecimal(o.toString());
        } else {
            this.idType = null;
        }
    }

    /** ID */
    private java.math.BigDecimal id;

    /**
     * @return ID
     */
    public java.math.BigDecimal getId() {
        return this.id;
    }

    /**
     * @param o ID
     */
    public void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.id = new java.math.BigDecimal(o.toString());
        } else {
            this.id = null;
        }
    }

    /** ID_MAX */
    private java.math.BigDecimal idMax;

    /**
     * @return ID_MAX
     */
    public java.math.BigDecimal getIdMax() {
        return this.idMax;
    }

    /**
     * @param o ID_MAX
     */
    public void setIdMax(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idMax = new java.math.BigDecimal(o.toString());
        } else {
            this.idMax = null;
        }
    }

    /** ID_MIN */
    private java.math.BigDecimal idMin;

    /**
     * @return ID_MIN
     */
    public java.math.BigDecimal getIdMin() {
        return this.idMin;
    }

    /**
     * @param o ID_MIN
     */
    public void setIdMin(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idMin = new java.math.BigDecimal(o.toString());
        } else {
            this.idMin = null;
        }
    }

    /** ID_COMMENT */
    private String idComment;

    /**
     * @return ID_COMMENT
     */
    public String getIdComment() {
        return this.idComment;
    }

    /**
     * @param o ID_COMMENT
     */
    public void setIdComment(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idComment = String.valueOf(o.toString());
        } else {
            this.idComment = null;
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

    /**
     * MST_ID照会
     *
     * @param param1 ID_TYPE
     * @return MST_ID
     */
    public static MstId get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"ID_TYPE\" = :id_type");

        String sql = "SELECT * FROM MST_ID WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id_type", param1);

        return Queries.get(sql, params, MstId.class);
    }

    /**
     * MST_ID追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_IDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("id_type -- :id_type");
        nameList.add("id -- :id");
        nameList.add("id_max -- :id_max");
        nameList.add("id_min -- :id_min");
        nameList.add("id_comment -- :id_comment");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_ID(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":id_type");
        valueList.add(":id");
        valueList.add(":id_max");
        valueList.add(":id_min");
        valueList.add(":id_comment");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_ID更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_IDの登録
        String sql = "UPDATE MST_ID\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("id_type = :id_type");
        setList.add("id = :id");
        setList.add("id_max = :id_max");
        setList.add("id_min = :id_min");
        setList.add("id_comment = :id_comment");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_ID削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_IDの削除
        String sql = "DELETE FROM MST_ID WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("id_type = :id_type");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ID_TYPE", this.idType);
        params.put("ID", this.id);
        params.put("ID_MAX", this.idMax);
        params.put("ID_MIN", this.idMin);
        params.put("ID_COMMENT", this.idComment);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
