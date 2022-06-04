package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_TEAM
 *
 * @author emarfkrow
 */
public class MstTeam implements IEntity {

    /** TEAM_CODE */
    private String teamCode;

    /**
     * @return TEAM_CODE
     */
    public String getTeamCode() {
        return this.teamCode;
    }

    /**
     * @param o TEAM_CODE
     */
    public void setTeamCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.teamCode = String.valueOf(o.toString());
        } else {
            this.teamCode = null;
        }
    }

    /** TEAM_NAME */
    private String teamName;

    /**
     * @return TEAM_NAME
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @param o TEAM_NAME
     */
    public void setTeamName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.teamName = String.valueOf(o.toString());
        } else {
            this.teamName = null;
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
     * MST_TEAM照会
     *
     * @param param1 TEAM_CODE
     * @return MST_TEAM
     */
    public static MstTeam get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"TEAM_CODE\") = TRIM (:team_code)");

        String sql = "SELECT * FROM MST_TEAM WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("team_code", param1);

        return Queries.get(sql, params, MstTeam.class);
    }

    /**
     * MST_TEAM追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // TEAM_CODEの採番処理
        numbering();

        // MST_TEAMの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"TEAM_CODE\" -- :team_code");
        nameList.add("\"TEAM_NAME\" -- :team_name");
        nameList.add("\"ADMIN_CODE\" -- :admin_code");
        nameList.add("\"GROUP_CODE\" -- :group_code");
        nameList.add("\"INDIVIDUAL_COUNTS\" -- :individual_counts");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_TEAM(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":team_code");
        valueList.add(":team_name");
        valueList.add(":admin_code");
        valueList.add(":group_code");
        valueList.add(":individual_counts");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** TEAM_CODEの採番処理 */
    private void numbering() {

        if (this.teamCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"TEAM_CODE\") IS NULL THEN 0 ELSE MAX(e.\"TEAM_CODE\") * 1 END + 1, 10, '0') AS \"TEAM_CODE\" FROM MST_TEAM e WHERE e.\"TEAM_CODE\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("TEAM_CODE");

        this.setTeamCode(o);
    }

    /**
     * MST_TEAM更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_TEAMの登録
        String sql = "UPDATE MST_TEAM\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"TEAM_CODE\" = :team_code");
        setList.add("\"TEAM_NAME\" = :team_name");
        setList.add("\"ADMIN_CODE\" = :admin_code");
        setList.add("\"GROUP_CODE\" = :group_code");
        setList.add("\"INDIVIDUAL_COUNTS\" = :individual_counts");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_TEAM削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_TEAMの削除
        String sql = "DELETE FROM MST_TEAM WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"TEAM_CODE\") = TRIM (:team_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("team_code", this.teamCode);
        params.put("team_name", this.teamName);
        params.put("admin_code", this.adminCode);
        params.put("group_code", this.groupCode);
        params.put("individual_counts", this.individualCounts);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
