package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_MTRL_INOUT_HISTORY
 *
 * @author emarfkrow
 */
public class InvMtrlInoutHistory implements IEntity {

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

    /** ACT_NO */
    private String actNo;

    /**
     * @return ACT_NO
     */
    public String getActNo() {
        return this.actNo;
    }

    /**
     * @param o ACT_NO
     */
    public void setActNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actNo = String.valueOf(o.toString());
        } else {
            this.actNo = null;
        }
    }

    /** ACT_BRANCH_NO */
    private java.math.BigDecimal actBranchNo;

    /**
     * @return ACT_BRANCH_NO
     */
    public java.math.BigDecimal getActBranchNo() {
        return this.actBranchNo;
    }

    /**
     * @param o ACT_BRANCH_NO
     */
    public void setActBranchNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actBranchNo = new java.math.BigDecimal(o.toString());
        } else {
            this.actBranchNo = null;
        }
    }

    /** ORDER_NO */
    private String orderNo;

    /**
     * @return ORDER_NO
     */
    public String getOrderNo() {
        return this.orderNo;
    }

    /**
     * @param o ORDER_NO
     */
    public void setOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderNo = String.valueOf(o.toString());
        } else {
            this.orderNo = null;
        }
    }

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return this.proNo;
    }

    /**
     * @param o PRO_NO
     */
    public void setProNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNo = String.valueOf(o.toString());
        } else {
            this.proNo = null;
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

    /** ISSUE_HINBAN */
    private String issueHinban;

    /**
     * @return ISSUE_HINBAN
     */
    public String getIssueHinban() {
        return this.issueHinban;
    }

    /**
     * @param o ISSUE_HINBAN
     */
    public void setIssueHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.issueHinban = String.valueOf(o.toString());
        } else {
            this.issueHinban = null;
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

    /** GOOD_COUNTS */
    private java.math.BigDecimal goodCounts;

    /**
     * @return GOOD_COUNTS
     */
    public java.math.BigDecimal getGoodCounts() {
        return this.goodCounts;
    }

    /**
     * @param o GOOD_COUNTS
     */
    public void setGoodCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.goodCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.goodCounts = null;
        }
    }

    /** MASTER_COUNTS */
    private java.math.BigDecimal masterCounts;

    /**
     * @return MASTER_COUNTS
     */
    public java.math.BigDecimal getMasterCounts() {
        return this.masterCounts;
    }

    /**
     * @param o MASTER_COUNTS
     */
    public void setMasterCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.masterCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.masterCounts = null;
        }
    }

    /** AMOUNT_USED_PHI */
    private java.math.BigDecimal amountUsedPhi;

    /**
     * @return AMOUNT_USED_PHI
     */
    public java.math.BigDecimal getAmountUsedPhi() {
        return this.amountUsedPhi;
    }

    /**
     * @param o AMOUNT_USED_PHI
     */
    public void setAmountUsedPhi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.amountUsedPhi = new java.math.BigDecimal(o.toString());
        } else {
            this.amountUsedPhi = null;
        }
    }

    /** AMOUNT_USED_LENGTH */
    private java.math.BigDecimal amountUsedLength;

    /**
     * @return AMOUNT_USED_LENGTH
     */
    public java.math.BigDecimal getAmountUsedLength() {
        return this.amountUsedLength;
    }

    /**
     * @param o AMOUNT_USED_LENGTH
     */
    public void setAmountUsedLength(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.amountUsedLength = new java.math.BigDecimal(o.toString());
        } else {
            this.amountUsedLength = null;
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
     * INV_MTRL_INOUT_HISTORY照会
     *
     * @param param1 HINBAN
     * @param param2 SUB_INV_CODE
     * @param param3 STOCK_MANAGEMENT_SECTION
     * @param param4 IN_OUT_DATE
     * @param param5 STOCK_BRANCH_NUMBER
     * @return INV_MTRL_INOUT_HISTORY
     */
    public static InvMtrlInoutHistory get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUB_INV_CODE\") = TRIM (:sub_inv_code)");
        whereList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        whereList.add("\"IN_OUT_DATE\" = :in_out_date");
        whereList.add("\"STOCK_BRANCH_NUMBER\" = :stock_branch_number");

        String sql = "SELECT * FROM INV_MTRL_INOUT_HISTORY WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sub_inv_code", param2);
        params.put("stock_management_section", param3);
        params.put("in_out_date", param4);
        params.put("stock_branch_number", param5);

        return Queries.get(sql, params, InvMtrlInoutHistory.class);
    }

    /**
     * INV_MTRL_INOUT_HISTORY追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STOCK_TOOL_MNG_DETの登録
        if (this.invStockToolMngDet != null) {
            this.invStockToolMngDet.setHinban(this.getHinban());
            this.invStockToolMngDet.setSubInvCode(this.getSubInvCode());
            this.invStockToolMngDet.setStockManagementSection(this.getStockManagementSection());
            this.invStockToolMngDet.setInOutDate(this.getInOutDate());
            this.invStockToolMngDet.setStockBranchNumber(this.getStockBranchNumber());
            this.invStockToolMngDet.insert(now, id);
        }

        // INV_MTRL_INOUT_HISTORYの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("stock_management_section -- :stock_management_section");
        nameList.add("hinban -- :hinban");
        nameList.add("sub_inv_code -- :sub_inv_code");
        nameList.add("in_out_date -- :in_out_date");
        nameList.add("stock_branch_number -- :stock_branch_number");
        nameList.add("act_no -- :act_no");
        nameList.add("act_branch_no -- :act_branch_no");
        nameList.add("order_no -- :order_no");
        nameList.add("pro_no -- :pro_no");
        nameList.add("in_out_status -- :in_out_status");
        nameList.add("receipt_sup_code -- :receipt_sup_code");
        nameList.add("issue_hinban -- :issue_hinban");
        nameList.add("stock -- :stock");
        nameList.add("good_counts -- :good_counts");
        nameList.add("master_counts -- :master_counts");
        nameList.add("amount_used_phi -- :amount_used_phi");
        nameList.add("amount_used_length -- :amount_used_length");
        nameList.add("inv_comment -- :inv_comment");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_MTRL_INOUT_HISTORY(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

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
        valueList.add(":act_no");
        valueList.add(":act_branch_no");
        valueList.add(":order_no");
        valueList.add(":pro_no");
        valueList.add(":in_out_status");
        valueList.add(":receipt_sup_code");
        valueList.add(":issue_hinban");
        valueList.add(":stock");
        valueList.add(":good_counts");
        valueList.add(":master_counts");
        valueList.add(":amount_used_phi");
        valueList.add(":amount_used_length");
        valueList.add(":inv_comment");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_MTRL_INOUT_HISTORY更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_TOOL_MNG_DETの登録
        if (this.invStockToolMngDet != null) {
            invStockToolMngDet.setHinban(this.getHinban());
            invStockToolMngDet.setSubInvCode(this.getSubInvCode());
            invStockToolMngDet.setStockManagementSection(this.getStockManagementSection());
            invStockToolMngDet.setInOutDate(this.getInOutDate());
            invStockToolMngDet.setStockBranchNumber(this.getStockBranchNumber());
            try {
                invStockToolMngDet.insert(now, id);
            } catch (Exception e) {
                invStockToolMngDet.update(now, id);
            }
        }

        // INV_MTRL_INOUT_HISTORYの登録
        String sql = "UPDATE INV_MTRL_INOUT_HISTORY\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("stock_management_section = :stock_management_section");
        setList.add("hinban = :hinban");
        setList.add("sub_inv_code = :sub_inv_code");
        setList.add("in_out_date = TO_TIMESTAMP (:in_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("stock_branch_number = :stock_branch_number");
        setList.add("act_no = :act_no");
        setList.add("act_branch_no = :act_branch_no");
        setList.add("order_no = :order_no");
        setList.add("pro_no = :pro_no");
        setList.add("in_out_status = :in_out_status");
        setList.add("receipt_sup_code = :receipt_sup_code");
        setList.add("issue_hinban = :issue_hinban");
        setList.add("stock = :stock");
        setList.add("good_counts = :good_counts");
        setList.add("master_counts = :master_counts");
        setList.add("amount_used_phi = :amount_used_phi");
        setList.add("amount_used_length = :amount_used_length");
        setList.add("inv_comment = :inv_comment");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_MTRL_INOUT_HISTORY削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_TOOL_MNG_DETの削除
        if (this.invStockToolMngDet != null) {
            this.invStockToolMngDet.delete();
        }

        // INV_MTRL_INOUT_HISTORYの削除
        String sql = "DELETE FROM INV_MTRL_INOUT_HISTORY WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (sub_inv_code) = TRIM (:sub_inv_code)");
        whereList.add("stock_management_section = :stock_management_section");
        whereList.add("in_out_date = :in_out_date");
        whereList.add("stock_branch_number = :stock_branch_number");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("STOCK_MANAGEMENT_SECTION", this.stockManagementSection);
        params.put("HINBAN", this.hinban);
        params.put("SUB_INV_CODE", this.subInvCode);
        params.put("IN_OUT_DATE", this.inOutDate);
        params.put("STOCK_BRANCH_NUMBER", this.stockBranchNumber);
        params.put("ACT_NO", this.actNo);
        params.put("ACT_BRANCH_NO", this.actBranchNo);
        params.put("ORDER_NO", this.orderNo);
        params.put("PRO_NO", this.proNo);
        params.put("IN_OUT_STATUS", this.inOutStatus);
        params.put("RECEIPT_SUP_CODE", this.receiptSupCode);
        params.put("ISSUE_HINBAN", this.issueHinban);
        params.put("STOCK", this.stock);
        params.put("GOOD_COUNTS", this.goodCounts);
        params.put("MASTER_COUNTS", this.masterCounts);
        params.put("AMOUNT_USED_PHI", this.amountUsedPhi);
        params.put("AMOUNT_USED_LENGTH", this.amountUsedLength);
        params.put("INV_COMMENT", this.invComment);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * INV_STOCK_TOOL_MNG_DET
     */
    private InvStockToolMngDet invStockToolMngDet;

    /**
     * @return INV_STOCK_TOOL_MNG_DET
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvStockToolMngDet")
    public InvStockToolMngDet getInvStockToolMngDet() {
        return this.invStockToolMngDet;
    }

    /**
     * @param p INV_STOCK_TOOL_MNG_DET
     */
    public void setInvStockToolMngDet(final InvStockToolMngDet p) {
        this.invStockToolMngDet = p;
    }

    /**
     * @return INV_STOCK_TOOL_MNG_DET
     */
    public InvStockToolMngDet referInvStockToolMngDet() {
        if (this.invStockToolMngDet == null) {
            try {
                this.invStockToolMngDet = InvStockToolMngDet.get(this.hinban, this.subInvCode, this.stockManagementSection, this.inOutDate, this.stockBranchNumber);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.invStockToolMngDet;
    }
}
