package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_M_WS_MAN_LOAD_PLAN_BK
 *
 * @author emarfkrow
 */
public class PrdMWsManLoadPlanBk implements IEntity {

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YYYY")
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
    @com.fasterxml.jackson.annotation.JsonProperty("MM")
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

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAN_HINBAN")
    public String getManHinban() {
        return this.manHinban;
    }

    /**
     * @param o MAN_HINBAN
     */
    public void setManHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.manHinban = String.valueOf(o.toString());
        } else {
            this.manHinban = null;
        }
    }

    /** WS_CODE */
    private String wsCode;

    /**
     * @return WS_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WS_CODE")
    public String getWsCode() {
        return this.wsCode;
    }

    /**
     * @param o WS_CODE
     */
    public void setWsCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wsCode = String.valueOf(o.toString());
        } else {
            this.wsCode = null;
        }
    }

    /** PRO_NES_COUNTS */
    private java.math.BigDecimal proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_NES_COUNTS")
    public java.math.BigDecimal getProNesCounts() {
        return this.proNesCounts;
    }

    /**
     * @param o PRO_NES_COUNTS
     */
    public void setProNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.proNesCounts = null;
        }
    }

    /** HUM_PRE_TIME */
    private java.math.BigDecimal humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_PRE_TIME")
    public java.math.BigDecimal getHumPreTime() {
        return this.humPreTime;
    }

    /**
     * @param o HUM_PRE_TIME
     */
    public void setHumPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humPreTime = null;
        }
    }

    /** HUM_ACT_TIME */
    private java.math.BigDecimal humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_ACT_TIME")
    public java.math.BigDecimal getHumActTime() {
        return this.humActTime;
    }

    /**
     * @param o HUM_ACT_TIME
     */
    public void setHumActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humActTime = null;
        }
    }

    /** MAC_PRE_TIME_IN */
    private java.math.BigDecimal macPreTimeIn;

    /**
     * @return MAC_PRE_TIME_IN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_PRE_TIME_IN")
    public java.math.BigDecimal getMacPreTimeIn() {
        return this.macPreTimeIn;
    }

    /**
     * @param o MAC_PRE_TIME_IN
     */
    public void setMacPreTimeIn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTimeIn = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTimeIn = null;
        }
    }

    /** MAC_ACT_TIME_IN */
    private java.math.BigDecimal macActTimeIn;

    /**
     * @return MAC_ACT_TIME_IN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_ACT_TIME_IN")
    public java.math.BigDecimal getMacActTimeIn() {
        return this.macActTimeIn;
    }

    /**
     * @param o MAC_ACT_TIME_IN
     */
    public void setMacActTimeIn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTimeIn = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTimeIn = null;
        }
    }

    /** MAC_PRE_TIME_OUT */
    private java.math.BigDecimal macPreTimeOut;

    /**
     * @return MAC_PRE_TIME_OUT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_PRE_TIME_OUT")
    public java.math.BigDecimal getMacPreTimeOut() {
        return this.macPreTimeOut;
    }

    /**
     * @param o MAC_PRE_TIME_OUT
     */
    public void setMacPreTimeOut(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTimeOut = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTimeOut = null;
        }
    }

    /** MAC_ACT_TIME_OUT */
    private java.math.BigDecimal macActTimeOut;

    /**
     * @return MAC_ACT_TIME_OUT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_ACT_TIME_OUT")
    public java.math.BigDecimal getMacActTimeOut() {
        return this.macActTimeOut;
    }

    /**
     * @param o MAC_ACT_TIME_OUT
     */
    public void setMacActTimeOut(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTimeOut = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTimeOut = null;
        }
    }

    /** MAC_PRE_TIME_KANBAN */
    private java.math.BigDecimal macPreTimeKanban;

    /**
     * @return MAC_PRE_TIME_KANBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_PRE_TIME_KANBAN")
    public java.math.BigDecimal getMacPreTimeKanban() {
        return this.macPreTimeKanban;
    }

    /**
     * @param o MAC_PRE_TIME_KANBAN
     */
    public void setMacPreTimeKanban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTimeKanban = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTimeKanban = null;
        }
    }

    /** MAC_ACT_TIME_KANBAN */
    private java.math.BigDecimal macActTimeKanban;

    /**
     * @return MAC_ACT_TIME_KANBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_ACT_TIME_KANBAN")
    public java.math.BigDecimal getMacActTimeKanban() {
        return this.macActTimeKanban;
    }

    /**
     * @param o MAC_ACT_TIME_KANBAN
     */
    public void setMacActTimeKanban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTimeKanban = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTimeKanban = null;
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
     * PRD_M_WS_MAN_LOAD_PLAN_BK照会
     *
     * @return PRD_M_WS_MAN_LOAD_PLAN_BK
     */
    public static PrdMWsManLoadPlanBk get() {

        List<String> whereList = new ArrayList<String>();

        String sql = "SELECT * FROM PRD_M_WS_MAN_LOAD_PLAN_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();

        return Queries.get(sql, params, PrdMWsManLoadPlanBk.class);
    }

    /**
     * PRD_M_WS_MAN_LOAD_PLAN_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_M_WS_MAN_LOAD_PLAN_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"MAN_HINBAN\" -- :man_hinban");
        nameList.add("\"WS_CODE\" -- :ws_code");
        nameList.add("\"PRO_NES_COUNTS\" -- :pro_nes_counts");
        nameList.add("\"HUM_PRE_TIME\" -- :hum_pre_time");
        nameList.add("\"HUM_ACT_TIME\" -- :hum_act_time");
        nameList.add("\"MAC_PRE_TIME_IN\" -- :mac_pre_time_in");
        nameList.add("\"MAC_ACT_TIME_IN\" -- :mac_act_time_in");
        nameList.add("\"MAC_PRE_TIME_OUT\" -- :mac_pre_time_out");
        nameList.add("\"MAC_ACT_TIME_OUT\" -- :mac_act_time_out");
        nameList.add("\"MAC_PRE_TIME_KANBAN\" -- :mac_pre_time_kanban");
        nameList.add("\"MAC_ACT_TIME_KANBAN\" -- :mac_act_time_kanban");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_M_WS_MAN_LOAD_PLAN_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":man_hinban");
        valueList.add(":ws_code");
        valueList.add(":pro_nes_counts");
        valueList.add(":hum_pre_time");
        valueList.add(":hum_act_time");
        valueList.add(":mac_pre_time_in");
        valueList.add(":mac_act_time_in");
        valueList.add(":mac_pre_time_out");
        valueList.add(":mac_act_time_out");
        valueList.add(":mac_pre_time_kanban");
        valueList.add(":mac_act_time_kanban");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_M_WS_MAN_LOAD_PLAN_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_M_WS_MAN_LOAD_PLAN_BKの登録
        String sql = "UPDATE PRD_M_WS_MAN_LOAD_PLAN_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"MAN_HINBAN\" = :man_hinban");
        setList.add("\"WS_CODE\" = :ws_code");
        setList.add("\"PRO_NES_COUNTS\" = :pro_nes_counts");
        setList.add("\"HUM_PRE_TIME\" = :hum_pre_time");
        setList.add("\"HUM_ACT_TIME\" = :hum_act_time");
        setList.add("\"MAC_PRE_TIME_IN\" = :mac_pre_time_in");
        setList.add("\"MAC_ACT_TIME_IN\" = :mac_act_time_in");
        setList.add("\"MAC_PRE_TIME_OUT\" = :mac_pre_time_out");
        setList.add("\"MAC_ACT_TIME_OUT\" = :mac_act_time_out");
        setList.add("\"MAC_PRE_TIME_KANBAN\" = :mac_pre_time_kanban");
        setList.add("\"MAC_ACT_TIME_KANBAN\" = :mac_act_time_kanban");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_M_WS_MAN_LOAD_PLAN_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_M_WS_MAN_LOAD_PLAN_BKの削除
        String sql = "DELETE FROM PRD_M_WS_MAN_LOAD_PLAN_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("man_hinban", this.manHinban);
        params.put("ws_code", this.wsCode);
        params.put("pro_nes_counts", this.proNesCounts);
        params.put("hum_pre_time", this.humPreTime);
        params.put("hum_act_time", this.humActTime);
        params.put("mac_pre_time_in", this.macPreTimeIn);
        params.put("mac_act_time_in", this.macActTimeIn);
        params.put("mac_pre_time_out", this.macPreTimeOut);
        params.put("mac_act_time_out", this.macActTimeOut);
        params.put("mac_pre_time_kanban", this.macPreTimeKanban);
        params.put("mac_act_time_kanban", this.macActTimeKanban);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
