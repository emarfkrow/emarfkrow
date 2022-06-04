package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_ACT_GATHER_PAT
 *
 * @author emarfkrow
 */
public class MstActGatherPat implements IEntity {

    /** ACT_GATHER_PAT_NO */
    private String actGatherPatNo;

    /**
     * @return ACT_GATHER_PAT_NO
     */
    public String getActGatherPatNo() {
        return this.actGatherPatNo;
    }

    /**
     * @param o ACT_GATHER_PAT_NO
     */
    public void setActGatherPatNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actGatherPatNo = String.valueOf(o.toString());
        } else {
            this.actGatherPatNo = null;
        }
    }

    /** IN_PRE_START */
    private java.math.BigDecimal inPreStart;

    /**
     * @return IN_PRE_START
     */
    public java.math.BigDecimal getInPreStart() {
        return this.inPreStart;
    }

    /**
     * @param o IN_PRE_START
     */
    public void setInPreStart(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inPreStart = new java.math.BigDecimal(o.toString());
        } else {
            this.inPreStart = null;
        }
    }

    /** IN_PRE_END */
    private java.math.BigDecimal inPreEnd;

    /**
     * @return IN_PRE_END
     */
    public java.math.BigDecimal getInPreEnd() {
        return this.inPreEnd;
    }

    /**
     * @param o IN_PRE_END
     */
    public void setInPreEnd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inPreEnd = new java.math.BigDecimal(o.toString());
        } else {
            this.inPreEnd = null;
        }
    }

    /** PROC_END */
    private java.math.BigDecimal procEnd;

    /**
     * @return PROC_END
     */
    public java.math.BigDecimal getProcEnd() {
        return this.procEnd;
    }

    /**
     * @param o PROC_END
     */
    public void setProcEnd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.procEnd = new java.math.BigDecimal(o.toString());
        } else {
            this.procEnd = null;
        }
    }

    /** PROC_STOP */
    private java.math.BigDecimal procStop;

    /**
     * @return PROC_STOP
     */
    public java.math.BigDecimal getProcStop() {
        return this.procStop;
    }

    /**
     * @param o PROC_STOP
     */
    public void setProcStop(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.procStop = new java.math.BigDecimal(o.toString());
        } else {
            this.procStop = null;
        }
    }

    /** PROC_CANCEL */
    private java.math.BigDecimal procCancel;

    /**
     * @return PROC_CANCEL
     */
    public java.math.BigDecimal getProcCancel() {
        return this.procCancel;
    }

    /**
     * @param o PROC_CANCEL
     */
    public void setProcCancel(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.procCancel = new java.math.BigDecimal(o.toString());
        } else {
            this.procCancel = null;
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

    /**
     * MST_ACT_GATHER_PAT照会
     *
     * @param param1 ACT_GATHER_PAT_NO
     * @return MST_ACT_GATHER_PAT
     */
    public static MstActGatherPat get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACT_GATHER_PAT_NO\") = TRIM (:act_gather_pat_no)");

        String sql = "SELECT * FROM MST_ACT_GATHER_PAT WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_gather_pat_no", param1);

        return Queries.get(sql, params, MstActGatherPat.class);
    }

    /**
     * MST_ACT_GATHER_PAT追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ACT_GATHER_PAT_NOの採番処理
        numbering();

        // MST_ACT_GATHER_PATの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"ACT_GATHER_PAT_NO\" -- :act_gather_pat_no");
        nameList.add("\"IN_PRE_START\" -- :in_pre_start");
        nameList.add("\"IN_PRE_END\" -- :in_pre_end");
        nameList.add("\"PROC_END\" -- :proc_end");
        nameList.add("\"PROC_STOP\" -- :proc_stop");
        nameList.add("\"PROC_CANCEL\" -- :proc_cancel");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_ACT_GATHER_PAT(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":act_gather_pat_no");
        valueList.add(":in_pre_start");
        valueList.add(":in_pre_end");
        valueList.add(":proc_end");
        valueList.add(":proc_stop");
        valueList.add(":proc_cancel");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** ACT_GATHER_PAT_NOの採番処理 */
    private void numbering() {

        if (this.actGatherPatNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"ACT_GATHER_PAT_NO\") IS NULL THEN 0 ELSE MAX(e.\"ACT_GATHER_PAT_NO\") * 1 END + 1, 3, '0') AS \"ACT_GATHER_PAT_NO\" FROM MST_ACT_GATHER_PAT e WHERE e.\"ACT_GATHER_PAT_NO\" < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("ACT_GATHER_PAT_NO");

        this.setActGatherPatNo(o);
    }

    /**
     * MST_ACT_GATHER_PAT更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_ACT_GATHER_PATの登録
        String sql = "UPDATE MST_ACT_GATHER_PAT\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"ACT_GATHER_PAT_NO\" = :act_gather_pat_no");
        setList.add("\"IN_PRE_START\" = :in_pre_start");
        setList.add("\"IN_PRE_END\" = :in_pre_end");
        setList.add("\"PROC_END\" = :proc_end");
        setList.add("\"PROC_STOP\" = :proc_stop");
        setList.add("\"PROC_CANCEL\" = :proc_cancel");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_ACT_GATHER_PAT削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_ACT_GATHER_PATの削除
        String sql = "DELETE FROM MST_ACT_GATHER_PAT WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACT_GATHER_PAT_NO\") = TRIM (:act_gather_pat_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_gather_pat_no", this.actGatherPatNo);
        params.put("in_pre_start", this.inPreStart);
        params.put("in_pre_end", this.inPreEnd);
        params.put("proc_end", this.procEnd);
        params.put("proc_stop", this.procStop);
        params.put("proc_cancel", this.procCancel);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
