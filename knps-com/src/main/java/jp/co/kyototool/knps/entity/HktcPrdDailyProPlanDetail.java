package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * HKTC_PRD_DAILY_PRO_PLAN_DETAIL
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanDetail implements IEntity {

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

    /** PARENT_PLAN_NO */
    private String parentPlanNo;

    /**
     * @return PARENT_PLAN_NO
     */
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
    private java.math.BigDecimal pchFlag;

    /**
     * @return PCH_FLAG
     */
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

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_DETAIL照会
     *
     * @param param1 CHILD_PLAN_NO
     * @return HKTC_PRD_DAILY_PRO_PLAN_DETAIL
     */
    public static HktcPrdDailyProPlanDetail get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"CHILD_PLAN_NO\") = TRIM (:child_plan_no)");

        String sql = "SELECT * FROM HKTC_PRD_DAILY_PRO_PLAN_DETAIL WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("child_plan_no", param1);

        return Queries.get(sql, params, HktcPrdDailyProPlanDetail.class);
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_DETAIL追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // CHILD_PLAN_NOの採番処理
        numbering();

        // MFG_PRO_ACT_STATUSの登録
        if (this.mfgProActStatus != null) {
            this.mfgProActStatus.setChildPlanNo(this.getChildPlanNo());
            this.mfgProActStatus.insert(now, id);
        }

        // PRD_DAILY_PRO_PLAN_DETAILの登録
        if (this.prdDailyProPlanDetail != null) {
            this.prdDailyProPlanDetail.setChildPlanNo(this.getChildPlanNo());
            this.prdDailyProPlanDetail.insert(now, id);
        }

        // HKTC_PRD_DAILY_PRO_PLAN_DETAILの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("child_plan_no -- :child_plan_no");
        nameList.add("parent_plan_no -- :parent_plan_no");
        nameList.add("plan_no -- :plan_no");
        nameList.add("hinban -- :hinban");
        nameList.add("lot_size -- :lot_size");
        nameList.add("lot_size_change -- :lot_size_change");
        nameList.add("kanban_id -- :kanban_id");
        nameList.add("serial_no -- :serial_no");
        nameList.add("routing_counts -- :routing_counts");
        nameList.add("plan_status -- :plan_status");
        nameList.add("pro_group_no -- :pro_group_no");
        nameList.add("out_plan_trans -- :out_plan_trans");
        nameList.add("beg_date -- :beg_date");
        nameList.add("end_date -- :end_date");
        nameList.add("start_date -- :start_date");
        nameList.add("comp_date -- :comp_date");
        nameList.add("pch_flag -- :pch_flag");
        nameList.add("print_order -- :print_order");
        nameList.add("short_no -- :short_no");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO HKTC_PRD_DAILY_PRO_PLAN_DETAIL(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.CHILD_PLAN_NO) IS NULL THEN 0 ELSE MAX(e.CHILD_PLAN_NO) * 1 END + 1, 12, '0') AS CHILD_PLAN_NO FROM HKTC_PRD_DAILY_PRO_PLAN_DETAIL e WHERE e.CHILD_PLAN_NO < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("CHILD_PLAN_NO");

        this.setChildPlanNo(o);
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_DETAIL更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_PRO_ACT_STATUSの登録
        if (this.mfgProActStatus != null) {
            mfgProActStatus.setChildPlanNo(this.getChildPlanNo());
            try {
                mfgProActStatus.insert(now, id);
            } catch (Exception e) {
                mfgProActStatus.update(now, id);
            }
        }

        // PRD_DAILY_PRO_PLAN_DETAILの登録
        if (this.prdDailyProPlanDetail != null) {
            prdDailyProPlanDetail.setChildPlanNo(this.getChildPlanNo());
            try {
                prdDailyProPlanDetail.insert(now, id);
            } catch (Exception e) {
                prdDailyProPlanDetail.update(now, id);
            }
        }

        // HKTC_PRD_DAILY_PRO_PLAN_DETAILの登録
        String sql = "UPDATE HKTC_PRD_DAILY_PRO_PLAN_DETAIL\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("child_plan_no = :child_plan_no");
        setList.add("parent_plan_no = :parent_plan_no");
        setList.add("plan_no = :plan_no");
        setList.add("hinban = :hinban");
        setList.add("lot_size = :lot_size");
        setList.add("lot_size_change = :lot_size_change");
        setList.add("kanban_id = :kanban_id");
        setList.add("serial_no = :serial_no");
        setList.add("routing_counts = :routing_counts");
        setList.add("plan_status = :plan_status");
        setList.add("pro_group_no = :pro_group_no");
        setList.add("out_plan_trans = :out_plan_trans");
        setList.add("beg_date = TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("end_date = TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("start_date = TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("comp_date = TO_TIMESTAMP (:comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("pch_flag = :pch_flag");
        setList.add("print_order = :print_order");
        setList.add("short_no = :short_no");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * HKTC_PRD_DAILY_PRO_PLAN_DETAIL削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_PRO_ACT_STATUSの削除
        if (this.mfgProActStatus != null) {
            this.mfgProActStatus.delete();
        }

        // PRD_DAILY_PRO_PLAN_DETAILの削除
        if (this.prdDailyProPlanDetail != null) {
            this.prdDailyProPlanDetail.delete();
        }

        // HKTC_PRD_DAILY_PRO_PLAN_DETAILの削除
        String sql = "DELETE FROM HKTC_PRD_DAILY_PRO_PLAN_DETAIL WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (child_plan_no) = TRIM (:child_plan_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("CHILD_PLAN_NO", this.childPlanNo);
        params.put("PARENT_PLAN_NO", this.parentPlanNo);
        params.put("PLAN_NO", this.planNo);
        params.put("HINBAN", this.hinban);
        params.put("LOT_SIZE", this.lotSize);
        params.put("LOT_SIZE_CHANGE", this.lotSizeChange);
        params.put("KANBAN_ID", this.kanbanId);
        params.put("SERIAL_NO", this.serialNo);
        params.put("ROUTING_COUNTS", this.routingCounts);
        params.put("PLAN_STATUS", this.planStatus);
        params.put("PRO_GROUP_NO", this.proGroupNo);
        params.put("OUT_PLAN_TRANS", this.outPlanTrans);
        params.put("BEG_DATE", this.begDate);
        params.put("END_DATE", this.endDate);
        params.put("START_DATE", this.startDate);
        params.put("COMP_DATE", this.compDate);
        params.put("PCH_FLAG", this.pchFlag);
        params.put("PRINT_ORDER", this.printOrder);
        params.put("SHORT_NO", this.shortNo);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_PRO_ACT_STATUS
     */
    private MfgProActStatus mfgProActStatus;

    /**
     * @return MFG_PRO_ACT_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgProActStatus")
    public MfgProActStatus getMfgProActStatus() {
        return this.mfgProActStatus;
    }

    /**
     * @param p MFG_PRO_ACT_STATUS
     */
    public void setMfgProActStatus(final MfgProActStatus p) {
        this.mfgProActStatus = p;
    }

    /**
     * @return MFG_PRO_ACT_STATUS
     */
    public MfgProActStatus referMfgProActStatus() {
        if (this.mfgProActStatus == null) {
            try {
                this.mfgProActStatus = MfgProActStatus.get(this.childPlanNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mfgProActStatus;
    }

    /**
     * PRD_DAILY_PRO_PLAN_DETAIL
     */
    private PrdDailyProPlanDetail prdDailyProPlanDetail;

    /**
     * @return PRD_DAILY_PRO_PLAN_DETAIL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdDailyProPlanDetail")
    public PrdDailyProPlanDetail getPrdDailyProPlanDetail() {
        return this.prdDailyProPlanDetail;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN_DETAIL
     */
    public void setPrdDailyProPlanDetail(final PrdDailyProPlanDetail p) {
        this.prdDailyProPlanDetail = p;
    }

    /**
     * @return PRD_DAILY_PRO_PLAN_DETAIL
     */
    public PrdDailyProPlanDetail referPrdDailyProPlanDetail() {
        if (this.prdDailyProPlanDetail == null) {
            try {
                this.prdDailyProPlanDetail = PrdDailyProPlanDetail.get(this.childPlanNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdDailyProPlanDetail;
    }
}
