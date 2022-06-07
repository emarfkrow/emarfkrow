package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STOCK_STORE
 *
 * @author emarfkrow
 */
public class InvStockStore implements IEntity {

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

    /** STORE_NO */
    private String storeNo;

    /**
     * @return STORE_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STORE_NO")
    public String getStoreNo() {
        return this.storeNo;
    }

    /**
     * @param o STORE_NO
     */
    public void setStoreNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.storeNo = String.valueOf(o.toString());
        } else {
            this.storeNo = null;
        }
    }

    /** COUNTS */
    private java.math.BigDecimal counts;

    /**
     * @return COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COUNTS")
    public java.math.BigDecimal getCounts() {
        return this.counts;
    }

    /**
     * @param o COUNTS
     */
    public void setCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.counts = new java.math.BigDecimal(o.toString());
        } else {
            this.counts = null;
        }
    }

    /** HAKO_SU */
    private java.math.BigDecimal hakoSu;

    /**
     * @return HAKO_SU
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HAKO_SU")
    public java.math.BigDecimal getHakoSu() {
        return this.hakoSu;
    }

    /**
     * @param o HAKO_SU
     */
    public void setHakoSu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hakoSu = new java.math.BigDecimal(o.toString());
        } else {
            this.hakoSu = null;
        }
    }

    /** STOCK */
    private java.math.BigDecimal stock;

    /**
     * @return STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STOCK")
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

    /** TOTAL_SUM_COST */
    private java.math.BigDecimal totalSumCost;

    /**
     * @return TOTAL_SUM_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOTAL_SUM_COST")
    public java.math.BigDecimal getTotalSumCost() {
        return this.totalSumCost;
    }

    /**
     * @param o TOTAL_SUM_COST
     */
    public void setTotalSumCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalSumCost = new java.math.BigDecimal(o.toString());
        } else {
            this.totalSumCost = null;
        }
    }

    /** AMOUNT */
    private java.math.BigDecimal amount;

    /**
     * @return AMOUNT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("AMOUNT")
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
     * INV_STOCK_STORE照会
     *
     * @param param1 HINBAN
     * @param param2 STORE_NO
     * @return INV_STOCK_STORE
     */
    public static InvStockStore get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HINBAN\" = :hinban");
        whereList.add("\"STORE_NO\" = :store_no");

        String sql = "SELECT * FROM INV_STOCK_STORE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("store_no", param2);

        return Queries.get(sql, params, InvStockStore.class);
    }

    /**
     * INV_STOCK_STORE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STOCK_STOREの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"STORE_NO\" -- :store_no");
        nameList.add("\"COUNTS\" -- :counts");
        nameList.add("\"HAKO_SU\" -- :hako_su");
        nameList.add("\"STOCK\" -- :stock");
        nameList.add("\"TOTAL_SUM_COST\" -- :total_sum_cost");
        nameList.add("\"AMOUNT\" -- :amount");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STOCK_STORE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hinban");
        valueList.add(":store_no");
        valueList.add(":counts");
        valueList.add(":hako_su");
        valueList.add(":stock");
        valueList.add(":total_sum_cost");
        valueList.add(":amount");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_STOCK_STORE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_STOREの登録
        String sql = "UPDATE INV_STOCK_STORE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"STORE_NO\" = :store_no");
        setList.add("\"COUNTS\" = :counts");
        setList.add("\"HAKO_SU\" = :hako_su");
        setList.add("\"STOCK\" = :stock");
        setList.add("\"TOTAL_SUM_COST\" = :total_sum_cost");
        setList.add("\"AMOUNT\" = :amount");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STOCK_STORE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_STOREの削除
        String sql = "DELETE FROM INV_STOCK_STORE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HINBAN\" = :hinban");
        whereList.add("\"STORE_NO\" = :store_no");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", this.hinban);
        params.put("store_no", this.storeNo);
        params.put("counts", this.counts);
        params.put("hako_su", this.hakoSu);
        params.put("stock", this.stock);
        params.put("total_sum_cost", this.totalSumCost);
        params.put("amount", this.amount);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
