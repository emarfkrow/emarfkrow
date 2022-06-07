package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_PROD_TOTAL_INF
 *
 * @author emarfkrow
 */
public class PchProdTotalInf implements IEntity {

    /** CLOSE_DATE */
    private String closeDate;

    /**
     * @return CLOSE_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CLOSE_DATE")
    public String getCloseDate() {
        return this.closeDate;
    }

    /**
     * @param o CLOSE_DATE
     */
    public void setCloseDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.closeDate = String.valueOf(o.toString());
        } else {
            this.closeDate = null;
        }
    }

    /** ROUTING_GROUP */
    private java.math.BigDecimal routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING_GROUP")
    public java.math.BigDecimal getRoutingGroup() {
        return this.routingGroup;
    }

    /**
     * @param o ROUTING_GROUP
     */
    public void setRoutingGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.routingGroup = null;
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

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING")
    public java.math.BigDecimal getRouting() {
        return this.routing;
    }

    /**
     * @param o ROUTING
     */
    public void setRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing = new java.math.BigDecimal(o.toString());
        } else {
            this.routing = null;
        }
    }

    /** TOTAL_COUNTS */
    private java.math.BigDecimal totalCounts;

    /**
     * @return TOTAL_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOTAL_COUNTS")
    public java.math.BigDecimal getTotalCounts() {
        return this.totalCounts;
    }

    /**
     * @param o TOTAL_COUNTS
     */
    public void setTotalCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.totalCounts = null;
        }
    }

    /** TOTAL_AMOUNT */
    private java.math.BigDecimal totalAmount;

    /**
     * @return TOTAL_AMOUNT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOTAL_AMOUNT")
    public java.math.BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * @param o TOTAL_AMOUNT
     */
    public void setTotalAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.totalAmount = null;
        }
    }

    /** SUM_SUPPLY */
    private java.math.BigDecimal sumSupply;

    /**
     * @return SUM_SUPPLY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUM_SUPPLY")
    public java.math.BigDecimal getSumSupply() {
        return this.sumSupply;
    }

    /**
     * @param o SUM_SUPPLY
     */
    public void setSumSupply(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumSupply = new java.math.BigDecimal(o.toString());
        } else {
            this.sumSupply = null;
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
     * PCH_PROD_TOTAL_INF照会
     *
     * @param param1 HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 ROUTING
     * @param param4 CLOSE_DATE
     * @return PCH_PROD_TOTAL_INF
     */
    public static PchProdTotalInf get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"CLOSE_DATE\") = TRIM (:close_date)");

        String sql = "SELECT * FROM PCH_PROD_TOTAL_INF WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);
        params.put("close_date", param4);

        return Queries.get(sql, params, PchProdTotalInf.class);
    }

    /**
     * PCH_PROD_TOTAL_INF追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // CLOSE_DATEの採番処理
        numbering();

        // PCH_PROD_TOTAL_INFの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"CLOSE_DATE\" -- :close_date");
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"ROUTING\" -- :routing");
        nameList.add("\"TOTAL_COUNTS\" -- :total_counts");
        nameList.add("\"TOTAL_AMOUNT\" -- :total_amount");
        nameList.add("\"SUM_SUPPLY\" -- :sum_supply");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_PROD_TOTAL_INF(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":close_date");
        valueList.add(":routing_group");
        valueList.add(":hinban");
        valueList.add(":routing");
        valueList.add(":total_counts");
        valueList.add(":total_amount");
        valueList.add(":sum_supply");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** CLOSE_DATEの採番処理 */
    private void numbering() {

        if (this.closeDate != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"CLOSE_DATE\") IS NULL THEN 0 ELSE MAX(e.\"CLOSE_DATE\") * 1 END + 1, 4, '0') AS \"CLOSE_DATE\" FROM PCH_PROD_TOTAL_INF e WHERE e.\"CLOSE_DATE\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"HINBAN\" = :hinban");
        whereList.add("e.\"ROUTING_GROUP\" = :routing_group");
        whereList.add("e.\"ROUTING\" = :routing");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hinban", this.hinban);
        params.put("routing_group", this.routingGroup);
        params.put("routing", this.routing);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("CLOSE_DATE");

        this.setCloseDate(o);
    }

    /**
     * PCH_PROD_TOTAL_INF更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_PROD_TOTAL_INFの登録
        String sql = "UPDATE PCH_PROD_TOTAL_INF\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"CLOSE_DATE\" = :close_date");
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"ROUTING\" = :routing");
        setList.add("\"TOTAL_COUNTS\" = :total_counts");
        setList.add("\"TOTAL_AMOUNT\" = :total_amount");
        setList.add("\"SUM_SUPPLY\" = :sum_supply");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_PROD_TOTAL_INF削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_PROD_TOTAL_INFの削除
        String sql = "DELETE FROM PCH_PROD_TOTAL_INF WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"CLOSE_DATE\") = TRIM (:close_date)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("close_date", this.closeDate);
        params.put("routing_group", this.routingGroup);
        params.put("hinban", this.hinban);
        params.put("routing", this.routing);
        params.put("total_counts", this.totalCounts);
        params.put("total_amount", this.totalAmount);
        params.put("sum_supply", this.sumSupply);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
