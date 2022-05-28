package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_M_WS_MAN_LOAD_PLAN
 *
 * @author emarfkrow
 */
public class PrdMWsManLoadPlan implements IEntity {

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

    /** WS_CODE */
    private String wsCode;

    /**
     * @return WS_CODE
     */
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
     * PRD_M_WS_MAN_LOAD_PLAN照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 MAN_HINBAN
     * @param param4 WS_CODE
     * @return PRD_M_WS_MAN_LOAD_PLAN
     */
    public static PrdMWsManLoadPlan get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("TRIM (ws_code) = TRIM (:ws_code)");

        String sql = "SELECT * FROM PRD_M_WS_MAN_LOAD_PLAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("man_hinban", param3);
        params.put("ws_code", param4);

        return Queries.get(sql, params, PrdMWsManLoadPlan.class);
    }

    /**
     * PRD_M_WS_MAN_LOAD_PLAN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // WS_CODEの採番処理
        numbering();

        // PRD_Y_WS_MAN_LOAD_PLANの登録
        if (this.prdYWsManLoadPlan != null) {
            this.prdYWsManLoadPlan.setYyyy(this.getYyyy());
            this.prdYWsManLoadPlan.setMm(this.getMm());
            this.prdYWsManLoadPlan.setManHinban(this.getManHinban());
            this.prdYWsManLoadPlan.setWsCode(this.getWsCode());
            this.prdYWsManLoadPlan.insert(now, id);
        }

        // PRD_M_WS_MAN_LOAD_PLANの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("man_hinban -- :man_hinban");
        nameList.add("ws_code -- :ws_code");
        nameList.add("pro_nes_counts -- :pro_nes_counts");
        nameList.add("hum_pre_time -- :hum_pre_time");
        nameList.add("hum_act_time -- :hum_act_time");
        nameList.add("mac_pre_time_in -- :mac_pre_time_in");
        nameList.add("mac_act_time_in -- :mac_act_time_in");
        nameList.add("mac_pre_time_out -- :mac_pre_time_out");
        nameList.add("mac_act_time_out -- :mac_act_time_out");
        nameList.add("mac_pre_time_kanban -- :mac_pre_time_kanban");
        nameList.add("mac_act_time_kanban -- :mac_act_time_kanban");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_M_WS_MAN_LOAD_PLAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

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

    /** WS_CODEの採番処理 */
    private void numbering() {

        if (this.wsCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.WS_CODE) IS NULL THEN 0 ELSE MAX(e.WS_CODE) * 1 END + 1, 4, '0') AS WS_CODE FROM PRD_M_WS_MAN_LOAD_PLAN e WHERE e.WS_CODE < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.YYYY = :yyyy");
        whereList.add("e.MM = :mm");
        whereList.add("e.MAN_HINBAN = :man_hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("manHinban", this.manHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("WS_CODE");

        this.setWsCode(o);
    }

    /**
     * PRD_M_WS_MAN_LOAD_PLAN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_Y_WS_MAN_LOAD_PLANの登録
        if (this.prdYWsManLoadPlan != null) {
            prdYWsManLoadPlan.setYyyy(this.getYyyy());
            prdYWsManLoadPlan.setMm(this.getMm());
            prdYWsManLoadPlan.setManHinban(this.getManHinban());
            prdYWsManLoadPlan.setWsCode(this.getWsCode());
            try {
                prdYWsManLoadPlan.insert(now, id);
            } catch (Exception e) {
                prdYWsManLoadPlan.update(now, id);
            }
        }

        // PRD_M_WS_MAN_LOAD_PLANの登録
        String sql = "UPDATE PRD_M_WS_MAN_LOAD_PLAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("man_hinban = :man_hinban");
        setList.add("ws_code = :ws_code");
        setList.add("pro_nes_counts = :pro_nes_counts");
        setList.add("hum_pre_time = :hum_pre_time");
        setList.add("hum_act_time = :hum_act_time");
        setList.add("mac_pre_time_in = :mac_pre_time_in");
        setList.add("mac_act_time_in = :mac_act_time_in");
        setList.add("mac_pre_time_out = :mac_pre_time_out");
        setList.add("mac_act_time_out = :mac_act_time_out");
        setList.add("mac_pre_time_kanban = :mac_pre_time_kanban");
        setList.add("mac_act_time_kanban = :mac_act_time_kanban");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_M_WS_MAN_LOAD_PLAN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_Y_WS_MAN_LOAD_PLANの削除
        if (this.prdYWsManLoadPlan != null) {
            this.prdYWsManLoadPlan.delete();
        }

        // PRD_M_WS_MAN_LOAD_PLANの削除
        String sql = "DELETE FROM PRD_M_WS_MAN_LOAD_PLAN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("TRIM (ws_code) = TRIM (:ws_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("MAN_HINBAN", this.manHinban);
        params.put("WS_CODE", this.wsCode);
        params.put("PRO_NES_COUNTS", this.proNesCounts);
        params.put("HUM_PRE_TIME", this.humPreTime);
        params.put("HUM_ACT_TIME", this.humActTime);
        params.put("MAC_PRE_TIME_IN", this.macPreTimeIn);
        params.put("MAC_ACT_TIME_IN", this.macActTimeIn);
        params.put("MAC_PRE_TIME_OUT", this.macPreTimeOut);
        params.put("MAC_ACT_TIME_OUT", this.macActTimeOut);
        params.put("MAC_PRE_TIME_KANBAN", this.macPreTimeKanban);
        params.put("MAC_ACT_TIME_KANBAN", this.macActTimeKanban);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_Y_WS_MAN_LOAD_PLAN
     */
    private PrdYWsManLoadPlan prdYWsManLoadPlan;

    /**
     * @return PRD_Y_WS_MAN_LOAD_PLAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdYWsManLoadPlan")
    public PrdYWsManLoadPlan getPrdYWsManLoadPlan() {
        return this.prdYWsManLoadPlan;
    }

    /**
     * @param p PRD_Y_WS_MAN_LOAD_PLAN
     */
    public void setPrdYWsManLoadPlan(final PrdYWsManLoadPlan p) {
        this.prdYWsManLoadPlan = p;
    }

    /**
     * @return PRD_Y_WS_MAN_LOAD_PLAN
     */
    public PrdYWsManLoadPlan referPrdYWsManLoadPlan() {
        if (this.prdYWsManLoadPlan == null) {
            try {
                this.prdYWsManLoadPlan = PrdYWsManLoadPlan.get(this.yyyy, this.mm, this.manHinban, this.wsCode);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdYWsManLoadPlan;
    }
}
