package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * F_CHUMONX
 *
 * @author emarfkrow
 */
public class FChumonx implements IEntity {

    /** TOKUCD */
    private String tokucd;

    /**
     * @return TOKUCD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOKUCD")
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

    /** HHINBAN */
    private String hhinban;

    /**
     * @return HHINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HHINBAN")
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

    /** SHUKKASU-RUI */
    private java.math.BigDecimal shukkasuRui;

    /**
     * @return SHUKKASU-RUI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHUKKASU-RUI")
    public java.math.BigDecimal getShukkasuRui() {
        return this.shukkasuRui;
    }

    /**
     * @param o SHUKKASU-RUI
     */
    public void setShukkasuRui(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukkasuRui = new java.math.BigDecimal(o.toString());
        } else {
            this.shukkasuRui = null;
        }
    }

    /** JUCHUNO */
    private String juchuno;

    /**
     * @return JUCHUNO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("JUCHUNO")
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

    /**
     * F_CHUMONX照会
     *
     * @param param1 TOKUCD
     * @param param2 HHINBAN
     * @param param3 JUCHUNO
     * @return F_CHUMONX
     */
    public static FChumonx get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TOKUCD\" = :tokucd");
        whereList.add("\"HHINBAN\" = :hhinban");
        whereList.add("\"JUCHUNO\" = :juchuno");

        String sql = "SELECT * FROM F_CHUMONX WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tokucd", param1);
        params.put("hhinban", param2);
        params.put("juchuno", param3);

        return Queries.get(sql, params, FChumonx.class);
    }

    /**
     * F_CHUMONX追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // F_JUCHUMの登録
        if (this.fJuchum != null) {
            this.fJuchum.setTokucd(this.getTokucd());
            this.fJuchum.setHhinban(this.getHhinban());
            this.fJuchum.setJuchuno(this.getJuchuno());
            this.fJuchum.insert(now, id);
        }

        // F_JUCHUZの登録
        if (this.fJuchuz != null) {
            this.fJuchuz.setTokucd(this.getTokucd());
            this.fJuchuz.setHhinban(this.getHhinban());
            this.fJuchuz.setJuchuno(this.getJuchuno());
            this.fJuchuz.insert(now, id);
        }

        // F_CHUMONXの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"TOKUCD\" -- :tokucd");
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"SHUKKASU-RUI\" -- :shukkasu_rui");
        nameList.add("\"JUCHUNO\" -- :juchuno");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO F_CHUMONX(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tokucd");
        valueList.add(":hhinban");
        valueList.add(":shukkasu_rui");
        valueList.add(":juchuno");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * F_CHUMONX更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // F_JUCHUMの登録
        if (this.fJuchum != null) {
            fJuchum.setTokucd(this.getTokucd());
            fJuchum.setHhinban(this.getHhinban());
            fJuchum.setJuchuno(this.getJuchuno());
            try {
                fJuchum.insert(now, id);
            } catch (Exception e) {
                fJuchum.update(now, id);
            }
        }

        // F_JUCHUZの登録
        if (this.fJuchuz != null) {
            fJuchuz.setTokucd(this.getTokucd());
            fJuchuz.setHhinban(this.getHhinban());
            fJuchuz.setJuchuno(this.getJuchuno());
            try {
                fJuchuz.insert(now, id);
            } catch (Exception e) {
                fJuchuz.update(now, id);
            }
        }

        // F_CHUMONXの登録
        String sql = "UPDATE F_CHUMONX\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"TOKUCD\" = :tokucd");
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"SHUKKASU-RUI\" = :shukkasu_rui");
        setList.add("\"JUCHUNO\" = :juchuno");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * F_CHUMONX削除
     *
     * @return 削除件数
     */
    public int delete() {

        // F_JUCHUMの削除
        if (this.fJuchum != null) {
            this.fJuchum.delete();
        }

        // F_JUCHUZの削除
        if (this.fJuchuz != null) {
            this.fJuchuz.delete();
        }

        // F_CHUMONXの削除
        String sql = "DELETE FROM F_CHUMONX WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TOKUCD\" = :tokucd");
        whereList.add("\"HHINBAN\" = :hhinban");
        whereList.add("\"JUCHUNO\" = :juchuno");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tokucd", this.tokucd);
        params.put("hhinban", this.hhinban);
        params.put("shukkasu_rui", this.shukkasuRui);
        params.put("juchuno", this.juchuno);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * F_JUCHUM
     */
    private FJuchum fJuchum;

    /**
     * @return F_JUCHUM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FJuchum")
    public FJuchum getFJuchum() {
        return this.fJuchum;
    }

    /**
     * @param p F_JUCHUM
     */
    public void setFJuchum(final FJuchum p) {
        this.fJuchum = p;
    }

    /**
     * @return F_JUCHUM
     */
    public FJuchum referFJuchum() {
        if (this.fJuchum == null) {
            try {
                this.fJuchum = FJuchum.get(this.tokucd, this.hhinban, this.juchuno);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.fJuchum;
    }

    /**
     * F_JUCHUZ
     */
    private FJuchuz fJuchuz;

    /**
     * @return F_JUCHUZ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FJuchuz")
    public FJuchuz getFJuchuz() {
        return this.fJuchuz;
    }

    /**
     * @param p F_JUCHUZ
     */
    public void setFJuchuz(final FJuchuz p) {
        this.fJuchuz = p;
    }

    /**
     * @return F_JUCHUZ
     */
    public FJuchuz referFJuchuz() {
        if (this.fJuchuz == null) {
            try {
                this.fJuchuz = FJuchuz.get(this.tokucd, this.hhinban, this.juchuno);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.fJuchuz;
    }
}
