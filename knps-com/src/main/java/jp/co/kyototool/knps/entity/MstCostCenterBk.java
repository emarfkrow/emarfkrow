package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_COST_CENTER_BK
 *
 * @author emarfkrow
 */
public class MstCostCenterBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
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

    /** COST_CENTER_CODE */
    private String costCenterCode;

    /**
     * @return COST_CENTER_CODE
     */
    public String getCostCenterCode() {
        return this.costCenterCode;
    }

    /**
     * @param o COST_CENTER_CODE
     */
    public void setCostCenterCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costCenterCode = String.valueOf(o.toString());
        } else {
            this.costCenterCode = null;
        }
    }

    /** COST_CENTER_NAME */
    private String costCenterName;

    /**
     * @return COST_CENTER_NAME
     */
    public String getCostCenterName() {
        return this.costCenterName;
    }

    /**
     * @param o COST_CENTER_NAME
     */
    public void setCostCenterName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costCenterName = String.valueOf(o.toString());
        } else {
            this.costCenterName = null;
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

    /** COST_RATE_KBN */
    private java.math.BigDecimal costRateKbn;

    /**
     * @return COST_RATE_KBN
     */
    public java.math.BigDecimal getCostRateKbn() {
        return this.costRateKbn;
    }

    /**
     * @param o COST_RATE_KBN
     */
    public void setCostRateKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costRateKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.costRateKbn = null;
        }
    }

    /** COST_RATE_CODE */
    private String costRateCode;

    /**
     * @return COST_RATE_CODE
     */
    public String getCostRateCode() {
        return this.costRateCode;
    }

    /**
     * @param o COST_RATE_CODE
     */
    public void setCostRateCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costRateCode = String.valueOf(o.toString());
        } else {
            this.costRateCode = null;
        }
    }

    /** COST_COLLECT */
    private java.math.BigDecimal costCollect;

    /**
     * @return COST_COLLECT
     */
    public java.math.BigDecimal getCostCollect() {
        return this.costCollect;
    }

    /**
     * @param o COST_COLLECT
     */
    public void setCostCollect(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costCollect = new java.math.BigDecimal(o.toString());
        } else {
            this.costCollect = null;
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
     * MST_COST_CENTER_BK照会
     *
     * @param param1 COST_CENTER_CODE
     * @param param2 YY
     * @return MST_COST_CENTER_BK
     */
    public static MstCostCenterBk get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"COST_CENTER_CODE\") = TRIM (:cost_center_code)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_COST_CENTER_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("cost_center_code", param1);
        params.put("yy", param2);

        return Queries.get(sql, params, MstCostCenterBk.class);
    }

    /**
     * MST_COST_CENTER_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_COST_CENTER_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"COST_CENTER_CODE\" -- :cost_center_code");
        nameList.add("\"COST_CENTER_NAME\" -- :cost_center_name");
        nameList.add("\"IN_OUT_KBN\" -- :in_out_kbn");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"COST_RATE_KBN\" -- :cost_rate_kbn");
        nameList.add("\"COST_RATE_CODE\" -- :cost_rate_code");
        nameList.add("\"COST_COLLECT\" -- :cost_collect");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_COST_CENTER_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":cost_center_code");
        valueList.add(":cost_center_name");
        valueList.add(":in_out_kbn");
        valueList.add(":sup_code");
        valueList.add(":cost_rate_kbn");
        valueList.add(":cost_rate_code");
        valueList.add(":cost_collect");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM MST_COST_CENTER_BK e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"COST_CENTER_CODE\" = :cost_center_code");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("cost_center_code", this.costCenterCode);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_COST_CENTER_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_COST_CENTER_BKの登録
        String sql = "UPDATE MST_COST_CENTER_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"COST_CENTER_CODE\" = :cost_center_code");
        setList.add("\"COST_CENTER_NAME\" = :cost_center_name");
        setList.add("\"IN_OUT_KBN\" = :in_out_kbn");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"COST_RATE_KBN\" = :cost_rate_kbn");
        setList.add("\"COST_RATE_CODE\" = :cost_rate_code");
        setList.add("\"COST_COLLECT\" = :cost_collect");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_COST_CENTER_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_COST_CENTER_BKの削除
        String sql = "DELETE FROM MST_COST_CENTER_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"COST_CENTER_CODE\") = TRIM (:cost_center_code)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("cost_center_code", this.costCenterCode);
        params.put("cost_center_name", this.costCenterName);
        params.put("in_out_kbn", this.inOutKbn);
        params.put("sup_code", this.supCode);
        params.put("cost_rate_kbn", this.costRateKbn);
        params.put("cost_rate_code", this.costRateCode);
        params.put("cost_collect", this.costCollect);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
