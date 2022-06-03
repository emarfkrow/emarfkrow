package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_TOTAL_RESULT_Q
 *
 * @author emarfkrow
 */
public class MfgTotalResultQ implements IEntity {

    /** RESULT_DATE */
    private String resultDate;

    /**
     * @return RESULT_DATE
     */
    public String getResultDate() {
        return this.resultDate;
    }

    /**
     * @param o RESULT_DATE
     */
    public void setResultDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.resultDate = String.valueOf(o.toString());
        } else {
            this.resultDate = null;
        }
    }

    /** PRO_GROUP_NO */
    private java.math.BigDecimal proGroupNo;

    /**
     * @return PRO_GROUP_NO
     */
    public java.math.BigDecimal getProGroupNo() {
        return this.proGroupNo;
    }

    /**
     * @param o PRO_GROUP_NO
     */
    public void setProGroupNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proGroupNo = new java.math.BigDecimal(o.toString());
        } else {
            this.proGroupNo = null;
        }
    }

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

    /** ROUTING */
    private String routing;

    /**
     * @return ROUTING
     */
    public String getRouting() {
        return this.routing;
    }

    /**
     * @param o ROUTING
     */
    public void setRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing = String.valueOf(o.toString());
        } else {
            this.routing = null;
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

    /** GOOD_COUNTS */
    private java.math.BigDecimal goodCounts;

    /**
     * @return GOOD_COUNTS
     */
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

    /** VOLUME_WEIGHT */
    private java.math.BigDecimal volumeWeight;

    /**
     * @return VOLUME_WEIGHT
     */
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

    /** END_MATERIAL_WEIGHT */
    private java.math.BigDecimal endMaterialWeight;

    /**
     * @return END_MATERIAL_WEIGHT
     */
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

    /** PRO_COUNTS */
    private java.math.BigDecimal proCounts;

    /**
     * @return PRO_COUNTS
     */
    public java.math.BigDecimal getProCounts() {
        return this.proCounts;
    }

    /**
     * @param o PRO_COUNTS
     */
    public void setProCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.proCounts = null;
        }
    }

    /** LAST_ROUTING */
    private java.math.BigDecimal lastRouting;

    /**
     * @return LAST_ROUTING
     */
    public java.math.BigDecimal getLastRouting() {
        return this.lastRouting;
    }

    /**
     * @param o LAST_ROUTING
     */
    public void setLastRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastRouting = new java.math.BigDecimal(o.toString());
        } else {
            this.lastRouting = null;
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
     * MFG_TOTAL_RESULT_Q照会
     *
     * @param param1 RESULT_DATE
     * @param param2 PRO_GROUP_NO
     * @param param3 HINBAN
     * @param param4 ROUTING
     * @param param5 WC_CODE
     * @param param6 OPE_DETAIL
     * @return MFG_TOTAL_RESULT_Q
     */
    public static MfgTotalResultQ get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5, final Object param6) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"RESULT_DATE\") = TRIM (:result_date)");
        whereList.add("\"PRO_GROUP_NO\" = :pro_group_no");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"ROUTING\") = TRIM (:routing)");
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");
        whereList.add("TRIM (\"OPE_DETAIL\") = TRIM (:ope_detail)");

        String sql = "SELECT * FROM MFG_TOTAL_RESULT_Q WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("result_date", param1);
        params.put("pro_group_no", param2);
        params.put("hinban", param3);
        params.put("routing", param4);
        params.put("wc_code", param5);
        params.put("ope_detail", param6);

        return Queries.get(sql, params, MfgTotalResultQ.class);
    }

    /**
     * MFG_TOTAL_RESULT_Q追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // OPE_DETAILの採番処理
        numbering();

        // MFG_TOTAL_RESULT_Yの登録
        if (this.mfgTotalResultY != null) {
            this.mfgTotalResultY.setResultDate(this.getResultDate());
            this.mfgTotalResultY.setProGroupNo(this.getProGroupNo());
            this.mfgTotalResultY.setHinban(this.getHinban());
            this.mfgTotalResultY.setRouting(this.getRouting());
            this.mfgTotalResultY.setWcCode(this.getWcCode());
            this.mfgTotalResultY.setOpeDetail(this.getOpeDetail());
            this.mfgTotalResultY.insert(now, id);
        }

        // MFG_TOTAL_RESULT_Qの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("result_date -- :result_date");
        nameList.add("pro_group_no -- :pro_group_no");
        nameList.add("hinban -- :hinban");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("hum_pre_time -- :hum_pre_time");
        nameList.add("hum_act_time -- :hum_act_time");
        nameList.add("mac_pre_time -- :mac_pre_time");
        nameList.add("mac_act_time -- :mac_act_time");
        nameList.add("good_counts -- :good_counts");
        nameList.add("reject_counts -- :reject_counts");
        nameList.add("unit_code -- :unit_code");
        nameList.add("act_lt -- :act_lt");
        nameList.add("act_wait_time -- :act_wait_time");
        nameList.add("exp_wait_time -- :exp_wait_time");
        nameList.add("exp_pre_time -- :exp_pre_time");
        nameList.add("exp_pro_time -- :exp_pro_time");
        nameList.add("exp_rest_time -- :exp_rest_time");
        nameList.add("exp_choko_time -- :exp_choko_time");
        nameList.add("exp_troub_time -- :exp_troub_time");
        nameList.add("exp_self_mod_time -- :exp_self_mod_time");
        nameList.add("exp_othr_mod_time -- :exp_othr_mod_time");
        nameList.add("exp_etc_time -- :exp_etc_time");
        nameList.add("volume_weight -- :volume_weight");
        nameList.add("unit_weight -- :unit_weight");
        nameList.add("end_material_weight -- :end_material_weight");
        nameList.add("pro_counts -- :pro_counts");
        nameList.add("last_routing -- :last_routing");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_TOTAL_RESULT_Q(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":result_date");
        valueList.add(":pro_group_no");
        valueList.add(":hinban");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":ope_detail");
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
        valueList.add(":volume_weight");
        valueList.add(":unit_weight");
        valueList.add(":end_material_weight");
        valueList.add(":pro_counts");
        valueList.add(":last_routing");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** OPE_DETAILの採番処理 */
    private void numbering() {

        if (this.opeDetail != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.OPE_DETAIL) IS NULL THEN 0 ELSE MAX(e.OPE_DETAIL) * 1 END + 1, 10, '0') AS OPE_DETAIL FROM MFG_TOTAL_RESULT_Q e WHERE e.OPE_DETAIL < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.RESULT_DATE = :result_date");
        whereList.add("e.PRO_GROUP_NO = :pro_group_no");
        whereList.add("e.HINBAN = :hinban");
        whereList.add("e.ROUTING = :routing");
        whereList.add("e.WC_CODE = :wc_code");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("resultDate", this.resultDate);
        params.put("proGroupNo", this.proGroupNo);
        params.put("hinban", this.hinban);
        params.put("routing", this.routing);
        params.put("wcCode", this.wcCode);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("OPE_DETAIL");

        this.setOpeDetail(o);
    }

    /**
     * MFG_TOTAL_RESULT_Q更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_TOTAL_RESULT_Yの登録
        if (this.mfgTotalResultY != null) {
            mfgTotalResultY.setResultDate(this.getResultDate());
            mfgTotalResultY.setProGroupNo(this.getProGroupNo());
            mfgTotalResultY.setHinban(this.getHinban());
            mfgTotalResultY.setRouting(this.getRouting());
            mfgTotalResultY.setWcCode(this.getWcCode());
            mfgTotalResultY.setOpeDetail(this.getOpeDetail());
            try {
                mfgTotalResultY.insert(now, id);
            } catch (Exception e) {
                mfgTotalResultY.update(now, id);
            }
        }

        // MFG_TOTAL_RESULT_Qの登録
        String sql = "UPDATE MFG_TOTAL_RESULT_Q\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("result_date = :result_date");
        setList.add("pro_group_no = :pro_group_no");
        setList.add("hinban = :hinban");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("ope_detail = :ope_detail");
        setList.add("hum_pre_time = :hum_pre_time");
        setList.add("hum_act_time = :hum_act_time");
        setList.add("mac_pre_time = :mac_pre_time");
        setList.add("mac_act_time = :mac_act_time");
        setList.add("good_counts = :good_counts");
        setList.add("reject_counts = :reject_counts");
        setList.add("unit_code = :unit_code");
        setList.add("act_lt = :act_lt");
        setList.add("act_wait_time = :act_wait_time");
        setList.add("exp_wait_time = :exp_wait_time");
        setList.add("exp_pre_time = :exp_pre_time");
        setList.add("exp_pro_time = :exp_pro_time");
        setList.add("exp_rest_time = :exp_rest_time");
        setList.add("exp_choko_time = :exp_choko_time");
        setList.add("exp_troub_time = :exp_troub_time");
        setList.add("exp_self_mod_time = :exp_self_mod_time");
        setList.add("exp_othr_mod_time = :exp_othr_mod_time");
        setList.add("exp_etc_time = :exp_etc_time");
        setList.add("volume_weight = :volume_weight");
        setList.add("unit_weight = :unit_weight");
        setList.add("end_material_weight = :end_material_weight");
        setList.add("pro_counts = :pro_counts");
        setList.add("last_routing = :last_routing");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_TOTAL_RESULT_Q削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_TOTAL_RESULT_Yの削除
        if (this.mfgTotalResultY != null) {
            this.mfgTotalResultY.delete();
        }

        // MFG_TOTAL_RESULT_Qの削除
        String sql = "DELETE FROM MFG_TOTAL_RESULT_Q WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (result_date) = TRIM (:result_date)");
        whereList.add("pro_group_no = :pro_group_no");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (routing) = TRIM (:routing)");
        whereList.add("TRIM (wc_code) = TRIM (:wc_code)");
        whereList.add("TRIM (ope_detail) = TRIM (:ope_detail)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("RESULT_DATE", this.resultDate);
        params.put("PRO_GROUP_NO", this.proGroupNo);
        params.put("HINBAN", this.hinban);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("HUM_PRE_TIME", this.humPreTime);
        params.put("HUM_ACT_TIME", this.humActTime);
        params.put("MAC_PRE_TIME", this.macPreTime);
        params.put("MAC_ACT_TIME", this.macActTime);
        params.put("GOOD_COUNTS", this.goodCounts);
        params.put("REJECT_COUNTS", this.rejectCounts);
        params.put("UNIT_CODE", this.unitCode);
        params.put("ACT_LT", this.actLt);
        params.put("ACT_WAIT_TIME", this.actWaitTime);
        params.put("EXP_WAIT_TIME", this.expWaitTime);
        params.put("EXP_PRE_TIME", this.expPreTime);
        params.put("EXP_PRO_TIME", this.expProTime);
        params.put("EXP_REST_TIME", this.expRestTime);
        params.put("EXP_CHOKO_TIME", this.expChokoTime);
        params.put("EXP_TROUB_TIME", this.expTroubTime);
        params.put("EXP_SELF_MOD_TIME", this.expSelfModTime);
        params.put("EXP_OTHR_MOD_TIME", this.expOthrModTime);
        params.put("EXP_ETC_TIME", this.expEtcTime);
        params.put("VOLUME_WEIGHT", this.volumeWeight);
        params.put("UNIT_WEIGHT", this.unitWeight);
        params.put("END_MATERIAL_WEIGHT", this.endMaterialWeight);
        params.put("PRO_COUNTS", this.proCounts);
        params.put("LAST_ROUTING", this.lastRouting);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_TOTAL_RESULT_Y
     */
    private MfgTotalResultY mfgTotalResultY;

    /**
     * @return MFG_TOTAL_RESULT_Y
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgTotalResultY")
    public MfgTotalResultY getMfgTotalResultY() {
        return this.mfgTotalResultY;
    }

    /**
     * @param p MFG_TOTAL_RESULT_Y
     */
    public void setMfgTotalResultY(final MfgTotalResultY p) {
        this.mfgTotalResultY = p;
    }

    /**
     * @return MFG_TOTAL_RESULT_Y
     */
    public MfgTotalResultY referMfgTotalResultY() {
        if (this.mfgTotalResultY == null) {
            try {
                this.mfgTotalResultY = MfgTotalResultY.get(this.resultDate, this.proGroupNo, this.hinban, this.routing, this.wcCode, this.opeDetail);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mfgTotalResultY;
    }
}
