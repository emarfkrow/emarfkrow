package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUBINV
 *
 * @author emarfkrow
 */
public class MstSubinv implements IEntity {

    /** SUB_INV_CODE */
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUB_INV_CODE")
    public String getSubInvCode() {
        return this.subInvCode;
    }

    /**
     * @param o SUB_INV_CODE
     */
    public void setSubInvCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.subInvCode = String.valueOf(o.toString());
        } else {
            this.subInvCode = null;
        }
    }

    /** SUB_INV_NAME */
    private String subInvName;

    /**
     * @return SUB_INV_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUB_INV_NAME")
    public String getSubInvName() {
        return this.subInvName;
    }

    /**
     * @param o SUB_INV_NAME
     */
    public void setSubInvName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.subInvName = String.valueOf(o.toString());
        } else {
            this.subInvName = null;
        }
    }

    /** MANAGE_KBN */
    private java.math.BigDecimal manageKbn;

    /**
     * @return MANAGE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MANAGE_KBN")
    public java.math.BigDecimal getManageKbn() {
        return this.manageKbn;
    }

    /**
     * @param o MANAGE_KBN
     */
    public void setManageKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.manageKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.manageKbn = null;
        }
    }

    /** IN_OUT_KBN */
    private java.math.BigDecimal inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("IN_OUT_KBN")
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

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_CODE")
    public String getSupCode() {
        return this.supCode;
    }

    /**
     * @param o SUP_CODE
     */
    public void setSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supCode = String.valueOf(o.toString());
        } else {
            this.supCode = null;
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
     * MST_SUBINV照会
     *
     * @param param1 SUB_INV_CODE
     * @return MST_SUBINV
     */
    public static MstSubinv get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SUB_INV_CODE\") = TRIM (:sub_inv_code)");

        String sql = "SELECT * FROM MST_SUBINV WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sub_inv_code", param1);

        return Queries.get(sql, params, MstSubinv.class);
    }

    /**
     * MST_SUBINV追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SUB_INV_CODEの採番処理
        numbering();

        // MST_SUBINVの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SUB_INV_CODE\" -- :sub_inv_code");
        nameList.add("\"SUB_INV_NAME\" -- :sub_inv_name");
        nameList.add("\"MANAGE_KBN\" -- :manage_kbn");
        nameList.add("\"IN_OUT_KBN\" -- :in_out_kbn");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUBINV(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sub_inv_code");
        valueList.add(":sub_inv_name");
        valueList.add(":manage_kbn");
        valueList.add(":in_out_kbn");
        valueList.add(":sup_code");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** SUB_INV_CODEの採番処理 */
    private void numbering() {

        if (this.subInvCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"SUB_INV_CODE\") IS NULL THEN 0 ELSE MAX(e.\"SUB_INV_CODE\") * 1 END + 1, 10, '0') AS \"SUB_INV_CODE\" FROM MST_SUBINV e WHERE e.\"SUB_INV_CODE\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SUB_INV_CODE");

        this.setSubInvCode(o);
    }

    /**
     * MST_SUBINV更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SUBINVの登録
        String sql = "UPDATE MST_SUBINV\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SUB_INV_CODE\" = :sub_inv_code");
        setList.add("\"SUB_INV_NAME\" = :sub_inv_name");
        setList.add("\"MANAGE_KBN\" = :manage_kbn");
        setList.add("\"IN_OUT_KBN\" = :in_out_kbn");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUBINV削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SUBINVの削除
        String sql = "DELETE FROM MST_SUBINV WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SUB_INV_CODE\") = TRIM (:sub_inv_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sub_inv_code", this.subInvCode);
        params.put("sub_inv_name", this.subInvName);
        params.put("manage_kbn", this.manageKbn);
        params.put("in_out_kbn", this.inOutKbn);
        params.put("sup_code", this.supCode);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
