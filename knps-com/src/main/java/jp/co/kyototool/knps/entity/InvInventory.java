package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_INVENTORY
 *
 * @author emarfkrow
 */
public class InvInventory implements IEntity {

    /** LOCATION_CODE */
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOCATION_CODE")
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * @param o LOCATION_CODE
     */
    public void setLocationCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locationCode = String.valueOf(o.toString());
        } else {
            this.locationCode = null;
        }
    }

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN")
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

    /** GOOD_STOCK */
    private java.math.BigDecimal goodStock;

    /**
     * @return GOOD_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GOOD_STOCK")
    public java.math.BigDecimal getGoodStock() {
        return this.goodStock;
    }

    /**
     * @param o GOOD_STOCK
     */
    public void setGoodStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.goodStock = new java.math.BigDecimal(o.toString());
        } else {
            this.goodStock = null;
        }
    }

    /** BAD_STOCK */
    private java.math.BigDecimal badStock;

    /**
     * @return BAD_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BAD_STOCK")
    public java.math.BigDecimal getBadStock() {
        return this.badStock;
    }

    /**
     * @param o BAD_STOCK
     */
    public void setBadStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.badStock = new java.math.BigDecimal(o.toString());
        } else {
            this.badStock = null;
        }
    }

    /** LATEST_IN_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime latestInDate;

    /**
     * @return LATEST_IN_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATEST_IN_DATE")
    public java.time.LocalDateTime getLatestInDate() {
        return this.latestInDate;
    }

    /**
     * @param o LATEST_IN_DATE
     */
    public void setLatestInDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.latestInDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.latestInDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.latestInDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.latestInDate = null;
        }
    }

    /** LATEST_OUT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime latestOutDate;

    /**
     * @return LATEST_OUT_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATEST_OUT_DATE")
    public java.time.LocalDateTime getLatestOutDate() {
        return this.latestOutDate;
    }

    /**
     * @param o LATEST_OUT_DATE
     */
    public void setLatestOutDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.latestOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.latestOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.latestOutDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.latestOutDate = null;
        }
    }

    /** REMAINS_KBN */
    private java.math.BigDecimal remainsKbn;

    /**
     * @return REMAINS_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REMAINS_KBN")
    public java.math.BigDecimal getRemainsKbn() {
        return this.remainsKbn;
    }

    /**
     * @param o REMAINS_KBN
     */
    public void setRemainsKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.remainsKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.remainsKbn = null;
        }
    }

    /** REASON_CODE */
    private String reasonCode;

    /**
     * @return REASON_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REASON_CODE")
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @param o REASON_CODE
     */
    public void setReasonCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reasonCode = String.valueOf(o.toString());
        } else {
            this.reasonCode = null;
        }
    }

    /** NOTE */
    private String note;

    /**
     * @return NOTE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NOTE")
    public String getNote() {
        return this.note;
    }

    /**
     * @param o NOTE
     */
    public void setNote(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.note = String.valueOf(o.toString());
        } else {
            this.note = null;
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
     * INV_INVENTORY照会
     *
     * @param param1 LOCATION_CODE
     * @param param2 HINBAN
     * @return INV_INVENTORY
     */
    public static InvInventory get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"LOCATION_CODE\") = TRIM (:location_code)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");

        String sql = "SELECT * FROM INV_INVENTORY WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", param1);
        params.put("hinban", param2);

        return Queries.get(sql, params, InvInventory.class);
    }

    /**
     * INV_INVENTORY追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // HINBANの採番処理
        numbering();

        // INV_STOCK_PROCESSの登録
        if (this.invStockProcess != null) {
            this.invStockProcess.setLocationCode(this.getLocationCode());
            this.invStockProcess.setHinban(this.getHinban());
            this.invStockProcess.insert(now, id);
        }

        // INV_INVENTORYの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"LOCATION_CODE\" -- :location_code");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"GOOD_STOCK\" -- :good_stock");
        nameList.add("\"BAD_STOCK\" -- :bad_stock");
        nameList.add("\"LATEST_IN_DATE\" -- :latest_in_date");
        nameList.add("\"LATEST_OUT_DATE\" -- :latest_out_date");
        nameList.add("\"REMAINS_KBN\" -- :remains_kbn");
        nameList.add("\"REASON_CODE\" -- :reason_code");
        nameList.add("\"NOTE\" -- :note");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_INVENTORY(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":location_code");
        valueList.add(":hinban");
        valueList.add(":good_stock");
        valueList.add(":bad_stock");
        valueList.add("TO_TIMESTAMP (:latest_in_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:latest_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":remains_kbn");
        valueList.add(":reason_code");
        valueList.add(":note");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"HINBAN\") IS NULL THEN 0 ELSE MAX(e.\"HINBAN\") * 1 END + 1, 25, '0') AS \"HINBAN\" FROM INV_INVENTORY e WHERE e.\"HINBAN\" < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"LOCATION_CODE\" = :location_code");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("location_code", this.locationCode);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HINBAN");

        this.setHinban(o);
    }

    /**
     * INV_INVENTORY更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_PROCESSの登録
        if (this.invStockProcess != null) {
            invStockProcess.setLocationCode(this.getLocationCode());
            invStockProcess.setHinban(this.getHinban());
            try {
                invStockProcess.insert(now, id);
            } catch (Exception e) {
                invStockProcess.update(now, id);
            }
        }

        // INV_INVENTORYの登録
        String sql = "UPDATE INV_INVENTORY\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"LOCATION_CODE\" = :location_code");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"GOOD_STOCK\" = :good_stock");
        setList.add("\"BAD_STOCK\" = :bad_stock");
        setList.add("\"LATEST_IN_DATE\" = TO_TIMESTAMP (:latest_in_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"LATEST_OUT_DATE\" = TO_TIMESTAMP (:latest_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"REMAINS_KBN\" = :remains_kbn");
        setList.add("\"REASON_CODE\" = :reason_code");
        setList.add("\"NOTE\" = :note");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_INVENTORY削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_PROCESSの削除
        if (this.invStockProcess != null) {
            this.invStockProcess.delete();
        }

        // INV_INVENTORYの削除
        String sql = "DELETE FROM INV_INVENTORY WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"LOCATION_CODE\") = TRIM (:location_code)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", this.locationCode);
        params.put("hinban", this.hinban);
        params.put("good_stock", this.goodStock);
        params.put("bad_stock", this.badStock);
        params.put("latest_in_date", this.latestInDate);
        params.put("latest_out_date", this.latestOutDate);
        params.put("remains_kbn", this.remainsKbn);
        params.put("reason_code", this.reasonCode);
        params.put("note", this.note);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * INV_STOCK_PROCESS
     */
    private InvStockProcess invStockProcess;

    /**
     * @return INV_STOCK_PROCESS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvStockProcess")
    public InvStockProcess getInvStockProcess() {
        return this.invStockProcess;
    }

    /**
     * @param p INV_STOCK_PROCESS
     */
    public void setInvStockProcess(final InvStockProcess p) {
        this.invStockProcess = p;
    }

    /**
     * @return INV_STOCK_PROCESS
     */
    public InvStockProcess referInvStockProcess() {
        if (this.invStockProcess == null) {
            try {
                this.invStockProcess = InvStockProcess.get(this.locationCode, this.hinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.invStockProcess;
    }
}
