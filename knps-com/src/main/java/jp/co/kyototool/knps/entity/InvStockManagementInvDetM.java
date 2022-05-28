package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STOCK_MANAGEMENT_INV_DET_M
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetM implements IEntity {

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

    /** INV_BRANCH_NO */
    private java.math.BigDecimal invBranchNo;

    /**
     * @return INV_BRANCH_NO
     */
    public java.math.BigDecimal getInvBranchNo() {
        return this.invBranchNo;
    }

    /**
     * @param o INV_BRANCH_NO
     */
    public void setInvBranchNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invBranchNo = new java.math.BigDecimal(o.toString());
        } else {
            this.invBranchNo = null;
        }
    }

    /** SLIP_NO */
    private java.math.BigDecimal slipNo;

    /**
     * @return SLIP_NO
     */
    public java.math.BigDecimal getSlipNo() {
        return this.slipNo;
    }

    /**
     * @param o SLIP_NO
     */
    public void setSlipNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.slipNo = new java.math.BigDecimal(o.toString());
        } else {
            this.slipNo = null;
        }
    }

    /** STOCK_CODE */
    private String stockCode;

    /**
     * @return STOCK_CODE
     */
    public String getStockCode() {
        return this.stockCode;
    }

    /**
     * @param o STOCK_CODE
     */
    public void setStockCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockCode = String.valueOf(o.toString());
        } else {
            this.stockCode = null;
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
     * INV_STOCK_MANAGEMENT_INV_DET_M照会
     *
     * @param param1 HINBAN
     * @param param2 SUB_INV_CODE
     * @param param3 STOCK_MANAGEMENT_SECTION
     * @param param4 INV_PHASE
     * @param param5 INV_PHASE_MONTH
     * @param param6 INV_BRANCH_NO
     * @return INV_STOCK_MANAGEMENT_INV_DET_M
     */
    public static InvStockManagementInvDetM get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5, final Object param6) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (sub_inv_code) = TRIM (:sub_inv_code)");
        whereList.add("stock_management_section = :stock_management_section");
        whereList.add("inv_phase = :inv_phase");
        whereList.add("inv_phase_month = :inv_phase_month");
        whereList.add("inv_branch_no = :inv_branch_no");

        String sql = "SELECT * FROM INV_STOCK_MANAGEMENT_INV_DET_M WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sub_inv_code", param2);
        params.put("stock_management_section", param3);
        params.put("inv_phase", param4);
        params.put("inv_phase_month", param5);
        params.put("inv_branch_no", param6);

        return Queries.get(sql, params, InvStockManagementInvDetM.class);
    }

    /**
     * INV_STOCK_MANAGEMENT_INV_DET_M追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STOCK_MANAGEMENT_INV_DET_Mの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("inv_phase -- :inv_phase");
        nameList.add("inv_phase_month -- :inv_phase_month");
        nameList.add("stock_management_section -- :stock_management_section");
        nameList.add("hinban -- :hinban");
        nameList.add("sub_inv_code -- :sub_inv_code");
        nameList.add("inv_branch_no -- :inv_branch_no");
        nameList.add("slip_no -- :slip_no");
        nameList.add("stock_code -- :stock_code");
        nameList.add("inv_stock -- :inv_stock");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STOCK_MANAGEMENT_INV_DET_M(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

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
        valueList.add(":inv_branch_no");
        valueList.add(":slip_no");
        valueList.add(":stock_code");
        valueList.add(":inv_stock");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_STOCK_MANAGEMENT_INV_DET_M更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_MANAGEMENT_INV_DET_Mの登録
        String sql = "UPDATE INV_STOCK_MANAGEMENT_INV_DET_M\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("inv_phase = :inv_phase");
        setList.add("inv_phase_month = :inv_phase_month");
        setList.add("stock_management_section = :stock_management_section");
        setList.add("hinban = :hinban");
        setList.add("sub_inv_code = :sub_inv_code");
        setList.add("inv_branch_no = :inv_branch_no");
        setList.add("slip_no = :slip_no");
        setList.add("stock_code = :stock_code");
        setList.add("inv_stock = :inv_stock");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STOCK_MANAGEMENT_INV_DET_M削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_MANAGEMENT_INV_DET_Mの削除
        String sql = "DELETE FROM INV_STOCK_MANAGEMENT_INV_DET_M WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (sub_inv_code) = TRIM (:sub_inv_code)");
        whereList.add("stock_management_section = :stock_management_section");
        whereList.add("inv_phase = :inv_phase");
        whereList.add("inv_phase_month = :inv_phase_month");
        whereList.add("inv_branch_no = :inv_branch_no");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("INV_PHASE", this.invPhase);
        params.put("INV_PHASE_MONTH", this.invPhaseMonth);
        params.put("STOCK_MANAGEMENT_SECTION", this.stockManagementSection);
        params.put("HINBAN", this.hinban);
        params.put("SUB_INV_CODE", this.subInvCode);
        params.put("INV_BRANCH_NO", this.invBranchNo);
        params.put("SLIP_NO", this.slipNo);
        params.put("STOCK_CODE", this.stockCode);
        params.put("INV_STOCK", this.invStock);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
