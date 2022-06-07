package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_KANBAN_STATUS
 *
 * @author emarfkrow
 */
public class MfgKanbanStatus implements IEntity {

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

    /** KANBAN_PRINT_STATUS */
    private java.math.BigDecimal kanbanPrintStatus;

    /**
     * @return KANBAN_PRINT_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANBAN_PRINT_STATUS")
    public java.math.BigDecimal getKanbanPrintStatus() {
        return this.kanbanPrintStatus;
    }

    /**
     * @param o KANBAN_PRINT_STATUS
     */
    public void setKanbanPrintStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanPrintStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.kanbanPrintStatus = null;
        }
    }

    /** KANBAN_STATUS */
    private java.math.BigDecimal kanbanStatus;

    /**
     * @return KANBAN_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANBAN_STATUS")
    public java.math.BigDecimal getKanbanStatus() {
        return this.kanbanStatus;
    }

    /**
     * @param o KANBAN_STATUS
     */
    public void setKanbanStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.kanbanStatus = null;
        }
    }

    /** RE_ISSUE_COUNTS */
    private java.math.BigDecimal reIssueCounts;

    /**
     * @return RE_ISSUE_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RE_ISSUE_COUNTS")
    public java.math.BigDecimal getReIssueCounts() {
        return this.reIssueCounts;
    }

    /**
     * @param o RE_ISSUE_COUNTS
     */
    public void setReIssueCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reIssueCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.reIssueCounts = null;
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

    /**
     * MFG_KANBAN_STATUS照会
     *
     * @param param1 KANBAN_ID
     * @param param2 SERIAL_NO
     * @return MFG_KANBAN_STATUS
     */
    public static MfgKanbanStatus get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"KANBAN_ID\") = TRIM (:kanban_id)");
        whereList.add("\"SERIAL_NO\" = :serial_no");

        String sql = "SELECT * FROM MFG_KANBAN_STATUS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", param1);
        params.put("serial_no", param2);

        return Queries.get(sql, params, MfgKanbanStatus.class);
    }

    /**
     * MFG_KANBAN_STATUS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_KANBAN_MENTE_HISTORYの登録
        if (this.prdKanbanMenteHistory != null) {
            this.prdKanbanMenteHistory.setKanbanId(this.getKanbanId());
            this.prdKanbanMenteHistory.setSerialNo(this.getSerialNo());
            this.prdKanbanMenteHistory.insert(now, id);
        }

        // MFG_KANBAN_STATUSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"KANBAN_ID\" -- :kanban_id");
        nameList.add("\"SERIAL_NO\" -- :serial_no");
        nameList.add("\"KANBAN_PRINT_STATUS\" -- :kanban_print_status");
        nameList.add("\"KANBAN_STATUS\" -- :kanban_status");
        nameList.add("\"RE_ISSUE_COUNTS\" -- :re_issue_counts");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_KANBAN_STATUS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kanban_id");
        valueList.add(":serial_no");
        valueList.add(":kanban_print_status");
        valueList.add(":kanban_status");
        valueList.add(":re_issue_counts");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_KANBAN_STATUS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_KANBAN_MENTE_HISTORYの登録
        if (this.prdKanbanMenteHistory != null) {
            prdKanbanMenteHistory.setKanbanId(this.getKanbanId());
            prdKanbanMenteHistory.setSerialNo(this.getSerialNo());
            try {
                prdKanbanMenteHistory.insert(now, id);
            } catch (Exception e) {
                prdKanbanMenteHistory.update(now, id);
            }
        }

        // MFG_KANBAN_STATUSの登録
        String sql = "UPDATE MFG_KANBAN_STATUS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"KANBAN_ID\" = :kanban_id");
        setList.add("\"SERIAL_NO\" = :serial_no");
        setList.add("\"KANBAN_PRINT_STATUS\" = :kanban_print_status");
        setList.add("\"KANBAN_STATUS\" = :kanban_status");
        setList.add("\"RE_ISSUE_COUNTS\" = :re_issue_counts");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_KANBAN_STATUS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_KANBAN_MENTE_HISTORYの削除
        if (this.prdKanbanMenteHistory != null) {
            this.prdKanbanMenteHistory.delete();
        }

        // MFG_KANBAN_STATUSの削除
        String sql = "DELETE FROM MFG_KANBAN_STATUS WHERE " + getWhere();

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
        params.put("kanban_print_status", this.kanbanPrintStatus);
        params.put("kanban_status", this.kanbanStatus);
        params.put("re_issue_counts", this.reIssueCounts);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_KANBAN_MENTE_HISTORY
     */
    private PrdKanbanMenteHistory prdKanbanMenteHistory;

    /**
     * @return PRD_KANBAN_MENTE_HISTORY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdKanbanMenteHistory")
    public PrdKanbanMenteHistory getPrdKanbanMenteHistory() {
        return this.prdKanbanMenteHistory;
    }

    /**
     * @param p PRD_KANBAN_MENTE_HISTORY
     */
    public void setPrdKanbanMenteHistory(final PrdKanbanMenteHistory p) {
        this.prdKanbanMenteHistory = p;
    }

    /**
     * @return PRD_KANBAN_MENTE_HISTORY
     */
    public PrdKanbanMenteHistory referPrdKanbanMenteHistory() {
        if (this.prdKanbanMenteHistory == null) {
            try {
                this.prdKanbanMenteHistory = PrdKanbanMenteHistory.get(this.kanbanId, this.serialNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdKanbanMenteHistory;
    }
}
