package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_PAY_ACT_DET
 *
 * @author emarfkrow
 */
public class PchPayActDet implements IEntity {

    /** PAY_NO */
    private String payNo;

    /**
     * @return PAY_NO
     */
    public String getPayNo() {
        return this.payNo;
    }

    /**
     * @param o PAY_NO
     */
    public void setPayNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payNo = String.valueOf(o.toString());
        } else {
            this.payNo = null;
        }
    }

    /** PAY_BRANCH_NO */
    private java.math.BigDecimal payBranchNo;

    /**
     * @return PAY_BRANCH_NO
     */
    public java.math.BigDecimal getPayBranchNo() {
        return this.payBranchNo;
    }

    /**
     * @param o PAY_BRANCH_NO
     */
    public void setPayBranchNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payBranchNo = new java.math.BigDecimal(o.toString());
        } else {
            this.payBranchNo = null;
        }
    }

    /** PAY_COUNTS */
    private java.math.BigDecimal payCounts;

    /**
     * @return PAY_COUNTS
     */
    public java.math.BigDecimal getPayCounts() {
        return this.payCounts;
    }

    /**
     * @param o PAY_COUNTS
     */
    public void setPayCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.payCounts = null;
        }
    }

    /** UNIT_PRICE */
    private java.math.BigDecimal unitPrice;

    /**
     * @return UNIT_PRICE
     */
    public java.math.BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * @param o UNIT_PRICE
     */
    public void setUnitPrice(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitPrice = new java.math.BigDecimal(o.toString());
        } else {
            this.unitPrice = null;
        }
    }

    /** AMOUNT */
    private java.math.BigDecimal amount;

    /**
     * @return AMOUNT
     */
    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * @param o AMOUNT
     */
    public void setAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.amount = new java.math.BigDecimal(o.toString());
        } else {
            this.amount = null;
        }
    }

    /** TAX_AMOUNT */
    private java.math.BigDecimal taxAmount;

    /**
     * @return TAX_AMOUNT
     */
    public java.math.BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * @param o TAX_AMOUNT
     */
    public void setTaxAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.taxAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.taxAmount = null;
        }
    }

    /** MEMO */
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @param o MEMO
     */
    public void setMemo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.memo = String.valueOf(o.toString());
        } else {
            this.memo = null;
        }
    }

    /** CLOSE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime closeDate;

    /**
     * @return CLOSE_DATE
     */
    public java.time.LocalDateTime getCloseDate() {
        return this.closeDate;
    }

    /**
     * @param o CLOSE_DATE
     */
    public void setCloseDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.closeDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.closeDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.closeDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.closeDate = null;
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
     * PCH_PAY_ACT_DET照会
     *
     * @param param1 PAY_NO
     * @param param2 PAY_BRANCH_NO
     * @return PCH_PAY_ACT_DET
     */
    public static PchPayActDet get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pay_no) = TRIM (:pay_no)");
        whereList.add("pay_branch_no = :pay_branch_no");

        String sql = "SELECT * FROM PCH_PAY_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pay_no", param1);
        params.put("pay_branch_no", param2);

        return Queries.get(sql, params, PchPayActDet.class);
    }

    /**
     * PCH_PAY_ACT_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PCH_PAY_ACT_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("pay_no -- :pay_no");
        nameList.add("pay_branch_no -- :pay_branch_no");
        nameList.add("pay_counts -- :pay_counts");
        nameList.add("unit_price -- :unit_price");
        nameList.add("amount -- :amount");
        nameList.add("tax_amount -- :tax_amount");
        nameList.add("memo -- :memo");
        nameList.add("close_date -- :close_date");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_PAY_ACT_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pay_no");
        valueList.add(":pay_branch_no");
        valueList.add(":pay_counts");
        valueList.add(":unit_price");
        valueList.add(":amount");
        valueList.add(":tax_amount");
        valueList.add(":memo");
        valueList.add("TO_TIMESTAMP (:close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PCH_PAY_ACT_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_PAY_ACT_DETの登録
        String sql = "UPDATE PCH_PAY_ACT_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("pay_no = :pay_no");
        setList.add("pay_branch_no = :pay_branch_no");
        setList.add("pay_counts = :pay_counts");
        setList.add("unit_price = :unit_price");
        setList.add("amount = :amount");
        setList.add("tax_amount = :tax_amount");
        setList.add("memo = :memo");
        setList.add("close_date = TO_TIMESTAMP (:close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_PAY_ACT_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_PAY_ACT_DETの削除
        String sql = "DELETE FROM PCH_PAY_ACT_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pay_no) = TRIM (:pay_no)");
        whereList.add("pay_branch_no = :pay_branch_no");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PAY_NO", this.payNo);
        params.put("PAY_BRANCH_NO", this.payBranchNo);
        params.put("PAY_COUNTS", this.payCounts);
        params.put("UNIT_PRICE", this.unitPrice);
        params.put("AMOUNT", this.amount);
        params.put("TAX_AMOUNT", this.taxAmount);
        params.put("MEMO", this.memo);
        params.put("CLOSE_DATE", this.closeDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
