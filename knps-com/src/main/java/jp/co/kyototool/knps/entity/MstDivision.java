package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_DIVISION
 *
 * @author emarfkrow
 */
public class MstDivision implements IEntity {

    /** DIVISION_CODE */
    private String divisionCode;

    /**
     * @return DIVISION_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIVISION_CODE")
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @param o DIVISION_CODE
     */
    public void setDivisionCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.divisionCode = String.valueOf(o.toString());
        } else {
            this.divisionCode = null;
        }
    }

    /** DIVISION_NAME */
    private String divisionName;

    /**
     * @return DIVISION_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIVISION_NAME")
    public String getDivisionName() {
        return this.divisionName;
    }

    /**
     * @param o DIVISION_NAME
     */
    public void setDivisionName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.divisionName = String.valueOf(o.toString());
        } else {
            this.divisionName = null;
        }
    }

    /** ADMIN_CODE */
    private String adminCode;

    /**
     * @return ADMIN_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ADMIN_CODE")
    public String getAdminCode() {
        return this.adminCode;
    }

    /**
     * @param o ADMIN_CODE
     */
    public void setAdminCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.adminCode = String.valueOf(o.toString());
        } else {
            this.adminCode = null;
        }
    }

    /** COMPANY_CODE */
    private String companyCode;

    /**
     * @return COMPANY_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMPANY_CODE")
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * @param o COMPANY_CODE
     */
    public void setCompanyCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.companyCode = String.valueOf(o.toString());
        } else {
            this.companyCode = null;
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
     * MST_DIVISION照会
     *
     * @param param1 DIVISION_CODE
     * @return MST_DIVISION
     */
    public static MstDivision get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"DIVISION_CODE\") = TRIM (:division_code)");

        String sql = "SELECT * FROM MST_DIVISION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("division_code", param1);

        return Queries.get(sql, params, MstDivision.class);
    }

    /**
     * MST_DIVISION追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // DIVISION_CODEの採番処理
        numbering();

        // MST_DIVISIONの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"DIVISION_CODE\" -- :division_code");
        nameList.add("\"DIVISION_NAME\" -- :division_name");
        nameList.add("\"ADMIN_CODE\" -- :admin_code");
        nameList.add("\"COMPANY_CODE\" -- :company_code");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_DIVISION(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":division_code");
        valueList.add(":division_name");
        valueList.add(":admin_code");
        valueList.add(":company_code");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** DIVISION_CODEの採番処理 */
    private void numbering() {

        if (this.divisionCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"DIVISION_CODE\") IS NULL THEN 0 ELSE MAX(e.\"DIVISION_CODE\") * 1 END + 1, 10, '0') AS \"DIVISION_CODE\" FROM MST_DIVISION e WHERE e.\"DIVISION_CODE\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("DIVISION_CODE");

        this.setDivisionCode(o);
    }

    /**
     * MST_DIVISION更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_DIVISIONの登録
        String sql = "UPDATE MST_DIVISION\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"DIVISION_CODE\" = :division_code");
        setList.add("\"DIVISION_NAME\" = :division_name");
        setList.add("\"ADMIN_CODE\" = :admin_code");
        setList.add("\"COMPANY_CODE\" = :company_code");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_DIVISION削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_DIVISIONの削除
        String sql = "DELETE FROM MST_DIVISION WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"DIVISION_CODE\") = TRIM (:division_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("division_code", this.divisionCode);
        params.put("division_name", this.divisionName);
        params.put("admin_code", this.adminCode);
        params.put("company_code", this.companyCode);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
