package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_ACCEPT_ACT_HED
 *
 * @author emarfkrow
 */
public class PchAcceptActHed implements IEntity {

    /** ACT_NO */
    private String actNo;

    /**
     * @return ACT_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_NO")
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

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_CODE")
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

    /** ORDER_NO */
    private String orderNo;

    /**
     * @return ORDER_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_NO")
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
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("ITEM")
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

    /** ACCEPT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime acceptDate;

    /**
     * @return ACCEPT_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACCEPT_DATE")
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

    /** UNIT_CODE */
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_CODE")
    public String getUnitCode() {
        return this.unitCode;
    }

    /**
     * @param o UNIT_CODE
     */
    public void setUnitCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCode = String.valueOf(o.toString());
        } else {
            this.unitCode = null;
        }
    }

    /** TAX_CODE */
    private String taxCode;

    /**
     * @return TAX_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TAX_CODE")
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * @param o TAX_CODE
     */
    public void setTaxCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.taxCode = String.valueOf(o.toString());
        } else {
            this.taxCode = null;
        }
    }

    /** TAX_CAL_CODE */
    private java.math.BigDecimal taxCalCode;

    /**
     * @return TAX_CAL_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TAX_CAL_CODE")
    public java.math.BigDecimal getTaxCalCode() {
        return this.taxCalCode;
    }

    /**
     * @param o TAX_CAL_CODE
     */
    public void setTaxCalCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.taxCalCode = new java.math.BigDecimal(o.toString());
        } else {
            this.taxCalCode = null;
        }
    }

    /** SUBINV_CODE */
    private String subinvCode;

    /**
     * @return SUBINV_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUBINV_CODE")
    public String getSubinvCode() {
        return this.subinvCode;
    }

    /**
     * @param o SUBINV_CODE
     */
    public void setSubinvCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.subinvCode = String.valueOf(o.toString());
        } else {
            this.subinvCode = null;
        }
    }

    /** ACCOUNT_CODE */
    private String accountCode;

    /**
     * @return ACCOUNT_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACCOUNT_CODE")
    public String getAccountCode() {
        return this.accountCode;
    }

    /**
     * @param o ACCOUNT_CODE
     */
    public void setAccountCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.accountCode = String.valueOf(o.toString());
        } else {
            this.accountCode = null;
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CHANGE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CHANGE")
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
     * PCH_ACCEPT_ACT_HED照会
     *
     * @param param1 ACT_NO
     * @return PCH_ACCEPT_ACT_HED
     */
    public static PchAcceptActHed get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACT_NO\") = TRIM (:act_no)");

        String sql = "SELECT * FROM PCH_ACCEPT_ACT_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_no", param1);

        return Queries.get(sql, params, PchAcceptActHed.class);
    }

    /**
     * PCH_ACCEPT_ACT_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ACT_NOの採番処理
        numbering();

        // PCH_ACCEPT_ACT_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"ACT_NO\" -- :act_no");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"ORDER_NO\" -- :order_no");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"ITEM\" -- :item");
        nameList.add("\"ACCEPT_DATE\" -- :accept_date");
        nameList.add("\"UNIT_CODE\" -- :unit_code");
        nameList.add("\"TAX_CODE\" -- :tax_code");
        nameList.add("\"TAX_CAL_CODE\" -- :tax_cal_code");
        nameList.add("\"SUBINV_CODE\" -- :subinv_code");
        nameList.add("\"ACCOUNT_CODE\" -- :account_code");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_ACCEPT_ACT_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":act_no");
        valueList.add(":sup_code");
        valueList.add(":order_no");
        valueList.add(":hinban");
        valueList.add(":item");
        valueList.add("TO_TIMESTAMP (:accept_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":unit_code");
        valueList.add(":tax_code");
        valueList.add(":tax_cal_code");
        valueList.add(":subinv_code");
        valueList.add(":account_code");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** ACT_NOの採番処理 */
    private void numbering() {

        if (this.actNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"ACT_NO\") IS NULL THEN 0 ELSE MAX(e.\"ACT_NO\") * 1 END + 1, 10, '0') AS \"ACT_NO\" FROM PCH_ACCEPT_ACT_HED e WHERE e.\"ACT_NO\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("ACT_NO");

        this.setActNo(o);
    }

    /**
     * PCH_ACCEPT_ACT_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_ACCEPT_ACT_HEDの登録
        String sql = "UPDATE PCH_ACCEPT_ACT_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"ACT_NO\" = :act_no");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"ORDER_NO\" = :order_no");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"ITEM\" = :item");
        setList.add("\"ACCEPT_DATE\" = TO_TIMESTAMP (:accept_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"UNIT_CODE\" = :unit_code");
        setList.add("\"TAX_CODE\" = :tax_code");
        setList.add("\"TAX_CAL_CODE\" = :tax_cal_code");
        setList.add("\"SUBINV_CODE\" = :subinv_code");
        setList.add("\"ACCOUNT_CODE\" = :account_code");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_ACCEPT_ACT_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_ACCEPT_ACT_HEDの削除
        String sql = "DELETE FROM PCH_ACCEPT_ACT_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACT_NO\") = TRIM (:act_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_no", this.actNo);
        params.put("sup_code", this.supCode);
        params.put("order_no", this.orderNo);
        params.put("hinban", this.hinban);
        params.put("item", this.item);
        params.put("accept_date", this.acceptDate);
        params.put("unit_code", this.unitCode);
        params.put("tax_code", this.taxCode);
        params.put("tax_cal_code", this.taxCalCode);
        params.put("subinv_code", this.subinvCode);
        params.put("account_code", this.accountCode);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
