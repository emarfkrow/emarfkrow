package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_ORDERPOINT_STATUS
 *
 * @author emarfkrow
 */
public class PrdOrderpointStatus implements IEntity {

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** PUBLISHED_COUNTS */
    private java.math.BigDecimal publishedCounts;

    /**
     * @return PUBLISHED_COUNTS
     */
    public java.math.BigDecimal getPublishedCounts() {
        return this.publishedCounts;
    }

    /**
     * @param o PUBLISHED_COUNTS
     */
    public void setPublishedCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.publishedCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.publishedCounts = null;
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
     * PRD_ORDERPOINT_STATUS照会
     *
     * @param param1 HINBAN
     * @return PRD_ORDERPOINT_STATUS
     */
    public static PrdOrderpointStatus get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");

        String sql = "SELECT * FROM PRD_ORDERPOINT_STATUS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);

        return Queries.get(sql, params, PrdOrderpointStatus.class);
    }

    /**
     * PRD_ORDERPOINT_STATUS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // HINBANの採番処理
        numbering();

        // PRD_ORDERPOINT_SUMMARYの登録
        if (this.prdOrderpointSummary != null) {
            this.prdOrderpointSummary.setHinban(this.getHinban());
            this.prdOrderpointSummary.insert(now, id);
        }

        // PRD_ORDERPOINT_STATUSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("hinban -- :hinban");
        nameList.add("published_counts -- :published_counts");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_ORDERPOINT_STATUS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hinban");
        valueList.add(":published_counts");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** HINBANの採番処理 */
    private void numbering() {

        if (this.hinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HINBAN) IS NULL THEN 0 ELSE MAX(e.HINBAN) * 1 END + 1, 25, '0') AS HINBAN FROM PRD_ORDERPOINT_STATUS e WHERE e.HINBAN < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HINBAN");

        this.setHinban(o);
    }

    /**
     * PRD_ORDERPOINT_STATUS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_ORDERPOINT_SUMMARYの登録
        if (this.prdOrderpointSummary != null) {
            prdOrderpointSummary.setHinban(this.getHinban());
            try {
                prdOrderpointSummary.insert(now, id);
            } catch (Exception e) {
                prdOrderpointSummary.update(now, id);
            }
        }

        // PRD_ORDERPOINT_STATUSの登録
        String sql = "UPDATE PRD_ORDERPOINT_STATUS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hinban = :hinban");
        setList.add("published_counts = :published_counts");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_ORDERPOINT_STATUS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_ORDERPOINT_SUMMARYの削除
        if (this.prdOrderpointSummary != null) {
            this.prdOrderpointSummary.delete();
        }

        // PRD_ORDERPOINT_STATUSの削除
        String sql = "DELETE FROM PRD_ORDERPOINT_STATUS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("HINBAN", this.hinban);
        params.put("PUBLISHED_COUNTS", this.publishedCounts);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_ORDERPOINT_SUMMARY
     */
    private PrdOrderpointSummary prdOrderpointSummary;

    /**
     * @return PRD_ORDERPOINT_SUMMARY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdOrderpointSummary")
    public PrdOrderpointSummary getPrdOrderpointSummary() {
        return this.prdOrderpointSummary;
    }

    /**
     * @param p PRD_ORDERPOINT_SUMMARY
     */
    public void setPrdOrderpointSummary(final PrdOrderpointSummary p) {
        this.prdOrderpointSummary = p;
    }

    /**
     * @return PRD_ORDERPOINT_SUMMARY
     */
    public PrdOrderpointSummary referPrdOrderpointSummary() {
        if (this.prdOrderpointSummary == null) {
            try {
                this.prdOrderpointSummary = PrdOrderpointSummary.get(this.hinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdOrderpointSummary;
    }
}
