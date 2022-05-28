package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_PERIOD
 *
 * @author emarfkrow
 */
public class InvPeriod implements IEntity {

    /** STOCK_MANAGEMENT_SECTION */
    private java.math.BigDecimal stockManagementSection;

    /**
     * @return STOCK_MANAGEMENT_SECTION
     */
    public java.math.BigDecimal getStockManagementSection() {
        return this.stockManagementSection;
    }

    /**
     * @param o STOCK_MANAGEMENT_SECTION
     */
    public void setStockManagementSection(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockManagementSection = new java.math.BigDecimal(o.toString());
        } else {
            this.stockManagementSection = null;
        }
    }

    /** INV_PHASE */
    private java.math.BigDecimal invPhase;

    /**
     * @return INV_PHASE
     */
    public java.math.BigDecimal getInvPhase() {
        return this.invPhase;
    }

    /**
     * @param o INV_PHASE
     */
    public void setInvPhase(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invPhase = new java.math.BigDecimal(o.toString());
        } else {
            this.invPhase = null;
        }
    }

    /** INV_PHASE_MONTH */
    private java.math.BigDecimal invPhaseMonth;

    /**
     * @return INV_PHASE_MONTH
     */
    public java.math.BigDecimal getInvPhaseMonth() {
        return this.invPhaseMonth;
    }

    /**
     * @param o INV_PHASE_MONTH
     */
    public void setInvPhaseMonth(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invPhaseMonth = new java.math.BigDecimal(o.toString());
        } else {
            this.invPhaseMonth = null;
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

    /** INV_DATE_FROM */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime invDateFrom;

    /**
     * @return INV_DATE_FROM
     */
    public java.time.LocalDateTime getInvDateFrom() {
        return this.invDateFrom;
    }

    /**
     * @param o INV_DATE_FROM
     */
    public void setInvDateFrom(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.invDateFrom = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.invDateFrom = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invDateFrom = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.invDateFrom = null;
        }
    }

    /** INV_DATE_TO */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime invDateTo;

    /**
     * @return INV_DATE_TO
     */
    public java.time.LocalDateTime getInvDateTo() {
        return this.invDateTo;
    }

    /**
     * @param o INV_DATE_TO
     */
    public void setInvDateTo(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.invDateTo = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.invDateTo = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invDateTo = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.invDateTo = null;
        }
    }

    /** INV_STATUS */
    private java.math.BigDecimal invStatus;

    /**
     * @return INV_STATUS
     */
    public java.math.BigDecimal getInvStatus() {
        return this.invStatus;
    }

    /**
     * @param o INV_STATUS
     */
    public void setInvStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.invStatus = null;
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
     * INV_PERIOD照会
     *
     * @param param1 STOCK_MANAGEMENT_SECTION
     * @param param2 INV_PHASE
     * @param param3 INV_PHASE_MONTH
     * @param param4 SUB_INV_CODE
     * @return INV_PERIOD
     */
    public static InvPeriod get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("stock_management_section = :stock_management_section");
        whereList.add("inv_phase = :inv_phase");
        whereList.add("inv_phase_month = :inv_phase_month");
        whereList.add("TRIM (sub_inv_code) = TRIM (:sub_inv_code)");

        String sql = "SELECT * FROM INV_PERIOD WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("stock_management_section", param1);
        params.put("inv_phase", param2);
        params.put("inv_phase_month", param3);
        params.put("sub_inv_code", param4);

        return Queries.get(sql, params, InvPeriod.class);
    }

    /**
     * INV_PERIOD追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SUB_INV_CODEの採番処理
        numbering();

        // INV_PERIODの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("stock_management_section -- :stock_management_section");
        nameList.add("inv_phase -- :inv_phase");
        nameList.add("inv_phase_month -- :inv_phase_month");
        nameList.add("sub_inv_code -- :sub_inv_code");
        nameList.add("inv_date_from -- :inv_date_from");
        nameList.add("inv_date_to -- :inv_date_to");
        nameList.add("inv_status -- :inv_status");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_PERIOD(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":stock_management_section");
        valueList.add(":inv_phase");
        valueList.add(":inv_phase_month");
        valueList.add(":sub_inv_code");
        valueList.add("TO_TIMESTAMP (:inv_date_from, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:inv_date_to, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":inv_status");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** SUB_INV_CODEの採番処理 */
    private void numbering() {

        if (this.subInvCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SUB_INV_CODE) IS NULL THEN 0 ELSE MAX(e.SUB_INV_CODE) * 1 END + 1, 10, '0') AS SUB_INV_CODE FROM INV_PERIOD e WHERE e.SUB_INV_CODE < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.STOCK_MANAGEMENT_SECTION = :stock_management_section");
        whereList.add("e.INV_PHASE = :inv_phase");
        whereList.add("e.INV_PHASE_MONTH = :inv_phase_month");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("stockManagementSection", this.stockManagementSection);
        params.put("invPhase", this.invPhase);
        params.put("invPhaseMonth", this.invPhaseMonth);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SUB_INV_CODE");

        this.setSubInvCode(o);
    }

    /**
     * INV_PERIOD更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_PERIODの登録
        String sql = "UPDATE INV_PERIOD\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("stock_management_section = :stock_management_section");
        setList.add("inv_phase = :inv_phase");
        setList.add("inv_phase_month = :inv_phase_month");
        setList.add("sub_inv_code = :sub_inv_code");
        setList.add("inv_date_from = TO_TIMESTAMP (:inv_date_from, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("inv_date_to = TO_TIMESTAMP (:inv_date_to, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("inv_status = :inv_status");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_PERIOD削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_PERIODの削除
        String sql = "DELETE FROM INV_PERIOD WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("stock_management_section = :stock_management_section");
        whereList.add("inv_phase = :inv_phase");
        whereList.add("inv_phase_month = :inv_phase_month");
        whereList.add("TRIM (sub_inv_code) = TRIM (:sub_inv_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("STOCK_MANAGEMENT_SECTION", this.stockManagementSection);
        params.put("INV_PHASE", this.invPhase);
        params.put("INV_PHASE_MONTH", this.invPhaseMonth);
        params.put("SUB_INV_CODE", this.subInvCode);
        params.put("INV_DATE_FROM", this.invDateFrom);
        params.put("INV_DATE_TO", this.invDateTo);
        params.put("INV_STATUS", this.invStatus);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
