package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_STORE_MAINTE_REPORT
 *
 * @author emarfkrow
 */
public class PrdStoreMainteReport implements IEntity {

    /** REP_GROUP_CODE */
    private String repGroupCode;

    /**
     * @return REP_GROUP_CODE
     */
    public String getRepGroupCode() {
        return this.repGroupCode;
    }

    /**
     * @param o REP_GROUP_CODE
     */
    public void setRepGroupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.repGroupCode = String.valueOf(o.toString());
        } else {
            this.repGroupCode = null;
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

    /** RETSU_NO */
    private String retsuNo;

    /**
     * @return RETSU_NO
     */
    public String getRetsuNo() {
        return this.retsuNo;
    }

    /**
     * @param o RETSU_NO
     */
    public void setRetsuNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.retsuNo = String.valueOf(o.toString());
        } else {
            this.retsuNo = null;
        }
    }

    /** GYO_NO */
    private String gyoNo;

    /**
     * @return GYO_NO
     */
    public String getGyoNo() {
        return this.gyoNo;
    }

    /**
     * @param o GYO_NO
     */
    public void setGyoNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gyoNo = String.valueOf(o.toString());
        } else {
            this.gyoNo = null;
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
     * PRD_STORE_MAINTE_REPORT照会
     *
     * @param param1 REP_GROUP_CODE
     * @return PRD_STORE_MAINTE_REPORT
     */
    public static PrdStoreMainteReport get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (rep_group_code) = TRIM (:rep_group_code)");

        String sql = "SELECT * FROM PRD_STORE_MAINTE_REPORT WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rep_group_code", param1);

        return Queries.get(sql, params, PrdStoreMainteReport.class);
    }

    /**
     * PRD_STORE_MAINTE_REPORT追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // REP_GROUP_CODEの採番処理
        numbering();

        // PRD_STORE_MAINTE_REPORTの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("rep_group_code -- :rep_group_code");
        nameList.add("group_name -- :group_name");
        nameList.add("retsu_no -- :retsu_no");
        nameList.add("gyo_no -- :gyo_no");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_STORE_MAINTE_REPORT(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":rep_group_code");
        valueList.add(":group_name");
        valueList.add(":retsu_no");
        valueList.add(":gyo_no");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** REP_GROUP_CODEの採番処理 */
    private void numbering() {

        if (this.repGroupCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.REP_GROUP_CODE) IS NULL THEN 0 ELSE MAX(e.REP_GROUP_CODE) * 1 END + 1, 2, '0') AS REP_GROUP_CODE FROM PRD_STORE_MAINTE_REPORT e WHERE e.REP_GROUP_CODE < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("REP_GROUP_CODE");

        this.setRepGroupCode(o);
    }

    /**
     * PRD_STORE_MAINTE_REPORT更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_STORE_MAINTE_REPORTの登録
        String sql = "UPDATE PRD_STORE_MAINTE_REPORT\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("rep_group_code = :rep_group_code");
        setList.add("group_name = :group_name");
        setList.add("retsu_no = :retsu_no");
        setList.add("gyo_no = :gyo_no");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_STORE_MAINTE_REPORT削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_STORE_MAINTE_REPORTの削除
        String sql = "DELETE FROM PRD_STORE_MAINTE_REPORT WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (rep_group_code) = TRIM (:rep_group_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("REP_GROUP_CODE", this.repGroupCode);
        params.put("GROUP_NAME", this.groupName);
        params.put("RETSU_NO", this.retsuNo);
        params.put("GYO_NO", this.gyoNo);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
