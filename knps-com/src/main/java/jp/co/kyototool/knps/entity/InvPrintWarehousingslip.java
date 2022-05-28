package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_PRINT_WAREHOUSINGSLIP
 *
 * @author emarfkrow
 */
public class InvPrintWarehousingslip implements IEntity {

    /** EMP_CODE */
    private String empCode;

    /**
     * @return EMP_CODE
     */
    public String getEmpCode() {
        return this.empCode;
    }

    /**
     * @param o EMP_CODE
     */
    public void setEmpCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.empCode = String.valueOf(o.toString());
        } else {
            this.empCode = null;
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

    /** KANBAN_ACC_COUNTS */
    private java.math.BigDecimal kanbanAccCounts;

    /**
     * @return KANBAN_ACC_COUNTS
     */
    public java.math.BigDecimal getKanbanAccCounts() {
        return this.kanbanAccCounts;
    }

    /**
     * @param o KANBAN_ACC_COUNTS
     */
    public void setKanbanAccCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanAccCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.kanbanAccCounts = null;
        }
    }

    /** KANBAN_COUNTS */
    private java.math.BigDecimal kanbanCounts;

    /**
     * @return KANBAN_COUNTS
     */
    public java.math.BigDecimal getKanbanCounts() {
        return this.kanbanCounts;
    }

    /**
     * @param o KANBAN_COUNTS
     */
    public void setKanbanCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.kanbanCounts = null;
        }
    }

    /** HOST_N_KBN */
    private java.math.BigDecimal hostNKbn;

    /**
     * @return HOST_N_KBN
     */
    public java.math.BigDecimal getHostNKbn() {
        return this.hostNKbn;
    }

    /**
     * @param o HOST_N_KBN
     */
    public void setHostNKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hostNKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.hostNKbn = null;
        }
    }

    /** PRINT_KBN */
    private java.math.BigDecimal printKbn;

    /**
     * @return PRINT_KBN
     */
    public java.math.BigDecimal getPrintKbn() {
        return this.printKbn;
    }

    /**
     * @param o PRINT_KBN
     */
    public void setPrintKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.printKbn = null;
        }
    }

    /** REQ_ID */
    private String reqId;

    /**
     * @return REQ_ID
     */
    public String getReqId() {
        return this.reqId;
    }

    /**
     * @param o REQ_ID
     */
    public void setReqId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqId = String.valueOf(o.toString());
        } else {
            this.reqId = null;
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
     * INV_PRINT_WAREHOUSINGSLIP照会
     *
     * @param param1 HINBAN
     * @param param2 EMP_CODE
     * @return INV_PRINT_WAREHOUSINGSLIP
     */
    public static InvPrintWarehousingslip get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (emp_code) = TRIM (:emp_code)");

        String sql = "SELECT * FROM INV_PRINT_WAREHOUSINGSLIP WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("emp_code", param2);

        return Queries.get(sql, params, InvPrintWarehousingslip.class);
    }

    /**
     * INV_PRINT_WAREHOUSINGSLIP追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // EMP_CODEの採番処理
        numbering();

        // INV_PRINT_WAREHOUSINGSLIPの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("emp_code -- :emp_code");
        nameList.add("hinban -- :hinban");
        nameList.add("kanban_acc_counts -- :kanban_acc_counts");
        nameList.add("kanban_counts -- :kanban_counts");
        nameList.add("host_n_kbn -- :host_n_kbn");
        nameList.add("print_kbn -- :print_kbn");
        nameList.add("req_id -- :req_id");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_PRINT_WAREHOUSINGSLIP(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":emp_code");
        valueList.add(":hinban");
        valueList.add(":kanban_acc_counts");
        valueList.add(":kanban_counts");
        valueList.add(":host_n_kbn");
        valueList.add(":print_kbn");
        valueList.add(":req_id");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** EMP_CODEの採番処理 */
    private void numbering() {

        if (this.empCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.EMP_CODE) IS NULL THEN 0 ELSE MAX(e.EMP_CODE) * 1 END + 1, 10, '0') AS EMP_CODE FROM INV_PRINT_WAREHOUSINGSLIP e WHERE e.EMP_CODE < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.HINBAN = :hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hinban", this.hinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("EMP_CODE");

        this.setEmpCode(o);
    }

    /**
     * INV_PRINT_WAREHOUSINGSLIP更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_PRINT_WAREHOUSINGSLIPの登録
        String sql = "UPDATE INV_PRINT_WAREHOUSINGSLIP\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("emp_code = :emp_code");
        setList.add("hinban = :hinban");
        setList.add("kanban_acc_counts = :kanban_acc_counts");
        setList.add("kanban_counts = :kanban_counts");
        setList.add("host_n_kbn = :host_n_kbn");
        setList.add("print_kbn = :print_kbn");
        setList.add("req_id = :req_id");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_PRINT_WAREHOUSINGSLIP削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_PRINT_WAREHOUSINGSLIPの削除
        String sql = "DELETE FROM INV_PRINT_WAREHOUSINGSLIP WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (emp_code) = TRIM (:emp_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("EMP_CODE", this.empCode);
        params.put("HINBAN", this.hinban);
        params.put("KANBAN_ACC_COUNTS", this.kanbanAccCounts);
        params.put("KANBAN_COUNTS", this.kanbanCounts);
        params.put("HOST_N_KBN", this.hostNKbn);
        params.put("PRINT_KBN", this.printKbn);
        params.put("REQ_ID", this.reqId);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
