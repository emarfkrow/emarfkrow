package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_DAILY_PRO_PLAN_DETAIL
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanDetail implements IEntity {

    /** CHILD_PLAN_NO */
    private String childPlanNo;

    /**
     * @return CHILD_PLAN_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHILD_PLAN_NO")
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

    /** PARENT_PLAN_NO */
    private String parentPlanNo;

    /**
     * @return PARENT_PLAN_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PARENT_PLAN_NO")
    public String getParentPlanNo() {
        return this.parentPlanNo;
    }

    /**
     * @param o PARENT_PLAN_NO
     */
    public void setParentPlanNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.parentPlanNo = String.valueOf(o.toString());
        } else {
            this.parentPlanNo = null;
        }
    }

    /** PLAN_NO */
    private String planNo;

    /**
     * @return PLAN_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PLAN_NO")
    public String getPlanNo() {
        return this.planNo;
    }

    /**
     * @param o PLAN_NO
     */
    public void setPlanNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planNo = String.valueOf(o.toString());
        } else {
            this.planNo = null;
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

    /** LOT_SIZE */
    private java.math.BigDecimal lotSize;

    /**
     * @return LOT_SIZE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOT_SIZE")
    public java.math.BigDecimal getLotSize() {
        return this.lotSize;
    }

    /**
     * @param o LOT_SIZE
     */
    public void setLotSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lotSize = new java.math.BigDecimal(o.toString());
        } else {
            this.lotSize = null;
        }
    }

    /** LOT_SIZE_CHANGE */
    private java.math.BigDecimal lotSizeChange;

    /**
     * @return LOT_SIZE_CHANGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOT_SIZE_CHANGE")
    public java.math.BigDecimal getLotSizeChange() {
        return this.lotSizeChange;
    }

    /**
     * @param o LOT_SIZE_CHANGE
     */
    public void setLotSizeChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lotSizeChange = new java.math.BigDecimal(o.toString());
        } else {
            this.lotSizeChange = null;
        }
    }

    /** KANBAN_ID */
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANBAN_ID")
    public String getKanbanId() {
        return this.kanbanId;
    }

    /**
     * @param o KANBAN_ID
     */
    public void setKanbanId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanId = String.valueOf(o.toString());
        } else {
            this.kanbanId = null;
        }
    }

    /** SERIAL_NO */
    private java.math.BigDecimal serialNo;

    /**
     * @return SERIAL_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SERIAL_NO")
    public java.math.BigDecimal getSerialNo() {
        return this.serialNo;
    }

    /**
     * @param o SERIAL_NO
     */
    public void setSerialNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.serialNo = new java.math.BigDecimal(o.toString());
        } else {
            this.serialNo = null;
        }
    }

    /** ROUTING_COUNTS */
    private java.math.BigDecimal routingCounts;

    /**
     * @return ROUTING_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING_COUNTS")
    public java.math.BigDecimal getRoutingCounts() {
        return this.routingCounts;
    }

    /**
     * @param o ROUTING_COUNTS
     */
    public void setRoutingCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.routingCounts = null;
        }
    }

    /** PLAN_STATUS */
    private String planStatus;

    /**
     * @return PLAN_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PLAN_STATUS")
    public String getPlanStatus() {
        return this.planStatus;
    }

    /**
     * @param o PLAN_STATUS
     */
    public void setPlanStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planStatus = String.valueOf(o.toString());
        } else {
            this.planStatus = null;
        }
    }

    /** PRO_GROUP_NO */
    private java.math.BigDecimal proGroupNo;

    /**
     * @return PRO_GROUP_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_GROUP_NO")
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

    /** OUT_PLAN_TRANS */
    private java.math.BigDecimal outPlanTrans;

    /**
     * @return OUT_PLAN_TRANS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OUT_PLAN_TRANS")
    public java.math.BigDecimal getOutPlanTrans() {
        return this.outPlanTrans;
    }

    /**
     * @param o OUT_PLAN_TRANS
     */
    public void setOutPlanTrans(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.outPlanTrans = new java.math.BigDecimal(o.toString());
        } else {
            this.outPlanTrans = null;
        }
    }

    /** BEG_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime begDate;

    /**
     * @return BEG_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BEG_DATE")
    public java.time.LocalDateTime getBegDate() {
        return this.begDate;
    }

    /**
     * @param o BEG_DATE
     */
    public void setBegDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.begDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.begDate = null;
        }
    }

    /** END_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime endDate;

    /**
     * @return END_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("END_DATE")
    public java.time.LocalDateTime getEndDate() {
        return this.endDate;
    }

    /**
     * @param o END_DATE
     */
    public void setEndDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.endDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.endDate = null;
        }
    }

    /** START_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime startDate;

    /**
     * @return START_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("START_DATE")
    public java.time.LocalDateTime getStartDate() {
        return this.startDate;
    }

    /**
     * @param o START_DATE
     */
    public void setStartDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.startDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.startDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.startDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.startDate = null;
        }
    }

    /** COMP_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime compDate;

    /**
     * @return COMP_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMP_DATE")
    public java.time.LocalDateTime getCompDate() {
        return this.compDate;
    }

    /**
     * @param o COMP_DATE
     */
    public void setCompDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.compDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.compDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.compDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.compDate = null;
        }
    }

    /** PCH_FLAG */
    private java.math.BigDecimal pchFlag = new java.math.BigDecimal(0);

    /**
     * @return PCH_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PCH_FLAG")
    public java.math.BigDecimal getPchFlag() {
        return this.pchFlag;
    }

    /**
     * @param o PCH_FLAG
     */
    public void setPchFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pchFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.pchFlag = null;
        }
    }

    /** PRINT_ORDER */
    private java.math.BigDecimal printOrder;

    /**
     * @return PRINT_ORDER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_ORDER")
    public java.math.BigDecimal getPrintOrder() {
        return this.printOrder;
    }

    /**
     * @param o PRINT_ORDER
     */
    public void setPrintOrder(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printOrder = new java.math.BigDecimal(o.toString());
        } else {
            this.printOrder = null;
        }
    }

    /** SHORT_NO */
    private java.math.BigDecimal shortNo;

    /**
     * @return SHORT_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHORT_NO")
    public java.math.BigDecimal getShortNo() {
        return this.shortNo;
    }

    /**
     * @param o SHORT_NO
     */
    public void setShortNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shortNo = new java.math.BigDecimal(o.toString());
        } else {
            this.shortNo = null;
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
     * PRD_DAILY_PRO_PLAN_DETAIL照会
     *
     * @param param1 CHILD_PLAN_NO
     * @return PRD_DAILY_PRO_PLAN_DETAIL
     */
    public static PrdDailyProPlanDetail get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"CHILD_PLAN_NO\") = TRIM (:child_plan_no)");

        String sql = "SELECT * FROM PRD_DAILY_PRO_PLAN_DETAIL WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("child_plan_no", param1);

        return Queries.get(sql, params, PrdDailyProPlanDetail.class);
    }

    /**
     * PRD_DAILY_PRO_PLAN_DETAIL追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // CHILD_PLAN_NOの採番処理
        numbering();

        // PRD_DAILY_PRO_PLAN_DETAILの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"CHILD_PLAN_NO\" -- :child_plan_no");
        nameList.add("\"PARENT_PLAN_NO\" -- :parent_plan_no");
        nameList.add("\"PLAN_NO\" -- :plan_no");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"LOT_SIZE\" -- :lot_size");
        nameList.add("\"LOT_SIZE_CHANGE\" -- :lot_size_change");
        nameList.add("\"KANBAN_ID\" -- :kanban_id");
        nameList.add("\"SERIAL_NO\" -- :serial_no");
        nameList.add("\"ROUTING_COUNTS\" -- :routing_counts");
        nameList.add("\"PLAN_STATUS\" -- :plan_status");
        nameList.add("\"PRO_GROUP_NO\" -- :pro_group_no");
        nameList.add("\"OUT_PLAN_TRANS\" -- :out_plan_trans");
        nameList.add("\"BEG_DATE\" -- :beg_date");
        nameList.add("\"END_DATE\" -- :end_date");
        nameList.add("\"START_DATE\" -- :start_date");
        nameList.add("\"COMP_DATE\" -- :comp_date");
        nameList.add("\"PCH_FLAG\" -- :pch_flag");
        nameList.add("\"PRINT_ORDER\" -- :print_order");
        nameList.add("\"SHORT_NO\" -- :short_no");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_DAILY_PRO_PLAN_DETAIL(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":child_plan_no");
        valueList.add(":parent_plan_no");
        valueList.add(":plan_no");
        valueList.add(":hinban");
        valueList.add(":lot_size");
        valueList.add(":lot_size_change");
        valueList.add(":kanban_id");
        valueList.add(":serial_no");
        valueList.add(":routing_counts");
        valueList.add(":plan_status");
        valueList.add(":pro_group_no");
        valueList.add(":out_plan_trans");
        valueList.add("TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":pch_flag");
        valueList.add(":print_order");
        valueList.add(":short_no");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** CHILD_PLAN_NOの採番処理 */
    private void numbering() {

        if (this.childPlanNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"CHILD_PLAN_NO\") IS NULL THEN 0 ELSE MAX(e.\"CHILD_PLAN_NO\") * 1 END + 1, 12, '0') AS \"CHILD_PLAN_NO\" FROM PRD_DAILY_PRO_PLAN_DETAIL e WHERE e.\"CHILD_PLAN_NO\" < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("CHILD_PLAN_NO");

        this.setChildPlanNo(o);
    }

    /**
     * PRD_DAILY_PRO_PLAN_DETAIL更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_DAILY_PRO_PLAN_DETAILの登録
        String sql = "UPDATE PRD_DAILY_PRO_PLAN_DETAIL\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"CHILD_PLAN_NO\" = :child_plan_no");
        setList.add("\"PARENT_PLAN_NO\" = :parent_plan_no");
        setList.add("\"PLAN_NO\" = :plan_no");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"LOT_SIZE\" = :lot_size");
        setList.add("\"LOT_SIZE_CHANGE\" = :lot_size_change");
        setList.add("\"KANBAN_ID\" = :kanban_id");
        setList.add("\"SERIAL_NO\" = :serial_no");
        setList.add("\"ROUTING_COUNTS\" = :routing_counts");
        setList.add("\"PLAN_STATUS\" = :plan_status");
        setList.add("\"PRO_GROUP_NO\" = :pro_group_no");
        setList.add("\"OUT_PLAN_TRANS\" = :out_plan_trans");
        setList.add("\"BEG_DATE\" = TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"END_DATE\" = TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"START_DATE\" = TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"COMP_DATE\" = TO_TIMESTAMP (:comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"PCH_FLAG\" = :pch_flag");
        setList.add("\"PRINT_ORDER\" = :print_order");
        setList.add("\"SHORT_NO\" = :short_no");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_DAILY_PRO_PLAN_DETAIL削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_DAILY_PRO_PLAN_DETAILの削除
        String sql = "DELETE FROM PRD_DAILY_PRO_PLAN_DETAIL WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"CHILD_PLAN_NO\") = TRIM (:child_plan_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("child_plan_no", this.childPlanNo);
        params.put("parent_plan_no", this.parentPlanNo);
        params.put("plan_no", this.planNo);
        params.put("hinban", this.hinban);
        params.put("lot_size", this.lotSize);
        params.put("lot_size_change", this.lotSizeChange);
        params.put("kanban_id", this.kanbanId);
        params.put("serial_no", this.serialNo);
        params.put("routing_counts", this.routingCounts);
        params.put("plan_status", this.planStatus);
        params.put("pro_group_no", this.proGroupNo);
        params.put("out_plan_trans", this.outPlanTrans);
        params.put("beg_date", this.begDate);
        params.put("end_date", this.endDate);
        params.put("start_date", this.startDate);
        params.put("comp_date", this.compDate);
        params.put("pch_flag", this.pchFlag);
        params.put("print_order", this.printOrder);
        params.put("short_no", this.shortNo);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
