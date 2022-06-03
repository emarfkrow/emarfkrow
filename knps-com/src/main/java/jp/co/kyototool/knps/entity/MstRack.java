package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_RACK
 *
 * @author emarfkrow
 */
public class MstRack implements IEntity {

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
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

    /** RACK_NAME */
    private String rackName;

    /**
     * @return RACK_NAME
     */
    public String getRackName() {
        return this.rackName;
    }

    /**
     * @param o RACK_NAME
     */
    public void setRackName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rackName = String.valueOf(o.toString());
        } else {
            this.rackName = null;
        }
    }

    /** KAKESU */
    private java.math.BigDecimal kakesu;

    /**
     * @return KAKESU
     */
    public java.math.BigDecimal getKakesu() {
        return this.kakesu;
    }

    /**
     * @param o KAKESU
     */
    public void setKakesu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakesu = new java.math.BigDecimal(o.toString());
        } else {
            this.kakesu = null;
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
     * MST_RACK照会
     *
     * @param param1 MAN_HINBAN
     * @return MST_RACK
     */
    public static MstRack get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");

        String sql = "SELECT * FROM MST_RACK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);

        return Queries.get(sql, params, MstRack.class);
    }

    /**
     * MST_RACK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MAN_HINBANの採番処理
        numbering();

        // MST_ROUTING_DEFの登録
        if (this.mstRoutingDefs != null) {
            for (MstRoutingDef mstRoutingDef : this.mstRoutingDefs) {
                mstRoutingDef.setManHinban(this.getManHinban());
                mstRoutingDef.insert(now, id);
            }
        }

        // MST_STRUCTUREの登録
        if (this.mstStructures != null) {
            for (MstStructure mstStructure : this.mstStructures) {
                mstStructure.setManHinban(this.getManHinban());
                mstStructure.insert(now, id);
            }
        }

        // MST_RACKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("man_hinban -- :man_hinban");
        nameList.add("rack_name -- :rack_name");
        nameList.add("kakesu -- :kakesu");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_RACK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":man_hinban");
        valueList.add(":rack_name");
        valueList.add(":kakesu");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** MAN_HINBANの採番処理 */
    private void numbering() {

        if (this.manHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.MAN_HINBAN) IS NULL THEN 0 ELSE MAX(e.MAN_HINBAN) * 1 END + 1, 25, '0') AS MAN_HINBAN FROM MST_RACK e WHERE e.MAN_HINBAN < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MAN_HINBAN");

        this.setManHinban(o);
    }

    /**
     * MST_RACK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_ROUTING_DEFの登録
        if (this.mstRoutingDefs != null) {
            for (MstRoutingDef mstRoutingDef : this.mstRoutingDefs) {
                mstRoutingDef.setManHinban(this.manHinban);
                try {
                    mstRoutingDef.insert(now, id);
                } catch (Exception e) {
                    mstRoutingDef.update(now, id);
                }
            }
            this.mstRoutingDefs = null;
            this.referMstRoutingDefs();
            if (this.mstRoutingDefs != null) {
                for (MstRoutingDef mstRoutingDef : this.mstRoutingDefs) {
                    if (!mstRoutingDef.getTimeStampChange().equals(now)) {
                        mstRoutingDef.delete();
                    }
                }
            }
        }

        // MST_STRUCTUREの登録
        if (this.mstStructures != null) {
            for (MstStructure mstStructure : this.mstStructures) {
                mstStructure.setManHinban(this.manHinban);
                try {
                    mstStructure.insert(now, id);
                } catch (Exception e) {
                    mstStructure.update(now, id);
                }
            }
            this.mstStructures = null;
            this.referMstStructures();
            if (this.mstStructures != null) {
                for (MstStructure mstStructure : this.mstStructures) {
                    if (!mstStructure.getTimeStampChange().equals(now)) {
                        mstStructure.delete();
                    }
                }
            }
        }

        // MST_RACKの登録
        String sql = "UPDATE MST_RACK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("man_hinban = :man_hinban");
        setList.add("rack_name = :rack_name");
        setList.add("kakesu = :kakesu");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_RACK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_ROUTING_DEFの削除
        if (this.mstRoutingDefs != null) {
            for (MstRoutingDef mstRoutingDef : this.mstRoutingDefs) {
                mstRoutingDef.delete();
            }
        }

        // MST_STRUCTUREの削除
        if (this.mstStructures != null) {
            for (MstStructure mstStructure : this.mstStructures) {
                mstStructure.delete();
            }
        }

        // MST_RACKの削除
        String sql = "DELETE FROM MST_RACK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("MAN_HINBAN", this.manHinban);
        params.put("RACK_NAME", this.rackName);
        params.put("KAKESU", this.kakesu);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_ROUTING_DEFのリスト
     */
    private List<MstRoutingDef> mstRoutingDefs;

    /**
     * @return MST_ROUTING_DEFのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstRoutingDefs")
    public List<MstRoutingDef> getMstRoutingDefs() {
        return this.mstRoutingDefs;
    }

    /**
     * @param list MST_ROUTING_DEFのリスト
     */
    public void setMstRoutingDefs(final List<MstRoutingDef> list) {
        this.mstRoutingDefs = list;
    }

    /**
     * @param mstRoutingDef
     */
    public void addMstRoutingDefs(final MstRoutingDef mstRoutingDef) {
        if (this.mstRoutingDefs == null) {
            this.mstRoutingDefs = new ArrayList<MstRoutingDef>();
        }
        this.mstRoutingDefs.add(mstRoutingDef);
    }

    /**
     * @return MST_ROUTING_DEFのリスト
     */
    public List<MstRoutingDef> referMstRoutingDefs() {
        if (this.mstRoutingDefs == null) {
            this.mstRoutingDefs = MstRack.referMstRoutingDefs(this.manHinban);
        }
        return this.mstRoutingDefs;
    }

    /**
     * @param param1 manHinban
     * @return List<MstRoutingDef>
     */
    public static List<MstRoutingDef> referMstRoutingDefs(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("man_hinban = :man_hinban");

        String sql = "SELECT * FROM MST_ROUTING_DEF WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);

        return Queries.select(sql, params, MstRoutingDef.class);
    }

    /**
     * MST_STRUCTUREのリスト
     */
    private List<MstStructure> mstStructures;

    /**
     * @return MST_STRUCTUREのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstStructures")
    public List<MstStructure> getMstStructures() {
        return this.mstStructures;
    }

    /**
     * @param list MST_STRUCTUREのリスト
     */
    public void setMstStructures(final List<MstStructure> list) {
        this.mstStructures = list;
    }

    /**
     * @param mstStructure
     */
    public void addMstStructures(final MstStructure mstStructure) {
        if (this.mstStructures == null) {
            this.mstStructures = new ArrayList<MstStructure>();
        }
        this.mstStructures.add(mstStructure);
    }

    /**
     * @return MST_STRUCTUREのリスト
     */
    public List<MstStructure> referMstStructures() {
        if (this.mstStructures == null) {
            this.mstStructures = MstRack.referMstStructures(this.manHinban);
        }
        return this.mstStructures;
    }

    /**
     * @param param1 manHinban
     * @return List<MstStructure>
     */
    public static List<MstStructure> referMstStructures(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("man_hinban = :man_hinban");

        String sql = "SELECT * FROM MST_STRUCTURE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);

        return Queries.select(sql, params, MstStructure.class);
    }
}
