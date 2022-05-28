package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_ACCEPT_ACT_DET
 *
 * @author emarfkrow
 */
public class PchAcceptActDet implements IEntity {

    /** ACT_NO */
    private String actNo;

    /**
     * @return ACT_NO
     */
    public String getActNo() {
        return this.actNo;
    }

    /**
     * @param o ACT_NO
     */
    public void setActNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actNo = String.valueOf(o.toString());
        } else {
            this.actNo = null;
        }
    }

    /** ACT_BRANCH_NO */
    private java.math.BigDecimal actBranchNo;

    /**
     * @return ACT_BRANCH_NO
     */
    public java.math.BigDecimal getActBranchNo() {
        return this.actBranchNo;
    }

    /**
     * @param o ACT_BRANCH_NO
     */
    public void setActBranchNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actBranchNo = new java.math.BigDecimal(o.toString());
        } else {
            this.actBranchNo = null;
        }
    }

    /** INSPECT_COUNTS */
    private java.math.BigDecimal inspectCounts;

    /**
     * @return INSPECT_COUNTS
     */
    public java.math.BigDecimal getInspectCounts() {
        return this.inspectCounts;
    }

    /**
     * @param o INSPECT_COUNTS
     */
    public void setInspectCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectCounts = null;
        }
    }

    /** INSPECT_UNIT */
    private java.math.BigDecimal inspectUnit;

    /**
     * @return INSPECT_UNIT
     */
    public java.math.BigDecimal getInspectUnit() {
        return this.inspectUnit;
    }

    /**
     * @param o INSPECT_UNIT
     */
    public void setInspectUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectUnit = null;
        }
    }

    /** AMOUNT */
    private java.math.BigDecimal amount;

    /**
     * @return AMOUNT
     */
    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * @param o AMOUNT
     */
    public void setAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.amount = new java.math.BigDecimal(o.toString());
        } else {
            this.amount = null;
        }
    }

    /** TAX_AMOUNT */
    private java.math.BigDecimal taxAmount;

    /**
     * @return TAX_AMOUNT
     */
    public java.math.BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    /**
     * @param o TAX_AMOUNT
     */
    public void setTaxAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.taxAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.taxAmount = null;
        }
    }

    /** CHECK_ISSUE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime checkIssueDate;

    /**
     * @return CHECK_ISSUE_DATE
     */
    public java.time.LocalDateTime getCheckIssueDate() {
        return this.checkIssueDate;
    }

    /**
     * @param o CHECK_ISSUE_DATE
     */
    public void setCheckIssueDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.checkIssueDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.checkIssueDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.checkIssueDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.checkIssueDate = null;
        }
    }

    /** CHECK_LIST_NO */
    private String checkListNo;

    /**
     * @return CHECK_LIST_NO
     */
    public String getCheckListNo() {
        return this.checkListNo;
    }

    /**
     * @param o CHECK_LIST_NO
     */
    public void setCheckListNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.checkListNo = String.valueOf(o.toString());
        } else {
            this.checkListNo = null;
        }
    }

    /** CHECK_ISSUE_OPE */
    private String checkIssueOpe;

    /**
     * @return CHECK_ISSUE_OPE
     */
    public String getCheckIssueOpe() {
        return this.checkIssueOpe;
    }

    /**
     * @param o CHECK_ISSUE_OPE
     */
    public void setCheckIssueOpe(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.checkIssueOpe = String.valueOf(o.toString());
        } else {
            this.checkIssueOpe = null;
        }
    }

    /** CHECK_FLG */
    private java.math.BigDecimal checkFlg;

    /**
     * @return CHECK_FLG
     */
    public java.math.BigDecimal getCheckFlg() {
        return this.checkFlg;
    }

    /**
     * @param o CHECK_FLG
     */
    public void setCheckFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.checkFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.checkFlg = null;
        }
    }

    /** CHECK_COMP_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime checkCompDate;

    /**
     * @return CHECK_COMP_DATE
     */
    public java.time.LocalDateTime getCheckCompDate() {
        return this.checkCompDate;
    }

    /**
     * @param o CHECK_COMP_DATE
     */
    public void setCheckCompDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.checkCompDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.checkCompDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.checkCompDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.checkCompDate = null;
        }
    }

    /** CHECK_COMP_OPE */
    private String checkCompOpe;

    /**
     * @return CHECK_COMP_OPE
     */
    public String getCheckCompOpe() {
        return this.checkCompOpe;
    }

    /**
     * @param o CHECK_COMP_OPE
     */
    public void setCheckCompOpe(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.checkCompOpe = String.valueOf(o.toString());
        } else {
            this.checkCompOpe = null;
        }
    }

    /** CLOSE_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime closeDate;

    /**
     * @return CLOSE_DATE
     */
    public java.time.LocalDateTime getCloseDate() {
        return this.closeDate;
    }

    /**
     * @param o CLOSE_DATE
     */
    public void setCloseDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.closeDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.closeDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.closeDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.closeDate = null;
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

    /** INSPECT_ISSHIKI_UNIT_F */
    private String inspectIsshikiUnitF;

    /**
     * @return INSPECT_ISSHIKI_UNIT_F
     */
    public String getInspectIsshikiUnitF() {
        return this.inspectIsshikiUnitF;
    }

    /**
     * @param o INSPECT_ISSHIKI_UNIT_F
     */
    public void setInspectIsshikiUnitF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectIsshikiUnitF = String.valueOf(o.toString());
        } else {
            this.inspectIsshikiUnitF = null;
        }
    }

    /** INSPECT_ISSHIKI_COUNTS */
    private java.math.BigDecimal inspectIsshikiCounts;

    /**
     * @return INSPECT_ISSHIKI_COUNTS
     */
    public java.math.BigDecimal getInspectIsshikiCounts() {
        return this.inspectIsshikiCounts;
    }

    /**
     * @param o INSPECT_ISSHIKI_COUNTS
     */
    public void setInspectIsshikiCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectIsshikiCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectIsshikiCounts = null;
        }
    }

    /** INSPECT_ISSHIKI_UNIT */
    private java.math.BigDecimal inspectIsshikiUnit;

    /**
     * @return INSPECT_ISSHIKI_UNIT
     */
    public java.math.BigDecimal getInspectIsshikiUnit() {
        return this.inspectIsshikiUnit;
    }

    /**
     * @param o INSPECT_ISSHIKI_UNIT
     */
    public void setInspectIsshikiUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectIsshikiUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectIsshikiUnit = null;
        }
    }

    /**
     * PCH_ACCEPT_ACT_DET照会
     *
     * @param param1 ACT_NO
     * @param param2 ACT_BRANCH_NO
     * @return PCH_ACCEPT_ACT_DET
     */
    public static PchAcceptActDet get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (act_no) = TRIM (:act_no)");
        whereList.add("act_branch_no = :act_branch_no");

        String sql = "SELECT * FROM PCH_ACCEPT_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_no", param1);
        params.put("act_branch_no", param2);

        return Queries.get(sql, params, PchAcceptActDet.class);
    }

    /**
     * PCH_ACCEPT_ACT_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PCH_ACCEPT_ACT_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("act_no -- :act_no");
        nameList.add("act_branch_no -- :act_branch_no");
        nameList.add("inspect_counts -- :inspect_counts");
        nameList.add("inspect_unit -- :inspect_unit");
        nameList.add("amount -- :amount");
        nameList.add("tax_amount -- :tax_amount");
        nameList.add("check_issue_date -- :check_issue_date");
        nameList.add("check_list_no -- :check_list_no");
        nameList.add("check_issue_ope -- :check_issue_ope");
        nameList.add("check_flg -- :check_flg");
        nameList.add("check_comp_date -- :check_comp_date");
        nameList.add("check_comp_ope -- :check_comp_ope");
        nameList.add("close_date -- :close_date");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("inspect_isshiki_unit_f -- :inspect_isshiki_unit_f");
        nameList.add("inspect_isshiki_counts -- :inspect_isshiki_counts");
        nameList.add("inspect_isshiki_unit -- :inspect_isshiki_unit");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_ACCEPT_ACT_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":act_no");
        valueList.add(":act_branch_no");
        valueList.add(":inspect_counts");
        valueList.add(":inspect_unit");
        valueList.add(":amount");
        valueList.add(":tax_amount");
        valueList.add("TO_TIMESTAMP (:check_issue_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":check_list_no");
        valueList.add(":check_issue_ope");
        valueList.add(":check_flg");
        valueList.add("TO_TIMESTAMP (:check_comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":check_comp_ope");
        valueList.add("TO_TIMESTAMP (:close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":inspect_isshiki_unit_f");
        valueList.add(":inspect_isshiki_counts");
        valueList.add(":inspect_isshiki_unit");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PCH_ACCEPT_ACT_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_ACCEPT_ACT_DETの登録
        String sql = "UPDATE PCH_ACCEPT_ACT_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("act_no = :act_no");
        setList.add("act_branch_no = :act_branch_no");
        setList.add("inspect_counts = :inspect_counts");
        setList.add("inspect_unit = :inspect_unit");
        setList.add("amount = :amount");
        setList.add("tax_amount = :tax_amount");
        setList.add("check_issue_date = TO_TIMESTAMP (:check_issue_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("check_list_no = :check_list_no");
        setList.add("check_issue_ope = :check_issue_ope");
        setList.add("check_flg = :check_flg");
        setList.add("check_comp_date = TO_TIMESTAMP (:check_comp_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("check_comp_ope = :check_comp_ope");
        setList.add("close_date = TO_TIMESTAMP (:close_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("inspect_isshiki_unit_f = :inspect_isshiki_unit_f");
        setList.add("inspect_isshiki_counts = :inspect_isshiki_counts");
        setList.add("inspect_isshiki_unit = :inspect_isshiki_unit");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_ACCEPT_ACT_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_ACCEPT_ACT_DETの削除
        String sql = "DELETE FROM PCH_ACCEPT_ACT_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (act_no) = TRIM (:act_no)");
        whereList.add("act_branch_no = :act_branch_no");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ACT_NO", this.actNo);
        params.put("ACT_BRANCH_NO", this.actBranchNo);
        params.put("INSPECT_COUNTS", this.inspectCounts);
        params.put("INSPECT_UNIT", this.inspectUnit);
        params.put("AMOUNT", this.amount);
        params.put("TAX_AMOUNT", this.taxAmount);
        params.put("CHECK_ISSUE_DATE", this.checkIssueDate);
        params.put("CHECK_LIST_NO", this.checkListNo);
        params.put("CHECK_ISSUE_OPE", this.checkIssueOpe);
        params.put("CHECK_FLG", this.checkFlg);
        params.put("CHECK_COMP_DATE", this.checkCompDate);
        params.put("CHECK_COMP_OPE", this.checkCompOpe);
        params.put("CLOSE_DATE", this.closeDate);
        params.put("INSPECT_ISSHIKI_UNIT_F", this.inspectIsshikiUnitF);
        params.put("INSPECT_ISSHIKI_COUNTS", this.inspectIsshikiCounts);
        params.put("INSPECT_ISSHIKI_UNIT", this.inspectIsshikiUnit);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
