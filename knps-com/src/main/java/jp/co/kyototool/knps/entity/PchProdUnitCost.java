package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_PROD_UNIT_COST
 *
 * @author emarfkrow
 */
public class PchProdUnitCost implements IEntity {

    /** CLOSE_DATE */
    private String closeDate;

    /**
     * @return CLOSE_DATE
     */
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

    /** PRO_GROUP_NO */
    private java.math.BigDecimal proGroupNo;

    /**
     * @return PRO_GROUP_NO
     */
    public java.math.BigDecimal getProGroupNo() {
        return this.proGroupNo;
    }

    /**
     * @param o PRO_GROUP_NO
     */
    public void setProGroupNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proGroupNo = new java.math.BigDecimal(o.toString());
        } else {
            this.proGroupNo = null;
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

    /** PROPRIETARY_TOTAL_COUNTS */
    private java.math.BigDecimal proprietaryTotalCounts;

    /**
     * @return PROPRIETARY_TOTAL_COUNTS
     */
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
     * PCH_PROD_UNIT_COST照会
     *
     * @param param1 CLOSE_DATE
     * @param param2 PRO_GROUP_NO
     * @param param3 HINBAN
     * @param param4 ROUTING
     * @return PCH_PROD_UNIT_COST
     */
    public static PchProdUnitCost get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"CLOSE_DATE\") = TRIM (:close_date)");
        whereList.add("\"PRO_GROUP_NO\" = :pro_group_no");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"ROUTING\" = :routing");

        String sql = "SELECT * FROM PCH_PROD_UNIT_COST WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("close_date", param1);
        params.put("pro_group_no", param2);
        params.put("hinban", param3);
        params.put("routing", param4);

        return Queries.get(sql, params, PchProdUnitCost.class);
    }

    /**
     * PCH_PROD_UNIT_COST追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PCH_PROD_UNIT_COSTの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("close_date -- :close_date");
        nameList.add("pro_group_no -- :pro_group_no");
        nameList.add("hinban -- :hinban");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("proprietary_total_counts -- :proprietary_total_counts");
        nameList.add("proprietary_total_cost -- :proprietary_total_cost");
        nameList.add("last_prch_unit_cost -- :last_prch_unit_cost");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_PROD_UNIT_COST(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":close_date");
        valueList.add(":pro_group_no");
        valueList.add(":hinban");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":ope_detail");
        valueList.add(":proprietary_total_counts");
        valueList.add(":proprietary_total_cost");
        valueList.add(":last_prch_unit_cost");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PCH_PROD_UNIT_COST更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_PROD_UNIT_COSTの登録
        String sql = "UPDATE PCH_PROD_UNIT_COST\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("close_date = :close_date");
        setList.add("pro_group_no = :pro_group_no");
        setList.add("hinban = :hinban");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("ope_detail = :ope_detail");
        setList.add("proprietary_total_counts = :proprietary_total_counts");
        setList.add("proprietary_total_cost = :proprietary_total_cost");
        setList.add("last_prch_unit_cost = :last_prch_unit_cost");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_PROD_UNIT_COST削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_PROD_UNIT_COSTの削除
        String sql = "DELETE FROM PCH_PROD_UNIT_COST WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (close_date) = TRIM (:close_date)");
        whereList.add("pro_group_no = :pro_group_no");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("routing = :routing");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("CLOSE_DATE", this.closeDate);
        params.put("PRO_GROUP_NO", this.proGroupNo);
        params.put("HINBAN", this.hinban);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("PROPRIETARY_TOTAL_COUNTS", this.proprietaryTotalCounts);
        params.put("PROPRIETARY_TOTAL_COST", this.proprietaryTotalCost);
        params.put("LAST_PRCH_UNIT_COST", this.lastPrchUnitCost);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
