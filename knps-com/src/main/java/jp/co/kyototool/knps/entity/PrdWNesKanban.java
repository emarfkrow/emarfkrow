package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_W_NES_KANBAN
 *
 * @author emarfkrow
 */
public class PrdWNesKanban implements IEntity {

    /** PRO_HINBAN */
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    public String getProHinban() {
        return this.proHinban;
    }

    /**
     * @param o PRO_HINBAN
     */
    public void setProHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proHinban = String.valueOf(o.toString());
        } else {
            this.proHinban = null;
        }
    }

    /** STORE_WC */
    private String storeWc;

    /**
     * @return STORE_WC
     */
    public String getStoreWc() {
        return this.storeWc;
    }

    /**
     * @param o STORE_WC
     */
    public void setStoreWc(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.storeWc = String.valueOf(o.toString());
        } else {
            this.storeWc = null;
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

    /** ROUTING_DEF_GROUP */
    private java.math.BigDecimal routingDefGroup;

    /**
     * @return ROUTING_DEF_GROUP
     */
    public java.math.BigDecimal getRoutingDefGroup() {
        return this.routingDefGroup;
    }

    /**
     * @param o ROUTING_DEF_GROUP
     */
    public void setRoutingDefGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingDefGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.routingDefGroup = null;
        }
    }

    /** STORE_OPE_DETAIL */
    private String storeOpeDetail;

    /**
     * @return STORE_OPE_DETAIL
     */
    public String getStoreOpeDetail() {
        return this.storeOpeDetail;
    }

    /**
     * @param o STORE_OPE_DETAIL
     */
    public void setStoreOpeDetail(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.storeOpeDetail = String.valueOf(o.toString());
        } else {
            this.storeOpeDetail = null;
        }
    }

    /** PRO_NES_COUNTS */
    private java.math.BigDecimal proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
    public java.math.BigDecimal getProNesCounts() {
        return this.proNesCounts;
    }

    /**
     * @param o PRO_NES_COUNTS
     */
    public void setProNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.proNesCounts = null;
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

    /** LOT_SIZE */
    private java.math.BigDecimal lotSize;

    /**
     * @return LOT_SIZE
     */
    public java.math.BigDecimal getLotSize() {
        return this.lotSize;
    }

    /**
     * @param o LOT_SIZE
     */
    public void setLotSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lotSize = new java.math.BigDecimal(o.toString());
        } else {
            this.lotSize = null;
        }
    }

    /** ACC_COUNTS */
    private java.math.BigDecimal accCounts;

    /**
     * @return ACC_COUNTS
     */
    public java.math.BigDecimal getAccCounts() {
        return this.accCounts;
    }

    /**
     * @param o ACC_COUNTS
     */
    public void setAccCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.accCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.accCounts = null;
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

    /**
     * PRD_W_NES_KANBAN照会
     *
     * @param param1 PRO_HINBAN
     * @param param2 ROUTING
     * @param param3 ROUTING_DEF_GROUP
     * @return PRD_W_NES_KANBAN
     */
    public static PrdWNesKanban get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_HINBAN\") = TRIM (:pro_hinban)");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("\"ROUTING_DEF_GROUP\" = :routing_def_group");

        String sql = "SELECT * FROM PRD_W_NES_KANBAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_hinban", param1);
        params.put("routing", param2);
        params.put("routing_def_group", param3);

        return Queries.get(sql, params, PrdWNesKanban.class);
    }

    /**
     * PRD_W_NES_KANBAN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_W_NES_KANBAN_OLDの登録
        if (this.prdWNesKanbanOld != null) {
            this.prdWNesKanbanOld.setProHinban(this.getProHinban());
            this.prdWNesKanbanOld.setRouting(this.getRouting());
            this.prdWNesKanbanOld.setRoutingDefGroup(this.getRoutingDefGroup());
            this.prdWNesKanbanOld.insert(now, id);
        }

        // PRD_W_NES_KANBANの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("pro_hinban -- :pro_hinban");
        nameList.add("store_wc -- :store_wc");
        nameList.add("routing -- :routing");
        nameList.add("routing_def_group -- :routing_def_group");
        nameList.add("store_ope_detail -- :store_ope_detail");
        nameList.add("pro_nes_counts -- :pro_nes_counts");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("lot_size -- :lot_size");
        nameList.add("acc_counts -- :acc_counts");
        nameList.add("counts -- :counts");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_W_NES_KANBAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pro_hinban");
        valueList.add(":store_wc");
        valueList.add(":routing");
        valueList.add(":routing_def_group");
        valueList.add(":store_ope_detail");
        valueList.add(":pro_nes_counts");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":lot_size");
        valueList.add(":acc_counts");
        valueList.add(":counts");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_W_NES_KANBAN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_W_NES_KANBAN_OLDの登録
        if (this.prdWNesKanbanOld != null) {
            prdWNesKanbanOld.setProHinban(this.getProHinban());
            prdWNesKanbanOld.setRouting(this.getRouting());
            prdWNesKanbanOld.setRoutingDefGroup(this.getRoutingDefGroup());
            try {
                prdWNesKanbanOld.insert(now, id);
            } catch (Exception e) {
                prdWNesKanbanOld.update(now, id);
            }
        }

        // PRD_W_NES_KANBANの登録
        String sql = "UPDATE PRD_W_NES_KANBAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("pro_hinban = :pro_hinban");
        setList.add("store_wc = :store_wc");
        setList.add("routing = :routing");
        setList.add("routing_def_group = :routing_def_group");
        setList.add("store_ope_detail = :store_ope_detail");
        setList.add("pro_nes_counts = :pro_nes_counts");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("lot_size = :lot_size");
        setList.add("acc_counts = :acc_counts");
        setList.add("counts = :counts");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_W_NES_KANBAN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_W_NES_KANBAN_OLDの削除
        if (this.prdWNesKanbanOld != null) {
            this.prdWNesKanbanOld.delete();
        }

        // PRD_W_NES_KANBANの削除
        String sql = "DELETE FROM PRD_W_NES_KANBAN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pro_hinban) = TRIM (:pro_hinban)");
        whereList.add("routing = :routing");
        whereList.add("routing_def_group = :routing_def_group");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PRO_HINBAN", this.proHinban);
        params.put("STORE_WC", this.storeWc);
        params.put("ROUTING", this.routing);
        params.put("ROUTING_DEF_GROUP", this.routingDefGroup);
        params.put("STORE_OPE_DETAIL", this.storeOpeDetail);
        params.put("PRO_NES_COUNTS", this.proNesCounts);
        params.put("LOT_SIZE", this.lotSize);
        params.put("ACC_COUNTS", this.accCounts);
        params.put("COUNTS", this.counts);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_W_NES_KANBAN_OLD
     */
    private PrdWNesKanbanOld prdWNesKanbanOld;

    /**
     * @return PRD_W_NES_KANBAN_OLD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdWNesKanbanOld")
    public PrdWNesKanbanOld getPrdWNesKanbanOld() {
        return this.prdWNesKanbanOld;
    }

    /**
     * @param p PRD_W_NES_KANBAN_OLD
     */
    public void setPrdWNesKanbanOld(final PrdWNesKanbanOld p) {
        this.prdWNesKanbanOld = p;
    }

    /**
     * @return PRD_W_NES_KANBAN_OLD
     */
    public PrdWNesKanbanOld referPrdWNesKanbanOld() {
        if (this.prdWNesKanbanOld == null) {
            try {
                this.prdWNesKanbanOld = PrdWNesKanbanOld.get(this.proHinban, this.routing, this.routingDefGroup);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdWNesKanbanOld;
    }
}
