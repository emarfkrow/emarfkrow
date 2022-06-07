package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_ORDERPOINT_CONDITION
 *
 * @author emarfkrow
 */
public class PrdOrderpointCondition implements IEntity {

    /** REC_NO */
    private String recNo;

    /**
     * @return REC_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REC_NO")
    public String getRecNo() {
        return this.recNo;
    }

    /**
     * @param o REC_NO
     */
    public void setRecNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.recNo = String.valueOf(o.toString());
        } else {
            this.recNo = null;
        }
    }

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YYYY")
    public String getYyyy() {
        return this.yyyy;
    }

    /**
     * @param o YYYY
     */
    public void setYyyy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yyyy = String.valueOf(o.toString());
        } else {
            this.yyyy = null;
        }
    }

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MM")
    public String getMm() {
        return this.mm;
    }

    /**
     * @param o MM
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = String.valueOf(o.toString());
        } else {
            this.mm = null;
        }
    }

    /** OPE_DAYS */
    private java.math.BigDecimal opeDays;

    /**
     * @return OPE_DAYS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_DAYS")
    public java.math.BigDecimal getOpeDays() {
        return this.opeDays;
    }

    /**
     * @param o OPE_DAYS
     */
    public void setOpeDays(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeDays = new java.math.BigDecimal(o.toString());
        } else {
            this.opeDays = null;
        }
    }

    /** LAST_PROCESS_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime lastProcessDate;

    /**
     * @return LAST_PROCESS_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LAST_PROCESS_DATE")
    public java.time.LocalDateTime getLastProcessDate() {
        return this.lastProcessDate;
    }

    /**
     * @param o LAST_PROCESS_DATE
     */
    public void setLastProcessDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.lastProcessDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.lastProcessDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastProcessDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.lastProcessDate = null;
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
     * PRD_ORDERPOINT_CONDITION照会
     *
     * @param param1 REC_NO
     * @return PRD_ORDERPOINT_CONDITION
     */
    public static PrdOrderpointCondition get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"REC_NO\") = TRIM (:rec_no)");

        String sql = "SELECT * FROM PRD_ORDERPOINT_CONDITION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rec_no", param1);

        return Queries.get(sql, params, PrdOrderpointCondition.class);
    }

    /**
     * PRD_ORDERPOINT_CONDITION追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // REC_NOの採番処理
        numbering();

        // PRD_PRE_STATUS_HEADの登録
        if (this.prdPreStatusHead != null) {
            this.prdPreStatusHead.setRecNo(this.getRecNo());
            this.prdPreStatusHead.insert(now, id);
        }

        // SYS_CLOSE_STATUSの登録
        if (this.sysCloseStatus != null) {
            this.sysCloseStatus.setRecNo(this.getRecNo());
            this.sysCloseStatus.insert(now, id);
        }

        // PRD_ORDERPOINT_CONDITIONの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"REC_NO\" -- :rec_no");
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"OPE_DAYS\" -- :ope_days");
        nameList.add("\"LAST_PROCESS_DATE\" -- :last_process_date");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_ORDERPOINT_CONDITION(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":rec_no");
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":ope_days");
        valueList.add("TO_TIMESTAMP (:last_process_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** REC_NOの採番処理 */
    private void numbering() {

        if (this.recNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"REC_NO\") IS NULL THEN 0 ELSE MAX(e.\"REC_NO\") * 1 END + 1, 3, '0') AS \"REC_NO\" FROM PRD_ORDERPOINT_CONDITION e WHERE e.\"REC_NO\" < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("REC_NO");

        this.setRecNo(o);
    }

    /**
     * PRD_ORDERPOINT_CONDITION更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_PRE_STATUS_HEADの登録
        if (this.prdPreStatusHead != null) {
            prdPreStatusHead.setRecNo(this.getRecNo());
            try {
                prdPreStatusHead.insert(now, id);
            } catch (Exception e) {
                prdPreStatusHead.update(now, id);
            }
        }

        // SYS_CLOSE_STATUSの登録
        if (this.sysCloseStatus != null) {
            sysCloseStatus.setRecNo(this.getRecNo());
            try {
                sysCloseStatus.insert(now, id);
            } catch (Exception e) {
                sysCloseStatus.update(now, id);
            }
        }

        // PRD_ORDERPOINT_CONDITIONの登録
        String sql = "UPDATE PRD_ORDERPOINT_CONDITION\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"REC_NO\" = :rec_no");
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"OPE_DAYS\" = :ope_days");
        setList.add("\"LAST_PROCESS_DATE\" = TO_TIMESTAMP (:last_process_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_ORDERPOINT_CONDITION削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_PRE_STATUS_HEADの削除
        if (this.prdPreStatusHead != null) {
            this.prdPreStatusHead.delete();
        }

        // SYS_CLOSE_STATUSの削除
        if (this.sysCloseStatus != null) {
            this.sysCloseStatus.delete();
        }

        // PRD_ORDERPOINT_CONDITIONの削除
        String sql = "DELETE FROM PRD_ORDERPOINT_CONDITION WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"REC_NO\") = TRIM (:rec_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rec_no", this.recNo);
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("ope_days", this.opeDays);
        params.put("last_process_date", this.lastProcessDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_PRE_STATUS_HEAD
     */
    private PrdPreStatusHead prdPreStatusHead;

    /**
     * @return PRD_PRE_STATUS_HEAD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdPreStatusHead")
    public PrdPreStatusHead getPrdPreStatusHead() {
        return this.prdPreStatusHead;
    }

    /**
     * @param p PRD_PRE_STATUS_HEAD
     */
    public void setPrdPreStatusHead(final PrdPreStatusHead p) {
        this.prdPreStatusHead = p;
    }

    /**
     * @return PRD_PRE_STATUS_HEAD
     */
    public PrdPreStatusHead referPrdPreStatusHead() {
        if (this.prdPreStatusHead == null) {
            try {
                this.prdPreStatusHead = PrdPreStatusHead.get(this.recNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdPreStatusHead;
    }

    /**
     * SYS_CLOSE_STATUS
     */
    private SysCloseStatus sysCloseStatus;

    /**
     * @return SYS_CLOSE_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SysCloseStatus")
    public SysCloseStatus getSysCloseStatus() {
        return this.sysCloseStatus;
    }

    /**
     * @param p SYS_CLOSE_STATUS
     */
    public void setSysCloseStatus(final SysCloseStatus p) {
        this.sysCloseStatus = p;
    }

    /**
     * @return SYS_CLOSE_STATUS
     */
    public SysCloseStatus referSysCloseStatus() {
        if (this.sysCloseStatus == null) {
            try {
                this.sysCloseStatus = SysCloseStatus.get(this.recNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.sysCloseStatus;
    }
}
