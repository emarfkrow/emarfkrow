package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_STRUCTURE
 *
 * @author emarfkrow
 */
public class MstStructure implements IEntity {

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAN_HINBAN")
    public String getManHinban() {
        return this.manHinban;
    }

    /**
     * @param o MAN_HINBAN
     */
    public void setManHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.manHinban = String.valueOf(o.toString());
        } else {
            this.manHinban = null;
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

    /** COUNTS */
    private java.math.BigDecimal counts;

    /**
     * @return COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COUNTS")
    public java.math.BigDecimal getCounts() {
        return this.counts;
    }

    /**
     * @param o COUNTS
     */
    public void setCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.counts = new java.math.BigDecimal(o.toString());
        } else {
            this.counts = null;
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
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

    /** BOZAI_F */
    private String bozaiF;

    /**
     * @return BOZAI_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BOZAI_F")
    public String getBozaiF() {
        return this.bozaiF;
    }

    /**
     * @param o BOZAI_F
     */
    public void setBozaiF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bozaiF = String.valueOf(o.toString());
        } else {
            this.bozaiF = null;
        }
    }

    /**
     * MST_STRUCTURE照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 HINBAN
     * @return MST_STRUCTURE
     */
    public static MstStructure get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");

        String sql = "SELECT * FROM MST_STRUCTURE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("hinban", param2);

        return Queries.get(sql, params, MstStructure.class);
    }

    /**
     * MST_STRUCTURE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // HINBANの採番処理
        numbering();

        // MST_STRUCTURE_BKの登録
        if (this.mstStructureBks != null) {
            for (MstStructureBk mstStructureBk : this.mstStructureBks) {
                mstStructureBk.setManHinban(this.getManHinban());
                mstStructureBk.setHinban(this.getHinban());
                mstStructureBk.insert(now, id);
            }
        }

        // MST_STRUCTUREの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"MAN_HINBAN\" -- :man_hinban");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"COUNTS\" -- :counts");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"BOZAI_F\" -- :bozai_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_STRUCTURE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":man_hinban");
        valueList.add(":hinban");
        valueList.add(":counts");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":bozai_f");
        return String.join("\r\n    , ", valueList);
    }

    /** HINBANの採番処理 */
    private void numbering() {

        if (this.hinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"HINBAN\") IS NULL THEN 0 ELSE MAX(e.\"HINBAN\") * 1 END + 1, 25, '0') AS \"HINBAN\" FROM MST_STRUCTURE e WHERE e.\"HINBAN\" < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"MAN_HINBAN\" = :man_hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("man_hinban", this.manHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HINBAN");

        this.setHinban(o);
    }

    /**
     * MST_STRUCTURE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_STRUCTURE_BKの登録
        if (this.mstStructureBks != null) {
            for (MstStructureBk mstStructureBk : this.mstStructureBks) {
                mstStructureBk.setManHinban(this.manHinban);
                mstStructureBk.setHinban(this.hinban);
                try {
                    mstStructureBk.insert(now, id);
                } catch (Exception e) {
                    mstStructureBk.update(now, id);
                }
            }
            this.mstStructureBks = null;
            this.referMstStructureBks();
            if (this.mstStructureBks != null) {
                for (MstStructureBk mstStructureBk : this.mstStructureBks) {
                    if (!mstStructureBk.getTimeStampChange().equals(now)) {
                        mstStructureBk.delete();
                    }
                }
            }
        }

        // MST_STRUCTUREの登録
        String sql = "UPDATE MST_STRUCTURE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"MAN_HINBAN\" = :man_hinban");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"COUNTS\" = :counts");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"BOZAI_F\" = :bozai_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_STRUCTURE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_STRUCTURE_BKの削除
        if (this.mstStructureBks != null) {
            for (MstStructureBk mstStructureBk : this.mstStructureBks) {
                mstStructureBk.delete();
            }
        }

        // MST_STRUCTUREの削除
        String sql = "DELETE FROM MST_STRUCTURE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", this.manHinban);
        params.put("hinban", this.hinban);
        params.put("counts", this.counts);
        params.put("delete_flag", this.deleteFlag);
        params.put("bozai_f", this.bozaiF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_STRUCTURE_BKのリスト
     */
    private List<MstStructureBk> mstStructureBks;

    /**
     * @return MST_STRUCTURE_BKのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstStructureBks")
    public List<MstStructureBk> getMstStructureBks() {
        return this.mstStructureBks;
    }

    /**
     * @param list MST_STRUCTURE_BKのリスト
     */
    public void setMstStructureBks(final List<MstStructureBk> list) {
        this.mstStructureBks = list;
    }

    /**
     * @param mstStructureBk
     */
    public void addMstStructureBks(final MstStructureBk mstStructureBk) {
        if (this.mstStructureBks == null) {
            this.mstStructureBks = new ArrayList<MstStructureBk>();
        }
        this.mstStructureBks.add(mstStructureBk);
    }

    /**
     * @return MST_STRUCTURE_BKのリスト
     */
    public List<MstStructureBk> referMstStructureBks() {
        if (this.mstStructureBks == null) {
            this.mstStructureBks = MstStructure.referMstStructureBks(this.manHinban, this.hinban);
        }
        return this.mstStructureBks;
    }

    /**
     * @param param1 manHinban
     * @param param2 hinban
     * @return List<MstStructureBk>
     */
    public static List<MstStructureBk> referMstStructureBks(final String param1, final String param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("man_hinban = :man_hinban");
        whereList.add("hinban = :hinban");

        String sql = "SELECT * FROM MST_STRUCTURE_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("hinban", param2);

        return Queries.select(sql, params, MstStructureBk.class);
    }
}
