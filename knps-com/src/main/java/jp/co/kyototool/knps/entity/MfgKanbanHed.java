package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_KANBAN_HED
 *
 * @author emarfkrow
 */
public class MfgKanbanHed implements IEntity {

    /** ROUTING_GROUP */
    private java.math.BigDecimal routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    public java.math.BigDecimal getRoutingGroup() {
        return this.routingGroup;
    }

    /**
     * @param o ROUTING_GROUP
     */
    public void setRoutingGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.routingGroup = null;
        }
    }

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

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    public java.math.BigDecimal getRouting() {
        return this.routing;
    }

    /**
     * @param o ROUTING
     */
    public void setRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing = new java.math.BigDecimal(o.toString());
        } else {
            this.routing = null;
        }
    }

    /** KANBAN_ID_CURRENT */
    private String kanbanIdCurrent;

    /**
     * @return KANBAN_ID_CURRENT
     */
    public String getKanbanIdCurrent() {
        return this.kanbanIdCurrent;
    }

    /**
     * @param o KANBAN_ID_CURRENT
     */
    public void setKanbanIdCurrent(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanIdCurrent = String.valueOf(o.toString());
        } else {
            this.kanbanIdCurrent = null;
        }
    }

    /** KANBAN_ID_NEXT */
    private String kanbanIdNext;

    /**
     * @return KANBAN_ID_NEXT
     */
    public String getKanbanIdNext() {
        return this.kanbanIdNext;
    }

    /**
     * @param o KANBAN_ID_NEXT
     */
    public void setKanbanIdNext(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanIdNext = String.valueOf(o.toString());
        } else {
            this.kanbanIdNext = null;
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

    /** FOR_ROUTING */
    private java.math.BigDecimal forRouting;

    /**
     * @return FOR_ROUTING
     */
    public java.math.BigDecimal getForRouting() {
        return this.forRouting;
    }

    /**
     * @param o FOR_ROUTING
     */
    public void setForRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.forRouting = new java.math.BigDecimal(o.toString());
        } else {
            this.forRouting = null;
        }
    }

    /**
     * MFG_KANBAN_HED照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 ROUTING
     * @return MFG_KANBAN_HED
     */
    public static MfgKanbanHed get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");

        String sql = "SELECT * FROM MFG_KANBAN_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);

        return Queries.get(sql, params, MfgKanbanHed.class);
    }

    /**
     * MFG_KANBAN_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_ROUTING_BKの登録
        if (this.mstRoutingBks != null) {
            for (MstRoutingBk mstRoutingBk : this.mstRoutingBks) {
                mstRoutingBk.setManHinban(this.getManHinban());
                mstRoutingBk.setRoutingGroup(this.getRoutingGroup());
                mstRoutingBk.setRouting(this.getRouting());
                mstRoutingBk.insert(now, id);
            }
        }

        // MST_SUPPLY_LISTの登録
        if (this.mstSupplyLists != null) {
            for (MstSupplyList mstSupplyList : this.mstSupplyLists) {
                mstSupplyList.setManHinban(this.getManHinban());
                mstSupplyList.setRoutingGroup(this.getRoutingGroup());
                mstSupplyList.setRouting(this.getRouting());
                mstSupplyList.insert(now, id);
            }
        }

        // MST_ROUTINGの登録
        if (this.mstRouting != null) {
            this.mstRouting.setManHinban(this.getManHinban());
            this.mstRouting.setRoutingGroup(this.getRoutingGroup());
            this.mstRouting.setRouting(this.getRouting());
            this.mstRouting.insert(now, id);
        }

        // MFG_KANBAN_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"MAN_HINBAN\" -- :man_hinban");
        nameList.add("\"ROUTING\" -- :routing");
        nameList.add("\"KANBAN_ID_CURRENT\" -- :kanban_id_current");
        nameList.add("\"KANBAN_ID_NEXT\" -- :kanban_id_next");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"FOR_ROUTING\" -- :for_routing");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_KANBAN_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":routing_group");
        valueList.add(":man_hinban");
        valueList.add(":routing");
        valueList.add(":kanban_id_current");
        valueList.add(":kanban_id_next");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":for_routing");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_KANBAN_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_ROUTING_BKの登録
        if (this.mstRoutingBks != null) {
            for (MstRoutingBk mstRoutingBk : this.mstRoutingBks) {
                mstRoutingBk.setManHinban(this.manHinban);
                mstRoutingBk.setRoutingGroup(this.routingGroup);
                mstRoutingBk.setRouting(this.routing);
                try {
                    mstRoutingBk.insert(now, id);
                } catch (Exception e) {
                    mstRoutingBk.update(now, id);
                }
            }
            this.mstRoutingBks = null;
            this.referMstRoutingBks();
            if (this.mstRoutingBks != null) {
                for (MstRoutingBk mstRoutingBk : this.mstRoutingBks) {
                    if (!mstRoutingBk.getTimeStampChange().equals(now)) {
                        mstRoutingBk.delete();
                    }
                }
            }
        }

        // MST_SUPPLY_LISTの登録
        if (this.mstSupplyLists != null) {
            for (MstSupplyList mstSupplyList : this.mstSupplyLists) {
                mstSupplyList.setManHinban(this.manHinban);
                mstSupplyList.setRoutingGroup(this.routingGroup);
                mstSupplyList.setRouting(this.routing);
                try {
                    mstSupplyList.insert(now, id);
                } catch (Exception e) {
                    mstSupplyList.update(now, id);
                }
            }
            this.mstSupplyLists = null;
            this.referMstSupplyLists();
            if (this.mstSupplyLists != null) {
                for (MstSupplyList mstSupplyList : this.mstSupplyLists) {
                    if (!mstSupplyList.getTimeStampChange().equals(now)) {
                        mstSupplyList.delete();
                    }
                }
            }
        }

        // MST_ROUTINGの登録
        if (this.mstRouting != null) {
            mstRouting.setManHinban(this.getManHinban());
            mstRouting.setRoutingGroup(this.getRoutingGroup());
            mstRouting.setRouting(this.getRouting());
            try {
                mstRouting.insert(now, id);
            } catch (Exception e) {
                mstRouting.update(now, id);
            }
        }

        // MFG_KANBAN_HEDの登録
        String sql = "UPDATE MFG_KANBAN_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"MAN_HINBAN\" = :man_hinban");
        setList.add("\"ROUTING\" = :routing");
        setList.add("\"KANBAN_ID_CURRENT\" = :kanban_id_current");
        setList.add("\"KANBAN_ID_NEXT\" = :kanban_id_next");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"FOR_ROUTING\" = :for_routing");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_KANBAN_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_ROUTING_BKの削除
        if (this.mstRoutingBks != null) {
            for (MstRoutingBk mstRoutingBk : this.mstRoutingBks) {
                mstRoutingBk.delete();
            }
        }

        // MST_SUPPLY_LISTの削除
        if (this.mstSupplyLists != null) {
            for (MstSupplyList mstSupplyList : this.mstSupplyLists) {
                mstSupplyList.delete();
            }
        }

        // MST_ROUTINGの削除
        if (this.mstRouting != null) {
            this.mstRouting.delete();
        }

        // MFG_KANBAN_HEDの削除
        String sql = "DELETE FROM MFG_KANBAN_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("routing_group", this.routingGroup);
        params.put("man_hinban", this.manHinban);
        params.put("routing", this.routing);
        params.put("kanban_id_current", this.kanbanIdCurrent);
        params.put("kanban_id_next", this.kanbanIdNext);
        params.put("for_routing", this.forRouting);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_ROUTING
     */
    private MstRouting mstRouting;

    /**
     * @return MST_ROUTING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstRouting")
    public MstRouting getMstRouting() {
        return this.mstRouting;
    }

    /**
     * @param p MST_ROUTING
     */
    public void setMstRouting(final MstRouting p) {
        this.mstRouting = p;
    }

    /**
     * @return MST_ROUTING
     */
    public MstRouting referMstRouting() {
        if (this.mstRouting == null) {
            try {
                this.mstRouting = MstRouting.get(this.manHinban, this.routingGroup, this.routing);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mstRouting;
    }

    /**
     * MST_ROUTING_BKのリスト
     */
    private List<MstRoutingBk> mstRoutingBks;

    /**
     * @return MST_ROUTING_BKのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstRoutingBks")
    public List<MstRoutingBk> getMstRoutingBks() {
        return this.mstRoutingBks;
    }

    /**
     * @param list MST_ROUTING_BKのリスト
     */
    public void setMstRoutingBks(final List<MstRoutingBk> list) {
        this.mstRoutingBks = list;
    }

    /**
     * @param mstRoutingBk
     */
    public void addMstRoutingBks(final MstRoutingBk mstRoutingBk) {
        if (this.mstRoutingBks == null) {
            this.mstRoutingBks = new ArrayList<MstRoutingBk>();
        }
        this.mstRoutingBks.add(mstRoutingBk);
    }

    /**
     * @return MST_ROUTING_BKのリスト
     */
    public List<MstRoutingBk> referMstRoutingBks() {
        if (this.mstRoutingBks == null) {
            this.mstRoutingBks = MfgKanbanHed.referMstRoutingBks(this.manHinban, this.routingGroup, this.routing);
        }
        return this.mstRoutingBks;
    }

    /**
     * @param param1 manHinban
     * @param param2 routingGroup
     * @param param3 routing
     * @return List<MstRoutingBk>
     */
    public static List<MstRoutingBk> referMstRoutingBks(final String param1, final java.math.BigDecimal param2, final java.math.BigDecimal param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("man_hinban = :man_hinban");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");

        String sql = "SELECT * FROM MST_ROUTING_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);

        return Queries.select(sql, params, MstRoutingBk.class);
    }

    /**
     * MST_SUPPLY_LISTのリスト
     */
    private List<MstSupplyList> mstSupplyLists;

    /**
     * @return MST_SUPPLY_LISTのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupplyLists")
    public List<MstSupplyList> getMstSupplyLists() {
        return this.mstSupplyLists;
    }

    /**
     * @param list MST_SUPPLY_LISTのリスト
     */
    public void setMstSupplyLists(final List<MstSupplyList> list) {
        this.mstSupplyLists = list;
    }

    /**
     * @param mstSupplyList
     */
    public void addMstSupplyLists(final MstSupplyList mstSupplyList) {
        if (this.mstSupplyLists == null) {
            this.mstSupplyLists = new ArrayList<MstSupplyList>();
        }
        this.mstSupplyLists.add(mstSupplyList);
    }

    /**
     * @return MST_SUPPLY_LISTのリスト
     */
    public List<MstSupplyList> referMstSupplyLists() {
        if (this.mstSupplyLists == null) {
            this.mstSupplyLists = MfgKanbanHed.referMstSupplyLists(this.manHinban, this.routingGroup, this.routing);
        }
        return this.mstSupplyLists;
    }

    /**
     * @param param1 manHinban
     * @param param2 routingGroup
     * @param param3 routing
     * @return List<MstSupplyList>
     */
    public static List<MstSupplyList> referMstSupplyLists(final String param1, final java.math.BigDecimal param2, final java.math.BigDecimal param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("man_hinban = :man_hinban");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");

        String sql = "SELECT * FROM MST_SUPPLY_LIST WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);

        return Queries.select(sql, params, MstSupplyList.class);
    }
}
