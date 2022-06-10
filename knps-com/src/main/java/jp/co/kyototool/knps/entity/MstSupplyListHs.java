package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUPPLY_LIST_HS
 *
 * @author emarfkrow
 */
public class MstSupplyListHs implements IEntity {

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAN_HINBAN")
    public String getManHinban() {
        return this.manHinban;
    }

    /**
     * @param o MAN_HINBAN
     */
    public void setManHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.manHinban = String.valueOf(o.toString());
        } else {
            this.manHinban = null;
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

    /** SUPPLY_HINBAN */
    private String supplyHinban;

    /**
     * @return SUPPLY_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUPPLY_HINBAN")
    public String getSupplyHinban() {
        return this.supplyHinban;
    }

    /**
     * @param o SUPPLY_HINBAN
     */
    public void setSupplyHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyHinban = String.valueOf(o.toString());
        } else {
            this.supplyHinban = null;
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

    /** SUPPLY_KBN */
    private java.math.BigDecimal supplyKbn;

    /**
     * @return SUPPLY_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUPPLY_KBN")
    public java.math.BigDecimal getSupplyKbn() {
        return this.supplyKbn;
    }

    /**
     * @param o SUPPLY_KBN
     */
    public void setSupplyKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyKbn = null;
        }
    }

    /** STAN_COUNTS */
    private java.math.BigDecimal stanCounts;

    /**
     * @return STAN_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STAN_COUNTS")
    public java.math.BigDecimal getStanCounts() {
        return this.stanCounts;
    }

    /**
     * @param o STAN_COUNTS
     */
    public void setStanCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stanCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.stanCounts = null;
        }
    }

    /** UNIT_SUPPLY */
    private java.math.BigDecimal unitSupply;

    /**
     * @return UNIT_SUPPLY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_SUPPLY")
    public java.math.BigDecimal getUnitSupply() {
        return this.unitSupply;
    }

    /**
     * @param o UNIT_SUPPLY
     */
    public void setUnitSupply(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitSupply = new java.math.BigDecimal(o.toString());
        } else {
            this.unitSupply = null;
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag = new java.math.BigDecimal(0);

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
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
     * MST_SUPPLY_LIST_HS照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 ROUTING
     * @param param4 SUPPLY_HINBAN
     * @param param5 TIME_STAMP_CHANGE
     * @return MST_SUPPLY_LIST_HS
     */
    public static MstSupplyListHs get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"SUPPLY_HINBAN\") = TRIM (:supply_hinban)");
        whereList.add("\"TIME_STAMP_CHANGE\" = :time_stamp_change");

        String sql = "SELECT * FROM MST_SUPPLY_LIST_HS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);
        params.put("supply_hinban", param4);
        params.put("time_stamp_change", param5);

        return Queries.get(sql, params, MstSupplyListHs.class);
    }

    /**
     * MST_SUPPLY_LIST_HS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_SUPPLY_LIST_HSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"MAN_HINBAN\" -- :man_hinban");
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"ROUTING\" -- :routing");
        nameList.add("\"SUPPLY_HINBAN\" -- :supply_hinban");
        nameList.add("\"COUNTS\" -- :counts");
        nameList.add("\"SUPPLY_KBN\" -- :supply_kbn");
        nameList.add("\"STAN_COUNTS\" -- :stan_counts");
        nameList.add("\"UNIT_SUPPLY\" -- :unit_supply");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUPPLY_LIST_HS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":man_hinban");
        valueList.add(":routing_group");
        valueList.add(":routing");
        valueList.add(":supply_hinban");
        valueList.add(":counts");
        valueList.add(":supply_kbn");
        valueList.add(":stan_counts");
        valueList.add(":unit_supply");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_SUPPLY_LIST_HS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SUPPLY_LIST_HSの登録
        String sql = "UPDATE MST_SUPPLY_LIST_HS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"MAN_HINBAN\" = :man_hinban");
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"ROUTING\" = :routing");
        setList.add("\"SUPPLY_HINBAN\" = :supply_hinban");
        setList.add("\"COUNTS\" = :counts");
        setList.add("\"SUPPLY_KBN\" = :supply_kbn");
        setList.add("\"STAN_COUNTS\" = :stan_counts");
        setList.add("\"UNIT_SUPPLY\" = :unit_supply");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUPPLY_LIST_HS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SUPPLY_LIST_HSの削除
        String sql = "DELETE FROM MST_SUPPLY_LIST_HS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"SUPPLY_HINBAN\") = TRIM (:supply_hinban)");
        whereList.add("\"TIME_STAMP_CHANGE\" = :time_stamp_change");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", this.manHinban);
        params.put("routing_group", this.routingGroup);
        params.put("routing", this.routing);
        params.put("supply_hinban", this.supplyHinban);
        params.put("counts", this.counts);
        params.put("supply_kbn", this.supplyKbn);
        params.put("stan_counts", this.stanCounts);
        params.put("unit_supply", this.unitSupply);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
