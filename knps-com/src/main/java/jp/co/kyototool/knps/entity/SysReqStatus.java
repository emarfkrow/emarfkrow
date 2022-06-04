package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * SYS_REQ_STATUS
 *
 * @author emarfkrow
 */
public class SysReqStatus implements IEntity {

    /** REQ_ID */
    private String reqId;

    /**
     * @return REQ_ID
     */
    public String getReqId() {
        return this.reqId;
    }

    /**
     * @param o REQ_ID
     */
    public void setReqId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqId = String.valueOf(o.toString());
        } else {
            this.reqId = null;
        }
    }

    /** REQ_PRG_NAME */
    private String reqPrgName;

    /**
     * @return REQ_PRG_NAME
     */
    public String getReqPrgName() {
        return this.reqPrgName;
    }

    /**
     * @param o REQ_PRG_NAME
     */
    public void setReqPrgName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPrgName = String.valueOf(o.toString());
        } else {
            this.reqPrgName = null;
        }
    }

    /** REQ_EMP_CODE */
    private String reqEmpCode;

    /**
     * @return REQ_EMP_CODE
     */
    public String getReqEmpCode() {
        return this.reqEmpCode;
    }

    /**
     * @param o REQ_EMP_CODE
     */
    public void setReqEmpCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqEmpCode = String.valueOf(o.toString());
        } else {
            this.reqEmpCode = null;
        }
    }

    /** REQ_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime reqDate;

    /**
     * @return REQ_DATE
     */
    public java.time.LocalDateTime getReqDate() {
        return this.reqDate;
    }

    /**
     * @param o REQ_DATE
     */
    public void setReqDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.reqDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.reqDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.reqDate = null;
        }
    }

    /** REQ_EXEC_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime reqExecDate;

    /**
     * @return REQ_EXEC_DATE
     */
    public java.time.LocalDateTime getReqExecDate() {
        return this.reqExecDate;
    }

    /**
     * @param o REQ_EXEC_DATE
     */
    public void setReqExecDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.reqExecDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.reqExecDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqExecDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.reqExecDate = null;
        }
    }

    /** REQ_COMP_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime reqCompDate;

    /**
     * @return REQ_COMP_DATE
     */
    public java.time.LocalDateTime getReqCompDate() {
        return this.reqCompDate;
    }

    /**
     * @param o REQ_COMP_DATE
     */
    public void setReqCompDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.reqCompDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.reqCompDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqCompDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.reqCompDate = null;
        }
    }

    /** EXEC_PHASE */
    private java.math.BigDecimal execPhase;

    /**
     * @return EXEC_PHASE
     */
    public java.math.BigDecimal getExecPhase() {
        return this.execPhase;
    }

    /**
     * @param o EXEC_PHASE
     */
    public void setExecPhase(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.execPhase = new java.math.BigDecimal(o.toString());
        } else {
            this.execPhase = null;
        }
    }

    /** EXEC_STATUS */
    private java.math.BigDecimal execStatus;

    /**
     * @return EXEC_STATUS
     */
    public java.math.BigDecimal getExecStatus() {
        return this.execStatus;
    }

    /**
     * @param o EXEC_STATUS
     */
    public void setExecStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.execStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.execStatus = null;
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

    /** PARAMS */
    private String params;

    /**
     * @return PARAMS
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @param o PARAMS
     */
    public void setParams(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.params = String.valueOf(o.toString());
        } else {
            this.params = null;
        }
    }

    /**
     * SYS_REQ_STATUS照会
     *
     * @param param1 REQ_ID
     * @return SYS_REQ_STATUS
     */
    public static SysReqStatus get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"REQ_ID\") = TRIM (:req_id)");

        String sql = "SELECT * FROM SYS_REQ_STATUS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("req_id", param1);

        return Queries.get(sql, params, SysReqStatus.class);
    }

    /**
     * SYS_REQ_STATUS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // REQ_IDの採番処理
        numbering();

        // SYS_REQ_STATUSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"REQ_ID\" -- :req_id");
        nameList.add("\"REQ_PRG_NAME\" -- :req_prg_name");
        nameList.add("\"REQ_EMP_CODE\" -- :req_emp_code");
        nameList.add("\"REQ_DATE\" -- :req_date");
        nameList.add("\"REQ_EXEC_DATE\" -- :req_exec_date");
        nameList.add("\"REQ_COMP_DATE\" -- :req_comp_date");
        nameList.add("\"EXEC_PHASE\" -- :exec_phase");
        nameList.add("\"EXEC_STATUS\" -- :exec_status");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"PARAMS\" -- :params");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO SYS_REQ_STATUS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":req_id");
        valueList.add(":req_prg_name");
        valueList.add(":req_emp_code");
        valueList.add("TO_TIMESTAMP (:req_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:req_exec_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:req_comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":exec_phase");
        valueList.add(":exec_status");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":params");
        return String.join("\r\n    , ", valueList);
    }

    /** REQ_IDの採番処理 */
    private void numbering() {

        if (this.reqId != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"REQ_ID\") IS NULL THEN 0 ELSE MAX(e.\"REQ_ID\") * 1 END + 1, 11, '0') AS \"REQ_ID\" FROM SYS_REQ_STATUS e WHERE e.\"REQ_ID\" < '99999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("REQ_ID");

        this.setReqId(o);
    }

    /**
     * SYS_REQ_STATUS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // SYS_REQ_STATUSの登録
        String sql = "UPDATE SYS_REQ_STATUS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"REQ_ID\" = :req_id");
        setList.add("\"REQ_PRG_NAME\" = :req_prg_name");
        setList.add("\"REQ_EMP_CODE\" = :req_emp_code");
        setList.add("\"REQ_DATE\" = TO_TIMESTAMP (:req_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"REQ_EXEC_DATE\" = TO_TIMESTAMP (:req_exec_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"REQ_COMP_DATE\" = TO_TIMESTAMP (:req_comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"EXEC_PHASE\" = :exec_phase");
        setList.add("\"EXEC_STATUS\" = :exec_status");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"PARAMS\" = :params");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * SYS_REQ_STATUS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // SYS_REQ_STATUSの削除
        String sql = "DELETE FROM SYS_REQ_STATUS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"REQ_ID\") = TRIM (:req_id)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("req_id", this.reqId);
        params.put("req_prg_name", this.reqPrgName);
        params.put("req_emp_code", this.reqEmpCode);
        params.put("req_date", this.reqDate);
        params.put("req_exec_date", this.reqExecDate);
        params.put("req_comp_date", this.reqCompDate);
        params.put("exec_phase", this.execPhase);
        params.put("exec_status", this.execStatus);
        params.put("params", this.params);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
