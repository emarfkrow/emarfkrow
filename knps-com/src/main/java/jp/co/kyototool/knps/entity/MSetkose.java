package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * M_SETKOSE
 *
 * @author emarfkrow
 */
public class MSetkose implements IEntity {

    /** SET-HINBAN */
    private String setHinban;

    /**
     * @return SET-HINBAN
     */
    public String getSetHinban() {
        return this.setHinban;
    }

    /**
     * @param o SET-HINBAN
     */
    public void setSetHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setHinban = String.valueOf(o.toString());
        } else {
            this.setHinban = null;
        }
    }

    /** SET-KHINBAN */
    private String setKhinban;

    /**
     * @return SET-KHINBAN
     */
    public String getSetKhinban() {
        return this.setKhinban;
    }

    /**
     * @param o SET-KHINBAN
     */
    public void setSetKhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setKhinban = String.valueOf(o.toString());
        } else {
            this.setKhinban = null;
        }
    }

    /** DLTFLG */
    private String dltflg;

    /**
     * @return DLTFLG
     */
    public String getDltflg() {
        return this.dltflg;
    }

    /**
     * @param o DLTFLG
     */
    public void setDltflg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dltflg = String.valueOf(o.toString());
        } else {
            this.dltflg = null;
        }
    }

    /** SETINZU */
    private java.math.BigDecimal setinzu;

    /**
     * @return SETINZU
     */
    public java.math.BigDecimal getSetinzu() {
        return this.setinzu;
    }

    /**
     * @param o SETINZU
     */
    public void setSetinzu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setinzu = new java.math.BigDecimal(o.toString());
        } else {
            this.setinzu = null;
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
     * M_SETKOSE照会
     *
     * @param param1 SET-HINBAN
     * @param param2 SET-KHINBAN
     * @return M_SETKOSE
     */
    public static MSetkose get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (set-hinban) = TRIM (:set-hinban)");
        whereList.add("TRIM (set-khinban) = TRIM (:set-khinban)");

        String sql = "SELECT * FROM M_SETKOSE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("set-hinban", param1);
        params.put("set-khinban", param2);

        return Queries.get(sql, params, MSetkose.class);
    }

    /**
     * M_SETKOSE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SET-KHINBANの採番処理
        numbering();

        // M_SETKOSEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("set-hinban -- :set-hinban");
        nameList.add("set-khinban -- :set-khinban");
        nameList.add("dltflg -- :dltflg");
        nameList.add("setinzu -- :setinzu");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SETKOSE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":set-hinban");
        valueList.add(":set-khinban");
        valueList.add(":dltflg");
        valueList.add(":setinzu");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** SET-KHINBANの採番処理 */
    private void numbering() {

        if (this.setKhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SET-KHINBAN) IS NULL THEN 0 ELSE MAX(e.SET-KHINBAN) * 1 END + 1, 20, '0') AS SET-KHINBAN FROM M_SETKOSE e WHERE e.SET-KHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.SET-HINBAN = :set-hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("setHinban", this.setHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SET-KHINBAN");

        this.setSetKhinban(o);
    }

    /**
     * M_SETKOSE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // M_SETKOSEの登録
        String sql = "UPDATE M_SETKOSE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("set-hinban = :set-hinban");
        setList.add("set-khinban = :set-khinban");
        setList.add("dltflg = :dltflg");
        setList.add("setinzu = :setinzu");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * M_SETKOSE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // M_SETKOSEの削除
        String sql = "DELETE FROM M_SETKOSE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (set-hinban) = TRIM (:set-hinban)");
        whereList.add("TRIM (set-khinban) = TRIM (:set-khinban)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SET-HINBAN", this.setHinban);
        params.put("SET-KHINBAN", this.setKhinban);
        params.put("DLTFLG", this.dltflg);
        params.put("SETINZU", this.setinzu);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
