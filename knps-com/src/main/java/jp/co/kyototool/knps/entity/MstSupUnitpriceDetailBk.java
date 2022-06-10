package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUP_UNITPRICE_DETAIL_BK
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YY")
    public String getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = String.valueOf(o.toString());
        } else {
            this.yy = null;
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

    /** MIN_ORDER */
    private java.math.BigDecimal minOrder;

    /**
     * @return MIN_ORDER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MIN_ORDER")
    public java.math.BigDecimal getMinOrder() {
        return this.minOrder;
    }

    /**
     * @param o MIN_ORDER
     */
    public void setMinOrder(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.minOrder = new java.math.BigDecimal(o.toString());
        } else {
            this.minOrder = null;
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

    /** ORDER_UNIT */
    private java.math.BigDecimal orderUnit;

    /**
     * @return ORDER_UNIT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_UNIT")
    public java.math.BigDecimal getOrderUnit() {
        return this.orderUnit;
    }

    /**
     * @param o ORDER_UNIT
     */
    public void setOrderUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.orderUnit = null;
        }
    }

    /** STANDARD_UNITPRICE_FLAG */
    private java.math.BigDecimal standardUnitpriceFlag = new java.math.BigDecimal(0);

    /**
     * @return STANDARD_UNITPRICE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STANDARD_UNITPRICE_FLAG")
    public java.math.BigDecimal getStandardUnitpriceFlag() {
        return this.standardUnitpriceFlag;
    }

    /**
     * @param o STANDARD_UNITPRICE_FLAG
     */
    public void setStandardUnitpriceFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.standardUnitpriceFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.standardUnitpriceFlag = null;
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

    /** GAIKA_KB */
    private String gaikaKb;

    /**
     * @return GAIKA_KB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GAIKA_KB")
    public String getGaikaKb() {
        return this.gaikaKb;
    }

    /**
     * @param o GAIKA_KB
     */
    public void setGaikaKb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gaikaKb = String.valueOf(o.toString());
        } else {
            this.gaikaKb = null;
        }
    }

    /** GAIKA_TK */
    private java.math.BigDecimal gaikaTk;

    /**
     * @return GAIKA_TK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GAIKA_TK")
    public java.math.BigDecimal getGaikaTk() {
        return this.gaikaTk;
    }

    /**
     * @param o GAIKA_TK
     */
    public void setGaikaTk(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gaikaTk = new java.math.BigDecimal(o.toString());
        } else {
            this.gaikaTk = null;
        }
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL_BK照会
     *
     * @param param1 HINBAN
     * @param param2 SUP_CODE
     * @param param3 MIN_ORDER
     * @param param4 YY
     * @return MST_SUP_UNITPRICE_DETAIL_BK
     */
    public static MstSupUnitpriceDetailBk get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");
        whereList.add("\"MIN_ORDER\" = :min_order");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE_DETAIL_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);
        params.put("min_order", param3);
        params.put("yy", param4);

        return Queries.get(sql, params, MstSupUnitpriceDetailBk.class);
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_SUP_UNITPRICE_DETAIL_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"MIN_ORDER\" -- :min_order");
        nameList.add("\"STAN_COUNTS\" -- :stan_counts");
        nameList.add("\"ORDER_UNIT\" -- :order_unit");
        nameList.add("\"STANDARD_UNITPRICE_FLAG\" -- :standard_unitprice_flag");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"GAIKA_KB\" -- :gaika_kb");
        nameList.add("\"GAIKA_TK\" -- :gaika_tk");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUP_UNITPRICE_DETAIL_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":hinban");
        valueList.add(":sup_code");
        valueList.add(":min_order");
        valueList.add(":stan_counts");
        valueList.add(":order_unit");
        valueList.add(":standard_unitprice_flag");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":gaika_kb");
        valueList.add(":gaika_tk");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM MST_SUP_UNITPRICE_DETAIL_BK e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"HINBAN\" = :hinban");
        whereList.add("e.\"SUP_CODE\" = :sup_code");
        whereList.add("e.\"MIN_ORDER\" = :min_order");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hinban", this.hinban);
        params.put("sup_code", this.supCode);
        params.put("min_order", this.minOrder);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SUP_UNITPRICE_DETAIL_BKの登録
        String sql = "UPDATE MST_SUP_UNITPRICE_DETAIL_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"MIN_ORDER\" = :min_order");
        setList.add("\"STAN_COUNTS\" = :stan_counts");
        setList.add("\"ORDER_UNIT\" = :order_unit");
        setList.add("\"STANDARD_UNITPRICE_FLAG\" = :standard_unitprice_flag");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"GAIKA_KB\" = :gaika_kb");
        setList.add("\"GAIKA_TK\" = :gaika_tk");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SUP_UNITPRICE_DETAIL_BKの削除
        String sql = "DELETE FROM MST_SUP_UNITPRICE_DETAIL_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");
        whereList.add("\"MIN_ORDER\" = :min_order");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("hinban", this.hinban);
        params.put("sup_code", this.supCode);
        params.put("min_order", this.minOrder);
        params.put("stan_counts", this.stanCounts);
        params.put("order_unit", this.orderUnit);
        params.put("standard_unitprice_flag", this.standardUnitpriceFlag);
        params.put("delete_flag", this.deleteFlag);
        params.put("gaika_kb", this.gaikaKb);
        params.put("gaika_tk", this.gaikaTk);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
