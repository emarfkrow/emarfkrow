package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_ROUTING_DEF_BK
 *
 * @author emarfkrow
 */
public class MstRoutingDefBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YY")
    public String getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = String.valueOf(o.toString());
        } else {
            this.yy = null;
        }
    }

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAN_HINBAN")
    public String getManHinban() {
        return this.manHinban;
    }

    /**
     * @param o MAN_HINBAN
     */
    public void setManHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.manHinban = String.valueOf(o.toString());
        } else {
            this.manHinban = null;
        }
    }

    /** ROUTING_GROUP */
    private java.math.BigDecimal routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING_GROUP")
    public java.math.BigDecimal getRoutingGroup() {
        return this.routingGroup;
    }

    /**
     * @param o ROUTING_GROUP
     */
    public void setRoutingGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.routingGroup = null;
        }
    }

    /** PERMISSION_FLAG */
    private java.math.BigDecimal permissionFlag = new java.math.BigDecimal(0);

    /**
     * @return PERMISSION_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PERMISSION_FLAG")
    public java.math.BigDecimal getPermissionFlag() {
        return this.permissionFlag;
    }

    /**
     * @param o PERMISSION_FLAG
     */
    public void setPermissionFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.permissionFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.permissionFlag = null;
        }
    }

    /** USABLE_FLAG */
    private java.math.BigDecimal usableFlag = new java.math.BigDecimal(0);

    /**
     * @return USABLE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("USABLE_FLAG")
    public java.math.BigDecimal getUsableFlag() {
        return this.usableFlag;
    }

    /**
     * @param o USABLE_FLAG
     */
    public void setUsableFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.usableFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.usableFlag = null;
        }
    }

    /** MAX_ROUTING */
    private java.math.BigDecimal maxRouting;

    /**
     * @return MAX_ROUTING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAX_ROUTING")
    public java.math.BigDecimal getMaxRouting() {
        return this.maxRouting;
    }

    /**
     * @param o MAX_ROUTING
     */
    public void setMaxRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.maxRouting = new java.math.BigDecimal(o.toString());
        } else {
            this.maxRouting = null;
        }
    }

    /** COPY_SOURCE_GROUP */
    private java.math.BigDecimal copySourceGroup;

    /**
     * @return COPY_SOURCE_GROUP
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COPY_SOURCE_GROUP")
    public java.math.BigDecimal getCopySourceGroup() {
        return this.copySourceGroup;
    }

    /**
     * @param o COPY_SOURCE_GROUP
     */
    public void setCopySourceGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.copySourceGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.copySourceGroup = null;
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
     * MST_ROUTING_DEF_BK照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 YY
     * @return MST_ROUTING_DEF_BK
     */
    public static MstRoutingDefBk get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_ROUTING_DEF_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("yy", param3);

        return Queries.get(sql, params, MstRoutingDefBk.class);
    }

    /**
     * MST_ROUTING_DEF_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_ROUTING_DEF_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"MAN_HINBAN\" -- :man_hinban");
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"PERMISSION_FLAG\" -- :permission_flag");
        nameList.add("\"USABLE_FLAG\" -- :usable_flag");
        nameList.add("\"MAX_ROUTING\" -- :max_routing");
        nameList.add("\"COPY_SOURCE_GROUP\" -- :copy_source_group");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_ROUTING_DEF_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":man_hinban");
        valueList.add(":routing_group");
        valueList.add(":permission_flag");
        valueList.add(":usable_flag");
        valueList.add(":max_routing");
        valueList.add(":copy_source_group");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM MST_ROUTING_DEF_BK e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"MAN_HINBAN\" = :man_hinban");
        whereList.add("e.\"ROUTING_GROUP\" = :routing_group");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("man_hinban", this.manHinban);
        params.put("routing_group", this.routingGroup);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_ROUTING_DEF_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_ROUTING_DEF_BKの登録
        String sql = "UPDATE MST_ROUTING_DEF_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"MAN_HINBAN\" = :man_hinban");
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"PERMISSION_FLAG\" = :permission_flag");
        setList.add("\"USABLE_FLAG\" = :usable_flag");
        setList.add("\"MAX_ROUTING\" = :max_routing");
        setList.add("\"COPY_SOURCE_GROUP\" = :copy_source_group");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_ROUTING_DEF_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_ROUTING_DEF_BKの削除
        String sql = "DELETE FROM MST_ROUTING_DEF_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("man_hinban", this.manHinban);
        params.put("routing_group", this.routingGroup);
        params.put("permission_flag", this.permissionFlag);
        params.put("usable_flag", this.usableFlag);
        params.put("max_routing", this.maxRouting);
        params.put("copy_source_group", this.copySourceGroup);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
