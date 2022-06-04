package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_EMP
 *
 * @author emarfkrow
 */
public class MstEmp implements IEntity {

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

    /** EMP_NAME */
    private String empName;

    /**
     * @return EMP_NAME
     */
    public String getEmpName() {
        return this.empName;
    }

    /**
     * @param o EMP_NAME
     */
    public void setEmpName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.empName = String.valueOf(o.toString());
        } else {
            this.empName = null;
        }
    }

    /** POSITION */
    private java.math.BigDecimal position;

    /**
     * @return POSITION
     */
    public java.math.BigDecimal getPosition() {
        return this.position;
    }

    /**
     * @param o POSITION
     */
    public void setPosition(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.position = new java.math.BigDecimal(o.toString());
        } else {
            this.position = null;
        }
    }

    /** COMP_CODE */
    private java.math.BigDecimal compCode;

    /**
     * @return COMP_CODE
     */
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

    /** PASSWORD */
    private String password;

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @param o PASSWORD
     */
    public void setPassword(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.password = String.valueOf(o.toString());
        } else {
            this.password = null;
        }
    }

    /** TEL_NO */
    private String telNo;

    /**
     * @return TEL_NO
     */
    public String getTelNo() {
        return this.telNo;
    }

    /**
     * @param o TEL_NO
     */
    public void setTelNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.telNo = String.valueOf(o.toString());
        } else {
            this.telNo = null;
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

    /** MAIL_ADDRESS */
    private String mailAddress;

    /**
     * @return MAIL_ADDRESS
     */
    public String getMailAddress() {
        return this.mailAddress;
    }

    /**
     * @param o MAIL_ADDRESS
     */
    public void setMailAddress(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mailAddress = String.valueOf(o.toString());
        } else {
            this.mailAddress = null;
        }
    }

    /** DIVISION_CODE */
    private String divisionCode;

    /**
     * @return DIVISION_CODE
     */
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

    /**
     * MST_EMP照会
     *
     * @param param1 EMP_CODE
     * @return MST_EMP
     */
    public static MstEmp get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"EMP_CODE\") = TRIM (:emp_code)");

        String sql = "SELECT * FROM MST_EMP WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("emp_code", param1);

        return Queries.get(sql, params, MstEmp.class);
    }

    /**
     * MST_EMP追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // EMP_CODEの採番処理
        numbering();

        // MST_EMPの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"EMP_CODE\" -- :emp_code");
        nameList.add("\"EMP_NAME\" -- :emp_name");
        nameList.add("\"POSITION\" -- :position");
        nameList.add("\"COMP_CODE\" -- :comp_code");
        nameList.add("\"PASSWORD\" -- :password");
        nameList.add("\"TEL_NO\" -- :tel_no");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"MAIL_ADDRESS\" -- :mail_address");
        nameList.add("\"DIVISION_CODE\" -- :division_code");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_EMP(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":emp_code");
        valueList.add(":emp_name");
        valueList.add(":position");
        valueList.add(":comp_code");
        valueList.add(":password");
        valueList.add(":tel_no");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":mail_address");
        valueList.add(":division_code");
        return String.join("\r\n    , ", valueList);
    }

    /** EMP_CODEの採番処理 */
    private void numbering() {

        if (this.empCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"EMP_CODE\") IS NULL THEN 0 ELSE MAX(e.\"EMP_CODE\") * 1 END + 1, 10, '0') AS \"EMP_CODE\" FROM MST_EMP e WHERE e.\"EMP_CODE\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("EMP_CODE");

        this.setEmpCode(o);
    }

    /**
     * MST_EMP更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_EMPの登録
        String sql = "UPDATE MST_EMP\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"EMP_CODE\" = :emp_code");
        setList.add("\"EMP_NAME\" = :emp_name");
        setList.add("\"POSITION\" = :position");
        setList.add("\"COMP_CODE\" = :comp_code");
        setList.add("\"PASSWORD\" = :password");
        setList.add("\"TEL_NO\" = :tel_no");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"MAIL_ADDRESS\" = :mail_address");
        setList.add("\"DIVISION_CODE\" = :division_code");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_EMP削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_EMPの削除
        String sql = "DELETE FROM MST_EMP WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"EMP_CODE\") = TRIM (:emp_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("emp_code", this.empCode);
        params.put("emp_name", this.empName);
        params.put("position", this.position);
        params.put("comp_code", this.compCode);
        params.put("password", this.password);
        params.put("tel_no", this.telNo);
        params.put("delete_flag", this.deleteFlag);
        params.put("mail_address", this.mailAddress);
        params.put("division_code", this.divisionCode);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
