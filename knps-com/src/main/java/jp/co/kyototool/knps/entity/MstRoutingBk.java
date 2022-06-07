package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_ROUTING_BK
 *
 * @author emarfkrow
 */
public class MstRoutingBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YY")
    public String getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = String.valueOf(o.toString());
        } else {
            this.yy = null;
        }
    }

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

    /** NECK_ROUTING */
    private java.math.BigDecimal neckRouting;

    /**
     * @return NECK_ROUTING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NECK_ROUTING")
    public java.math.BigDecimal getNeckRouting() {
        return this.neckRouting;
    }

    /**
     * @param o NECK_ROUTING
     */
    public void setNeckRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.neckRouting = new java.math.BigDecimal(o.toString());
        } else {
            this.neckRouting = null;
        }
    }

    /** OPE_DETAIL */
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_DETAIL")
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

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WC_CODE")
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

    /** HUM_PRE_TIME */
    private java.math.BigDecimal humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_PRE_TIME")
    public java.math.BigDecimal getHumPreTime() {
        return this.humPreTime;
    }

    /**
     * @param o HUM_PRE_TIME
     */
    public void setHumPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humPreTime = null;
        }
    }

    /** HUM_ACT_TIME */
    private java.math.BigDecimal humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_ACT_TIME")
    public java.math.BigDecimal getHumActTime() {
        return this.humActTime;
    }

    /**
     * @param o HUM_ACT_TIME
     */
    public void setHumActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humActTime = null;
        }
    }

    /** MAC_PRE_TIME */
    private java.math.BigDecimal macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_PRE_TIME")
    public java.math.BigDecimal getMacPreTime() {
        return this.macPreTime;
    }

    /**
     * @param o MAC_PRE_TIME
     */
    public void setMacPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTime = null;
        }
    }

    /** MAC_ACT_TIME */
    private java.math.BigDecimal macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_ACT_TIME")
    public java.math.BigDecimal getMacActTime() {
        return this.macActTime;
    }

    /**
     * @param o MAC_ACT_TIME
     */
    public void setMacActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTime = null;
        }
    }

    /** COMMENT1 */
    private String comment1;

    /**
     * @return COMMENT1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMMENT1")
    public String getComment1() {
        return this.comment1;
    }

    /**
     * @param o COMMENT1
     */
    public void setComment1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment1 = String.valueOf(o.toString());
        } else {
            this.comment1 = null;
        }
    }

    /** COMMENT2 */
    private String comment2;

    /**
     * @return COMMENT2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMMENT2")
    public String getComment2() {
        return this.comment2;
    }

    /**
     * @param o COMMENT2
     */
    public void setComment2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment2 = String.valueOf(o.toString());
        } else {
            this.comment2 = null;
        }
    }

    /** LOT_SIZE */
    private java.math.BigDecimal lotSize;

    /**
     * @return LOT_SIZE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOT_SIZE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("ACC_COUNTS")
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

    /** UNIT_WEIGHT */
    private java.math.BigDecimal unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_WEIGHT")
    public java.math.BigDecimal getUnitWeight() {
        return this.unitWeight;
    }

    /**
     * @param o UNIT_WEIGHT
     */
    public void setUnitWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.unitWeight = null;
        }
    }

    /** STORE_KBN */
    private java.math.BigDecimal storeKbn;

    /**
     * @return STORE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STORE_KBN")
    public java.math.BigDecimal getStoreKbn() {
        return this.storeKbn;
    }

    /**
     * @param o STORE_KBN
     */
    public void setStoreKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.storeKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.storeKbn = null;
        }
    }

    /** STORE_NO */
    private String storeNo;

    /**
     * @return STORE_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STORE_NO")
    public String getStoreNo() {
        return this.storeNo;
    }

    /**
     * @param o STORE_NO
     */
    public void setStoreNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.storeNo = String.valueOf(o.toString());
        } else {
            this.storeNo = null;
        }
    }

    /** INSPECT_LANE_KBN */
    private java.math.BigDecimal inspectLaneKbn;

    /**
     * @return INSPECT_LANE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("INSPECT_LANE_KBN")
    public java.math.BigDecimal getInspectLaneKbn() {
        return this.inspectLaneKbn;
    }

    /**
     * @param o INSPECT_LANE_KBN
     */
    public void setInspectLaneKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectLaneKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectLaneKbn = null;
        }
    }

    /** INSPECT_KBN */
    private java.math.BigDecimal inspectKbn;

    /**
     * @return INSPECT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("INSPECT_KBN")
    public java.math.BigDecimal getInspectKbn() {
        return this.inspectKbn;
    }

    /**
     * @param o INSPECT_KBN
     */
    public void setInspectKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inspectKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.inspectKbn = null;
        }
    }

    /** SUBINV_CODE */
    private String subinvCode;

    /**
     * @return SUBINV_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUBINV_CODE")
    public String getSubinvCode() {
        return this.subinvCode;
    }

    /**
     * @param o SUBINV_CODE
     */
    public void setSubinvCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.subinvCode = String.valueOf(o.toString());
        } else {
            this.subinvCode = null;
        }
    }

    /** HUM_PRE_TIME_KBN */
    private java.math.BigDecimal humPreTimeKbn;

    /**
     * @return HUM_PRE_TIME_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_PRE_TIME_KBN")
    public java.math.BigDecimal getHumPreTimeKbn() {
        return this.humPreTimeKbn;
    }

    /**
     * @param o HUM_PRE_TIME_KBN
     */
    public void setHumPreTimeKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humPreTimeKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.humPreTimeKbn = null;
        }
    }

    /** HUM_ACT_TIME_KBN */
    private java.math.BigDecimal humActTimeKbn;

    /**
     * @return HUM_ACT_TIME_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_ACT_TIME_KBN")
    public java.math.BigDecimal getHumActTimeKbn() {
        return this.humActTimeKbn;
    }

    /**
     * @param o HUM_ACT_TIME_KBN
     */
    public void setHumActTimeKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humActTimeKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.humActTimeKbn = null;
        }
    }

    /** MAC_PRE_TIME_KBN */
    private java.math.BigDecimal macPreTimeKbn;

    /**
     * @return MAC_PRE_TIME_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_PRE_TIME_KBN")
    public java.math.BigDecimal getMacPreTimeKbn() {
        return this.macPreTimeKbn;
    }

    /**
     * @param o MAC_PRE_TIME_KBN
     */
    public void setMacPreTimeKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTimeKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTimeKbn = null;
        }
    }

    /** MAC_ACT_TIME_KBN */
    private java.math.BigDecimal macActTimeKbn;

    /**
     * @return MAC_ACT_TIME_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_ACT_TIME_KBN")
    public java.math.BigDecimal getMacActTimeKbn() {
        return this.macActTimeKbn;
    }

    /**
     * @param o MAC_ACT_TIME_KBN
     */
    public void setMacActTimeKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTimeKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTimeKbn = null;
        }
    }

    /** SUPPLY_FLAG */
    private java.math.BigDecimal supplyFlag;

    /**
     * @return SUPPLY_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUPPLY_FLAG")
    public java.math.BigDecimal getSupplyFlag() {
        return this.supplyFlag;
    }

    /**
     * @param o SUPPLY_FLAG
     */
    public void setSupplyFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyFlag = null;
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

    /** MUSHO_HACCHU_F */
    private String mushoHacchuF;

    /**
     * @return MUSHO_HACCHU_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MUSHO_HACCHU_F")
    public String getMushoHacchuF() {
        return this.mushoHacchuF;
    }

    /**
     * @param o MUSHO_HACCHU_F
     */
    public void setMushoHacchuF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mushoHacchuF = String.valueOf(o.toString());
        } else {
            this.mushoHacchuF = null;
        }
    }

    /**
     * MST_ROUTING_BK照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 ROUTING
     * @param param4 YY
     * @return MST_ROUTING_BK
     */
    public static MstRoutingBk get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_ROUTING_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);
        params.put("yy", param4);

        return Queries.get(sql, params, MstRoutingBk.class);
    }

    /**
     * MST_ROUTING_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_ROUTING_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"MAN_HINBAN\" -- :man_hinban");
        nameList.add("\"ROUTING_GROUP\" -- :routing_group");
        nameList.add("\"ROUTING\" -- :routing");
        nameList.add("\"NECK_ROUTING\" -- :neck_routing");
        nameList.add("\"OPE_DETAIL\" -- :ope_detail");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"HUM_PRE_TIME\" -- :hum_pre_time");
        nameList.add("\"HUM_ACT_TIME\" -- :hum_act_time");
        nameList.add("\"MAC_PRE_TIME\" -- :mac_pre_time");
        nameList.add("\"MAC_ACT_TIME\" -- :mac_act_time");
        nameList.add("\"COMMENT1\" -- :comment1");
        nameList.add("\"COMMENT2\" -- :comment2");
        nameList.add("\"LOT_SIZE\" -- :lot_size");
        nameList.add("\"ACC_COUNTS\" -- :acc_counts");
        nameList.add("\"UNIT_WEIGHT\" -- :unit_weight");
        nameList.add("\"STORE_KBN\" -- :store_kbn");
        nameList.add("\"STORE_NO\" -- :store_no");
        nameList.add("\"INSPECT_LANE_KBN\" -- :inspect_lane_kbn");
        nameList.add("\"INSPECT_KBN\" -- :inspect_kbn");
        nameList.add("\"SUBINV_CODE\" -- :subinv_code");
        nameList.add("\"HUM_PRE_TIME_KBN\" -- :hum_pre_time_kbn");
        nameList.add("\"HUM_ACT_TIME_KBN\" -- :hum_act_time_kbn");
        nameList.add("\"MAC_PRE_TIME_KBN\" -- :mac_pre_time_kbn");
        nameList.add("\"MAC_ACT_TIME_KBN\" -- :mac_act_time_kbn");
        nameList.add("\"SUPPLY_FLAG\" -- :supply_flag");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"MUSHO_HACCHU_F\" -- :musho_hacchu_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_ROUTING_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":man_hinban");
        valueList.add(":routing_group");
        valueList.add(":routing");
        valueList.add(":neck_routing");
        valueList.add(":ope_detail");
        valueList.add(":wc_code");
        valueList.add(":hum_pre_time");
        valueList.add(":hum_act_time");
        valueList.add(":mac_pre_time");
        valueList.add(":mac_act_time");
        valueList.add(":comment1");
        valueList.add(":comment2");
        valueList.add(":lot_size");
        valueList.add(":acc_counts");
        valueList.add(":unit_weight");
        valueList.add(":store_kbn");
        valueList.add(":store_no");
        valueList.add(":inspect_lane_kbn");
        valueList.add(":inspect_kbn");
        valueList.add(":subinv_code");
        valueList.add(":hum_pre_time_kbn");
        valueList.add(":hum_act_time_kbn");
        valueList.add(":mac_pre_time_kbn");
        valueList.add(":mac_act_time_kbn");
        valueList.add(":supply_flag");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":musho_hacchu_f");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM MST_ROUTING_BK e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"MAN_HINBAN\" = :man_hinban");
        whereList.add("e.\"ROUTING_GROUP\" = :routing_group");
        whereList.add("e.\"ROUTING\" = :routing");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("man_hinban", this.manHinban);
        params.put("routing_group", this.routingGroup);
        params.put("routing", this.routing);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_ROUTING_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_ROUTING_BKの登録
        String sql = "UPDATE MST_ROUTING_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"MAN_HINBAN\" = :man_hinban");
        setList.add("\"ROUTING_GROUP\" = :routing_group");
        setList.add("\"ROUTING\" = :routing");
        setList.add("\"NECK_ROUTING\" = :neck_routing");
        setList.add("\"OPE_DETAIL\" = :ope_detail");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"HUM_PRE_TIME\" = :hum_pre_time");
        setList.add("\"HUM_ACT_TIME\" = :hum_act_time");
        setList.add("\"MAC_PRE_TIME\" = :mac_pre_time");
        setList.add("\"MAC_ACT_TIME\" = :mac_act_time");
        setList.add("\"COMMENT1\" = :comment1");
        setList.add("\"COMMENT2\" = :comment2");
        setList.add("\"LOT_SIZE\" = :lot_size");
        setList.add("\"ACC_COUNTS\" = :acc_counts");
        setList.add("\"UNIT_WEIGHT\" = :unit_weight");
        setList.add("\"STORE_KBN\" = :store_kbn");
        setList.add("\"STORE_NO\" = :store_no");
        setList.add("\"INSPECT_LANE_KBN\" = :inspect_lane_kbn");
        setList.add("\"INSPECT_KBN\" = :inspect_kbn");
        setList.add("\"SUBINV_CODE\" = :subinv_code");
        setList.add("\"HUM_PRE_TIME_KBN\" = :hum_pre_time_kbn");
        setList.add("\"HUM_ACT_TIME_KBN\" = :hum_act_time_kbn");
        setList.add("\"MAC_PRE_TIME_KBN\" = :mac_pre_time_kbn");
        setList.add("\"MAC_ACT_TIME_KBN\" = :mac_act_time_kbn");
        setList.add("\"SUPPLY_FLAG\" = :supply_flag");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"MUSHO_HACCHU_F\" = :musho_hacchu_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_ROUTING_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_ROUTING_BKの削除
        String sql = "DELETE FROM MST_ROUTING_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("\"ROUTING_GROUP\" = :routing_group");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("man_hinban", this.manHinban);
        params.put("routing_group", this.routingGroup);
        params.put("routing", this.routing);
        params.put("neck_routing", this.neckRouting);
        params.put("ope_detail", this.opeDetail);
        params.put("wc_code", this.wcCode);
        params.put("hum_pre_time", this.humPreTime);
        params.put("hum_act_time", this.humActTime);
        params.put("mac_pre_time", this.macPreTime);
        params.put("mac_act_time", this.macActTime);
        params.put("comment1", this.comment1);
        params.put("comment2", this.comment2);
        params.put("lot_size", this.lotSize);
        params.put("acc_counts", this.accCounts);
        params.put("unit_weight", this.unitWeight);
        params.put("store_kbn", this.storeKbn);
        params.put("store_no", this.storeNo);
        params.put("inspect_lane_kbn", this.inspectLaneKbn);
        params.put("inspect_kbn", this.inspectKbn);
        params.put("subinv_code", this.subinvCode);
        params.put("hum_pre_time_kbn", this.humPreTimeKbn);
        params.put("hum_act_time_kbn", this.humActTimeKbn);
        params.put("mac_pre_time_kbn", this.macPreTimeKbn);
        params.put("mac_act_time_kbn", this.macActTimeKbn);
        params.put("supply_flag", this.supplyFlag);
        params.put("musho_hacchu_f", this.mushoHacchuF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
