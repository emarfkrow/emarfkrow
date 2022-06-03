package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_PROD_UNITPRICE_BK
 *
 * @author emarfkrow
 */
public class MstProdUnitpriceBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
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

    /** ROUTING_GROUP */
    private java.math.BigDecimal routingGroup;

    /**
     * @return ROUTING_GROUP
     */
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

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
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

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
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

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return this.wcCode;
    }

    /**
     * @param o WC_CODE
     */
    public void setWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcCode = String.valueOf(o.toString());
        } else {
            this.wcCode = null;
        }
    }

    /** MIN_ORDER */
    private java.math.BigDecimal minOrder;

    /**
     * @return MIN_ORDER
     */
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
    private java.math.BigDecimal standardUnitpriceFlag;

    /**
     * @return STANDARD_UNITPRICE_FLAG
     */
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
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

    /** MIN_ORDER_AMOUNT */
    private java.math.BigDecimal minOrderAmount;

    /**
     * @return MIN_ORDER_AMOUNT
     */
    public java.math.BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    /**
     * @param o MIN_ORDER_AMOUNT
     */
    public void setMinOrderAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.minOrderAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.minOrderAmount = null;
        }
    }

    /**
     * MST_PROD_UNITPRICE_BK照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 ROUTING
     * @param param4 WC_CODE
     * @param param5 MIN_ORDER
     * @param param6 YY
     * @return MST_PROD_UNITPRICE_BK
     */
    public static MstProdUnitpriceBk get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5, final Object param6) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");
        whereList.add("\"MIN_ORDER\" = :min_order");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_PROD_UNITPRICE_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);
        params.put("wc_code", param4);
        params.put("min_order", param5);
        params.put("yy", param6);

        return Queries.get(sql, params, MstProdUnitpriceBk.class);
    }

    /**
     * MST_PROD_UNITPRICE_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_PROD_UNITPRICE_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yy -- :yy");
        nameList.add("routing_group -- :routing_group");
        nameList.add("man_hinban -- :man_hinban");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("min_order -- :min_order");
        nameList.add("stan_counts -- :stan_counts");
        nameList.add("order_unit -- :order_unit");
        nameList.add("standard_unitprice_flag -- :standard_unitprice_flag");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        nameList.add("gaika_kb -- :gaika_kb");
        nameList.add("gaika_tk -- :gaika_tk");
        nameList.add("isshiki_unit_f -- :isshiki_unit_f");
        nameList.add("min_order_amount -- :min_order_amount");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_PROD_UNITPRICE_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":routing_group");
        valueList.add(":man_hinban");
        valueList.add(":routing");
        valueList.add(":wc_code");
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
        valueList.add(":isshiki_unit_f");
        valueList.add(":min_order_amount");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.YY) IS NULL THEN 0 ELSE MAX(e.YY) * 1 END + 1, 4, '0') AS YY FROM MST_PROD_UNITPRICE_BK e WHERE e.YY < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.MAN_HINBAN = :man_hinban");
        whereList.add("e.ROUTING_GROUP = :routing_group");
        whereList.add("e.ROUTING = :routing");
        whereList.add("e.WC_CODE = :wc_code");
        whereList.add("e.MIN_ORDER = :min_order");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("manHinban", this.manHinban);
        params.put("routingGroup", this.routingGroup);
        params.put("routing", this.routing);
        params.put("wcCode", this.wcCode);
        params.put("minOrder", this.minOrder);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_PROD_UNITPRICE_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_PROD_UNITPRICE_BKの登録
        String sql = "UPDATE MST_PROD_UNITPRICE_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yy = :yy");
        setList.add("routing_group = :routing_group");
        setList.add("man_hinban = :man_hinban");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("min_order = :min_order");
        setList.add("stan_counts = :stan_counts");
        setList.add("order_unit = :order_unit");
        setList.add("standard_unitprice_flag = :standard_unitprice_flag");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        setList.add("gaika_kb = :gaika_kb");
        setList.add("gaika_tk = :gaika_tk");
        setList.add("isshiki_unit_f = :isshiki_unit_f");
        setList.add("min_order_amount = :min_order_amount");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_PROD_UNITPRICE_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_PROD_UNITPRICE_BKの削除
        String sql = "DELETE FROM MST_PROD_UNITPRICE_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");
        whereList.add("TRIM (wc_code) = TRIM (:wc_code)");
        whereList.add("min_order = :min_order");
        whereList.add("TRIM (yy) = TRIM (:yy)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YY", this.yy);
        params.put("ROUTING_GROUP", this.routingGroup);
        params.put("MAN_HINBAN", this.manHinban);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("MIN_ORDER", this.minOrder);
        params.put("STAN_COUNTS", this.stanCounts);
        params.put("ORDER_UNIT", this.orderUnit);
        params.put("STANDARD_UNITPRICE_FLAG", this.standardUnitpriceFlag);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("GAIKA_KB", this.gaikaKb);
        params.put("GAIKA_TK", this.gaikaTk);
        params.put("ISSHIKI_UNIT_F", this.isshikiUnitF);
        params.put("MIN_ORDER_AMOUNT", this.minOrderAmount);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
