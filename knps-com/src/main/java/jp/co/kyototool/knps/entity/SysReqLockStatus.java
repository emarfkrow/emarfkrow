package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * SYS_REQ_LOCK_STATUS
 *
 * @author emarfkrow
 */
public class SysReqLockStatus implements IEntity {

    /** GAMEN_ID */
    private String gamenId;

    /**
     * @return GAMEN_ID
     */
    public String getGamenId() {
        return this.gamenId;
    }

    /**
     * @param o GAMEN_ID
     */
    public void setGamenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gamenId = String.valueOf(o.toString());
        } else {
            this.gamenId = null;
        }
    }

    /** USER_ID */
    private String userId;

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param o USER_ID
     */
    public void setUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userId = String.valueOf(o.toString());
        } else {
            this.userId = null;
        }
    }

    /** LOCK_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime lockDate;

    /**
     * @return LOCK_DATE
     */
    public java.time.LocalDateTime getLockDate() {
        return this.lockDate;
    }

    /**
     * @param o LOCK_DATE
     */
    public void setLockDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.lockDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.lockDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lockDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.lockDate = null;
        }
    }

    /**
     * SYS_REQ_LOCK_STATUS照会
     *
     * @param param1 GAMEN_ID
     * @return SYS_REQ_LOCK_STATUS
     */
    public static SysReqLockStatus get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"GAMEN_ID\") = TRIM (:gamen_id)");

        String sql = "SELECT * FROM SYS_REQ_LOCK_STATUS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("gamen_id", param1);

        return Queries.get(sql, params, SysReqLockStatus.class);
    }

    /**
     * SYS_REQ_LOCK_STATUS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // GAMEN_IDの採番処理
        numbering();

        // SYS_REQ_LOCK_STATUSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("gamen_id -- :gamen_id");
        nameList.add("user_id -- :user_id");
        nameList.add("lock_date -- :lock_date");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO SYS_REQ_LOCK_STATUS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":gamen_id");
        valueList.add(":user_id");
        valueList.add("TO_TIMESTAMP (:lock_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join("\r\n    , ", valueList);
    }

    /** GAMEN_IDの採番処理 */
    private void numbering() {

        if (this.gamenId != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.GAMEN_ID) IS NULL THEN 0 ELSE MAX(e.GAMEN_ID) * 1 END + 1, 30, '0') AS GAMEN_ID FROM SYS_REQ_LOCK_STATUS e WHERE e.GAMEN_ID < '999999999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("GAMEN_ID");

        this.setGamenId(o);
    }

    /**
     * SYS_REQ_LOCK_STATUS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // SYS_REQ_LOCK_STATUSの登録
        String sql = "UPDATE SYS_REQ_LOCK_STATUS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("gamen_id = :gamen_id");
        setList.add("user_id = :user_id");
        setList.add("lock_date = TO_TIMESTAMP (:lock_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * SYS_REQ_LOCK_STATUS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // SYS_REQ_LOCK_STATUSの削除
        String sql = "DELETE FROM SYS_REQ_LOCK_STATUS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (gamen_id) = TRIM (:gamen_id)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("GAMEN_ID", this.gamenId);
        params.put("USER_ID", this.userId);
        params.put("LOCK_DATE", this.lockDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
