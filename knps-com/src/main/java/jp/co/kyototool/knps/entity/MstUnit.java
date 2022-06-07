package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_UNIT
 *
 * @author emarfkrow
 */
public class MstUnit implements IEntity {

    /** UNIT_CODE */
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_CODE")
    public String getUnitCode() {
        return this.unitCode;
    }

    /**
     * @param o UNIT_CODE
     */
    public void setUnitCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCode = String.valueOf(o.toString());
        } else {
            this.unitCode = null;
        }
    }

    /** UNIT_NAME */
    private String unitName;

    /**
     * @return UNIT_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_NAME")
    public String getUnitName() {
        return this.unitName;
    }

    /**
     * @param o UNIT_NAME
     */
    public void setUnitName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitName = String.valueOf(o.toString());
        } else {
            this.unitName = null;
        }
    }

    /** STAN_UNIT_KBN */
    private java.math.BigDecimal stanUnitKbn;

    /**
     * @return STAN_UNIT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STAN_UNIT_KBN")
    public java.math.BigDecimal getStanUnitKbn() {
        return this.stanUnitKbn;
    }

    /**
     * @param o STAN_UNIT_KBN
     */
    public void setStanUnitKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stanUnitKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.stanUnitKbn = null;
        }
    }

    /** STAN_UNIT_CODE */
    private String stanUnitCode;

    /**
     * @return STAN_UNIT_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STAN_UNIT_CODE")
    public String getStanUnitCode() {
        return this.stanUnitCode;
    }

    /**
     * @param o STAN_UNIT_CODE
     */
    public void setStanUnitCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stanUnitCode = String.valueOf(o.toString());
        } else {
            this.stanUnitCode = null;
        }
    }

    /** EXCHANGE_RATE */
    private java.math.BigDecimal exchangeRate;

    /**
     * @return EXCHANGE_RATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXCHANGE_RATE")
    public java.math.BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * @param o EXCHANGE_RATE
     */
    public void setExchangeRate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.exchangeRate = new java.math.BigDecimal(o.toString());
        } else {
            this.exchangeRate = null;
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
    private java.math.BigDecimal deleteFlag;

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
     * MST_UNIT照会
     *
     * @param param1 UNIT_CODE
     * @return MST_UNIT
     */
    public static MstUnit get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"UNIT_CODE\") = TRIM (:unit_code)");

        String sql = "SELECT * FROM MST_UNIT WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("unit_code", param1);

        return Queries.get(sql, params, MstUnit.class);
    }

    /**
     * MST_UNIT追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // UNIT_CODEの採番処理
        numbering();

        // MST_UNITの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"UNIT_CODE\" -- :unit_code");
        nameList.add("\"UNIT_NAME\" -- :unit_name");
        nameList.add("\"STAN_UNIT_KBN\" -- :stan_unit_kbn");
        nameList.add("\"STAN_UNIT_CODE\" -- :stan_unit_code");
        nameList.add("\"EXCHANGE_RATE\" -- :exchange_rate");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_UNIT(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":unit_code");
        valueList.add(":unit_name");
        valueList.add(":stan_unit_kbn");
        valueList.add(":stan_unit_code");
        valueList.add(":exchange_rate");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** UNIT_CODEの採番処理 */
    private void numbering() {

        if (this.unitCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"UNIT_CODE\") IS NULL THEN 0 ELSE MAX(e.\"UNIT_CODE\") * 1 END + 1, 2, '0') AS \"UNIT_CODE\" FROM MST_UNIT e WHERE e.\"UNIT_CODE\" < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("UNIT_CODE");

        this.setUnitCode(o);
    }

    /**
     * MST_UNIT更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_UNITの登録
        String sql = "UPDATE MST_UNIT\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"UNIT_CODE\" = :unit_code");
        setList.add("\"UNIT_NAME\" = :unit_name");
        setList.add("\"STAN_UNIT_KBN\" = :stan_unit_kbn");
        setList.add("\"STAN_UNIT_CODE\" = :stan_unit_code");
        setList.add("\"EXCHANGE_RATE\" = :exchange_rate");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_UNIT削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_UNITの削除
        String sql = "DELETE FROM MST_UNIT WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"UNIT_CODE\") = TRIM (:unit_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("unit_code", this.unitCode);
        params.put("unit_name", this.unitName);
        params.put("stan_unit_kbn", this.stanUnitKbn);
        params.put("stan_unit_code", this.stanUnitCode);
        params.put("exchange_rate", this.exchangeRate);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
