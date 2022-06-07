package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_WORK_MNTH_STOCK
 *
 * @author emarfkrow
 */
public class InvWorkMnthStock implements IEntity {

    /** DATA_ID */
    private String dataId;

    /**
     * @return DATA_ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DATA_ID")
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @param o DATA_ID
     */
    public void setDataId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dataId = String.valueOf(o.toString());
        } else {
            this.dataId = null;
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

    /** ROUTING_GROUP */
    private java.math.BigDecimal routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING_GROUP")
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

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING")
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

    /** SUM_LOT_SIZE */
    private java.math.BigDecimal sumLotSize;

    /**
     * @return SUM_LOT_SIZE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUM_LOT_SIZE")
    public java.math.BigDecimal getSumLotSize() {
        return this.sumLotSize;
    }

    /**
     * @param o SUM_LOT_SIZE
     */
    public void setSumLotSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumLotSize = new java.math.BigDecimal(o.toString());
        } else {
            this.sumLotSize = null;
        }
    }

    /**
     * INV_WORK_MNTH_STOCK照会
     *
     * @param param1 DATA_ID
     * @param param2 HINBAN
     * @param param3 ROUTING_GROUP
     * @param param4 ROUTING
     * @return INV_WORK_MNTH_STOCK
     */
    public static InvWorkMnthStock get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"DATA_ID\") = TRIM (:data_id)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");

        String sql = "SELECT * FROM INV_WORK_MNTH_STOCK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("data_id", param1);
        params.put("hinban", param2);
        params.put("routing_group", param3);
        params.put("routing", param4);

        return Queries.get(sql, params, InvWorkMnthStock.class);
    }

    /**
     * INV_WORK_MNTH_STOCK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_WORK_MNTH_STOCKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"DATA_ID\" -- :data_id");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"ROUTING\" -- :routing");
        nameList.add("\"SUM_LOT_SIZE\" -- :sum_lot_size");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_WORK_MNTH_STOCK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":data_id");
        valueList.add(":hinban");
        valueList.add(":routing_group");
        valueList.add(":routing");
        valueList.add(":sum_lot_size");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_WORK_MNTH_STOCK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_WORK_MNTH_STOCKの登録
        String sql = "UPDATE INV_WORK_MNTH_STOCK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"DATA_ID\" = :data_id");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"ROUTING\" = :routing");
        setList.add("\"SUM_LOT_SIZE\" = :sum_lot_size");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_WORK_MNTH_STOCK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_WORK_MNTH_STOCKの削除
        String sql = "DELETE FROM INV_WORK_MNTH_STOCK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"DATA_ID\") = TRIM (:data_id)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("data_id", this.dataId);
        params.put("hinban", this.hinban);
        params.put("routing_group", this.routingGroup);
        params.put("routing", this.routing);
        params.put("sum_lot_size", this.sumLotSize);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
