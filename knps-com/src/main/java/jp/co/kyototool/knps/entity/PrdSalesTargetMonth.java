package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_SALES_TARGET_MONTH
 *
 * @author emarfkrow
 */
public class PrdSalesTargetMonth implements IEntity {

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YYYY")
    public String getYyyy() {
        return this.yyyy;
    }

    /**
     * @param o YYYY
     */
    public void setYyyy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yyyy = String.valueOf(o.toString());
        } else {
            this.yyyy = null;
        }
    }

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MM")
    public String getMm() {
        return this.mm;
    }

    /**
     * @param o MM
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = String.valueOf(o.toString());
        } else {
            this.mm = null;
        }
    }

    /** FILE_ID */
    private java.math.BigDecimal fileId;

    /**
     * @return FILE_ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FILE_ID")
    public java.math.BigDecimal getFileId() {
        return this.fileId;
    }

    /**
     * @param o FILE_ID
     */
    public void setFileId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fileId = new java.math.BigDecimal(o.toString());
        } else {
            this.fileId = null;
        }
    }

    /** SALES_HINBAN */
    private String salesHinban;

    /**
     * @return SALES_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SALES_HINBAN")
    public String getSalesHinban() {
        return this.salesHinban;
    }

    /**
     * @param o SALES_HINBAN
     */
    public void setSalesHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salesHinban = String.valueOf(o.toString());
        } else {
            this.salesHinban = null;
        }
    }

    /** SALES_TARGET_COUNTS */
    private java.math.BigDecimal salesTargetCounts;

    /**
     * @return SALES_TARGET_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SALES_TARGET_COUNTS")
    public java.math.BigDecimal getSalesTargetCounts() {
        return this.salesTargetCounts;
    }

    /**
     * @param o SALES_TARGET_COUNTS
     */
    public void setSalesTargetCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salesTargetCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.salesTargetCounts = null;
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
     * PRD_SALES_TARGET_MONTH照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 FILE_ID
     * @param param4 SALES_HINBAN
     * @return PRD_SALES_TARGET_MONTH
     */
    public static PrdSalesTargetMonth get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("\"FILE_ID\" = :file_id");
        whereList.add("TRIM (\"SALES_HINBAN\") = TRIM (:sales_hinban)");

        String sql = "SELECT * FROM PRD_SALES_TARGET_MONTH WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("file_id", param3);
        params.put("sales_hinban", param4);

        return Queries.get(sql, params, PrdSalesTargetMonth.class);
    }

    /**
     * PRD_SALES_TARGET_MONTH追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SALES_HINBANの採番処理
        numbering();

        // PRD_SALES_TARGET_YEARの登録
        if (this.prdSalesTargetYear != null) {
            this.prdSalesTargetYear.setYyyy(this.getYyyy());
            this.prdSalesTargetYear.setMm(this.getMm());
            this.prdSalesTargetYear.setFileId(this.getFileId());
            this.prdSalesTargetYear.setSalesHinban(this.getSalesHinban());
            this.prdSalesTargetYear.insert(now, id);
        }

        // PRD_SALES_TARGET_MONTHの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"FILE_ID\" -- :file_id");
        nameList.add("\"SALES_HINBAN\" -- :sales_hinban");
        nameList.add("\"SALES_TARGET_COUNTS\" -- :sales_target_counts");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_SALES_TARGET_MONTH(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":file_id");
        valueList.add(":sales_hinban");
        valueList.add(":sales_target_counts");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** SALES_HINBANの採番処理 */
    private void numbering() {

        if (this.salesHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"SALES_HINBAN\") IS NULL THEN 0 ELSE MAX(e.\"SALES_HINBAN\") * 1 END + 1, 20, '0') AS \"SALES_HINBAN\" FROM PRD_SALES_TARGET_MONTH e WHERE e.\"SALES_HINBAN\" < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"YYYY\" = :yyyy");
        whereList.add("e.\"MM\" = :mm");
        whereList.add("e.\"FILE_ID\" = :file_id");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("file_id", this.fileId);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SALES_HINBAN");

        this.setSalesHinban(o);
    }

    /**
     * PRD_SALES_TARGET_MONTH更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_SALES_TARGET_YEARの登録
        if (this.prdSalesTargetYear != null) {
            prdSalesTargetYear.setYyyy(this.getYyyy());
            prdSalesTargetYear.setMm(this.getMm());
            prdSalesTargetYear.setFileId(this.getFileId());
            prdSalesTargetYear.setSalesHinban(this.getSalesHinban());
            try {
                prdSalesTargetYear.insert(now, id);
            } catch (Exception e) {
                prdSalesTargetYear.update(now, id);
            }
        }

        // PRD_SALES_TARGET_MONTHの登録
        String sql = "UPDATE PRD_SALES_TARGET_MONTH\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"FILE_ID\" = :file_id");
        setList.add("\"SALES_HINBAN\" = :sales_hinban");
        setList.add("\"SALES_TARGET_COUNTS\" = :sales_target_counts");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_SALES_TARGET_MONTH削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_SALES_TARGET_YEARの削除
        if (this.prdSalesTargetYear != null) {
            this.prdSalesTargetYear.delete();
        }

        // PRD_SALES_TARGET_MONTHの削除
        String sql = "DELETE FROM PRD_SALES_TARGET_MONTH WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("\"FILE_ID\" = :file_id");
        whereList.add("TRIM (\"SALES_HINBAN\") = TRIM (:sales_hinban)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("file_id", this.fileId);
        params.put("sales_hinban", this.salesHinban);
        params.put("sales_target_counts", this.salesTargetCounts);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_SALES_TARGET_YEAR
     */
    private PrdSalesTargetYear prdSalesTargetYear;

    /**
     * @return PRD_SALES_TARGET_YEAR
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdSalesTargetYear")
    public PrdSalesTargetYear getPrdSalesTargetYear() {
        return this.prdSalesTargetYear;
    }

    /**
     * @param p PRD_SALES_TARGET_YEAR
     */
    public void setPrdSalesTargetYear(final PrdSalesTargetYear p) {
        this.prdSalesTargetYear = p;
    }

    /**
     * @return PRD_SALES_TARGET_YEAR
     */
    public PrdSalesTargetYear referPrdSalesTargetYear() {
        if (this.prdSalesTargetYear == null) {
            try {
                this.prdSalesTargetYear = PrdSalesTargetYear.get(this.yyyy, this.mm, this.fileId, this.salesHinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdSalesTargetYear;
    }
}
