package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STOCK_PROCESS_WK
 *
 * @author emarfkrow
 */
public class InvStockProcessWk implements IEntity {

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
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

    /** ITEM */
    private String item;

    /**
     * @return ITEM
     */
    public String getItem() {
        return this.item;
    }

    /**
     * @param o ITEM
     */
    public void setItem(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.item = String.valueOf(o.toString());
        } else {
            this.item = null;
        }
    }

    /** ITEM_KBN */
    private java.math.BigDecimal itemKbn;

    /**
     * @return ITEM_KBN
     */
    public java.math.BigDecimal getItemKbn() {
        return this.itemKbn;
    }

    /**
     * @param o ITEM_KBN
     */
    public void setItemKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.itemKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.itemKbn = null;
        }
    }

    /** HINBAN_OPE_CODE */
    private String hinbanOpeCode;

    /**
     * @return HINBAN_OPE_CODE
     */
    public String getHinbanOpeCode() {
        return this.hinbanOpeCode;
    }

    /**
     * @param o HINBAN_OPE_CODE
     */
    public void setHinbanOpeCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinbanOpeCode = String.valueOf(o.toString());
        } else {
            this.hinbanOpeCode = null;
        }
    }

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

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return this.wcCode;
    }

    /**
     * @param o WC_CODE
     */
    public void setWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcCode = String.valueOf(o.toString());
        } else {
            this.wcCode = null;
        }
    }

    /** WC_NAME */
    private String wcName;

    /**
     * @return WC_NAME
     */
    public String getWcName() {
        return this.wcName;
    }

    /**
     * @param o WC_NAME
     */
    public void setWcName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcName = String.valueOf(o.toString());
        } else {
            this.wcName = null;
        }
    }

    /** OPE_DETAIL */
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return this.opeDetail;
    }

    /**
     * @param o OPE_DETAIL
     */
    public void setOpeDetail(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeDetail = String.valueOf(o.toString());
        } else {
            this.opeDetail = null;
        }
    }

    /** LAST_IN_OUT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime lastInOutDate;

    /**
     * @return LAST_IN_OUT_DATE
     */
    public java.time.LocalDateTime getLastInOutDate() {
        return this.lastInOutDate;
    }

    /**
     * @param o LAST_IN_OUT_DATE
     */
    public void setLastInOutDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.lastInOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.lastInOutDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastInOutDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.lastInOutDate = null;
        }
    }

    /** STOCK */
    private java.math.BigDecimal stock;

    /**
     * @return STOCK
     */
    public java.math.BigDecimal getStock() {
        return this.stock;
    }

    /**
     * @param o STOCK
     */
    public void setStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stock = new java.math.BigDecimal(o.toString());
        } else {
            this.stock = null;
        }
    }

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return this.proNo;
    }

    /**
     * @param o PRO_NO
     */
    public void setProNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNo = String.valueOf(o.toString());
        } else {
            this.proNo = null;
        }
    }

    /** NEXT_ROUTING */
    private String nextRouting;

    /**
     * @return NEXT_ROUTING
     */
    public String getNextRouting() {
        return this.nextRouting;
    }

    /**
     * @param o NEXT_ROUTING
     */
    public void setNextRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nextRouting = String.valueOf(o.toString());
        } else {
            this.nextRouting = null;
        }
    }

    /** NEXT_WC */
    private String nextWc;

    /**
     * @return NEXT_WC
     */
    public String getNextWc() {
        return this.nextWc;
    }

    /**
     * @param o NEXT_WC
     */
    public void setNextWc(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nextWc = String.valueOf(o.toString());
        } else {
            this.nextWc = null;
        }
    }

    /** NEXT_DETAIL */
    private String nextDetail;

    /**
     * @return NEXT_DETAIL
     */
    public String getNextDetail() {
        return this.nextDetail;
    }

    /**
     * @param o NEXT_DETAIL
     */
    public void setNextDetail(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nextDetail = String.valueOf(o.toString());
        } else {
            this.nextDetail = null;
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
     * INV_STOCK_PROCESS_WK照会
     *
     * @return INV_STOCK_PROCESS_WK
     */
    public static InvStockProcessWk get() {

        List<String> whereList = new ArrayList<String>();

        String sql = "SELECT * FROM INV_STOCK_PROCESS_WK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();

        return Queries.get(sql, params, InvStockProcessWk.class);
    }

    /**
     * INV_STOCK_PROCESS_WK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STOCK_PROCESS_WKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"ITEM\" -- :item");
        nameList.add("\"ITEM_KBN\" -- :item_kbn");
        nameList.add("\"HINBAN_OPE_CODE\" -- :hinban_ope_code");
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"WC_NAME\" -- :wc_name");
        nameList.add("\"OPE_DETAIL\" -- :ope_detail");
        nameList.add("\"LAST_IN_OUT_DATE\" -- :last_in_out_date");
        nameList.add("\"STOCK\" -- :stock");
        nameList.add("\"PRO_NO\" -- :pro_no");
        nameList.add("\"NEXT_ROUTING\" -- :next_routing");
        nameList.add("\"NEXT_WC\" -- :next_wc");
        nameList.add("\"NEXT_DETAIL\" -- :next_detail");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STOCK_PROCESS_WK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hinban");
        valueList.add(":item");
        valueList.add(":item_kbn");
        valueList.add(":hinban_ope_code");
        valueList.add(":routing_group");
        valueList.add(":wc_code");
        valueList.add(":wc_name");
        valueList.add(":ope_detail");
        valueList.add("TO_TIMESTAMP (:last_in_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":stock");
        valueList.add(":pro_no");
        valueList.add(":next_routing");
        valueList.add(":next_wc");
        valueList.add(":next_detail");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_STOCK_PROCESS_WK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_PROCESS_WKの登録
        String sql = "UPDATE INV_STOCK_PROCESS_WK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"ITEM\" = :item");
        setList.add("\"ITEM_KBN\" = :item_kbn");
        setList.add("\"HINBAN_OPE_CODE\" = :hinban_ope_code");
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"WC_NAME\" = :wc_name");
        setList.add("\"OPE_DETAIL\" = :ope_detail");
        setList.add("\"LAST_IN_OUT_DATE\" = TO_TIMESTAMP (:last_in_out_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"STOCK\" = :stock");
        setList.add("\"PRO_NO\" = :pro_no");
        setList.add("\"NEXT_ROUTING\" = :next_routing");
        setList.add("\"NEXT_WC\" = :next_wc");
        setList.add("\"NEXT_DETAIL\" = :next_detail");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STOCK_PROCESS_WK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_PROCESS_WKの削除
        String sql = "DELETE FROM INV_STOCK_PROCESS_WK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", this.hinban);
        params.put("item", this.item);
        params.put("item_kbn", this.itemKbn);
        params.put("hinban_ope_code", this.hinbanOpeCode);
        params.put("routing_group", this.routingGroup);
        params.put("wc_code", this.wcCode);
        params.put("wc_name", this.wcName);
        params.put("ope_detail", this.opeDetail);
        params.put("last_in_out_date", this.lastInOutDate);
        params.put("stock", this.stock);
        params.put("pro_no", this.proNo);
        params.put("next_routing", this.nextRouting);
        params.put("next_wc", this.nextWc);
        params.put("next_detail", this.nextDetail);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
