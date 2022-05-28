package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_M_WC_MCN_LOAD_PLAN_BK
 *
 * @author emarfkrow
 */
public class PrdMWcMcnLoadPlanBk implements IEntity {

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

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
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

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return this.wcCode;
    }

    /**
     * @param o WC_CODE
     */
    public void setWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcCode = String.valueOf(o.toString());
        } else {
            this.wcCode = null;
        }
    }

    /** PRO_NES_COUNTS */
    private java.math.BigDecimal proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
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

    /** COMMENT1 */
    private String comment1;

    /**
     * @return COMMENT1
     */
    public String getComment1() {
        return this.comment1;
    }

    /**
     * @param o COMMENT1
     */
    public void setComment1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment1 = String.valueOf(o.toString());
        } else {
            this.comment1 = null;
        }
    }

    /** COMMENT2 */
    private String comment2;

    /**
     * @return COMMENT2
     */
    public String getComment2() {
        return this.comment2;
    }

    /**
     * @param o COMMENT2
     */
    public void setComment2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment2 = String.valueOf(o.toString());
        } else {
            this.comment2 = null;
        }
    }

    /** UNIT_WEIGHT */
    private java.math.BigDecimal unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
    public java.math.BigDecimal getUnitWeight() {
        return this.unitWeight;
    }

    /**
     * @param o UNIT_WEIGHT
     */
    public void setUnitWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.unitWeight = null;
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
     * PRD_M_WC_MCN_LOAD_PLAN_BK照会
     *
     * @return PRD_M_WC_MCN_LOAD_PLAN_BK
     */
    public static PrdMWcMcnLoadPlanBk get() {

        List<String> whereList = new ArrayList<String>();

        String sql = "SELECT * FROM PRD_M_WC_MCN_LOAD_PLAN_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();

        return Queries.get(sql, params, PrdMWcMcnLoadPlanBk.class);
    }

    /**
     * PRD_M_WC_MCN_LOAD_PLAN_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_M_WC_MCN_LOAD_PLAN_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("man_hinban -- :man_hinban");
        nameList.add("wc_code -- :wc_code");
        nameList.add("pro_nes_counts -- :pro_nes_counts");
        nameList.add("hum_pre_time -- :hum_pre_time");
        nameList.add("hum_act_time -- :hum_act_time");
        nameList.add("mac_pre_time_in -- :mac_pre_time_in");
        nameList.add("mac_act_time_in -- :mac_act_time_in");
        nameList.add("mac_pre_time_out -- :mac_pre_time_out");
        nameList.add("mac_act_time_out -- :mac_act_time_out");
        nameList.add("mac_pre_time_kanban -- :mac_pre_time_kanban");
        nameList.add("mac_act_time_kanban -- :mac_act_time_kanban");
        nameList.add("comment1 -- :comment1");
        nameList.add("comment2 -- :comment2");
        nameList.add("unit_weight -- :unit_weight");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_M_WC_MCN_LOAD_PLAN_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":man_hinban");
        valueList.add(":wc_code");
        valueList.add(":pro_nes_counts");
        valueList.add(":hum_pre_time");
        valueList.add(":hum_act_time");
        valueList.add(":mac_pre_time_in");
        valueList.add(":mac_act_time_in");
        valueList.add(":mac_pre_time_out");
        valueList.add(":mac_act_time_out");
        valueList.add(":mac_pre_time_kanban");
        valueList.add(":mac_act_time_kanban");
        valueList.add(":comment1");
        valueList.add(":comment2");
        valueList.add(":unit_weight");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_M_WC_MCN_LOAD_PLAN_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_M_WC_MCN_LOAD_PLAN_BKの登録
        String sql = "UPDATE PRD_M_WC_MCN_LOAD_PLAN_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("man_hinban = :man_hinban");
        setList.add("wc_code = :wc_code");
        setList.add("pro_nes_counts = :pro_nes_counts");
        setList.add("hum_pre_time = :hum_pre_time");
        setList.add("hum_act_time = :hum_act_time");
        setList.add("mac_pre_time_in = :mac_pre_time_in");
        setList.add("mac_act_time_in = :mac_act_time_in");
        setList.add("mac_pre_time_out = :mac_pre_time_out");
        setList.add("mac_act_time_out = :mac_act_time_out");
        setList.add("mac_pre_time_kanban = :mac_pre_time_kanban");
        setList.add("mac_act_time_kanban = :mac_act_time_kanban");
        setList.add("comment1 = :comment1");
        setList.add("comment2 = :comment2");
        setList.add("unit_weight = :unit_weight");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_M_WC_MCN_LOAD_PLAN_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_M_WC_MCN_LOAD_PLAN_BKの削除
        String sql = "DELETE FROM PRD_M_WC_MCN_LOAD_PLAN_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("MAN_HINBAN", this.manHinban);
        params.put("WC_CODE", this.wcCode);
        params.put("PRO_NES_COUNTS", this.proNesCounts);
        params.put("HUM_PRE_TIME", this.humPreTime);
        params.put("HUM_ACT_TIME", this.humActTime);
        params.put("MAC_PRE_TIME_IN", this.macPreTimeIn);
        params.put("MAC_ACT_TIME_IN", this.macActTimeIn);
        params.put("MAC_PRE_TIME_OUT", this.macPreTimeOut);
        params.put("MAC_ACT_TIME_OUT", this.macActTimeOut);
        params.put("MAC_PRE_TIME_KANBAN", this.macPreTimeKanban);
        params.put("MAC_ACT_TIME_KANBAN", this.macActTimeKanban);
        params.put("COMMENT1", this.comment1);
        params.put("COMMENT2", this.comment2);
        params.put("UNIT_WEIGHT", this.unitWeight);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
