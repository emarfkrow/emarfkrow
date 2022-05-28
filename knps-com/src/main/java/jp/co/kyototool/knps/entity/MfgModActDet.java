package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_MOD_ACT_DET
 *
 * @author emarfkrow
 */
public class MfgModActDet implements IEntity {

    /** MOD_ACT_NO */
    private String modActNo;

    /**
     * @return MOD_ACT_NO
     */
    public String getModActNo() {
        return this.modActNo;
    }

    /**
     * @param o MOD_ACT_NO
     */
    public void setModActNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.modActNo = String.valueOf(o.toString());
        } else {
            this.modActNo = null;
        }
    }

    /** MOD_ACT_BRANCH_NO */
    private java.math.BigDecimal modActBranchNo;

    /**
     * @return MOD_ACT_BRANCH_NO
     */
    public java.math.BigDecimal getModActBranchNo() {
        return this.modActBranchNo;
    }

    /**
     * @param o MOD_ACT_BRANCH_NO
     */
    public void setModActBranchNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.modActBranchNo = new java.math.BigDecimal(o.toString());
        } else {
            this.modActBranchNo = null;
        }
    }

    /** MOD_ACT_ITEM */
    private java.math.BigDecimal modActItem;

    /**
     * @return MOD_ACT_ITEM
     */
    public java.math.BigDecimal getModActItem() {
        return this.modActItem;
    }

    /**
     * @param o MOD_ACT_ITEM
     */
    public void setModActItem(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.modActItem = new java.math.BigDecimal(o.toString());
        } else {
            this.modActItem = null;
        }
    }

    /** ACT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime actDate;

    /**
     * @return ACT_DATE
     */
    public java.time.LocalDateTime getActDate() {
        return this.actDate;
    }

    /**
     * @param o ACT_DATE
     */
    public void setActDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.actDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.actDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.actDate = null;
        }
    }

    /** OPERATOR */
    private String operator;

    /**
     * @return OPERATOR
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @param o OPERATOR
     */
    public void setOperator(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.operator = String.valueOf(o.toString());
        } else {
            this.operator = null;
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
     * MFG_MOD_ACT_DET照会
     *
     * @param param1 MOD_ACT_NO
     * @param param2 MOD_ACT_BRANCH_NO
     * @return MFG_MOD_ACT_DET
     */
    public static MfgModActDet get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (mod_act_no) = TRIM (:mod_act_no)");
        whereList.add("mod_act_branch_no = :mod_act_branch_no");

        String sql = "SELECT * FROM MFG_MOD_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mod_act_no", param1);
        params.put("mod_act_branch_no", param2);

        return Queries.get(sql, params, MfgModActDet.class);
    }

    /**
     * MFG_MOD_ACT_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MFG_MOD_ACT_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("mod_act_no -- :mod_act_no");
        nameList.add("mod_act_branch_no -- :mod_act_branch_no");
        nameList.add("mod_act_item -- :mod_act_item");
        nameList.add("act_date -- :act_date");
        nameList.add("operator -- :operator");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_MOD_ACT_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":mod_act_no");
        valueList.add(":mod_act_branch_no");
        valueList.add(":mod_act_item");
        valueList.add("TO_TIMESTAMP (:act_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":operator");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_MOD_ACT_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_MOD_ACT_DETの登録
        String sql = "UPDATE MFG_MOD_ACT_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("mod_act_no = :mod_act_no");
        setList.add("mod_act_branch_no = :mod_act_branch_no");
        setList.add("mod_act_item = :mod_act_item");
        setList.add("act_date = TO_TIMESTAMP (:act_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("operator = :operator");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_MOD_ACT_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_MOD_ACT_DETの削除
        String sql = "DELETE FROM MFG_MOD_ACT_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (mod_act_no) = TRIM (:mod_act_no)");
        whereList.add("mod_act_branch_no = :mod_act_branch_no");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("MOD_ACT_NO", this.modActNo);
        params.put("MOD_ACT_BRANCH_NO", this.modActBranchNo);
        params.put("MOD_ACT_ITEM", this.modActItem);
        params.put("ACT_DATE", this.actDate);
        params.put("OPERATOR", this.operator);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
