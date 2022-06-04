package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STOCK_MANAGEMENT_INV_MER
 *
 * @author emarfkrow
 */
public class InvStockManagementInvMer implements IEntity {

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

    /** INV_STOCK */
    private java.math.BigDecimal invStock;

    /**
     * @return INV_STOCK
     */
    public java.math.BigDecimal getInvStock() {
        return this.invStock;
    }

    /**
     * @param o INV_STOCK
     */
    public void setInvStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invStock = new java.math.BigDecimal(o.toString());
        } else {
            this.invStock = null;
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

    /** UNIT_COST */
    private java.math.BigDecimal unitCost;

    /**
     * @return UNIT_COST
     */
    public java.math.BigDecimal getUnitCost() {
        return this.unitCost;
    }

    /**
     * @param o UNIT_COST
     */
    public void setUnitCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCost = new java.math.BigDecimal(o.toString());
        } else {
            this.unitCost = null;
        }
    }

    /** LAST_IN_OUT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime lastInOutDate;

    /**
     * @return LAST_IN_OUT_DATE
     */
    public java.time.LocalDateTime getLastInOutDate() {
        return this.lastInOutDate;
    }

    /**
     * @param o LAST_IN_OUT_DATE
     */
    public void setLastInOutDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.lastInOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.lastInOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastInOutDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.lastInOutDate = null;
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
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
     * INV_STOCK_MANAGEMENT_INV_MER照会
     *
     * @param param1 HINBAN
     * @param param2 SUB_INV_CODE
     * @param param3 STOCK_MANAGEMENT_SECTION
     * @param param4 INV_PHASE
     * @param param5 INV_PHASE_MONTH
     * @return INV_STOCK_MANAGEMENT_INV_MER
     */
    public static InvStockManagementInvMer get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUB_INV_CODE\") = TRIM (:sub_inv_code)");
        whereList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        whereList.add("\"INV_PHASE\" = :inv_phase");
        whereList.add("\"INV_PHASE_MONTH\" = :inv_phase_month");

        String sql = "SELECT * FROM INV_STOCK_MANAGEMENT_INV_MER WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sub_inv_code", param2);
        params.put("stock_management_section", param3);
        params.put("inv_phase", param4);
        params.put("inv_phase_month", param5);

        return Queries.get(sql, params, InvStockManagementInvMer.class);
    }

    /**
     * INV_STOCK_MANAGEMENT_INV_MER追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STOCK_MANAGEMENT_INV_MERの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"INV_PHASE\" -- :inv_phase");
        nameList.add("\"INV_PHASE_MONTH\" -- :inv_phase_month");
        nameList.add("\"STOCK_MANAGEMENT_SECTION\" -- :stock_management_section");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"SUB_INV_CODE\" -- :sub_inv_code");
        nameList.add("\"INV_STOCK\" -- :inv_stock");
        nameList.add("\"STOCK\" -- :stock");
        nameList.add("\"UNIT_COST\" -- :unit_cost");
        nameList.add("\"LAST_IN_OUT_DATE\" -- :last_in_out_date");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STOCK_MANAGEMENT_INV_MER(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":inv_phase");
        valueList.add(":inv_phase_month");
        valueList.add(":stock_management_section");
        valueList.add(":hinban");
        valueList.add(":sub_inv_code");
        valueList.add(":inv_stock");
        valueList.add(":stock");
        valueList.add(":unit_cost");
        valueList.add("TO_TIMESTAMP (:last_in_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_STOCK_MANAGEMENT_INV_MER更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_MANAGEMENT_INV_MERの登録
        String sql = "UPDATE INV_STOCK_MANAGEMENT_INV_MER\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"INV_PHASE\" = :inv_phase");
        setList.add("\"INV_PHASE_MONTH\" = :inv_phase_month");
        setList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"SUB_INV_CODE\" = :sub_inv_code");
        setList.add("\"INV_STOCK\" = :inv_stock");
        setList.add("\"STOCK\" = :stock");
        setList.add("\"UNIT_COST\" = :unit_cost");
        setList.add("\"LAST_IN_OUT_DATE\" = TO_TIMESTAMP (:last_in_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STOCK_MANAGEMENT_INV_MER削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_MANAGEMENT_INV_MERの削除
        String sql = "DELETE FROM INV_STOCK_MANAGEMENT_INV_MER WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUB_INV_CODE\") = TRIM (:sub_inv_code)");
        whereList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        whereList.add("\"INV_PHASE\" = :inv_phase");
        whereList.add("\"INV_PHASE_MONTH\" = :inv_phase_month");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("inv_phase", this.invPhase);
        params.put("inv_phase_month", this.invPhaseMonth);
        params.put("stock_management_section", this.stockManagementSection);
        params.put("hinban", this.hinban);
        params.put("sub_inv_code", this.subInvCode);
        params.put("inv_stock", this.invStock);
        params.put("stock", this.stock);
        params.put("unit_cost", this.unitCost);
        params.put("last_in_out_date", this.lastInOutDate);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
