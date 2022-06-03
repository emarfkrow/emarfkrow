package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * F_JUCHUZ
 *
 * @author emarfkrow
 */
public class FJuchuz implements IEntity {

    /** TOKUCD */
    private String tokucd;

    /**
     * @return TOKUCD
     */
    public String getTokucd() {
        return this.tokucd;
    }

    /**
     * @param o TOKUCD
     */
    public void setTokucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokucd = String.valueOf(o.toString());
        } else {
            this.tokucd = null;
        }
    }

    /** CHOKUCD */
    private String chokucd;

    /**
     * @return CHOKUCD
     */
    public String getChokucd() {
        return this.chokucd;
    }

    /**
     * @param o CHOKUCD
     */
    public void setChokucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokucd = String.valueOf(o.toString());
        } else {
            this.chokucd = null;
        }
    }

    /** HHINBAN */
    private String hhinban;

    /**
     * @return HHINBAN
     */
    public String getHhinban() {
        return this.hhinban;
    }

    /**
     * @param o HHINBAN
     */
    public void setHhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hhinban = String.valueOf(o.toString());
        } else {
            this.hhinban = null;
        }
    }

    /** CHUBAN */
    private String chuban;

    /**
     * @return CHUBAN
     */
    public String getChuban() {
        return this.chuban;
    }

    /**
     * @param o CHUBAN
     */
    public void setChuban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chuban = String.valueOf(o.toString());
        } else {
            this.chuban = null;
        }
    }

    /** JUCHUSU */
    private java.math.BigDecimal juchusu;

    /**
     * @return JUCHUSU
     */
    public java.math.BigDecimal getJuchusu() {
        return this.juchusu;
    }

    /**
     * @param o JUCHUSU
     */
    public void setJuchusu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.juchusu = new java.math.BigDecimal(o.toString());
        } else {
            this.juchusu = null;
        }
    }

    /** JUCHUNO */
    private String juchuno;

    /**
     * @return JUCHUNO
     */
    public String getJuchuno() {
        return this.juchuno;
    }

    /**
     * @param o JUCHUNO
     */
    public void setJuchuno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.juchuno = String.valueOf(o.toString());
        } else {
            this.juchuno = null;
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
     * F_JUCHUZ照会
     *
     * @param param1 TOKUCD
     * @param param2 HHINBAN
     * @param param3 JUCHUNO
     * @return F_JUCHUZ
     */
    public static FJuchuz get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TOKUCD\" = :tokucd");
        whereList.add("\"HHINBAN\" = :hhinban");
        whereList.add("\"JUCHUNO\" = :juchuno");

        String sql = "SELECT * FROM F_JUCHUZ WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tokucd", param1);
        params.put("hhinban", param2);
        params.put("juchuno", param3);

        return Queries.get(sql, params, FJuchuz.class);
    }

    /**
     * F_JUCHUZ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // F_JUCHUZの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("tokucd -- :tokucd");
        nameList.add("chokucd -- :chokucd");
        nameList.add("hhinban -- :hhinban");
        nameList.add("chuban -- :chuban");
        nameList.add("juchusu -- :juchusu");
        nameList.add("juchuno -- :juchuno");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO F_JUCHUZ(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tokucd");
        valueList.add(":chokucd");
        valueList.add(":hhinban");
        valueList.add(":chuban");
        valueList.add(":juchusu");
        valueList.add(":juchuno");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * F_JUCHUZ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // F_JUCHUZの登録
        String sql = "UPDATE F_JUCHUZ\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("tokucd = :tokucd");
        setList.add("chokucd = :chokucd");
        setList.add("hhinban = :hhinban");
        setList.add("chuban = :chuban");
        setList.add("juchusu = :juchusu");
        setList.add("juchuno = :juchuno");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * F_JUCHUZ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // F_JUCHUZの削除
        String sql = "DELETE FROM F_JUCHUZ WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("tokucd = :tokucd");
        whereList.add("hhinban = :hhinban");
        whereList.add("juchuno = :juchuno");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("TOKUCD", this.tokucd);
        params.put("CHOKUCD", this.chokucd);
        params.put("HHINBAN", this.hhinban);
        params.put("CHUBAN", this.chuban);
        params.put("JUCHUSU", this.juchusu);
        params.put("JUCHUNO", this.juchuno);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
