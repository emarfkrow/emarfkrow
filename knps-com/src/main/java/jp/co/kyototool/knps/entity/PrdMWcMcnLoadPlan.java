package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_M_WC_MCN_LOAD_PLAN
 *
 * @author emarfkrow
 */
public class PrdMWcMcnLoadPlan implements IEntity {

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
     * PRD_M_WC_MCN_LOAD_PLAN照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 MAN_HINBAN
     * @param param4 WC_CODE
     * @return PRD_M_WC_MCN_LOAD_PLAN
     */
    public static PrdMWcMcnLoadPlan get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");

        String sql = "SELECT * FROM PRD_M_WC_MCN_LOAD_PLAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("man_hinban", param3);
        params.put("wc_code", param4);

        return Queries.get(sql, params, PrdMWcMcnLoadPlan.class);
    }

    /**
     * PRD_M_WC_MCN_LOAD_PLAN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // WC_CODEの採番処理
        numbering();

        // PRD_Y_WC_MCN_LOAD_PLANの登録
        if (this.prdYWcMcnLoadPlan != null) {
            this.prdYWcMcnLoadPlan.setYyyy(this.getYyyy());
            this.prdYWcMcnLoadPlan.setMm(this.getMm());
            this.prdYWcMcnLoadPlan.setManHinban(this.getManHinban());
            this.prdYWcMcnLoadPlan.setWcCode(this.getWcCode());
            this.prdYWcMcnLoadPlan.insert(now, id);
        }

        // PRD_M_WC_MCN_LOAD_PLANの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"MAN_HINBAN\" -- :man_hinban");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"PRO_NES_COUNTS\" -- :pro_nes_counts");
        nameList.add("\"HUM_PRE_TIME\" -- :hum_pre_time");
        nameList.add("\"HUM_ACT_TIME\" -- :hum_act_time");
        nameList.add("\"MAC_PRE_TIME_IN\" -- :mac_pre_time_in");
        nameList.add("\"MAC_ACT_TIME_IN\" -- :mac_act_time_in");
        nameList.add("\"MAC_PRE_TIME_OUT\" -- :mac_pre_time_out");
        nameList.add("\"MAC_ACT_TIME_OUT\" -- :mac_act_time_out");
        nameList.add("\"MAC_PRE_TIME_KANBAN\" -- :mac_pre_time_kanban");
        nameList.add("\"MAC_ACT_TIME_KANBAN\" -- :mac_act_time_kanban");
        nameList.add("\"COMMENT1\" -- :comment1");
        nameList.add("\"COMMENT2\" -- :comment2");
        nameList.add("\"UNIT_WEIGHT\" -- :unit_weight");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_M_WC_MCN_LOAD_PLAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

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

    /** WC_CODEの採番処理 */
    private void numbering() {

        if (this.wcCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"WC_CODE\") IS NULL THEN 0 ELSE MAX(e.\"WC_CODE\") * 1 END + 1, 3, '0') AS \"WC_CODE\" FROM PRD_M_WC_MCN_LOAD_PLAN e WHERE e.\"WC_CODE\" < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"YYYY\" = :yyyy");
        whereList.add("e.\"MM\" = :mm");
        whereList.add("e.\"MAN_HINBAN\" = :man_hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("man_hinban", this.manHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("WC_CODE");

        this.setWcCode(o);
    }

    /**
     * PRD_M_WC_MCN_LOAD_PLAN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_Y_WC_MCN_LOAD_PLANの登録
        if (this.prdYWcMcnLoadPlan != null) {
            prdYWcMcnLoadPlan.setYyyy(this.getYyyy());
            prdYWcMcnLoadPlan.setMm(this.getMm());
            prdYWcMcnLoadPlan.setManHinban(this.getManHinban());
            prdYWcMcnLoadPlan.setWcCode(this.getWcCode());
            try {
                prdYWcMcnLoadPlan.insert(now, id);
            } catch (Exception e) {
                prdYWcMcnLoadPlan.update(now, id);
            }
        }

        // PRD_M_WC_MCN_LOAD_PLANの登録
        String sql = "UPDATE PRD_M_WC_MCN_LOAD_PLAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"MAN_HINBAN\" = :man_hinban");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"PRO_NES_COUNTS\" = :pro_nes_counts");
        setList.add("\"HUM_PRE_TIME\" = :hum_pre_time");
        setList.add("\"HUM_ACT_TIME\" = :hum_act_time");
        setList.add("\"MAC_PRE_TIME_IN\" = :mac_pre_time_in");
        setList.add("\"MAC_ACT_TIME_IN\" = :mac_act_time_in");
        setList.add("\"MAC_PRE_TIME_OUT\" = :mac_pre_time_out");
        setList.add("\"MAC_ACT_TIME_OUT\" = :mac_act_time_out");
        setList.add("\"MAC_PRE_TIME_KANBAN\" = :mac_pre_time_kanban");
        setList.add("\"MAC_ACT_TIME_KANBAN\" = :mac_act_time_kanban");
        setList.add("\"COMMENT1\" = :comment1");
        setList.add("\"COMMENT2\" = :comment2");
        setList.add("\"UNIT_WEIGHT\" = :unit_weight");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_M_WC_MCN_LOAD_PLAN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_Y_WC_MCN_LOAD_PLANの削除
        if (this.prdYWcMcnLoadPlan != null) {
            this.prdYWcMcnLoadPlan.delete();
        }

        // PRD_M_WC_MCN_LOAD_PLANの削除
        String sql = "DELETE FROM PRD_M_WC_MCN_LOAD_PLAN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("man_hinban", this.manHinban);
        params.put("wc_code", this.wcCode);
        params.put("pro_nes_counts", this.proNesCounts);
        params.put("hum_pre_time", this.humPreTime);
        params.put("hum_act_time", this.humActTime);
        params.put("mac_pre_time_in", this.macPreTimeIn);
        params.put("mac_act_time_in", this.macActTimeIn);
        params.put("mac_pre_time_out", this.macPreTimeOut);
        params.put("mac_act_time_out", this.macActTimeOut);
        params.put("mac_pre_time_kanban", this.macPreTimeKanban);
        params.put("mac_act_time_kanban", this.macActTimeKanban);
        params.put("comment1", this.comment1);
        params.put("comment2", this.comment2);
        params.put("unit_weight", this.unitWeight);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_Y_WC_MCN_LOAD_PLAN
     */
    private PrdYWcMcnLoadPlan prdYWcMcnLoadPlan;

    /**
     * @return PRD_Y_WC_MCN_LOAD_PLAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdYWcMcnLoadPlan")
    public PrdYWcMcnLoadPlan getPrdYWcMcnLoadPlan() {
        return this.prdYWcMcnLoadPlan;
    }

    /**
     * @param p PRD_Y_WC_MCN_LOAD_PLAN
     */
    public void setPrdYWcMcnLoadPlan(final PrdYWcMcnLoadPlan p) {
        this.prdYWcMcnLoadPlan = p;
    }

    /**
     * @return PRD_Y_WC_MCN_LOAD_PLAN
     */
    public PrdYWcMcnLoadPlan referPrdYWcMcnLoadPlan() {
        if (this.prdYWcMcnLoadPlan == null) {
            try {
                this.prdYWcMcnLoadPlan = PrdYWcMcnLoadPlan.get(this.yyyy, this.mm, this.manHinban, this.wcCode);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdYWcMcnLoadPlan;
    }
}
