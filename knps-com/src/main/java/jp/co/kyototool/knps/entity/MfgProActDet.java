package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_PRO_ACT_DET
 *
 * @author emarfkrow
 */
public class MfgProActDet implements IEntity {

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return this.proNo;
    }

    /**
     * @param o PRO_NO
     */
    public void setProNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNo = String.valueOf(o.toString());
        } else {
            this.proNo = null;
        }
    }

    /** PRO_ROUTING_BRANCH */
    private java.math.BigDecimal proRoutingBranch;

    /**
     * @return PRO_ROUTING_BRANCH
     */
    public java.math.BigDecimal getProRoutingBranch() {
        return this.proRoutingBranch;
    }

    /**
     * @param o PRO_ROUTING_BRANCH
     */
    public void setProRoutingBranch(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proRoutingBranch = new java.math.BigDecimal(o.toString());
        } else {
            this.proRoutingBranch = null;
        }
    }

    /** PRO_ACT_BRANCH_NO */
    private java.math.BigDecimal proActBranchNo;

    /**
     * @return PRO_ACT_BRANCH_NO
     */
    public java.math.BigDecimal getProActBranchNo() {
        return this.proActBranchNo;
    }

    /**
     * @param o PRO_ACT_BRANCH_NO
     */
    public void setProActBranchNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proActBranchNo = new java.math.BigDecimal(o.toString());
        } else {
            this.proActBranchNo = null;
        }
    }

    /** ACT_ITEM */
    private java.math.BigDecimal actItem;

    /**
     * @return ACT_ITEM
     */
    public java.math.BigDecimal getActItem() {
        return this.actItem;
    }

    /**
     * @param o ACT_ITEM
     */
    public void setActItem(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actItem = new java.math.BigDecimal(o.toString());
        } else {
            this.actItem = null;
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

    /** CAUSE_CODE */
    private String causeCode;

    /**
     * @return CAUSE_CODE
     */
    public String getCauseCode() {
        return this.causeCode;
    }

    /**
     * @param o CAUSE_CODE
     */
    public void setCauseCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.causeCode = String.valueOf(o.toString());
        } else {
            this.causeCode = null;
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

    /** LAST_ROUTING */
    private java.math.BigDecimal lastRouting;

    /**
     * @return LAST_ROUTING
     */
    public java.math.BigDecimal getLastRouting() {
        return this.lastRouting;
    }

    /**
     * @param o LAST_ROUTING
     */
    public void setLastRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastRouting = new java.math.BigDecimal(o.toString());
        } else {
            this.lastRouting = null;
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
     * MFG_PRO_ACT_DET照会
     *
     * @param param1 PRO_NO
     * @param param2 PRO_ROUTING_BRANCH
     * @param param3 PRO_ACT_BRANCH_NO
     * @return MFG_PRO_ACT_DET
     */
    public static MfgProActDet get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_NO\") = TRIM (:pro_no)");
        whereList.add("\"PRO_ROUTING_BRANCH\" = :pro_routing_branch");
        whereList.add("\"PRO_ACT_BRANCH_NO\" = :pro_act_branch_no");

        String sql = "SELECT * FROM MFG_PRO_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", param1);
        params.put("pro_routing_branch", param2);
        params.put("pro_act_branch_no", param3);

        return Queries.get(sql, params, MfgProActDet.class);
    }

    /**
     * MFG_PRO_ACT_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MFG_PRO_ACT_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("pro_no -- :pro_no");
        nameList.add("pro_routing_branch -- :pro_routing_branch");
        nameList.add("pro_act_branch_no -- :pro_act_branch_no");
        nameList.add("act_item -- :act_item");
        nameList.add("act_date -- :act_date");
        nameList.add("cause_code -- :cause_code");
        nameList.add("operator -- :operator");
        nameList.add("last_routing -- :last_routing");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_PRO_ACT_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pro_no");
        valueList.add(":pro_routing_branch");
        valueList.add(":pro_act_branch_no");
        valueList.add(":act_item");
        valueList.add("TO_TIMESTAMP (:act_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":cause_code");
        valueList.add(":operator");
        valueList.add(":last_routing");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_PRO_ACT_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_PRO_ACT_DETの登録
        String sql = "UPDATE MFG_PRO_ACT_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("pro_no = :pro_no");
        setList.add("pro_routing_branch = :pro_routing_branch");
        setList.add("pro_act_branch_no = :pro_act_branch_no");
        setList.add("act_item = :act_item");
        setList.add("act_date = TO_TIMESTAMP (:act_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("cause_code = :cause_code");
        setList.add("operator = :operator");
        setList.add("last_routing = :last_routing");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_PRO_ACT_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_PRO_ACT_DETの削除
        String sql = "DELETE FROM MFG_PRO_ACT_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pro_no) = TRIM (:pro_no)");
        whereList.add("pro_routing_branch = :pro_routing_branch");
        whereList.add("pro_act_branch_no = :pro_act_branch_no");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PRO_NO", this.proNo);
        params.put("PRO_ROUTING_BRANCH", this.proRoutingBranch);
        params.put("PRO_ACT_BRANCH_NO", this.proActBranchNo);
        params.put("ACT_ITEM", this.actItem);
        params.put("ACT_DATE", this.actDate);
        params.put("CAUSE_CODE", this.causeCode);
        params.put("OPERATOR", this.operator);
        params.put("LAST_ROUTING", this.lastRouting);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
