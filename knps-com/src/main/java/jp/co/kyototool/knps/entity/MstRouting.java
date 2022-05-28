package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_ROUTING
 *
 * @author emarfkrow
 */
public class MstRouting implements IEntity {

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

    /** NECK_ROUTING */
    private java.math.BigDecimal neckRouting;

    /**
     * @return NECK_ROUTING
     */
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

    /** UNIT_WEIGHT */
    private java.math.BigDecimal unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
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

    /** MUSHO_HACCHU_F */
    private String mushoHacchuF;

    /**
     * @return MUSHO_HACCHU_F
     */
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

    /** TARGET_KBN */
    private String targetKbn;

    /**
     * @return TARGET_KBN
     */
    public String getTargetKbn() {
        return this.targetKbn;
    }

    /**
     * @param o TARGET_KBN
     */
    public void setTargetKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.targetKbn = String.valueOf(o.toString());
        } else {
            this.targetKbn = null;
        }
    }

    /**
     * MST_ROUTING照会
     *
     * @param param1 MAN_HINBAN
     * @param param2 ROUTING_GROUP
     * @param param3 ROUTING
     * @return MST_ROUTING
     */
    public static MstRouting get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");

        String sql = "SELECT * FROM MST_ROUTING WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("man_hinban", param1);
        params.put("routing_group", param2);
        params.put("routing", param3);

        return Queries.get(sql, params, MstRouting.class);
    }

    /**
     * MST_ROUTING追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_ROUTINGの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("man_hinban -- :man_hinban");
        nameList.add("routing_group -- :routing_group");
        nameList.add("routing -- :routing");
        nameList.add("neck_routing -- :neck_routing");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("wc_code -- :wc_code");
        nameList.add("hum_pre_time -- :hum_pre_time");
        nameList.add("hum_act_time -- :hum_act_time");
        nameList.add("mac_pre_time -- :mac_pre_time");
        nameList.add("mac_act_time -- :mac_act_time");
        nameList.add("comment1 -- :comment1");
        nameList.add("comment2 -- :comment2");
        nameList.add("lot_size -- :lot_size");
        nameList.add("acc_counts -- :acc_counts");
        nameList.add("unit_weight -- :unit_weight");
        nameList.add("store_kbn -- :store_kbn");
        nameList.add("store_no -- :store_no");
        nameList.add("inspect_lane_kbn -- :inspect_lane_kbn");
        nameList.add("inspect_kbn -- :inspect_kbn");
        nameList.add("subinv_code -- :subinv_code");
        nameList.add("hum_pre_time_kbn -- :hum_pre_time_kbn");
        nameList.add("hum_act_time_kbn -- :hum_act_time_kbn");
        nameList.add("mac_pre_time_kbn -- :mac_pre_time_kbn");
        nameList.add("mac_act_time_kbn -- :mac_act_time_kbn");
        nameList.add("supply_flag -- :supply_flag");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("musho_hacchu_f -- :musho_hacchu_f");
        nameList.add("target_kbn -- :target_kbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_ROUTING(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
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
        valueList.add(":target_kbn");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_ROUTING更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_ROUTINGの登録
        String sql = "UPDATE MST_ROUTING\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("man_hinban = :man_hinban");
        setList.add("routing_group = :routing_group");
        setList.add("routing = :routing");
        setList.add("neck_routing = :neck_routing");
        setList.add("ope_detail = :ope_detail");
        setList.add("wc_code = :wc_code");
        setList.add("hum_pre_time = :hum_pre_time");
        setList.add("hum_act_time = :hum_act_time");
        setList.add("mac_pre_time = :mac_pre_time");
        setList.add("mac_act_time = :mac_act_time");
        setList.add("comment1 = :comment1");
        setList.add("comment2 = :comment2");
        setList.add("lot_size = :lot_size");
        setList.add("acc_counts = :acc_counts");
        setList.add("unit_weight = :unit_weight");
        setList.add("store_kbn = :store_kbn");
        setList.add("store_no = :store_no");
        setList.add("inspect_lane_kbn = :inspect_lane_kbn");
        setList.add("inspect_kbn = :inspect_kbn");
        setList.add("subinv_code = :subinv_code");
        setList.add("hum_pre_time_kbn = :hum_pre_time_kbn");
        setList.add("hum_act_time_kbn = :hum_act_time_kbn");
        setList.add("mac_pre_time_kbn = :mac_pre_time_kbn");
        setList.add("mac_act_time_kbn = :mac_act_time_kbn");
        setList.add("supply_flag = :supply_flag");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("musho_hacchu_f = :musho_hacchu_f");
        setList.add("target_kbn = :target_kbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_ROUTING削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_ROUTINGの削除
        String sql = "DELETE FROM MST_ROUTING WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("routing_group = :routing_group");
        whereList.add("routing = :routing");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("MAN_HINBAN", this.manHinban);
        params.put("ROUTING_GROUP", this.routingGroup);
        params.put("ROUTING", this.routing);
        params.put("NECK_ROUTING", this.neckRouting);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("WC_CODE", this.wcCode);
        params.put("HUM_PRE_TIME", this.humPreTime);
        params.put("HUM_ACT_TIME", this.humActTime);
        params.put("MAC_PRE_TIME", this.macPreTime);
        params.put("MAC_ACT_TIME", this.macActTime);
        params.put("COMMENT1", this.comment1);
        params.put("COMMENT2", this.comment2);
        params.put("LOT_SIZE", this.lotSize);
        params.put("ACC_COUNTS", this.accCounts);
        params.put("UNIT_WEIGHT", this.unitWeight);
        params.put("STORE_KBN", this.storeKbn);
        params.put("STORE_NO", this.storeNo);
        params.put("INSPECT_LANE_KBN", this.inspectLaneKbn);
        params.put("INSPECT_KBN", this.inspectKbn);
        params.put("SUBINV_CODE", this.subinvCode);
        params.put("HUM_PRE_TIME_KBN", this.humPreTimeKbn);
        params.put("HUM_ACT_TIME_KBN", this.humActTimeKbn);
        params.put("MAC_PRE_TIME_KBN", this.macPreTimeKbn);
        params.put("MAC_ACT_TIME_KBN", this.macActTimeKbn);
        params.put("SUPPLY_FLAG", this.supplyFlag);
        params.put("MUSHO_HACCHU_F", this.mushoHacchuF);
        params.put("TARGET_KBN", this.targetKbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
