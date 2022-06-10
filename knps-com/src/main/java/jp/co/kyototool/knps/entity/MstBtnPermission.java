package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_BTN_PERMISSION
 *
 * @author emarfkrow
 */
public class MstBtnPermission implements IEntity {

    /** COMP_CODE */
    private java.math.BigDecimal compCode;

    /**
     * @return COMP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMP_CODE")
    public java.math.BigDecimal getCompCode() {
        return this.compCode;
    }

    /**
     * @param o COMP_CODE
     */
    public void setCompCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.compCode = new java.math.BigDecimal(o.toString());
        } else {
            this.compCode = null;
        }
    }

    /** GAMEN_ID */
    private String gamenId;

    /**
     * @return GAMEN_ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GAMEN_ID")
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

    /** BUTTON_ID */
    private String buttonId;

    /**
     * @return BUTTON_ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BUTTON_ID")
    public String getButtonId() {
        return this.buttonId;
    }

    /**
     * @param o BUTTON_ID
     */
    public void setButtonId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.buttonId = String.valueOf(o.toString());
        } else {
            this.buttonId = null;
        }
    }

    /** PERMISSION */
    private java.math.BigDecimal permission;

    /**
     * @return PERMISSION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PERMISSION")
    public java.math.BigDecimal getPermission() {
        return this.permission;
    }

    /**
     * @param o PERMISSION
     */
    public void setPermission(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.permission = new java.math.BigDecimal(o.toString());
        } else {
            this.permission = null;
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

    /**
     * MST_BTN_PERMISSION照会
     *
     * @param param1 COMP_CODE
     * @param param2 GAMEN_ID
     * @param param3 BUTTON_ID
     * @return MST_BTN_PERMISSION
     */
    public static MstBtnPermission get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"COMP_CODE\" = :comp_code");
        whereList.add("\"GAMEN_ID\" = :gamen_id");
        whereList.add("\"BUTTON_ID\" = :button_id");

        String sql = "SELECT * FROM MST_BTN_PERMISSION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("comp_code", param1);
        params.put("gamen_id", param2);
        params.put("button_id", param3);

        return Queries.get(sql, params, MstBtnPermission.class);
    }

    /**
     * MST_BTN_PERMISSION追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_BTN_PERMISSIONの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"COMP_CODE\" -- :comp_code");
        nameList.add("\"GAMEN_ID\" -- :gamen_id");
        nameList.add("\"BUTTON_ID\" -- :button_id");
        nameList.add("\"PERMISSION\" -- :permission");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_BTN_PERMISSION(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":comp_code");
        valueList.add(":gamen_id");
        valueList.add(":button_id");
        valueList.add(":permission");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_BTN_PERMISSION更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_BTN_PERMISSIONの登録
        String sql = "UPDATE MST_BTN_PERMISSION\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"COMP_CODE\" = :comp_code");
        setList.add("\"GAMEN_ID\" = :gamen_id");
        setList.add("\"BUTTON_ID\" = :button_id");
        setList.add("\"PERMISSION\" = :permission");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_BTN_PERMISSION削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_BTN_PERMISSIONの削除
        String sql = "DELETE FROM MST_BTN_PERMISSION WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"COMP_CODE\" = :comp_code");
        whereList.add("\"GAMEN_ID\" = :gamen_id");
        whereList.add("\"BUTTON_ID\" = :button_id");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("comp_code", this.compCode);
        params.put("gamen_id", this.gamenId);
        params.put("button_id", this.buttonId);
        params.put("permission", this.permission);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
