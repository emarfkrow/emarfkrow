package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_SUPPLY_SCH
 *
 * @author emarfkrow
 */
public class PchSupplySch implements IEntity {

    /** SUPPLY_NO */
    private String supplyNo;

    /**
     * @return SUPPLY_NO
     */
    public String getSupplyNo() {
        return this.supplyNo;
    }

    /**
     * @param o SUPPLY_NO
     */
    public void setSupplyNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyNo = String.valueOf(o.toString());
        } else {
            this.supplyNo = null;
        }
    }

    /** SUPPLY_ORDER_NO */
    private String supplyOrderNo;

    /**
     * @return SUPPLY_ORDER_NO
     */
    public String getSupplyOrderNo() {
        return this.supplyOrderNo;
    }

    /**
     * @param o SUPPLY_ORDER_NO
     */
    public void setSupplyOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyOrderNo = String.valueOf(o.toString());
        } else {
            this.supplyOrderNo = null;
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

    /** SUPPLY_KBN */
    private java.math.BigDecimal supplyKbn;

    /**
     * @return SUPPLY_KBN
     */
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

    /** SUPPLY_UNIT */
    private java.math.BigDecimal supplyUnit;

    /**
     * @return SUPPLY_UNIT
     */
    public java.math.BigDecimal getSupplyUnit() {
        return this.supplyUnit;
    }

    /**
     * @param o SUPPLY_UNIT
     */
    public void setSupplyUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyUnit = null;
        }
    }

    /** SUPPLY_COUNTS */
    private java.math.BigDecimal supplyCounts;

    /**
     * @return SUPPLY_COUNTS
     */
    public java.math.BigDecimal getSupplyCounts() {
        return this.supplyCounts;
    }

    /**
     * @param o SUPPLY_COUNTS
     */
    public void setSupplyCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyCounts = null;
        }
    }

    /** ACT_SUPPLY_COUNTS */
    private java.math.BigDecimal actSupplyCounts;

    /**
     * @return ACT_SUPPLY_COUNTS
     */
    public java.math.BigDecimal getActSupplyCounts() {
        return this.actSupplyCounts;
    }

    /**
     * @param o ACT_SUPPLY_COUNTS
     */
    public void setActSupplyCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actSupplyCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.actSupplyCounts = null;
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

    /** SUPPLY_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime supplyDate;

    /**
     * @return SUPPLY_DATE
     */
    public java.time.LocalDateTime getSupplyDate() {
        return this.supplyDate;
    }

    /**
     * @param o SUPPLY_DATE
     */
    public void setSupplyDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.supplyDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.supplyDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.supplyDate = null;
        }
    }

    /** SUPPLY_VERIFY_STAT */
    private java.math.BigDecimal supplyVerifyStat;

    /**
     * @return SUPPLY_VERIFY_STAT
     */
    public java.math.BigDecimal getSupplyVerifyStat() {
        return this.supplyVerifyStat;
    }

    /**
     * @param o SUPPLY_VERIFY_STAT
     */
    public void setSupplyVerifyStat(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyVerifyStat = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyVerifyStat = null;
        }
    }

    /** USER_ID_VERIFY */
    private String userIdVerify;

    /**
     * @return USER_ID_VERIFY
     */
    public String getUserIdVerify() {
        return this.userIdVerify;
    }

    /**
     * @param o USER_ID_VERIFY
     */
    public void setUserIdVerify(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdVerify = String.valueOf(o.toString());
        } else {
            this.userIdVerify = null;
        }
    }

    /** SUPPLY_ISSUE_STAT */
    private java.math.BigDecimal supplyIssueStat;

    /**
     * @return SUPPLY_ISSUE_STAT
     */
    public java.math.BigDecimal getSupplyIssueStat() {
        return this.supplyIssueStat;
    }

    /**
     * @param o SUPPLY_ISSUE_STAT
     */
    public void setSupplyIssueStat(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyIssueStat = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyIssueStat = null;
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
     * PCH_SUPPLY_SCH照会
     *
     * @param param1 SUPPLY_NO
     * @return PCH_SUPPLY_SCH
     */
    public static PchSupplySch get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SUPPLY_NO\") = TRIM (:supply_no)");

        String sql = "SELECT * FROM PCH_SUPPLY_SCH WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("supply_no", param1);

        return Queries.get(sql, params, PchSupplySch.class);
    }

    /**
     * PCH_SUPPLY_SCH追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SUPPLY_NOの採番処理
        numbering();

        // PCH_SUPPLY_SCHの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SUPPLY_NO\" -- :supply_no");
        nameList.add("\"SUPPLY_ORDER_NO\" -- :supply_order_no");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"SUPPLY_KBN\" -- :supply_kbn");
        nameList.add("\"SUPPLY_UNIT\" -- :supply_unit");
        nameList.add("\"SUPPLY_COUNTS\" -- :supply_counts");
        nameList.add("\"ACT_SUPPLY_COUNTS\" -- :act_supply_counts");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"SUPPLY_DATE\" -- :supply_date");
        nameList.add("\"SUPPLY_VERIFY_STAT\" -- :supply_verify_stat");
        nameList.add("\"USER_ID_VERIFY\" -- :user_id_verify");
        nameList.add("\"SUPPLY_ISSUE_STAT\" -- :supply_issue_stat");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_SUPPLY_SCH(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":supply_no");
        valueList.add(":supply_order_no");
        valueList.add(":hinban");
        valueList.add(":supply_kbn");
        valueList.add(":supply_unit");
        valueList.add(":supply_counts");
        valueList.add(":act_supply_counts");
        valueList.add(":sup_code");
        valueList.add("TO_TIMESTAMP (:supply_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":supply_verify_stat");
        valueList.add(":user_id_verify");
        valueList.add(":supply_issue_stat");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** SUPPLY_NOの採番処理 */
    private void numbering() {

        if (this.supplyNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"SUPPLY_NO\") IS NULL THEN 0 ELSE MAX(e.\"SUPPLY_NO\") * 1 END + 1, 12, '0') AS \"SUPPLY_NO\" FROM PCH_SUPPLY_SCH e WHERE e.\"SUPPLY_NO\" < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SUPPLY_NO");

        this.setSupplyNo(o);
    }

    /**
     * PCH_SUPPLY_SCH更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_SUPPLY_SCHの登録
        String sql = "UPDATE PCH_SUPPLY_SCH\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SUPPLY_NO\" = :supply_no");
        setList.add("\"SUPPLY_ORDER_NO\" = :supply_order_no");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"SUPPLY_KBN\" = :supply_kbn");
        setList.add("\"SUPPLY_UNIT\" = :supply_unit");
        setList.add("\"SUPPLY_COUNTS\" = :supply_counts");
        setList.add("\"ACT_SUPPLY_COUNTS\" = :act_supply_counts");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"SUPPLY_DATE\" = TO_TIMESTAMP (:supply_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"SUPPLY_VERIFY_STAT\" = :supply_verify_stat");
        setList.add("\"USER_ID_VERIFY\" = :user_id_verify");
        setList.add("\"SUPPLY_ISSUE_STAT\" = :supply_issue_stat");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_SUPPLY_SCH削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_SUPPLY_SCHの削除
        String sql = "DELETE FROM PCH_SUPPLY_SCH WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SUPPLY_NO\") = TRIM (:supply_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("supply_no", this.supplyNo);
        params.put("supply_order_no", this.supplyOrderNo);
        params.put("hinban", this.hinban);
        params.put("supply_kbn", this.supplyKbn);
        params.put("supply_unit", this.supplyUnit);
        params.put("supply_counts", this.supplyCounts);
        params.put("act_supply_counts", this.actSupplyCounts);
        params.put("sup_code", this.supCode);
        params.put("supply_date", this.supplyDate);
        params.put("supply_verify_stat", this.supplyVerifyStat);
        params.put("user_id_verify", this.userIdVerify);
        params.put("supply_issue_stat", this.supplyIssueStat);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
