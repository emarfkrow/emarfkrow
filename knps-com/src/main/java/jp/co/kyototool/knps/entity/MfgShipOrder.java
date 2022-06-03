package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_SHIP_ORDER
 *
 * @author emarfkrow
 */
public class MfgShipOrder implements IEntity {

    /** SHIP_ORDER_NO */
    private String shipOrderNo;

    /**
     * @return SHIP_ORDER_NO
     */
    public String getShipOrderNo() {
        return this.shipOrderNo;
    }

    /**
     * @param o SHIP_ORDER_NO
     */
    public void setShipOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipOrderNo = String.valueOf(o.toString());
        } else {
            this.shipOrderNo = null;
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

    /** SHIP_DIRECT_COUNTS */
    private java.math.BigDecimal shipDirectCounts;

    /**
     * @return SHIP_DIRECT_COUNTS
     */
    public java.math.BigDecimal getShipDirectCounts() {
        return this.shipDirectCounts;
    }

    /**
     * @param o SHIP_DIRECT_COUNTS
     */
    public void setShipDirectCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipDirectCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.shipDirectCounts = null;
        }
    }

    /** SHIP_STATUS */
    private java.math.BigDecimal shipStatus;

    /**
     * @return SHIP_STATUS
     */
    public java.math.BigDecimal getShipStatus() {
        return this.shipStatus;
    }

    /**
     * @param o SHIP_STATUS
     */
    public void setShipStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.shipStatus = null;
        }
    }

    /** SHIP_COUNTS */
    private java.math.BigDecimal shipCounts;

    /**
     * @return SHIP_COUNTS
     */
    public java.math.BigDecimal getShipCounts() {
        return this.shipCounts;
    }

    /**
     * @param o SHIP_COUNTS
     */
    public void setShipCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.shipCounts = null;
        }
    }

    /** SHIP_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime shipDate;

    /**
     * @return SHIP_DATE
     */
    public java.time.LocalDateTime getShipDate() {
        return this.shipDate;
    }

    /**
     * @param o SHIP_DATE
     */
    public void setShipDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.shipDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.shipDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.shipDate = null;
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
     * MFG_SHIP_ORDER照会
     *
     * @param param1 SHIP_ORDER_NO
     * @return MFG_SHIP_ORDER
     */
    public static MfgShipOrder get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SHIP_ORDER_NO\") = TRIM (:ship_order_no)");

        String sql = "SELECT * FROM MFG_SHIP_ORDER WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ship_order_no", param1);

        return Queries.get(sql, params, MfgShipOrder.class);
    }

    /**
     * MFG_SHIP_ORDER追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SHIP_ORDER_NOの採番処理
        numbering();

        // MFG_SHIP_ORDERの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("ship_order_no -- :ship_order_no");
        nameList.add("child_plan_no -- :child_plan_no");
        nameList.add("hinban -- :hinban");
        nameList.add("ship_direct_counts -- :ship_direct_counts");
        nameList.add("ship_status -- :ship_status");
        nameList.add("ship_counts -- :ship_counts");
        nameList.add("ship_date -- :ship_date");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_SHIP_ORDER(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":ship_order_no");
        valueList.add(":child_plan_no");
        valueList.add(":hinban");
        valueList.add(":ship_direct_counts");
        valueList.add(":ship_status");
        valueList.add(":ship_counts");
        valueList.add("TO_TIMESTAMP (:ship_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** SHIP_ORDER_NOの採番処理 */
    private void numbering() {

        if (this.shipOrderNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SHIP_ORDER_NO) IS NULL THEN 0 ELSE MAX(e.SHIP_ORDER_NO) * 1 END + 1, 12, '0') AS SHIP_ORDER_NO FROM MFG_SHIP_ORDER e WHERE e.SHIP_ORDER_NO < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SHIP_ORDER_NO");

        this.setShipOrderNo(o);
    }

    /**
     * MFG_SHIP_ORDER更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_SHIP_ORDERの登録
        String sql = "UPDATE MFG_SHIP_ORDER\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("ship_order_no = :ship_order_no");
        setList.add("child_plan_no = :child_plan_no");
        setList.add("hinban = :hinban");
        setList.add("ship_direct_counts = :ship_direct_counts");
        setList.add("ship_status = :ship_status");
        setList.add("ship_counts = :ship_counts");
        setList.add("ship_date = TO_TIMESTAMP (:ship_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_SHIP_ORDER削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_SHIP_ORDERの削除
        String sql = "DELETE FROM MFG_SHIP_ORDER WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (ship_order_no) = TRIM (:ship_order_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SHIP_ORDER_NO", this.shipOrderNo);
        params.put("CHILD_PLAN_NO", this.childPlanNo);
        params.put("HINBAN", this.hinban);
        params.put("SHIP_DIRECT_COUNTS", this.shipDirectCounts);
        params.put("SHIP_STATUS", this.shipStatus);
        params.put("SHIP_COUNTS", this.shipCounts);
        params.put("SHIP_DATE", this.shipDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
