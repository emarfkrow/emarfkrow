package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_GROUP
 *
 * @author emarfkrow
 */
public class MstGroup implements IEntity {

    /** GROUP_CODE */
    private String groupCode;

    /**
     * @return GROUP_CODE
     */
    public String getGroupCode() {
        return this.groupCode;
    }

    /**
     * @param o GROUP_CODE
     */
    public void setGroupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.groupCode = String.valueOf(o.toString());
        } else {
            this.groupCode = null;
        }
    }

    /** GROUP_NAME */
    private String groupName;

    /**
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @param o GROUP_NAME
     */
    public void setGroupName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.groupName = String.valueOf(o.toString());
        } else {
            this.groupName = null;
        }
    }

    /** ADMIN_CODE */
    private String adminCode;

    /**
     * @return ADMIN_CODE
     */
    public String getAdminCode() {
        return this.adminCode;
    }

    /**
     * @param o ADMIN_CODE
     */
    public void setAdminCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.adminCode = String.valueOf(o.toString());
        } else {
            this.adminCode = null;
        }
    }

    /** DIVISION_CODE */
    private String divisionCode;

    /**
     * @return DIVISION_CODE
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @param o DIVISION_CODE
     */
    public void setDivisionCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.divisionCode = String.valueOf(o.toString());
        } else {
            this.divisionCode = null;
        }
    }

    /** INDIVIDUAL_COUNTS */
    private java.math.BigDecimal individualCounts;

    /**
     * @return INDIVIDUAL_COUNTS
     */
    public java.math.BigDecimal getIndividualCounts() {
        return this.individualCounts;
    }

    /**
     * @param o INDIVIDUAL_COUNTS
     */
    public void setIndividualCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.individualCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.individualCounts = null;
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
     * MST_GROUP照会
     *
     * @param param1 GROUP_CODE
     * @return MST_GROUP
     */
    public static MstGroup get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"GROUP_CODE\") = TRIM (:group_code)");

        String sql = "SELECT * FROM MST_GROUP WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("group_code", param1);

        return Queries.get(sql, params, MstGroup.class);
    }

    /**
     * MST_GROUP追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // GROUP_CODEの採番処理
        numbering();

        // MST_GROUPの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("group_code -- :group_code");
        nameList.add("group_name -- :group_name");
        nameList.add("admin_code -- :admin_code");
        nameList.add("division_code -- :division_code");
        nameList.add("individual_counts -- :individual_counts");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_GROUP(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":group_code");
        valueList.add(":group_name");
        valueList.add(":admin_code");
        valueList.add(":division_code");
        valueList.add(":individual_counts");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** GROUP_CODEの採番処理 */
    private void numbering() {

        if (this.groupCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.GROUP_CODE) IS NULL THEN 0 ELSE MAX(e.GROUP_CODE) * 1 END + 1, 10, '0') AS GROUP_CODE FROM MST_GROUP e WHERE e.GROUP_CODE < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("GROUP_CODE");

        this.setGroupCode(o);
    }

    /**
     * MST_GROUP更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_GROUPの登録
        String sql = "UPDATE MST_GROUP\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("group_code = :group_code");
        setList.add("group_name = :group_name");
        setList.add("admin_code = :admin_code");
        setList.add("division_code = :division_code");
        setList.add("individual_counts = :individual_counts");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_GROUP削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_GROUPの削除
        String sql = "DELETE FROM MST_GROUP WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (group_code) = TRIM (:group_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("GROUP_CODE", this.groupCode);
        params.put("GROUP_NAME", this.groupName);
        params.put("ADMIN_CODE", this.adminCode);
        params.put("DIVISION_CODE", this.divisionCode);
        params.put("INDIVIDUAL_COUNTS", this.individualCounts);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
