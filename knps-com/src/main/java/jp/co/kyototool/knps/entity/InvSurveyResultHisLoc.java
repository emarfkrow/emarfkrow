package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_SURVEY_RESULT_HIS_LOC
 *
 * @author emarfkrow
 */
public class InvSurveyResultHisLoc implements IEntity {

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

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return this.yyyy;
    }

    /**
     * @param o YYYY
     */
    public void setYyyy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yyyy = String.valueOf(o.toString());
        } else {
            this.yyyy = null;
        }
    }

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return this.mm;
    }

    /**
     * @param o MM
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = String.valueOf(o.toString());
        } else {
            this.mm = null;
        }
    }

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** STOCK */
    private java.math.BigDecimal stock;

    /**
     * @return STOCK
     */
    public java.math.BigDecimal getStock() {
        return this.stock;
    }

    /**
     * @param o STOCK
     */
    public void setStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stock = new java.math.BigDecimal(o.toString());
        } else {
            this.stock = null;
        }
    }

    /** DECISION_KBN */
    private java.math.BigDecimal decisionKbn;

    /**
     * @return DECISION_KBN
     */
    public java.math.BigDecimal getDecisionKbn() {
        return this.decisionKbn;
    }

    /**
     * @param o DECISION_KBN
     */
    public void setDecisionKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.decisionKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.decisionKbn = null;
        }
    }

    /** ENTRY_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime entryDate;

    /**
     * @return ENTRY_DATE
     */
    public java.time.LocalDateTime getEntryDate() {
        return this.entryDate;
    }

    /**
     * @param o ENTRY_DATE
     */
    public void setEntryDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.entryDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.entryDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entryDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.entryDate = null;
        }
    }

    /** REGISTRANT */
    private String registrant;

    /**
     * @return REGISTRANT
     */
    public String getRegistrant() {
        return this.registrant;
    }

    /**
     * @param o REGISTRANT
     */
    public void setRegistrant(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.registrant = String.valueOf(o.toString());
        } else {
            this.registrant = null;
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

    /** SHUKEI_TANI_MEI */
    private String shukeiTaniMei;

    /**
     * @return SHUKEI_TANI_MEI
     */
    public String getShukeiTaniMei() {
        return this.shukeiTaniMei;
    }

    /**
     * @param o SHUKEI_TANI_MEI
     */
    public void setShukeiTaniMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukeiTaniMei = String.valueOf(o.toString());
        } else {
            this.shukeiTaniMei = null;
        }
    }

    /**
     * INV_SURVEY_RESULT_HIS_LOC照会
     *
     * @param param1 LOCATION_CODE
     * @param param2 YYYY
     * @param param3 MM
     * @return INV_SURVEY_RESULT_HIS_LOC
     */
    public static InvSurveyResultHisLoc get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"LOCATION_CODE\") = TRIM (:location_code)");
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");

        String sql = "SELECT * FROM INV_SURVEY_RESULT_HIS_LOC WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", param1);
        params.put("yyyy", param2);
        params.put("mm", param3);

        return Queries.get(sql, params, InvSurveyResultHisLoc.class);
    }

    /**
     * INV_SURVEY_RESULT_HIS_LOC追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MMの採番処理
        numbering();

        // INV_SURVEY_RESULT_HIS_LOCの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"LOCATION_CODE\" -- :location_code");
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"STOCK\" -- :stock");
        nameList.add("\"DECISION_KBN\" -- :decision_kbn");
        nameList.add("\"ENTRY_DATE\" -- :entry_date");
        nameList.add("\"REGISTRANT\" -- :registrant");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"SHUKEI_TANI_MEI\" -- :shukei_tani_mei");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_SURVEY_RESULT_HIS_LOC(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":location_code");
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":hinban");
        valueList.add(":stock");
        valueList.add(":decision_kbn");
        valueList.add("TO_TIMESTAMP (:entry_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":registrant");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":shukei_tani_mei");
        return String.join("\r\n    , ", valueList);
    }

    /** MMの採番処理 */
    private void numbering() {

        if (this.mm != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"MM\") IS NULL THEN 0 ELSE MAX(e.\"MM\") * 1 END + 1, 2, '0') AS \"MM\" FROM INV_SURVEY_RESULT_HIS_LOC e WHERE e.\"MM\" < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"LOCATION_CODE\" = :location_code");
        whereList.add("e.\"YYYY\" = :yyyy");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("location_code", this.locationCode);
        params.put("yyyy", this.yyyy);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MM");

        this.setMm(o);
    }

    /**
     * INV_SURVEY_RESULT_HIS_LOC更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_SURVEY_RESULT_HIS_LOCの登録
        String sql = "UPDATE INV_SURVEY_RESULT_HIS_LOC\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"LOCATION_CODE\" = :location_code");
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"STOCK\" = :stock");
        setList.add("\"DECISION_KBN\" = :decision_kbn");
        setList.add("\"ENTRY_DATE\" = TO_TIMESTAMP (:entry_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"REGISTRANT\" = :registrant");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"SHUKEI_TANI_MEI\" = :shukei_tani_mei");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_SURVEY_RESULT_HIS_LOC削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_SURVEY_RESULT_HIS_LOCの削除
        String sql = "DELETE FROM INV_SURVEY_RESULT_HIS_LOC WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"LOCATION_CODE\") = TRIM (:location_code)");
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", this.locationCode);
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("hinban", this.hinban);
        params.put("stock", this.stock);
        params.put("decision_kbn", this.decisionKbn);
        params.put("entry_date", this.entryDate);
        params.put("registrant", this.registrant);
        params.put("shukei_tani_mei", this.shukeiTaniMei);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
