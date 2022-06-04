package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_CODE_VALUE
 *
 * @author emarfkrow
 */
public class MstCodeValue implements IEntity {

    /** CODE_NM */
    private String codeNm;

    /**
     * @return CODE_NM
     */
    public String getCodeNm() {
        return this.codeNm;
    }

    /**
     * @param o CODE_NM
     */
    public void setCodeNm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeNm = String.valueOf(o.toString());
        } else {
            this.codeNm = null;
        }
    }

    /** CODE_VALUE */
    private String codeValue;

    /**
     * @return CODE_VALUE
     */
    public String getCodeValue() {
        return this.codeValue;
    }

    /**
     * @param o CODE_VALUE
     */
    public void setCodeValue(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeValue = String.valueOf(o.toString());
        } else {
            this.codeValue = null;
        }
    }

    /** CODE_VALUE_MEI */
    private String codeValueMei;

    /**
     * @return CODE_VALUE_MEI
     */
    public String getCodeValueMei() {
        return this.codeValueMei;
    }

    /**
     * @param o CODE_VALUE_MEI
     */
    public void setCodeValueMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeValueMei = String.valueOf(o.toString());
        } else {
            this.codeValueMei = null;
        }
    }

    /** HYOJI_JUN */
    private java.math.BigDecimal hyojiJun;

    /**
     * @return HYOJI_JUN
     */
    public java.math.BigDecimal getHyojiJun() {
        return this.hyojiJun;
    }

    /**
     * @param o HYOJI_JUN
     */
    public void setHyojiJun(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hyojiJun = new java.math.BigDecimal(o.toString());
        } else {
            this.hyojiJun = null;
        }
    }

    /** CRITERIA */
    private String criteria;

    /**
     * @return CRITERIA
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @param o CRITERIA
     */
    public void setCriteria(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.criteria = String.valueOf(o.toString());
        } else {
            this.criteria = null;
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

    /**
     * MST_CODE_VALUE照会
     *
     * @param param1 CODE_NM
     * @param param2 CODE_VALUE
     * @return MST_CODE_VALUE
     */
    public static MstCodeValue get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"CODE_NM\" = :code_nm");
        whereList.add("\"CODE_VALUE\" = :code_value");

        String sql = "SELECT * FROM MST_CODE_VALUE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", param1);
        params.put("code_value", param2);

        return Queries.get(sql, params, MstCodeValue.class);
    }

    /**
     * MST_CODE_VALUE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_CODE_VALUEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"CODE_NM\" -- :code_nm");
        nameList.add("\"CODE_VALUE\" -- :code_value");
        nameList.add("\"CODE_VALUE_MEI\" -- :code_value_mei");
        nameList.add("\"HYOJI_JUN\" -- :hyoji_jun");
        nameList.add("\"CRITERIA\" -- :criteria");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_CODE_VALUE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":code_nm");
        valueList.add(":code_value");
        valueList.add(":code_value_mei");
        valueList.add(":hyoji_jun");
        valueList.add(":criteria");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_CODE_VALUE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_CODE_VALUEの登録
        String sql = "UPDATE MST_CODE_VALUE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"CODE_NM\" = :code_nm");
        setList.add("\"CODE_VALUE\" = :code_value");
        setList.add("\"CODE_VALUE_MEI\" = :code_value_mei");
        setList.add("\"HYOJI_JUN\" = :hyoji_jun");
        setList.add("\"CRITERIA\" = :criteria");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_CODE_VALUE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_CODE_VALUEの削除
        String sql = "DELETE FROM MST_CODE_VALUE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"CODE_NM\" = :code_nm");
        whereList.add("\"CODE_VALUE\" = :code_value");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", this.codeNm);
        params.put("code_value", this.codeValue);
        params.put("code_value_mei", this.codeValueMei);
        params.put("hyoji_jun", this.hyojiJun);
        params.put("criteria", this.criteria);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
