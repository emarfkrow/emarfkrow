package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STOCK_TOOL_MNG_DET
 *
 * @author emarfkrow
 */
public class InvStockToolMngDet implements IEntity {

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

    /** IN_OUT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime inOutDate;

    /**
     * @return IN_OUT_DATE
     */
    public java.time.LocalDateTime getInOutDate() {
        return this.inOutDate;
    }

    /**
     * @param o IN_OUT_DATE
     */
    public void setInOutDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.inOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.inOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.inOutDate = null;
        }
    }

    /** STOCK_BRANCH_NUMBER */
    private java.math.BigDecimal stockBranchNumber;

    /**
     * @return STOCK_BRANCH_NUMBER
     */
    public java.math.BigDecimal getStockBranchNumber() {
        return this.stockBranchNumber;
    }

    /**
     * @param o STOCK_BRANCH_NUMBER
     */
    public void setStockBranchNumber(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockBranchNumber = new java.math.BigDecimal(o.toString());
        } else {
            this.stockBranchNumber = null;
        }
    }

    /** IN_OUT_STATUS */
    private java.math.BigDecimal inOutStatus;

    /**
     * @return IN_OUT_STATUS
     */
    public java.math.BigDecimal getInOutStatus() {
        return this.inOutStatus;
    }

    /**
     * @param o IN_OUT_STATUS
     */
    public void setInOutStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.inOutStatus = null;
        }
    }

    /** RECEIPT_SUP_CODE */
    private String receiptSupCode;

    /**
     * @return RECEIPT_SUP_CODE
     */
    public String getReceiptSupCode() {
        return this.receiptSupCode;
    }

    /**
     * @param o RECEIPT_SUP_CODE
     */
    public void setReceiptSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.receiptSupCode = String.valueOf(o.toString());
        } else {
            this.receiptSupCode = null;
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

    /** INV_COMMENT */
    private String invComment;

    /**
     * @return INV_COMMENT
     */
    public String getInvComment() {
        return this.invComment;
    }

    /**
     * @param o INV_COMMENT
     */
    public void setInvComment(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.invComment = String.valueOf(o.toString());
        } else {
            this.invComment = null;
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
     * INV_STOCK_TOOL_MNG_DET照会
     *
     * @param param1 HINBAN
     * @param param2 SUB_INV_CODE
     * @param param3 STOCK_MANAGEMENT_SECTION
     * @param param4 IN_OUT_DATE
     * @param param5 STOCK_BRANCH_NUMBER
     * @return INV_STOCK_TOOL_MNG_DET
     */
    public static InvStockToolMngDet get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUB_INV_CODE\") = TRIM (:sub_inv_code)");
        whereList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        whereList.add("\"IN_OUT_DATE\" = :in_out_date");
        whereList.add("\"STOCK_BRANCH_NUMBER\" = :stock_branch_number");

        String sql = "SELECT * FROM INV_STOCK_TOOL_MNG_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sub_inv_code", param2);
        params.put("stock_management_section", param3);
        params.put("in_out_date", param4);
        params.put("stock_branch_number", param5);

        return Queries.get(sql, params, InvStockToolMngDet.class);
    }

    /**
     * INV_STOCK_TOOL_MNG_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STOCK_TOOL_MNG_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"STOCK_MANAGEMENT_SECTION\" -- :stock_management_section");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"SUB_INV_CODE\" -- :sub_inv_code");
        nameList.add("\"IN_OUT_DATE\" -- :in_out_date");
        nameList.add("\"STOCK_BRANCH_NUMBER\" -- :stock_branch_number");
        nameList.add("\"IN_OUT_STATUS\" -- :in_out_status");
        nameList.add("\"RECEIPT_SUP_CODE\" -- :receipt_sup_code");
        nameList.add("\"STOCK\" -- :stock");
        nameList.add("\"INV_COMMENT\" -- :inv_comment");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STOCK_TOOL_MNG_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":stock_management_section");
        valueList.add(":hinban");
        valueList.add(":sub_inv_code");
        valueList.add("TO_TIMESTAMP (:in_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":stock_branch_number");
        valueList.add(":in_out_status");
        valueList.add(":receipt_sup_code");
        valueList.add(":stock");
        valueList.add(":inv_comment");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_STOCK_TOOL_MNG_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_TOOL_MNG_DETの登録
        String sql = "UPDATE INV_STOCK_TOOL_MNG_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"SUB_INV_CODE\" = :sub_inv_code");
        setList.add("\"IN_OUT_DATE\" = TO_TIMESTAMP (:in_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"STOCK_BRANCH_NUMBER\" = :stock_branch_number");
        setList.add("\"IN_OUT_STATUS\" = :in_out_status");
        setList.add("\"RECEIPT_SUP_CODE\" = :receipt_sup_code");
        setList.add("\"STOCK\" = :stock");
        setList.add("\"INV_COMMENT\" = :inv_comment");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STOCK_TOOL_MNG_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_TOOL_MNG_DETの削除
        String sql = "DELETE FROM INV_STOCK_TOOL_MNG_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUB_INV_CODE\") = TRIM (:sub_inv_code)");
        whereList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        whereList.add("\"IN_OUT_DATE\" = :in_out_date");
        whereList.add("\"STOCK_BRANCH_NUMBER\" = :stock_branch_number");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("stock_management_section", this.stockManagementSection);
        params.put("hinban", this.hinban);
        params.put("sub_inv_code", this.subInvCode);
        params.put("in_out_date", this.inOutDate);
        params.put("stock_branch_number", this.stockBranchNumber);
        params.put("in_out_status", this.inOutStatus);
        params.put("receipt_sup_code", this.receiptSupCode);
        params.put("stock", this.stock);
        params.put("inv_comment", this.invComment);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
