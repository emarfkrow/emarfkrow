package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_OPE_FORM
 *
 * @author emarfkrow
 */
public class MstOpeForm implements IEntity {

    /** PATTERN_NO */
    private String patternNo;

    /**
     * @return PATTERN_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PATTERN_NO")
    public String getPatternNo() {
        return this.patternNo;
    }

    /**
     * @param o PATTERN_NO
     */
    public void setPatternNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.patternNo = String.valueOf(o.toString());
        } else {
            this.patternNo = null;
        }
    }

    /** F_CHOKU_START */
    private String fChokuStart;

    /**
     * @return F_CHOKU_START
     */
    @com.fasterxml.jackson.annotation.JsonProperty("F_CHOKU_START")
    public String getFChokuStart() {
        return this.fChokuStart;
    }

    /**
     * @param o F_CHOKU_START
     */
    public void setFChokuStart(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fChokuStart = String.valueOf(o.toString());
        } else {
            this.fChokuStart = null;
        }
    }

    /** F_CHOKU_END */
    private String fChokuEnd;

    /**
     * @return F_CHOKU_END
     */
    @com.fasterxml.jackson.annotation.JsonProperty("F_CHOKU_END")
    public String getFChokuEnd() {
        return this.fChokuEnd;
    }

    /**
     * @param o F_CHOKU_END
     */
    public void setFChokuEnd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fChokuEnd = String.valueOf(o.toString());
        } else {
            this.fChokuEnd = null;
        }
    }

    /** F_CHOKU_START_DED */
    private String fChokuStartDed;

    /**
     * @return F_CHOKU_START_DED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("F_CHOKU_START_DED")
    public String getFChokuStartDed() {
        return this.fChokuStartDed;
    }

    /**
     * @param o F_CHOKU_START_DED
     */
    public void setFChokuStartDed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fChokuStartDed = String.valueOf(o.toString());
        } else {
            this.fChokuStartDed = null;
        }
    }

    /** F_CHOKU_END_DED */
    private String fChokuEndDed;

    /**
     * @return F_CHOKU_END_DED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("F_CHOKU_END_DED")
    public String getFChokuEndDed() {
        return this.fChokuEndDed;
    }

    /**
     * @param o F_CHOKU_END_DED
     */
    public void setFChokuEndDed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fChokuEndDed = String.valueOf(o.toString());
        } else {
            this.fChokuEndDed = null;
        }
    }

    /** S_CHOKU_START_DED */
    private String sChokuStartDed;

    /**
     * @return S_CHOKU_START_DED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("S_CHOKU_START_DED")
    public String getSChokuStartDed() {
        return this.sChokuStartDed;
    }

    /**
     * @param o S_CHOKU_START_DED
     */
    public void setSChokuStartDed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sChokuStartDed = String.valueOf(o.toString());
        } else {
            this.sChokuStartDed = null;
        }
    }

    /** S_CHOKU_END_DED */
    private String sChokuEndDed;

    /**
     * @return S_CHOKU_END_DED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("S_CHOKU_END_DED")
    public String getSChokuEndDed() {
        return this.sChokuEndDed;
    }

    /**
     * @param o S_CHOKU_END_DED
     */
    public void setSChokuEndDed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sChokuEndDed = String.valueOf(o.toString());
        } else {
            this.sChokuEndDed = null;
        }
    }

    /** T_CHOKU_START_DED */
    private String tChokuStartDed;

    /**
     * @return T_CHOKU_START_DED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("T_CHOKU_START_DED")
    public String getTChokuStartDed() {
        return this.tChokuStartDed;
    }

    /**
     * @param o T_CHOKU_START_DED
     */
    public void setTChokuStartDed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tChokuStartDed = String.valueOf(o.toString());
        } else {
            this.tChokuStartDed = null;
        }
    }

    /** T_CHOKU_END_DED */
    private String tChokuEndDed;

    /**
     * @return T_CHOKU_END_DED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("T_CHOKU_END_DED")
    public String getTChokuEndDed() {
        return this.tChokuEndDed;
    }

    /**
     * @param o T_CHOKU_END_DED
     */
    public void setTChokuEndDed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tChokuEndDed = String.valueOf(o.toString());
        } else {
            this.tChokuEndDed = null;
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
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
     * MST_OPE_FORM照会
     *
     * @param param1 PATTERN_NO
     * @return MST_OPE_FORM
     */
    public static MstOpeForm get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PATTERN_NO\") = TRIM (:pattern_no)");

        String sql = "SELECT * FROM MST_OPE_FORM WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pattern_no", param1);

        return Queries.get(sql, params, MstOpeForm.class);
    }

    /**
     * MST_OPE_FORM追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PATTERN_NOの採番処理
        numbering();

        // MST_OPE_FORMの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PATTERN_NO\" -- :pattern_no");
        nameList.add("\"F_CHOKU_START\" -- :f_choku_start");
        nameList.add("\"F_CHOKU_END\" -- :f_choku_end");
        nameList.add("\"F_CHOKU_START_DED\" -- :f_choku_start_ded");
        nameList.add("\"F_CHOKU_END_DED\" -- :f_choku_end_ded");
        nameList.add("\"S_CHOKU_START_DED\" -- :s_choku_start_ded");
        nameList.add("\"S_CHOKU_END_DED\" -- :s_choku_end_ded");
        nameList.add("\"T_CHOKU_START_DED\" -- :t_choku_start_ded");
        nameList.add("\"T_CHOKU_END_DED\" -- :t_choku_end_ded");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_OPE_FORM(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pattern_no");
        valueList.add(":f_choku_start");
        valueList.add(":f_choku_end");
        valueList.add(":f_choku_start_ded");
        valueList.add(":f_choku_end_ded");
        valueList.add(":s_choku_start_ded");
        valueList.add(":s_choku_end_ded");
        valueList.add(":t_choku_start_ded");
        valueList.add(":t_choku_end_ded");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** PATTERN_NOの採番処理 */
    private void numbering() {

        if (this.patternNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"PATTERN_NO\") IS NULL THEN 0 ELSE MAX(e.\"PATTERN_NO\") * 1 END + 1, 2, '0') AS \"PATTERN_NO\" FROM MST_OPE_FORM e WHERE e.\"PATTERN_NO\" < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PATTERN_NO");

        this.setPatternNo(o);
    }

    /**
     * MST_OPE_FORM更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_OPE_FORMの登録
        String sql = "UPDATE MST_OPE_FORM\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PATTERN_NO\" = :pattern_no");
        setList.add("\"F_CHOKU_START\" = :f_choku_start");
        setList.add("\"F_CHOKU_END\" = :f_choku_end");
        setList.add("\"F_CHOKU_START_DED\" = :f_choku_start_ded");
        setList.add("\"F_CHOKU_END_DED\" = :f_choku_end_ded");
        setList.add("\"S_CHOKU_START_DED\" = :s_choku_start_ded");
        setList.add("\"S_CHOKU_END_DED\" = :s_choku_end_ded");
        setList.add("\"T_CHOKU_START_DED\" = :t_choku_start_ded");
        setList.add("\"T_CHOKU_END_DED\" = :t_choku_end_ded");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_OPE_FORM削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_OPE_FORMの削除
        String sql = "DELETE FROM MST_OPE_FORM WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PATTERN_NO\") = TRIM (:pattern_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pattern_no", this.patternNo);
        params.put("f_choku_start", this.fChokuStart);
        params.put("f_choku_end", this.fChokuEnd);
        params.put("f_choku_start_ded", this.fChokuStartDed);
        params.put("f_choku_end_ded", this.fChokuEndDed);
        params.put("s_choku_start_ded", this.sChokuStartDed);
        params.put("s_choku_end_ded", this.sChokuEndDed);
        params.put("t_choku_start_ded", this.tChokuStartDed);
        params.put("t_choku_end_ded", this.tChokuEndDed);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
