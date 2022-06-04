package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_KANBAN_MENTE_HISTORY
 *
 * @author emarfkrow
 */
public class PrdKanbanMenteHistory implements IEntity {

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

    /** PRINT_OUT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime printOutDate;

    /**
     * @return PRINT_OUT_DATE
     */
    public java.time.LocalDateTime getPrintOutDate() {
        return this.printOutDate;
    }

    /**
     * @param o PRINT_OUT_DATE
     */
    public void setPrintOutDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.printOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.printOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printOutDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.printOutDate = null;
        }
    }

    /** PRINT_OUT_OPERATOR */
    private String printOutOperator;

    /**
     * @return PRINT_OUT_OPERATOR
     */
    public String getPrintOutOperator() {
        return this.printOutOperator;
    }

    /**
     * @param o PRINT_OUT_OPERATOR
     */
    public void setPrintOutOperator(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printOutOperator = String.valueOf(o.toString());
        } else {
            this.printOutOperator = null;
        }
    }

    /** SCRAP_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime scrapDate;

    /**
     * @return SCRAP_DATE
     */
    public java.time.LocalDateTime getScrapDate() {
        return this.scrapDate;
    }

    /**
     * @param o SCRAP_DATE
     */
    public void setScrapDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.scrapDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.scrapDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.scrapDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.scrapDate = null;
        }
    }

    /** SCRAP_OPERATOR */
    private String scrapOperator;

    /**
     * @return SCRAP_OPERATOR
     */
    public String getScrapOperator() {
        return this.scrapOperator;
    }

    /**
     * @param o SCRAP_OPERATOR
     */
    public void setScrapOperator(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.scrapOperator = String.valueOf(o.toString());
        } else {
            this.scrapOperator = null;
        }
    }

    /** LOST_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime lostDate;

    /**
     * @return LOST_DATE
     */
    public java.time.LocalDateTime getLostDate() {
        return this.lostDate;
    }

    /**
     * @param o LOST_DATE
     */
    public void setLostDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.lostDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.lostDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lostDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.lostDate = null;
        }
    }

    /** LOST_OPERATOR */
    private String lostOperator;

    /**
     * @return LOST_OPERATOR
     */
    public String getLostOperator() {
        return this.lostOperator;
    }

    /**
     * @param o LOST_OPERATOR
     */
    public void setLostOperator(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lostOperator = String.valueOf(o.toString());
        } else {
            this.lostOperator = null;
        }
    }

    /** LOST_REQ */
    private String lostReq;

    /**
     * @return LOST_REQ
     */
    public String getLostReq() {
        return this.lostReq;
    }

    /**
     * @param o LOST_REQ
     */
    public void setLostReq(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lostReq = String.valueOf(o.toString());
        } else {
            this.lostReq = null;
        }
    }

    /** LOST_REASON */
    private String lostReason;

    /**
     * @return LOST_REASON
     */
    public String getLostReason() {
        return this.lostReason;
    }

    /**
     * @param o LOST_REASON
     */
    public void setLostReason(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lostReason = String.valueOf(o.toString());
        } else {
            this.lostReason = null;
        }
    }

    /** LOSS_SCRAP_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime lossScrapDate;

    /**
     * @return LOSS_SCRAP_DATE
     */
    public java.time.LocalDateTime getLossScrapDate() {
        return this.lossScrapDate;
    }

    /**
     * @param o LOSS_SCRAP_DATE
     */
    public void setLossScrapDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.lossScrapDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.lossScrapDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lossScrapDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.lossScrapDate = null;
        }
    }

    /** LOSS_SCRAP_OPERATOR */
    private String lossScrapOperator;

    /**
     * @return LOSS_SCRAP_OPERATOR
     */
    public String getLossScrapOperator() {
        return this.lossScrapOperator;
    }

    /**
     * @param o LOSS_SCRAP_OPERATOR
     */
    public void setLossScrapOperator(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lossScrapOperator = String.valueOf(o.toString());
        } else {
            this.lossScrapOperator = null;
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
     * PRD_KANBAN_MENTE_HISTORY照会
     *
     * @param param1 KANBAN_ID
     * @param param2 SERIAL_NO
     * @return PRD_KANBAN_MENTE_HISTORY
     */
    public static PrdKanbanMenteHistory get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"KANBAN_ID\") = TRIM (:kanban_id)");
        whereList.add("\"SERIAL_NO\" = :serial_no");

        String sql = "SELECT * FROM PRD_KANBAN_MENTE_HISTORY WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", param1);
        params.put("serial_no", param2);

        return Queries.get(sql, params, PrdKanbanMenteHistory.class);
    }

    /**
     * PRD_KANBAN_MENTE_HISTORY追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_KANBAN_MENTE_HISTORYの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"KANBAN_ID\" -- :kanban_id");
        nameList.add("\"SERIAL_NO\" -- :serial_no");
        nameList.add("\"PRINT_OUT_DATE\" -- :print_out_date");
        nameList.add("\"PRINT_OUT_OPERATOR\" -- :print_out_operator");
        nameList.add("\"SCRAP_DATE\" -- :scrap_date");
        nameList.add("\"SCRAP_OPERATOR\" -- :scrap_operator");
        nameList.add("\"LOST_DATE\" -- :lost_date");
        nameList.add("\"LOST_OPERATOR\" -- :lost_operator");
        nameList.add("\"LOST_REQ\" -- :lost_req");
        nameList.add("\"LOST_REASON\" -- :lost_reason");
        nameList.add("\"LOSS_SCRAP_DATE\" -- :loss_scrap_date");
        nameList.add("\"LOSS_SCRAP_OPERATOR\" -- :loss_scrap_operator");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_KANBAN_MENTE_HISTORY(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kanban_id");
        valueList.add(":serial_no");
        valueList.add("TO_TIMESTAMP (:print_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":print_out_operator");
        valueList.add("TO_TIMESTAMP (:scrap_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":scrap_operator");
        valueList.add("TO_TIMESTAMP (:lost_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":lost_operator");
        valueList.add(":lost_req");
        valueList.add(":lost_reason");
        valueList.add("TO_TIMESTAMP (:loss_scrap_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":loss_scrap_operator");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_KANBAN_MENTE_HISTORY更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_KANBAN_MENTE_HISTORYの登録
        String sql = "UPDATE PRD_KANBAN_MENTE_HISTORY\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"KANBAN_ID\" = :kanban_id");
        setList.add("\"SERIAL_NO\" = :serial_no");
        setList.add("\"PRINT_OUT_DATE\" = TO_TIMESTAMP (:print_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"PRINT_OUT_OPERATOR\" = :print_out_operator");
        setList.add("\"SCRAP_DATE\" = TO_TIMESTAMP (:scrap_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"SCRAP_OPERATOR\" = :scrap_operator");
        setList.add("\"LOST_DATE\" = TO_TIMESTAMP (:lost_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"LOST_OPERATOR\" = :lost_operator");
        setList.add("\"LOST_REQ\" = :lost_req");
        setList.add("\"LOST_REASON\" = :lost_reason");
        setList.add("\"LOSS_SCRAP_DATE\" = TO_TIMESTAMP (:loss_scrap_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"LOSS_SCRAP_OPERATOR\" = :loss_scrap_operator");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_KANBAN_MENTE_HISTORY削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_KANBAN_MENTE_HISTORYの削除
        String sql = "DELETE FROM PRD_KANBAN_MENTE_HISTORY WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"KANBAN_ID\") = TRIM (:kanban_id)");
        whereList.add("\"SERIAL_NO\" = :serial_no");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", this.kanbanId);
        params.put("serial_no", this.serialNo);
        params.put("print_out_date", this.printOutDate);
        params.put("print_out_operator", this.printOutOperator);
        params.put("scrap_date", this.scrapDate);
        params.put("scrap_operator", this.scrapOperator);
        params.put("lost_date", this.lostDate);
        params.put("lost_operator", this.lostOperator);
        params.put("lost_req", this.lostReq);
        params.put("lost_reason", this.lostReason);
        params.put("loss_scrap_date", this.lossScrapDate);
        params.put("loss_scrap_operator", this.lossScrapOperator);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
