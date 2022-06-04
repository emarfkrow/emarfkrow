package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_GAMEN
 *
 * @author emarfkrow
 */
public class MstGamen implements IEntity {

    /** BUSINESS_ID */
    private java.math.BigDecimal businessId;

    /**
     * @return BUSINESS_ID
     */
    public java.math.BigDecimal getBusinessId() {
        return this.businessId;
    }

    /**
     * @param o BUSINESS_ID
     */
    public void setBusinessId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.businessId = new java.math.BigDecimal(o.toString());
        } else {
            this.businessId = null;
        }
    }

    /** GAMEN_ID */
    private String gamenId;

    /**
     * @return GAMEN_ID
     */
    public String getGamenId() {
        return this.gamenId;
    }

    /**
     * @param o GAMEN_ID
     */
    public void setGamenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gamenId = String.valueOf(o.toString());
        } else {
            this.gamenId = null;
        }
    }

    /** GAMEN_NAME */
    private String gamenName;

    /**
     * @return GAMEN_NAME
     */
    public String getGamenName() {
        return this.gamenName;
    }

    /**
     * @param o GAMEN_NAME
     */
    public void setGamenName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gamenName = String.valueOf(o.toString());
        } else {
            this.gamenName = null;
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
     * MST_GAMEN照会
     *
     * @param param1 GAMEN_ID
     * @return MST_GAMEN
     */
    public static MstGamen get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"GAMEN_ID\" = :gamen_id");

        String sql = "SELECT * FROM MST_GAMEN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("gamen_id", param1);

        return Queries.get(sql, params, MstGamen.class);
    }

    /**
     * MST_GAMEN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SYS_REQ_LOCK_STATUSの登録
        if (this.sysReqLockStatus != null) {
            this.sysReqLockStatus.setGamenId(this.getGamenId());
            this.sysReqLockStatus.insert(now, id);
        }

        // MST_GAMENの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"BUSINESS_ID\" -- :business_id");
        nameList.add("\"GAMEN_ID\" -- :gamen_id");
        nameList.add("\"GAMEN_NAME\" -- :gamen_name");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_GAMEN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":business_id");
        valueList.add(":gamen_id");
        valueList.add(":gamen_name");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_GAMEN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // SYS_REQ_LOCK_STATUSの登録
        if (this.sysReqLockStatus != null) {
            sysReqLockStatus.setGamenId(this.getGamenId());
            try {
                sysReqLockStatus.insert(now, id);
            } catch (Exception e) {
                sysReqLockStatus.update(now, id);
            }
        }

        // MST_GAMENの登録
        String sql = "UPDATE MST_GAMEN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"BUSINESS_ID\" = :business_id");
        setList.add("\"GAMEN_ID\" = :gamen_id");
        setList.add("\"GAMEN_NAME\" = :gamen_name");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_GAMEN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // SYS_REQ_LOCK_STATUSの削除
        if (this.sysReqLockStatus != null) {
            this.sysReqLockStatus.delete();
        }

        // MST_GAMENの削除
        String sql = "DELETE FROM MST_GAMEN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"GAMEN_ID\" = :gamen_id");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("business_id", this.businessId);
        params.put("gamen_id", this.gamenId);
        params.put("gamen_name", this.gamenName);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * SYS_REQ_LOCK_STATUS
     */
    private SysReqLockStatus sysReqLockStatus;

    /**
     * @return SYS_REQ_LOCK_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SysReqLockStatus")
    public SysReqLockStatus getSysReqLockStatus() {
        return this.sysReqLockStatus;
    }

    /**
     * @param p SYS_REQ_LOCK_STATUS
     */
    public void setSysReqLockStatus(final SysReqLockStatus p) {
        this.sysReqLockStatus = p;
    }

    /**
     * @return SYS_REQ_LOCK_STATUS
     */
    public SysReqLockStatus referSysReqLockStatus() {
        if (this.sysReqLockStatus == null) {
            try {
                this.sysReqLockStatus = SysReqLockStatus.get(this.gamenId);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.sysReqLockStatus;
    }
}
