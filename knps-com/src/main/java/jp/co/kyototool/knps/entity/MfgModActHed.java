package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_MOD_ACT_HED
 *
 * @author emarfkrow
 */
public class MfgModActHed implements IEntity {

    /** MOD_ACT_NO */
    private String modActNo;

    /**
     * @return MOD_ACT_NO
     */
    public String getModActNo() {
        return this.modActNo;
    }

    /**
     * @param o MOD_ACT_NO
     */
    public void setModActNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.modActNo = String.valueOf(o.toString());
        } else {
            this.modActNo = null;
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

    /** MOD_KIND */
    private java.math.BigDecimal modKind;

    /**
     * @return MOD_KIND
     */
    public java.math.BigDecimal getModKind() {
        return this.modKind;
    }

    /**
     * @param o MOD_KIND
     */
    public void setModKind(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.modKind = new java.math.BigDecimal(o.toString());
        } else {
            this.modKind = null;
        }
    }

    /** AMOUNT_TIME */
    private java.math.BigDecimal amountTime;

    /**
     * @return AMOUNT_TIME
     */
    public java.math.BigDecimal getAmountTime() {
        return this.amountTime;
    }

    /**
     * @param o AMOUNT_TIME
     */
    public void setAmountTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.amountTime = new java.math.BigDecimal(o.toString());
        } else {
            this.amountTime = null;
        }
    }

    /** ACT_MOD_TIME */
    private java.math.BigDecimal actModTime;

    /**
     * @return ACT_MOD_TIME
     */
    public java.math.BigDecimal getActModTime() {
        return this.actModTime;
    }

    /**
     * @param o ACT_MOD_TIME
     */
    public void setActModTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actModTime = new java.math.BigDecimal(o.toString());
        } else {
            this.actModTime = null;
        }
    }

    /** EXP_TIME */
    private java.math.BigDecimal expTime;

    /**
     * @return EXP_TIME
     */
    public java.math.BigDecimal getExpTime() {
        return this.expTime;
    }

    /**
     * @param o EXP_TIME
     */
    public void setExpTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expTime = new java.math.BigDecimal(o.toString());
        } else {
            this.expTime = null;
        }
    }

    /** MOD_COUNTS */
    private java.math.BigDecimal modCounts;

    /**
     * @return MOD_COUNTS
     */
    public java.math.BigDecimal getModCounts() {
        return this.modCounts;
    }

    /**
     * @param o MOD_COUNTS
     */
    public void setModCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.modCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.modCounts = null;
        }
    }

    /** ACT_MOD_COUNTS */
    private java.math.BigDecimal actModCounts;

    /**
     * @return ACT_MOD_COUNTS
     */
    public java.math.BigDecimal getActModCounts() {
        return this.actModCounts;
    }

    /**
     * @param o ACT_MOD_COUNTS
     */
    public void setActModCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actModCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.actModCounts = null;
        }
    }

    /** MEMO */
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @param o MEMO
     */
    public void setMemo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.memo = String.valueOf(o.toString());
        } else {
            this.memo = null;
        }
    }

    /** MOD_STATUS */
    private java.math.BigDecimal modStatus;

    /**
     * @return MOD_STATUS
     */
    public java.math.BigDecimal getModStatus() {
        return this.modStatus;
    }

    /**
     * @param o MOD_STATUS
     */
    public void setModStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.modStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.modStatus = null;
        }
    }

    /** EXP_FLAG */
    private java.math.BigDecimal expFlag;

    /**
     * @return EXP_FLAG
     */
    public java.math.BigDecimal getExpFlag() {
        return this.expFlag;
    }

    /**
     * @param o EXP_FLAG
     */
    public void setExpFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.expFlag = null;
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
     * MFG_MOD_ACT_HED照会
     *
     * @param param1 MOD_ACT_NO
     * @return MFG_MOD_ACT_HED
     */
    public static MfgModActHed get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MOD_ACT_NO\") = TRIM (:mod_act_no)");

        String sql = "SELECT * FROM MFG_MOD_ACT_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mod_act_no", param1);

        return Queries.get(sql, params, MfgModActHed.class);
    }

    /**
     * MFG_MOD_ACT_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MOD_ACT_NOの採番処理
        numbering();

        // MFG_MOD_ACT_DETの登録
        if (this.mfgModActDets != null) {
            for (MfgModActDet mfgModActDet : this.mfgModActDets) {
                mfgModActDet.setModActNo(this.getModActNo());
                mfgModActDet.insert(now, id);
            }
        }

        // MFG_MOD_ACT_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"MOD_ACT_NO\" -- :mod_act_no");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"MOD_KIND\" -- :mod_kind");
        nameList.add("\"AMOUNT_TIME\" -- :amount_time");
        nameList.add("\"ACT_MOD_TIME\" -- :act_mod_time");
        nameList.add("\"EXP_TIME\" -- :exp_time");
        nameList.add("\"MOD_COUNTS\" -- :mod_counts");
        nameList.add("\"ACT_MOD_COUNTS\" -- :act_mod_counts");
        nameList.add("\"MEMO\" -- :memo");
        nameList.add("\"MOD_STATUS\" -- :mod_status");
        nameList.add("\"EXP_FLAG\" -- :exp_flag");
        nameList.add("\"BEG_DATE\" -- :beg_date");
        nameList.add("\"END_DATE\" -- :end_date");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_MOD_ACT_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":mod_act_no");
        valueList.add(":wc_code");
        valueList.add(":mod_kind");
        valueList.add(":amount_time");
        valueList.add(":act_mod_time");
        valueList.add(":exp_time");
        valueList.add(":mod_counts");
        valueList.add(":act_mod_counts");
        valueList.add(":memo");
        valueList.add(":mod_status");
        valueList.add(":exp_flag");
        valueList.add("TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** MOD_ACT_NOの採番処理 */
    private void numbering() {

        if (this.modActNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"MOD_ACT_NO\") IS NULL THEN 0 ELSE MAX(e.\"MOD_ACT_NO\") * 1 END + 1, 12, '0') AS \"MOD_ACT_NO\" FROM MFG_MOD_ACT_HED e WHERE e.\"MOD_ACT_NO\" < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MOD_ACT_NO");

        this.setModActNo(o);
    }

    /**
     * MFG_MOD_ACT_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_MOD_ACT_DETの登録
        if (this.mfgModActDets != null) {
            for (MfgModActDet mfgModActDet : this.mfgModActDets) {
                mfgModActDet.setModActNo(this.modActNo);
                try {
                    mfgModActDet.insert(now, id);
                } catch (Exception e) {
                    mfgModActDet.update(now, id);
                }
            }
            this.mfgModActDets = null;
            this.referMfgModActDets();
            if (this.mfgModActDets != null) {
                for (MfgModActDet mfgModActDet : this.mfgModActDets) {
                    if (!mfgModActDet.getTimeStampChange().equals(now)) {
                        mfgModActDet.delete();
                    }
                }
            }
        }

        // MFG_MOD_ACT_HEDの登録
        String sql = "UPDATE MFG_MOD_ACT_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"MOD_ACT_NO\" = :mod_act_no");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"MOD_KIND\" = :mod_kind");
        setList.add("\"AMOUNT_TIME\" = :amount_time");
        setList.add("\"ACT_MOD_TIME\" = :act_mod_time");
        setList.add("\"EXP_TIME\" = :exp_time");
        setList.add("\"MOD_COUNTS\" = :mod_counts");
        setList.add("\"ACT_MOD_COUNTS\" = :act_mod_counts");
        setList.add("\"MEMO\" = :memo");
        setList.add("\"MOD_STATUS\" = :mod_status");
        setList.add("\"EXP_FLAG\" = :exp_flag");
        setList.add("\"BEG_DATE\" = TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"END_DATE\" = TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_MOD_ACT_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_MOD_ACT_DETの削除
        if (this.mfgModActDets != null) {
            for (MfgModActDet mfgModActDet : this.mfgModActDets) {
                mfgModActDet.delete();
            }
        }

        // MFG_MOD_ACT_HEDの削除
        String sql = "DELETE FROM MFG_MOD_ACT_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MOD_ACT_NO\") = TRIM (:mod_act_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mod_act_no", this.modActNo);
        params.put("wc_code", this.wcCode);
        params.put("mod_kind", this.modKind);
        params.put("amount_time", this.amountTime);
        params.put("act_mod_time", this.actModTime);
        params.put("exp_time", this.expTime);
        params.put("mod_counts", this.modCounts);
        params.put("act_mod_counts", this.actModCounts);
        params.put("memo", this.memo);
        params.put("mod_status", this.modStatus);
        params.put("exp_flag", this.expFlag);
        params.put("beg_date", this.begDate);
        params.put("end_date", this.endDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_MOD_ACT_DETのリスト
     */
    private List<MfgModActDet> mfgModActDets;

    /**
     * @return MFG_MOD_ACT_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgModActDets")
    public List<MfgModActDet> getMfgModActDets() {
        return this.mfgModActDets;
    }

    /**
     * @param list MFG_MOD_ACT_DETのリスト
     */
    public void setMfgModActDets(final List<MfgModActDet> list) {
        this.mfgModActDets = list;
    }

    /**
     * @param mfgModActDet
     */
    public void addMfgModActDets(final MfgModActDet mfgModActDet) {
        if (this.mfgModActDets == null) {
            this.mfgModActDets = new ArrayList<MfgModActDet>();
        }
        this.mfgModActDets.add(mfgModActDet);
    }

    /**
     * @return MFG_MOD_ACT_DETのリスト
     */
    public List<MfgModActDet> referMfgModActDets() {
        if (this.mfgModActDets == null) {
            this.mfgModActDets = MfgModActHed.referMfgModActDets(this.modActNo);
        }
        return this.mfgModActDets;
    }

    /**
     * @param param1 modActNo
     * @return List<MfgModActDet>
     */
    public static List<MfgModActDet> referMfgModActDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("mod_act_no = :mod_act_no");

        String sql = "SELECT * FROM MFG_MOD_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mod_act_no", param1);

        return Queries.select(sql, params, MfgModActDet.class);
    }
}
