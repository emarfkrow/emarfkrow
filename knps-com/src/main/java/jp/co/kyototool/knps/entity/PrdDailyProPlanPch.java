package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_DAILY_PRO_PLAN_PCH
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanPch implements IEntity {

    /** PCH_ORDER_NO */
    private String pchOrderNo;

    /**
     * @return PCH_ORDER_NO
     */
    public String getPchOrderNo() {
        return this.pchOrderNo;
    }

    /**
     * @param o PCH_ORDER_NO
     */
    public void setPchOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pchOrderNo = String.valueOf(o.toString());
        } else {
            this.pchOrderNo = null;
        }
    }

    /** CHILD_PLAN_NO */
    private String childPlanNo;

    /**
     * @return CHILD_PLAN_NO
     */
    public String getChildPlanNo() {
        return this.childPlanNo;
    }

    /**
     * @param o CHILD_PLAN_NO
     */
    public void setChildPlanNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.childPlanNo = String.valueOf(o.toString());
        } else {
            this.childPlanNo = null;
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

    /** NES_COUNTS */
    private java.math.BigDecimal nesCounts;

    /**
     * @return NES_COUNTS
     */
    public java.math.BigDecimal getNesCounts() {
        return this.nesCounts;
    }

    /**
     * @param o NES_COUNTS
     */
    public void setNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.nesCounts = null;
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

    /** ORDER_COUNTS */
    private java.math.BigDecimal orderCounts;

    /**
     * @return ORDER_COUNTS
     */
    public java.math.BigDecimal getOrderCounts() {
        return this.orderCounts;
    }

    /**
     * @param o ORDER_COUNTS
     */
    public void setOrderCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.orderCounts = null;
        }
    }

    /** ORDER_LIMIT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime orderLimitDate;

    /**
     * @return ORDER_LIMIT_DATE
     */
    public java.time.LocalDateTime getOrderLimitDate() {
        return this.orderLimitDate;
    }

    /**
     * @param o ORDER_LIMIT_DATE
     */
    public void setOrderLimitDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.orderLimitDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.orderLimitDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderLimitDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.orderLimitDate = null;
        }
    }

    /** PERIOD */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime period;

    /**
     * @return PERIOD
     */
    public java.time.LocalDateTime getPeriod() {
        return this.period;
    }

    /**
     * @param o PERIOD
     */
    public void setPeriod(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.period = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.period = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.period = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.period = null;
        }
    }

    /** PCH_ORDER_STATUS */
    private java.math.BigDecimal pchOrderStatus;

    /**
     * @return PCH_ORDER_STATUS
     */
    public java.math.BigDecimal getPchOrderStatus() {
        return this.pchOrderStatus;
    }

    /**
     * @param o PCH_ORDER_STATUS
     */
    public void setPchOrderStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pchOrderStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.pchOrderStatus = null;
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
     * PRD_DAILY_PRO_PLAN_PCH照会
     *
     * @param param1 PCH_ORDER_NO
     * @return PRD_DAILY_PRO_PLAN_PCH
     */
    public static PrdDailyProPlanPch get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pch_order_no) = TRIM (:pch_order_no)");

        String sql = "SELECT * FROM PRD_DAILY_PRO_PLAN_PCH WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pch_order_no", param1);

        return Queries.get(sql, params, PrdDailyProPlanPch.class);
    }

    /**
     * PRD_DAILY_PRO_PLAN_PCH追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PCH_ORDER_NOの採番処理
        numbering();

        // PRD_DAILY_PRO_PLAN_PCHの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("pch_order_no -- :pch_order_no");
        nameList.add("child_plan_no -- :child_plan_no");
        nameList.add("hinban -- :hinban");
        nameList.add("nes_counts -- :nes_counts");
        nameList.add("sup_code -- :sup_code");
        nameList.add("order_counts -- :order_counts");
        nameList.add("order_limit_date -- :order_limit_date");
        nameList.add("period -- :period");
        nameList.add("pch_order_status -- :pch_order_status");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_DAILY_PRO_PLAN_PCH(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pch_order_no");
        valueList.add(":child_plan_no");
        valueList.add(":hinban");
        valueList.add(":nes_counts");
        valueList.add(":sup_code");
        valueList.add(":order_counts");
        valueList.add("TO_TIMESTAMP (:order_limit_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:period, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":pch_order_status");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** PCH_ORDER_NOの採番処理 */
    private void numbering() {

        if (this.pchOrderNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.PCH_ORDER_NO) IS NULL THEN 0 ELSE MAX(e.PCH_ORDER_NO) * 1 END + 1, 14, '0') AS PCH_ORDER_NO FROM PRD_DAILY_PRO_PLAN_PCH e WHERE e.PCH_ORDER_NO < '99999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PCH_ORDER_NO");

        this.setPchOrderNo(o);
    }

    /**
     * PRD_DAILY_PRO_PLAN_PCH更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_DAILY_PRO_PLAN_PCHの登録
        String sql = "UPDATE PRD_DAILY_PRO_PLAN_PCH\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("pch_order_no = :pch_order_no");
        setList.add("child_plan_no = :child_plan_no");
        setList.add("hinban = :hinban");
        setList.add("nes_counts = :nes_counts");
        setList.add("sup_code = :sup_code");
        setList.add("order_counts = :order_counts");
        setList.add("order_limit_date = TO_TIMESTAMP (:order_limit_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("period = TO_TIMESTAMP (:period, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("pch_order_status = :pch_order_status");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_DAILY_PRO_PLAN_PCH削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_DAILY_PRO_PLAN_PCHの削除
        String sql = "DELETE FROM PRD_DAILY_PRO_PLAN_PCH WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pch_order_no) = TRIM (:pch_order_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PCH_ORDER_NO", this.pchOrderNo);
        params.put("CHILD_PLAN_NO", this.childPlanNo);
        params.put("HINBAN", this.hinban);
        params.put("NES_COUNTS", this.nesCounts);
        params.put("SUP_CODE", this.supCode);
        params.put("ORDER_COUNTS", this.orderCounts);
        params.put("ORDER_LIMIT_DATE", this.orderLimitDate);
        params.put("PERIOD", this.period);
        params.put("PCH_ORDER_STATUS", this.pchOrderStatus);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
