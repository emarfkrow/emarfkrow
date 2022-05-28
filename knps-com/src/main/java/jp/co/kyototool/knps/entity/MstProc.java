package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_PROC
 *
 * @author emarfkrow
 */
public class MstProc implements IEntity {

    /** ROUTING_CODE */
    private String routingCode;

    /**
     * @return ROUTING_CODE
     */
    public String getRoutingCode() {
        return this.routingCode;
    }

    /**
     * @param o ROUTING_CODE
     */
    public void setRoutingCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingCode = String.valueOf(o.toString());
        } else {
            this.routingCode = null;
        }
    }

    /** ROUTING_NAME */
    private String routingName;

    /**
     * @return ROUTING_NAME
     */
    public String getRoutingName() {
        return this.routingName;
    }

    /**
     * @param o ROUTING_NAME
     */
    public void setRoutingName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingName = String.valueOf(o.toString());
        } else {
            this.routingName = null;
        }
    }

    /** ROUTING_NAME_SHT */
    private String routingNameSht;

    /**
     * @return ROUTING_NAME_SHT
     */
    public String getRoutingNameSht() {
        return this.routingNameSht;
    }

    /**
     * @param o ROUTING_NAME_SHT
     */
    public void setRoutingNameSht(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingNameSht = String.valueOf(o.toString());
        } else {
            this.routingNameSht = null;
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

    /** EXCEL_COLOR_INDEX */
    private java.math.BigDecimal excelColorIndex;

    /**
     * @return EXCEL_COLOR_INDEX
     */
    public java.math.BigDecimal getExcelColorIndex() {
        return this.excelColorIndex;
    }

    /**
     * @param o EXCEL_COLOR_INDEX
     */
    public void setExcelColorIndex(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.excelColorIndex = new java.math.BigDecimal(o.toString());
        } else {
            this.excelColorIndex = null;
        }
    }

    /**
     * MST_PROC照会
     *
     * @param param1 ROUTING_CODE
     * @return MST_PROC
     */
    public static MstProc get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (routing_code) = TRIM (:routing_code)");

        String sql = "SELECT * FROM MST_PROC WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("routing_code", param1);

        return Queries.get(sql, params, MstProc.class);
    }

    /**
     * MST_PROC追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ROUTING_CODEの採番処理
        numbering();

        // MST_PROCの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("routing_code -- :routing_code");
        nameList.add("routing_name -- :routing_name");
        nameList.add("routing_name_sht -- :routing_name_sht");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        nameList.add("excel_color_index -- :excel_color_index");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_PROC(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":routing_code");
        valueList.add(":routing_name");
        valueList.add(":routing_name_sht");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":excel_color_index");
        return String.join("\r\n    , ", valueList);
    }

    /** ROUTING_CODEの採番処理 */
    private void numbering() {

        if (this.routingCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.ROUTING_CODE) IS NULL THEN 0 ELSE MAX(e.ROUTING_CODE) * 1 END + 1, 10, '0') AS ROUTING_CODE FROM MST_PROC e WHERE e.ROUTING_CODE < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("ROUTING_CODE");

        this.setRoutingCode(o);
    }

    /**
     * MST_PROC更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_PROCの登録
        String sql = "UPDATE MST_PROC\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("routing_code = :routing_code");
        setList.add("routing_name = :routing_name");
        setList.add("routing_name_sht = :routing_name_sht");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        setList.add("excel_color_index = :excel_color_index");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_PROC削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_PROCの削除
        String sql = "DELETE FROM MST_PROC WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (routing_code) = TRIM (:routing_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ROUTING_CODE", this.routingCode);
        params.put("ROUTING_NAME", this.routingName);
        params.put("ROUTING_NAME_SHT", this.routingNameSht);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("EXCEL_COLOR_INDEX", this.excelColorIndex);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
