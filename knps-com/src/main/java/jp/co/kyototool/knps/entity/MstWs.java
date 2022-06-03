package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_WS
 *
 * @author emarfkrow
 */
public class MstWs implements IEntity {

    /** WS_CODE */
    private String wsCode;

    /**
     * @return WS_CODE
     */
    public String getWsCode() {
        return this.wsCode;
    }

    /**
     * @param o WS_CODE
     */
    public void setWsCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wsCode = String.valueOf(o.toString());
        } else {
            this.wsCode = null;
        }
    }

    /** WS_NAME */
    private String wsName;

    /**
     * @return WS_NAME
     */
    public String getWsName() {
        return this.wsName;
    }

    /**
     * @param o WS_NAME
     */
    public void setWsName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wsName = String.valueOf(o.toString());
        } else {
            this.wsName = null;
        }
    }

    /** IN_OUT_KBN */
    private java.math.BigDecimal inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    public java.math.BigDecimal getInOutKbn() {
        return this.inOutKbn;
    }

    /**
     * @param o IN_OUT_KBN
     */
    public void setInOutKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.inOutKbn = null;
        }
    }

    /** HUM_NORM_ABILITY */
    private java.math.BigDecimal humNormAbility;

    /**
     * @return HUM_NORM_ABILITY
     */
    public java.math.BigDecimal getHumNormAbility() {
        return this.humNormAbility;
    }

    /**
     * @param o HUM_NORM_ABILITY
     */
    public void setHumNormAbility(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humNormAbility = new java.math.BigDecimal(o.toString());
        } else {
            this.humNormAbility = null;
        }
    }

    /** HUM_MAX_ABILITY */
    private java.math.BigDecimal humMaxAbility;

    /**
     * @return HUM_MAX_ABILITY
     */
    public java.math.BigDecimal getHumMaxAbility() {
        return this.humMaxAbility;
    }

    /**
     * @param o HUM_MAX_ABILITY
     */
    public void setHumMaxAbility(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humMaxAbility = new java.math.BigDecimal(o.toString());
        } else {
            this.humMaxAbility = null;
        }
    }

    /** NORM_MEMBER */
    private java.math.BigDecimal normMember;

    /**
     * @return NORM_MEMBER
     */
    public java.math.BigDecimal getNormMember() {
        return this.normMember;
    }

    /**
     * @param o NORM_MEMBER
     */
    public void setNormMember(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normMember = new java.math.BigDecimal(o.toString());
        } else {
            this.normMember = null;
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

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return this.supCode;
    }

    /**
     * @param o SUP_CODE
     */
    public void setSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supCode = String.valueOf(o.toString());
        } else {
            this.supCode = null;
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
     * MST_WS照会
     *
     * @param param1 WS_CODE
     * @return MST_WS
     */
    public static MstWs get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"WS_CODE\") = TRIM (:ws_code)");

        String sql = "SELECT * FROM MST_WS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ws_code", param1);

        return Queries.get(sql, params, MstWs.class);
    }

    /**
     * MST_WS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // WS_CODEの採番処理
        numbering();

        // MST_WSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("ws_code -- :ws_code");
        nameList.add("ws_name -- :ws_name");
        nameList.add("in_out_kbn -- :in_out_kbn");
        nameList.add("hum_norm_ability -- :hum_norm_ability");
        nameList.add("hum_max_ability -- :hum_max_ability");
        nameList.add("norm_member -- :norm_member");
        nameList.add("admin_code -- :admin_code");
        nameList.add("team_code -- :team_code");
        nameList.add("sup_code -- :sup_code");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_WS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":ws_code");
        valueList.add(":ws_name");
        valueList.add(":in_out_kbn");
        valueList.add(":hum_norm_ability");
        valueList.add(":hum_max_ability");
        valueList.add(":norm_member");
        valueList.add(":admin_code");
        valueList.add(":team_code");
        valueList.add(":sup_code");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** WS_CODEの採番処理 */
    private void numbering() {

        if (this.wsCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.WS_CODE) IS NULL THEN 0 ELSE MAX(e.WS_CODE) * 1 END + 1, 4, '0') AS WS_CODE FROM MST_WS e WHERE e.WS_CODE < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("WS_CODE");

        this.setWsCode(o);
    }

    /**
     * MST_WS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_WSの登録
        String sql = "UPDATE MST_WS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("ws_code = :ws_code");
        setList.add("ws_name = :ws_name");
        setList.add("in_out_kbn = :in_out_kbn");
        setList.add("hum_norm_ability = :hum_norm_ability");
        setList.add("hum_max_ability = :hum_max_ability");
        setList.add("norm_member = :norm_member");
        setList.add("admin_code = :admin_code");
        setList.add("team_code = :team_code");
        setList.add("sup_code = :sup_code");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_WS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_WSの削除
        String sql = "DELETE FROM MST_WS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (ws_code) = TRIM (:ws_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("WS_CODE", this.wsCode);
        params.put("WS_NAME", this.wsName);
        params.put("IN_OUT_KBN", this.inOutKbn);
        params.put("HUM_NORM_ABILITY", this.humNormAbility);
        params.put("HUM_MAX_ABILITY", this.humMaxAbility);
        params.put("NORM_MEMBER", this.normMember);
        params.put("ADMIN_CODE", this.adminCode);
        params.put("TEAM_CODE", this.teamCode);
        params.put("SUP_CODE", this.supCode);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
