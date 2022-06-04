package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_ACCOUNT_CODE
 *
 * @author emarfkrow
 */
public class MstAccountCode implements IEntity {

    /** ACCOUNT_CODE */
    private String accountCode;

    /**
     * @return ACCOUNT_CODE
     */
    public String getAccountCode() {
        return this.accountCode;
    }

    /**
     * @param o ACCOUNT_CODE
     */
    public void setAccountCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.accountCode = String.valueOf(o.toString());
        } else {
            this.accountCode = null;
        }
    }

    /** ACCOUNT_NAME */
    private String accountName;

    /**
     * @return ACCOUNT_NAME
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @param o ACCOUNT_NAME
     */
    public void setAccountName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.accountName = String.valueOf(o.toString());
        } else {
            this.accountName = null;
        }
    }

    /** EXPENSE_KBN1 */
    private java.math.BigDecimal expenseKbn1;

    /**
     * @return EXPENSE_KBN1
     */
    public java.math.BigDecimal getExpenseKbn1() {
        return this.expenseKbn1;
    }

    /**
     * @param o EXPENSE_KBN1
     */
    public void setExpenseKbn1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expenseKbn1 = new java.math.BigDecimal(o.toString());
        } else {
            this.expenseKbn1 = null;
        }
    }

    /** EXPENSE_KBN2 */
    private java.math.BigDecimal expenseKbn2;

    /**
     * @return EXPENSE_KBN2
     */
    public java.math.BigDecimal getExpenseKbn2() {
        return this.expenseKbn2;
    }

    /**
     * @param o EXPENSE_KBN2
     */
    public void setExpenseKbn2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expenseKbn2 = new java.math.BigDecimal(o.toString());
        } else {
            this.expenseKbn2 = null;
        }
    }

    /** EXPENSE_KBN3 */
    private java.math.BigDecimal expenseKbn3;

    /**
     * @return EXPENSE_KBN3
     */
    public java.math.BigDecimal getExpenseKbn3() {
        return this.expenseKbn3;
    }

    /**
     * @param o EXPENSE_KBN3
     */
    public void setExpenseKbn3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expenseKbn3 = new java.math.BigDecimal(o.toString());
        } else {
            this.expenseKbn3 = null;
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
     * MST_ACCOUNT_CODE照会
     *
     * @param param1 ACCOUNT_CODE
     * @return MST_ACCOUNT_CODE
     */
    public static MstAccountCode get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACCOUNT_CODE\") = TRIM (:account_code)");

        String sql = "SELECT * FROM MST_ACCOUNT_CODE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("account_code", param1);

        return Queries.get(sql, params, MstAccountCode.class);
    }

    /**
     * MST_ACCOUNT_CODE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ACCOUNT_CODEの採番処理
        numbering();

        // MST_ACCOUNT_CODEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"ACCOUNT_CODE\" -- :account_code");
        nameList.add("\"ACCOUNT_NAME\" -- :account_name");
        nameList.add("\"EXPENSE_KBN1\" -- :expense_kbn1");
        nameList.add("\"EXPENSE_KBN2\" -- :expense_kbn2");
        nameList.add("\"EXPENSE_KBN3\" -- :expense_kbn3");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_ACCOUNT_CODE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":account_code");
        valueList.add(":account_name");
        valueList.add(":expense_kbn1");
        valueList.add(":expense_kbn2");
        valueList.add(":expense_kbn3");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** ACCOUNT_CODEの採番処理 */
    private void numbering() {

        if (this.accountCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"ACCOUNT_CODE\") IS NULL THEN 0 ELSE MAX(e.\"ACCOUNT_CODE\") * 1 END + 1, 5, '0') AS \"ACCOUNT_CODE\" FROM MST_ACCOUNT_CODE e WHERE e.\"ACCOUNT_CODE\" < '99999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("ACCOUNT_CODE");

        this.setAccountCode(o);
    }

    /**
     * MST_ACCOUNT_CODE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_ACCOUNT_CODEの登録
        String sql = "UPDATE MST_ACCOUNT_CODE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"ACCOUNT_CODE\" = :account_code");
        setList.add("\"ACCOUNT_NAME\" = :account_name");
        setList.add("\"EXPENSE_KBN1\" = :expense_kbn1");
        setList.add("\"EXPENSE_KBN2\" = :expense_kbn2");
        setList.add("\"EXPENSE_KBN3\" = :expense_kbn3");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_ACCOUNT_CODE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_ACCOUNT_CODEの削除
        String sql = "DELETE FROM MST_ACCOUNT_CODE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACCOUNT_CODE\") = TRIM (:account_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("account_code", this.accountCode);
        params.put("account_name", this.accountName);
        params.put("expense_kbn1", this.expenseKbn1);
        params.put("expense_kbn2", this.expenseKbn2);
        params.put("expense_kbn3", this.expenseKbn3);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
