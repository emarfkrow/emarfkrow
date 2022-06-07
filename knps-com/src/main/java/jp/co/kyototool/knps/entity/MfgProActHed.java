package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_PRO_ACT_HED
 *
 * @author emarfkrow
 */
public class MfgProActHed implements IEntity {

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_NO")
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

    /** PRO_ROUTING_BRANCH */
    private java.math.BigDecimal proRoutingBranch;

    /**
     * @return PRO_ROUTING_BRANCH
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_ROUTING_BRANCH")
    public java.math.BigDecimal getProRoutingBranch() {
        return this.proRoutingBranch;
    }

    /**
     * @param o PRO_ROUTING_BRANCH
     */
    public void setProRoutingBranch(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proRoutingBranch = new java.math.BigDecimal(o.toString());
        } else {
            this.proRoutingBranch = null;
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

    /** CHARGE_NO */
    private java.math.BigDecimal chargeNo;

    /**
     * @return CHARGE_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHARGE_NO")
    public java.math.BigDecimal getChargeNo() {
        return this.chargeNo;
    }

    /**
     * @param o CHARGE_NO
     */
    public void setChargeNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chargeNo = new java.math.BigDecimal(o.toString());
        } else {
            this.chargeNo = null;
        }
    }

    /** MAC_CODE */
    private String macCode;

    /**
     * @return MAC_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_CODE")
    public String getMacCode() {
        return this.macCode;
    }

    /**
     * @param o MAC_CODE
     */
    public void setMacCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macCode = String.valueOf(o.toString());
        } else {
            this.macCode = null;
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

    /** GOOD_COUNTS */
    private java.math.BigDecimal goodCounts;

    /**
     * @return GOOD_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GOOD_COUNTS")
    public java.math.BigDecimal getGoodCounts() {
        return this.goodCounts;
    }

    /**
     * @param o GOOD_COUNTS
     */
    public void setGoodCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.goodCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.goodCounts = null;
        }
    }

    /** REJECT_COUNTS */
    private java.math.BigDecimal rejectCounts;

    /**
     * @return REJECT_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REJECT_COUNTS")
    public java.math.BigDecimal getRejectCounts() {
        return this.rejectCounts;
    }

    /**
     * @param o REJECT_COUNTS
     */
    public void setRejectCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rejectCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.rejectCounts = null;
        }
    }

    /** UNIT_CODE */
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_CODE")
    public String getUnitCode() {
        return this.unitCode;
    }

    /**
     * @param o UNIT_CODE
     */
    public void setUnitCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCode = String.valueOf(o.toString());
        } else {
            this.unitCode = null;
        }
    }

    /** ACT_LT */
    private java.math.BigDecimal actLt;

    /**
     * @return ACT_LT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_LT")
    public java.math.BigDecimal getActLt() {
        return this.actLt;
    }

    /**
     * @param o ACT_LT
     */
    public void setActLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actLt = new java.math.BigDecimal(o.toString());
        } else {
            this.actLt = null;
        }
    }

    /** ACT_WAIT_TIME */
    private java.math.BigDecimal actWaitTime;

    /**
     * @return ACT_WAIT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_WAIT_TIME")
    public java.math.BigDecimal getActWaitTime() {
        return this.actWaitTime;
    }

    /**
     * @param o ACT_WAIT_TIME
     */
    public void setActWaitTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actWaitTime = new java.math.BigDecimal(o.toString());
        } else {
            this.actWaitTime = null;
        }
    }

    /** EXP_WAIT_TIME */
    private java.math.BigDecimal expWaitTime;

    /**
     * @return EXP_WAIT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_WAIT_TIME")
    public java.math.BigDecimal getExpWaitTime() {
        return this.expWaitTime;
    }

    /**
     * @param o EXP_WAIT_TIME
     */
    public void setExpWaitTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expWaitTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expWaitTime = null;
        }
    }

    /** EXP_PRE_TIME */
    private java.math.BigDecimal expPreTime;

    /**
     * @return EXP_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_PRE_TIME")
    public java.math.BigDecimal getExpPreTime() {
        return this.expPreTime;
    }

    /**
     * @param o EXP_PRE_TIME
     */
    public void setExpPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expPreTime = null;
        }
    }

    /** EXP_PRO_TIME */
    private java.math.BigDecimal expProTime;

    /**
     * @return EXP_PRO_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_PRO_TIME")
    public java.math.BigDecimal getExpProTime() {
        return this.expProTime;
    }

    /**
     * @param o EXP_PRO_TIME
     */
    public void setExpProTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expProTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expProTime = null;
        }
    }

    /** EXP_REST_TIME */
    private java.math.BigDecimal expRestTime;

    /**
     * @return EXP_REST_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_REST_TIME")
    public java.math.BigDecimal getExpRestTime() {
        return this.expRestTime;
    }

    /**
     * @param o EXP_REST_TIME
     */
    public void setExpRestTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expRestTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expRestTime = null;
        }
    }

    /** EXP_CHOKO_TIME */
    private java.math.BigDecimal expChokoTime;

    /**
     * @return EXP_CHOKO_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_CHOKO_TIME")
    public java.math.BigDecimal getExpChokoTime() {
        return this.expChokoTime;
    }

    /**
     * @param o EXP_CHOKO_TIME
     */
    public void setExpChokoTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expChokoTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expChokoTime = null;
        }
    }

    /** EXP_TROUB_TIME */
    private java.math.BigDecimal expTroubTime;

    /**
     * @return EXP_TROUB_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_TROUB_TIME")
    public java.math.BigDecimal getExpTroubTime() {
        return this.expTroubTime;
    }

    /**
     * @param o EXP_TROUB_TIME
     */
    public void setExpTroubTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expTroubTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expTroubTime = null;
        }
    }

    /** EXP_SELF_MOD_TIME */
    private java.math.BigDecimal expSelfModTime;

    /**
     * @return EXP_SELF_MOD_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_SELF_MOD_TIME")
    public java.math.BigDecimal getExpSelfModTime() {
        return this.expSelfModTime;
    }

    /**
     * @param o EXP_SELF_MOD_TIME
     */
    public void setExpSelfModTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expSelfModTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expSelfModTime = null;
        }
    }

    /** EXP_OTHR_MOD_TIME */
    private java.math.BigDecimal expOthrModTime;

    /**
     * @return EXP_OTHR_MOD_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_OTHR_MOD_TIME")
    public java.math.BigDecimal getExpOthrModTime() {
        return this.expOthrModTime;
    }

    /**
     * @param o EXP_OTHR_MOD_TIME
     */
    public void setExpOthrModTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expOthrModTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expOthrModTime = null;
        }
    }

    /** EXP_ETC_TIME */
    private java.math.BigDecimal expEtcTime;

    /**
     * @return EXP_ETC_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_ETC_TIME")
    public java.math.BigDecimal getExpEtcTime() {
        return this.expEtcTime;
    }

    /**
     * @param o EXP_ETC_TIME
     */
    public void setExpEtcTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expEtcTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expEtcTime = null;
        }
    }

    /** SET_STOCK_NOTICE */
    private java.math.BigDecimal setStockNotice;

    /**
     * @return SET_STOCK_NOTICE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET_STOCK_NOTICE")
    public java.math.BigDecimal getSetStockNotice() {
        return this.setStockNotice;
    }

    /**
     * @param o SET_STOCK_NOTICE
     */
    public void setSetStockNotice(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setStockNotice = new java.math.BigDecimal(o.toString());
        } else {
            this.setStockNotice = null;
        }
    }

    /** PRO_STOCK_NOTICE */
    private java.math.BigDecimal proStockNotice;

    /**
     * @return PRO_STOCK_NOTICE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_STOCK_NOTICE")
    public java.math.BigDecimal getProStockNotice() {
        return this.proStockNotice;
    }

    /**
     * @param o PRO_STOCK_NOTICE
     */
    public void setProStockNotice(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proStockNotice = new java.math.BigDecimal(o.toString());
        } else {
            this.proStockNotice = null;
        }
    }

    /** VOLUME_WEIGHT */
    private java.math.BigDecimal volumeWeight;

    /**
     * @return VOLUME_WEIGHT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("VOLUME_WEIGHT")
    public java.math.BigDecimal getVolumeWeight() {
        return this.volumeWeight;
    }

    /**
     * @param o VOLUME_WEIGHT
     */
    public void setVolumeWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.volumeWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.volumeWeight = null;
        }
    }

    /** BEG_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime begDate;

    /**
     * @return BEG_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BEG_DATE")
    public java.time.LocalDateTime getBegDate() {
        return this.begDate;
    }

    /**
     * @param o BEG_DATE
     */
    public void setBegDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.begDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.begDate = null;
        }
    }

    /** END_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime endDate;

    /**
     * @return END_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("END_DATE")
    public java.time.LocalDateTime getEndDate() {
        return this.endDate;
    }

    /**
     * @param o END_DATE
     */
    public void setEndDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.endDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.endDate = null;
        }
    }

    /** END_MATERIAL_WEIGHT */
    private java.math.BigDecimal endMaterialWeight;

    /**
     * @return END_MATERIAL_WEIGHT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("END_MATERIAL_WEIGHT")
    public java.math.BigDecimal getEndMaterialWeight() {
        return this.endMaterialWeight;
    }

    /**
     * @param o END_MATERIAL_WEIGHT
     */
    public void setEndMaterialWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.endMaterialWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.endMaterialWeight = null;
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

    /**
     * MFG_PRO_ACT_HED照会
     *
     * @param param1 PRO_NO
     * @param param2 PRO_ROUTING_BRANCH
     * @return MFG_PRO_ACT_HED
     */
    public static MfgProActHed get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_NO\") = TRIM (:pro_no)");
        whereList.add("\"PRO_ROUTING_BRANCH\" = :pro_routing_branch");

        String sql = "SELECT * FROM MFG_PRO_ACT_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", param1);
        params.put("pro_routing_branch", param2);

        return Queries.get(sql, params, MfgProActHed.class);
    }

    /**
     * MFG_PRO_ACT_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MFG_PRO_ACT_DETの登録
        if (this.mfgProActDets != null) {
            for (MfgProActDet mfgProActDet : this.mfgProActDets) {
                mfgProActDet.setProNo(this.getProNo());
                mfgProActDet.setProRoutingBranch(this.getProRoutingBranch());
                mfgProActDet.insert(now, id);
            }
        }

        // MFG_PRO_ACT_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRO_NO\" -- :pro_no");
        nameList.add("\"PRO_ROUTING_BRANCH\" -- :pro_routing_branch");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"CHARGE_NO\" -- :charge_no");
        nameList.add("\"MAC_CODE\" -- :mac_code");
        nameList.add("\"HUM_PRE_TIME\" -- :hum_pre_time");
        nameList.add("\"HUM_ACT_TIME\" -- :hum_act_time");
        nameList.add("\"MAC_PRE_TIME\" -- :mac_pre_time");
        nameList.add("\"MAC_ACT_TIME\" -- :mac_act_time");
        nameList.add("\"GOOD_COUNTS\" -- :good_counts");
        nameList.add("\"REJECT_COUNTS\" -- :reject_counts");
        nameList.add("\"UNIT_CODE\" -- :unit_code");
        nameList.add("\"ACT_LT\" -- :act_lt");
        nameList.add("\"ACT_WAIT_TIME\" -- :act_wait_time");
        nameList.add("\"EXP_WAIT_TIME\" -- :exp_wait_time");
        nameList.add("\"EXP_PRE_TIME\" -- :exp_pre_time");
        nameList.add("\"EXP_PRO_TIME\" -- :exp_pro_time");
        nameList.add("\"EXP_REST_TIME\" -- :exp_rest_time");
        nameList.add("\"EXP_CHOKO_TIME\" -- :exp_choko_time");
        nameList.add("\"EXP_TROUB_TIME\" -- :exp_troub_time");
        nameList.add("\"EXP_SELF_MOD_TIME\" -- :exp_self_mod_time");
        nameList.add("\"EXP_OTHR_MOD_TIME\" -- :exp_othr_mod_time");
        nameList.add("\"EXP_ETC_TIME\" -- :exp_etc_time");
        nameList.add("\"SET_STOCK_NOTICE\" -- :set_stock_notice");
        nameList.add("\"PRO_STOCK_NOTICE\" -- :pro_stock_notice");
        nameList.add("\"VOLUME_WEIGHT\" -- :volume_weight");
        nameList.add("\"BEG_DATE\" -- :beg_date");
        nameList.add("\"END_DATE\" -- :end_date");
        nameList.add("\"END_MATERIAL_WEIGHT\" -- :end_material_weight");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_PRO_ACT_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pro_no");
        valueList.add(":pro_routing_branch");
        valueList.add(":wc_code");
        valueList.add(":charge_no");
        valueList.add(":mac_code");
        valueList.add(":hum_pre_time");
        valueList.add(":hum_act_time");
        valueList.add(":mac_pre_time");
        valueList.add(":mac_act_time");
        valueList.add(":good_counts");
        valueList.add(":reject_counts");
        valueList.add(":unit_code");
        valueList.add(":act_lt");
        valueList.add(":act_wait_time");
        valueList.add(":exp_wait_time");
        valueList.add(":exp_pre_time");
        valueList.add(":exp_pro_time");
        valueList.add(":exp_rest_time");
        valueList.add(":exp_choko_time");
        valueList.add(":exp_troub_time");
        valueList.add(":exp_self_mod_time");
        valueList.add(":exp_othr_mod_time");
        valueList.add(":exp_etc_time");
        valueList.add(":set_stock_notice");
        valueList.add(":pro_stock_notice");
        valueList.add(":volume_weight");
        valueList.add("TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":end_material_weight");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_PRO_ACT_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_PRO_ACT_DETの登録
        if (this.mfgProActDets != null) {
            for (MfgProActDet mfgProActDet : this.mfgProActDets) {
                mfgProActDet.setProNo(this.proNo);
                mfgProActDet.setProRoutingBranch(this.proRoutingBranch);
                try {
                    mfgProActDet.insert(now, id);
                } catch (Exception e) {
                    mfgProActDet.update(now, id);
                }
            }
            this.mfgProActDets = null;
            this.referMfgProActDets();
            if (this.mfgProActDets != null) {
                for (MfgProActDet mfgProActDet : this.mfgProActDets) {
                    if (!mfgProActDet.getTimeStampChange().equals(now)) {
                        mfgProActDet.delete();
                    }
                }
            }
        }

        // MFG_PRO_ACT_HEDの登録
        String sql = "UPDATE MFG_PRO_ACT_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRO_NO\" = :pro_no");
        setList.add("\"PRO_ROUTING_BRANCH\" = :pro_routing_branch");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"CHARGE_NO\" = :charge_no");
        setList.add("\"MAC_CODE\" = :mac_code");
        setList.add("\"HUM_PRE_TIME\" = :hum_pre_time");
        setList.add("\"HUM_ACT_TIME\" = :hum_act_time");
        setList.add("\"MAC_PRE_TIME\" = :mac_pre_time");
        setList.add("\"MAC_ACT_TIME\" = :mac_act_time");
        setList.add("\"GOOD_COUNTS\" = :good_counts");
        setList.add("\"REJECT_COUNTS\" = :reject_counts");
        setList.add("\"UNIT_CODE\" = :unit_code");
        setList.add("\"ACT_LT\" = :act_lt");
        setList.add("\"ACT_WAIT_TIME\" = :act_wait_time");
        setList.add("\"EXP_WAIT_TIME\" = :exp_wait_time");
        setList.add("\"EXP_PRE_TIME\" = :exp_pre_time");
        setList.add("\"EXP_PRO_TIME\" = :exp_pro_time");
        setList.add("\"EXP_REST_TIME\" = :exp_rest_time");
        setList.add("\"EXP_CHOKO_TIME\" = :exp_choko_time");
        setList.add("\"EXP_TROUB_TIME\" = :exp_troub_time");
        setList.add("\"EXP_SELF_MOD_TIME\" = :exp_self_mod_time");
        setList.add("\"EXP_OTHR_MOD_TIME\" = :exp_othr_mod_time");
        setList.add("\"EXP_ETC_TIME\" = :exp_etc_time");
        setList.add("\"SET_STOCK_NOTICE\" = :set_stock_notice");
        setList.add("\"PRO_STOCK_NOTICE\" = :pro_stock_notice");
        setList.add("\"VOLUME_WEIGHT\" = :volume_weight");
        setList.add("\"BEG_DATE\" = TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"END_DATE\" = TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"END_MATERIAL_WEIGHT\" = :end_material_weight");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_PRO_ACT_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_PRO_ACT_DETの削除
        if (this.mfgProActDets != null) {
            for (MfgProActDet mfgProActDet : this.mfgProActDets) {
                mfgProActDet.delete();
            }
        }

        // MFG_PRO_ACT_HEDの削除
        String sql = "DELETE FROM MFG_PRO_ACT_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_NO\") = TRIM (:pro_no)");
        whereList.add("\"PRO_ROUTING_BRANCH\" = :pro_routing_branch");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", this.proNo);
        params.put("pro_routing_branch", this.proRoutingBranch);
        params.put("wc_code", this.wcCode);
        params.put("charge_no", this.chargeNo);
        params.put("mac_code", this.macCode);
        params.put("hum_pre_time", this.humPreTime);
        params.put("hum_act_time", this.humActTime);
        params.put("mac_pre_time", this.macPreTime);
        params.put("mac_act_time", this.macActTime);
        params.put("good_counts", this.goodCounts);
        params.put("reject_counts", this.rejectCounts);
        params.put("unit_code", this.unitCode);
        params.put("act_lt", this.actLt);
        params.put("act_wait_time", this.actWaitTime);
        params.put("exp_wait_time", this.expWaitTime);
        params.put("exp_pre_time", this.expPreTime);
        params.put("exp_pro_time", this.expProTime);
        params.put("exp_rest_time", this.expRestTime);
        params.put("exp_choko_time", this.expChokoTime);
        params.put("exp_troub_time", this.expTroubTime);
        params.put("exp_self_mod_time", this.expSelfModTime);
        params.put("exp_othr_mod_time", this.expOthrModTime);
        params.put("exp_etc_time", this.expEtcTime);
        params.put("set_stock_notice", this.setStockNotice);
        params.put("pro_stock_notice", this.proStockNotice);
        params.put("volume_weight", this.volumeWeight);
        params.put("beg_date", this.begDate);
        params.put("end_date", this.endDate);
        params.put("end_material_weight", this.endMaterialWeight);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_PRO_ACT_DETのリスト
     */
    private List<MfgProActDet> mfgProActDets;

    /**
     * @return MFG_PRO_ACT_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgProActDets")
    public List<MfgProActDet> getMfgProActDets() {
        return this.mfgProActDets;
    }

    /**
     * @param list MFG_PRO_ACT_DETのリスト
     */
    public void setMfgProActDets(final List<MfgProActDet> list) {
        this.mfgProActDets = list;
    }

    /**
     * @param mfgProActDet
     */
    public void addMfgProActDets(final MfgProActDet mfgProActDet) {
        if (this.mfgProActDets == null) {
            this.mfgProActDets = new ArrayList<MfgProActDet>();
        }
        this.mfgProActDets.add(mfgProActDet);
    }

    /**
     * @return MFG_PRO_ACT_DETのリスト
     */
    public List<MfgProActDet> referMfgProActDets() {
        if (this.mfgProActDets == null) {
            this.mfgProActDets = MfgProActHed.referMfgProActDets(this.proNo, this.proRoutingBranch);
        }
        return this.mfgProActDets;
    }

    /**
     * @param param1 proNo
     * @param param2 proRoutingBranch
     * @return List<MfgProActDet>
     */
    public static List<MfgProActDet> referMfgProActDets(final String param1, final java.math.BigDecimal param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("pro_no = :pro_no");
        whereList.add("pro_routing_branch = :pro_routing_branch");

        String sql = "SELECT * FROM MFG_PRO_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_no", param1);
        params.put("pro_routing_branch", param2);

        return Queries.select(sql, params, MfgProActDet.class);
    }
}
