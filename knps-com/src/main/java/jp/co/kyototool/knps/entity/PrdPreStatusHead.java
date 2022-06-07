package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_PRE_STATUS_HEAD
 *
 * @author emarfkrow
 */
public class PrdPreStatusHead implements IEntity {

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

    /** CURRENT_YEAR_Y */
    private String currentYearY;

    /**
     * @return CURRENT_YEAR_Y
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CURRENT_YEAR_Y")
    public String getCurrentYearY() {
        return this.currentYearY;
    }

    /**
     * @param o CURRENT_YEAR_Y
     */
    public void setCurrentYearY(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.currentYearY = String.valueOf(o.toString());
        } else {
            this.currentYearY = null;
        }
    }

    /** CURRENT_YEAR_M */
    private String currentYearM;

    /**
     * @return CURRENT_YEAR_M
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CURRENT_YEAR_M")
    public String getCurrentYearM() {
        return this.currentYearM;
    }

    /**
     * @param o CURRENT_YEAR_M
     */
    public void setCurrentYearM(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.currentYearM = String.valueOf(o.toString());
        } else {
            this.currentYearM = null;
        }
    }

    /** CURRENT_MONTH_M */
    private String currentMonthM;

    /**
     * @return CURRENT_MONTH_M
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CURRENT_MONTH_M")
    public String getCurrentMonthM() {
        return this.currentMonthM;
    }

    /**
     * @param o CURRENT_MONTH_M
     */
    public void setCurrentMonthM(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.currentMonthM = String.valueOf(o.toString());
        } else {
            this.currentMonthM = null;
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
     * PRD_PRE_STATUS_HEAD照会
     *
     * @param param1 REC_NO
     * @return PRD_PRE_STATUS_HEAD
     */
    public static PrdPreStatusHead get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"REC_NO\") = TRIM (:rec_no)");

        String sql = "SELECT * FROM PRD_PRE_STATUS_HEAD WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rec_no", param1);

        return Queries.get(sql, params, PrdPreStatusHead.class);
    }

    /**
     * PRD_PRE_STATUS_HEAD追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // REC_NOの採番処理
        numbering();

        // SYS_CLOSE_STATUSの登録
        if (this.sysCloseStatus != null) {
            this.sysCloseStatus.setRecNo(this.getRecNo());
            this.sysCloseStatus.insert(now, id);
        }

        // PRD_PRE_STATUS_HEADの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"REC_NO\" -- :rec_no");
        nameList.add("\"CURRENT_YEAR_Y\" -- :current_year_y");
        nameList.add("\"CURRENT_YEAR_M\" -- :current_year_m");
        nameList.add("\"CURRENT_MONTH_M\" -- :current_month_m");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_PRE_STATUS_HEAD(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":rec_no");
        valueList.add(":current_year_y");
        valueList.add(":current_year_m");
        valueList.add(":current_month_m");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"REC_NO\") IS NULL THEN 0 ELSE MAX(e.\"REC_NO\") * 1 END + 1, 3, '0') AS \"REC_NO\" FROM PRD_PRE_STATUS_HEAD e WHERE e.\"REC_NO\" < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("REC_NO");

        this.setRecNo(o);
    }

    /**
     * PRD_PRE_STATUS_HEAD更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // SYS_CLOSE_STATUSの登録
        if (this.sysCloseStatus != null) {
            sysCloseStatus.setRecNo(this.getRecNo());
            try {
                sysCloseStatus.insert(now, id);
            } catch (Exception e) {
                sysCloseStatus.update(now, id);
            }
        }

        // PRD_PRE_STATUS_HEADの登録
        String sql = "UPDATE PRD_PRE_STATUS_HEAD\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"REC_NO\" = :rec_no");
        setList.add("\"CURRENT_YEAR_Y\" = :current_year_y");
        setList.add("\"CURRENT_YEAR_M\" = :current_year_m");
        setList.add("\"CURRENT_MONTH_M\" = :current_month_m");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_PRE_STATUS_HEAD削除
     *
     * @return 削除件数
     */
    public int delete() {

        // SYS_CLOSE_STATUSの削除
        if (this.sysCloseStatus != null) {
            this.sysCloseStatus.delete();
        }

        // PRD_PRE_STATUS_HEADの削除
        String sql = "DELETE FROM PRD_PRE_STATUS_HEAD WHERE " + getWhere();

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
        params.put("current_year_y", this.currentYearY);
        params.put("current_year_m", this.currentYearM);
        params.put("current_month_m", this.currentMonthM);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
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
