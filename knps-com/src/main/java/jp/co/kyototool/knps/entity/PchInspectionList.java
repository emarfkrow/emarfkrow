package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_INSPECTION_LIST
 *
 * @author emarfkrow
 */
public class PchInspectionList implements IEntity {

    /** TARGET_DATE */
    private String targetDate;

    /**
     * @return TARGET_DATE
     */
    public String getTargetDate() {
        return this.targetDate;
    }

    /**
     * @param o TARGET_DATE
     */
    public void setTargetDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.targetDate = String.valueOf(o.toString());
        } else {
            this.targetDate = null;
        }
    }

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return this.supCode;
    }

    /**
     * @param o SUP_CODE
     */
    public void setSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supCode = String.valueOf(o.toString());
        } else {
            this.supCode = null;
        }
    }

    /** SUP_NAME */
    private String supName;

    /**
     * @return SUP_NAME
     */
    public String getSupName() {
        return this.supName;
    }

    /**
     * @param o SUP_NAME
     */
    public void setSupName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supName = String.valueOf(o.toString());
        } else {
            this.supName = null;
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

    /** ITEM */
    private String item;

    /**
     * @return ITEM
     */
    public String getItem() {
        return this.item;
    }

    /**
     * @param o ITEM
     */
    public void setItem(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.item = String.valueOf(o.toString());
        } else {
            this.item = null;
        }
    }

    /** OPE_DETAIL */
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return this.opeDetail;
    }

    /**
     * @param o OPE_DETAIL
     */
    public void setOpeDetail(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeDetail = String.valueOf(o.toString());
        } else {
            this.opeDetail = null;
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

    /** SUM_INSPECT_COUNTS */
    private java.math.BigDecimal sumInspectCounts;

    /**
     * @return SUM_INSPECT_COUNTS
     */
    public java.math.BigDecimal getSumInspectCounts() {
        return this.sumInspectCounts;
    }

    /**
     * @param o SUM_INSPECT_COUNTS
     */
    public void setSumInspectCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumInspectCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.sumInspectCounts = null;
        }
    }

    /** INSPECT_UNIT */
    private java.math.BigDecimal inspectUnit;

    /**
     * @return INSPECT_UNIT
     */
    public java.math.BigDecimal getInspectUnit() {
        return this.inspectUnit;
    }

    /**
     * @param o INSPECT_UNIT
     */
    public void setInspectUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectUnit = null;
        }
    }

    /** ACCEPT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime acceptDate;

    /**
     * @return ACCEPT_DATE
     */
    public java.time.LocalDateTime getAcceptDate() {
        return this.acceptDate;
    }

    /**
     * @param o ACCEPT_DATE
     */
    public void setAcceptDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.acceptDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.acceptDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.acceptDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.acceptDate = null;
        }
    }

    /** SUM_INSPECT_AMOUNT */
    private java.math.BigDecimal sumInspectAmount;

    /**
     * @return SUM_INSPECT_AMOUNT
     */
    public java.math.BigDecimal getSumInspectAmount() {
        return this.sumInspectAmount;
    }

    /**
     * @param o SUM_INSPECT_AMOUNT
     */
    public void setSumInspectAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumInspectAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.sumInspectAmount = null;
        }
    }

    /** SUM_TAX_AMOUNT */
    private java.math.BigDecimal sumTaxAmount;

    /**
     * @return SUM_TAX_AMOUNT
     */
    public java.math.BigDecimal getSumTaxAmount() {
        return this.sumTaxAmount;
    }

    /**
     * @param o SUM_TAX_AMOUNT
     */
    public void setSumTaxAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumTaxAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.sumTaxAmount = null;
        }
    }

    /** SUM_AMOUNT */
    private java.math.BigDecimal sumAmount;

    /**
     * @return SUM_AMOUNT
     */
    public java.math.BigDecimal getSumAmount() {
        return this.sumAmount;
    }

    /**
     * @param o SUM_AMOUNT
     */
    public void setSumAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.sumAmount = null;
        }
    }

    /** SEND_INSPECT_LIST */
    private java.math.BigDecimal sendInspectList;

    /**
     * @return SEND_INSPECT_LIST
     */
    public java.math.BigDecimal getSendInspectList() {
        return this.sendInspectList;
    }

    /**
     * @param o SEND_INSPECT_LIST
     */
    public void setSendInspectList(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendInspectList = new java.math.BigDecimal(o.toString());
        } else {
            this.sendInspectList = null;
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

    /** ISSHIKI_UNIT_F */
    private String isshikiUnitF;

    /**
     * @return ISSHIKI_UNIT_F
     */
    public String getIsshikiUnitF() {
        return this.isshikiUnitF;
    }

    /**
     * @param o ISSHIKI_UNIT_F
     */
    public void setIsshikiUnitF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.isshikiUnitF = String.valueOf(o.toString());
        } else {
            this.isshikiUnitF = null;
        }
    }

    /**
     * PCH_INSPECTION_LIST照会
     *
     * @param param1 ORDER_NO
     * @param param2 TARGET_DATE
     * @param param3 SUP_CODE
     * @return PCH_INSPECTION_LIST
     */
    public static PchInspectionList get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ORDER_NO\") = TRIM (:order_no)");
        whereList.add("TRIM (\"TARGET_DATE\") = TRIM (:target_date)");
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");

        String sql = "SELECT * FROM PCH_INSPECTION_LIST WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("order_no", param1);
        params.put("target_date", param2);
        params.put("sup_code", param3);

        return Queries.get(sql, params, PchInspectionList.class);
    }

    /**
     * PCH_INSPECTION_LIST追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SUP_CODEの採番処理
        numbering();

        // PCH_INSPECTION_LISTの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("target_date -- :target_date");
        nameList.add("sup_code -- :sup_code");
        nameList.add("sup_name -- :sup_name");
        nameList.add("order_no -- :order_no");
        nameList.add("hinban -- :hinban");
        nameList.add("item -- :item");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("memo -- :memo");
        nameList.add("sum_inspect_counts -- :sum_inspect_counts");
        nameList.add("inspect_unit -- :inspect_unit");
        nameList.add("accept_date -- :accept_date");
        nameList.add("sum_inspect_amount -- :sum_inspect_amount");
        nameList.add("sum_tax_amount -- :sum_tax_amount");
        nameList.add("sum_amount -- :sum_amount");
        nameList.add("send_inspect_list -- :send_inspect_list");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("isshiki_unit_f -- :isshiki_unit_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_INSPECTION_LIST(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":target_date");
        valueList.add(":sup_code");
        valueList.add(":sup_name");
        valueList.add(":order_no");
        valueList.add(":hinban");
        valueList.add(":item");
        valueList.add(":ope_detail");
        valueList.add(":memo");
        valueList.add(":sum_inspect_counts");
        valueList.add(":inspect_unit");
        valueList.add("TO_TIMESTAMP (:accept_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":sum_inspect_amount");
        valueList.add(":sum_tax_amount");
        valueList.add(":sum_amount");
        valueList.add(":send_inspect_list");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":isshiki_unit_f");
        return String.join("\r\n    , ", valueList);
    }

    /** SUP_CODEの採番処理 */
    private void numbering() {

        if (this.supCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SUP_CODE) IS NULL THEN 0 ELSE MAX(e.SUP_CODE) * 1 END + 1, 6, '0') AS SUP_CODE FROM PCH_INSPECTION_LIST e WHERE e.SUP_CODE < '999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.ORDER_NO = :order_no");
        whereList.add("e.TARGET_DATE = :target_date");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("orderNo", this.orderNo);
        params.put("targetDate", this.targetDate);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SUP_CODE");

        this.setSupCode(o);
    }

    /**
     * PCH_INSPECTION_LIST更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_INSPECTION_LISTの登録
        String sql = "UPDATE PCH_INSPECTION_LIST\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("target_date = :target_date");
        setList.add("sup_code = :sup_code");
        setList.add("sup_name = :sup_name");
        setList.add("order_no = :order_no");
        setList.add("hinban = :hinban");
        setList.add("item = :item");
        setList.add("ope_detail = :ope_detail");
        setList.add("memo = :memo");
        setList.add("sum_inspect_counts = :sum_inspect_counts");
        setList.add("inspect_unit = :inspect_unit");
        setList.add("accept_date = TO_TIMESTAMP (:accept_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("sum_inspect_amount = :sum_inspect_amount");
        setList.add("sum_tax_amount = :sum_tax_amount");
        setList.add("sum_amount = :sum_amount");
        setList.add("send_inspect_list = :send_inspect_list");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("isshiki_unit_f = :isshiki_unit_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_INSPECTION_LIST削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_INSPECTION_LISTの削除
        String sql = "DELETE FROM PCH_INSPECTION_LIST WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (order_no) = TRIM (:order_no)");
        whereList.add("TRIM (target_date) = TRIM (:target_date)");
        whereList.add("TRIM (sup_code) = TRIM (:sup_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("TARGET_DATE", this.targetDate);
        params.put("SUP_CODE", this.supCode);
        params.put("SUP_NAME", this.supName);
        params.put("ORDER_NO", this.orderNo);
        params.put("HINBAN", this.hinban);
        params.put("ITEM", this.item);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("MEMO", this.memo);
        params.put("SUM_INSPECT_COUNTS", this.sumInspectCounts);
        params.put("INSPECT_UNIT", this.inspectUnit);
        params.put("ACCEPT_DATE", this.acceptDate);
        params.put("SUM_INSPECT_AMOUNT", this.sumInspectAmount);
        params.put("SUM_TAX_AMOUNT", this.sumTaxAmount);
        params.put("SUM_AMOUNT", this.sumAmount);
        params.put("SEND_INSPECT_LIST", this.sendInspectList);
        params.put("ISSHIKI_UNIT_F", this.isshikiUnitF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
