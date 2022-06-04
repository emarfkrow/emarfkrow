package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_LOCATION
 *
 * @author emarfkrow
 */
public class MstLocation implements IEntity {

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

    /** LOCATION_NAME */
    private String locationName;

    /**
     * @return LOCATION_NAME
     */
    public String getLocationName() {
        return this.locationName;
    }

    /**
     * @param o LOCATION_NAME
     */
    public void setLocationName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locationName = String.valueOf(o.toString());
        } else {
            this.locationName = null;
        }
    }

    /** LOC_KBN */
    private java.math.BigDecimal locKbn;

    /**
     * @return LOC_KBN
     */
    public java.math.BigDecimal getLocKbn() {
        return this.locKbn;
    }

    /**
     * @param o LOC_KBN
     */
    public void setLocKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.locKbn = null;
        }
    }

    /** LOC_STATUS */
    private java.math.BigDecimal locStatus;

    /**
     * @return LOC_STATUS
     */
    public java.math.BigDecimal getLocStatus() {
        return this.locStatus;
    }

    /**
     * @param o LOC_STATUS
     */
    public void setLocStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.locStatus = null;
        }
    }

    /** LOC_ENABLE */
    private java.math.BigDecimal locEnable;

    /**
     * @return LOC_ENABLE
     */
    public java.math.BigDecimal getLocEnable() {
        return this.locEnable;
    }

    /**
     * @param o LOC_ENABLE
     */
    public void setLocEnable(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locEnable = new java.math.BigDecimal(o.toString());
        } else {
            this.locEnable = null;
        }
    }

    /** SUB_INV_CODE */
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
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

    /** AREA_CD */
    private String areaCd;

    /**
     * @return AREA_CD
     */
    public String getAreaCd() {
        return this.areaCd;
    }

    /**
     * @param o AREA_CD
     */
    public void setAreaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.areaCd = String.valueOf(o.toString());
        } else {
            this.areaCd = null;
        }
    }

    /** STORE_MAN_ID */
    private java.math.BigDecimal storeManId;

    /**
     * @return STORE_MAN_ID
     */
    public java.math.BigDecimal getStoreManId() {
        return this.storeManId;
    }

    /**
     * @param o STORE_MAN_ID
     */
    public void setStoreManId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.storeManId = new java.math.BigDecimal(o.toString());
        } else {
            this.storeManId = null;
        }
    }

    /**
     * MST_LOCATION照会
     *
     * @param param1 LOCATION_CODE
     * @return MST_LOCATION
     */
    public static MstLocation get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"LOCATION_CODE\") = TRIM (:location_code)");

        String sql = "SELECT * FROM MST_LOCATION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", param1);

        return Queries.get(sql, params, MstLocation.class);
    }

    /**
     * MST_LOCATION追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // LOCATION_CODEの採番処理
        numbering();

        // MST_LOCATIONの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"LOCATION_CODE\" -- :location_code");
        nameList.add("\"LOCATION_NAME\" -- :location_name");
        nameList.add("\"LOC_KBN\" -- :loc_kbn");
        nameList.add("\"LOC_STATUS\" -- :loc_status");
        nameList.add("\"LOC_ENABLE\" -- :loc_enable");
        nameList.add("\"SUB_INV_CODE\" -- :sub_inv_code");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"AREA_CD\" -- :area_cd");
        nameList.add("\"STORE_MAN_ID\" -- :store_man_id");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_LOCATION(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":location_code");
        valueList.add(":location_name");
        valueList.add(":loc_kbn");
        valueList.add(":loc_status");
        valueList.add(":loc_enable");
        valueList.add(":sub_inv_code");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":area_cd");
        valueList.add(":store_man_id");
        return String.join("\r\n    , ", valueList);
    }

    /** LOCATION_CODEの採番処理 */
    private void numbering() {

        if (this.locationCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"LOCATION_CODE\") IS NULL THEN 0 ELSE MAX(e.\"LOCATION_CODE\") * 1 END + 1, 10, '0') AS \"LOCATION_CODE\" FROM MST_LOCATION e WHERE e.\"LOCATION_CODE\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("LOCATION_CODE");

        this.setLocationCode(o);
    }

    /**
     * MST_LOCATION更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_LOCATIONの登録
        String sql = "UPDATE MST_LOCATION\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"LOCATION_CODE\" = :location_code");
        setList.add("\"LOCATION_NAME\" = :location_name");
        setList.add("\"LOC_KBN\" = :loc_kbn");
        setList.add("\"LOC_STATUS\" = :loc_status");
        setList.add("\"LOC_ENABLE\" = :loc_enable");
        setList.add("\"SUB_INV_CODE\" = :sub_inv_code");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"AREA_CD\" = :area_cd");
        setList.add("\"STORE_MAN_ID\" = :store_man_id");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_LOCATION削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_LOCATIONの削除
        String sql = "DELETE FROM MST_LOCATION WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"LOCATION_CODE\") = TRIM (:location_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", this.locationCode);
        params.put("location_name", this.locationName);
        params.put("loc_kbn", this.locKbn);
        params.put("loc_status", this.locStatus);
        params.put("loc_enable", this.locEnable);
        params.put("sub_inv_code", this.subInvCode);
        params.put("delete_flag", this.deleteFlag);
        params.put("area_cd", this.areaCd);
        params.put("store_man_id", this.storeManId);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
