package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_SUP_UNIT_COST
 *
 * @author emarfkrow
 */
public class PchSupUnitCost implements IEntity {

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

    /** PROPRIETARY_TOTAL_COUNTS */
    private java.math.BigDecimal proprietaryTotalCounts;

    /**
     * @return PROPRIETARY_TOTAL_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PROPRIETARY_TOTAL_COUNTS")
    public java.math.BigDecimal getProprietaryTotalCounts() {
        return this.proprietaryTotalCounts;
    }

    /**
     * @param o PROPRIETARY_TOTAL_COUNTS
     */
    public void setProprietaryTotalCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proprietaryTotalCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.proprietaryTotalCounts = null;
        }
    }

    /** PROPRIETARY_TOTAL_COST */
    private java.math.BigDecimal proprietaryTotalCost;

    /**
     * @return PROPRIETARY_TOTAL_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PROPRIETARY_TOTAL_COST")
    public java.math.BigDecimal getProprietaryTotalCost() {
        return this.proprietaryTotalCost;
    }

    /**
     * @param o PROPRIETARY_TOTAL_COST
     */
    public void setProprietaryTotalCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proprietaryTotalCost = new java.math.BigDecimal(o.toString());
        } else {
            this.proprietaryTotalCost = null;
        }
    }

    /** LAST_PRCH_UNIT_COST */
    private java.math.BigDecimal lastPrchUnitCost;

    /**
     * @return LAST_PRCH_UNIT_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LAST_PRCH_UNIT_COST")
    public java.math.BigDecimal getLastPrchUnitCost() {
        return this.lastPrchUnitCost;
    }

    /**
     * @param o LAST_PRCH_UNIT_COST
     */
    public void setLastPrchUnitCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastPrchUnitCost = new java.math.BigDecimal(o.toString());
        } else {
            this.lastPrchUnitCost = null;
        }
    }

    /** LAST_ACT_DATE */
    private String lastActDate;

    /**
     * @return LAST_ACT_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LAST_ACT_DATE")
    public String getLastActDate() {
        return this.lastActDate;
    }

    /**
     * @param o LAST_ACT_DATE
     */
    public void setLastActDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastActDate = String.valueOf(o.toString());
        } else {
            this.lastActDate = null;
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

    /** LOWER_COST_KBN */
    private java.math.BigDecimal lowerCostKbn;

    /**
     * @return LOWER_COST_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOWER_COST_KBN")
    public java.math.BigDecimal getLowerCostKbn() {
        return this.lowerCostKbn;
    }

    /**
     * @param o LOWER_COST_KBN
     */
    public void setLowerCostKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lowerCostKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.lowerCostKbn = null;
        }
    }

    /**
     * PCH_SUP_UNIT_COST照会
     *
     * @return PCH_SUP_UNIT_COST
     */
    public static PchSupUnitCost get() {

        List<String> whereList = new ArrayList<String>();

        String sql = "SELECT * FROM PCH_SUP_UNIT_COST WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();

        return Queries.get(sql, params, PchSupUnitCost.class);
    }

    /**
     * PCH_SUP_UNIT_COST追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PCH_SUP_UNIT_COSTの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"CLOSE_DATE\" -- :close_date");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"PROPRIETARY_TOTAL_COUNTS\" -- :proprietary_total_counts");
        nameList.add("\"PROPRIETARY_TOTAL_COST\" -- :proprietary_total_cost");
        nameList.add("\"LAST_PRCH_UNIT_COST\" -- :last_prch_unit_cost");
        nameList.add("\"LAST_ACT_DATE\" -- :last_act_date");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"LOWER_COST_KBN\" -- :lower_cost_kbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_SUP_UNIT_COST(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":close_date");
        valueList.add(":hinban");
        valueList.add(":sup_code");
        valueList.add(":proprietary_total_counts");
        valueList.add(":proprietary_total_cost");
        valueList.add(":last_prch_unit_cost");
        valueList.add(":last_act_date");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":lower_cost_kbn");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PCH_SUP_UNIT_COST更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_SUP_UNIT_COSTの登録
        String sql = "UPDATE PCH_SUP_UNIT_COST\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"CLOSE_DATE\" = :close_date");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"PROPRIETARY_TOTAL_COUNTS\" = :proprietary_total_counts");
        setList.add("\"PROPRIETARY_TOTAL_COST\" = :proprietary_total_cost");
        setList.add("\"LAST_PRCH_UNIT_COST\" = :last_prch_unit_cost");
        setList.add("\"LAST_ACT_DATE\" = :last_act_date");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"LOWER_COST_KBN\" = :lower_cost_kbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_SUP_UNIT_COST削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_SUP_UNIT_COSTの削除
        String sql = "DELETE FROM PCH_SUP_UNIT_COST WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("close_date", this.closeDate);
        params.put("hinban", this.hinban);
        params.put("sup_code", this.supCode);
        params.put("proprietary_total_counts", this.proprietaryTotalCounts);
        params.put("proprietary_total_cost", this.proprietaryTotalCost);
        params.put("last_prch_unit_cost", this.lastPrchUnitCost);
        params.put("last_act_date", this.lastActDate);
        params.put("lower_cost_kbn", this.lowerCostKbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
