package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUPPLY_LIST
 *
 * @author emarfkrow
 */
public class MstSupplyList implements IEntity {

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

    /** SUPPLY_HINBAN */
    private String supplyHinban;

    /**
     * @return SUPPLY_HINBAN
     */
    public String getSupplyHinban() {
        return this.supplyHinban;
    }

    /**
     * @param o SUPPLY_HINBAN
     */
    public void setSupplyHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyHinban = String.valueOf(o.toString());
        } else {
            this.supplyHinban = null;
        }
    }

    /** COUNTS */
    private java.math.BigDecimal counts;

    /**
     * @return COUNTS
     */
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

    /** SUPPLY_KBN */
    private java.math.BigDecimal supplyKbn;

    /**
     * @return SUPPLY_KBN
     */
    public java.math.BigDecimal getSupplyKbn() {
        return this.supplyKbn;
    }

    /**
     * @param o SUPPLY_KBN
     */
    public void setSupplyKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyKbn = null;
        }
    }

    /** STAN_COUNTS */
    private java.math.BigDecimal stanCounts;

    /**
     * @return STAN_COUNTS
     */
    public java.math.BigDecimal getStanCounts() {
        return this.stanCounts;
    }

    /**
     * @param o STAN_COUNTS
     */
    public void setStanCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stanCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.stanCounts = null;
        }
    }

    /** UNIT_SUPPLY */
    private java.math.BigDecimal unitSupply;

    /**
     * @return UNIT_SUPPLY
     */
    public java.math.BigDecimal getUnitSupply() {
        return this.unitSupply;
    }

    /**
     * @param o UNIT_SUPPLY
     */
    public void setUnitSupply(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitSupply = new java.math.BigDecimal(o.toString());
        } else {
            this.unitSupply = null;
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
     * MST_SUPPLY_LIST照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 ROUTING
     * @param param4 SUPPLY_HINBAN
     * @return MST_SUPPLY_LIST
     */
    public static MstSupplyList get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");
        whereList.add("TRIM (supply_hinban) = TRIM (:supply_hinban)");

        String sql = "SELECT * FROM MST_SUPPLY_LIST WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);
        params.put("supply_hinban", param4);

        return Queries.get(sql, params, MstSupplyList.class);
    }

    /**
     * MST_SUPPLY_LIST追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SUPPLY_HINBANの採番処理
        numbering();

        // MST_SUPPLY_LIST_BKの登録
        if (this.mstSupplyListBks != null) {
            for (MstSupplyListBk mstSupplyListBk : this.mstSupplyListBks) {
                mstSupplyListBk.setManHinban(this.getManHinban());
                mstSupplyListBk.setRoutingGroup(this.getRoutingGroup());
                mstSupplyListBk.setRouting(this.getRouting());
                mstSupplyListBk.setSupplyHinban(this.getSupplyHinban());
                mstSupplyListBk.insert(now, id);
            }
        }

        // MST_SUPPLY_LIST_HSの登録
        if (this.mstSupplyListHss != null) {
            for (MstSupplyListHs mstSupplyListHs : this.mstSupplyListHss) {
                mstSupplyListHs.setManHinban(this.getManHinban());
                mstSupplyListHs.setRoutingGroup(this.getRoutingGroup());
                mstSupplyListHs.setRouting(this.getRouting());
                mstSupplyListHs.setSupplyHinban(this.getSupplyHinban());
                mstSupplyListHs.insert(now, id);
            }
        }

        // MST_SUPPLY_LISTの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("routing_group -- :routing_group");
        nameList.add("man_hinban -- :man_hinban");
        nameList.add("routing -- :routing");
        nameList.add("supply_hinban -- :supply_hinban");
        nameList.add("counts -- :counts");
        nameList.add("supply_kbn -- :supply_kbn");
        nameList.add("stan_counts -- :stan_counts");
        nameList.add("unit_supply -- :unit_supply");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUPPLY_LIST(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":routing_group");
        valueList.add(":man_hinban");
        valueList.add(":routing");
        valueList.add(":supply_hinban");
        valueList.add(":counts");
        valueList.add(":supply_kbn");
        valueList.add(":stan_counts");
        valueList.add(":unit_supply");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** SUPPLY_HINBANの採番処理 */
    private void numbering() {

        if (this.supplyHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SUPPLY_HINBAN) IS NULL THEN 0 ELSE MAX(e.SUPPLY_HINBAN) * 1 END + 1, 25, '0') AS SUPPLY_HINBAN FROM MST_SUPPLY_LIST e WHERE e.SUPPLY_HINBAN < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.MAN_HINBAN = :man_hinban");
        whereList.add("e.ROUTING_GROUP = :routing_group");
        whereList.add("e.ROUTING = :routing");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("manHinban", this.manHinban);
        params.put("routingGroup", this.routingGroup);
        params.put("routing", this.routing);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SUPPLY_HINBAN");

        this.setSupplyHinban(o);
    }

    /**
     * MST_SUPPLY_LIST更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SUPPLY_LIST_BKの登録
        if (this.mstSupplyListBks != null) {
            for (MstSupplyListBk mstSupplyListBk : this.mstSupplyListBks) {
                mstSupplyListBk.setManHinban(this.manHinban);
                mstSupplyListBk.setRoutingGroup(this.routingGroup);
                mstSupplyListBk.setRouting(this.routing);
                mstSupplyListBk.setSupplyHinban(this.supplyHinban);
                try {
                    mstSupplyListBk.insert(now, id);
                } catch (Exception e) {
                    mstSupplyListBk.update(now, id);
                }
            }
            this.mstSupplyListBks = null;
            this.referMstSupplyListBks();
            if (this.mstSupplyListBks != null) {
                for (MstSupplyListBk mstSupplyListBk : this.mstSupplyListBks) {
                    if (!mstSupplyListBk.getTimeStampChange().equals(now)) {
                        mstSupplyListBk.delete();
                    }
                }
            }
        }

        // MST_SUPPLY_LIST_HSの登録
        if (this.mstSupplyListHss != null) {
            for (MstSupplyListHs mstSupplyListHs : this.mstSupplyListHss) {
                mstSupplyListHs.setManHinban(this.manHinban);
                mstSupplyListHs.setRoutingGroup(this.routingGroup);
                mstSupplyListHs.setRouting(this.routing);
                mstSupplyListHs.setSupplyHinban(this.supplyHinban);
                try {
                    mstSupplyListHs.insert(now, id);
                } catch (Exception e) {
                    mstSupplyListHs.update(now, id);
                }
            }
            this.mstSupplyListHss = null;
            this.referMstSupplyListHss();
            if (this.mstSupplyListHss != null) {
                for (MstSupplyListHs mstSupplyListHs : this.mstSupplyListHss) {
                    if (!mstSupplyListHs.getTimeStampChange().equals(now)) {
                        mstSupplyListHs.delete();
                    }
                }
            }
        }

        // MST_SUPPLY_LISTの登録
        String sql = "UPDATE MST_SUPPLY_LIST\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("routing_group = :routing_group");
        setList.add("man_hinban = :man_hinban");
        setList.add("routing = :routing");
        setList.add("supply_hinban = :supply_hinban");
        setList.add("counts = :counts");
        setList.add("supply_kbn = :supply_kbn");
        setList.add("stan_counts = :stan_counts");
        setList.add("unit_supply = :unit_supply");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUPPLY_LIST削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SUPPLY_LIST_BKの削除
        if (this.mstSupplyListBks != null) {
            for (MstSupplyListBk mstSupplyListBk : this.mstSupplyListBks) {
                mstSupplyListBk.delete();
            }
        }

        // MST_SUPPLY_LIST_HSの削除
        if (this.mstSupplyListHss != null) {
            for (MstSupplyListHs mstSupplyListHs : this.mstSupplyListHss) {
                mstSupplyListHs.delete();
            }
        }

        // MST_SUPPLY_LISTの削除
        String sql = "DELETE FROM MST_SUPPLY_LIST WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");
        whereList.add("TRIM (supply_hinban) = TRIM (:supply_hinban)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ROUTING_GROUP", this.routingGroup);
        params.put("MAN_HINBAN", this.manHinban);
        params.put("ROUTING", this.routing);
        params.put("SUPPLY_HINBAN", this.supplyHinban);
        params.put("COUNTS", this.counts);
        params.put("SUPPLY_KBN", this.supplyKbn);
        params.put("STAN_COUNTS", this.stanCounts);
        params.put("UNIT_SUPPLY", this.unitSupply);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_SUPPLY_LIST_BKのリスト
     */
    private List<MstSupplyListBk> mstSupplyListBks;

    /**
     * @return MST_SUPPLY_LIST_BKのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupplyListBks")
    public List<MstSupplyListBk> getMstSupplyListBks() {
        return this.mstSupplyListBks;
    }

    /**
     * @param list MST_SUPPLY_LIST_BKのリスト
     */
    public void setMstSupplyListBks(final List<MstSupplyListBk> list) {
        this.mstSupplyListBks = list;
    }

    /**
     * @param mstSupplyListBk
     */
    public void addMstSupplyListBks(final MstSupplyListBk mstSupplyListBk) {
        if (this.mstSupplyListBks == null) {
            this.mstSupplyListBks = new ArrayList<MstSupplyListBk>();
        }
        this.mstSupplyListBks.add(mstSupplyListBk);
    }

    /**
     * @return MST_SUPPLY_LIST_BKのリスト
     */
    public List<MstSupplyListBk> referMstSupplyListBks() {
        if (this.mstSupplyListBks == null) {
            this.mstSupplyListBks = MstSupplyList.referMstSupplyListBks(this.manHinban, this.routingGroup, this.routing, this.supplyHinban);
        }
        return this.mstSupplyListBks;
    }

    /**
     * @param param1 manHinban
     * @param param2 routingGroup
     * @param param3 routing
     * @param param4 supplyHinban
     * @return List<MstSupplyListBk>
     */
    public static List<MstSupplyListBk> referMstSupplyListBks(final String param1, final java.math.BigDecimal param2, final java.math.BigDecimal param3, final String param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("man_hinban = :man_hinban");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");
        whereList.add("supply_hinban = :supply_hinban");

        String sql = "SELECT * FROM MST_SUPPLY_LIST_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);
        params.put("supply_hinban", param4);

        return Queries.select(sql, params, MstSupplyListBk.class);
    }

    /**
     * MST_SUPPLY_LIST_HSのリスト
     */
    private List<MstSupplyListHs> mstSupplyListHss;

    /**
     * @return MST_SUPPLY_LIST_HSのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupplyListHss")
    public List<MstSupplyListHs> getMstSupplyListHss() {
        return this.mstSupplyListHss;
    }

    /**
     * @param list MST_SUPPLY_LIST_HSのリスト
     */
    public void setMstSupplyListHss(final List<MstSupplyListHs> list) {
        this.mstSupplyListHss = list;
    }

    /**
     * @param mstSupplyListHs
     */
    public void addMstSupplyListHss(final MstSupplyListHs mstSupplyListHs) {
        if (this.mstSupplyListHss == null) {
            this.mstSupplyListHss = new ArrayList<MstSupplyListHs>();
        }
        this.mstSupplyListHss.add(mstSupplyListHs);
    }

    /**
     * @return MST_SUPPLY_LIST_HSのリスト
     */
    public List<MstSupplyListHs> referMstSupplyListHss() {
        if (this.mstSupplyListHss == null) {
            this.mstSupplyListHss = MstSupplyList.referMstSupplyListHss(this.manHinban, this.routingGroup, this.routing, this.supplyHinban);
        }
        return this.mstSupplyListHss;
    }

    /**
     * @param param1 manHinban
     * @param param2 routingGroup
     * @param param3 routing
     * @param param4 supplyHinban
     * @return List<MstSupplyListHs>
     */
    public static List<MstSupplyListHs> referMstSupplyListHss(final String param1, final java.math.BigDecimal param2, final java.math.BigDecimal param3, final String param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("man_hinban = :man_hinban");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");
        whereList.add("supply_hinban = :supply_hinban");

        String sql = "SELECT * FROM MST_SUPPLY_LIST_HS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);
        params.put("supply_hinban", param4);

        return Queries.select(sql, params, MstSupplyListHs.class);
    }
}
